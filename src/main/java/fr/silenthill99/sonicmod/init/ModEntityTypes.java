package fr.silenthill99.sonicmod.init;

import fr.silenthill99.sonicmod.Main;
import fr.silenthill99.sonicmod.init.entities.sonic.Sonic;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes
{

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE = DeferredRegister.create(ForgeRegistries.ENTITIES, Main.MODID);

    public static final RegistryObject<EntityType<Sonic>> SONIC = ENTITY_TYPE.register("sonic_the_hedgehog", () -> EntityType.Builder.of(Sonic::new, EntityClassification.AMBIENT).sized(1.0f, 2.0f).build(new ResourceLocation(Main.MODID,"sonic_the_hedgehog").toString()));

}
