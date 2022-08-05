package fr.silenthill99.sonicmod.init.entities.sonic;

import fr.silenthill99.sonicmod.Main;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SonicRenderer extends MobRenderer<Sonic, SonicModel<Sonic>>
{
    public static final ResourceLocation TEXTURE = new ResourceLocation(Main.MODID, "textures/entities/soniclehrisson.png");

    public SonicRenderer(EntityRendererManager manager)
    {
        super(manager, new SonicModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(Sonic p_110775_1_)
    {
        return TEXTURE;
    }
}
