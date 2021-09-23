package io.github.itamardenkberg.camper.client.render.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import io.github.itamardenkberg.camper.common.entities.passive.SquirrelEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

//Made with Blockbench 4.0.0-beta.0
//Exported for Minecraft version 1.17 with Mojang mappings

public class SquirrelEntityModel<T extends SquirrelEntity> extends EntityModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("camper", "squirrel"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart left_arm;
	private final ModelPart right_arm;
	private final ModelPart left_foot;
	private final ModelPart right_foot;
	private final ModelPart tail;

	public SquirrelEntityModel(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.left_foot = root.getChild("left_foot");
		this.right_foot = root.getChild("right_foot");
		this.tail = root.getChild("tail");
	}

	@SuppressWarnings("unused")
	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(22, 0).addBox(
				-2.5F, -3.5F, -5.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.5F, -3.0F));

		PartDefinition right_ear = head
				.addOrReplaceChild("right_ear",
						CubeListBuilder.create().texOffs(0, 15).addBox(-2.7588F, -5.5F, -1.9659F, 2.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition left_ear = head
				.addOrReplaceChild("left_ear",
						CubeListBuilder.create().texOffs(11, 15).addBox(0.7588F, -5.5F, -1.9659F, 2.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition nose = head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(0, 7).addBox(-1.5F, -1.5F,
				-6.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, 0.2268F, -11.4608F, 6.0F, 5.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.0F, 7.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(26, 28)
				.addBox(-1.5F, 0.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 19.0F, -4.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-6.5F, 2.0F, -3.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 17.0F, -3.0F));

		PartDefinition left_foot = partdefinition.addOrReplaceChild("left_foot", CubeListBuilder.create()
				.texOffs(11, 16).addBox(5.0F, 8.5F, -5.7F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 14.5F, 4.2F));

		PartDefinition left_thigh = left_foot.addOrReplaceChild("left_thigh",
				CubeListBuilder.create().texOffs(24, 19).addBox(5.0F, 2.3813F, -0.8966F, 2.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.5F, -1.7F, -0.2618F, 0.0F, 0.0F));

		PartDefinition right_foot = partdefinition.addOrReplaceChild("right_foot", CubeListBuilder.create()
				.texOffs(0, 15).addBox(-7.0F, 8.5F, -5.7F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 14.5F, 4.2F));

		PartDefinition right_thigh = right_foot.addOrReplaceChild("right_thigh",
				CubeListBuilder.create().texOffs(12, 24).addBox(-7.0F, 2.3813F, -0.8966F, 2.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.5F, -1.7F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(0, 23)
						.addBox(-1.5F, -4.2732F, -1.4608F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 11)
						.addBox(-1.5F, -4.2732F, 1.5392F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.25F, 6.5F, -0.1309F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.xRot = headPitch / 57.29578F;
		this.head.yRot = netHeadYaw / 57.29578F;
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.right_foot.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
		this.left_foot.xRot = Mth.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, buffer, packedLight, packedOverlay);
		body.render(poseStack, buffer, packedLight, packedOverlay);
		left_arm.render(poseStack, buffer, packedLight, packedOverlay);
		right_arm.render(poseStack, buffer, packedLight, packedOverlay);
		left_foot.render(poseStack, buffer, packedLight, packedOverlay);
		right_foot.render(poseStack, buffer, packedLight, packedOverlay);
		tail.render(poseStack, buffer, packedLight, packedOverlay);
	}
}