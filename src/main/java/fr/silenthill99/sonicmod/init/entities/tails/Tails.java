package fr.silenthill99.sonicmod.init.entities.tails;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.world.World;


public class Tails extends CreatureEntity
{
    public Tails(EntityType<? extends CreatureEntity> type, World worldIn)
    {
        super(type, worldIn);
    }

    public AttributeModifierMap.MutableAttribute createAttributes()
    {
    return CreatureEntity.createMobAttributes()
            .add(Attributes.MAX_HEALTH, 20.0f)
            .add(Attributes.MOVEMENT_SPEED, 0.3f);
    }
}
