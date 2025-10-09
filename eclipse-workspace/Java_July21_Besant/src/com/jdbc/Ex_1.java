package com.jdbc;

import java.sql.*;

public class Ex_1 {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Java_Course","root","1234");
			System.out.println("Connected Successfully");
			
			String query = "select * from sample";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from sample");
			
			System.out.println("Name | Email");
			while(rs.next()) {
				System.out.println(rs.getString("nName") + " | " + rs.getString("email")); // query to fetch the data
			}
			
			rs.close();
			st.close();
			con.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
