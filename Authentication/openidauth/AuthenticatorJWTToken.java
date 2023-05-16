package openidauth;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.interfaces.RSAPublicKey;
import org.apache.log4j.Logger;
import com.auth0.jwk.GuavaCachedJwkProvider;
import com.auth0.jwk.Jwk;
import com.auth0.jwk.JwkException;
import com.auth0.jwk.JwkProvider;
import com.auth0.jwk.UrlJwkProvider;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.InvalidClaimException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;

public class AuthenticatorJWTToken {

	static Logger log = Logger.getLogger(AuthenticatorJWTToken.class);

	public static String validateToken(String token, String providerURL, String csp_client_id) {

		log.info("Inside validateToken() method, OpenID JWT Token Validation starts");

		if (token == null) {
			printErrorMessage("Token is not available. Session is invalid");
			return "Token is not available. Session is invalid";
		}

		String providerUrl = providerURL + "/mga/sps/oauth/oauth20/jwks/ATTOIDC";
		String authResult = "failure";

		try {

			DecodedJWT jwt = JWT.decode(token);
			JwkProvider providerHttps = null;
			Jwk jwk = null;
			Algorithm algorithm = null;
			providerHttps = new UrlJwkProvider(new URL(providerUrl));

			// caching for the public key, default 5 keys for 10 minutes
			JwkProvider provider = new GuavaCachedJwkProvider(providerHttps);
			jwk = provider.get(jwt.getKeyId());
			algorithm = Algorithm.RSA256((RSAPublicKey) jwk.getPublicKey(), null);
			algorithm.verify(jwt); // if the token signature is invalid, the
									// method will throw
									// SignatureVerificationException

			try {
				JWTVerifier verifier = JWT.require(algorithm).withAudience(csp_client_id).build(); // Reusable
				DecodedJWT jwt2 = verifier.verify(token);
				authResult = "success";
			} catch (TokenExpiredException e) {
				authResult = "Token is expired";
				printErrorMessage(e.getMessage());
			} catch (InvalidClaimException e) {
				authResult = "Invalid Claim for Audience";
				printErrorMessage(e.getMessage());
			}

		} catch (MalformedURLException e) {
			authResult = "System error occurred during authentication";
			printErrorMessage(e.getMessage());
		} catch (JwkException e) {
			authResult = "JWK system error occurred during authentication";
			printErrorMessage(e.getMessage());
		} catch (SignatureVerificationException e) {
			authResult = "Signature verification failed";
			printErrorMessage(e.getMessage());
		} catch (Exception e) {
			authResult = "System error occurred during authentication";
			printErrorMessage(e.getMessage());
		}

		log.info("Finished token validation, Exiting from validateToken() method");
		return authResult;
	}

	private static void printErrorMessage(String errorMessage) {
		log.error("Unauthorized error occurred: " + errorMessage);
	}
}
