package me.gigaadamyt.eventtest;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        // Plugin pro GitHub Repository test
        // Update 0.1.

    }

    @EventHandler
    public void event(PlayerMoveEvent e) {
        Player p = e.getPlayer();
        p.sendMessage("Pohyb");
    }
}
