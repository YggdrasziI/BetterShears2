package fr.zilkoniss.bettershears.util.handlers;

import net.minecraft.init.Blocks;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler
{
    public static void registerOreDictionary()
    {
        OreDictionary.registerOre("planks", Blocks.PLANKS);
    }
}
