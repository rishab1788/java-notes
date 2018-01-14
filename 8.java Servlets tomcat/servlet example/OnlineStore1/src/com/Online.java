package com;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Online extends HttpServlet {

	
//	private static final long serialVersionUID = 4846066462759900943L;

		
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("initalization");
	}
							
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		ServletConfig sc  = getServletConfig();
		
		ServletContext context = getServletContext();

		System.out.println(context.getAttribute("username"));
req.getRequestDispatcher("/FourthOnlinecallme").include(req, resp);;
		
		resp.setContentType("text/html");				
		resp.getWriter().print("<html><body>");
		resp.getWriter().print("<h1>  "+ sc.getInitParameter("jdbcdriver")+ "</h1>");
		resp.getWriter().print("</body></html>");	
		
		
	}

}
