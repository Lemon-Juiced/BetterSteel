package lemon_juice.better_steel.item;

import lemon_juice.better_steel.BetterSteel;
import lemon_juice.better_steel.item.custom.tools.*;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BetterSteelItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BetterSteel.MOD_ID);

    public static final DeferredItem<Item> RAW_MANGANESE = ITEMS.register("raw_manganese", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> STEEL_SWORD = ITEMS.register("steel_sword", () -> new SteelSwordItem(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel", () -> new SteelShovelItem(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new SteelPickaxeItem(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_AXE = ITEMS.register("steel_axe", () -> new SteelAxeItem(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_HOE = ITEMS.register("steel_hoe", () -> new SteelHoeItem(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
