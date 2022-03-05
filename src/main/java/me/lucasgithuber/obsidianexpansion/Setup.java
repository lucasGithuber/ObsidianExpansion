package me.lucasgithuber.obsidianexpansion;

import me.lucasgithuber.obsidianexpansion.machines.NetheriteGen;
import me.lucasgithuber.obsidianexpansion.utils.Categories;


public class Setup {
    public static void setup(ObsidianExpansion omc) {
        // Category
        Categories.setup(omc);
        Items.setup(omc);
        new NetheriteGen(Categories.OMC_MACHINES).register(omc);
    }
}