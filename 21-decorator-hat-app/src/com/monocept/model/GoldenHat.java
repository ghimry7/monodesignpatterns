package com.monocept.model;

public class GoldenHat extends HatDecorator {

	public GoldenHat(IHat hat) {
		super(hat);
	}
	
	@Override
	public String getHat() {
		return "Golden Hat "+super.getHat();
	}

	@Override
	public double getPrice() {
		return 300+super.getPrice();
	}

	@Override
	public String getDescription() {
		return "Golden "+super.getDescription();
	}


}
