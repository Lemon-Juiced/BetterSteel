package lemon_juice.better_steel.item.custom.tools;

import lemon_juice.better_steel.item.custom.tiers.BetterSteelTiers;
import net.minecraft.world.item.SwordItem;

public class SteelSwordItem extends SwordItem {
    public SteelSwordItem(Properties properties) {
        super(BetterSteelTiers.STEEL_TIER, 3, -2.4F, properties);
    }
}
