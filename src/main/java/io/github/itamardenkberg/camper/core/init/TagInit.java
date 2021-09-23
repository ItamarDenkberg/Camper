package io.github.itamardenkberg.camper.core.init;

import io.github.itamardenkberg.camper.Camper;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.Tags;

public class TagInit {
	public static class Blocks {
		// Camper
		public static final Tags.IOptionalNamedTag<Block> SQUIRREL_NESTS = register("squirrel_nests");

		private static Tags.IOptionalNamedTag<Block> register(String name) {
			return BlockTags.createOptional(new ResourceLocation(Camper.MOD_ID, name));
		}
//
//		private static Tags.IOptionalNamedTag<Block> registerForge(String name) {
//			return BlockTags.createOptional(new ResourceLocation("forge", name));
//		}
	}

	public static class Items {
		// Forge
		public static final Tags.IOptionalNamedTag<Item> FRUITS_HAZELNUTS = registerForge("fruits/hazelnuts");
		public static final Tags.IOptionalNamedTag<Item> NUTS = registerForge("nuts");
		public static final Tags.IOptionalNamedTag<Item> MARSHMALLOWS = registerForge("marshmallows");

//		private static Tags.IOptionalNamedTag<Item> register(String name) {
//			return ItemTags.createOptional(new ResourceLocation(Camper.MOD_ID, name));
//		}

		private static Tags.IOptionalNamedTag<Item> registerForge(String name) {
			return ItemTags.createOptional(new ResourceLocation("forge", name));
		}
	}
}
