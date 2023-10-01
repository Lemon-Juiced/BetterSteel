package lemon_juice.better_steel.item.custom.tools;

import lemon_juice.better_steel.item.custom.tiers.ModTiers;
import net.minecraft.world.item.AxeItem;

public class SteelAxeItem extends AxeItem {
    public SteelAxeItem(Properties properties) {
        super(ModTiers.STEEL_TIER, 5.5F, -3.1F, properties);
    }
}
