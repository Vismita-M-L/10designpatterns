package com.techlabs.factory;

public  abstract class Account {
	private int AccountNumber;
	private double balance;
	public Account(int accountNumber, double balance) {
		super();
		AccountNumber = accountNumber;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	abstract public double getInteresRate();
	@Override
	public String toString() {
		return "Account [AccountNumber=" + AccountNumber + ", balance=" + balance + "]";
	}
	
}
