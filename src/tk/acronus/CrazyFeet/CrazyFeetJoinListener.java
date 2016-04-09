package tk.acronus.CrazyFeet;


import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import tk.acronus.CrazyFeet.Util.Files.CrazyAutoFireFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoFireHeadFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoMagicFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoPearlFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoSmokeFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutonoteFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoWitchFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoHeartFile;


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
	public void onCrazyFireHeadJoin(PlayerJoinEvent pJE) {	
		Player player = pJE.getPlayer();	
		if(CrazyAutoFireHeadFile.cFHPlayers.contains(player.getName())) {
			CrazyFeet.CrazyFireHead.add(player);
			player.sendMessage(green+"You have joined the game with automatic CrazyFirehaed. To disable this, type /crazyautofirehead");
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
	public void onCrazyHeartJoin(PlayerJoinEvent pJE) {
		Player player = pJE.getPlayer();
		if(CrazyAutoHeartFile.HPPPlayers.contains(player.getName())) {
			CrazyFeet.CrazyHeart.add(player);
			player.sendMessage(green+"You have joined the game with automatic CrazyHeart. To disable this, type /crazyautoheart");
		} else {
			//doNothing
		}
	}

	@EventHandler
	public void onCrazyWitchJoin(PlayerJoinEvent pJE) {
		Player player = pJE.getPlayer();
		if(CrazyAutoWitchFile.cWPlayers.contains(player.getName())) {
			CrazyFeet.CrazyWitch.add(player);
			player.sendMessage(green+"You have joined the game with automatic CrazyWitch. To disable this, type /crazyautowitch");
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
