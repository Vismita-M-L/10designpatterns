package com.techlabs.structural.facade;

public class IndianHotel implements IHotel {
	

	public IMenu getMenu() {
		return new IndianMenu();
		
	}
	

}
