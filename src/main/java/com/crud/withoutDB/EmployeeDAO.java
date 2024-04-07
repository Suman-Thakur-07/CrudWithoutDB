package com.crud.withoutDB;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {

	private static EmployeesList list = new EmployeesList();
	
	
	static 
	{
		list.getEmployeeList().add( 
	            new Employee( 
	                1, 
	                "Prem", 
	                "Tiwari", 
	                "chapradreams@gmail.com")); 
	  
	        list.getEmployeeList().add( 
	            new Employee( 
	                2, "Vikash", 
	                "Kumar", 
	                "abc@gmail.com")); 
	  
	        list.getEmployeeList().add( 
	            new Employee( 
	                3, "Ritesh", 
	                "Ojha", 
	                "asdjf@gmail.com")); 
	}
	        
	     // Method to return the list 
	        public EmployeesList getAllEmployees() 
	        { 
	      
	            return list; 
	        } 
	      
	            
	            // Method to add an employee 
	            // to the employees list 
	            public void
	            addEmployee(Employee employee) 
	        { 
	            list.getEmployeeList() 
	                .add(employee); 
	}
}
