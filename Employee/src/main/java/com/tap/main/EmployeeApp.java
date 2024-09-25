package com.tap.main;

import java.util.List;

import com.tap.Entity.Employee;
import com.tap.Manager.HibernateManager;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee e = new Employee(3,"Ramesh","Finance",28500);

		HibernateManager hm = new HibernateManager();
		
		//For Adding the Employees
//		hm.add(e);
//		System.out.println("employee added");
		
		//For Fetching specific Employee
//		Employee e = hm.getUserByID(1);
//		System.out.println(e);

//		For Updating an Employee
//		hm.updateEmployee(e);
		
//		For Deleting an Employee
//		hm.deleteEmployee(6);
		
		//For Fetching all Employees
//		List<Employee> list = hm.getAllEmployees();
	
//		for(Employee e : list) {
//			System.out.println(e);
//		}
//		hm.getAllEmployees();
		
		
	}

}
