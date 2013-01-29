package com.LostForce.Object.Game;

public class Game {
	
	String name = null;
	
	public Game(String name) {
		setName(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
}
