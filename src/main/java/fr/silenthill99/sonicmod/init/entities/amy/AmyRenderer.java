package fr.silenthill99.sonicmod.init.entities.amy;

import fr.silenthill99.sonicmod.Main;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class AmyRenderer extends MobRenderer<Amy, AmyModel<Amy>>
{

    public static final ResourceLocation TEXTURE = new ResourceLocation(Main.MODID, "textures/entities/amy.png");

    public AmyRenderer(EntityRendererManager p_i50961_1_) {
        super(p_i50961_1_, new AmyModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(Amy p_110775_1_) {
        return TEXTURE;
    }
}
