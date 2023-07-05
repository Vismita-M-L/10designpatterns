package com.techlabs.behaviourCommand;

public class Remote {
	private ICommand command;

   

    public void Remote(ICommand command) {
		this.command = command;
	}



	public void execute() {
        command.execute();
    }



	

}
