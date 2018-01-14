package db;

import java.sql.*;

public class DbConnectionManager {

	private String driver;
	private String connection;
	private String username;
	private String password;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getConnection() {
		return connection;
	}

	public void setConnection(String connection) {
		this.connection = connection;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Connection getDbConnection() throws Exception {
		Connection con = null;
		Class.forName(driver);
		con = DriverManager.getConnection(connection, username, password);
		System.out.print("connection created");
		return con;
	}

}
