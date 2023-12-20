package lemon_juice.better_steel.creativetab;

import lemon_juice.better_steel.BetterSteel;
import lemon_juice.better_steel.block.BetterSteelBlocks;
import lemon_juice.better_steel.item.BetterSteelItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BetterSteelCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterSteel.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BETTER_STEEL_TAB = CREATIVE_MODE_TABS.register("main", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.better_steel"))
            .icon(() -> new ItemStack(BetterSteelItems.STEEL_SWORD.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event){
        if(event.getTab() == BETTER_STEEL_TAB.get()){
            event.accept(BetterSteelItems.STEEL_SWORD.get());
            event.accept(BetterSteelItems.STEEL_PICKAXE.get());
            event.accept(BetterSteelItems.STEEL_AXE.get());
            event.accept(BetterSteelItems.STEEL_SHOVEL.get());
            event.accept(BetterSteelItems.STEEL_HOE.get());

            event.accept(BetterSteelItems.RAW_MANGANESE.get());

            event.accept(BetterSteelBlocks.MANGANESE_ORE.get());
            event.accept(BetterSteelBlocks.DEEPSLATE_MANGANESE_ORE.get());
            event.accept(BetterSteelBlocks.RAW_MANGANESE_BLOCK.get());
        }
    }

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
