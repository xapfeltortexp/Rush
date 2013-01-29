package com.LostForce.Object.Game;

public class GameManager {
	
	Game game = null;
	
	public Game getCurrentGame() {
		return game;
	}
	
	public void startGame(Game game) {
		this.game = game;
	}

}
