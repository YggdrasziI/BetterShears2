package fr.zilkoniss.bettershears.objects.tools;

import fr.zilkoniss.bettershears.BetterShearsMod;
import fr.zilkoniss.bettershears.init.ItemsMod;
import fr.zilkoniss.bettershears.util.interfaces.IHasModel;
import net.minecraft.item.ItemShears;

public class ToolEmeraldShears extends ItemShears implements IHasModel
{
    public ToolEmeraldShears(String name)
    {
        this.setMaxStackSize(1);
        this.setMaxDamage(1203);
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
