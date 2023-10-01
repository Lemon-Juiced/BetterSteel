package lemon_juice.better_steel.item.custom.tools;

import lemon_juice.better_steel.item.custom.tiers.ModTiers;
import net.minecraft.world.item.SwordItem;

public class SteelSwordItem extends SwordItem {
    public SteelSwordItem(Properties properties) {
        super(ModTiers.STEEL_TIER, 3, -2.4F, properties);
    }
}
