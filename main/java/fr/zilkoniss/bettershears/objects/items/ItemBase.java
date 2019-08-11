package fr.zilkoniss.bettershears.objects.items;

import fr.zilkoniss.bettershears.BetterShearsMod;
import fr.zilkoniss.bettershears.init.ItemsMod;
import fr.zilkoniss.bettershears.util.interfaces.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name) 
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setMaxStackSize(1);
        
        ItemsMod.ITEMS.add(this);
    }

    @Override
    public void registerModels() 
    {
        BetterShearsMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
