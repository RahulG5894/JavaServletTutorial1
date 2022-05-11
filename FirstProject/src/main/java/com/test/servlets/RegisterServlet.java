package com.test.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("Welcome to Register Servlet");
		String name = req.getParameter("username");
		String password = req.getParameter("userpassword");
		String email = req.getParameter("usergender");
		String gender = req.getParameter("usergender");
		String course = req.getParameter("usercourse");
		String cond = req.getParameter("condition");
		
		if(cond!=null && cond.equals("checked")) {
//			out.println("<h2> Name : "+name +"</h2>");
//			out.println("<h2> Password : "+password +"</h2>");
//			out.println("<h2> Gender : "+gender +"</h2>");
//			out.println("<h2> Email : "+email +"</h2>");
//			out.println("<h2> Course : "+course +"</h2>");
			RequestDispatcher rd = req.getRequestDispatcher("success");
			rd.forward(req, res);
		}
		else {
			out.println("<h2>Please accept the terms and conditions</h2>");
			// I want to include output of Index.html
			RequestDispatcher rd = req.getRequestDispatcher("index.html");			
			rd.include(req, res);			
		}
	}
}
