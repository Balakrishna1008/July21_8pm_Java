package com.studentcrud;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;

//import org.apache.catalina.ssi.SSICommand;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addStudent")
public class AddStudentServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String course = req.getParameter("course");
		
		try {
			Connection con = DBUtil.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into student (name, email, course) values (?, ?, ?)");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, course);
			
			int i = ps.executeUpdate();
			
			if(i > 0) {
				out.println("<p> Data Inserted Successfully </p>");
			}else {
				out.println("<p> Data not Added </p>");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
//		Student s = new Student();
//		s.setName(name);
//		s.setEmail(email);
//		s.setCourse(course);
//		
//		out.println("<h3> Data Added Successfully :) </h3>");
//		out.println("<a href = 'listStudents'> View the Students </a>");
//		out.close();
		
		
	}

}