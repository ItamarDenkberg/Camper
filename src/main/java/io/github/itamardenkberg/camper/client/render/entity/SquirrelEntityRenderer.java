package io.github.itamardenkberg.camper.client.render.entity;

import io.github.itamardenkberg.camper.Camper;
import io.github.itamardenkberg.camper.client.render.model.SquirrelEntityModel;
import io.github.itamardenkberg.camper.common.entities.passive.SquirrelEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SquirrelEntityRenderer extends MobRenderer<SquirrelEntity, SquirrelEntityModel<SquirrelEntity>> {
	public static  final ResourceLocation TEXTURE = new ResourceLocation(Camper.MOD_ID, "textures/entity/squirrel.png");
	
	public SquirrelEntityRenderer(EntityRendererManager manager) {
		super(manager, new SquirrelEntityModel<>(), 0.7f);
	}

	@Override
	public ResourceLocation getEntityTexture(SquirrelEntity entity) {
		return TEXTURE;
	}
}