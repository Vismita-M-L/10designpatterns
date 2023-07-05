package com.techlabs.factory;

public class CurrentAccount extends Account {
	String Name;

	public CurrentAccount(int accountNumber, double balance, String name) {
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
		return 8.5;
	}

	@Override
	public String toString() {
		return "CurrentAccount [Name=" + Name + "]";
	}
	

}
