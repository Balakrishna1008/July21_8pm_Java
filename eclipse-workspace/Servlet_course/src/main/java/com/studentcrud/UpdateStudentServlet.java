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

@WebServlet("/updateStudent")
public class UpdateStudentServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String course = req.getParameter("course");
		
		try {
			Connection con = DBUtil.getConnection();
			PreparedStatement ps = con.prepareStatement("update student set name = ?, email = ?, course = ? where id = ?");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, course);
			ps.setInt(4, id);
			
			int i = ps.executeUpdate();
			
			if(i > 0) {
				out.println("<p> Data Updated Successfully </p>");
			}else {
				out.println("<p> Data not Updated </p>");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
				
	}

}