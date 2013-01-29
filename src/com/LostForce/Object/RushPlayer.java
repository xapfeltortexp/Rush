package com.LostForce.Object;

public class RushPlayer {

	String name = null;
	Team team = null;
	int id = 0;
	String arena = null;

	public RushPlayer(String name, Team team, String arena, int id) {
		setName(name);
		setTeam(team);
		setID(id);
		setArena(arena);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}
	
	public void setArena(String name) {
		this.arena = name;
	}
	
	public String getArena() {
		return arena;
	}
}
