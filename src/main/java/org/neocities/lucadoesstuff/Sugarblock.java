package org.neocities.lucadoesstuff;

import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

import static org.neocities.lucadoesstuff.ModBlocks.BLOCKS;
import static org.neocities.lucadoesstuff.ModItems.ITEMS;
import static org.neocities.lucadoesstuff.CreativeModeTabs.CREATIVE_MODE_TABS;
import static org.neocities.lucadoesstuff.ModItems.SUGAR_BLOCK_ITEM;

@Mod(Sugarblock.MODID)
public class Sugarblock {
    public static final String MODID = "sugarblock";
    public static final Logger LOGGER = LogUtils.getLogger();
    public Sugarblock(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM COMMON SETUP");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {}

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
    }

    @SubscribeEvent
    public void onHorseInteract(PlayerInteractEvent.EntityInteract event) {
        if (event.getTarget() instanceof Horse horse) {
            if(event.getItemStack().getItem() == SUGAR_BLOCK_ITEM.get()) {
                horse.heal(10.0f);
                event.getItemStack().shrink(1);
            }
        }
    }
}
