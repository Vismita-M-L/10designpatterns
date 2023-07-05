package com.techlabs.factory;

public class SavingsAccount extends Account {
	private String Name;

	public SavingsAccount(int accountNumber, double balance, String name) {
		super(accountNumber, balance);
		Name = name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getInteresRate()
	{
		return 7.5;
	}

	@Override
	public String toString() {
		return "SavingsAccount [Name=" + Name + "]";
	}
	

}
