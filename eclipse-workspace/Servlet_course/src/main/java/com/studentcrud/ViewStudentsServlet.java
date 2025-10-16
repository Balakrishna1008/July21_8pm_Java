package com.studentcrud;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;

//import org.apache.catalina.ssi.SSICommand;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/viewStudent")
public class ViewStudentsServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String course = req.getParameter("course");
		
		try {
			
			Connection con = DBUtil.getConnection();
//			String query = "select * from student";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery( "select * from student");
			
			out.println("<h2> Student List </h2>");
			out.println("<table border = \"1\"> <tr>" 
			+ "<th> ID </th> " 
			+ "<th> Name </th>" 
			+ " <th> Email </th>" 
			+ "<th> Course </th></tr>");
			
			while(rs.next()) {
				out.println("<tr> <td>" + rs.getInt("id") + "</td>" 
			    + "<td>" + rs.getString("name") + "</td>"
			    		+ "<td>" + rs.getString("email") + "</td>"
			    		+ "<td>" + rs.getString("course") + "</td>");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}