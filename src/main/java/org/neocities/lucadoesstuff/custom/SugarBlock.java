package org.neocities.lucadoesstuff.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.ColorRGBA;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.ColoredFallingBlock;
import net.minecraft.world.level.block.state.BlockState;

public class SugarBlock extends ColoredFallingBlock {
    public SugarBlock(Properties properties) {
        super(new ColorRGBA(0xFFFFF), properties);
    }
    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 100;
    }
}
