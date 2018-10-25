package fr.zilkoniss.bettershears;

import fr.zilkoniss.bettershears.creativetabs.BetterShearsTab;
import fr.zilkoniss.bettershears.proxy.CommonProxy;
import fr.zilkoniss.bettershears.util.Reference;
import fr.zilkoniss.bettershears.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class BetterShearsMod 
{
    @Instance
    public static BetterShearsMod instance;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
    public static CommonProxy proxy;
    
    public static final CreativeTabs BETTERSHEARSTAB = new BetterShearsTab("bettershearstab");
    
    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) 
    {
        RegistryHandler.preInitRegistries();
    }
    
    @EventHandler
    public static void init(FMLInitializationEvent event) 
    {
        
    }
    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) 
    {
        
    }
}
