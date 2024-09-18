package com.iiht.ioc.jdbcannotconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnnectionUtil {
	
	private String jdbcUrl;
	private String userName;
	private String password;

	


	public JDBCConnnectionUtil(String jdbcUrl, String userName, String password) {
		super();
		this.jdbcUrl = jdbcUrl;
		this.userName = userName;
		this.password = password;
	}



	public String getJdbcUrl() {
		return jdbcUrl;
	}



	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
	public Connection getConnection() throws SQLException{
		
		
		
		
		Connection con = DriverManager.getConnection(jdbcUrl, userName, password);
		return con;
		
	}



	@Override
	public String toString() {
		return "JDBCConnnectionUtil [jdbcUrl=" + jdbcUrl + ", userName=" + userName + ", Password=" + password + "]";
	}
	
	
	
}
