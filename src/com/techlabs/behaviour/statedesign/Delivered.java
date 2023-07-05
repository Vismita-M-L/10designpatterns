package com.techlabs.behaviour.statedesign;

public class Delivered implements PackageState{
		public void previous(Package pack)
		{
			pack.setState(new Ordered());
		}
		public void currentstatus() 
		{
			System.out.println("Package is Delivered");
		}
		public void next(Package pack) 
		{
			pack.setState(new Received());
		}
		
		

}
