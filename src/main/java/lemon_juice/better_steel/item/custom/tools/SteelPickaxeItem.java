package lemon_juice.better_steel.item.custom.tools;

import lemon_juice.better_steel.item.custom.tiers.ModTiers;
import net.minecraft.world.item.PickaxeItem;

public class SteelPickaxeItem extends PickaxeItem {
    public SteelPickaxeItem(Properties properties) {
        super(ModTiers.STEEL_TIER, 1, -2.8F, properties);
    }
}
