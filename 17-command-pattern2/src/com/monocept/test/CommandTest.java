package com.monocept.test;

import com.monocept.model.*;

public class CommandTest {

	public static void main(String[] args) {
		Remote remote=new Remote();
		remote.setCommand(new OnCommand(new TV()));
		remote.pressButton();
		
		remote.setCommand(new OnCommand(new MediaPlayer()));
		remote.pressButton();
	}

}
