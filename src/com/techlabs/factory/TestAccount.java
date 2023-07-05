package com.techlabs.factory;

public class TestAccount {

	public static void main(String[] args) {
		//Account account=new CurrentAccount(11, 1000, "Vismita");
		//System.out.println(account+":"+account.getInteresRate());
		
		//Account account1=new SavingsAccount(12, 1500, "Varun");
		//System.out.println(account1+":"+account1.getInteresRate());
		
		  
		//After creating AccountFactory Use this
		Account currentAccount=AccountFactory.generateAccount("current" );
		System.out.println(currentAccount+":"+currentAccount.getInteresRate());
				
		Account savingsAccount=AccountFactory.generateAccount("savings" );
		System.out.println(savingsAccount+":"+savingsAccount.getInteresRate());

	}

}
