/**
 * 
 */
package tk.acronus.CrazyFeet.Commands.Auto;


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
public class CrazyAutoMagic implements CommandExecutor {

	private CrazyFeet p;
	
	public CrazyAutoMagic(CrazyFeet instance) {
		p = instance;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		ChatColor yellow = ChatColor.YELLOW;
		ChatColor red = ChatColor.RED;
		
		if(args.length < 1) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				if(player.hasPermission("CrazyFeet.crazymagic.automagic")) {
					if(p.getAMagicPlayers().contains(player.getName())) {
						p.getAMagicPlayers().remove(player);
						p.getAMagicPlayers().saveAutoMagicPlayers();
						player.sendMessage(yellow+"You will no longer have "+red+"CrazyMagic "+yellow+"enabled when joining!");
						return true;
					} else {
						p.getAMagicPlayers().add(player);
						p.getAMagicPlayers().saveAutoMagicPlayers();
						player.sendMessage(yellow+"You will now have "+red+"CrazyMagic "+yellow+"enabled when joining!");
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
			if(sender.hasPermission("CrazyFeet.crazymagic.automagicother")) {
				if(Bukkit.getServer().getPlayer(args[0]) != null) {
					Player targ = Bukkit.getServer().getPlayer(args[0]);
					if(p.getAMagicPlayers().contains(targ.getName())) {
						p.getAMagicPlayers().remove(targ);
						p.getAMagicPlayers().saveAutoMagicPlayers();
						targ.sendMessage(red+sender.getName()+yellow+" has enabled automatic "+red+"CrazyMagic"+yellow+" on you when you join!");
						sender.sendMessage(red+targ.getDisplayName()+yellow+" now has automatic "+red+"CrazyMagic"+yellow+" when they join.");
						return true;
					} else {
						p.getAMagicPlayers().remove(targ);
						p.getAMagicPlayers().saveAutoMagicPlayers();
						targ.sendMessage(red+sender.getName()+yellow+" has disabled automatic "+red+"CrazyMagic"+yellow+" on you when you join!");
						sender.sendMessage(red+targ.getDisplayName()+yellow+" no longer has automatic "+red+"CrazyMagic"+yellow+" when they join.");
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
