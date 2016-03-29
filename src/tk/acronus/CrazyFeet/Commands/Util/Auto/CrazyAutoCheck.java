/**
 * 
 */
package tk.acronus.CrazyFeet.Commands.Util.Auto;

import java.util.ArrayList;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import tk.acronus.CrazyFeet.Util.Files.CrazyAutoFireFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoMagicFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoPearlFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoSmokeFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutonoteFile;

/**
 * @author Pete Wicken
 *
 */
public class CrazyAutoCheck implements CommandExecutor {
	
	ChatColor red = ChatColor.RED;
	ChatColor yellow = ChatColor.YELLOW;
	
	private final ArrayList<String> cFPlayers = CrazyAutoFireFile.cFPlayers;
	private final ArrayList<String> cSPlayers = CrazyAutoSmokeFile.cSPlayers;
	private final ArrayList<String> cPPlayers = CrazyAutoPearlFile.cPPlayers;
	private final ArrayList<String> cMPlayers = CrazyAutoMagicFile.cMPlayers;
	private final ArrayList<String> cNPlayers = CrazyAutonoteFile.cNPlayers;
	
	public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel, String[] args){
		if(args.length < 1) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				if(player.hasPermission("CrazyFeet.crazyfire.autofire") || player.hasPermission("CrazyFeet.crazysmoke.autosmoke") || player.hasPermission("CrazyFeet.crazymagic.automagic") || player.hasPermission("CrazyFeet.crazypearl.autopearl")) {
					player.sendMessage(yellow+"Active Automatic CrazyFeet modes:");
					if(cFPlayers.contains(player.getName())) {
						player.sendMessage("- CrazyFire");
					} else {
						//return true;
					}
					if(cSPlayers.contains(player.getName())) {
						player.sendMessage("- CrazySmoke");
					} else {
						//return true;
					}
					if(cNPlayers.contains(player.getName())) {
						player.sendMessage("- Crazynote");
					} else {
						//return true;
					}
					if(cMPlayers.contains(player.getName())) {
						player.sendMessage("- CrazyMagic");
					} else {
						//return true;
					}
					if(cPPlayers.contains(player.getName())) {
						player.sendMessage("- CrazyPearl");
					} else {
						//return true;
					}
					if(!cFPlayers.contains(player.getName()) && !cSPlayers.contains(player.getName()) && !cMPlayers.contains(player.getName()) && !cPPlayers.contains(player.getName())) {
						player.sendMessage(red+"You do not have any automatic CrazyFeet modes currently activated. Type /crazyfeet for information.");
						return true;
					} else {
						//return true;
					}
				} else {
					player.sendMessage(red+"No permission");
					return true;
				}
			}
		} else if(args.length == 1) {
			if(sender.hasPermission("CrazyFeet.checkothers.autocheck")) {
				if(Bukkit.getServer().getPlayer(args[0]) != null) {
					Player targ = Bukkit.getServer().getPlayer(args[0]);
					sender.sendMessage(yellow+targ.getDisplayName()+"'s active automatic CrazyFeet modes:");
					if(cFPlayers.contains(targ.getName())) {
						sender.sendMessage("- CrazyFire");
					} else {
						//return true;
					}
					if(cSPlayers.contains(targ.getName())) {
						sender.sendMessage("- CrazySmoke");
					} else {
						//return true;
					}
					if(cNPlayers.contains(targ.getName())) {
						sender.sendMessage("- Crazynote");
					} else {
						//return true;
					}
					if(cMPlayers.contains(targ.getName())) {
						sender.sendMessage("- CrazyMagic");
					} else {
						//return true;
					}
					if(cPPlayers.contains(targ.getName())) {
						sender.sendMessage("- CrazyPearl");
					} else {
						//return true;
					}
					if(!cFPlayers.contains(targ.getName()) && !cSPlayers.contains(targ.getName()) && !cMPlayers.contains(targ.getName()) && !cPPlayers.contains(targ.getName())) {
						sender.sendMessage(red+targ.getDisplayName()+" does not have any automatic CrazyFeet modes currently activated.");
						return true;
					} else {
						//return true;
					}
				} else {
					sender.sendMessage(red+"The player "+yellow+args[0]+red+" is either offline or does not exist!");
					return true;
				}
			} else {
				sender.sendMessage(red+"You do not have permission to check other people's automatic CrazyFeet modes!");
				return true;
			}
		} else {
			sender.sendMessage(red+"Incorrect usage. Use /crazyfeet for help!");
			return true;
		}
		return false;
	}
}