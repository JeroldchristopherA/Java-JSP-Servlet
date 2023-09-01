package com.edu.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class loginSer extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String password = req.getParameter("pass");
		Connection c = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginser","root","root");
					
			PreparedStatement ps = c.prepareStatement("insert into logo values(?,?) ");
			ps.setString(1, email);
			ps.setString(2, password);
			
			ps.executeUpdate();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		
		}finally {
			if (c!=null) {
				try {
					c.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}			}
		}
		
		
//		PrintWriter out = res.getWriter();
//		
//		out.print("Email :"+email +"\n Password :"+pass);
		
	}
	
	

}
