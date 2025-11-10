package org.neocities.lucadoesstuff.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

import static org.neocities.lucadoesstuff.ModBlocks.*;
import static org.neocities.lucadoesstuff.ModItems.*;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        super.buildRecipes(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SUGAR_BLOCK.get())
            .pattern("SSS")
            .pattern("SSS")
            .pattern("SSS")
            .define('S', Items.SUGAR)
            .unlockedBy("has_sugar", has(Items.SUGAR))
            .save(recipeOutput, "sugarblock:sugar_block_from_sugar");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.SUGAR, 9)
            .requires(SUGAR_BLOCK)
            .unlockedBy("has_sugar_block", has(SUGAR_BLOCK))
            .save(recipeOutput, "sugarblock:sugar_from_sugar_block");
    }
}
