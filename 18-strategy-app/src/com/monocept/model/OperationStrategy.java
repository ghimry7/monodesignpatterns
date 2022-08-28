package com.monocept.model;

public class OperationStrategy implements IOperation {
	
	IOperation operation;
	
	public OperationStrategy(IOperation operation){
		this.operation=operation;
	}
	
	
	public void setOperation(IOperation operation) {
		this.operation = operation;
	}


	@Override
	public double doOperation(int a, int b) {
		 return operation.doOperation(a, b);
	}

}
