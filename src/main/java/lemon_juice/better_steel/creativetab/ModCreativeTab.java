package lemon_juice.better_steel.creativetab;

import lemon_juice.better_steel.BetterSteel;
import lemon_juice.better_steel.block.ModBlocks;
import lemon_juice.better_steel.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterSteel.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BETTER_STEEL_TAB = CREATIVE_MODE_TABS.register("main", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.better_steel"))
            .icon(() -> new ItemStack(ModItems.STEEL_SWORD.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event){
        if(event.getTab() == BETTER_STEEL_TAB.get()){
            event.accept(ModItems.STEEL_SWORD.get());
            event.accept(ModItems.STEEL_PICKAXE.get());
            event.accept(ModItems.STEEL_AXE.get());
            event.accept(ModItems.STEEL_SHOVEL.get());
            event.accept(ModItems.STEEL_HOE.get());

            event.accept(ModItems.RAW_MANGANESE.get());

            event.accept(ModBlocks.MANGANESE_ORE.get());
            event.accept(ModBlocks.DEEPSLATE_MANGANESE_ORE.get());
            event.accept(ModBlocks.RAW_MANGANESE_BLOCK.get());
        }
    }

    /******************************** Registry ********************************/
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
