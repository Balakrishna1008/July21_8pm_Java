package com.login;

import java.io.IOException;
import java.io.PrintWriter;

//import org.apache.catalina.ssi.SSICommand;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("username");
		
		out.println("<html><body>");
		out.println("<h2> Welcome, " + name + "<h2>");
		out.println("</body> </html>");
		out.close();
	}

}
