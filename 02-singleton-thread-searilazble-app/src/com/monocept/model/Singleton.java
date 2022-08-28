package com.monocept.model;

import java.io.Serializable;

public class Singleton implements Serializable{
	private static Singleton obj;
	private int num;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (obj == null) {
			obj = new Singleton();
		}
		return obj;
		
	}
	
	protected Object readResolve() {
		return obj;
	}

	

}
