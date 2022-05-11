package com.test.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

/***
 * 
 * @author rg603
 * Servlet can be implemented in two ways, we have Servlet Interface
 * 
 * First Way of creating Servlet
 * GenericServlet is a abstract class which provides implementation of 4 methods but not for the service method.
 * so we can directly implement all the five methods of the Servlet Interface and create Servlet
 * 
 * 
 * Second way of creating Servlet us to extend generic servlet 
 *
 */
public class OneServlet implements Servlet {
	// Life cycle methods
	ServletConfig conf;
	
	public void init(ServletConfig conf) {
		this.conf = conf;
		System.out.println("creating object...");
	}
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Servicing...");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>This is printed using servlet</h1>");
		out.println("<p>Enjoy the process, destinations aren't amazing</p>");
	}
	
	public void destroy() {
		System.out.println("going to destroy servlet object...");
	}
	
	// Non-lifecycle method
	public ServletConfig getServletConfig() {
		return this.conf;
	}
	
	public String getServletInfo() {
		return "servlet info returned";
	}
}
