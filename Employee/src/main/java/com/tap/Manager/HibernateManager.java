package com.tap.Manager;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tap.Entity.Employee;

public class HibernateManager {
	static Session session;
	
	static
	{
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Employee.class);		
		SessionFactory sf = config.buildSessionFactory();		
		session = sf.openSession();	
	}
	
	public void add(Employee e) {
		Transaction tr = session.beginTransaction();
		session.persist(e);
		tr.commit();
		
	}
	
	public Employee getUserByID(int id) {
		Employee e = session.get(Employee.class, id);
		return e;
	}
	
	public void updateEmployee(Employee e) {
		Transaction tr = session.beginTransaction();
		session.update(e);
		tr.commit();
		System.out.println("Data updated");
	}

	public void deleteEmployee(int id) {
		Employee e = session.get(Employee.class, id);
		if(e!= null) {
			Transaction tr = session.beginTransaction();
			session.delete(e);
			tr.commit();
			System.out.println("Employee deleted");
		}
		else {
			System.out.println("No employee is available");
		}	
	}

	public List<Employee> getAllEmployees() {
		String hql = "from Employee";
		
		Query<Employee> query = session.createQuery(hql,Employee.class);
		
		return query.list();
		
		
	}

	
		

}
