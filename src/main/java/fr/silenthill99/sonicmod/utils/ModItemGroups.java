package fr.silenthill99.sonicmod.utils;

import fr.silenthill99.sonicmod.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups {

    public static final ItemGroup sonic = new ItemGroup("sonic") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SONIC_THE_HEDGEHOG_SPAWN_EGG.get());
        }
    };
}
