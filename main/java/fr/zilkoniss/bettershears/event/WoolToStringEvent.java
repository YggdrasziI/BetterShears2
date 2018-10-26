package fr.zilkoniss.bettershears.event;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class WoolToStringEvent
{
    @SubscribeEvent
    public static void onHarvest(BlockEvent.HarvestDropsEvent event)
    {
        if (event.getHarvester() != null)
        {
            List<ItemStack> drops = event.getDrops();
            if(drops!=null && drops.size()>0) {
                BlockPos pos = event.getPos();
                IBlockState blockstate = event.getWorld().getBlockState(pos);
                Block block = blockstate.getBlock();
                if(block instanceof BlockDirt) {
                    drops.add(new ItemStack(Item.REGISTRY.getObject(new ResourceLocation("minecraft", "string"))));
                }
            }
        }
    }
}
