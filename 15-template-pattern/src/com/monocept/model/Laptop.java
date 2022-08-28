package com.monocept.model;

public class Laptop extends ComputerBuilder {

	@Override
	public void assembleComponents() {
		System.out.println("Componenets assembled, plus sdd");
	}

	@Override
	public void installOS() {
		System.out.println("Install windows 11");
	}

}
