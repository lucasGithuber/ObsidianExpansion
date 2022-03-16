package me.lucasgithuber.obsidianexpansion;

import io.github.bakedlibs.dough.items.CustomItemStack;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import me.lucasgithuber.obsidianexpansion.items.AngelGem;
import me.lucasgithuber.obsidianexpansion.items.AngelGemT2;
import me.lucasgithuber.obsidianexpansion.items.AngelGemT3;
import me.lucasgithuber.obsidianexpansion.items.ContainmentPick;
import me.lucasgithuber.obsidianexpansion.machines.AdvancedObsidianGenerator;
import me.lucasgithuber.obsidianexpansion.machines.ObsidianForge;
import me.lucasgithuber.obsidianexpansion.machines.ObsidianReactor;
import me.lucasgithuber.obsidianexpansion.machines.VoidObsidianGenerator;
import me.lucasgithuber.obsidianexpansion.resources.DragonScale;
import me.lucasgithuber.obsidianexpansion.resources.PhantomScale;
import me.lucasgithuber.obsidianexpansion.utils.Armor;
import me.lucasgithuber.obsidianexpansion.utils.Categories;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
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
            "&bMáquina"
    );
    public static final SlimefunItemStack CONTAINMENT_PICK = new SlimefunItemStack(
            "OMC_CONTAINMENT_PICK",
            Material.NETHERITE_PICKAXE,
            ChatColor.DARK_RED + "&lPicareta de contenção",
            ChatColor.RED + "Usada para coletar spawners",
            "",
            "&8Ferramenta"
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
    public static final SlimefunItemStack ADVANCED_OBSIDIAN_GEN = new SlimefunItemStack(
            "OMC_ADVANCED_OBSIDIAN_GEN",
            Material.POLISHED_ANDESITE,
            "&l&4Gerador de obsidian &5avançado",
            "&5Coleta obsidian do void",
            "",
            "&2Gerador de recursos"
    );
    public static final SlimefunItemStack VOID_OBSIDIAN_GEN = new SlimefunItemStack(
            "OMC_VOID_OBSIDIAN_GEN",
            Material.POLISHED_BLACKSTONE_BRICKS,
            "&l&4Gerador de obsidian &8&lVoid",
            "&5Coleta obsidian do void &8&labsoluto",
            "",
            "&2Gerador de recursos"
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
    public static final SlimefunItemStack CONTAINMENT_INGOT = new SlimefunItemStack(
            "OMC_CONTAINMENT_INGOT",
            Material.NETHERITE_INGOT,
            "&4Barra de contenção",
            "&aUsada para fazer",
            "&aa picareta de contenção",
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
    public static final SlimefunItemStack PHANTOM_SCALE = new SlimefunItemStack(
            "OMC_PHANTOM_SCALE",
            Material.FEATHER,
            "&5&lEscama de phantom",
            "",
            "&7Recurso"
    );
    //angel gem
    public static final SlimefunItemStack ANGEL_GEM = new SlimefunItemStack("OMC_ANGEL_GEM",
            Material.NETHERITE_BLOCK,
            "&6Joia de voo",
            "",
            "&fVoo criativo permanente.",
            "&fVem com alguns ajustes de velocidade.",
            "",
            "&f&oVoe como um pássaro~",
            "",
            "&7Velocidade máxima: 0.1",
            "&7Flight: <enabled>",
            "&7Flight Speed: <speed>"
    );
    public static final SlimefunItemStack ANGEL_GEM_2 = new SlimefunItemStack("OMC_ANGEL_GEM_2",
            Material.NETHERITE_BLOCK,
            "&6Joia de voo &6&l tier II",
            "",
            "&fVoo criativo permanente.",
            "&fVem com alguns ajustes de velocidade.",
            "",
            "&f&oVoe como uma águia~",
            "",
            "&7Velocidade máxima: 0.2",
            "&7Flight: <enabled>",
            "&7Flight Speed: <speed>"
    );
    public static final SlimefunItemStack ANGEL_GEM_3 = new SlimefunItemStack("OMC_ANGEL_GEM_3",
            Material.NETHERITE_BLOCK,
            "&6Joia de voo &6&lTier III",
            "",
            "&fVoo criativo permanente.",
            "&fVem com alguns ajustes de velocidade.",
            "",
            "&f&oVoe como um dragão~",
            "",
            "&7Velocidade máxima: 0.3",
            "&7Flight: <enabled>",
            "&7Flight Speed: <speed>"
    );
    //armadura
    public static final SlimefunItemStack OBSIDIAN_HELMET = new SlimefunItemStack(
            "OMC_HELMET",
            Material.NETHERITE_HELMET,
            "&5&lCoroa do imperador do void",
            ChatColor.of("#2E004A")+"&lO grande imperador do void",
            ChatColor.of("#2E004A")+"&lgovernou com essa coroa...",
            "&5&lDizem que um espírito controlava ele",
            "&5&lpor meio dessa coroa...",
            "&7Proteção do mar",
            "&7Visão noturna",
            "&7Respiração aquática"
    );
    public static final SlimefunItemStack OBSIDIAN_CHESTPLATE = new SlimefunItemStack(
            "OMC_CHEST",
            Material.NETHERITE_CHESTPLATE,
            "&5&lDefensor da escuridão",
            ChatColor.of("#2E004A")+"&lUsado pelos corajosos soldados",
            ChatColor.of("#2E004A")+"&lque juraram proteger o void",
            "&7Força II",
            "&7Resistência II",
            "&7Saturação IV"
    );
    public static final SlimefunItemStack OBSIDIAN_LEGGINGS = new SlimefunItemStack(
            "OMC_LEGGINGS",
            Material.NETHERITE_LEGGINGS,
            "&5&lCalças do conquistador sombrio",
            ChatColor.of("#2E004A")+"&lFoi usada pelo conquistador sombrio",
            ChatColor.of("#2E004A")+"&lem suas expedições pelo universo",
            "&7Sorte II",
            "&7Regeneração II",
            "&7Pressa III"
    );
    public static final SlimefunItemStack OBSIDIAN_BOOTS = new SlimefunItemStack(
            "OMC_BOOTS",
            Material.NETHERITE_BOOTS,
            "&5&lNascimento da destruição",
            ChatColor.of("#2E004A")+"&lDizem que foi usada",
            ChatColor.of("#2E004A")+"&lpelos primeiros guerreiros do void",
            "&7Super-salto III",
            "&7Velocidade I",
            "&7Graça marinha III",
            "&7Vida extra I"
    );
    public static void setup(ObsidianExpansion omc) {
        //pick
        new ContainmentPick(Categories.OMC_ITEMS, CONTAINMENT_PICK, RecipeType.ANCIENT_ALTAR, new ItemStack[]{
                CONTAINMENT_INGOT,CONTAINMENT_INGOT,CONTAINMENT_INGOT,
                null, getItem("AV_ILLUMIUM"), null,
                null, getItem("AV_DARKSTEEL"), null
        }).register(omc);
        new SlimefunItem(Categories.OMC_ITEMS, CONTAINMENT_INGOT, RecipeType.MAGIC_WORKBENCH, new ItemStack[]{
                getItem("AV_DARKSTEEL"), SlimefunItems.EARTH_RUNE, getItem("AV_DARKSTEEL"),
                getItem("DEMONIC_INGOT"), VOID_CORE, getItem("DEMONIC_INGOT"),
                getItem("AV_DARKSTEEL"), SlimefunItems.EARTH_RUNE, getItem("AV_DARKSTEEL"),
        }).register(omc);
        //maquinas
        new ObsidianReactor(Categories.OMC_GENERATORS, OBSIDIAN_REACTOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SlimefunItems.WITHER_PROOF_OBSIDIAN, OBSIDIAN_PLATE, SlimefunItems.WITHER_PROOF_OBSIDIAN,
                OBSIDIAN_PLATE, SlimefunItems.ENERGIZED_CAPACITOR, OBSIDIAN_PLATE,
                SlimefunItems.WITHER_PROOF_OBSIDIAN, OBSIDIAN_PLATE, SlimefunItems.WITHER_PROOF_OBSIDIAN
        }).setCapacity(32768).setEnergyProduction(8192).register(omc);
        new AdvancedObsidianGenerator(Categories.OMC_GENERATORS, ADVANCED_OBSIDIAN_GEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.NETHERITE_PICKAXE), SlimefunItems.GEO_MINER, new ItemStack(Material.NETHERITE_PICKAXE),
                new ItemStack(Material.DISPENSER), VOID_CORE, new ItemStack(Material.DISPENSER),
                getItem("MACHINE_CIRCUIT"), getItem("MACHINE_CORE"), getItem("MACHINE_CIRCUIT")
        }).energyPerTick(800).register(omc);
        new VoidObsidianGenerator(Categories.OMC_GENERATORS, VOID_OBSIDIAN_GEN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.PROGRAMMABLE_ANDROID_MINER, SlimefunItems.GEO_MINER, SlimefunItems.PROGRAMMABLE_ANDROID_MINER,
                new ItemStack(Material.LAVA_BUCKET), ADVANCED_OBSIDIAN_GEN, new ItemStack(Material.LAVA_BUCKET),
                getItem("MACHINE_PLATE"), getItem("INFINITE_MACHINE_CORE"), getItem("MACHINE_PLATE")
       }).energyPerTick(40000).register(omc);
        new ObsidianForge(Categories.OMC_MACHINES, OBSIDIAN_FORGE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                OBSIDIAN_PLATE, new ItemStack(Material.CRAFTING_TABLE), OBSIDIAN_PLATE,
                OBSIDIAN_GEAR, SlimefunItems.CRAFTING_MOTOR, OBSIDIAN_GEAR,
                new ItemStack(Material.SMOOTH_QUARTZ), new ItemStack(Material.SMOOTH_QUARTZ), new ItemStack(Material.SMOOTH_QUARTZ),
        }, 10000000).register(omc);
        //angel gem
        new AngelGem(Categories.OMC_ITEMS, ANGEL_GEM, RecipeType.ANCIENT_ALTAR,
                new ItemStack[]{
                        SlimefunItems.INFUSED_ELYTRA, getItem("ADVANCED_NETHER_STAR_REACTOR"), SlimefunItems.INFUSED_ELYTRA,
                        getItem("VEX_GEM"), VOID_CORE, getItem("VEX_GEM"),
                        PHANTOM_SCALE, getItem("VEX_GEM"), PHANTOM_SCALE
                }).register(omc);
        new AngelGemT2(Categories.OMC_ITEMS, ANGEL_GEM_2, RecipeType.ANCIENT_ALTAR,
                new ItemStack[]{
                        new ItemStack(Material.ELYTRA), getItem("STAINLESS_STEEL_ROTOR"), new ItemStack(Material.ELYTRA),
                        getItem("VEX_GEM"), ANGEL_GEM, getItem("VEX_GEM"),
                        PHANTOM_SCALE, getItem("VEX_GEM"), PHANTOM_SCALE
                }).register(omc);
        new AngelGemT3(Categories.OMC_ITEMS, ANGEL_GEM_3, RecipeType.ANCIENT_ALTAR,
                new ItemStack[]{
                        SlimefunItems.ELYTRA_SCALE, SlimefunItems.AIR_RUNE, SlimefunItems.ELYTRA_SCALE,
                        getItem("VEX_GEM"), ANGEL_GEM_2, getItem("VEX_GEM"),
                        PHANTOM_SCALE, getItem("VEX_GEM"), PHANTOM_SCALE
                }).register(omc);
        //recursos
        new SlimefunItem(Categories.OMC_RESOURCES, SINGLE_COMPRESSED_OBSIDIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN),
                new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN),
                new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN)
        }).register(omc);
        new SlimefunItem(Categories.OMC_RESOURCES, DOUBLE_COMPRESSED_OBSIDIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                SINGLE_COMPRESSED_OBSIDIAN, SINGLE_COMPRESSED_OBSIDIAN, SINGLE_COMPRESSED_OBSIDIAN,
                SINGLE_COMPRESSED_OBSIDIAN, SINGLE_COMPRESSED_OBSIDIAN, SINGLE_COMPRESSED_OBSIDIAN,
                SINGLE_COMPRESSED_OBSIDIAN, SINGLE_COMPRESSED_OBSIDIAN, SINGLE_COMPRESSED_OBSIDIAN
        }).register(omc);
        new SlimefunItem(Categories.OMC_RESOURCES, TRIPLE_COMPRESSED_OBSIDIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                DOUBLE_COMPRESSED_OBSIDIAN, DOUBLE_COMPRESSED_OBSIDIAN, DOUBLE_COMPRESSED_OBSIDIAN,
                DOUBLE_COMPRESSED_OBSIDIAN, DOUBLE_COMPRESSED_OBSIDIAN, DOUBLE_COMPRESSED_OBSIDIAN,
                DOUBLE_COMPRESSED_OBSIDIAN, DOUBLE_COMPRESSED_OBSIDIAN, DOUBLE_COMPRESSED_OBSIDIAN
        }).register(omc);
        new SlimefunItem(Categories.OMC_RESOURCES, QUADRUPLE_COMPRESSED_OBSIDIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                TRIPLE_COMPRESSED_OBSIDIAN, TRIPLE_COMPRESSED_OBSIDIAN, TRIPLE_COMPRESSED_OBSIDIAN,
                TRIPLE_COMPRESSED_OBSIDIAN, TRIPLE_COMPRESSED_OBSIDIAN, TRIPLE_COMPRESSED_OBSIDIAN,
                TRIPLE_COMPRESSED_OBSIDIAN, TRIPLE_COMPRESSED_OBSIDIAN, TRIPLE_COMPRESSED_OBSIDIAN
        }).register(omc);
        new SlimefunItem(Categories.OMC_RESOURCES, QUINTUPLE_COMPRESSED_OBSIDIAN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                QUADRUPLE_COMPRESSED_OBSIDIAN, QUADRUPLE_COMPRESSED_OBSIDIAN, QUADRUPLE_COMPRESSED_OBSIDIAN,
                QUADRUPLE_COMPRESSED_OBSIDIAN, QUADRUPLE_COMPRESSED_OBSIDIAN, QUADRUPLE_COMPRESSED_OBSIDIAN,
                QUADRUPLE_COMPRESSED_OBSIDIAN, QUADRUPLE_COMPRESSED_OBSIDIAN, QUADRUPLE_COMPRESSED_OBSIDIAN
        }).register(omc);
        new SlimefunItem(Categories.OMC_RESOURCES, OBSIDIAN_PLATE, RecipeType.COMPRESSOR, new ItemStack[]{
                new ItemStack(Material.OBSIDIAN, 4), null, null,
                null, null, null,
                null, null, null
        }).register(omc);
        new SlimefunItem(Categories.OMC_RESOURCES, VOID_CORE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                getItem("VOID_INGOT"), getItem("VOID_INGOT"), getItem("VOID_INGOT"),
                getItem("VOID_INGOT"), QUADRUPLE_COMPRESSED_OBSIDIAN, getItem("VOID_INGOT"),
                getItem("VOID_INGOT"), getItem("VOID_INGOT"), getItem("VOID_INGOT")
        }).register(omc);
        new UnplaceableBlock(Categories.OMC_ITEMS, OBSIDIAN_GEAR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                null, OBSIDIAN_PLATE, null,
                OBSIDIAN_PLATE, new ItemStack(Material.STICK), OBSIDIAN_PLATE,
                null, OBSIDIAN_PLATE, null
        }).register(omc);
        new DragonScale(Categories.OMC_DROPS, DRAGON_SCALE, RecipeType.MOB_DROP, new ItemStack[]{
                null, null, null,
                null, new CustomItemStack(Material.ENDERMAN_SPAWN_EGG, "&aEnder dragon"), null,
                null, null, null
        }).register(omc);
        new PhantomScale(Categories.OMC_DROPS, PHANTOM_SCALE, RecipeType.MOB_DROP, new ItemStack[]{
                null, null, null,
                null, new CustomItemStack(Material.PHANTOM_SPAWN_EGG, "&aPhantom"), null,
                null, null, null
        }).register(omc);

        new UnplaceableBlock(Categories.OMC_FORGE_CHEAT, ADVANCED_VOID_CORE, ObsidianForge.TYPE, new ItemStack[]{
                SlimefunItems.WITHER_PROOF_OBSIDIAN, SlimefunItems.WITHER_PROOF_OBSIDIAN, SlimefunItems.WITHER_PROOF_OBSIDIAN, TRIPLE_COMPRESSED_OBSIDIAN, DOUBLE_COMPRESSED_OBSIDIAN, SlimefunItems.WITHER_PROOF_OBSIDIAN,
                DOUBLE_COMPRESSED_OBSIDIAN, QUINTUPLE_COMPRESSED_OBSIDIAN, DOUBLE_COMPRESSED_OBSIDIAN, SlimefunItems.EARTH_RUNE, QUINTUPLE_COMPRESSED_OBSIDIAN, SlimefunItems.WITHER_PROOF_OBSIDIAN,
                TRIPLE_COMPRESSED_OBSIDIAN, SlimefunItems.ENDER_RUNE, VOID_CORE, VOID_CORE, DOUBLE_COMPRESSED_OBSIDIAN, SlimefunItems.WITHER_PROOF_OBSIDIAN,
                SlimefunItems.WITHER_PROOF_OBSIDIAN, DOUBLE_COMPRESSED_OBSIDIAN, VOID_CORE, VOID_CORE, SlimefunItems.ENDER_RUNE, TRIPLE_COMPRESSED_OBSIDIAN,
                SlimefunItems.WITHER_PROOF_OBSIDIAN, QUINTUPLE_COMPRESSED_OBSIDIAN, SlimefunItems.EARTH_RUNE, DOUBLE_COMPRESSED_OBSIDIAN, QUINTUPLE_COMPRESSED_OBSIDIAN, DOUBLE_COMPRESSED_OBSIDIAN,
                SlimefunItems.WITHER_PROOF_OBSIDIAN, DOUBLE_COMPRESSED_OBSIDIAN, TRIPLE_COMPRESSED_OBSIDIAN, SlimefunItems.WITHER_PROOF_OBSIDIAN, SlimefunItems.WITHER_PROOF_OBSIDIAN, SlimefunItems.WITHER_PROOF_OBSIDIAN,
        }).register(omc);
        //armadura
        new Armor(Categories.OMC_FORGE_CHEAT, OBSIDIAN_HELMET, new PotionEffect[]{
                new PotionEffect(PotionEffectType.NIGHT_VISION, 600, 0, false, false, false),
                new PotionEffect(PotionEffectType.CONDUIT_POWER, 600, 0, false, false, false),
                new PotionEffect(PotionEffectType.WATER_BREATHING, 600, 0, false, false, false),
        }, new ItemStack[]{
                DRAGON_SCALE, getItem("VOID_INGOT"), getItem("VOID_INGOT"), getItem("VOID_INGOT"), getItem("VOID_INGOT"), DRAGON_SCALE,
                getItem("VOID_INGOT"), DRAGON_SCALE, ADVANCED_VOID_CORE, ADVANCED_VOID_CORE, DRAGON_SCALE, getItem("VOID_INGOT"),
                getItem("VOID_INGOT"), getItem("INFINITE_INGOT"), ADVANCED_VOID_CORE, ADVANCED_VOID_CORE, getItem("INFINITE_INGOT"), getItem("VOID_INGOT"),
                getItem("INFINITE_INGOT"), DRAGON_SCALE, getItem("INFINITE_INGOT"), getItem("INFINITE_INGOT"), DRAGON_SCALE, getItem("INFINITE_INGOT"),
                null, getItem("INFINITE_INGOT"), null, null, getItem("INFINITE_INGOT"), null,
                null, null, null, null, null, null,
        }, new Particle[]{Particle.HEART}).register(omc);
        new Armor(Categories.OMC_FORGE_CHEAT, OBSIDIAN_CHESTPLATE, new PotionEffect[]{
                new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 1, false, false, false),
                new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 1, false, false, false),
                new PotionEffect(PotionEffectType.SATURATION, 600, 3, false, false, false),
        }, new ItemStack[]{
                null, DRAGON_SCALE, null, null, DRAGON_SCALE, null,
                DRAGON_SCALE, getItem("VOID_INGOT"), getItem("VOID_INGOT"), getItem("VOID_INGOT"), getItem("VOID_INGOT"), DRAGON_SCALE,
                DRAGON_SCALE, getItem("VOID_INGOT"), ADVANCED_VOID_CORE, ADVANCED_VOID_CORE, getItem("VOID_INGOT"), DRAGON_SCALE,
                DRAGON_SCALE, getItem("INFINITE_INGOT"), ADVANCED_VOID_CORE, ADVANCED_VOID_CORE, getItem("INFINITE_INGOT"), DRAGON_SCALE,
                null, getItem("INFINITE_INGOT"), getItem("INFINITE_INGOT"), getItem("INFINITE_INGOT"), getItem("INFINITE_INGOT"), null,
                null, null, getItem("INFINITE_INGOT"), getItem("INFINITE_INGOT"), null, null
        }, new Particle[]{Particle.HEART}).register(omc);
        new Armor(Categories.OMC_FORGE_CHEAT, OBSIDIAN_LEGGINGS, new PotionEffect[]{
                new PotionEffect(PotionEffectType.FAST_DIGGING, 600, 2, false, false, false),
                new PotionEffect(PotionEffectType.REGENERATION, 600, 1, false, false, false),
                new PotionEffect(PotionEffectType.LUCK, 600, 1, false, false, false),
        }, new ItemStack[]{
                null, DRAGON_SCALE, getItem("VOID_INGOT"), getItem("VOID_INGOT"), DRAGON_SCALE, null,
                DRAGON_SCALE, ADVANCED_VOID_CORE, getItem("VOID_INGOT"), getItem("VOID_INGOT"), ADVANCED_VOID_CORE, DRAGON_SCALE,
                DRAGON_SCALE, getItem("VOID_INGOT"), getItem("INFINITE_INGOT"), getItem("INFINITE_INGOT"), getItem("VOID_INGOT"), DRAGON_SCALE,
                DRAGON_SCALE, getItem("VOID_INGOT"), null, null, getItem("VOID_INGOT"), DRAGON_SCALE,
                DRAGON_SCALE, getItem("VOID_INGOT"), null, null, getItem("VOID_INGOT"), DRAGON_SCALE,
                null, getItem("INFINITE_INGOT"), null, null, getItem("INFINITE_INGOT"), null
        }, new Particle[]{Particle.HEART}).register(omc);
        new Armor(Categories.OMC_FORGE_CHEAT, OBSIDIAN_BOOTS, new PotionEffect[]{
                new PotionEffect(PotionEffectType.SPEED, 600, 0, false, false, false),
                new PotionEffect(PotionEffectType.JUMP, 600, 2, false, false, false),
                new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 600, 2, false, false, false),
                new PotionEffect(PotionEffectType.HEALTH_BOOST, 600, 0, false, false, false),
        }, new ItemStack[]{
                DRAGON_SCALE, DRAGON_SCALE, null, null, DRAGON_SCALE, DRAGON_SCALE,
                DRAGON_SCALE, ADVANCED_VOID_CORE, null, null, ADVANCED_VOID_CORE, DRAGON_SCALE,
                DRAGON_SCALE, getItem("INFINITE_INGOT"), null, null, getItem("INFINITE_INGOT"), DRAGON_SCALE,
                getItem("VOID_INGOT"), getItem("VOID_INGOT"), null, null, getItem("VOID_INGOT"), getItem("VOID_INGOT"),
                getItem("VOID_INGOT"), getItem("VOID_INGOT"), null, null, getItem("VOID_INGOT"), getItem("VOID_INGOT"),
                getItem("INFINITE_INGOT"), getItem("INFINITE_INGOT"), null, null, getItem("INFINITE_INGOT"), getItem("INFINITE_INGOT")
        }, new Particle[]{Particle.HEART}).register(omc);
    }
    static {
        ItemMeta meta = OBSIDIAN_HELMET.getItemMeta();
        meta.setUnbreakable(true);

        OBSIDIAN_HELMET.setItemMeta(meta);
        OBSIDIAN_HELMET.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 30);
        OBSIDIAN_HELMET.addUnsafeEnchantment(Enchantment.THORNS, 10);
        OBSIDIAN_HELMET.addUnsafeEnchantment(Enchantment.WATER_WORKER, 10);

    }
    static {
        ItemMeta chestMeta = OBSIDIAN_CHESTPLATE.getItemMeta();
        chestMeta.setUnbreakable(true);

        OBSIDIAN_CHESTPLATE.setItemMeta(chestMeta);
        OBSIDIAN_CHESTPLATE.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 30);
        OBSIDIAN_CHESTPLATE.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 30);
        OBSIDIAN_CHESTPLATE.addUnsafeEnchantment(Enchantment.THORNS, 10);
    }
    static {
        ItemMeta legsMeta = OBSIDIAN_LEGGINGS.getItemMeta();
        legsMeta.setUnbreakable(true);
        OBSIDIAN_LEGGINGS.setItemMeta(legsMeta);
        OBSIDIAN_LEGGINGS.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 30);
        OBSIDIAN_LEGGINGS.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 30);
        OBSIDIAN_LEGGINGS.addUnsafeEnchantment(Enchantment.THORNS, 10);
    }
    static {
        ItemMeta bootsMeta = OBSIDIAN_BOOTS.getItemMeta();
        bootsMeta.setUnbreakable(true);
        OBSIDIAN_BOOTS.setItemMeta(bootsMeta);
        OBSIDIAN_BOOTS.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 30);
        OBSIDIAN_BOOTS.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 30);
        OBSIDIAN_BOOTS.addUnsafeEnchantment(Enchantment.THORNS, 10);
    }
    @Nullable
    private static ItemStack getItem(@Nonnull String id) {
        SlimefunItem item = SlimefunItem.getById(id);
        return item != null ? item.getItem() : null;
    }
}