package Rush.Object;

import java.util.LinkedList;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Team {

	List<String> members = new LinkedList<String>();
	Location loc = null;
	TeamType team = null;

	// int x = config.bla.bla usw...

	public Team(TeamType team, String player, Location loc) {

	}

	public TeamType getTeamType() {
		return team;
	}
	
	public void setTeamType(TeamType team) {
		this.team = team;
	}
	

	public void newTeam(TeamType team, String player) {
		new Team(team, player, Location);
	}
	
	public 

}
