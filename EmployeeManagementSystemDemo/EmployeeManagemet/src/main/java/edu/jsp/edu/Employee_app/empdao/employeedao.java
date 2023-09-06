package edu.jsp.edu.Employee_app.empdao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.jsp.edu.Employee_app.empdto.Employeetable;

public class employeedao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Dev");
	
	
	public void saveemployee(Employeetable employeetable) {
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(employeetable);
		et.commit();
		}
	
	public Employeetable getEmployeeEmail(String Email) {
		try {
		EntityManager entityManager =emf.createEntityManager();
		
		Query q = entityManager.createQuery("select e from Employeetable e where e.email=?1");
		q.setParameter(1,Email);
	    Employeetable employee	=(Employeetable) q.getSingleResult();
		return employee;
		
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
