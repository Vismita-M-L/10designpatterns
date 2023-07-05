package com.techlabs.structural.facade;

public class ItalianHotel implements IHotel{
	public IMenu getMenu() {
		return new ItalianMenu();
	}

}
