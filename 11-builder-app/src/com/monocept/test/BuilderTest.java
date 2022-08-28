package com.monocept.test;

import com.monocept.model.*;

public class BuilderTest {

	public static void main(String[] args) {
		Laptop laptop=new LaptopBuilder().addRam("8Gb").addHdd("8Gb").addKeyboard("Wired Hp").addMouse("Wireless Dell").addIsTouchScreen(false).getLaptop();
		System.out.println(laptop);
	}

}
