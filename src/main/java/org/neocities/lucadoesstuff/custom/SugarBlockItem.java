package org.neocities.lucadoesstuff.custom;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

public class SugarBlockItem extends BlockItem {
    public SugarBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    /*@Override
    public @Nullable FoodProperties getFoodProperties(ItemStack stack, @Nullable LivingEntity entity) {
        if(entity instanceof Horse) {
            return super.getFoodProperties(stack, entity);
        }
        return super.getFoodProperties(stack, entity);
    }
    */
}
