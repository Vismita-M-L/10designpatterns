package com.techlabs.behaviouraldesignpattern.strategy;

public class MultiplyOperation implements IOperation{
	private int a;
	private int b;
	public int doOperation(int a,int b) {
		int multiply = a * b;
        System.out.println("a * b: " + multiply);
        return multiply;
	}
	
	

}
