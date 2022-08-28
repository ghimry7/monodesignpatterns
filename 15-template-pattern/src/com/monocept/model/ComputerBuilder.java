package com.monocept.model;

public abstract class ComputerBuilder {
	
	public void buildComputer(){
		collectComponents();
		assembleComponents();
		installOS();
		startComputer();
	}
	
	private void collectComponents() {
		System.out.println("Componenets ram,hdd,usbports collected");
	}

	private void startComputer() {
		System.out.println("System is booting");
	}

	abstract public void assembleComponents();
	abstract public void installOS();
	
	
	
}
