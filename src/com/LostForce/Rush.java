package com.LostForce;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.LostForce.Commands.Commands;
import com.LostForce.Util.Util;

public class Rush extends JavaPlugin {
	Logger log = Logger.getLogger("Minecraft");
	public String prefix = "§8§l§m[§c§oRush§8§l§m]§r ";
	public Commands CE = new Commands(this);
	public Util util = new Util(this);

	/**
	 * Plugin start
	 */
	public void onEnable() {
		/**
		 * Register stuff
		 */
		registerStuff();
		/**
		 * Load config
		 */
		loadConfig();
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
	 * Load default config
	 */
	public void loadConfig() {
		FileConfiguration config;
		if (new File("plugins/Rush/config.yml").exists()) {
			config = this.getConfig();
			config.options().copyDefaults(true);
			log.log(Level.INFO, "[Rush] config.yml successfully loaded.");
		} else {
			saveDefaultConfig();
			config = this.getConfig();
			log.log(Level.INFO, "[Rush] New config.yml has been created.");
		}
	}

	/**
	 * Register stuff
	 */
	public void registerStuff() {
		this.getCommand("rush").setExecutor(CE);
	}
}
