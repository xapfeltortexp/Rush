package com.LostForce.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.LostForce.Rush;

public class Commands implements CommandExecutor {
	Rush plugin;

	public Commands(Rush Rush) {
		plugin = Rush;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			System.out.println("Command can't be run by console!");
			return true;
		}
		Player player = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("rush")){
			
		}
		return false;
	}
}
