package com.monocept.model;

public class AudiFactory implements IAutoMobileFactory {

	private static AudiFactory obj;

	private AudiFactory(){
		
	}

	public static AudiFactory getInstance() {
		if (obj == null) {
			obj = new AudiFactory();
		}
		return obj;
	}

	@Override
	public IAutomobile autoMake() {
		return new Audi();
	}

}
