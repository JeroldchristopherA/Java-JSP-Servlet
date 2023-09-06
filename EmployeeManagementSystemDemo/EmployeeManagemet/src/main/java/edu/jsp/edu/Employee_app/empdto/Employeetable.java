package edu.jsp.edu.Employee_app.empdto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employeetable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private  String name;
	private String cname;
	private String job;
	private double sal;
	@Column(unique = true)
	private String email;
	private String password;
	@Column(unique = true)
	private long phno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Employeetable [id=" + id + ", name=" + name + ", cname=" + cname + ", job=" + job + ", sal=" + sal
				+ ", email=" + email + ", password=" + password + ", phno=" + phno + "]";
	}
	

}
