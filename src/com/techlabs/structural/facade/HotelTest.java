package com.techlabs.structural.facade;

public class HotelTest {

	public static void main(String[] args) {
		IndianHotel indianhotel=new IndianHotel();
		IMenu menu=indianhotel.getMenu() ;
		menu.displayMenu();
		
		ItalianHotel italianhotel=new ItalianHotel();
		IMenu menu1=italianhotel.getMenu() ;
		menu1.displayMenu();

	}

}
