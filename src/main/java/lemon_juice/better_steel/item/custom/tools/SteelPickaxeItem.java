package lemon_juice.better_steel.item.custom.tools;

import lemon_juice.better_steel.item.custom.tiers.BetterSteelTiers;
import net.minecraft.world.item.PickaxeItem;

public class SteelPickaxeItem extends PickaxeItem {
    public SteelPickaxeItem(Properties properties) {
        super(BetterSteelTiers.STEEL_TIER, 1, -2.8F, properties);
    }
}
