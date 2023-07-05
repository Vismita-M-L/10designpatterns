package com.techlabs.adapter;

import java.util.Arrays;

public class AdapterTest {

	public static void main(String[] args) {
		Biscuit biscuit1=new Biscuit("Orea",30);
		Biscuit biscuit2=new Biscuit("JimJam",25);
		
		
		HatAdapter hat=new HatAdapter(new Hat("hat","HAT",150,25));
		ShoppingCart shoppingcart=new ShoppingCart(Arrays.asList(biscuit1,biscuit2,hat));
		for(IItems items:shoppingcart.getCartItems()) {
			System.out.println(items.getIItemName()+":"+items.getIItemPrice());
		}
		System.out.println("toatl Price is:"+shoppingcart.getCartPrice());

	}

}
