package edu.jsp.edu.Employee_app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jsp.edu.Employee_app.empdao.employeedao;
import edu.jsp.edu.Employee_app.empdto.Employeetable;
@WebServlet("/signin")
public class SingnInServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 String	name =req.getParameter("name");
	 String	cname =req.getParameter("cname");
	 String	job =req.getParameter("job");
	 double sal =Double.parseDouble(req.getParameter("sal"));
	 String	email =req.getParameter("email");
	 String	pass =req.getParameter("pass");
	 long phno =Long.parseLong(req.getParameter("phno"));
	 
	 
	 Employeetable employeetable =new Employeetable();
	 employeetable.setName(name);
	 employeetable.setCname(cname);
	 employeetable.setEmail(email);
	 employeetable.setJob(job);
	 employeetable.setPassword(pass);
	 employeetable.setPhno(phno);
	 employeetable.setSal(sal); 
	 
	 employeedao employeedao=new employeedao();
	 employeedao.saveemployee(employeetable);
	
	 
	 
	 
	 
	 
	 
	}
	
	

}
