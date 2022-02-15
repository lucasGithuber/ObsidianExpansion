package me.lucasgithuber.obsidianexpansion;


import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.markdown.DiscordFlavor;
import net.kyori.adventure.text.minimessage.transformation.TransformationType;


public final class ObsidianExpansion extends AbstractAddon implements SlimefunAddon {
    private static ObsidianExpansion i;
    


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
        i = this;
        // Setup items
    
        }

    @Override
    public void disable() {
        // Set instance to null
        i = null;
    }

    public static ObsidianExpansion i() {
        return i;
    }

}
