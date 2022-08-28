package com.monocept.model;

public class Consultant implements IRole {

	@Override
	public String description() {
		return "Consultant";
	}

	@Override
	public String responsibilty() {
		return "Write code";
	}

}
