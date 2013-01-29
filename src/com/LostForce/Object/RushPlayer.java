package com.LostForce.Object;

public class RushPlayer {

	String name = null;
	Team team = null;
	int id = 0;

	public RushPlayer(String name, Team team, int id) {
		setName(name);
		setTeam(team);
		setID(id);
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

}
