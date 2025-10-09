package com.jdbc;

import java.util.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ex_2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Java_Course","root","1234");
			System.out.println("Connected Successfully");
			
//			System.out.println("Enter the Food ");
//			String Foodname = s.nextLine(); // getting input from user
//			
//			System.out.println("Enter the Price ");
//			Double Price = s.nextDouble();
			
			System.out.println("Enter ID to delete ");
			int Id = s.nextInt();
			
			
			PreparedStatement ps = con.prepareStatement("delete from food where id = ?");
//			ps.setString(1, Foodname);
//			ps.setDouble(2, Price); // positions and values 
			ps.setInt(1,Id);
			
			ps.executeUpdate();
//			ps.executeQuery();
			
			System.out.println("Data inserted successfully");
			
			ps.close();
			con.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		s.close();
		
	}

}
