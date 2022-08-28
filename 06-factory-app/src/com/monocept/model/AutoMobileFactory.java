package com.monocept.model;

public class AutoMobileFactory {
	private static AutoMobileFactory obj;

	private AutoMobileFactory() {

	}

	public static synchronized AutoMobileFactory getInstance() {
		if (obj == null) {
			obj = new AutoMobileFactory();
		}
		return obj;
	}
	

	public IAutomobile makeAuto(AutoType auto) {

		if (auto == AutoType.BMW) {
			return new Bmw();
		}

		if (auto == AutoType.AUDI) {
			return new Audi();
		}

		if (auto == AutoType.MARUTI) {
			return new Maruti();
		}

		return null;

	}

}
