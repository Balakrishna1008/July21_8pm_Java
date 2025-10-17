package com.studentcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static final String url = "jdbc:mysql://localhost:3306/studdb";
	private static final String user = "root";
	private static final String password = "1234";
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		
		}catch (Exception e){
			System.out.println(e);
		}
	}
	
	// instead of writing the db url several times, this method can be used 
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,user,password);
		
	}
}
