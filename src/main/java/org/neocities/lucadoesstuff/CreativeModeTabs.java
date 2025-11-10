package org.neocities.lucadoesstuff;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static org.neocities.lucadoesstuff.Sugarblock.MODID;
import static org.neocities.lucadoesstuff.ModItems.*;

public class CreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MAIN_TAB = CREATIVE_MODE_TABS.register("main_tab", () -> CreativeModeTab.builder()
        .title(Component.translatable("itemGroup.sugarblock"))
        .withTabsBefore(net.minecraft.world.item.CreativeModeTabs.COMBAT)
        .icon(() -> SUGAR_BLOCK_ITEM.get().getDefaultInstance())
        .displayItems((parameters, output) -> {
            output.accept(SUGAR_BLOCK_ITEM.get());
        }).build());
}
