package tk.acronus.CrazyFeet.Commands.Util;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CrazyFeetCommands implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandlabel, String[] args) {
		
		final ChatColor yellow = ChatColor.YELLOW;
		final ChatColor green = ChatColor.GREEN;
		final ChatColor red = ChatColor.RED;
		final ChatColor purple = ChatColor.DARK_PURPLE;
		
		if(args.length < 1) {
			sender.sendMessage(yellow+"Availiable commands:");
			sender.sendMessage(yellow+"CrazyFeet modes:");
			sender.sendMessage(yellow+"-"+green+" /crazyfire"+yellow+" - Walk on fire!");
			sender.sendMessage(yellow+"-"+green+" /crazynote"+yellow+" - Walk on notes!");
			sender.sendMessage(yellow+"-"+green+" /crazysmoke"+yellow+" - Walk on smoke!");
			sender.sendMessage(yellow+"-"+green+" /crazymagic"+yellow+" - Walk on magic dust!");
			sender.sendMessage(yellow+"-"+green+" /crazypearl"+yellow+" - Walk on pearls!");
			sender.sendMessage(yellow+"CrazyFeet automatic modes:");
			sender.sendMessage(yellow+"These allow you to have the CrazyFeet modes enabled when joining!");
			sender.sendMessage(yellow+"-"+green+" /crazyautofire"+yellow+" - Automatic CrazyFire on server join!");
			sender.sendMessage(yellow+"-"+green+" /crazyautosmoke"+yellow+" - Automatic CrazySmoke on server join!");
			sender.sendMessage(yellow+"-"+green+" /crazyautomagic"+yellow+" - Automatic CrazyMagic on server join!");
			sender.sendMessage(yellow+"-"+green+" /crazyautopearl"+yellow+" - Automatic CrazyPearl on server join!");
			sender.sendMessage(yellow+"-"+green+" /crazyautonote"+yellow+" - Automatic CrazyNote on server join!");
			sender.sendMessage(yellow+"CrazyFeet help:");
			sender.sendMessage(yellow+"-"+green+" /crazyfeet"+yellow+" - Display this menu.");
			sender.sendMessage(yellow+"-"+green+" /crazycheck"+yellow+" - Check what CrazyFeet modes are active!");
			sender.sendMessage(yellow+"-"+green+" /crazydisable"+yellow+" - Disable all of your CrazyFeet modes!");
			sender.sendMessage(yellow+"-"+green+" /crazyautodisable"+yellow+" - Disable all of your automatic CrazyFeet modes!");
			sender.sendMessage(yellow+"-"+green+" /crazyautocheck"+yellow+" - Check what automatic CrazyFeet modes are active!");
			sender.sendMessage(yellow+"-"+green+" /crazyfeet admin"+yellow+" - Displays CrazyFeet admin commands!");
			sender.sendMessage(yellow+"All CrazyFeet mode commands toggle on and off.");
			return true;
		} else if(args.length == 1) {
			if(args[0].equalsIgnoreCase("admin")) {
				if(sender.hasPermission("CrazyFeet.admin")) {
					sender.sendMessage(purple+"CrazyFeet"+yellow+" - By"+green+" PWicks23");
					sender.sendMessage(red+"~ Admin menu ~");
					sender.sendMessage(yellow+"-"+green+" /crazynote <target>"+yellow+" - Toggle Crazynote on target player!");
					sender.sendMessage(yellow+"-"+green+" /crazyfire <target>"+yellow+" - Toggle CrazyFire on target player!");
					sender.sendMessage(yellow+"-"+green+" /crazysmoke <target>"+yellow+" - Toggle CrazySmoke on target player!");
					sender.sendMessage(yellow+"-"+green+" /crazypearl <target>"+yellow+" - Toggle CrazyPearl on target player!");
					sender.sendMessage(yellow+"-"+green+" /crazymagic <target>"+yellow+" - Toggle CrazyMagic on target player!");
					sender.sendMessage(yellow+"-"+green+" /crazycheck <target>"+yellow+" - Check target's CrazyFeet modes!");
					sender.sendMessage(yellow+"-"+green+" /crazyautocheck <target>"+yellow+" - Check target's automatic CrazyFeet modes!");
					sender.sendMessage(yellow+"-"+green+" /crazydisable <target>"+yellow+" - Turn off all CrazyFeet modes on target player!");
					sender.sendMessage(yellow+"-"+green+" /crazydisable *"+yellow+" - Turn off everyone online's CrazyFeet modes!");
					sender.sendMessage(yellow+"-"+green+" /crazyautodisable <target>"+yellow+" - Turn off all automatic CrazyFeet modes on target player!");
					sender.sendMessage(yellow+"-"+green+" /crazyautodisable *"+yellow+" - Turn off everyone online's CrazyFeet modes!");
					return true;
				} else {
					sender.sendMessage(red+"You do not have permission to see this menu.");
					return true;
				}
			} else {
				sender.sendMessage(red+"Command '/crazyfeet "+yellow+args[0]+red+"' was not found.");
				sender.sendMessage(yellow+"Did you mean: ");
				sender.sendMessage(yellow+"'/crazyfeet' - Shows CrazyFeet menu.");
				sender.sendMessage(yellow+"'/crazyfeet admin' - Shows CrazyFeet admin menu.");
				return true;
			}
		} else {
			sender.sendMessage(red+"Incorrect usage. Use /crazyfeet for help!");
		}
		return false;
	}

}
