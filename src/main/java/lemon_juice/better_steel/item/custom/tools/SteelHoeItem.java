package lemon_juice.better_steel.item.custom.tools;

import lemon_juice.better_steel.item.custom.tiers.BetterSteelTiers;
import net.minecraft.world.item.HoeItem;

public class SteelHoeItem extends HoeItem {
    public SteelHoeItem(Properties properties) {
        super(BetterSteelTiers.STEEL_HOE_TIER, -3, -.5F, properties);
    }
}
