package fr.zilkoniss.bettershears.objects.tools;

import java.util.List;

import fr.zilkoniss.bettershears.BetterShearsMod;
import fr.zilkoniss.bettershears.init.ItemsMod;
import fr.zilkoniss.bettershears.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ToolWoodenShears extends ItemShears implements IHasModel
{
    public ToolWoodenShears(String name)
    {
        this.setMaxStackSize(1);
        this.setMaxDamage(9);
        setUnlocalizedName(name);
        setRegistryName(name);
        
        ItemsMod.ITEMS.add(this);
    }
    
    @Override
    public void registerModels() 
    {
        BetterShearsMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
