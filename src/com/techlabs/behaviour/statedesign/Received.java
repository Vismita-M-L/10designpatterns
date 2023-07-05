package com.techlabs.behaviour.statedesign;

public class Received implements PackageState{
	public void previous(Package pack)
	{
		pack.setState(new Ordered());;
	}
	public void currentstatus() 
	{
		System.out.println("Package is Received");
	}
	public void next(Package pack) 
	{
		System.out.println("Package is already Received");
	}


}
