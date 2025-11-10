package org.neocities.lucadoesstuff;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import static org.neocities.lucadoesstuff.Sugarblock.MODID;
import org.neocities.lucadoesstuff.custom.*;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);

    public static final DeferredBlock<Block> SUGAR_BLOCK = BLOCKS.register("sugar_block",
        () -> new SugarBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.SNOW)
            .sound(SoundType.SAND)
            .explosionResistance(0.25f)
            .destroyTime(0.25f)
            .ignitedByLava()
        )
    );
}
