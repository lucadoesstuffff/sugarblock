package org.neocities.lucadoesstuff;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.neocities.lucadoesstuff.custom.SugarBlockItem;

import static org.neocities.lucadoesstuff.Sugarblock.MODID;
import static org.neocities.lucadoesstuff.ModBlocks.*;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredItem<SugarBlockItem> SUGAR_BLOCK_ITEM = ITEMS.register("sugar_block",
        () -> new SugarBlockItem(SUGAR_BLOCK.get(), new Item.Properties())
    );
}
