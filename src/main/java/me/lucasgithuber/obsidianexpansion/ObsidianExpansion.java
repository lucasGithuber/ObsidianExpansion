package me.lucasgithuber.obsidianexpansion;


import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.lucasgithuber.obsidianexpansion.utils.CustomArmorTask;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.tag.resolver.TagResolver;
import net.kyori.adventure.text.minimessage.tag.standard.StandardTags;


public final class ObsidianExpansion extends AbstractAddon implements SlimefunAddon {
    private static ObsidianExpansion instance;
    private final ObsidianExpansion plugin = this;

    public static final MiniMessage MM = MiniMessage.builder()
            .tags(TagResolver.builder()
                    .resolver(StandardTags.color())
                    .resolver(StandardTags.decorations())
                    .resolver(StandardTags.gradient())
                    .build()
            )
            .build();
    public ObsidianExpansion() {
        super("lucasGithuber", "ObsidianExpansion", "master", "options.auto-update");
    }

    @Override
    public void enable() {
            instance = this;
            //armor

                new CustomArmorTask().runTaskTimer(this, 0L, 0L);


            // Setup item
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
