package openidauth;

import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.json.JSONObject;
import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.google.gson.Gson;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import kong.unirest.UnirestException;

public class OIDAuthorization {
	Logger logger = Logger.getLogger(this.getClass());

	/**
	 * 
	 * Method to authenticate user, like session is valid or not, user is login
	 * first time or second time.
	 * 
	 * @param code
	 *            = Code that is getting from openId connect.
	 * @param request
	 *            = JSP request object.
	 * @param response
	 *            = JSP request object.
	 * @param redirectURLWithOtherParameter
	 *            = OpenId id connect URL.
	 * 
	 * @param retUrl
	 *            = Return URL or redirect url. ex: gcp/admin/adminlogin.jsp.
	 * @return = return the message or user credential
	 */
	public String authenticate(String code, HttpServletRequest request, HttpServletResponse response,
			String redirectUrlWithParameter, String retUrl, String serverName, String cspUrl, String csp_client_id,
			String csp_client_secret_key, String csp_auth_cookie_name, String csp_user_cookie_name) {

		/* Checking if cookie exist or not */
		if (CookiesHandler.loadToken(csp_auth_cookie_name, request) != null) {
			return "success";
		} else {
			if (code == null || code.length() == 0) {
				try {
					response.sendRedirect(redirectUrlWithParameter);
				} catch (IOException e) {
					e.printStackTrace();
				}
				return "Redirected to Global logon for Auth code";
			}
			return getAccessToken(code, request, response, redirectUrlWithParameter, retUrl, serverName, cspUrl, csp_client_id,
					csp_client_secret_key, csp_auth_cookie_name, csp_user_cookie_name);
		}
	}

	public AuthObj getAuthObj(String code, String redirectUrlWithParameter, String retUrl, String providerURL, String cspUrl,
			String csp_client_id, String csp_client_secret_key, String csp_auth_cookie_name, String csp_user_cookie_name) {

		logger.info("Inside getAuthObj() method of OIDAuthorization class");

		try {
			String body = "grant_type=authorization_code&client_id=" + csp_client_id + "&client_secret=" + csp_client_secret_key
					+ "&code=" + code + "&redirect_uri=" + retUrl + "&scope=openid%20given_name%20family_name";

			HttpResponse<String> response = Unirest.post(providerURL + "/mga/sps/oauth/oauth20/token")
					.header("content-type", "application/x-www-form-urlencoded").body(body).asString();

			Gson gson = new Gson();
			AuthObj authObj = gson.fromJson(response.getBody(), AuthObj.class);
			logger.info("Exiting getAuthObj() method of OIDAuthorization class");
			return authObj;

		} catch (UnirestException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public String getAccessToken(String code, HttpServletRequest request, HttpServletResponse response,
			String redirectUrlWithParameter, String retUrl, String serverName, String cspUrl, String csp_client_id,
			String csp_client_secret_key, String csp_auth_cookie_name, String csp_user_cookie_name) {

		String providerURL = cspUrl;
		Logger logger = Logger.getLogger(this.getClass());
		logger.info("Inside getAccessToken() method of OIDAuthorization class");
		String authResponse = "";
		try {
			AuthObj authObj = getAuthObj(code, redirectUrlWithParameter, retUrl, providerURL, cspUrl, csp_client_id,
					csp_client_secret_key, csp_auth_cookie_name, csp_user_cookie_name);
			if (authObj.getError() != null) {
				logger.error("failed authorizing Reason: " + authObj.getError_description());
				return getAuthenticationCode(response, redirectUrlWithParameter);
			}

			authResponse = AuthenticatorJWTToken.validateToken(authObj.getId_token(), providerURL, csp_client_id);

			if (!authResponse.equals("success")) {
				logger.error("failed authorizing Reason: " + authResponse);
				return getAuthenticationCode(response, redirectUrlWithParameter);
			} else {
				CookiesHandler.saveToken(csp_auth_cookie_name, authObj.getAccess_token(), request, response);
				DecodedJWT jwt = JWT.decode(authObj.getId_token());
				CookiesHandler.saveToken(csp_user_cookie_name, jwt.getSubject(), request, response);

				logger.info(
						"Token validation and cookie generation completed. Exiting getAccessToken() method of OIDAuthorization class");
				String accessTokenData1 = authObj.getAccess_token();
				Map<String, String> headers = new HashMap<>();
				headers.put("Accept", "application/x-www-form-urlencoded");
				headers.put("Authorization", "Bearer " + accessTokenData1);

				/* Getting User_id, User_name, User_family name. */
				String payloadData = jwt.getPayload();
				String decodePayload = new String(Base64.getUrlDecoder().decode(payloadData));
				JSONObject jsonObject = new JSONObject(decodePayload);
				String username = "";
				String userfamily_name = "";
				if (decodePayload.contains("given_name") && decodePayload.contains("family_name")) {
					if (jsonObject.getString("given_name") != null) {
						username = jsonObject.getString("given_name");
					}
					if (jsonObject.getString("family_name") != null) {
						userfamily_name = jsonObject.getString("family_name");
					}
				}
				return jwt.getSubject() + "userNameGivenName" + username + " " + userfamily_name;
			}
		} catch (Exception e) {
			logger.error(" Authorization failed ");
			e.printStackTrace();
			return getAuthenticationCode(response, redirectUrlWithParameter);
		}
	}

	private String getAuthenticationCode(HttpServletResponse response, String redirectUrlWithParameter) {
		try {
			response.sendRedirect(redirectUrlWithParameter);
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		return "Redirected to Global logon for Auth code";
	}

	public String getGlobalLogonUrl(String encReturnURL, String cspUrl, String csp_client_id) {
		String redirectURL = encReturnURL;
		String clientID = csp_client_id;
		String providerURL = cspUrl;

		String state = UUID.randomUUID().toString();

		String authCodeURL = new StringBuilder().append(providerURL).append("/mga/sps/oauth/oauth20/authorize?client_id=")
				.append(csp_client_id).append("&scope=openid&response_type=code&state=").append("").append("&redirect_uri=")
				.append(redirectURL).toString();

		authCodeURL = new StringBuilder().append(providerURL).append("/mga/sps/oauth/oauth20/authorize?client_id=").append(clientID)
				.append("&scope=openid%20given_name%20family_name&response_type=code&state=").append(state).append("&redirect_uri=")
				.append(redirectURL).toString();
		return authCodeURL;

	}

}
