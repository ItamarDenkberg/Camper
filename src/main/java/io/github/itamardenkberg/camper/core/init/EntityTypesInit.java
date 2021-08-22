package io.github.itamardenkberg.camper.core.init;

import io.github.itamardenkberg.camper.Camper;
import io.github.itamardenkberg.camper.common.entities.passive.SquirrelEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityTypesInit {
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES,
			Camper.MOD_ID);

	public static final RegistryObject<EntityType<SquirrelEntity>> SQUIRREL = ENTITY_TYPES.register("squirrel",
			() -> EntityType.Builder.create(SquirrelEntity::new, EntityClassification.CREATURE).size(0.57f, 0.6f)
					.build(new ResourceLocation(Camper.MOD_ID, "squirrel").toString()));
}
