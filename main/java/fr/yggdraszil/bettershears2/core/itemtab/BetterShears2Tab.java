package fr.yggdraszil.bettershears2.core.itemtab;

import fr.yggdraszil.bettershears2.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class BetterShears2Tab extends ItemGroup
{
    public static final BetterShears2Tab BETTERSHEARS2_MOD = new BetterShears2Tab(ItemGroup.getGroupCountSafe(), "bettershears2_mod");

    public BetterShears2Tab(int p_i1853_1_, String p_i1853_2_)
    {
        super(p_i1853_1_, p_i1853_2_);
    }

    @Override
    public ItemStack makeIcon()
    {
        return new ItemStack(ItemInit.STAR_SHEARS.get());
    }
}
