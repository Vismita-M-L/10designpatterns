package com.techlabs.factory;

public class AccountFactory {
	private static Account account;
	public static Account generateAccount(String type)
	{
		if(type.contentEquals("current"))
			account=new CurrentAccount(11,1000,"Vismita");
		if(type.contentEquals("savings"))
			account=new SavingsAccount(12,1500,"Varun");
		return account;
			
	}

}
