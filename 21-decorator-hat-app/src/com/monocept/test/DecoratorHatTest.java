package com.monocept.test;

import com.monocept.model.*;

public class DecoratorHatTest {

	public static void main(String[] args) {
		IHat hat=new StandardHat();
		GoldenHat gold=new GoldenHat(hat);
		disp(gold);
		
		IHat pr=new PremiumHat();
		GoldenHat gold1=new GoldenHat(pr);
		RibbonHat rib=new RibbonHat(gold1);
		
		disp(rib);
		
		
		
		
	}
	
	public static void disp(IHat hat){
		System.out.println(hat.getHat());
		System.out.println(hat.getPrice());
		System.out.println(hat.getDescription()+" hat");
		System.out.println("-------------------------------------------");
	}

}
