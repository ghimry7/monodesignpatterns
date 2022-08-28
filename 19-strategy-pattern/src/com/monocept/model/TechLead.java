package com.monocept.model;

public class TechLead implements IRole {

	@Override
	public String description() {
		return "Tech Lead";
	}

	@Override
	public String responsibilty() {
		return "Assign work";
	}

}
