package com.monocept.model;

public class Multiply implements IOperation {

	@Override
	public double doOperation(int a, int b) {
		return a*b;
	}

}
