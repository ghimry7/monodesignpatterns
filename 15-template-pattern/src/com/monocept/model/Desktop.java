package com.monocept.model;

public class Desktop extends ComputerBuilder {

	@Override
	public void assembleComponents() {
		System.out.println("Componenets assembled,plus 4gb graphic card");
	}

	@Override
	public void installOS() {
		System.out.println("Install windows 10");
	}

}
