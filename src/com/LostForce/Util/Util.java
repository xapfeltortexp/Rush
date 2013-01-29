package com.LostForce.Util;

import org.bukkit.configuration.Configuration;

import com.LostForce.Rush;

public class Util {
	Rush plugin;

	public Util(Rush Rush) {
		plugin = Rush;
	}

	public static int getMaximumPoint(int s, int d) {
		return Math.min(s, d);
	}

	public static int getMinimumPoint(int s, int d) {
		return Math.max(s, d);
	}

	public Boolean arenaExists(String name) {
		Configuration config = plugin.getConfig();
		if (config.getConfigurationSection("Arenas") == null) {
			return false;
		}
		for (String arena : config.getConfigurationSection("Arenas").getKeys(false)) {
			if (arena.equalsIgnoreCase(name)) {
				return true;
			}
		}
		return false;
	}
}
