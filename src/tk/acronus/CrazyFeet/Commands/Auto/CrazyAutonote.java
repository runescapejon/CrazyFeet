package tk.acronus.CrazyFeet.Commands.Auto;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import tk.acronus.CrazyFeet.CrazyFeet;

public class CrazyAutonote implements CommandExecutor {

	private CrazyFeet p;
	
	public CrazyAutonote(CrazyFeet instance) {
		p = instance;
	}
	

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		ChatColor yellow = ChatColor.YELLOW;
		ChatColor red = ChatColor.RED;
		
		if(args.length < 1) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				if(player.hasPermission("CrazyFeet.crazynote.autonote")) {
					if(p.getAnotePlayers().contains(player.getName())) {
						p.getAnotePlayers().remove(player);
						p.getAnotePlayers().saveAutonotePlayers();
						player.sendMessage(yellow+"You will no longer have "+red+"Crazynote "+yellow+"enabled when joining!");
						return true;
					} else {
						p.getAnotePlayers().add(player);
						p.getAnotePlayers().saveAutonotePlayers();
						player.sendMessage(yellow+"You will now have "+red+"CrazyNote "+yellow+"enabled when joining!");
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
			if(sender.hasPermission("CrazyFeet.crazynote.autonoteother")) {
				if(Bukkit.getServer().getPlayer(args[0]) != null) {
					Player targ = Bukkit.getServer().getPlayer(args[0]);
					if(p.getAnotePlayers().contains(targ.getName())) {
						p.getAnotePlayers().remove(targ);
						p.getAnotePlayers().saveAutonotePlayers();
						targ.sendMessage(red+sender.getName()+yellow+" has enabled automatic "+red+"Crazynote"+yellow+" on you when you join!");
						sender.sendMessage(red+targ.getDisplayName()+yellow+" now has automatic "+red+"Crazynote"+yellow+" when they join.");
						return true;
					} else {
						p.getAnotePlayers().remove(targ);
						p.getAnotePlayers().saveAutonotePlayers();
						targ.sendMessage(red+sender.getName()+yellow+" has disabled automatic "+red+"Crazynote"+yellow+" on you when you join!");
						sender.sendMessage(red+targ.getDisplayName()+yellow+" no longer has automatic "+red+"Crazynote"+yellow+" when they join.");
						return true;
					}
				} else {
					sender.sendMessage(red+"The player "+yellow+args[0]+red+" is either offline or does not exist!");
					return true;
				}
			} else {
				sender.sendMessage(red+"No permission");
				return true;
			}
		} else {
			sender.sendMessage(red+"Incorrect usage. Use /crazyfeet for help!");
			return true;
		}
	}
}