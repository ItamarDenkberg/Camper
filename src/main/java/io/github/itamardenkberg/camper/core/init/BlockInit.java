package io.github.itamardenkberg.camper.core.init;

import io.github.itamardenkberg.camper.Camper;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Camper.MOD_ID);

	public static final RegistryObject<Block> HAZEL_LEAVES = BLOCKS.register("hazel_leaves",
			() -> new Block(AbstractBlock.Properties.from(Blocks.OAK_LEAVES)));
}
