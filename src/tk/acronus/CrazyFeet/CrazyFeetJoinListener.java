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
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoWitchFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoHeartFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoFireHeadFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoHeartHeadFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoMagicHeadFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoNoteHeadFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoWitchHeadFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoSmokeHeadFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoPearlHeadFile;


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
	public void onCrazyHeartHeadJoin(PlayerJoinEvent pJE) {	
		Player player = pJE.getPlayer();	
		if(CrazyAutoHeartHeadFile.cHHPlayers.contains(player.getName())) {
			CrazyFeet.CrazyHeartHead.add(player);
			player.sendMessage(green+"You have joined the game with automatic CrazyheartHead. To disable this, type /crazyautohearthead");
		} else {
			//doNothing
		}
	}

	@EventHandler
	public void onCrazyPearlHeadJoin(PlayerJoinEvent pJE) {	
		Player player = pJE.getPlayer();	
		if(CrazyAutoPearlHeadFile.cPHPlayers.contains(player.getName())) {
			CrazyFeet.CrazyPearlHead.add(player);
			player.sendMessage(green+"You have joined the game with automatic CrazyPaerlHead. To disable this, type /crazyautopearlhead");
		} else {
			//doNothing
		}
	}
	
	@EventHandler
	public void onCrazyMagicHeadJoin(PlayerJoinEvent pJE) {	
		Player player = pJE.getPlayer();	
		if(CrazyAutoMagicHeadFile.cMHPlayers.contains(player.getName())) {
			CrazyFeet.CrazyMagicHead.add(player);
			player.sendMessage(green+"You have joined the game with automatic CrazyMagicHead. To disable this, type /crazyautomagichead");
		} else {
			//doNothing
		}
	}

	@EventHandler
	public void onCrazyNoteHeadJoin(PlayerJoinEvent pJE) {	
		Player player = pJE.getPlayer();	
		if(CrazyAutoNoteHeadFile.cNHPlayers.contains(player.getName())) {
			CrazyFeet.CrazyNoteHead.add(player);
			player.sendMessage(green+"You have joined the game with automatic CrazyNoteHead. To disable this, type /crazyautonotehead");
		} else {
			//doNothing
		}
	}
	
	@EventHandler
	public void onCrazySmokeHeadJoin(PlayerJoinEvent pJE) {	
		Player player = pJE.getPlayer();	
		if(CrazyAutoSmokeHeadFile.cSHPlayers.contains(player.getName())) {
			CrazyFeet.CrazySmokeHead.add(player);
			player.sendMessage(green+"You have joined the game with automatic CrazySmokeHead. To disable this, type /crazyautosmokehead");
		} else {
			//doNothing
		}
	}
	
	@EventHandler
	public void onCrazyWitchHeadJoin(PlayerJoinEvent pJE) {	
		Player player = pJE.getPlayer();	
		if(CrazyAutoWitchHeadFile.cWHPlayers.contains(player.getName())) {
			CrazyFeet.CrazyWitchHead.add(player);
			player.sendMessage(green+"You have joined the game with automatic CrazywitchHead. To disable this, type /crazyautowitchhead");
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