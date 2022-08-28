package com.monocept.model;

public class Singleton {

	private Singleton() {

	}

	private static class innerSingleton{
		private static final Singleton obj=new Singleton();
	}
	
	public static Singleton getInstance() {
		return innerSingleton.obj;
	}

	
}
