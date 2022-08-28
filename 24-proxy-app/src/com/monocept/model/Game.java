package com.monocept.model;

public class Game implements GameApp {
	private String gameName;

	public Game(String gameName) {
		this.gameName = gameName;
		loadingGame(gameName);
	}

	private void loadingGame(String gameName2) {
		System.out.println("Loadding..." + gameName2);
	}

	@Override
	public void displaying() {
		System.out.println("Displaying " + gameName);
	}

}
