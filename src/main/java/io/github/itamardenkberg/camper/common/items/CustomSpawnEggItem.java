package io.github.itamardenkberg.camper.common.items;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.minecraft.core.BlockSource;
import net.minecraft.core.Direction;
import net.minecraft.core.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.fmllegacy.RegistryObject;

public class CustomSpawnEggItem extends SpawnEggItem {
	protected static final List<CustomSpawnEggItem> ADD_EGGS = new ArrayList<>();
	protected static DefaultDispenseItemBehavior behavior = new DefaultDispenseItemBehavior() {
		protected ItemStack execute(BlockSource source, ItemStack stack) {
			Direction direction = source.getBlockState().getValue(DispenserBlock.FACING);
			EntityType<?> type = ((SpawnEggItem) stack.getItem()).getType(stack.getTag());

			type.spawn(source.getLevel(), stack, null, source.getPos().relative(direction), MobSpawnType.DISPENSER,
					direction != Direction.UP, false);
			stack.shrink(1);
			return stack;
		};
	};
	private final Lazy<? extends EntityType<?>> lazyEntity;

	public CustomSpawnEggItem(final RegistryObject<? extends EntityType<?>> entity, final int primaryColor,
			final int secondaryColor, final Item.Properties properties) {
		super(null, primaryColor, secondaryColor, properties);
		this.lazyEntity = Lazy.of(entity::get);
		ADD_EGGS.add(this);
	}

	public static void initSpawnEggs() {
		final Map<EntityType<?>, SpawnEggItem> EGGS = ObfuscationReflectionHelper.getPrivateValue(SpawnEggItem.class,
				null, "BY_ID");

		for (final SpawnEggItem item : ADD_EGGS) {
			EGGS.put(item.getType(null), item);
			DispenserBlock.registerBehavior(item, behavior);
		}

		ADD_EGGS.clear();
	}

	@Override
	public EntityType<?> getType(CompoundTag nbt) {
		return this.lazyEntity.get();
	}
}