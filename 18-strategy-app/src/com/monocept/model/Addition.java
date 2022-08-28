package com.monocept.model;

public class Addition implements IOperation {

	@Override
	public double doOperation(int a, int b) {
		return a+b;
	}

}
