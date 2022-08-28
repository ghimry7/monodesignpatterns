package com.monocept.model;

public class Singleton {
	private static Singleton obj;

	static{
		obj=new Singleton();
	}
	private Singleton() {

	}

	public static Singleton getInstance() {
		return obj;
	}

	
}
