package io.github.itamardenkberg.camper.client.render.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import io.github.itamardenkberg.camper.common.entities.passive.SquirrelEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings

public class SquirrelEntityModel<T extends SquirrelEntity> extends EntityModel<SquirrelEntity> {
	private final ModelRenderer head;
	private final ModelRenderer nose;
	private final ModelRenderer left_ear;
	private final ModelRenderer right_ear;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_thigh;
	private final ModelRenderer right_thigh;
	private final ModelRenderer left_foot;
	private final ModelRenderer right_foot;
	private final ModelRenderer tail;

	public SquirrelEntityModel() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 16.5F, -3.0F);
		head.setTextureOffset(22, 0).addBox(-2.5F, -3.5F, -5.0F, 5.0F, 4.0F, 4.0F, 0.0F, false);

		nose = new ModelRenderer(this);
		nose.setRotationPoint(0.0F, 16.5F, -3.0F);
		nose.setTextureOffset(0, 7).addBox(-1.5F, -1.5F, -6.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		left_ear = new ModelRenderer(this);
		left_ear.setRotationPoint(0.0F, 16.5F, -3.0F);
		setRotationAngle(left_ear, 0.0F, 0.2618F, 0.0F);
		left_ear.setTextureOffset(11, 15).addBox(0.7588F, -5.5F, -1.9659F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		right_ear = new ModelRenderer(this);
		right_ear.setRotationPoint(0.0F, 16.5F, -3.0F);
		setRotationAngle(right_ear, 0.0F, -0.2618F, 0.0F);
		right_ear.setTextureOffset(0, 15).addBox(-2.7588F, -5.5F, -1.9659F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 16.0F, 7.0F);
		setRotationAngle(body, -0.1309F, 0.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-3.0F, 0.2268F, -11.4608F, 6.0F, 5.0F, 10.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-3.0F, 17.0F, -3.0F);
		left_arm.setTextureOffset(26, 28).addBox(4.5F, 2.0F, -3.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(3.0F, 17.0F, -3.0F);
		right_arm.setTextureOffset(0, 0).addBox(-6.5F, 2.0F, -3.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		left_thigh = new ModelRenderer(this);
		left_thigh.setRotationPoint(-3.0F, 16.0F, 2.5F);
		setRotationAngle(left_thigh, -0.2618F, 0.0F, 0.0F);
		left_thigh.setTextureOffset(24, 19).addBox(5.0F, 2.3813F, -0.8966F, 2.0F, 4.0F, 5.0F, 0.0F, false);

		right_thigh = new ModelRenderer(this);
		right_thigh.setRotationPoint(3.0F, 16.0F, 2.5F);
		setRotationAngle(right_thigh, -0.2618F, 0.0F, 0.0F);
		right_thigh.setTextureOffset(12, 24).addBox(-7.0F, 2.3813F, -0.8966F, 2.0F, 4.0F, 5.0F, 0.0F, false);

		left_foot = new ModelRenderer(this);
		left_foot.setRotationPoint(-3.0F, 14.5F, 4.2F);
		left_foot.setTextureOffset(11, 16).addBox(5.0F, 8.5F, -5.7F, 2.0F, 1.0F, 7.0F, 0.0F, false);

		right_foot = new ModelRenderer(this);
		right_foot.setRotationPoint(3.0F, 14.5F, 4.2F);
		right_foot.setTextureOffset(0, 15).addBox(-7.0F, 8.5F, -5.7F, 2.0F, 1.0F, 7.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 16.25F, 6.5F);
		setRotationAngle(tail, -0.1309F, 0.0F, 0.0F);
		tail.setTextureOffset(0, 23).addBox(-1.5F, -4.2732F, -1.4608F, 3.0F, 8.0F, 3.0F, 0.0F, false);
		tail.setTextureOffset(28, 11).addBox(-1.5F, -4.2732F, 1.5392F, 3.0F, 3.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		nose.render(matrixStack, buffer, packedLight, packedOverlay);
		left_ear.render(matrixStack, buffer, packedLight, packedOverlay);
		right_ear.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_thigh.render(matrixStack, buffer, packedLight, packedOverlay);
		right_thigh.render(matrixStack, buffer, packedLight, packedOverlay);
		left_foot.render(matrixStack, buffer, packedLight, packedOverlay);
		right_foot.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(SquirrelEntity entity, float arg1, float arg2, float arg3, float arg4, float arg5) {

	}
}