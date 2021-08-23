package io.github.itamardenkberg.camper.core.init;

import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class TagInit {
//	public static class Blocks {
//		private static Tags.IOptionalNamedTag<Block> register(String name) {
//			return BlockTags.createOptional(new ResourceLocation(Camper.MOD_ID, name));
//		}
//
//		private static Tags.IOptionalNamedTag<Block> registerForge(String name) {
//			return BlockTags.createOptional(new ResourceLocation("forge", name));
//		}
//	}

	public static class Items {
		// Forge
		public static final Tags.IOptionalNamedTag<Item> FRUITS_HAZELNUTS = registerForge("fruits/hazelnuts");
		public static final Tags.IOptionalNamedTag<Item> NUTS = registerForge("nuts");

//		private static Tags.IOptionalNamedTag<Item> register(String name) {
//			return ItemTags.createOptional(new ResourceLocation(Camper.MOD_ID, name));
//		}

		private static Tags.IOptionalNamedTag<Item> registerForge(String name) {
			return ItemTags.createOptional(new ResourceLocation("forge", name));
		}
	}
}
