package com.monocept.test;

import com.monocept.model.*;

public class CompositeTest {

	public static void main(String[] args) {
		IComponent hdd=new Leaf("HDD",4000);
		IComponent mouse=new Leaf("Mouse",700);
		IComponent monitor=new Leaf("Monitor",7000);
		IComponent keyboard=new Leaf("Keyboard",1100);
		IComponent ram=new Leaf("Ram",3500);
		IComponent processor=new Leaf("Processor",9000);
		
		Composite computer=new Composite("Computer");
		Composite cabinet=new Composite("Cabinet");
		Composite motherBoard=new Composite("Motherboard");
		Composite peripheral=new Composite("Peripheral");
		
		motherBoard.addComponent(ram);
		motherBoard.addComponent(processor);
		
		cabinet.addComponent(hdd);
		cabinet.addComponent(motherBoard);
		
		peripheral.addComponent(mouse);
		peripheral.addComponent(monitor);
		peripheral.addComponent(keyboard);
		
		computer.addComponent(cabinet);
		computer.addComponent(peripheral);
		
		cabinet.showPrice();
		System.out.println("--------------------------");
		peripheral.showPrice();
		System.out.println("--------------------------");
		computer.showPrice();
		
	}

}
