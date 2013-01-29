package com.LostForce.Util;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.LostForce.Object.Team;

public class Util {

	public static void setHead(Team team, Player player) {

		if (team == Team.BLUETEAM) {
			player.getInventory().setHelmet(new ItemStack(35, 1, (short) 11));
		} else if (team == Team.REDTEAM) {
			player.getInventory().setHelmet(new ItemStack(35, 1, (short) 14));
		} else if (team == Team.YELLOWTEAM) {
			player.getInventory().setHelmet(new ItemStack(35, 1, (short) 4));
		} else if (team == Team.GREENTEAM) {
			player.getInventory().setHelmet(new ItemStack(35, 1, (short) 5));
		} else {
			return;
		}

	}
	
	public static int getMaximumPoint(int s, int d) {
		return Math.min(s, d);
	}
	
	public static int getMinimumPoint(int s, int d) {
		return Math.max(s, d);
	}

}
