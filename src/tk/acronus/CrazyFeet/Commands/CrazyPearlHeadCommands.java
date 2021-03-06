package tk.acronus.CrazyFeet.Commands;

import java.util.ArrayList;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import tk.acronus.CrazyFeet.CrazyFeet;

public class CrazyPearlHeadCommands implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel, String[] args){
		
		final ChatColor yellow = ChatColor.YELLOW;
		final ChatColor red = ChatColor.RED;
		final ArrayList<Player> chPearl = CrazyFeet.CrazyPearlHead;
		
		if(args.length < 1) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				if(player.hasPermission("CrazyFeet.CrazyPearlHead")) {
					if(chPearl.contains(player)) {
						chPearl.remove(player);
						player.sendMessage(yellow+"Head Particles is going away..");
						return true;
					} else {
						chPearl.add(player);
						player.sendMessage(yellow+"Partciles Effects is above your head!");
						return true;
					}
				} else {
					player.sendMessage(red+"No permission.");
					return true;
				}
			} else {
				sender.sendMessage(red+"You must be an ingame player to do this!");
				return true;
			}
		} else if(args.length == 1) {
			if(sender.hasPermission("CrazyFeet.crazyPearlheadeother")) {
				if(Bukkit.getServer().getPlayer(args[0]) != null) {
					Player targ = Bukkit.getServer().getPlayer(args[0]);
					if(chPearl.contains(targ)) {
						chPearl.remove(targ);
						targ.sendMessage(yellow+sender.getName()+" has disabled your CrazyPearlHead!");
						sender.sendMessage(yellow+targ.getDisplayName()+"'s CrazyPearlHead has been disabled!");
						return true;
					} else {
						chPearl.add(targ);
						targ.sendMessage(yellow+sender.getName()+" has given you CrazyPearlHead!");
						sender.sendMessage(yellow+targ.getDisplayName()+" has been given CrazyPearlHead!");
						return true;
					}
				} else {
					sender.sendMessage(red+"The player "+yellow+args[0]+red+" is either offline or does not exist!");
					return true;
				}
			} else {
				sender.sendMessage(red+"You do not have permission to toggle CrazyPearlHead on others.");
				return true;
			}
		} else if(args.length > 1) {
			sender.sendMessage(red+"Incorrect usage. Use /crazyfeet for help!");
			return true;
		}
		return false;
	}
}