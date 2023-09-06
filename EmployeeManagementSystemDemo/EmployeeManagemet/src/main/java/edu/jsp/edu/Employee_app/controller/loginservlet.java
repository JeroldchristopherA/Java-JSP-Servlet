package edu.jsp.edu.Employee_app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jsp.edu.Employee_app.empdao.employeedao;
import edu.jsp.edu.Employee_app.empdto.Employeetable;
@WebServlet("/login")
public class loginservlet extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				 String email=req.getParameter("email");
				 String pass=req.getParameter("pass");
				 
				 employeedao employeedao = new employeedao();
				 Employeetable e = employeedao.getEmployeeEmail(email);
				 
				 if(e!=null) {
					 if(pass.equals(e.getPassword())){
						 resp.getWriter().print("<h1>Login successfull</h1>");
						 }else {
							 resp.getWriter().print("<h1>Invalid password</h1>");

						 }
					 
				 }else {
					 resp.getWriter().print("<h1>Invalid email</h1>");
				 }
	}

}
