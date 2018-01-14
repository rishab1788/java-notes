package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.Database;
  
 
public class Login extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
       
   

  
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username=req.getParameter("username");	 
		String password=req.getParameter("password");

		System.out.println("vdfvdfvfd");
		
//		  Database database=new Database();

		  
	//	  database.getDb(username,password);
		
		
		
		
		resp.setContentType("text/html");
 
		resp.getWriter().print("<html><body>");
	 	resp.getWriter().print("<h5> WELCOME " + username +"  <br>    "+ password+ "</h5>");
		
		// resp.getWriter().print("<h1> "+ sc.getInitParameter("oracle")+
		// "</h1>");
		resp.getWriter().print("</body></html>");		
}

	
	
}
