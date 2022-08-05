package fr.silenthill99.sonicmod.init.entities.sonic;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.world.World;

public class Sonic extends CreatureEntity
{
    public Sonic(EntityType<? extends CreatureEntity> type, World worldIn)
    {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute createAttributes()
    {
        return CreatureEntity.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 20.0f)
                .add(Attributes.MOVEMENT_SPEED, 1.0f);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2f, false));
        this.goalSelector.addGoal(2, new RandomWalkingGoal(this, 1));
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
        this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
        this.goalSelector.addGoal(5, new SwimGoal(this));
    }
}
