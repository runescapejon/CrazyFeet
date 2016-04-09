package tk.acronus.CrazyFeet.Commands.Util;

import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import tk.acronus.CrazyFeet.CrazyFeet;

public class CrazyDisableCommands implements CommandExecutor {
	
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel, String[] args){
		
		final ChatColor yellow = ChatColor.YELLOW;
		final ChatColor red = ChatColor.RED;
		final ArrayList<Player> cFire = CrazyFeet.CrazyFire;
		final ArrayList<Player> cHFire = CrazyFeet.CrazyFireHead;
		final ArrayList<Player> cHHeart = CrazyFeet.CrazyHeartHead;
		final ArrayList<Player> cHSmoke = CrazyFeet.CrazySmokeHead;
		final ArrayList<Player> cHMagic = CrazyFeet.CrazyMagicHead;
		final ArrayList<Player> cHnote = CrazyFeet.CrazyNoteHead;
		final ArrayList<Player> cHWitch = CrazyFeet.CrazyWitchHead;
		final ArrayList<Player> cHPearl = CrazyFeet.CrazyPearlHead;
		final ArrayList<Player> cSmoke = CrazyFeet.CrazySmoke;
		final ArrayList<Player> cMagic = CrazyFeet.CrazyMagic;
		final ArrayList<Player> cPearl = CrazyFeet.CrazyPearl;
		final ArrayList<Player> cnote = CrazyFeet.Crazynote;
		final ArrayList<Player> cHeart = CrazyFeet.CrazyHeart;
		final ArrayList<Player> cWitch = CrazyFeet.CrazyWitch;
		
		if(args.length < 1) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				if(player.hasPermission("CrazyFeet.crazyfire.autofire")|player.hasPermission("CrazyFeet.crazyfirehead.autofirehead") ||player.hasPermission("CrazyFeet.crazyhearthead.autohearthead") ||player.hasPermission("CrazyFeet.crazysmokehead.autosmokehead") ||player.hasPermission("CrazyFeet.crazymagichead.automagichead") ||player.hasPermission("CrazyFeet.crazypearlhead.autopearlhead") ||player.hasPermission("CrazyFeet.crazynotehead.autonotehead") ||player.hasPermission("CrazyFeet.crazymagichead.automagichead") || player.hasPermission("CrazyFeet.crazysmoke.autosmoke") || player.hasPermission("CrazyFeet.crazymagic.autoheart") || player.hasPermission("CrazyFeet.crazymagic.autowitch") || player.hasPermission("CrazyFeet.crazymagic.autonote") || player.hasPermission("CrazyFeet.crazymagic.automagic") || player.hasPermission("CrazyFeet.crazypearl.autopearl")) {
					if(cFire.contains(player)) {
						cFire.remove(player);
					} else {
						//return true;
					}
					if(cHFire.contains(player)) {
						cHFire.remove(player);
					} else {
						//return true;
					}
					if(cHHeart.contains(player)) {
						cHHeart.remove(player);
					} else {
						//return true;
					}
					if(cHSmoke.contains(player)) {
						cHSmoke.remove(player);
					} else {
						//return true;
					}
					if(cHPearl.contains(player)) {
						cHPearl.remove(player);
					} else {
						//return true;
					}
					if(cHnote.contains(player)) {
						cHnote.remove(player);
					} else {
						//return true;
					}
					if(cHMagic.contains(player)) {
						cHMagic.remove(player);
					} else {
						//return true;
					}
					if(cHWitch.contains(player)) {
						cHWitch.remove(player);
					} else {
						//return true;
					}
					if(cSmoke.contains(player)) {
						cSmoke.remove(player);
					} else {
						//return true;
					}
					if(cHeart.contains(player)) {
						cHeart.remove(player);
					} else {
						//return true;
					}
					if(cWitch.contains(player)) {
						cWitch.remove(player);
					} else {
						//return true;
					}
					if(cnote.contains(player)) {
						cnote.remove(player);
					} else {
						//return true;
					}
					if(cMagic.contains(player)) {
						cMagic.remove(player);
					} else {
						//return true;
					}
					if(cPearl.contains(player)) {
						cPearl.remove(player);
					} else {
						//return true;
					}
					player.sendMessage(yellow+"All of your CrazyFeet modes have been cleared!");
					return true;
				} else {
					player.sendMessage(red+"No permission");
					return true;
				}
			} else {
				sender.sendMessage(red+"You must be an ingame player to do this!");
				return true;
			}
		} else if (args.length == 1) {
			if(sender.hasPermission("CrazyFeet.disableothers")) {
				if(args[0].equals("*")) {
					for(Player onlinePlayers : Bukkit.getServer().getOnlinePlayers()) {
						if(cFire.contains(onlinePlayers)) {
							cFire.remove(onlinePlayers);
						} else {
							//return true;
						}
						if(cHFire.contains(onlinePlayers)) {
							cHFire.remove(onlinePlayers);
						} else {
							//return true;
						}
						if(cHHeart.contains(onlinePlayers)) {
							cHHeart.remove(onlinePlayers);
						} else {
							//return true;
						}
						if(cHSmoke.contains(onlinePlayers)) {
							cHSmoke.remove(onlinePlayers);
						} else {
							//return true;
						}
						if(cHPearl.contains(onlinePlayers)) {
							cHPearl.remove(onlinePlayers);
						} else {
							//return true;
						}
						if(cHMagic.contains(onlinePlayers)) {
							cHMagic.remove(onlinePlayers);
						} else {
							//return true;
						}
						if(cHnote.contains(onlinePlayers)) {
							cHnote.remove(onlinePlayers);
						} else {
							//return true;
						}
						if(cHWitch.contains(onlinePlayers)) {
							cHWitch.remove(onlinePlayers);
						} else {
							//return true;
						}
						if(cSmoke.contains(onlinePlayers)) {
							cSmoke.remove(onlinePlayers);
						} else {
							//return true;
						}
						if(cnote.contains(onlinePlayers)) {
							cnote.remove(onlinePlayers);
						} else {
							//return true;
						}
						if(cHeart.contains(onlinePlayers)) {
							cHeart.remove(onlinePlayers);
						} else {
							//return true;
						}
						if(cWitch.contains(onlinePlayers)) {
							cWitch.remove(onlinePlayers);
						} else {
							//return true;
						}
						if(cMagic.contains(onlinePlayers)) {
							cMagic.remove(onlinePlayers);
						} else {
							//return true;
						}
						if(cPearl.contains(onlinePlayers)) {
							cPearl.remove(onlinePlayers);
						} else {
							//return true;
						}
						Bukkit.getServer().broadcastMessage(red+sender.getName()+yellow+" has disabled everyone's CrazyFeet modes!");
						return true;
					}
				} else if(Bukkit.getServer().getPlayer(args[0]) != null) {
					Player targ = Bukkit.getServer().getPlayer(args[0]);
					if(cFire.contains(targ)) {
						cFire.remove(targ);
					} else {
						//return true;
					}
					if(cHFire.contains(targ)) {
						cHFire.remove(targ);
					} else {
						//return true;
					}
					if(cHHeart.contains(targ)) {
						cHHeart.remove(targ);
					} else {
						//return true;
					}
					if(cHSmoke.contains(targ)) {
						cHSmoke.remove(targ);
					} else {
						//return true;
					}
					if(cHPearl.contains(targ)) {
						cHPearl.remove(targ);
					} else {
						//return true;
					}
					if(cHMagic.contains(targ)) {
						cHMagic.remove(targ);
					} else {
						//return true;
					}
					if(cHnote.contains(targ)) {
						cHnote.remove(targ);
					} else {
						//return true;
					}
					if(cHWitch.contains(targ)) {
						cHWitch.remove(targ);
					} else {
						//return true;
					}
					if(cSmoke.contains(targ)) {
						cSmoke.remove(targ);
					} else {
						//return true;
					}
					if(cMagic.contains(targ)) {
						cMagic.remove(targ);
					} else {
						//return true;
					}
					if(cHeart.contains(targ)) {
						cHeart.remove(targ);
					} else {
						//return true;
					}
					if(cWitch.contains(targ)) {
						cWitch.remove(targ);
					} else {
						//return true;
					}
					if(cnote.contains(targ)) {
						cnote.remove(targ);
					} else {
						//return true;
					}
					if(cPearl.contains(targ)) {
						cPearl.remove(targ);
					} else {
						//return true;
					}
					targ.sendMessage(yellow+"All of your CrazyFeet modes have been cleared by "+sender.getName()+"!");
					sender.sendMessage(yellow+"All of "+targ.getDisplayName()+"'s CrazyFeet modes have been cleared!");
					return true;
				} else {
					sender.sendMessage(red+"The player "+yellow+args[0]+red+" is either offline or does not exist!");
					return true;
				}
			} else {
				sender.sendMessage(red+"You do not have permission to disable other people's CrazyFeet modes!");
				return true;
			}
		} else {
			sender.sendMessage(red+"Incorrect usage. Use /crazyfeet for help!");
			return true;
		}
		return false;
	}
}
