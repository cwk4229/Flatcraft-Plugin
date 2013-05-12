package me.xxsniperzzxxsd.flatcraft;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	
	
	
	public void onEnable(){
		System.out.println("Flatcraft Plugin Loaded!");
	
	}
	public void onDisable(){
		System.out.println("Flatcraft Plugin Disabled");
	
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		Player player = (Player)sender;
		if(cmd.getName().equalsIgnoreCase("Flatcraft")){
			player.sendMessage(ChatColor.YELLOW+"The Flatcraft Network is a fun network of servers to play on involving many different things.");
		}
		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		Player player = (Player)sender;
	        else if(cmd.getName().equalsIgnoreCase("Build")){
		        player.sendMessage(ChatColor.YELLOW+"The Flatcraft Build Server is a Creative server where you build what you want, but it also has a Survival section.");
		}
		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		Player player = (Player)sender;
	        else if(cmd.getName().equalsIgnoreCase("PvP")){
		        player.sendMessage(ChatColor.YELLOW+"The Flatcraft PvP Server is a Minigames server with Survival Games, TF2 and more exciting minigames.");
	        }
	        public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		Player player = (Player)sender;
	        else if(cmd.getName().equalsIgnoreCase("Prison")){
		        player.sendMessage(ChatColor.YELLOW+"The Flatcraft Prison Server is an exciting Prison Server with drugs and much more fun things to do!.");
	        }
		return true;
	}


}
