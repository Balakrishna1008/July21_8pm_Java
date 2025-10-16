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

@WebServlet("/deleteStudent")
public class DeleteStudentServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		try {
			
			Connection con = DBUtil.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from student where id = ?");
			
			ps.setInt(1, id);
			
			int i = ps.executeUpdate();
			
			if(i > 0) {
				out.println("<p> Data Deleted Successfully </p>");
			}else {
				out.println("<p> Data not Deleted </p>");
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