package fr.zilkoniss.bettershears.objects.blocks;

import java.util.Random;

import fr.zilkoniss.bettershears.BetterShearsMod;
import fr.zilkoniss.bettershears.init.BlocksMod;
import fr.zilkoniss.bettershears.init.ItemsMod;
import fr.zilkoniss.bettershears.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockRubyOre extends Block implements IHasModel
{
    public BlockRubyOre(String name, Material material, CreativeTabs tab) 
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        setHarvestLevel("pickaxe", 3);
        
        BlocksMod.BLOCKS.add(this);
        ItemsMod.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }
    
    /**
     * Get the Item that this Block should drop when harvested.
     */
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ItemsMod.RUBY;
    }

    /**
     * Get the quantity dropped based on the given fortune level
     */
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        return this.quantityDropped(random) + random.nextInt(fortune + 1);
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random random)
    {
        return 1 + random.nextInt(2);
    }

    /**
     * Spawns this Block's drops into the World as EntityItems.
     */
    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune)
    {
        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
    }
    
    @Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
    {
        if (this.getItemDropped(state, RANDOM, fortune) != Item.getItemFromBlock(this))
        {
            return 25 + RANDOM.nextInt(5);
        }
        return 0;
    }
    
    @Override
    public void registerModels() 
    {
        BetterShearsMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}