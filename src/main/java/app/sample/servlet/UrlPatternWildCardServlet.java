package app.sample.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * <url-pattern> にはワイルドカード * を使用することができる。
 * *.sampleより*が優先される
 */

public class UrlPatternWildCardServlet extends HttpServlet {

	private static final long serialVersionUID = -2979606908346006347L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("UrlPatternWildCardServlet.doGet()");
	}
}
