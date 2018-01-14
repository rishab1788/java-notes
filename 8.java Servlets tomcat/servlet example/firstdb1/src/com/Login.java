package com;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.Database;

public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username = req.getParameter("username");
		String password = req.getParameter("password");

		Database database = new Database();

		

		
		database.insertData(username, password, getServletContext());
		try {
			database.showData(getServletContext(), resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		resp.setContentType("text/html");

		resp.getWriter().print("<html><body>");

		/*
		 * try { Class.forName("com.mysql.jdbc.Driver"); Connection Con =
		 * DriverManager.getConnection( "jdbc:mysql://localhost:3306/college",
		 * "root", "root");
		 * 
		 * 
		 * 
		 * Statement Stmt = Con.createStatement();
		 * 
		 * 
		 * ResultSet ri = Stmt.executeQuery("select * from persone");
		 * resp.getWriter().print("<h3> WELCOME " +"ALL USER"+ "</h3>");
		 * 
		 * while (ri.next()) { System.out.println(ri.getString(1) + " " +
		 * ri.getString(2)); resp.getWriter().print("<h5> WELCOME " +
		 * ri.getString(1) +"  <br>    "+ ri.getString(2)+ "</h5>");
		 * 
		 * }
		 * 
		 * } catch (ClassNotFoundException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); } catch (SQLException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		resp.getWriter().print("<h5> WELCOME " + username + "  <br>    " + password + "</h5>");

		// resp.getWriter().print("<h1> "+ sc.getInitParameter("oracle")+
		// "</h1>");
		resp.getWriter().print("</body></html>");
	}

}
