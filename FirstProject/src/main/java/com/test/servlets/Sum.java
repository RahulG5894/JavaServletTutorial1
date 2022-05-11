package com.test.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sum extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("this is sum servlet called");
		String num1 = req.getParameter("n1");
		String num2 = req.getParameter("n2");
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		int s = n1+n2;
		req.setAttribute("sum", s);	
		RequestDispatcher rd = req.getRequestDispatcher("product");
		rd.forward(req, res);
	}
	
}
