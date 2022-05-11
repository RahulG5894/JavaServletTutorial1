package com.test.servlets;
	
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class ThirdServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("This is get method......");
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.println("<h1>This is get method of my servlet</h1>");
	}
}