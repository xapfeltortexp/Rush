package com.LostForce;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class Rush extends JavaPlugin {
	Logger log = Logger.getLogger("Minecraft");
	public String prefix = "§8§l§m[§c§oRush§8§l§m]§r ";
	/**
	 * Plugin start
	 */
	public void onEnable() {
		/**
		 * Register stuff
		 */
		registerStuff();
		/**
		 * Output message
		 */
		log.log(Level.INFO, "[Rush] Plugin Version " + this.getDescription().getVersion() + " activated! Have fun ;D");
	}
	
	/**
	 * Plugin Stop
	 */
	public void onDisable() {
		/**
		 * Output message
		 */
		log.log(Level.INFO, "[Rush] Plugin deactivated!");	
	}
	
	/**
	 * Register stuff
	 */
	public void registerStuff() {
		
	}
}
