package com.monocept.model;

public class OnCommand implements Command{
	
	IDevices device;

	public OnCommand(IDevices device){
		this.device=device;
	}

	@Override
	public void execute() {
		device.on();
	}

}
