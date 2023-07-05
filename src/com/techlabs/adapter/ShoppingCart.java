package com.techlabs.adapter;

import java.util.List;

public class ShoppingCart {
	private List<IItems> cartItems;

	public ShoppingCart(List<IItems> cartItems) {
		super();
		this.cartItems = cartItems;
	}
	public void addItemCart(List<IItems> cartItems) {
		for(IItems item:cartItems)
			cartItems.add(item);

		
	}
	public List<IItems> getCartItems(){
		return cartItems;
		
	}
	public double getCartPrice() {
		double totalPrice=0;
		for(IItems item:cartItems) {
			totalPrice=totalPrice+item.getIItemPrice();

		}
		

		return totalPrice;
		
	}

}
