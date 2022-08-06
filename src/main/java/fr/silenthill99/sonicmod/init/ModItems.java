package fr.silenthill99.sonicmod.init;

import fr.silenthill99.sonicmod.Main;
import fr.silenthill99.sonicmod.utils.CustomArmorMaterial;
import fr.silenthill99.sonicmod.utils.CustomItemTiers;
import fr.silenthill99.sonicmod.utils.ModItemGroups;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.util.WeightedRandom;
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
    public static final RegistryObject<Item> TEST_HELMET = ITEMS.register("test_helmet", () -> new ArmorItem(CustomArmorMaterial.TEST, EquipmentSlotType.HEAD, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> TEST_CHESTPLATE = ITEMS.register("test_chestplate", () -> new ArmorItem(CustomArmorMaterial.TEST, EquipmentSlotType.CHEST, new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_MATERIALS)));


}
