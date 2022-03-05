package me.lucasgithuber.obsidianexpansion.utils;

import io.github.mooy1.infinitylib.machines.MachineRecipeType;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.Particle;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

public class ArmorPiece extends SlimefunItem {

    private final PotionEffect[] effects;
    private final Particle[] particles;

    @ParametersAreNonnullByDefault
    public ArmorPiece(ItemGroup itemGroup, SlimefunItemStack item, MachineRecipeType recipeType, ItemStack[] recipe, @Nullable PotionEffect[] effects, @Nullable Particle[] particles) {
        super(itemGroup, item, recipeType, recipe);

        this.effects = effects == null ? new PotionEffect[0] : effects;
        this.particles = effects == null ? new Particle[0] : particles;
    }

    public PotionEffect[] getPotionEffects() {
        return effects;
    }
    public Particle[] getParticle() {
        return particles;
    }
}