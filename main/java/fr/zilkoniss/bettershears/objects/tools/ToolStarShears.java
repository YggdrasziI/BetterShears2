package fr.zilkoniss.bettershears.objects.tools;

import fr.zilkoniss.bettershears.BetterShearsMod;
import fr.zilkoniss.bettershears.init.ItemsMod;
import fr.zilkoniss.bettershears.util.interfaces.IHasModel;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ToolStarShears extends ItemShears implements IHasModel
{
    public ToolStarShears(String name)
    {
        this.setMaxStackSize(1);
        this.setMaxDamage(1000000000);
        setUnlocalizedName(name);
        setRegistryName(name);
        
        ItemsMod.ITEMS.add(this);
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
    
    @Override
    public void registerModels() 
    {
        BetterShearsMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
