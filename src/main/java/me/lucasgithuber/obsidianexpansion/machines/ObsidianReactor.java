package me.lucasgithuber.obsidianexpansion.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AGenerator;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

public class ObsidianReactor extends AGenerator {

    @ParametersAreNonnullByDefault
    public ObsidianReactor(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    protected void registerDefaultFuelTypes() {
        registerFuel(new MachineFuel(8, new ItemStack(Material.OBSIDIAN)));
        registerFuel(new MachineFuel(8, new ItemStack(Material.CRYING_OBSIDIAN)));
    }

    @Nonnull
    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.OBSIDIAN);
    }

}