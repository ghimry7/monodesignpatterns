package com.monocept.model;

public class TV implements IDevices {
	
	@Override
	public void on() {
		System.out.println("TV is on");
	}

	@Override
	public void off() {
		System.out.println("TV is off");
	}

}
