package com.monocept.model;

public class TyreAlign extends CarServiceDecorator {

	public TyreAlign(ICarService obj) {
		super(obj);
	}
	
	@Override
	public double getCost(){
		return 700+super.getCost();
	}

}
