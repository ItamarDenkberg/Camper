package io.github.itamardenkberg.camper.client.render.entity;

import io.github.itamardenkberg.camper.Camper;
import io.github.itamardenkberg.camper.client.render.model.SquirrelEntityModel;
import io.github.itamardenkberg.camper.common.entities.passive.SquirrelEntity;
import io.github.itamardenkberg.camper.core.util.ClientEventBusSubscriber;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SquirrelEntityRenderer extends MobRenderer<SquirrelEntity, SquirrelEntityModel<SquirrelEntity>> {
	public static final ResourceLocation TEXTURE = new ResourceLocation(Camper.MOD_ID, "textures/entity/squirrel.png");

	public SquirrelEntityRenderer(EntityRendererProvider.Context context) {
		super(context,
				new SquirrelEntityModel<SquirrelEntity>(context.bakeLayer(ClientEventBusSubscriber.SQUIRREL_LAYER)),
				0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(SquirrelEntity p_114482_) {
		return TEXTURE;
	}
}