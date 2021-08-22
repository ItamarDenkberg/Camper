package io.github.itamardenkberg.camper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.itamardenkberg.camper.core.init.BlockInit;
import io.github.itamardenkberg.camper.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Camper.MOD_ID)
public class Camper {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "camper";

	public Camper() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);

		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);

		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {

	}

	public static final ItemGroup TAB_CAMPER = new ItemGroup("camper") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(ItemInit.HAZELNUT.get());
		}
	};
}
