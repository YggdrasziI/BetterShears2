package fr.zilkoniss.bettershears.util.handlers;

import fr.zilkoniss.bettershears.init.ItemsMod;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler
{
    public static void registerSmelting()
    {
        GameRegistry.addSmelting(ItemsMod.UNFIRED_CLAY_SHEARS, new ItemStack(ItemsMod.CLAY_SHEARS, 1), 0.2F);
    }
}
