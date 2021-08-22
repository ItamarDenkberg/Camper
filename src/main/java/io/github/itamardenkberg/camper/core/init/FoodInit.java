package io.github.itamardenkberg.camper.core.init;

import net.minecraft.item.Food;
import net.minecraft.item.Food.Builder;

public class FoodInit {
	public static final Food HAZELNUT = (new Builder()).hunger(4).saturation(0.3F).build();
}
