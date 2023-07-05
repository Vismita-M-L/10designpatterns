package com.techlabs.decorator;

public class CarTest {

	public static void main(String[] args) {
		CarInspection car=new CarInspection();
		OilChange oilchange=new OilChange(car);
		System.out.println("Oil Bill cost:"+oilchange.getCost());
		WheelAlign wheelalign1 = new WheelAlign(oilchange);
		System.out.println("Wheel Align  cost with Oil Change:"+wheelalign1.getCost());
		WheelAlign wheelalign = new WheelAlign(car);
		System.out.println("Wheel Align  cost:"+wheelalign.getCost());
		
		
		
		

	}

}
