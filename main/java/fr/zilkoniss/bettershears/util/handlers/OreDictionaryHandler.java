package fr.zilkoniss.bettershears.util.handlers;

import fr.zilkoniss.bettershears.init.ItemsMod;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler
{
    public static void registerOreDictionary()
    {
        OreDictionary.registerOre("planks", Blocks.PLANKS);
        OreDictionary.registerOre("coal", Items.COAL);
        OreDictionary.registerOre("dustRedstone", Items.REDSTONE);
        OreDictionary.registerOre("ingotIron", Items.IRON_INGOT);
        OreDictionary.registerOre("ingotGold", Items.GOLD_INGOT);
        OreDictionary.registerOre("gemDiamond", Items.DIAMOND);
        OreDictionary.registerOre("gemEmerald", Items.EMERALD);
        
        OreDictionary.registerOre("oreCoal", Blocks.COAL_ORE);
        OreDictionary.registerOre("oreIron", Blocks.IRON_ORE);
        OreDictionary.registerOre("oreGold", Blocks.GOLD_ORE);
        OreDictionary.registerOre("oreRedstone", Blocks.REDSTONE_ORE);
        OreDictionary.registerOre("oreDiamond", Blocks.DIAMOND_ORE);
        OreDictionary.registerOre("oreLapis", Blocks.LAPIS_ORE);
        OreDictionary.registerOre("oreEmerald", Blocks.EMERALD_ORE);
    }
}