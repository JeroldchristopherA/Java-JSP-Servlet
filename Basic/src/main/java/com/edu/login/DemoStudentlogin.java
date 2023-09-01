package com.edu.login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DemoStudentlogin extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		int id1 = Integer.parseInt(req.getParameter("id"));
		String name1 = req.getParameter("Name");
		double marks1 = Double.parseDouble(req.getParameter("Marks"));
		int age1 = Integer.parseInt(req.getParameter("Age"));
		long examno1=Long.parseLong(req.getParameter("Examno"));
		
		
		
		Data d =new Data();
		
		try {
			d.save(id1, name1, marks1, age1, examno1);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		res.getWriter().print("<h1>Data inserted successfully</h1>");
		
	}

	
}
