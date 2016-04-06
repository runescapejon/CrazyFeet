package tk.acronus.CrazyFeet.Commands;

import java.util.ArrayList;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import tk.acronus.CrazyFeet.CrazyFeet;

public class CrazyHeartCommands implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel, String[] args){
		
		final ChatColor yellow = ChatColor.YELLOW;
		final ChatColor red = ChatColor.RED;
		final ArrayList<Player> cHeart = CrazyFeet.CrazyHeart;
		
		if(args.length < 1) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				if(player.hasPermission("CrazyFeet.crazyHeart")) {
					if(cHeart.contains(player)) {
						cHeart.remove(player);
						player.sendMessage(yellow+"The tingling sensation fades away sad face you don't want my love..");
						return true;
					} else {
						cHeart.add(player);
						player.sendMessage(yellow+"You feel a tingling sensation in your feet! the server is giving you love");
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
			if(sender.hasPermission("CrazyFeet.crazyHeartother")) {
				if(Bukkit.getServer().getPlayer(args[0]) != null) {
					Player targ = Bukkit.getServer().getPlayer(args[0]);
					if(cHeart.contains(targ)) {
						cHeart.remove(targ);
						targ.sendMessage(yellow+sender.getName()+" has disabled your CrazyHeart!");
						sender.sendMessage(yellow+targ.getDisplayName()+"'s CrazyHeart has been disabled!");
						return true;
					} else {
						cHeart.add(targ);
						targ.sendMessage(yellow+sender.getName()+" has given you CrazyHeart!");
						sender.sendMessage(yellow+targ.getDisplayName()+" has been given CrazyHeart!");
						return true;
					}
				} else {
					sender.sendMessage(red+"The player "+yellow+args[0]+red+" is either offline or does not exist!");
					return true;
				}
			} else {
				sender.sendMessage(red+"You do not have permission to toggle CrazyHeart on others.");
				return true;
			}
		} else if(args.length > 1) {
			sender.sendMessage(red+"Incorrect usage. Use /crazyfeet for help!");
			return true;
		}
		return false;
	}
}