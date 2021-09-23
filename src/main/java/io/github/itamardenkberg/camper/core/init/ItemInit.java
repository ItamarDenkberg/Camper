package io.github.itamardenkberg.camper.core.init;

import io.github.itamardenkberg.camper.Camper;
import io.github.itamardenkberg.camper.common.items.CustomSpawnEggItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Camper.MOD_ID);

	public static final RegistryObject<Item> HAZELNUT = ITEMS.register("hazelnut",
			() -> new Item(new Item.Properties().food(FoodInit.HAZELNUT).tab(Camper.TAB_CAMPER)));

	public static final RegistryObject<Item> MARSHMALLOW_ON_A_STICK = ITEMS.register("marshmallow_on_a_stick",
			() -> new Item(new Item.Properties().food(FoodInit.MARSHMALLOW_ON_A_STICK).tab(Camper.TAB_CAMPER)));

	public static final RegistryObject<Item> ROASTED_MARSHMALLOW_ON_A_STICK = ITEMS.register(
			"roasted_marshmallow_on_a_stick",
			() -> new Item(new Item.Properties().food(FoodInit.ROASTED_MARSHMALLOW_ON_A_STICK).tab(Camper.TAB_CAMPER)));

	public static final RegistryObject<Item> GELATIN = ITEMS.register("gelatin",
			() -> new Item(new Item.Properties().tab(Camper.TAB_CAMPER)));

	public static final RegistryObject<CustomSpawnEggItem> SQUIRREL_SPAWN_EGG = ITEMS.register("squirrel_spawn_egg",
			() -> new CustomSpawnEggItem(EntityTypesInit.SQUIRREL, 0x714622, 0xdcc4ab,
					new Item.Properties().food(FoodInit.HAZELNUT).tab(Camper.TAB_CAMPER)));

	public static final RegistryObject<BlockItem> HAZEL_LEAVES = ITEMS.register("hazel_leaves",
			() -> new BlockItem(BlockInit.HAZEL_LEAVES.get(), new Item.Properties().tab(Camper.TAB_CAMPER)));
}
