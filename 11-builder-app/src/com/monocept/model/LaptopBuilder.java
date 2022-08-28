package com.monocept.model;

public class LaptopBuilder {
	Laptop laptop;
	
	public LaptopBuilder(){
		laptop=new Laptop();
	}
	
	public LaptopBuilder addRam(String ram){
		laptop.setRam(ram);
		return this;
	}
	
	public LaptopBuilder addHdd(String hdd){
		laptop.setHdd(hdd);
		return this;
	}
	
	public LaptopBuilder addKeyboard(String keyboard){
		laptop.setKeyboard(keyboard);
		return this;
	}
	
	public LaptopBuilder addMouse(String mouse){
		laptop.setMouse(mouse);
		return this;
	}
	
	public LaptopBuilder addIsTouchScreen(Boolean ans){
		laptop.setTouchScreen(ans);
		return this;
	}
	
	public Laptop getLaptop(){
		return laptop;
	}
	
	
	
}
