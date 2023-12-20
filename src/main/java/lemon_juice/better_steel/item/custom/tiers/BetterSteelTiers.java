package lemon_juice.better_steel.item.custom.tiers;

import lemon_juice.better_steel.BetterSteel;
import lemon_juice.better_steel.tag.BetterSteelTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.common.TierSortingRegistry;

import java.util.List;

public class BetterSteelTiers {
    /**
     * Contains the Tiers for the mod
     *
     * Vanilla Tier Reference:
     * WOOD(0, 59, 2.0F, 0.0F, 15, () -> {return Ingredient.of(ItemTags.PLANKS);}),
     * STONE(1, 131, 4.0F, 1.0F, 5, () -> {return Ingredient.of(ItemTags.STONE_TOOL_MATERIALS);}),
     * IRON(2, 250, 6.0F, 2.0F, 14, () -> {return Ingredient.of(Items.IRON_INGOT);}),
     * DIAMOND(3, 1561, 8.0F, 3.0F, 10, () -> {return Ingredient.of(Items.DIAMOND);}),
     * GOLD(0, 32, 12.0F, 0.0F, 22, () -> {return Ingredient.of(Items.GOLD_INGOT);}),
     * NETHERITE(4, 2031, 9.0F, 4.0F, 15, () -> {return Ingredient.of(Items.NETHERITE_INGOT);});
     *
     * The hoe has its own tier because the base tier is offset by .5f and the vanilla developers didn't have the
     * foresight to think someone may want to increment a hoe by .5f instead of a flat integer.
     */

    public static final Tier STEEL_TIER = TierSortingRegistry.registerTier(new SimpleTier(3, 906, 7.0F, 2.5F, 12, BetterSteelTags.Blocks.NEEDS_STEEL_TOOL, () -> Ingredient.of(BetterSteelTags.Items.INGOTS_STEEL)), new ResourceLocation(BetterSteel.MOD_ID, "steel"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
    public static final Tier STEEL_HOE_TIER = TierSortingRegistry.registerTier(new SimpleTier(3, 906, 7.0F, 3.0F, 12, BetterSteelTags.Blocks.NEEDS_STEEL_TOOL, () -> Ingredient.of(BetterSteelTags.Items.INGOTS_STEEL)), new ResourceLocation(BetterSteel.MOD_ID, "steel_hoe"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
}
