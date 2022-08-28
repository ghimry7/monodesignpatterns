package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<IItem> cart=new ArrayList<>();
	
	public void addItem(IItem item){
		cart.add(item);
	}
	
	public void getCartItems(){
		for(IItem x:cart){
			System.out.println("Item "+x.getItem());
		}
	}
	
	public void getTotalCartPice(){
		int total=0;
		for(IItem x:cart){
			total+=x.getprice();
		}
		System.out.println("Total price "+total);
	}
	
}
