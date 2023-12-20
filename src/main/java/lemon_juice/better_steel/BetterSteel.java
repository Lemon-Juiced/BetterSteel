package lemon_juice.better_steel;

import lemon_juice.better_steel.block.BetterSteelBlocks;
import lemon_juice.better_steel.creativetab.BetterSteelCreativeTab;
import lemon_juice.better_steel.item.BetterSteelItems;
import lemon_juice.better_steel.tag.BetterSteelTags;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(BetterSteel.MOD_ID)
public class BetterSteel {
    public static final String MOD_ID = "better_steel";

    public BetterSteel(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup);

        // Register Items
        BetterSteelItems.register(modEventBus);
        BetterSteelBlocks.register(modEventBus);

        // Register Creative Tab
        BetterSteelCreativeTab.register(modEventBus);
        modEventBus.addListener(BetterSteelCreativeTab::registerTabs);

        // Register Tags
        BetterSteelTags.init();

        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}
    }
}
