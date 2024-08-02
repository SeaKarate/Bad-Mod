//// Made with Blockbench 4.10.4
//// Exported for Minecraft version 1.17+ for Yarn
//// Paste this class into your mod and generate all required imports
//
//package com.kjchillin.template.entity.client;
//
//import net.minecraft.client.model.*;
//import net.minecraft.client.render.VertexConsumer;
//import net.minecraft.client.render.entity.model.EntityModel;
//import net.minecraft.client.util.math.MatrixStack;
//import net.minecraft.entity.Entity;
//
//public class attacking_block extends EntityModel<Entity> {
//	private final ModelPart ALL;
//	private final ModelPart sword;
//	private final ModelPart THECUBE;
//	public attacking_block(ModelPart root) {
//		this.ALL = root.getChild("ALL");
//		this.sword = root.getChild("sword");
//		this.THECUBE = root.getChild("THECUBE");
//	}
//	public static TexturedModelData getTexturedModelData() {
//		ModelData modelData = new ModelData();
//		ModelPartData modelPartData = modelData.getRoot();
//		ModelPartData ALL = modelPartData.addChild("ALL", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 18.0F, 0.0F));
//
//		ModelPartData sword = ALL.addChild("sword", ModelPartBuilder.create().uv(4, 40).cuboid(4.0F, -1.0F, -6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(0, 40).cuboid(4.0F, -1.0F, -7.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(35, 39).cuboid(5.0F, -1.0F, -7.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(38, 38).cuboid(5.0F, -1.0F, -6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(38, 36).cuboid(3.0F, -1.0F, -6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(38, 34).cuboid(3.0F, -1.0F, -7.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(38, 32).cuboid(5.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(32, 38).cuboid(4.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(28, 38).cuboid(3.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(24, 38).cuboid(2.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(20, 38).cuboid(2.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(16, 38).cuboid(3.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(12, 38).cuboid(1.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(8, 38).cuboid(1.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(4, 38).cuboid(2.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(0, 38).cuboid(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(35, 37).cuboid(1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(32, 36).cuboid(2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(28, 36).cuboid(2.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(24, 36).cuboid(3.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(20, 36).cuboid(3.0F, -1.0F, 2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(16, 36).cuboid(2.0F, -1.0F, 2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(12, 36).cuboid(2.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(8, 36).cuboid(1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(4, 36).cuboid(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(0, 36).cuboid(-1.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(35, 35).cuboid(-3.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(32, 32).cuboid(-4.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(28, 32).cuboid(-3.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(24, 32).cuboid(-2.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(20, 32).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(16, 32).cuboid(-3.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(12, 32).cuboid(-4.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(8, 32).cuboid(-5.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(4, 32).cuboid(-6.0F, -1.0F, 2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(0, 32).cuboid(-7.0F, -1.0F, 3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(12, 14).cuboid(-8.0F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(6, 14).cuboid(-9.0F, -1.0F, 5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(0, 14).cuboid(-10.0F, -1.0F, 6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(9, 13).cuboid(-10.0F, -1.0F, 7.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(3, 13).cuboid(-9.0F, -1.0F, 8.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(12, 12).cuboid(-8.0F, -1.0F, 8.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(12, 10).cuboid(-7.0F, -1.0F, 7.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(12, 8).cuboid(-6.0F, -1.0F, 6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(12, 6).cuboid(-5.0F, -1.0F, 5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(6, 12).cuboid(-4.0F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(12, 4).cuboid(-3.0F, -1.0F, 3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(12, 2).cuboid(-2.0F, -1.0F, 2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(12, 0).cuboid(-1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(0, 12).cuboid(-10.0F, -1.0F, 8.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(9, 11).cuboid(-8.0F, -1.0F, 7.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(3, 11).cuboid(-9.0F, -1.0F, 7.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(6, 10).cuboid(-9.0F, -1.0F, 6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(0, 10).cuboid(-8.0F, -1.0F, 6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(9, 9).cuboid(-8.0F, -1.0F, 5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(9, 7).cuboid(-7.0F, -1.0F, 5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(9, 5).cuboid(-7.0F, -1.0F, 6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(9, 3).cuboid(-7.0F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(3, 9).cuboid(-5.0F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(9, 1).cuboid(-6.0F, -1.0F, 5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(6, 8).cuboid(-6.0F, -1.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(0, 8).cuboid(-6.0F, -1.0F, 3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(3, 7).cuboid(-5.0F, -1.0F, 3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(6, 6).cuboid(-4.0F, -1.0F, 3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(6, 4).cuboid(-4.0F, -1.0F, 2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(6, 2).cuboid(-5.0F, -1.0F, 2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(6, 0).cuboid(-3.0F, -1.0F, 2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(0, 6).cuboid(-3.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(3, 5).cuboid(-2.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(0, 4).cuboid(-4.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(3, 3).cuboid(-3.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(3, 1).cuboid(-2.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(0, 2).cuboid(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(0, 0).cuboid(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(35, 33).cuboid(-3.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(32, 34).cuboid(-4.0F, -1.0F, -5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(28, 34).cuboid(-2.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(24, 34).cuboid(-1.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(16, 34).cuboid(-2.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(12, 34).cuboid(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(8, 34).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(4, 34).cuboid(1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(0, 34).cuboid(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
//		.uv(20, 34).cuboid(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(9.0F, 0.0F, -3.0F, 3.1416F, 0.0F, 1.5708F));
//
//		ModelPartData THECUBE = ALL.addChild("THECUBE", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.0F, 0.0F));
//		return TexturedModelData.of(modelData, 64, 64);
//	}
//	@Override
//	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
//	}
//	@Override
//	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
//		ALL.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
//	}
//}