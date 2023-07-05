package com.techlabs.adapter;

public class HatAdapter implements IItems{
	private Hat hat;
	

	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}



	@Override
	public String getIItemName() {
		return hat.getShortName();
		
	}

	@Override
	public  double getIItemPrice() {
		return hat.getBasicPrice()+(hat.getBasicPrice()*hat.getTax()/100);
		
	}
	

}
