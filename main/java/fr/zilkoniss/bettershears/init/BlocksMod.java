package fr.zilkoniss.bettershears.init;

import java.util.ArrayList;
import java.util.List;

import fr.zilkoniss.bettershears.BetterShearsMod;
import fr.zilkoniss.bettershears.objects.blocks.BlockAmethystOre;
import fr.zilkoniss.bettershears.objects.blocks.BlockBase;
import fr.zilkoniss.bettershears.objects.blocks.BlockRubyOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlocksMod
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    
    public static final Block RUBY_ORE = new BlockRubyOre("ruby_ore", Material.ROCK, BetterShearsMod.BETTERSHEARSTAB).setHardness(4.0F);
    public static final Block AMETHYST_ORE = new BlockAmethystOre("amethyst_ore", Material.ROCK, BetterShearsMod.BETTERSHEARSTAB).setHardness(2.5F);
    
    public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON, BetterShearsMod.BETTERSHEARSTAB).setHardness(3.5F);
    public static final Block AMETHYST_BLOCK = new BlockBase("amethyst_block", Material.IRON, BetterShearsMod.BETTERSHEARSTAB).setHardness(3.0F);
}
