package me.samkio.levelcraft;

import java.util.List;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Admin {
	public  Levelcraft plugin;

	public Admin(Levelcraft instance) {
		plugin = instance;
	}

	public  void dothis(CommandSender sender, String[] split) {

		if (split[1].equalsIgnoreCase("setexp") && split.length >= 5) {

			String editplayer = split[3];
			double newexp = Double.parseDouble(split[4]);

			List<Player> players = plugin.getServer().matchPlayer(editplayer);
			if (players.size() == 0) {
				sender.sendMessage(ChatColor.valueOf(plugin.Settings.c1) + "[LC]" + ChatColor.valueOf(plugin.Settings.c4)
						+ " No matching player!");
			} else if (players.size() != 1) {
				sender.sendMessage(ChatColor.valueOf(plugin.Settings.c1) + "[LC]" + ChatColor.valueOf(plugin.Settings.c4)
						+ " Matched more than one player! Be more specific!");

			} else {
				Player editor = players.get(0);
				String stat = split[2];

				if ((stat.equalsIgnoreCase("mine")
						|| stat.equalsIgnoreCase("m") || stat
						.equalsIgnoreCase("mining"))) {
					// plugin.LevelFunctions.write(editor, newexp,
					// plugin.Levelcraft.MiExpFile);
					plugin.Level.update(editor, "m", newexp);
					sender.sendMessage(ChatColor.valueOf(plugin.Settings.c1) + "[LC]"
							+ ChatColor.valueOf(plugin.Settings.c3) + " Set Experience successful!");
				} else if ((stat.equalsIgnoreCase("w")
						|| stat.equalsIgnoreCase("wc") || stat
						.equalsIgnoreCase("woodcut"))) {
					plugin.Level.update(editor, "w", newexp);
					sender.sendMessage(ChatColor.valueOf(plugin.Settings.c1) + "[LC]"
							+ ChatColor.valueOf(plugin.Settings.c3) + " Set Experience successful!");

				} else if ((stat.equalsIgnoreCase("s")
						|| stat.equalsIgnoreCase("slay") || stat
						.equalsIgnoreCase("slayer"))) {
					plugin.Level.update(editor, "s", newexp);
					sender.sendMessage(ChatColor.valueOf(plugin.Settings.c1) + "[LC]"
							+ ChatColor.valueOf(plugin.Settings.c3) + " Set Experience successful!");

				} else if ((stat.equalsIgnoreCase("r")
						|| stat.equalsIgnoreCase("range") || stat
						.equalsIgnoreCase("ranging"))) {
					plugin.Level.update(editor, "r", newexp);
					sender.sendMessage(ChatColor.valueOf(plugin.Settings.c1) + "[LC]"
							+ ChatColor.valueOf(plugin.Settings.c3) + " Set Experience successful!");

				} else if ((stat.equalsIgnoreCase("c")
						|| stat.equalsIgnoreCase("fist") || stat
						.equalsIgnoreCase("fisticuffs"))) {
					plugin.Level.update(editor, "c", newexp);
					sender.sendMessage(ChatColor.valueOf(plugin.Settings.c1) + "[LC]"
							+ ChatColor.valueOf(plugin.Settings.c3) + " Set Experience successful!");
				} else if ((stat.equalsIgnoreCase("a")
						|| stat.equalsIgnoreCase("archer") || stat
						.equalsIgnoreCase("archery"))) {
					plugin.Level.update(editor, "a", newexp);
					sender.sendMessage(ChatColor.valueOf(plugin.Settings.c1) + "[LC]"
							+ ChatColor.valueOf(plugin.Settings.c3) + " Set Experience successful!");

				}  else if ((stat.equalsIgnoreCase("d")
						|| stat.equalsIgnoreCase("digging") || stat
						.equalsIgnoreCase("digger"))) {
					plugin.Level.update(editor, "d", newexp);
					sender.sendMessage(ChatColor.valueOf(plugin.Settings.c1) + "[LC]"
							+ ChatColor.valueOf(plugin.Settings.c3) + " Set Experience successful!");

				}  else if ((stat.equalsIgnoreCase("f")
						|| stat.equalsIgnoreCase("forge") || stat
						.equalsIgnoreCase("forgery"))) {
					plugin.Level.update(editor, "f", newexp);
					sender.sendMessage(ChatColor.valueOf(plugin.Settings.c1) + "[LC]"
							+ ChatColor.valueOf(plugin.Settings.c3) + " Set Experience successful!");

				} else {
					sender.sendMessage(ChatColor.valueOf(plugin.Settings.c1)
							+ "[LC]"
							+ ChatColor.valueOf(plugin.Settings.c2)
							+ " Stat not found type '/level list' to list all stats. ");
				}
			}
		}
	}
}
