package me.xxsniperzzxxsd.flatcraft;


import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener {

	public Main plugin;
	
	public PlayerListener(Main instance){
		plugin = instance;
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerJoin(PlayerJoinEvent e){
		e.getPlayer().sendMessage(ChatColor.UNDERLINE+"Welcome to Flatcraft!");
		
	}

}

