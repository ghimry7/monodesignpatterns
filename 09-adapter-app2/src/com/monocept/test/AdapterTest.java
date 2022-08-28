package com.monocept.test;

import com.monocept.model.*;

public class AdapterTest {

	public static void main(String[] args) {
		ShoppingCart sc=new ShoppingCart();
		sc.addItem(new Biscuit("Parleg",123));
		sc.addItem(new HatAdapter(new Hat("Cap",500,0.08)));
		
		sc.getCartItems();
		
		sc.getTotalCartPice();
	}

}
