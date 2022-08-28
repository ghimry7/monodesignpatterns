package com.monocept.model;

public class RibbonHat extends HatDecorator {

	public RibbonHat(IHat hat) {
		super(hat);
	}
	
	@Override
	public String getHat() {
		return "Ribbon Hat "+super.getHat();
	}

	@Override
	public double getPrice() {
		return 600+super.getPrice();
	}

	@Override
	public String getDescription() {
		return "Ribbon "+super.getDescription();
	}

}
