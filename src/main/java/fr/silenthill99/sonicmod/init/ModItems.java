package fr.silenthill99.sonicmod.init;

import fr.silenthill99.sonicmod.Main;
import fr.silenthill99.sonicmod.utils.CustomItemTiers;
import fr.silenthill99.sonicmod.utils.ModItemGroups;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    public static final RegistryObject<ForgeSpawnEggItem> SONIC_THE_HEDGEHOG_SPAWN_EGG = ITEMS.register("sonic_the_hedgehog_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.SONIC, 0x0033CC, 0xcccc00, new Item.Properties().tab(ModItemGroups.sonic)));
    public static final RegistryObject<ForgeSpawnEggItem> AMY_ROSE_SPAWN_EGG = ITEMS.register("amy_rose_spawn_egg", () -> new ForgeSpawnEggItem(ModEntityTypes.AMY, 0xFF0099, 0x404040, new Item.Properties().tab(ModItemGroups.sonic)));

    public static final RegistryObject<Item> PIKO_PIKO_HAMMER = ITEMS.register("piko_piko_hammer", () -> new SwordItem(CustomItemTiers.PIKO_PIKO_HAMMER, 4, -1.0f, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_MATERIALS)));

}
