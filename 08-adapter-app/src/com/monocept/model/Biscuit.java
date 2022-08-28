package com.monocept.model;

public class Biscuit implements IItem {

	String name;
	double price;
	
	
	
	public Biscuit(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String getItem() {
		return name;
	}

	@Override
	public double getprice() {
		return price;
	}

}
