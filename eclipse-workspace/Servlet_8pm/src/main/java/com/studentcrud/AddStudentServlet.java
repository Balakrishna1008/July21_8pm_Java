package com.studentcrud;

import java.io.IOException;
import java.io.PrintWriter;

//import org.apache.catalina.ssi.SSICommand;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddStudentServlet extends HttpServlet{
	
	protected void post(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String course = req.getParameter("course");
		
		Student s = new Student();
		s.setName(name);
		s.setEmail(email);
		s.setCourse(course);
		
		out.println("<h3> Data Added Successfully :) </h3>");
		out.println("<a href = 'listStudents'> View the Students </a>");
		out.close();
	}

}
