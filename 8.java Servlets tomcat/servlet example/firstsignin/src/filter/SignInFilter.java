package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import db.Database;

public class SignInFilter implements Filter {

	private FilterConfig filterConfig;

	public FilterConfig getFilterConfig() {
		return filterConfig;
	}

	public void setFilterConfig(FilterConfig filterConfig) {
		this.filterConfig = filterConfig;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println("filter called");
		System.out.println(arg0.getParameter("username"));
		String userName = arg0.getParameter("username");
		String password = arg0.getParameter("password");

		if (userName == null) {
			System.out.println("username is null");
			arg1.setContentType("text/html");
			arg1.getWriter().print("<html><body>");
			arg1.getWriter().print("<h1>  " + " username is not provided" + "</h1>");
			arg1.getWriter().print("</body></html>");
		} else {

			if (userName.length() <= 7 && password.length() <= 7) {

				Database db = new Database();
				try {
					boolean validated = db.isUserAuthenticated(getFilterConfig().getServletContext(), userName,
							password);
					if (validated) {
						System.out.println("validated");
						arg2.doFilter(arg0, arg1);
						
					} else {
						arg1.setContentType("text/html");
						arg1.getWriter().print("<html><body>");
						arg1.getWriter().print("<h1>  " + " username and password doesnt found" + "</h1>");
						arg1.getWriter().print("</body></html>");

					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} else {
				arg1.setContentType("text/html");
				arg1.getWriter().print("<html><body>");
				arg1.getWriter().print("<h1>  " + " username and password length should be less then 7" + "</h1>");
				arg1.getWriter().print("</body></html>");

			}
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		setFilterConfig(arg0);
	}

}
