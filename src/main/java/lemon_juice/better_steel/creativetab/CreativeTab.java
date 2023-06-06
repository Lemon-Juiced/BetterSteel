package lemon_juice.better_steel.creativetab;

import lemon_juice.better_steel.BetterSteel;
import lemon_juice.better_steel.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;

public class CreativeTab {
    public static ResourceLocation BETTER_STEEL_TAB = new ResourceLocation(BetterSteel.MOD_ID, "better_steel");

    public static void registerTabs(CreativeModeTabEvent.Register event){
        event.registerCreativeModeTab(BETTER_STEEL_TAB, builder -> builder
                .title(Component.translatable("itemGroup.better_steel"))
                .icon(() -> new ItemStack(ModItems.STEEL_DUST.get()))
                .displayItems((features, output) -> {
                    output.accept(new ItemStack(ModItems.IRON_DUST.get()));
                    output.accept(new ItemStack(ModItems.MANGANESE_DUST.get()));
                    output.accept(new ItemStack(ModItems.RAW_MANGANESE.get()));
                    output.accept(new ItemStack(ModItems.STEEL_DUST.get()));


                    //output.accept(new ItemStack(ModBlocks.SILICON_BLOCK.get()));
                }));
    }
}
