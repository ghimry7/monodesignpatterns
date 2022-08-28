package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IComponent {

	private String name;
	private List<IComponent> components = new ArrayList<>();;

	public Composite(String name) {
		super();
		this.name = name;

	}

	public void addComponent(IComponent component) {
		((List<IComponent>) components).add(component);
	}


	@Override
	public void showPrice() {
		System.out.println(name);
		for (IComponent c : components) {
			c.showPrice();
		}
	}

}
