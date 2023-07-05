package com.techlabs.factory.abstractfactory;

public class CarFactoryTest {
	ICarFactory maruthifactory=new Maruthifactory();
	ICars maruthi=maruthifactory.makeCar();
	maruthi.start();
	maruthi.stop();
	
	

}
