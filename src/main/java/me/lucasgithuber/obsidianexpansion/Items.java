package me.lucasgithuber.obsidianexpansion;

import io.github.bakedlibs.dough.items.CustomItemStack;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.lucasgithuber.obsidianexpansion.machines.ObsidianForge;
import me.lucasgithuber.obsidianexpansion.machines.ObsidianReactor;
import me.lucasgithuber.obsidianexpansion.resources.DragonScale;
import me.lucasgithuber.obsidianexpansion.utils.Helmet;
import me.lucasgithuber.obsidianexpansion.utils.Categories;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.block.data.type.Bed;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class Items{
    public static final SlimefunItemStack OBSIDIAN_FORGE = new SlimefunItemStack(
            "OMC_OBSIDIAN_FORGE",
            Material.SMITHING_TABLE,
            "&l&5Forja de obsidian",
            "&8Usada para criar equipamentos",
            "&8 e máquinas mais avançadas",
            "",
            "&bMáquina",
            MachineLore.energyBuffer(40000000),
            MachineLore.energy(10000000)+"/Craft"
    );
    public static final SlimefunItemStack NETHERITE_GEN = new SlimefunItemStack(
            "OMC_NETHERITE_GEN",
            Material.NETHERITE_BLOCK,
            "&l&4Gerador de Netherite",
            "&8Máquina geradora de netherite",
            "&8Transforma pedregulho em netherite",
            "",
            "&2Gerador de recursos",
            MachineLore.energy(1600)+"/t"
    );
    public static final SlimefunItemStack OBSIDIAN_REACTOR = new SlimefunItemStack(
            "OMC_OBSIDIAN_ENERGY",
            Material.OBSIDIAN,
            "&l&5Gerador a obsidian",
            "&8Gera energia usando obsidian",
            "",
            "aGerador de energia",
            MachineLore.energyBuffer(32768),
            MachineLore.energyPerSecond(8192)
    );
    public static final SlimefunItemStack ADVANCED_OBSIDIAN_ENERGY = new SlimefunItemStack(
            "OMC_ADVANCED_OBSIDIAN_ENERGY",
            Material.CRYING_OBSIDIAN,
            "&l&5Gerador a obsidian &l&1Avançado",
            "&8Gera energia usando obsidian",
            "",
            "aGerador de energia",
            MachineLore.energyBuffer(512),
            MachineLore.energyPerSecond(1024)
    );

    //recursos
    public static final SlimefunItemStack SINGLE_COMPRESSED_OBSIDIAN = new SlimefunItemStack(
            "OMC_COMPRESSED_OBSIDIAN",
            Material.OBSIDIAN,
            "&7Obisidian comprimida x1",
            "&l&7 9 &7Obsidians comprimidas em uma só",
            "",
            "&7Recurso"
    );
    public static final SlimefunItemStack DOUBLE_COMPRESSED_OBSIDIAN = new SlimefunItemStack(
            "OMC_COMPRESSED_OBSIDIAN_2",
            Material.OBSIDIAN,
            "&7Obisidian comprimida x2",
            "&l&7 81 &7Obsidians comprimidas em uma só",
            "",
            "&7Recurso"
    );
    public static final SlimefunItemStack TRIPLE_COMPRESSED_OBSIDIAN = new SlimefunItemStack(
            "OMC_COMPRESSED_OBSIDIAN_3",
            Material.OBSIDIAN,
            "&7 Obisidian comprimida x3",
            "&l&7 729 &7Obsidians comprimidas em uma só",
            "",
            "&7Recurso"
    );
    public static final SlimefunItemStack QUADRUPLE_COMPRESSED_OBSIDIAN = new SlimefunItemStack(
            "OMC_COMPRESSED_OBSIDIAN_4",
            Material.OBSIDIAN,
            "&8 Obisidian comprimida x4",
            "&l&7 6561 &7Obsidians comprimidas em uma só",
            "",
            "&7Recurso"
    );
    public static final SlimefunItemStack QUINTUPLE_COMPRESSED_OBSIDIAN = new SlimefunItemStack(
            "OMC_COMPRESSED_OBSIDIAN_5",
            Material.CRYING_OBSIDIAN,
            "&8&l Obisidian comprimida x5",
            "&l&7 59049 &7Obsidians comprimidas em uma só",
            "",
            "&7Recurso"
    );
    public static final SlimefunItemStack OBSIDIAN_PLATE = new SlimefunItemStack(
            "OMC_OBSIDIAN_PLATE",
            Material.NETHERITE_INGOT,
            "&l&5Placa de obsidian",
            "",
            "&7Recurso"
    );
    public static final SlimefunItemStack VOID_CORE = new SlimefunItemStack(
            "OMC_VOID_CORE",
            Material.NETHERITE_BLOCK,
            ChatColor.of("#31004C")+"Núcleo do void",
            ChatColor.of("#31004C")+"núcleo de todos",
            ChatColor.of("#31004C")+"os acontecimentos do void",
            "",
            "&7Recurso"
    );
    public static final SlimefunItemStack ADVANCED_VOID_CORE = new SlimefunItemStack(
            "OMC_ADVANCED_VOID_CORE",
            Material.BEDROCK,
            "&0&lNúcleo do void &4&lAvançado",
            "&0&lO núcleo de todos",
            "&0&los acontecimentos do void...",
            "&4&lPorém avançado",
            "",
            "&7Recurso"
    );
    public static final SlimefunItemStack OBSIDIAN_GEAR = new SlimefunItemStack(
            "OMC_OBSIDIAN_GEAR",
            Material.POLISHED_BLACKSTONE,
            "&5Engrenagem de obsidian",
            "",
            "&2Material"
    );
    public static final SlimefunItemStack DRAGON_SCALE = new SlimefunItemStack(
            "OMC_DRAGON_SCALE",
            Material.AMETHYST_SHARD,
            "&5&lEscama de dragão",
            "",
            "&7Recurso"
    );
    //armadura
    public static final SlimefunItemStack OBSIDIAN_HELMET = new SlimefunItemStack(
            "OMC_HELMET",
            Material.NETHERITE_HELMET,
            "&5Capacete &5&lObsidian"
    );
    public static void setup(ObsidianExpansion omc) {
        //maquinas
        new ObsidianReactor(Categories.OMC_GENERATORS, OBSIDIAN_REACTOR , RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.WITHER_PROOF_OBSIDIAN, OBSIDIAN_PLATE, SlimefunItems.WITHER_PROOF_OBSIDIAN,
                OBSIDIAN_PLATE, SlimefunItems.ENERGIZED_CAPACITOR, OBSIDIAN_PLATE,
                SlimefunItems.WITHER_PROOF_OBSIDIAN, OBSIDIAN_PLATE, SlimefunItems.WITHER_PROOF_OBSIDIAN
        }).setCapacity(32768).setEnergyProduction(8192).register(omc);

        new ObsidianForge(Categories.OMC_MACHINES, OBSIDIAN_FORGE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                OBSIDIAN_PLATE, new ItemStack(Material.CRAFTING_TABLE), OBSIDIAN_PLATE,
                OBSIDIAN_GEAR, SlimefunItems.CRAFTING_MOTOR, OBSIDIAN_GEAR,
                new ItemStack(Material.SMOOTH_QUARTZ),new ItemStack(Material.SMOOTH_QUARTZ),new ItemStack(Material.SMOOTH_QUARTZ),
        },10000000).register(omc);
        //recursos
        new SlimefunItem(Categories.OMC_RESOURCES, SINGLE_COMPRESSED_OBSIDIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.OBSIDIAN),new ItemStack(Material.OBSIDIAN),new ItemStack(Material.OBSIDIAN),
                new ItemStack(Material.OBSIDIAN),new ItemStack(Material.OBSIDIAN),new ItemStack(Material.OBSIDIAN),
                new ItemStack(Material.OBSIDIAN),new ItemStack(Material.OBSIDIAN),new ItemStack(Material.OBSIDIAN)
        }).register(omc);
        new SlimefunItem(Categories.OMC_RESOURCES, DOUBLE_COMPRESSED_OBSIDIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SINGLE_COMPRESSED_OBSIDIAN,SINGLE_COMPRESSED_OBSIDIAN,SINGLE_COMPRESSED_OBSIDIAN,
                SINGLE_COMPRESSED_OBSIDIAN,SINGLE_COMPRESSED_OBSIDIAN,SINGLE_COMPRESSED_OBSIDIAN,
                SINGLE_COMPRESSED_OBSIDIAN,SINGLE_COMPRESSED_OBSIDIAN,SINGLE_COMPRESSED_OBSIDIAN
        }).register(omc);
        new SlimefunItem(Categories.OMC_RESOURCES, TRIPLE_COMPRESSED_OBSIDIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                DOUBLE_COMPRESSED_OBSIDIAN,DOUBLE_COMPRESSED_OBSIDIAN,DOUBLE_COMPRESSED_OBSIDIAN,
                DOUBLE_COMPRESSED_OBSIDIAN,DOUBLE_COMPRESSED_OBSIDIAN,DOUBLE_COMPRESSED_OBSIDIAN,
                DOUBLE_COMPRESSED_OBSIDIAN,DOUBLE_COMPRESSED_OBSIDIAN,DOUBLE_COMPRESSED_OBSIDIAN
        }).register(omc);
        new SlimefunItem(Categories.OMC_RESOURCES, QUADRUPLE_COMPRESSED_OBSIDIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                TRIPLE_COMPRESSED_OBSIDIAN,TRIPLE_COMPRESSED_OBSIDIAN,TRIPLE_COMPRESSED_OBSIDIAN,
                TRIPLE_COMPRESSED_OBSIDIAN,TRIPLE_COMPRESSED_OBSIDIAN,TRIPLE_COMPRESSED_OBSIDIAN,
                TRIPLE_COMPRESSED_OBSIDIAN,TRIPLE_COMPRESSED_OBSIDIAN,TRIPLE_COMPRESSED_OBSIDIAN
        }).register(omc);
        new SlimefunItem(Categories.OMC_RESOURCES, QUINTUPLE_COMPRESSED_OBSIDIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                QUADRUPLE_COMPRESSED_OBSIDIAN,QUADRUPLE_COMPRESSED_OBSIDIAN,QUADRUPLE_COMPRESSED_OBSIDIAN,
                QUADRUPLE_COMPRESSED_OBSIDIAN,QUADRUPLE_COMPRESSED_OBSIDIAN,QUADRUPLE_COMPRESSED_OBSIDIAN,
                QUADRUPLE_COMPRESSED_OBSIDIAN,QUADRUPLE_COMPRESSED_OBSIDIAN,QUADRUPLE_COMPRESSED_OBSIDIAN
        }).register(omc);
        new SlimefunItem(Categories.OMC_RESOURCES, OBSIDIAN_PLATE , RecipeType.COMPRESSOR, new ItemStack[]{
                new ItemStack(Material.OBSIDIAN, 4), null, null,
                null, null, null,
                null, null, null
        }).register(omc);
        new SlimefunItem(Categories.OMC_RESOURCES, VOID_CORE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                getItem("VOID_INGOT"),getItem("VOID_INGOT"),getItem("VOID_INGOT"),
                getItem("VOID_INGOT"),QUINTUPLE_COMPRESSED_OBSIDIAN,getItem("VOID_INGOT"),
                getItem("VOID_INGOT"),getItem("VOID_INGOT"),getItem("VOID_INGOT")
        }).register(omc);
        new SlimefunItem(Categories.OMC_ITEMS, OBSIDIAN_GEAR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, OBSIDIAN_PLATE, null,
                OBSIDIAN_PLATE, new ItemStack(Material.STICK), OBSIDIAN_PLATE,
                null, OBSIDIAN_PLATE, null
        }).register(omc);
        new DragonScale(Categories.OMC_RESOURCES, DRAGON_SCALE, RecipeType.MOB_DROP, new ItemStack[]{
                null, null, null,
                null, new CustomItemStack(Material.ENDERMAN_SPAWN_EGG, "&aEnder dragon"),null,
                null, null, null
        }).register(omc);
        //armadura
        new Helmet(Categories.OMC_FORGE_CHEAT, OBSIDIAN_HELMET, new PotionEffect[] {
                new PotionEffect(PotionEffectType.FAST_DIGGING, 600, 2, false, false, false),
                new PotionEffect(PotionEffectType.REGENERATION, 600, 0, false, false, false),
                new PotionEffect(PotionEffectType.SATURATION, 600, 0, false, false, false),
        }, new ItemStack[] {
                null,null,null,null,null,null,
                null,null,null,null,null,null,
                null,null,null,null,null,null,
                null,null,null,null,null,null,
                null,null,null,null,null,null,
                null,null,null,null,null,null
        }, new Particle[]{Particle.HEART}).register(omc);
}
    @Nullable
    private static ItemStack getItem(@Nonnull String id) {
        SlimefunItem item = SlimefunItem.getById(id);
        return item != null ? item.getItem() : null;
    }

}