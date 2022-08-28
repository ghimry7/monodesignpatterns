package com.monocept.model;

public class TVonCommand implements Command{
	
	TV tv;
	
	public TVonCommand(TV tv){
		this.tv=tv;
	}
	
	
	@Override
	public void execute() {
		tv.on();
	}

}
