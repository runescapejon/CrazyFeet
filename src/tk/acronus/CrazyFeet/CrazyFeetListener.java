package tk.acronus.CrazyFeet;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class CrazyFeetListener implements Listener {

	ChatColor green = ChatColor.GREEN;

	@EventHandler
	public void onCrazyFireMove1(PlayerMoveEvent pME) {
		
		Player player = pME.getPlayer();
		
		if(CrazyFeet.CrazyFireHead.contains(player)) {
			
				player.getWorld().playEffect(player.getEyeLocation().add(0, 0.8, 0), Effect.MOBSPAWNER_FLAMES, 1);
			}  
		}

	@EventHandler
	public void onCrazyHeartHeadMove(PlayerMoveEvent pME) {
		
		Player player = pME.getPlayer();
		
		if(CrazyFeet.CrazyHeartHead.contains(player)) {
			
				player.getWorld().spawnParticle(Particle.HEART, player.getEyeLocation().add(0, 0.8, 0), 1 );
			} 
		}
	
	@EventHandler
	public void onCrazyMagicHeadMove(PlayerMoveEvent pME) {
		
		Player player = pME.getPlayer();
		
		if(CrazyFeet.CrazyMagicHead.contains(player)) {
			
				player.getWorld().spawnParticle(Particle.SPELL, player.getEyeLocation().add(0, 0.8, 0), 0);
			}  
		}

	@EventHandler
	public void onCrazyNoteHeadMove(PlayerMoveEvent pME) {
		
		Player player = pME.getPlayer();
		
		if(CrazyFeet.CrazyNoteHead.contains(player)) {
			
				player.getWorld().spawnParticle(Particle.NOTE, player.getEyeLocation().add(0, 0.8, 0), 10);
			}  
		}

	@EventHandler
	public void onCrazyWitchHeadMove(PlayerMoveEvent pME) {
		
		Player player = pME.getPlayer();
		
		if(CrazyFeet.CrazyWitchHead.contains(player)) {
			
				player.getWorld().spawnParticle(Particle.SPELL_WITCH, player.getEyeLocation().add(0, 0.8, 0), 10);
			}  
		}

	@EventHandler
	public void onCrazySmokeHeadMove(PlayerMoveEvent pME) {
		
		Player player = pME.getPlayer();
		
		if(CrazyFeet.CrazySmokeHead.contains(player)) {
			
				player.getWorld().playEffect(player.getEyeLocation().add(0, 0.8, 0), Effect.SMOKE, 10);
			}  
		}

	@EventHandler
	public void onCrazyPearlHeadMove(PlayerMoveEvent pME) {
		
		Player player = pME.getPlayer();
		
		if(CrazyFeet.CrazyPearlHead.contains(player)) {
			
				player.getWorld().playEffect(player.getEyeLocation().add(0, 0.8, 0), Effect.ENDER_SIGNAL, 1, 100);
			}  
		}

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
				player.getWorld().spawnParticle( Particle.CRIT_MAGIC, loc, 1, 100);
			} else {
				pME.setCancelled(false);
			}
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
				player.getWorld().spawnParticle(Particle.NOTE, loc, 10);
			} else {
				pME.setCancelled(false);
			}
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
				player.getWorld().spawnParticle(Particle.SPELL_MOB, loc, 10);
			}  
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
				player.getWorld().spawnParticle(Particle.HEART, loc, 1);
			} else {
				pME.setCancelled(false);
			}
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
		}  
	}
}
