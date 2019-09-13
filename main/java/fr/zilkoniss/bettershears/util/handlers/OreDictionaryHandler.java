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
        OreDictionary.registerOre("toolShearsWooden", ItemsMod.WOODEN_SHEARS);
        OreDictionary.registerOre("toolShears", ItemsMod.FLINT_SHEARS);
        OreDictionary.registerOre("toolShearsFlint", ItemsMod.FLINT_SHEARS);
        OreDictionary.registerOre("toolShears", ItemsMod.GOLD_SHEARS);
        OreDictionary.registerOre("toolShearsGold", ItemsMod.GOLD_SHEARS);
        OreDictionary.registerOre("toolShears", ItemsMod.CLAY_SHEARS);
        OreDictionary.registerOre("toolShearsClay", ItemsMod.CLAY_SHEARS);
        OreDictionary.registerOre("toolShears", ItemsMod.DIAMOND_SHEARS);
        OreDictionary.registerOre("toolShearsDiamond", ItemsMod.DIAMOND_SHEARS);
        OreDictionary.registerOre("toolShears", ItemsMod.OBSIDIAN_SHEARS);
        OreDictionary.registerOre("toolShearsObsidian", ItemsMod.OBSIDIAN_SHEARS);
        OreDictionary.registerOre("toolShears", ItemsMod.EMERALD_SHEARS);
        OreDictionary.registerOre("toolShearsEmerald", ItemsMod.EMERALD_SHEARS);
        OreDictionary.registerOre("toolShears", ItemsMod.STAR_SHEARS);
        OreDictionary.registerOre("toolShearsStar", ItemsMod.STAR_SHEARS);
        OreDictionary.registerOre("toolShearsInfinite", ItemsMod.STAR_SHEARS);
    }
}