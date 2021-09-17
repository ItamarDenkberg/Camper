package io.github.itamardenkberg.camper.core.init;

import net.minecraft.item.Food;
import net.minecraft.item.Food.Builder;

public class FoodInit {
	public static final Food HAZELNUT = (new Builder()).hunger(4).saturation(0.3F).build();
	public static final Food MARSHMALLOW_ON_A_STICK = (new Builder()).hunger(2).saturation(0.2F).build();
	public static final Food ROASTED_MARSHMALLOW_ON_A_STICK = (new Builder()).hunger(4).saturation(0.3F).build();
}
