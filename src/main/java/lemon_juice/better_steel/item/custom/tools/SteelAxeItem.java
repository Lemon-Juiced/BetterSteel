package lemon_juice.better_steel.item.custom.tools;

import lemon_juice.better_steel.item.custom.tiers.BetterSteelTiers;
import net.minecraft.world.item.AxeItem;

public class SteelAxeItem extends AxeItem {
    public SteelAxeItem(Properties properties) {
        super(BetterSteelTiers.STEEL_TIER, 5.5F, -3.1F, properties);
    }
}
