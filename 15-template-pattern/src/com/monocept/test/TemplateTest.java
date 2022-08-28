package com.monocept.test;

import com.monocept.model.*;

public class TemplateTest {

	public static void main(String[] args) {
		ComputerBuilder laptop=new Laptop();
		laptop.buildComputer();
		
		System.out.println("----------------");
		
		ComputerBuilder desktop=new Desktop();
		desktop.buildComputer();
	}

}
