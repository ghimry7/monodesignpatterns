package com.monocept.model;

public class PremiumHat implements IHat {

	@Override
	public String getHat() {
		return "Premium Hat";
	}

	@Override
	public double getPrice() {
		return 600;
	}

	@Override
	public String getDescription() {
		return "Premium";
	}

}
