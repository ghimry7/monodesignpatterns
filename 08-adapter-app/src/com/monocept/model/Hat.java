package com.monocept.model;

public class Hat {
	String name;
	double price;
	double gst;
	
	public Hat(String name, double price, double gst) {
		super();
		this.name = name;
		this.price = price;
		this.gst = gst;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getGst() {
		return gst;
	}

	public void setGst(double gst) {
		this.gst = gst;
	}
	
	
	
	
}
