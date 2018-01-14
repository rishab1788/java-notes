package filter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

 
public class SeventhOnline extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// to logout call this
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("doGet called");

		HttpSession session = req.getSession(false);

		if (session == null) {

			resp.setContentType("text/html");
			resp.getWriter().print("<html><body>");
			resp.getWriter().print("<h1>  user already logged out" + "</h1>");
			resp.getWriter().print("</body></html>");

		} else {
			String n = (String) session.getAttribute("username");
			session.invalidate();
			

			resp.setContentType("text/html");
			resp.getWriter().print("<html><body>");
			resp.getWriter().print("<h1>  session is invalidated for : " + n + "</h1>");
			resp.getWriter().print("</body></html>");
		
		}

	}
	
	// to login call this
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
System.out.println("doPost called");
		HttpSession session = req.getSession();
	
		session.setAttribute("username", req.getParameter("username"));
		resp.setContentType("text/html");
		resp.getWriter().print("<html><body>");
		resp.getWriter().print("<h1>  " + "Session is set" + "</h1>");
		resp.getWriter().print("</body></html>");

	}

}
