package com.monocept.test;

import com.monocept.model.*;

public class StrategyTest {

	public static void main(String[] args) {
		OperationStrategy op=new OperationStrategy(new Addition());
		
		System.out.println("Addition "+op.doOperation(18, 5));
		
		op.setOperation(new Multiply());
		System.out.println("Multiply "+op.doOperation(5, 10));
		
	}

}
