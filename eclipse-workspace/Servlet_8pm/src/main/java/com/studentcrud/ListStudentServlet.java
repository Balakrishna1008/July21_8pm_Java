package com.studentcrud;

import java.io.IOException;
import java.io.PrintWriter;



//import org.apache.catalina.ssi.SSICommand;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListStudentServlet extends HttpServlet{
	
	protected void post(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
//		List<Student> list = 

	}

}
