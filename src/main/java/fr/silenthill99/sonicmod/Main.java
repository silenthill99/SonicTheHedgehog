package fr.silenthill99.sonicmod;

import fr.silenthill99.sonicmod.init.ModEntityTypes;
import fr.silenthill99.sonicmod.init.ModItems;
import fr.silenthill99.sonicmod.init.entities.amy.Amy;
import fr.silenthill99.sonicmod.init.entities.amy.AmyRenderer;
import fr.silenthill99.sonicmod.init.entities.knuckles.Knuckles;
import fr.silenthill99.sonicmod.init.entities.knuckles.KnucklesRenderer;
import fr.silenthill99.sonicmod.init.entities.sonic.Sonic;
import fr.silenthill99.sonicmod.init.entities.sonic.SonicRenderer;
import fr.silenthill99.sonicmod.init.entities.tails.Tails;
import fr.silenthill99.sonicmod.init.entities.tails.TailsRenderer;
import fr.silenthill99.sonicmod.utils.ModSoundEvents;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MODID)
public class Main {

    public static final String MODID = "sonic_mod";

    public Main()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(this::clientSetup);
        bus.addListener(this::onEntityAttributeCreation);
        ModItems.ITEMS.register(bus);
        ModEntityTypes.ENTITY_TYPE.register(bus);
        ModSoundEvents.SOUND_EVENT.register(bus);
    }

    private void setup(FMLCommonSetupEvent event)
    {
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.SONIC.get(), SonicRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.AMY.get(), AmyRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.KNUCKLES.get(), KnucklesRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.TAILS.get(), TailsRenderer::new);
    }

    private void clientSetup(FMLClientSetupEvent event)
    {

    }

    private void onEntityAttributeCreation(EntityAttributeCreationEvent event)
    {
        event.put(ModEntityTypes.SONIC.get(), Sonic.createAttributes().build());
        event.put(ModEntityTypes.AMY.get(), Amy.createAttributes().build());
        event.put(ModEntityTypes.KNUCKLES.get(), Knuckles.createAttributes().build());
        event.put(ModEntityTypes.TAILS.get(), Tails.createMobAttributes().build());
    }
}
