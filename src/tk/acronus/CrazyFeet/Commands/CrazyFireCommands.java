/**
 * 
 */
package tk.acronus.CrazyFeet.Commands;

import java.util.ArrayList;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import tk.acronus.CrazyFeet.CrazyFeet;

/**
 * @author Pete Wicken
 *
 */
public class CrazyFireCommands implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel, String[] args){
		
		final ChatColor yellow = ChatColor.YELLOW;
		final ChatColor red = ChatColor.RED;
		final ArrayList<Player> cFire = CrazyFeet.CrazyFire;
		
		if(args.length < 1) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				if(player.hasPermission("CrazyFeet.crazyfire")) {
					if(cFire.contains(player)) {
						cFire.remove(player);
						player.sendMessage(yellow+"The tingling sensation fades away..");
						return true;
					} else {
						cFire.add(player);
						player.sendMessage(yellow+"You feel a tingling sensation in your feet!");
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
			if(sender.hasPermission("CrazyFeet.crazyfireother")) {
				if(Bukkit.getServer().getPlayer(args[0]) != null) {
					Player targ = Bukkit.getServer().getPlayer(args[0]);
					if(cFire.contains(targ)) {
						cFire.remove(targ);
						targ.sendMessage(yellow+sender.getName()+" has disabled your CrazyFire!");
						sender.sendMessage(yellow+targ.getDisplayName()+"'s CrazyFire has been disabled!");
						return true;
					} else {
						cFire.add(targ);
						targ.sendMessage(yellow+sender.getName()+" has given you CrazyFire!");
						sender.sendMessage(yellow+targ.getDisplayName()+" has been given CrazyFire!");
						return true;
					}
				} else {
					sender.sendMessage(red+"The player "+yellow+args[0]+red+" is either offline or does not exist!");
					return true;
				}
			} else {
				sender.sendMessage(red+"You do not have permission to toggle CrazyFire on others.");
				return true;
			}
		} else if(args.length > 1) {
			sender.sendMessage(red+"Incorrect usage. Use /crazyfeet for help!");
			return true;
		}
		return false;
	}
}
