package fr.yggdraszil.bettershears2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.yggdraszil.bettershears2.core.init.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("bettershears2")
@Mod.EventBusSubscriber(modid = BetterShearsMod2.MOD_ID, bus = Bus.MOD)
public class BetterShearsMod2
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "bettershears2";

    public BetterShearsMod2()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(this::doClientStuff);
        
        ItemInit.ITEMS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }
    
    private void setup(final FMLCommonSetupEvent event)
    {
        
    }

    private void doClientStuff(final FMLClientSetupEvent event) 
    {
        
    }
}