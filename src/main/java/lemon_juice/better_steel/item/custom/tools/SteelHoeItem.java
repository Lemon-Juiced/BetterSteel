package lemon_juice.better_steel.item.custom.tools;

import lemon_juice.better_steel.item.custom.tiers.ModTiers;
import net.minecraft.world.item.HoeItem;

public class SteelHoeItem extends HoeItem {
    public SteelHoeItem(Properties properties) {
        super(ModTiers.STEEL_HOE_TIER, -3, -.5F, properties);
    }
}
