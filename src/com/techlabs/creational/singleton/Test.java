package com.techlabs.creational.singleton;

public class Test {

	public static void main(String[] args) {
	Login login=Login.getlogin();
	
	Login login1=Login.getlogin();
	
	if(login==login1)
		System.out.println("Success");
	else
		System.out.println("Fail");
		
	
	
			

	}

}
