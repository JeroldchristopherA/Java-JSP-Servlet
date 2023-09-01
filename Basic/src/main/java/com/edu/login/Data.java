package com.edu.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Data {
	
	public void save(int id1, String name1, double marks1, int age1, long examno1) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		
		PreparedStatement ps = c.prepareStatement("insert into std values(?,?,?,?,?)");
		ps.setInt(1,id1);
		ps.setString(2, name1);
		ps.setDouble(3, marks1);
		ps.setInt(4, age1);
		ps.setLong(5, examno1);
		
		ps.executeUpdate();
		
		c.close();
	}

	 
		
	}


