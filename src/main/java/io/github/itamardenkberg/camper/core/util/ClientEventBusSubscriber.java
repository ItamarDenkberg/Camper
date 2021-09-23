package io.github.itamardenkberg.camper.core.util;

import io.github.itamardenkberg.camper.Camper;
import io.github.itamardenkberg.camper.client.render.entity.SquirrelEntityRenderer;
import io.github.itamardenkberg.camper.client.render.model.SquirrelEntityModel;
import io.github.itamardenkberg.camper.core.init.EntityTypesInit;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Camper.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void onClientSetup(FMLClientSetupEvent event) {
		
	}
	
	public static ModelLayerLocation SQUIRREL_LAYER = new ModelLayerLocation(new ResourceLocation(Camper.MOD_ID, "squirrel"), "squirrel");

    @SubscribeEvent
    public static void registerEntityRenders(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityTypesInit.SQUIRREL.get(), SquirrelEntityRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinition(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(SQUIRREL_LAYER, SquirrelEntityModel::createBodyLayer);
    }
}
