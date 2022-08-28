package com.monocept.model;

public class MarutiFactory implements IAutoMobileFactory {

	private static MarutiFactory obj;

	private MarutiFactory(){
		
	}

	public static MarutiFactory getInstance() {
		if (obj == null) {
			obj = new MarutiFactory();
		}
		return obj;
	}
	
	@Override
	public IAutomobile autoMake() {
		return new Maruti();
	}

}
