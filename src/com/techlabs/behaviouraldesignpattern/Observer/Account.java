package com.techlabs.behaviouraldesignpattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class Account implements INotifier{
	private int accountnumber;
	private String name;
	private double balance;
	private List<INotifier> notifiers;
	
	public Account(List<INotifier> notifiers) {
		this.notifiers = notifiers;
	}
	public void initializeNotifiers() {
        notifiers = new ArrayList<INotifier>();
        
	
}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public List<INotifier> getNotifiers() {
		return notifiers;
	}
	public void setNotifiers(List<INotifier> notifiers) {
		this.notifiers = notifiers;
	}
	public void deposit(double amount) {
        balance += amount;
        notifyToAllNotifiers("Amount deposited : " + amount + "New balance: " + balance);
    }

	public void withdraw(double amount) throws InsufficientFundException {
	    balance -= amount;
	    notifyToAllNotifiers("Amount Withdrawn: " + amount + " | New balance: " + balance);
	    if (amount > balance) {
	        throw new InsufficientFundException("Insufficient funds. Withdrawal denied.");
	    }
	}
    

	private void notifyToAllNotifiers(String  message) {
	    for (INotifier notifier : notifiers) {
	        notifier.notify(this, message);
	    }
	}
	public void registerNotifier(INotifier notifier) {
        notifiers.add(notifier);
    }

    @Override
    public String toString() {
        return "Account [accountNumber=" + accountnumber + ", name=" + name + ", balance=" + balance + "]";
    }
	@Override
	public void notify(Account account, String message) {
		return;
		
	}
	@Override
	public void SMSNotifier() {
		return ;
		
	}
	@Override
	public void EMailNotifier() {
		return;
		
	}
	@Override
	public void WhatsappNotifier() {
		return;
		
	}
	

    }
	
