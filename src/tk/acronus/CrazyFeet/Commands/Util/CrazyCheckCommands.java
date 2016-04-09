package tk.acronus.CrazyFeet.Commands.Util;

import java.util.ArrayList;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import tk.acronus.CrazyFeet.CrazyFeet;

public class CrazyCheckCommands implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String commandlabel, String[] args) {
		
		final ChatColor yellow = ChatColor.YELLOW;
		final ChatColor red = ChatColor.RED;
		final ArrayList<Player> cFire = CrazyFeet.CrazyFire;
		final ArrayList<Player> cHFire = CrazyFeet.CrazyFireHead;
		final ArrayList<Player> cHHeart = CrazyFeet.CrazyHeartHead;
		final ArrayList<Player> cHMagic = CrazyFeet.CrazyMagicHead;
		final ArrayList<Player> cHNote = CrazyFeet.CrazyNoteHead;
		final ArrayList<Player> cHWitch = CrazyFeet.CrazyWitchHead;
		final ArrayList<Player> cHSmoke = CrazyFeet.CrazySmokeHead;
		final ArrayList<Player> cHPearl = CrazyFeet.CrazyPearlHead;
		final ArrayList<Player> cSmoke = CrazyFeet.CrazySmoke;
		final ArrayList<Player> cMagic = CrazyFeet.CrazyMagic;
		final ArrayList<Player> cPearl = CrazyFeet.CrazyPearl;
		final ArrayList<Player> cnote = CrazyFeet.Crazynote;
		final ArrayList<Player> cHeart = CrazyFeet.Crazynote;
		
		if(args.length < 1) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				if(player.hasPermission("CrazyFeet.crazyfire") |player.hasPermission("CrazyFeet.crazyfirehead") ||player.hasPermission("CrazyFeet.crazysmokehead") ||player.hasPermission("CrazyFeet.crazypearlhead") ||player.hasPermission("CrazyFeet.crazysmokehead") ||player.hasPermission("CrazyFeet.crazynotehead") ||player.hasPermission("CrazyFeet.crazymagichead") ||player.hasPermission("CrazyFeet.crazyhearthead") || player.hasPermission("CrazyFeet.crazysmoke") || player.hasPermission("CrazyFeet.crazymagic") || player.hasPermission("CrazyFeet.crazypearl")) {
					player.sendMessage(yellow+"Active CrazyFeet modes:");
					if(cFire.contains(player)) {
						player.sendMessage("- CrazyFire");
					} else {
						//return true;
					}
					if(cHFire.contains(player)) {
						player.sendMessage("- CrazyFireHead");
					} else {
						//return true;
					}
					if(cHHeart.contains(player)) {
						player.sendMessage("- CrazyHeartHead");
					} else {
						//return true;
					}
					if(cHSmoke.contains(player)) {
						player.sendMessage("- CrazySmokeHead");
					} else {
						//return true;
					}
					if(cHWitch.contains(player)) {
						player.sendMessage("- CrazyWitchHead");
					} else {
						//return true;
					}
					if(cHPearl.contains(player)) {
						player.sendMessage("- CrazyPearlHead");
					} else {
						//return true;
					}
					if(cHNote.contains(player)) {
						player.sendMessage("- CrazyNoteHead");
					} else {
						//return true;
					}
					if(cHMagic.contains(player)) {
						player.sendMessage("- CrazyMagicHead");
					} else {
						//return true;
					}
					if(cSmoke.contains(player)) {
						player.sendMessage("- CrazySmoke");
					} else {
						//return true;
					}
					if(cHeart.contains(player)) {
						player.sendMessage("- CrazyHeart");
					} else {
						//return true;
					}
					if(cMagic.contains(player)) {
						player.sendMessage("- CrazyMagic");
					} else {
						//return true;
					}
					if(cnote.contains(player)) {
						player.sendMessage("- Crazynote");
					} else {
						//return true;
					}
					if(cPearl.contains(player)) {
						player.sendMessage("- CrazyPearl");
					} else {
						//return true;
					}
					if(!cFire.contains(player) && !cSmoke.contains(player) && !cMagic.contains(player) && !cPearl.contains(player)) {
						player.sendMessage(red+"You do not have any CrazyFeet modes currently activated. Type /crazyfeet for information.");
						return true;
					} else {
						//return true;
					}
				} else {
					player.sendMessage(red+"No permission");
					return true;
				}
			} else {
				sender.sendMessage(red+"You must be an ingame player to do this!");
				return true;
			}
		} else if(args.length == 1) {
			if(sender.hasPermission("CrazyFeet.checkothers")) {
				if(Bukkit.getServer().getPlayer(args[0]) != null) {
					Player targ = Bukkit.getServer().getPlayer(args[0]);
					sender.sendMessage(yellow+targ.getDisplayName()+"'s active CrazyFeet modes:");
					if(cFire.contains(targ)) {
						sender.sendMessage("- CrazyFire");
					} else {
						//return true;
					}
					if(cHFire.contains(targ)) {
						sender.sendMessage("- CrazyFireHead");
					} else {
						//return true;
					}
					if(cHHeart.contains(targ)) {
						sender.sendMessage("- CrazyHeartHead");
					} else {
						//return true;
					}
					if(cHSmoke.contains(targ)) {
						sender.sendMessage("- CrazySmokeHead");
					} else {
						//return true;
					}
					if(cHPearl.contains(targ)) {
						sender.sendMessage("- CrazyPearlHead");
					} else {
						//return true;
					}
					if(cHMagic.contains(targ)) {
						sender.sendMessage("- CrazyMagicHead");
					} else {
						//return true;
					}
					if(cHNote.contains(targ)) {
						sender.sendMessage("- CrazyNoteHead");
					} else {
						//return true;
					}
					if(cHWitch.contains(targ)) {
						sender.sendMessage("- CrazyWitchHead");
					} else {
						//return true;
					}
					if(cSmoke.contains(targ)) {
						sender.sendMessage("- CrazySmoke");
					} else {
						//return true;
					}
					if(cMagic.contains(targ)) {
						sender.sendMessage("- CrazyMagic");
					} else {
						//return true;
					}
					if(cnote.contains(targ)) {
						sender.sendMessage("- Crazynote");
					} else {
						//return true;
					}
					if(cHeart.contains(targ)) {
						sender.sendMessage("- CrazyHeart");
					} else {
						//return true;
					}
					if(cPearl.contains(targ)) {
						sender.sendMessage("- CrazyPearl");
					} else {
						//return true;
					}
					if(!cFire.contains(targ) && !cSmoke.contains(targ) && !cMagic.contains(targ) && !cPearl.contains(targ)) {
						sender.sendMessage(targ.getDisplayName()+" does not have any CrazyFeet modes currently activated.");
						return true;
					} else {
						//return true;
					}
				} else {
					sender.sendMessage(red+"The player "+yellow+args[0]+red+" is either offline or does not exist!");
					return true;
				}
			} else {
				sender.sendMessage(red+"You do not have permission to check other people's CrazyFeet modes!");
				return true;
			}
		} else {
			sender.sendMessage(red+"Incorrect usage. Use /crazyfeet for help!");
			return true;
		}
		return false;
	}
}
