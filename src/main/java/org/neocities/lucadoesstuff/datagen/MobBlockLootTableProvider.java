package org.neocities.lucadoesstuff.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

import static org.neocities.lucadoesstuff.ModBlocks.BLOCKS;
import static org.neocities.lucadoesstuff.ModBlocks.SUGAR_BLOCK;

public class MobBlockLootTableProvider extends BlockLootSubProvider {
    protected MobBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }


    @Override
    protected void generate() {
        dropSelf(SUGAR_BLOCK.get());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return BLOCKS.getEntries().stream().map(e -> (Block) e.value()).toList();
    }
}
