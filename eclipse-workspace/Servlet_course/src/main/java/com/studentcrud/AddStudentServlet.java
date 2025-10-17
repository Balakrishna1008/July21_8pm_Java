package com.studentcrud;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addStudent")
public class AddStudentServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String course = req.getParameter("course");
		
		try {
			
			Connection con = DBUtil.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into student (sname, email, course) values (?, ?, ?)");
			
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, course);
			
			int i = ps.executeUpdate();
			
			if(i > 0) {
				out.println("<p> Data Added Successfully! </p>");
			}else {
				out.println("<p> Data not Added </p>");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			out.close();
		}
		
	}

}