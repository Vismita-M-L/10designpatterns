package com.techlabs.decorator;

public class OilChange extends CarServiceDecorator{
	private ICarService carObj;

	
		
	
	public OilChange(ICarService carObj) {
		super(carObj);
	
	}
	public double getCost()
	{
		return super.getCost()+500;
		
	}

}
