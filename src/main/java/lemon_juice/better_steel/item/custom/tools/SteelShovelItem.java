package lemon_juice.better_steel.item.custom.tools;

import lemon_juice.better_steel.item.custom.tiers.BetterSteelTiers;
import net.minecraft.world.item.ShovelItem;

public class SteelShovelItem extends ShovelItem {
    public SteelShovelItem(Properties properties) {
        super(BetterSteelTiers.STEEL_TIER, 1.5F, -3.0F, properties);
    }
}
