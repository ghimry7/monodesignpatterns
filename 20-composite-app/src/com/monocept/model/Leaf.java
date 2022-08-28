package com.monocept.model;

public class Leaf implements IComponent {

	private String name;
	private double price;

	public Leaf(String name, double price) {
		super();
		this.price = price;
		this.name = name;
	}

	@Override
	public void showPrice() {
		System.out.println(name + " : " + price);
	}

}
