package me.lucasgithuber.obsidianexpansion.utils;

import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import lombok.experimental.UtilityClass;
import me.lucasgithuber.obsidianexpansion.ObsidianExpansion;
import net.kyori.adventure.platform.bukkit.BukkitComponentSerializer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;


@UtilityClass
public class Categories {

    public static final ItemGroup OMC_RESOURCES = new SubGroup(
            "omc_resources",
            new CustomItemStack(new ItemStack(Material.OBSIDIAN), BukkitComponentSerializer.legacy().serialize
                    (ObsidianExpansion.MM.parse("<gradient:#8100D1:#D320FC>Recursos</gradient>")))
    );
    public static final ItemGroup OMC_ITEMS = new SubGroup(
            "omc_items",
            new CustomItemStack(new ItemStack(Material.NETHERITE_INGOT), BukkitComponentSerializer.legacy().serialize
                    (ObsidianExpansion.MM.parse("<gradient:#8100D1:#D320FC>Items</gradient>")))
    );
    public static final ItemGroup OMC_MACHINES = new SubGroup(
            "omc_machines",
            new CustomItemStack(new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE), BukkitComponentSerializer.legacy().serialize
                    (ObsidianExpansion.MM.parse("<gradient:#8100D1:#D320FC>Maquinas</gradient>")))
    );
    public static final ItemGroup OMC_GENERATORS = new SubGroup(
            "omc_generators",
            new CustomItemStack(new ItemStack(Material.BLACKSTONE_WALL), BukkitComponentSerializer.legacy().serialize
                    (ObsidianExpansion.MM.parse("<gradient:#8100D1:#D320FC>Geradores</gradient>")))
    );
    public static final ItemGroup OMC_DROPS = new SubGroup(
            "omc_drops",
            new CustomItemStack(new ItemStack(Material.NETHERITE_SWORD), BukkitComponentSerializer.legacy().serialize
                    (ObsidianExpansion.MM.parse("<gradient:#8100D1:#D320FC>Drops</gradient>")))
    );
    public static final ItemGroup OMC_FORGE_GROUP = new ObsidianForgeGroup(
            ObsidianExpansion.createKey("junction_category"),
            new CustomItemStack(Material.SMITHING_TABLE, BukkitComponentSerializer.legacy().serialize
                    (ObsidianExpansion.MM.parse("<gradient:#A3A3A3:#FFFFFF>Junctions</gradient>"))),3);
    public static final ItemGroup OMC_MAIN = new MultiGroup(
            "omc_expansion",
            new CustomItemStack(Material.CRYING_OBSIDIAN, BukkitComponentSerializer.legacy().serialize
                    (ObsidianExpansion.MM.parse("<gradient:#8100D1:#D320FC>&5Obsidian Expansion</gradient>"))),
            OMC_RESOURCES, OMC_ITEMS, OMC_MACHINES, OMC_GENERATORS, OMC_DROPS, OMC_FORGE_GROUP
    );
    public static final ItemGroup OMC_FORGE_CHEAT = new SubGroup("omc_forge_cheat",
            new CustomItemStack(Material.SMITHING_TABLE, "&bForges &c- RECEITAS INCORRETAS"));
    public static void setup(ObsidianExpansion omc){
        OMC_FORGE_GROUP.register(omc);
        OMC_MAIN.register(omc);
        OMC_FORGE_CHEAT.register(omc);
    }
}