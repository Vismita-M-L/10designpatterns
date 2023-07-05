package com.techlabs.behaviourCommand;

public class Test {

	public static void main(String[] args) {
		Television tv = new Television();

		
        Remote remote = new Remote();

        // Turn on the TV
        remote.Remote(new On(tv));
        remote.execute();

        // Increase the volume
        remote.Remote(new Increase(tv));
        remote.execute();

        // Decrease the volume
        remote.Remote(new Decrease(tv));
        remote.execute();

        
    }

	}


