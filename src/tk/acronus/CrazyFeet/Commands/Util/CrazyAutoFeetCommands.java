package tk.acronus.CrazyFeet.Commands.Util;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CrazyAutoFeetCommands implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandlabel, String[] args) {
		
		final ChatColor yellow = ChatColor.YELLOW;
		final ChatColor green = ChatColor.GREEN;
		final ChatColor red = ChatColor.RED;
		
		if(args.length < 1) {
			if(sender.hasPermission("crazyFeet.autofeet")) {
			sender.sendMessage(yellow+"CrazyFeet automatic modes:");
			sender.sendMessage(yellow+"These allow you to have the CrazyFeet modes enabled when joining!");
			sender.sendMessage(yellow+"-"+green+" /crazyautofire"+yellow+" - Automatic CrazyFire on server join!");
			sender.sendMessage(yellow+"-"+green+" /crazyautoheart"+yellow+" - Automatic CrazyHeart on server join!");
			sender.sendMessage(yellow+"-"+green+" /crazyautosmoke"+yellow+" - Automatic CrazySmoke on server join!");
			sender.sendMessage(yellow+"-"+green+" /crazyautomagic"+yellow+" - Automatic CrazyMagic on server join!");
			sender.sendMessage(yellow+"-"+green+" /crazyautopearl"+yellow+" - Automatic CrazyPearl on server join!");
			sender.sendMessage(yellow+"-"+green+" /crazyautonote"+yellow+" - Automatic CrazyNote on server join!");
			sender.sendMessage(yellow+"-"+green+" /crazyautowitch"+yellow+" - Automatic CrazyWitch on server join!");
			return true;
		} else {
			sender.sendMessage(red+"You do not have permission to see this menu.");
			return true;
			}
	}
		return false;	
  }
}