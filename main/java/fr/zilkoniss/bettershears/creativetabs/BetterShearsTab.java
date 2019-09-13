package fr.zilkoniss.bettershears.creativetabs;

import fr.zilkoniss.bettershears.init.ItemsMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BetterShearsTab extends CreativeTabs
{
    public BetterShearsTab(String label)
    { 
        super("bettershearstab"); 
    }
    
    public ItemStack getTabIconItem() 
    { 
        return new ItemStack(ItemsMod.STAR_SHEARS);
    }
}
