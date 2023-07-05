package com.techlabs.behaviouraldesignpattern.strategy;

public class OperationStretegyTest {

	public static void main(String[] args) {
		OperationStrategy op=new OperationStrategy(new AddOperation());
		                  int a = 1;
						  int b = 3;
						op.doOperation(a, b);
		                  op.setOperation(new MultiplyOperation());
		                  op.doOperation(a, b);

	}

}
