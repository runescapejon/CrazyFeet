package tk.acronus.CrazyFeet.Commands.Util;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CrazyAutoHeadCommands implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandlabel, String[] args) {
		
		final ChatColor yellow = ChatColor.YELLOW;
		final ChatColor green = ChatColor.GREEN;
		final ChatColor red = ChatColor.RED;
		
		if(args.length < 1) {
			if(sender.hasPermission("crazyFeet.autohead")) {
			sender.sendMessage(yellow+"CrazyFeet automatic modes:");
			sender.sendMessage(yellow+"These allow you to have the CrazyFeet modes enabled when joining!");
			sender.sendMessage(yellow+"-"+green+" /crazyautofirehead"+yellow+" - Automatic CrazyFireHead on server join!");
			sender.sendMessage(yellow+"-"+green+" /crazyautohearthead"+yellow+" - Automatic CrazyHeartHead on server join!");
			sender.sendMessage(yellow+"-"+green+" /crazyautosmokehead"+yellow+" - Automatic CrazySmokeHead on server join!");
			sender.sendMessage(yellow+"-"+green+" /crazyautomagichead"+yellow+" - Automatic CrazyMagicHead on server join!");
			sender.sendMessage(yellow+"-"+green+" /crazyautopearlhead"+yellow+" - Automatic CrazyPearlHead on server join!");
			sender.sendMessage(yellow+"-"+green+" /crazyautonotehead"+yellow+" - Automatic CrazyNoteHead on server join!");
			sender.sendMessage(yellow+"-"+green+" /crazyautowitchhead"+yellow+" - Automatic CrazyWitchHead on server join!");
			return true;
		} else {
			sender.sendMessage(red+"You do not have permission to see this menu.");
			return true;
			}
	}
		return false;	
  }
}