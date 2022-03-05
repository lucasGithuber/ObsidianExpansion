package me.lucasgithuber.obsidianexpansion.utils;

import io.github.mooy1.infinitylib.common.Scheduler;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import me.lucasgithuber.obsidianexpansion.ObsidianExpansion;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.logging.Level;

import static io.github.mooy1.infinitylib.core.AbstractAddon.log;

public class HelmetTask extends BukkitRunnable {
    int counter = 0;
    @Override
    public void run(){
        if(counter<101){
            for (Player p : Bukkit.getOnlinePlayers()) {
                if (!p.isValid() || p.isDead()) {
                    continue;
                }

                ItemStack itemStack = p.getInventory().getHelmet();
                Location location = p.getPlayer().getLocation();
                if (SlimefunItem.getByItem(itemStack) instanceof Helmet) {
                    Bukkit.getScheduler().runTask(ObsidianExpansion.getInstance(), () ->
                            Scheduler.run(() -> log(Level.WARNING,
                                    "particle"
                            )));
                    for (int degree = 0; degree < 360; degree++) {
                        double radians = Math.toRadians(degree);
                        double x = Math.cos(radians);
                        double z = Math.sin(radians);
                        location.add(x, 0, z);
                        location.getWorld().spawnParticle(Particle.END_ROD, location, 1);
                        location.subtract(x, 0, z);
                    }
                }

            }
            counter ++;
        }
        if(counter>140){
            counter = 0;
        }
    }
}