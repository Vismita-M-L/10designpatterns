package com.techlabs.adapter;

public class Biscuit implements IItems{
	private String name;
	private double mrp;
	
	

	public Biscuit(String name, double mrp) {
		super();
		this.name = name;
		this.mrp = mrp;
	}

	@Override
	public String getIItemName() {
		return name;
		
	}

	@Override
	public double getIItemPrice() {
		return  mrp;
		
	}
	

}
