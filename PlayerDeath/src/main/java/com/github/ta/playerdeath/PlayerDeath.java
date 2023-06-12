package com.github.ta.playerdeath;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerDeath extends JavaPlugin implements Listener {
	
	@EventHandler
	public void onPlayerDeath(PlayerDeath e) {
		
        // プレイヤー死亡時、サーバー上にログを残す
		// Print keyword to server log when player dies
        getLogger().info("PLAYERDEATH!");
	}
	
	

}
