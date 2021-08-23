package io.github.itamardenkberg.camper.common.events;

import io.github.itamardenkberg.camper.Camper;
import io.github.itamardenkberg.camper.core.init.EntityTypesInit;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraftforge.common.world.MobSpawnInfoBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = Camper.MOD_ID)
public class EntityEvents {
	@SubscribeEvent
	public static void onBiomeLoad(final BiomeLoadingEvent event) {
		if (event.getName() == null) {
			return;
		}
		MobSpawnInfoBuilder spawns = event.getSpawns();

		if (event.getCategory().equals(Biome.Category.FOREST)) {
			spawns.withSpawner(EntityClassification.CREATURE,
					new MobSpawnInfo.Spawners(EntityTypesInit.SQUIRREL.get(), 11, 1, 4));
		}
		
		if (event.getCategory().equals(Biome.Category.TAIGA)) {
			spawns.withSpawner(EntityClassification.CREATURE,
					new MobSpawnInfo.Spawners(EntityTypesInit.SQUIRREL.get(), 9, 1, 4));
		}
	}
}
