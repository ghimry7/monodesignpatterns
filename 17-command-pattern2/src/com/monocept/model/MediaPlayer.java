package com.monocept.model;

public class MediaPlayer implements IDevices {
	
	@Override
	public void on() {
		System.out.println("Media Player is on");
	}

	@Override
	public void off() {
		System.out.println("Media Player is off");
	}
}
