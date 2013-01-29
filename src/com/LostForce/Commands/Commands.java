package com.LostForce.Commands;

import org.bukkit.ChatColor;
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
		if (cmd.getName().equalsIgnoreCase("rush")) {
			if (args.length == 0) {
				player.sendMessage(ChatColor.RED + "Invalid usage!");
				return false;
			}
			if (args[0].equalsIgnoreCase("create")) {
				if (args.length != 2) {
					player.sendMessage(ChatColor.RED + "Invalid usage!");
					player.sendMessage(ChatColor.GOLD + "/rush create <name>");
					return false;
				}
				if (!player.hasPermission("rush.arena.create")) {
					player.sendMessage(ChatColor.RED + "You dont have Permissions!");
					return true;
				}
				if (plugin.util.arenaExists(args[1])) {
					player.sendMessage(plugin.prefix + ChatColor.RED + "An arena with that name already exists!");
					return true;
				}
			} else if (args[0].equalsIgnoreCase("delete")) {
				if (args.length != 2) {
					player.sendMessage(ChatColor.RED + "Invalid usage!");
					player.sendMessage(ChatColor.GOLD + "/rush delete <name>");
					return false;
				}
				if (!player.hasPermission("rush.arena.delete")) {
					player.sendMessage(ChatColor.RED + "You dont have Permissions!");
					return true;
				}
				if (!plugin.util.arenaExists(args[1])) {
					player.sendMessage(plugin.prefix + ChatColor.RED + "An arena with that does not exists!");
					return true;
				}
			} else if (args[0].equalsIgnoreCase("arenas")) {

			} else if (args[0].equalsIgnoreCase("kick")) {
				if (args.length != 2) {
					player.sendMessage(ChatColor.RED + "Invalid usage!");
					player.sendMessage(ChatColor.GOLD + "/rush kick <player>");
					return false;
				}
				if (!player.hasPermission("rush.kick")) {
					player.sendMessage(ChatColor.RED + "You dont have Permissions!");
					return true;
				}
			} else if (args[0].equalsIgnoreCase("stop")) {
				if (args.length != 2) {
					player.sendMessage(ChatColor.RED + "Invalid usage!");
					player.sendMessage(ChatColor.GOLD + "/rush kick <player>");
					return false;
				}
				if (!player.hasPermission("rush.kick")) {
					player.sendMessage(ChatColor.RED + "You dont have Permissions!");
					return true;
				}
			} else if (args[0].equalsIgnoreCase("start")) {
				if (args.length != 2) {
					player.sendMessage(ChatColor.RED + "Invalid usage!");
					player.sendMessage(ChatColor.GOLD + "/rush kick <player>");
					return false;
				}
				if (!player.hasPermission("rush.kick")) {
					player.sendMessage(ChatColor.RED + "You dont have Permissions!");
					return true;
				}
			} else if(args[0].equalsIgnoreCase("join")) {
				
			}
		}
		return false;
	}
}
