package io.github.itamardenkberg.camper.core.init;

import io.github.itamardenkberg.camper.Camper;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Camper.MOD_ID);

	public static final RegistryObject<Item> HAZELNUT = ITEMS.register("hazelnut",
			() -> new Item(new Item.Properties().food(FoodInit.HAZELNUT).group(Camper.TAB_CAMPER)));

	public static final RegistryObject<BlockItem> HAZEL_LEAVES = ITEMS.register("hazel_leaves",
			() -> new BlockItem(BlockInit.HAZEL_LEAVES.get(),
					new Item.Properties().maxStackSize(16).group(Camper.TAB_CAMPER)));
}
