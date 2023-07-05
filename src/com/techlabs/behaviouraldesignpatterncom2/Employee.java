package com.techlabs.behaviouraldesignpatterncom2;

public class Employee {
	private int id;
	private String name;
	private IRole role;
	
	public Employee(int id, String name, IRole role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}

	
	
	public void promote (IRole role)
	{
		this.role=role;
	}
	public void getDescription() {
		 System.out.println("Employee Id: " + id); 
		 System.out.println("Employee Name: " + name);
	     System.out.println("Employee Description: " + role.description());
    }
    
    public void getResponsibility() {
    	
	     System.out.println("Employee Responsibility: " + role.responsibility());
      
    }
	
    
    

}
