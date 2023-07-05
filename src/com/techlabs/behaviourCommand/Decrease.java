package com.techlabs.behaviourCommand;

public class Decrease implements ICommand{
   private Television tv;

   public Decrease(Television tv) {
   this.tv = tv;
}
   public void execute() {
        tv.decreaseVolume();;
		
	}
}
