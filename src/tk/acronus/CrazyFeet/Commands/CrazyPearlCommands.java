package tk.acronus.CrazyFeet.Commands;

import java.util.ArrayList;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import tk.acronus.CrazyFeet.CrazyFeet;

public class CrazyPearlCommands implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandlabel, String[] args) {
		
		final ChatColor red = ChatColor.RED;
		final ChatColor yellow = ChatColor.YELLOW;
		final ArrayList<Player> cPearl = CrazyFeet.CrazyPearl;
		
		if(args.length < 1) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				if(player.hasPermission("CrazyFeet.crazypearl")) {
					if(cPearl.contains(player)) {
						cPearl.remove(player);
						player.sendMessage(yellow+"The tingling sensation fades away..");
						return true;
					} else {
						cPearl.add(player);
						player.sendMessage(yellow+"You feel a tingling sensation in your feet!");
						return true;
					}
				} else {
					player.sendMessage(red+"No permission");
					return true;
				}
			}
		} else if(args.length == 1){
			if(sender.hasPermission("CrazyFeet.crazypearlother")) {
				if(Bukkit.getServer().getPlayer(args[0]) != null) {
					Player targ = Bukkit.getServer().getPlayer(args[0]);
					if(cPearl.contains(targ)) {
						cPearl.remove(targ);
						targ.sendMessage(yellow+sender.getName()+" has disabled your CrazyPearl!");
						sender.sendMessage(yellow+targ.getDisplayName()+"'s CrazyPearl has been disabled!");
						return true;
					} else {
						cPearl.add(targ);
						targ.sendMessage(yellow+sender.getName()+" has given you CrazyPearl!");
						sender.sendMessage(yellow+targ.getDisplayName()+" has been given CrazyPearl!");
						return true;
					}
				} else {
					sender.sendMessage(red+"The player "+yellow+args[0]+red+" is either offline or does not exist!");
					return true;
				}
			} else {
				sender.sendMessage(red+"You do not have permission to toggle CrazyPearl on others.");
				return true;
			}
		} else {
			sender.sendMessage(red+"Incorrect usage. Use /crazyfeet for help!");
			return true;
		}
		return false;
	}
}
