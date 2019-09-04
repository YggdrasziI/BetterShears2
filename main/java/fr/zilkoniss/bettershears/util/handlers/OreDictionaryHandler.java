package fr.zilkoniss.bettershears.util.handlers;

import fr.zilkoniss.bettershears.init.ItemsMod;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler
{
    public static void registerOreDictionary()
    {       
        OreDictionary.registerOre("toolShears", ItemsMod.WOODEN_SHEARS);
        OreDictionary.registerOre("toolShears", ItemsMod.FLINT_SHEARS);
        OreDictionary.registerOre("toolShears", ItemsMod.GOLD_SHEARS);
        OreDictionary.registerOre("toolShears", ItemsMod.CLAY_SHEARS);
        OreDictionary.registerOre("toolShears", ItemsMod.DIAMOND_SHEARS);
        OreDictionary.registerOre("toolShears", ItemsMod.OBSIDIAN_SHEARS);
        OreDictionary.registerOre("toolShears", ItemsMod.EMERALD_SHEARS);
        OreDictionary.registerOre("toolShears", ItemsMod.STAR_SHEARS);
    }
}