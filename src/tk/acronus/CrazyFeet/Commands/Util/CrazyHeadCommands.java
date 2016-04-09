package tk.acronus.CrazyFeet.Commands.Util;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CrazyHeadCommands implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandlabel, String[] args) {
		
		final ChatColor yellow = ChatColor.YELLOW;
		final ChatColor green = ChatColor.GREEN;
		final ChatColor aqua = ChatColor.AQUA;
		final ChatColor red = ChatColor.RED;
		
		if(args.length < 1) {
				if(sender.hasPermission("crazyFeet.head")) {
					sender.sendMessage(aqua+"~ head menu ~");
					sender.sendMessage(yellow+"-"+green+" /crazynotehead "+yellow+" - Toggle CrazyNoteHead above your head!!");
					sender.sendMessage(yellow+"-"+green+" /crazyfirehead "+yellow+" - Toggle CrazyFireHead above your head!!");
					sender.sendMessage(yellow+"-"+green+" /crazysmokehead "+yellow+" - Toggle CrazySmokeHead above your head!!");
					sender.sendMessage(yellow+"-"+green+" /crazypearlhead "+yellow+" - Toggle CrazyPearlHead above your head!!");
					sender.sendMessage(yellow+"-"+green+" /crazymagichead "+yellow+" - Toggle CrazyMagicHead above your head!!");
					sender.sendMessage(yellow+"-"+green+" /crazywitchhead "+yellow+" - Toggle CrazyWitchHead on target player!");
					sender.sendMessage(yellow+"-"+green+" /crazyhearthead "+yellow+" - Toggle CrazyHeartHead on target player!");
					sender.sendMessage(yellow+"-"+green+" /crazydisable "+yellow+" - Turn off all Particles modes!");
					return true;
				} else {
					sender.sendMessage(red+"You do not have permission to see this menu.");
					return true;
		}
			}
			return false;
	}
}