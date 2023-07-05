package com.techlabs.behaviouraldesignpattern.strategy;

public class AddOperation implements IOperation{
	private int a;
	private int b;
	public int doOperation(int a,int b) {
		int add = a + b;
        System.out.println("a + b: " + add);
        return add;
	}
	
	

}
