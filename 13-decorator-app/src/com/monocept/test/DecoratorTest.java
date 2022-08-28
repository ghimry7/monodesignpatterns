package com.monocept.test;

import com.monocept.model.*;

public class DecoratorTest {

	public static void main(String[] args) {
		ICarService car=new CarInspection();
		TyreAlign tyre=new TyreAlign(car);
		OilChange oil=new OilChange(tyre);
		
		System.out.println(oil.getCost());
		
	}

}
