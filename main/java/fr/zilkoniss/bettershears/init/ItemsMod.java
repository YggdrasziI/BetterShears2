package fr.zilkoniss.bettershears.init;

import java.util.ArrayList;
import java.util.List;

import fr.zilkoniss.bettershears.BetterShearsMod;
import fr.zilkoniss.bettershears.objects.items.ItemBase;
import fr.zilkoniss.bettershears.objects.tools.ToolDiamondShears;
import fr.zilkoniss.bettershears.objects.tools.ToolEmeraldShears;
import fr.zilkoniss.bettershears.objects.tools.ToolGoldShears;
import fr.zilkoniss.bettershears.objects.tools.ToolObsidianShears;
import fr.zilkoniss.bettershears.objects.tools.ToolStoneShears;
import fr.zilkoniss.bettershears.objects.tools.ToolWoodenShears;
import net.minecraft.item.Item;

public class ItemsMod
{
    public static final List<Item> ITEMS = new ArrayList<Item>();
    
    public static final Item WOODEN_SHEARS = new ToolWoodenShears("wooden_shears").setCreativeTab(BetterShearsMod.BETTERSHEARSTAB);
    public static final Item STONE_SHEARS = new ToolStoneShears("stone_shears").setCreativeTab(BetterShearsMod.BETTERSHEARSTAB);
    public static final Item GOLD_SHEARS = new ToolGoldShears("gold_shears").setCreativeTab(BetterShearsMod.BETTERSHEARSTAB);
    public static final Item DIAMOND_SHEARS = new ToolDiamondShears("diamond_shears").setCreativeTab(BetterShearsMod.BETTERSHEARSTAB);
    public static final Item OBSIDIAN_SHEARS = new ToolObsidianShears("obsidian_shears").setCreativeTab(BetterShearsMod.BETTERSHEARSTAB);
    public static final Item EMERALD_SHEARS = new ToolEmeraldShears("emerald_shears").setCreativeTab(BetterShearsMod.BETTERSHEARSTAB);
}