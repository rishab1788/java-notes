package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import db.DbConnectionManager;

public class AppContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		// TODO Auto-generated method stub

		ServletContext context = servletContextEvent.getServletContext();
		DbConnectionManager dbm = new DbConnectionManager();
		
		
		System.out.println("set connection");
		dbm.setConnection(context.getInitParameter("connection"));
		System.out.println("set driver");
		dbm.setDriver(context.getInitParameter("driver"));
		System.out.println("set adminname");
		dbm.setUsername(context.getInitParameter("adminname"));
		System.out.println("set adminpassword");
		dbm.setPassword(context.getInitParameter("adminpassword"));

		try {
			context.setAttribute("dbconnection", dbm.getDbConnection());
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {

	}

}
