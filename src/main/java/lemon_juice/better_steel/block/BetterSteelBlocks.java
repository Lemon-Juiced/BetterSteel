package lemon_juice.better_steel.block;

import lemon_juice.better_steel.BetterSteel;
import lemon_juice.better_steel.item.BetterSteelItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BetterSteelBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(BetterSteel.MOD_ID);

    public static final DeferredBlock<Block> MANGANESE_ORE = registerBlock("manganese_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> DEEPSLATE_MANGANESE_ORE = registerBlock("deepslate_manganese_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(MANGANESE_ORE.get()).requiresCorrectToolForDrops().strength(4.5F, 3.0F)));
    public static final DeferredBlock<Block> RAW_MANGANESE_BLOCK = registerBlock("raw_manganese_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

    public static <T extends Block> DeferredBlock<Block> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<Block> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> DeferredItem<BlockItem> registerBlockItem(String name, DeferredBlock<Block> block) {
        return BetterSteelItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
