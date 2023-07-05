package com.techlabs.behaviourCommand;

public class On implements ICommand{
	private Television tv;
	
	
	public On(Television tv) {
		this.tv = tv;
	}


	public void execute() {
        tv.turnOn();;
		
	}
}
