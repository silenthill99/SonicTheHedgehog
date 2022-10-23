package fr.silenthill99.sonicmod.init.entities.tails;

import fr.silenthill99.sonicmod.Main;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class TailsRenderer extends MobRenderer<Tails, TailsModel<Tails>> {

    public static final ResourceLocation TEXTURE = new ResourceLocation(Main.MODID, "textures/entities/tails.png");

    public TailsRenderer(EntityRendererManager manager) {
        super(manager, new TailsModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(Tails p_110775_1_) {
        return TEXTURE;
    }
}
