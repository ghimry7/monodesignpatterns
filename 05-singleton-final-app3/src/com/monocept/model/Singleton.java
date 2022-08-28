package com.monocept.model;

import java.io.Serializable;


public class Singleton implements Serializable{
	 private static final long serialVersionUID = 1L;

	private Singleton() {

	}
	
	private static class innerSingleton{
		private static final Singleton obj=new Singleton();
	}
	
	public static Singleton getInstance() {
		return innerSingleton.obj;
	}
	
	protected Object readResolve() {
		return getInstance();
	}

	

}
