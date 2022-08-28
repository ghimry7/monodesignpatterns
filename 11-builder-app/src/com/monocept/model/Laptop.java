package com.monocept.model;

public class Laptop {
	private String ram;
	private String hdd;
	private String keyboard;
	private String mouse;
	private boolean isTouchScreen;
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public String getKeyboard() {
		return keyboard;
	}
	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	public String getMouse() {
		return mouse;
	}
	public void setMouse(String mouse) {
		this.mouse = mouse;
	}
	public boolean isTouchScreen() {
		return isTouchScreen;
	}
	public void setTouchScreen(boolean isTouchScreen) {
		this.isTouchScreen = isTouchScreen;
	}
	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", hdd=" + hdd + ", keyboard=" + keyboard + ", mouse=" + mouse
				+ ", isTouchScreen=" + isTouchScreen + "]";
	}
	
	
}
