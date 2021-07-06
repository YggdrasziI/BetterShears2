package fr.yggdraszil.bettershears2.core.init;

import fr.yggdraszil.bettershears2.BetterShearsMod2;
import fr.yggdraszil.bettershears2.core.itemtab.BetterShears2Tab;
import fr.yggdraszil.bettershears2.objects.tools.ToolBetterShears2;
import fr.yggdraszil.bettershears2.objects.tools.ToolInfiniteShears;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterShearsMod2.MOD_ID);
    
    public static final RegistryObject<Item> UNFIRED_CLAY_SHEARS = ITEMS.register("unfired_clay_shears", () -> new ToolBetterShears2(new Item.Properties().stacksTo(1).tab(BetterShears2Tab.BETTERSHEARS2_MOD)));
    
    public static final RegistryObject<Item> WOODEN_SHEARS = ITEMS.register("wooden_shears", () -> new ToolBetterShears2(new Item.Properties().stacksTo(1).durability(47).tab(BetterShears2Tab.BETTERSHEARS2_MOD)));
    public static final RegistryObject<Item> FLINT_SHEARS = ITEMS.register("flint_shears", () -> new ToolBetterShears2(new Item.Properties().stacksTo(1).durability(119).tab(BetterShears2Tab.BETTERSHEARS2_MOD)));
    public static final RegistryObject<Item> GOLD_SHEARS = ITEMS.register("gold_shears", () -> new ToolBetterShears2(new Item.Properties().stacksTo(1).durability(20).tab(BetterShears2Tab.BETTERSHEARS2_MOD)));
    public static final RegistryObject<Item> CLAY_SHEARS = ITEMS.register("clay_shears", () -> new ToolBetterShears2(new Item.Properties().stacksTo(1).durability(201).tab(BetterShears2Tab.BETTERSHEARS2_MOD)));
    public static final RegistryObject<Item> LAPIS_SHEARS = ITEMS.register("lapis_shears", () -> new ToolBetterShears2(new Item.Properties().stacksTo(1).durability(388).tab(BetterShears2Tab.BETTERSHEARS2_MOD)));
    public static final RegistryObject<Item> DIAMOND_SHEARS = ITEMS.register("diamond_shears", () -> new ToolBetterShears2(new Item.Properties().stacksTo(1).durability(1549).tab(BetterShears2Tab.BETTERSHEARS2_MOD)));
    public static final RegistryObject<Item> OBSIDIAN_SHEARS = ITEMS.register("obsidian_shears", () -> new ToolBetterShears2(new Item.Properties().stacksTo(1).durability(1245).tab(BetterShears2Tab.BETTERSHEARS2_MOD)));
    public static final RegistryObject<Item> EMERALD_SHEARS = ITEMS.register("emerald_shears", () -> new ToolBetterShears2(new Item.Properties().stacksTo(1).durability(1879).tab(BetterShears2Tab.BETTERSHEARS2_MOD)));
    public static final RegistryObject<Item> NETHERITE_SHEARS = ITEMS.register("netherite_shears", () -> new ToolBetterShears2(new Item.Properties().stacksTo(1).durability(2029).tab(BetterShears2Tab.BETTERSHEARS2_MOD)));
    public static final RegistryObject<Item> STAR_SHEARS = ITEMS.register("star_shears", () -> new ToolInfiniteShears(new Item.Properties().stacksTo(1).durability(0).tab(BetterShears2Tab.BETTERSHEARS2_MOD)));
}
