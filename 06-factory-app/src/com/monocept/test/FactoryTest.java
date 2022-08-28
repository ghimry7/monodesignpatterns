package com.monocept.test;

import com.monocept.model.*;


public class FactoryTest {

	public static void main(String[] args) {
		AutoMobileFactory fact=AutoMobileFactory.getInstance();
		
		IAutomobile bmw=fact.makeAuto(AutoType.BMW);
		
		bmw.start();
		
		bmw.stop();
		
		
	}

}
