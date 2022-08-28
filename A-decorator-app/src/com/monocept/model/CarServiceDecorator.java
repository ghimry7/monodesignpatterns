package com.monocept.model;

public abstract class CarServiceDecorator implements ICarService {
	ICarService carObj;
	
	public CarServiceDecorator(ICarService carObj){
		this.carObj=carObj;
	}
	
	@Override
	public double getCost(){
		return carObj.getCost();
	}
}
