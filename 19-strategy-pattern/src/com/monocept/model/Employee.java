package com.monocept.model;

public class Employee {
	private int id;
	private String name;
	private IRole role;

	public Employee(int id, String name, IRole role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void promote(IRole role) {
		this.role = role;
	}

	public String getDescription() {
		return role.description();
	}

	public String getResponsibility() {
		return role.responsibilty();
	}

}
