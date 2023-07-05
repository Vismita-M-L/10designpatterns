package com.techlabs.behaviouraldesignpattern.Observer;


public interface INotifier {
	public void notify(Account account,String message);
    void SMSNotifier();
    void EMailNotifier();
    void WhatsappNotifier();
    
}
