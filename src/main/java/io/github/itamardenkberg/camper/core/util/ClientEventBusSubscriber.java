package io.github.itamardenkberg.camper.core.util;

import io.github.itamardenkberg.camper.Camper;
import io.github.itamardenkberg.camper.client.render.entity.SquirrelEntityRenderer;
import io.github.itamardenkberg.camper.core.init.EntityTypesInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Camper.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

	@SubscribeEvent
	public static void onClientSetup(FMLClientSetupEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.SQUIRREL.get(), SquirrelEntityRenderer::new);
	}
}
