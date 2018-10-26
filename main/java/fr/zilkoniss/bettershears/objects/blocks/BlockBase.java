package fr.zilkoniss.bettershears.objects.blocks;

import fr.zilkoniss.bettershears.BetterShearsMod;
import fr.zilkoniss.bettershears.init.BlocksMod;
import fr.zilkoniss.bettershears.init.ItemsMod;
import fr.zilkoniss.bettershears.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
    public BlockBase(String name, Material material, CreativeTabs tab) 
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        
        BlocksMod.BLOCKS.add(this);
        ItemsMod.ITEMS.add(new ItemBlock(this).setRegistryName(name));
    }
    
    @Override
    public void registerModels() 
    {
        BetterShearsMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}