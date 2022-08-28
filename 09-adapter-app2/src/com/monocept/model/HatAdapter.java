package com.monocept.model;

public class HatAdapter implements IItem {
	
	Hat hat;
	
	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getItem() {
		return hat.getName();
	}

	@Override
	public double getprice() {
		return hat.getPrice()+(hat.getPrice()*hat.getGst());
	}

}
