package tk.acronus.CrazyFeet.Commands.Auto;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import tk.acronus.CrazyFeet.CrazyFeet;

public class CrazyAutoFireHead implements CommandExecutor {
	
	private CrazyFeet p;
	
	public CrazyAutoFireHead(CrazyFeet instance) {
		p = instance;
	}
	

	public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel, String[] args){
		
		ChatColor yellow = ChatColor.YELLOW;
		ChatColor red = ChatColor.RED;
		
		if(args.length < 1) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				if(player.hasPermission("CrazyFeet.crazyfirehead.autofirehead")) {
					if(p.getAFireheadPlayers().contains(player.getName())) {
						p.getAFireheadPlayers().remove(player);
						p.getAFireheadPlayers().saveAutoFireHeadPlayers();
						player.sendMessage(yellow+"You will no longer have "+red+"CrazyFireHead "+yellow+"enabled when joining!");
						return true;
					} else {
						p.getAFireheadPlayers().add(player);
						p.getAFireheadPlayers().saveAutoFireHeadPlayers();
						player.sendMessage(yellow+"You will now have "+red+"CrazyFireHead "+yellow+"enabled when joining!");
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
			if(sender.hasPermission("CrazyFeet.crazyfirehead.autofireheadother")) {
				if(Bukkit.getServer().getPlayer(args[0]) != null) {
					Player targ = Bukkit.getServer().getPlayer(args[0]);
					if(p.getAFireheadPlayers().contains(targ.getName())) {
						p.getAFireheadPlayers().remove(targ);
						p.getAFireheadPlayers().saveAutoFireHeadPlayers();
						targ.sendMessage(red+sender.getName()+yellow+" has enabled automatic "+red+"CrazyFire"+yellow+" on you when you join!");
						sender.sendMessage(red+targ.getDisplayName()+yellow+" now has automatic "+red+"CrazyFire"+yellow+" when they join.");
						return true;
					} else {
						p.getAFireheadPlayers().remove(targ);
						p.getAFireheadPlayers().saveAutoFireHeadPlayers();
						targ.sendMessage(red+sender.getName()+yellow+" has disabled automatic "+red+"CrazyFire"+yellow+" on you when you join!");
						sender.sendMessage(red+targ.getDisplayName()+yellow+" no longer has automatic "+red+"CrazyFire"+yellow+" when they join.");
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
