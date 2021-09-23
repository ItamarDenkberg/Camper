package io.github.itamardenkberg.camper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.itamardenkberg.camper.common.entities.passive.SquirrelEntity;
import io.github.itamardenkberg.camper.common.items.CustomSpawnEggItem;
import io.github.itamardenkberg.camper.core.init.BlockInit;
import io.github.itamardenkberg.camper.core.init.EntityTypesInit;
import io.github.itamardenkberg.camper.core.init.ItemInit;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Camper.MOD_ID)
public class Camper {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "camper";

	public Camper() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::addAttributes);

		EntityTypesInit.ENTITY_TYPES.register(bus);
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);

		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public static void onRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
		CustomSpawnEggItem.initSpawnEggs();
	}

	private void addAttributes(final EntityAttributeCreationEvent event) {
		event.put(EntityTypesInit.SQUIRREL.get(), SquirrelEntity.setAttributes().build());
	}

	public static final CreativeModeTab TAB_CAMPER = new CreativeModeTab("camper") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.HAZELNUT.get());
		}
	};
}
