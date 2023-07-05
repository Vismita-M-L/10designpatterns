package com.techlabs.behaviourCommand;

public class Increase implements ICommand{
    private Television tv;
    
    public Increase(Television tv) {
		
		this.tv = tv;
	}
    
    public void execute() {
        tv.increaseVolume();;
		
	}
}
