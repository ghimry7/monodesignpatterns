package com.monocept.model;

public class HatDecorator implements IHat {

	IHat hat;
	HatDecorator(IHat hat){
		this.hat=hat;
	}
	
	@Override
	public String getHat() {
		return hat.getHat();
	}

	@Override
	public double getPrice() {
		return hat.getPrice();
	}

	@Override
	public String getDescription() {
		return hat.getDescription();
	}

}
