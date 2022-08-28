package com.monocept.model;

public class OffCommand implements Command{

	IDevices device;

	public OffCommand(IDevices device){
		this.device=device;
	}

	@Override
	public void execute() {
		device.off();
	}
}
