package com.monocept.test;

import com.monocept.model.GameApp;
import com.monocept.model.ProxyGame;

public class ProxyTest {

	public static void main(String[] args) {
		GameApp gameApp=new ProxyGame("CandyCrush");
		gameApp.displaying();
		
		System.out.println();
		
		gameApp.displaying();
	}

}
