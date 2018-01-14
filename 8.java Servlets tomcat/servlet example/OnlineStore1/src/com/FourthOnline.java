package com;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FourthOnline extends HttpServlet {

	// private static final long serialVersionUID = 4846066462759900943L;

	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("initalization");
	}

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

 
		 Cookie ck=new Cookie("username","");  
	        ck.setMaxAge(0);  
	        resp.addCookie(ck);  
	          
	
		resp.setContentType("text/html");
		resp.getWriter().print("<html><body>");
		resp.getWriter().print("<h1>  " +"cookie deleted" + "</h1>");
		
		// resp.getWriter().print("<h1> "+ sc.getInitParameter("oracle")+
		// "</h1>");
		resp.getWriter().print("</body></html>");

		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie ck=new Cookie("username",req.getParameter("username") );
 	resp.addCookie(ck);
	resp.setContentType("text/html");
	resp.getWriter().print("<html><body>");
	resp.getWriter().print("<h1>  " +"Cookie is set" + "</h1>");
	
	// resp.getWriter().print("<h1> "+ sc.getInitParameter("oracle")+
	// "</h1>");
	resp.getWriter().print("</body></html>");
		
	
	}
	

}
