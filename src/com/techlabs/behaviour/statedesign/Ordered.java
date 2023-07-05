package com.techlabs.behaviour.statedesign;

public class Ordered implements PackageState{
	public void previous(Package pack)
	{
		System.out.println("Package is at source");
	}
	public void currentstatus() {
		System.out.println("Package is Ordered");
		
	}
	
	public void next(Package pack) {
		pack.setState(new Delivered());
		
	}
	

}
