package openidauth;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookiesHandler {
	public static void saveToken(String tokenName, String tokenValue, HttpServletRequest request, HttpServletResponse response) {
		Cookie cookie = new Cookie(tokenName, tokenValue);
		cookie.setSecure(request.isSecure());
		cookie.setPath("/");
		if (tokenValue == null || tokenValue == "") {
			cookie.setMaxAge(0);
		} else {
			cookie.setMaxAge(-1);
		}
		cookie.setHttpOnly(true);
		response.addCookie(cookie);
	}

	public static String loadToken(String tokenName, HttpServletRequest request) {
		for (Cookie c : request.getCookies()) {
			if (c.getName().equals(tokenName)) {
				return c.getValue();
			}
		}
		return null;
	}
}
