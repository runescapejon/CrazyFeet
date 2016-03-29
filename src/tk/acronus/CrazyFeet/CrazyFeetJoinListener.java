/**
 * 
 */
package tk.acronus.CrazyFeet;


import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import tk.acronus.CrazyFeet.Util.Files.CrazyAutoFireFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoMagicFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoPearlFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoSmokeFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutonoteFile;


public class CrazyFeetJoinListener implements Listener {
	
	ChatColor green = ChatColor.GREEN;
	
	@EventHandler
	public void onCrazyFireJoin(PlayerJoinEvent pJE) {	
		Player player = pJE.getPlayer();	
		if(CrazyAutoFireFile.cFPlayers.contains(player.getName())) {
			CrazyFeet.CrazyFire.add(player);
			player.sendMessage(green+"You have joined the game with automatic CrazyFire. To disable this, type /crazyautofire");
		} else {
			//doNothing
		}
	}
	
	@EventHandler
	public void onCrazySmokeJoin(PlayerJoinEvent pJE) {
		Player player = pJE.getPlayer();	
		if(CrazyAutoSmokeFile.cSPlayers.contains(player.getName())) {
			CrazyFeet.CrazySmoke.add(player);
			player.sendMessage(green+"You have joined the game with automatic CrazySmoke. To disable this, type /crazyautosmoke");
		} else {
			//doNothing
		}
	}
	
	@EventHandler
	public void onCrazyPearlJoin(PlayerJoinEvent pJE) {
		Player player = pJE.getPlayer();
		if(CrazyAutoPearlFile.cPPlayers.contains(player.getName())) {
			CrazyFeet.CrazyPearl.add(player);
			player.sendMessage(green+"You have joined the game with automatic CrazyPearl. To disable this, type /crazyautopearl");
		} else {
			//doNothing
		}
	}
	
	@EventHandler
	public void onCrazynoteJoin(PlayerJoinEvent pJE) {
		Player player = pJE.getPlayer();
		if(CrazyAutonoteFile.cNPlayers.contains(player.getName())) {
			CrazyFeet.Crazynote.add(player);
			player.sendMessage(green+"You have joined the game with automatic CrazyNote. To disable this, type /crazyautonote");
		} else {
			//doNothing
		}
	}
	
	@EventHandler
	public void onCrazyMagicJoin(PlayerJoinEvent pJE) {
		Player player = pJE.getPlayer();
		if(CrazyAutoMagicFile.cMPlayers.contains(player.getName())) {
			CrazyFeet.CrazyMagic.add(player);
			player.sendMessage(green+"You have joined the game with automatic CrazyMagic. To disable this, type /crazyautomagic");
		} else {
			//doNothing
		}
	}
}
