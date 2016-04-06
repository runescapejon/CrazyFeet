package tk.acronus.CrazyFeet;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class CrazyFeetListener implements Listener {

	ChatColor green = ChatColor.GREEN;

	@EventHandler
	public void onCrazyFireMove(PlayerMoveEvent pME) {
		
		Player player = pME.getPlayer();
		
		if(CrazyFeet.CrazyFire.contains(player)) {
			
			Location to = pME.getTo();
			Location from = pME.getFrom();
			Location loc = player.getLocation();
			
			if(to.getX() != from.getBlockX() || to.getY() != from.getY() || to.getZ() != from.getZ()) {
				loc.setY(loc.getY()-1);
				player.getWorld().playEffect(loc, Effect.MOBSPAWNER_FLAMES, 1, 100);
			} else {
				pME.setCancelled(false);
			}
		} else {
			pME.setCancelled(false);
		}
	}

	@EventHandler
	public void onCrazySmokeMove(PlayerMoveEvent pME) {
		
		Player player = pME.getPlayer();
		
		if(CrazyFeet.CrazySmoke.contains(player)) {
			
			Location to = pME.getTo();
			Location from = pME.getFrom();
			Location loc = player.getLocation();
			
			if(to.getX() != from.getBlockX() || to.getY() != from.getY() || to.getZ() != from.getZ()) {
				loc.setY(loc.getY());
				player.getWorld().playEffect(loc, Effect.SMOKE, 1, 100);
			} else {
				pME.setCancelled(false);
			}
		} else {
			pME.setCancelled(false);
		}
	}

	@EventHandler
	public void onCrazyMagicMove(PlayerMoveEvent pME) {
		
		Player player = pME.getPlayer();
		
		if(CrazyFeet.CrazyMagic.contains(player)) {
			
			Location to = pME.getTo();
			Location from = pME.getFrom();
			Location loc = player.getLocation();
			
			if(to.getX() != from.getBlockX() || to.getY() != from.getY() || to.getZ() != from.getZ()) {
				loc.setY(loc.getY());
				player.getWorld().playEffect(loc, Effect.POTION_SWIRL, 1, 100);
			} else {
				pME.setCancelled(false);
			}
		} else {
			pME.setCancelled(false);
		}
	}

	@EventHandler
	public void onCrazynoteMove(PlayerMoveEvent pME) {
		
		Player player = pME.getPlayer();
		
		if(CrazyFeet.Crazynote.contains(player)) {
			
			Location to = pME.getTo();
			Location from = pME.getFrom();
			Location loc = player.getLocation();
			
			if(to.getX() != from.getBlockX() || to.getY() != from.getY() || to.getZ() != from.getZ()) {
				loc.setY(loc.getY());
				player.getWorld().playEffect(loc, Effect.NOTE, 10);
			} else {
				pME.setCancelled(false);
			}
		} else {
			pME.setCancelled(false);
		}
	}

	@EventHandler
	public void onCrazyWitchMove(PlayerMoveEvent pME) {
		
		Player player = pME.getPlayer();
		
		if(CrazyFeet.CrazyWitch.contains(player)) {
			
			Location to = pME.getTo();
			Location from = pME.getFrom();
			Location loc = player.getLocation();
			
			if(to.getX() != from.getBlockX() || to.getY() != from.getY() || to.getZ() != from.getZ()) {
				loc.setY(loc.getY());
				player.getWorld().playEffect(loc, Effect.WITCH_MAGIC, 10);
			} else {
				pME.setCancelled(false);
			}
		} else {
			pME.setCancelled(false);
		}
	}

	@EventHandler
	public void onCrazyHeartMove(PlayerMoveEvent pME) {
		
		Player player = pME.getPlayer();
		
		if(CrazyFeet.CrazyHeart.contains(player)) {
			
			Location to = pME.getTo();
			Location from = pME.getFrom();
			Location loc = player.getLocation();
			
			if(to.getX() != from.getBlockX() || to.getY() != from.getY() || to.getZ() != from.getZ()) {
				loc.setY(loc.getY());
				player.getWorld().playEffect(loc, Effect.HEART, 10);
			} else {
				pME.setCancelled(false);
			}
		} else {
			pME.setCancelled(false);
		}
	}

	@EventHandler
	public void onCrazyPearlMove(PlayerMoveEvent pME) {
		
		Player player = pME.getPlayer();
		
		if(CrazyFeet.CrazyPearl.contains(player)) {
			
			Location to = pME.getTo();
			Location from = pME.getFrom();
			Location loc = player.getLocation();
			
			if(to.getX() != from.getBlockX() || to.getY() != from.getY() || to.getZ() != from.getZ()) {
				loc.setY(loc.getY());
				player.getWorld().playEffect(loc, Effect.ENDER_SIGNAL, 1, 100);
			} else {
				pME.setCancelled(false);
			}
		} else {
			pME.setCancelled(false);
		}
	}
}
