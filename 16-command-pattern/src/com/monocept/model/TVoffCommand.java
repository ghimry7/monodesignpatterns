package com.monocept.model;

public class TVoffCommand implements Command{

	TV tv;

	public TVoffCommand(TV tv){
		this.tv=tv;
	}

	@Override
	public void execute() {
		tv.on();
	}
}
