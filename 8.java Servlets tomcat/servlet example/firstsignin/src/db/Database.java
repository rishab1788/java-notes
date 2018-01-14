package db;

import java.sql.*;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

public class Database {

	public void insertData(String username, String password, ServletContext servletContext) {

		try {
			/*
			 * Class.forName("com.mysql.jdbc.Driver"); Connection Con =
			 * DriverManager.getConnection(
			 * "jdbc:mysql://localhost:3306/college", "root", "root");
			 */

			System.out.println(servletContext.getServletContextName());

			Connection con = (Connection) servletContext.getAttribute("dbconnection");

			Statement Stmt = con.createStatement();

			String sql = "INSERT INTO persone(username,password) VALUES ('" + username + "'," + "'" + password + "');";

			System.out.println(sql);

			Stmt.executeUpdate(sql);

			ResultSet ri = Stmt.executeQuery("select * from persone");
			while (ri.next()) {
				System.out.println(ri.getString(1) + " " + ri.getString(2));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void showData(ServletContext servletContext, HttpServletResponse resp) throws Exception {

		try {

			Connection con = (Connection) servletContext.getAttribute("dbconnection");

			Statement Stmt = con.createStatement();

			ResultSet ri = Stmt.executeQuery("select * from persone");
			resp.getWriter().print("<h3> WELCOME " + "ALL USER" + "</h3>");

			while (ri.next()) {
				System.out.println(ri.getString(1) + " " + ri.getString(2));
				resp.getWriter().print("<h5> WELCOME " + ri.getString(1) + "  <br>    " + ri.getString(2) + "</h5>");

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean isUserAuthenticated(ServletContext servletContext, String userName, String password)
			throws Exception {

		try {

			Connection con = (Connection) servletContext.getAttribute("dbconnection");

			Statement Stmt = con.createStatement();

			String query = "select * from persone where username='rajkumar' and password='gupta';";
			ResultSet ri = Stmt.executeQuery(query);

			if (ri.first()) {
				return true;
			}
			return false;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
