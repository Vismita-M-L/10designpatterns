package com.techlabs.decorator;

public class WheelAlign extends CarServiceDecorator{
	private ICarService carObj;

	public WheelAlign(ICarService carObj) {
		super(carObj);
	
	}
	public double getCost()
	{
		return super.getCost()+400;
		
	}

}
