package fr.silenthill99.sonicmod.init.entities.knuckles;

import fr.silenthill99.sonicmod.Main;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class KnucklesRenderer extends MobRenderer<Knuckles, KnucklesModel<Knuckles>> {

    public static final ResourceLocation TEXTURE = new ResourceLocation(Main.MODID, "textures/entities/knuckles.png");

    public KnucklesRenderer(EntityRendererManager manager) {
        super(manager, new KnucklesModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(Knuckles p_110775_1_) {
        return TEXTURE;
    }
}
