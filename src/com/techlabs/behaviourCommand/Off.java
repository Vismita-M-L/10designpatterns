package com.techlabs.behaviourCommand;

public class Off implements ICommand{
    private Television tv;
    
    public Off(Television tv) {
		this.tv = tv;
	}
    public void execute() {
        tv.turnOff();;
		
	}
}
