package com.monocept.model;

public class ProxyGame implements GameApp {

	private Game game;
	private String gameName;

	public ProxyGame(String gameName) {
		this.gameName = gameName;
	}

	@Override
	public void displaying() {
		if (game == null) {
			game = new Game(gameName);
		}
		game.displaying();
	}

}
