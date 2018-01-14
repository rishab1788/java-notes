package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterSeventhOnline implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println("filter called");
		System.out.println(arg0.getParameter("username"));
		String s = arg0.getParameter("username");
		if (s == null) {
			System.out.println("username is null");
			arg1.setContentType("text/html");
			arg1.getWriter().print("<html><body>");
			arg1.getWriter().print("<h1>  " + "Invalid username" + "</h1>");
			arg1.getWriter().print("</body></html>");
		} else {

			if (s.length() <= 5) {

				arg2.doFilter(arg0, arg1);
			} else {
				arg1.setContentType("text/html");
				arg1.getWriter().print("<html><body>");
				arg1.getWriter().print("<h1>  " + "Invalid username" + "</h1>");
				arg1.getWriter().print("</body></html>");

			}
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
