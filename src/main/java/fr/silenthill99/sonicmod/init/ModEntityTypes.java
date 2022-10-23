package fr.silenthill99.sonicmod.init;

import fr.silenthill99.sonicmod.Main;
import fr.silenthill99.sonicmod.init.entities.amy.Amy;
import fr.silenthill99.sonicmod.init.entities.knuckles.Knuckles;
import fr.silenthill99.sonicmod.init.entities.sonic.Sonic;
import fr.silenthill99.sonicmod.init.entities.tails.Tails;
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
    public static final RegistryObject<EntityType<Amy>> AMY = ENTITY_TYPE.register("amy_rose", () -> EntityType.Builder.of(Amy::new, EntityClassification.AMBIENT).sized(1.0f, 2.0f).build(new ResourceLocation(Main.MODID, "amy_rose").toString()));
    public static final RegistryObject<EntityType<Knuckles>> KNUCKLES = ENTITY_TYPE.register("knuckles", () -> EntityType.Builder.of(Knuckles::new, EntityClassification.AMBIENT).sized(1.0f, 2.0f).build(new ResourceLocation(Main.MODID, "knuckles").toString()));
    public static final RegistryObject<EntityType<Tails>> TAILS = ENTITY_TYPE.register("miles_tails_prower", () -> EntityType.Builder.of(Tails::new, EntityClassification.AMBIENT).sized(1.0f, 2.0f).build(new ResourceLocation(Main.MODID + "miles_tails_prower").toString()));

}
