package com.techlabs.behaviourCommand;

public class Television {
	    private boolean isOn;
	    private boolean isOff;
	    private int volume;

	    public Television() {
	        isOn = false;
	        isOff=true;
	        volume = 10;
	    }

	    public void turnOn() {
	        isOn = true;
	        isOff=false;
	        System.out.println("Television is turned on");
	    }

	    public void turnOff() {
	        isOn = false;
	        isOff=true;
	        System.out.println("Television is turned off");
	    }

	    public void increaseVolume() {
	        if (isOn) {
	            volume++;
	            System.out.println("Volume increased. Current volume: " + volume);
	        }if(isOff){
	            System.out.println("Cannot increase volume. The television is turned off.");
	        }
	    }
	    

	    public void decreaseVolume() {
	        if (isOn) {
	           volume--;
	           System.out.println("Volume decreased. Current volume: " + volume);
	            } 
	        if(isOff){
	            System.out.println("Cannot decrease volume. The television is turned off.");
	        }
	    }
}
