package com.techlabs.behaviouraldesignpatterncom2;

public class EmployeeTest {

	public static void main(String[] args) {
		

	Employee emp = new Employee(1, "John", new Consultant());
    emp.getDescription(); 
    emp.getResponsibility();
    
    
    emp.promote(new SeniorConsultant());
    emp.getDescription();
    emp.getResponsibility();
 
    
    emp.promote(new TechLead());
    emp.getDescription();
    emp.getResponsibility();
}

}
