package me.lucasgithuber.obsidianexpansion.machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.lucasgithuber.obsidianexpansion.Items;
import me.lucasgithuber.obsidianexpansion.utils.Categories;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class NetheriteGen extends AContainer implements RecipeDisplayItem {

    public NetheriteGen(ItemGroup c) {
        super(c, Items.NETHERITE_GEN, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        getItem("NETHERITE_SINGULARITY"),getItem("ADVANCED_NETHER_STAR_REACTOR"),getItem("NETHERITE_SINGULARITY"),
                        SlimefunItems.BOOSTED_URANIUM, getItem("INFINITE_MACHINE_CORE"), SlimefunItems.BOOSTED_URANIUM,
                        Items.QUINTUPLE_COMPRESSED_OBSIDIAN,Items.QUINTUPLE_COMPRESSED_OBSIDIAN,Items.QUINTUPLE_COMPRESSED_OBSIDIAN
                });

        addItemHandler(onBreak());
    }

    @Override
    protected void registerDefaultRecipes() {

        registerRecipe(10, new ItemStack[] {new ItemStack(Material.COBBLESTONE, 32)},
                new ItemStack[] {new ItemStack(Material.NETHERITE_INGOT)
                });
    }

    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList<>(recipes.size() * 2);

        for (MachineRecipe recipe : recipes) {
            displayRecipes.add(recipe.getInput()[0]);
            displayRecipes.add(recipe.getOutput()[recipe.getOutput().length - 1]);
        }

        return displayRecipes;
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.NETHERITE_INGOT);
    }

    @Override
    public String getInventoryTitle() {
        return "&l&4Gerador de netherite";
    }

    @Override
    public String getMachineIdentifier() {
        return "OMC_NETHERITE_GEN";
    }

    @Override
    public int getCapacity() {
        return 131072;
    }

    @Override
    public int getEnergyConsumption() {
        return 16384;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    public BlockBreakHandler onBreak() {
        return new BlockBreakHandler(false, false) {

            @Override
            public void onPlayerBreak(BlockBreakEvent e, ItemStack item, List<ItemStack> drops) {
                Block b = e.getBlock();
                BlockMenu inv = BlockStorage.getInventory(b);

                if (inv != null) {
                    inv.dropItems(b.getLocation(), getInputSlots());
                    inv.dropItems(b.getLocation(), getOutputSlots());
                }
            }
        };
    }
    @Nullable
    private static ItemStack getItem(@Nonnull String id) {
        SlimefunItem item = SlimefunItem.getById(id);
        return item != null ? item.getItem() : null;
    }
}
