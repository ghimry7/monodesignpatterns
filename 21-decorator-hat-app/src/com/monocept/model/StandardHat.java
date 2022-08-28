package com.monocept.model;

public class StandardHat implements IHat {

	@Override
	public String getHat() {
		return "Standard Hat";
	}

	@Override
	public double getPrice() {
		return 300;
	}

	@Override
	public String getDescription() {
		return "Standard";
	}

}
