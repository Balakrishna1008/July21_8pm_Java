package com.hello;

import java.io.IOException;
//import java.net.http.HttpResponse;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		// Writing HTML content inside the java code
		
		out.println("<html>");
		out.println("<head><title> Welcome page </title></head>");
		out.println("<body>");
		out.println("<h1> Welcome </h1>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}
		
}