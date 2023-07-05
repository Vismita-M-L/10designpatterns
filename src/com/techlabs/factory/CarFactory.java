package com.techlabs.factory;

public class CarFactory {
	  


	

	  public static ICars makeCars(CarType car){
		if(car==CarType.MARUTHI)
		{
			return new Maruthi();
		}
		if(car==CarType.TATA)
		{
			return new Tata();
		}
		if(car==CarType.MAHINDRA)
		{
			return new Mahindra();
		}
		return null;
		
	}
}



