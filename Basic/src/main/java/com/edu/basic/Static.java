package com.edu.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public  class Static extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		PrintWriter out = res.getWriter();
		
		out.print("<h1>Hi i am Static Servlet</h1>");
		
		
		
		
	}

}
