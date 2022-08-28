package com.monocept.model;

public class SeniorConsultant implements IRole {

	@Override
	public String description() {
		return "Senior Consultant";
	}

	@Override
	public String responsibilty() {
		return "Review code";
	}

}
