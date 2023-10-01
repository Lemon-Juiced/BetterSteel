package lemon_juice.better_steel.item.custom.tools;

import lemon_juice.better_steel.item.custom.tiers.ModTiers;
import net.minecraft.world.item.ShovelItem;

public class SteelShovelItem extends ShovelItem {
    public SteelShovelItem(Properties properties) {
        super(ModTiers.STEEL_TIER, 1.5F, -3.0F, properties);
    }
}
