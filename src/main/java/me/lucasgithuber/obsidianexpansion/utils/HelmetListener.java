package me.lucasgithuber.obsidianexpansion.utils;

import me.lucasgithuber.obsidianexpansion.ObsidianExpansion;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.scheduler.BukkitTask;

public class HelmetListener implements Listener {

    private final ObsidianExpansion plugin;

    public HelmetListener(ObsidianExpansion plugin) {
        this.plugin = plugin;
        this.plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    public void run(){

    }

}