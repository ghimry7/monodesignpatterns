package com.monocept.model;

public class OilChange  extends CarServiceDecorator{

	public OilChange(ICarService obj) {
		super(obj);
	}
	
	@Override
	public double getCost(){
		return 800+super.getCost();
	}

}
