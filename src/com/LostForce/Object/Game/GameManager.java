package com.LostForce.Object.Game;

import java.util.LinkedList;
import java.util.List;

import com.LostForce.Object.RushPlayer;

public class GameManager {
	
	Game game = null;
	List<RushPlayer> players = new LinkedList<RushPlayer>();
	
	public Game getCurrentGame() {
		return game;
	}
	
	public void startGame(Game game) {
		this.game = game;
	}
	
	public List<RushPlayer> getPlayers() {
		return players;
	}

}
