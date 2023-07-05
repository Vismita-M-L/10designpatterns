package com.techlabs.factory;

public class CarTest {

	public static void main(String[] args) {
		CarFactory carfactor=new CarFactory();
		ICars maruthi=carfactor.makeCars(CarType.MARUTHI);
		ICars tata=carfactor.makeCars(CarType.TATA);
		ICars mahindra=carfactor.makeCars(CarType.MAHINDRA);
		

	


 maruthi.start();
 maruthi.stop();
	}
}