package me.lucasgithuber.obsidianexpansion;


import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.lucasgithuber.obsidianexpansion.utils.HelmetListener;
import me.lucasgithuber.obsidianexpansion.utils.HelmetTask;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.markdown.DiscordFlavor;
import net.kyori.adventure.text.minimessage.transformation.TransformationType;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


public final class ObsidianExpansion extends AbstractAddon implements SlimefunAddon {
    private static ObsidianExpansion instance;
    private HelmetTask helmetTask = new HelmetTask();
    private final ObsidianExpansion plugin = this;


    public static final MiniMessage MM = MiniMessage.builder()
            .removeDefaultTransformations()
            .transformation(TransformationType.COLOR)
            .transformation(TransformationType.DECORATION)
            .transformation(TransformationType.GRADIENT)
            .markdown()
            .markdownFlavor(DiscordFlavor.get())
            .build();

    public ObsidianExpansion() {
        super("lucasGithuber", "ObsidianExpansion", "master", "options.auto-update");
    }
    @Override
    public void enable() {

        instance = this;
        //armor
        getServer().getScheduler().runTaskTimerAsynchronously(this, new HelmetTask(), 0L, getConfig().getInt("armor-particle-delay-in-seconds") * 20L);
        // Setup items
        Setup.setup(this);
    }

    @Override
    public void disable() {
        // Set instance to null
        instance = null;
    }
    private static void setInstance(ObsidianExpansion ins) {
        instance = ins;
    }

    public static ObsidianExpansion getInstance() {
        return instance;
    }

    public static ObsidianExpansion i() {
        return instance;
    }
}
