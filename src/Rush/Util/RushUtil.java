package Rush.Util;

import java.util.HashMap;

public class RushUtil {

	public static HashMap<String, TeamType> teams = new HashMap<String, TeamType>();

	public static boolean game = true;

	/**
	 * 
	 * @param name
	 * @param type
	 */
	public static void joinTeam(String name, TeamType type) {

		if (type.equals(TeamType.RED)) {
			teams.put(name, type);
		} else if (type.equals(TeamType.BLUE)) {
			teams.put(name, type);
		} else if (type.equals(TeamType.YELLOW)) {
			teams.put(name, type);
		} else if (type.equals(TeamType.GREEN)) {
			teams.put(name, type);
		}
	}

	/**
	 * 
	 * @param name
	 * @return
	 */
	public static boolean isPlaying(String name) {
		if (teams.containsKey(name))
			return true;
		return false;
	}
	
	
	/**
	 * 
	 * @param name
	 */
	public static void leaveTeam(String name) {

		if (teams.get(name) == TeamType.RED) {

		} else if (teams.get(name) == TeamType.BLUE) {

		} else if (teams.get(name) == TeamType.GREEN) {

		} else if (teams.get(name) == TeamType.YELLOW) {

		}
	}
	
	/**
	 * 
	 * @return
	 */
	public static boolean isRunning() {
		if (game)
			return true;
		return false;
	}
	
	
	/**
	 * 
	 * @param run
	 */
	public static void setRunning(boolean run) {
		RushUtil.game = run;
	}
	
	/**
	 * 
	 */
	public static void startGame() {
		
		setRunning(true);
		
	}
	
	public static void stopGame() {
		
		setRunning(false);
		
	}

}
