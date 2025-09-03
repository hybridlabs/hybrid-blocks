package dev.hybridlabs.blocks.data.server

import dev.hybridlabs.blocks.item.HybridBlocksItems
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.advancements.critereon.InventoryChangeTrigger
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.data.recipes.FinishedRecipe
import net.minecraft.data.recipes.RecipeCategory
import net.minecraft.data.recipes.ShapedRecipeBuilder
import net.minecraft.data.recipes.ShapelessRecipeBuilder
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items
import net.minecraft.world.item.crafting.Ingredient
import net.minecraft.world.item.crafting.RecipeSerializer
import net.minecraft.world.level.block.Blocks
import java.util.function.Consumer

/**
 * Generates all recipes.
 */
@Suppress("SameParameterValue")
class RecipeProvider(output: FabricDataOutput) : FabricRecipeProvider(output) {
    override fun buildRecipes(exporter: Consumer<FinishedRecipe>) {
        // stained smooth quartz
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksItems.SMOOTH_BLACK_QUARTZ.get(), Items.BLACK_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksItems.SMOOTH_BLUE_QUARTZ.get(), Items.BLUE_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksItems.SMOOTH_BROWN_QUARTZ.get(), Items.BROWN_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksItems.SMOOTH_CYAN_QUARTZ.get(), Items.CYAN_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksItems.SMOOTH_GRAY_QUARTZ.get(), Items.GRAY_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksItems.SMOOTH_GREEN_QUARTZ.get(), Items.GREEN_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksItems.SMOOTH_LIGHT_BLUE_QUARTZ.get(), Items.LIGHT_BLUE_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksItems.SMOOTH_LIGHT_GRAY_QUARTZ.get(), Items.LIGHT_GRAY_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksItems.SMOOTH_LIME_QUARTZ.get(), Items.LIME_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksItems.SMOOTH_MAGENTA_QUARTZ.get(), Items.MAGENTA_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksItems.SMOOTH_ORANGE_QUARTZ.get(), Items.ORANGE_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksItems.SMOOTH_PINK_QUARTZ.get(), Items.PINK_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksItems.SMOOTH_PURPLE_QUARTZ.get(), Items.PURPLE_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksItems.SMOOTH_RED_QUARTZ.get(), Items.RED_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksItems.SMOOTH_WHITE_QUARTZ.get(), Items.WHITE_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksItems.SMOOTH_YELLOW_QUARTZ.get(), Items.YELLOW_DYE)

        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BLACK_QUARTZ_SLAB.get(), HybridBlocksItems.BLACK_QUARTZ_BLOCK.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BLUE_QUARTZ_SLAB.get(), HybridBlocksItems.BLUE_QUARTZ_BLOCK.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BROWN_QUARTZ_SLAB.get(), HybridBlocksItems.BROWN_QUARTZ_BLOCK.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CYAN_QUARTZ_SLAB.get(), HybridBlocksItems.CYAN_QUARTZ_BLOCK.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.GRAY_QUARTZ_SLAB.get(), HybridBlocksItems.GRAY_QUARTZ_BLOCK.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.GREEN_QUARTZ_SLAB.get(), HybridBlocksItems.GREEN_QUARTZ_BLOCK.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIGHT_BLUE_QUARTZ_SLAB.get(), HybridBlocksItems.LIGHT_BLUE_QUARTZ_BLOCK.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIGHT_GRAY_QUARTZ_SLAB.get(), HybridBlocksItems.LIGHT_GRAY_QUARTZ_BLOCK.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIME_QUARTZ_SLAB.get(), HybridBlocksItems.LIME_QUARTZ_BLOCK.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MAGENTA_QUARTZ_SLAB.get(), HybridBlocksItems.MAGENTA_QUARTZ_BLOCK.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.ORANGE_QUARTZ_SLAB.get(), HybridBlocksItems.ORANGE_QUARTZ_BLOCK.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINK_QUARTZ_SLAB.get(), HybridBlocksItems.PINK_QUARTZ_BLOCK.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PURPLE_QUARTZ_SLAB.get(), HybridBlocksItems.PURPLE_QUARTZ_BLOCK.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.RED_QUARTZ_SLAB.get(), HybridBlocksItems.RED_QUARTZ_BLOCK.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.WHITE_QUARTZ_SLAB.get(), HybridBlocksItems.WHITE_QUARTZ_BLOCK.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.YELLOW_QUARTZ_SLAB.get(), HybridBlocksItems.YELLOW_QUARTZ_BLOCK.get())

        stairBuilder(HybridBlocksItems.BLACK_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.BLACK_QUARTZ_BLOCK.get()))
        stairBuilder(HybridBlocksItems.BLUE_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.BLUE_QUARTZ_BLOCK.get()))
        stairBuilder(HybridBlocksItems.BROWN_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.BROWN_QUARTZ_BLOCK.get()))
        stairBuilder(HybridBlocksItems.CYAN_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.CYAN_QUARTZ_BLOCK.get()))
        stairBuilder(HybridBlocksItems.GRAY_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.GRAY_QUARTZ_BLOCK.get()))
        stairBuilder(HybridBlocksItems.GREEN_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.GREEN_QUARTZ_BLOCK.get()))
        stairBuilder(HybridBlocksItems.LIGHT_BLUE_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.LIGHT_BLUE_QUARTZ_BLOCK.get()))
        stairBuilder(HybridBlocksItems.LIGHT_GRAY_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.LIGHT_GRAY_QUARTZ_BLOCK.get()))
        stairBuilder(HybridBlocksItems.LIME_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.LIME_QUARTZ_BLOCK.get()))
        stairBuilder(HybridBlocksItems.MAGENTA_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.MAGENTA_QUARTZ_BLOCK.get()))
        stairBuilder(HybridBlocksItems.ORANGE_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.ORANGE_QUARTZ_BLOCK.get()))
        stairBuilder(HybridBlocksItems.PINK_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.PINK_QUARTZ_BLOCK.get()))
        stairBuilder(HybridBlocksItems.PURPLE_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.PURPLE_QUARTZ_BLOCK.get()))
        stairBuilder(HybridBlocksItems.RED_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.RED_QUARTZ_BLOCK.get()))
        stairBuilder(HybridBlocksItems.WHITE_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.WHITE_QUARTZ_BLOCK.get()))
        stairBuilder(HybridBlocksItems.YELLOW_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.YELLOW_QUARTZ_BLOCK.get()))

        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_BLACK_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_BLACK_QUARTZ.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_BLUE_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_BLUE_QUARTZ.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_BROWN_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_BROWN_QUARTZ.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_CYAN_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_CYAN_QUARTZ.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_GRAY_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_GRAY_QUARTZ.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_GREEN_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_GREEN_QUARTZ.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_LIGHT_BLUE_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_LIGHT_BLUE_QUARTZ.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_LIGHT_GRAY_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_LIGHT_GRAY_QUARTZ.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_LIME_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_LIME_QUARTZ.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_MAGENTA_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_MAGENTA_QUARTZ.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_ORANGE_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_ORANGE_QUARTZ.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_PINK_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_PINK_QUARTZ.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_PURPLE_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_PURPLE_QUARTZ.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_RED_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_RED_QUARTZ.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_WHITE_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_WHITE_QUARTZ.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_YELLOW_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_YELLOW_QUARTZ.get())

        offerQuartzBricksRecipes(exporter, HybridBlocksItems.BLACK_QUARTZ_BLOCK.get(), HybridBlocksItems.BLACK_QUARTZ_BRICKS.get())
        offerQuartzBricksRecipes(exporter, HybridBlocksItems.BLUE_QUARTZ_BLOCK.get(), HybridBlocksItems.BLUE_QUARTZ_BRICKS.get())
        offerQuartzBricksRecipes(exporter, HybridBlocksItems.BROWN_QUARTZ_BLOCK.get(), HybridBlocksItems.BROWN_QUARTZ_BRICKS.get())
        offerQuartzBricksRecipes(exporter, HybridBlocksItems.CYAN_QUARTZ_BLOCK.get(), HybridBlocksItems.CYAN_QUARTZ_BRICKS.get())
        offerQuartzBricksRecipes(exporter, HybridBlocksItems.GRAY_QUARTZ_BLOCK.get(), HybridBlocksItems.GRAY_QUARTZ_BRICKS.get())
        offerQuartzBricksRecipes(exporter, HybridBlocksItems.GREEN_QUARTZ_BLOCK.get(), HybridBlocksItems.GREEN_QUARTZ_BRICKS.get())
        offerQuartzBricksRecipes(exporter, HybridBlocksItems.LIGHT_BLUE_QUARTZ_BLOCK.get(), HybridBlocksItems.LIGHT_BLUE_QUARTZ_BRICKS.get())
        offerQuartzBricksRecipes(exporter, HybridBlocksItems.LIGHT_GRAY_QUARTZ_BLOCK.get(), HybridBlocksItems.LIGHT_GRAY_QUARTZ_BRICKS.get())
        offerQuartzBricksRecipes(exporter, HybridBlocksItems.LIME_QUARTZ_BLOCK.get(), HybridBlocksItems.LIME_QUARTZ_BRICKS.get())
        offerQuartzBricksRecipes(exporter, HybridBlocksItems.MAGENTA_QUARTZ_BLOCK.get(), HybridBlocksItems.MAGENTA_QUARTZ_BRICKS.get())
        offerQuartzBricksRecipes(exporter, HybridBlocksItems.ORANGE_QUARTZ_BLOCK.get(), HybridBlocksItems.ORANGE_QUARTZ_BRICKS.get())
        offerQuartzBricksRecipes(exporter, HybridBlocksItems.PINK_QUARTZ_BLOCK.get(), HybridBlocksItems.PINK_QUARTZ_BRICKS.get())
        offerQuartzBricksRecipes(exporter, HybridBlocksItems.PURPLE_QUARTZ_BLOCK.get(), HybridBlocksItems.PURPLE_QUARTZ_BRICKS.get())
        offerQuartzBricksRecipes(exporter, HybridBlocksItems.RED_QUARTZ_BLOCK.get(), HybridBlocksItems.RED_QUARTZ_BRICKS.get())
        offerQuartzBricksRecipes(exporter, HybridBlocksItems.WHITE_QUARTZ_BLOCK.get(), HybridBlocksItems.WHITE_QUARTZ_BRICKS.get())
        offerQuartzBricksRecipes(exporter, HybridBlocksItems.YELLOW_QUARTZ_BLOCK.get(), HybridBlocksItems.YELLOW_QUARTZ_BRICKS.get())

        stairBuilder(HybridBlocksItems.SMOOTH_BLACK_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.SMOOTH_BLACK_QUARTZ.get()))
        stairBuilder(HybridBlocksItems.SMOOTH_BLUE_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.SMOOTH_BLUE_QUARTZ.get()))
        stairBuilder(HybridBlocksItems.SMOOTH_BROWN_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.SMOOTH_BROWN_QUARTZ.get()))
        stairBuilder(HybridBlocksItems.SMOOTH_CYAN_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.SMOOTH_CYAN_QUARTZ.get()))
        stairBuilder(HybridBlocksItems.SMOOTH_GRAY_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.SMOOTH_GRAY_QUARTZ.get()))
        stairBuilder(HybridBlocksItems.SMOOTH_GREEN_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.SMOOTH_GREEN_QUARTZ.get()))
        stairBuilder(HybridBlocksItems.SMOOTH_LIGHT_BLUE_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.SMOOTH_LIGHT_BLUE_QUARTZ.get()))
        stairBuilder(HybridBlocksItems.SMOOTH_LIGHT_GRAY_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.SMOOTH_LIGHT_GRAY_QUARTZ.get()))
        stairBuilder(HybridBlocksItems.SMOOTH_LIME_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.SMOOTH_LIME_QUARTZ.get()))
        stairBuilder(HybridBlocksItems.SMOOTH_MAGENTA_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.SMOOTH_MAGENTA_QUARTZ.get()))
        stairBuilder(HybridBlocksItems.SMOOTH_ORANGE_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.SMOOTH_ORANGE_QUARTZ.get()))
        stairBuilder(HybridBlocksItems.SMOOTH_PINK_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.SMOOTH_PINK_QUARTZ.get()))
        stairBuilder(HybridBlocksItems.SMOOTH_PURPLE_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.SMOOTH_PURPLE_QUARTZ.get()))
        stairBuilder(HybridBlocksItems.SMOOTH_RED_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.SMOOTH_RED_QUARTZ.get()))
        stairBuilder(HybridBlocksItems.SMOOTH_WHITE_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.SMOOTH_WHITE_QUARTZ.get()))
        stairBuilder(HybridBlocksItems.SMOOTH_YELLOW_QUARTZ_STAIRS.get(), Ingredient.of(HybridBlocksItems.SMOOTH_YELLOW_QUARTZ.get()))

        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CRACKED_BRICK_SLAB.get(), HybridBlocksItems.CRACKED_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_NETHER_BRICK_SLAB.get(), HybridBlocksItems.MIXED_NETHER_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_RED_NETHER_BRICK_SLAB.get(), HybridBlocksItems.MIXED_RED_NETHER_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BLACK_BRICK_SLAB.get(), HybridBlocksItems.BLACK_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_BLACK_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_BLACK_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BLUE_BRICK_SLAB.get(), HybridBlocksItems.BLUE_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_BLUE_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_BLUE_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BROWN_BRICK_SLAB.get(), HybridBlocksItems.BROWN_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_BROWN_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_BROWN_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CYAN_BRICK_SLAB.get(), HybridBlocksItems.CYAN_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_CYAN_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_CYAN_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.GRAY_BRICK_SLAB.get(), HybridBlocksItems.GRAY_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_GRAY_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_GRAY_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.GREEN_BRICK_SLAB.get(), HybridBlocksItems.GREEN_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_GREEN_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_GREEN_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIGHT_BLUE_BRICK_SLAB.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_LIGHT_BLUE_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_LIGHT_BLUE_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIGHT_GRAY_BRICK_SLAB.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_LIGHT_GRAY_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_LIGHT_GRAY_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIME_BRICK_SLAB.get(), HybridBlocksItems.LIME_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_LIME_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_LIME_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MAGENTA_BRICK_SLAB.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_MAGENTA_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_MAGENTA_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.ORANGE_BRICK_SLAB.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_ORANGE_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_ORANGE_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINK_BRICK_SLAB.get(), HybridBlocksItems.PINK_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_PINK_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_PINK_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PURPLE_BRICK_SLAB.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_PURPLE_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_PURPLE_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.RED_BRICK_SLAB.get(), HybridBlocksItems.RED_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_RED_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_RED_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.WHITE_BRICK_SLAB.get(), HybridBlocksItems.WHITE_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_WHITE_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_WHITE_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.YELLOW_BRICK_SLAB.get(), HybridBlocksItems.YELLOW_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_YELLOW_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_YELLOW_BRICKS.get())

        stairBuilder(HybridBlocksItems.CRACKED_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.CRACKED_BRICKS.get()))
        stairBuilder(HybridBlocksItems.MOSSY_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.MOSSY_BRICKS.get()))
        stairBuilder(HybridBlocksItems.MIXED_NETHER_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.MIXED_NETHER_BRICKS.get()))
        stairBuilder(HybridBlocksItems.MIXED_RED_NETHER_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.MIXED_RED_NETHER_BRICKS.get()))
        stairBuilder(HybridBlocksItems.BLUE_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.BLUE_BRICKS.get()))
        stairBuilder(HybridBlocksItems.MOSSY_BLUE_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.MOSSY_BLUE_BRICKS.get()))
        stairBuilder(HybridBlocksItems.BROWN_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.BROWN_BRICKS.get()))
        stairBuilder(HybridBlocksItems.MOSSY_BROWN_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.MOSSY_BROWN_BRICKS.get()))
        stairBuilder(HybridBlocksItems.CYAN_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.CYAN_BRICKS.get()))
        stairBuilder(HybridBlocksItems.MOSSY_CYAN_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.MOSSY_CYAN_BRICKS.get()))
        stairBuilder(HybridBlocksItems.GRAY_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.GRAY_BRICKS.get()))
        stairBuilder(HybridBlocksItems.MOSSY_GRAY_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.MOSSY_GRAY_BRICKS.get()))
        stairBuilder(HybridBlocksItems.GREEN_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.GREEN_BRICKS.get()))
        stairBuilder(HybridBlocksItems.LIGHT_BLUE_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.LIGHT_BLUE_BRICKS.get()))
        stairBuilder(HybridBlocksItems.MOSSY_LIGHT_BLUE_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.MOSSY_LIGHT_BLUE_BRICKS.get()))
        stairBuilder(HybridBlocksItems.LIGHT_GRAY_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.LIGHT_GRAY_BRICKS.get()))
        stairBuilder(HybridBlocksItems.MOSSY_LIGHT_GRAY_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.MOSSY_LIGHT_GRAY_BRICKS.get()))
        stairBuilder(HybridBlocksItems.LIME_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.LIME_BRICKS.get()))
        stairBuilder(HybridBlocksItems.MOSSY_LIME_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.MOSSY_LIME_BRICKS.get()))
        stairBuilder(HybridBlocksItems.MAGENTA_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.MAGENTA_BRICKS.get()))
        stairBuilder(HybridBlocksItems.MOSSY_MAGENTA_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.MOSSY_MAGENTA_BRICKS.get()))
        stairBuilder(HybridBlocksItems.ORANGE_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.ORANGE_BRICKS.get()))
        stairBuilder(HybridBlocksItems.MOSSY_ORANGE_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.MOSSY_ORANGE_BRICKS.get()))
        stairBuilder(HybridBlocksItems.PINK_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.PINK_BRICKS.get()))
        stairBuilder(HybridBlocksItems.MOSSY_PINK_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.MOSSY_PINK_BRICKS.get()))
        stairBuilder(HybridBlocksItems.PURPLE_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.PURPLE_BRICKS.get()))
        stairBuilder(HybridBlocksItems.MOSSY_PURPLE_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.MOSSY_PURPLE_BRICKS.get()))
        stairBuilder(HybridBlocksItems.RED_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.RED_BRICKS.get()))
        stairBuilder(HybridBlocksItems.MOSSY_RED_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.MOSSY_RED_BRICKS.get()))
        stairBuilder(HybridBlocksItems.WHITE_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.WHITE_BRICKS.get()))
        stairBuilder(HybridBlocksItems.MOSSY_WHITE_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.MOSSY_WHITE_BRICKS.get()))
        stairBuilder(HybridBlocksItems.YELLOW_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.YELLOW_BRICKS.get()))
        stairBuilder(HybridBlocksItems.MOSSY_YELLOW_BRICK_STAIRS.get(), Ingredient.of(HybridBlocksItems.MOSSY_YELLOW_BRICKS.get()))

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BLACK_QUARTZ_PILLAR.get(), HybridBlocksItems.BLACK_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BLUE_QUARTZ_PILLAR.get(), HybridBlocksItems.BLUE_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BROWN_QUARTZ_PILLAR.get(), HybridBlocksItems.BROWN_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CYAN_QUARTZ_PILLAR.get(), HybridBlocksItems.CYAN_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.GRAY_QUARTZ_PILLAR.get(), HybridBlocksItems.GRAY_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.GREEN_QUARTZ_PILLAR.get(), HybridBlocksItems.GREEN_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIGHT_BLUE_QUARTZ_PILLAR.get(), HybridBlocksItems.LIGHT_BLUE_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIGHT_GRAY_QUARTZ_PILLAR.get(), HybridBlocksItems.LIGHT_GRAY_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIME_QUARTZ_PILLAR.get(), HybridBlocksItems.LIME_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MAGENTA_QUARTZ_PILLAR.get(), HybridBlocksItems.MAGENTA_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.ORANGE_QUARTZ_PILLAR.get(), HybridBlocksItems.ORANGE_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINK_QUARTZ_PILLAR.get(), HybridBlocksItems.PINK_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PURPLE_QUARTZ_PILLAR.get(), HybridBlocksItems.PURPLE_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.RED_QUARTZ_PILLAR.get(), HybridBlocksItems.RED_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.WHITE_QUARTZ_PILLAR.get(), HybridBlocksItems.WHITE_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.YELLOW_QUARTZ_PILLAR.get(), HybridBlocksItems.YELLOW_QUARTZ_BLOCK.get())

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BLACK_QUARTZ_STAIRS.get(), HybridBlocksItems.BLACK_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BLUE_QUARTZ_STAIRS.get(), HybridBlocksItems.BLUE_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BROWN_QUARTZ_STAIRS.get(), HybridBlocksItems.BROWN_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CYAN_QUARTZ_STAIRS.get(), HybridBlocksItems.CYAN_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.GRAY_QUARTZ_STAIRS.get(), HybridBlocksItems.GRAY_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.GREEN_QUARTZ_STAIRS.get(), HybridBlocksItems.GREEN_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIGHT_BLUE_QUARTZ_STAIRS.get(), HybridBlocksItems.LIGHT_BLUE_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIGHT_GRAY_QUARTZ_STAIRS.get(), HybridBlocksItems.LIGHT_GRAY_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIME_QUARTZ_STAIRS.get(), HybridBlocksItems.LIME_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MAGENTA_QUARTZ_STAIRS.get(), HybridBlocksItems.MAGENTA_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.ORANGE_QUARTZ_STAIRS.get(), HybridBlocksItems.ORANGE_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINK_QUARTZ_STAIRS.get(), HybridBlocksItems.PINK_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PURPLE_QUARTZ_STAIRS.get(), HybridBlocksItems.PURPLE_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.RED_QUARTZ_STAIRS.get(), HybridBlocksItems.RED_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.WHITE_QUARTZ_STAIRS.get(), HybridBlocksItems.WHITE_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.YELLOW_QUARTZ_STAIRS.get(), HybridBlocksItems.YELLOW_QUARTZ_BLOCK.get())

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_BLACK_QUARTZ_STAIRS.get(), HybridBlocksItems.SMOOTH_BLACK_QUARTZ.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_BLUE_QUARTZ_STAIRS.get(), HybridBlocksItems.SMOOTH_BLUE_QUARTZ.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_BROWN_QUARTZ_STAIRS.get(), HybridBlocksItems.SMOOTH_BROWN_QUARTZ.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_CYAN_QUARTZ_STAIRS.get(), HybridBlocksItems.SMOOTH_CYAN_QUARTZ.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_GRAY_QUARTZ_STAIRS.get(), HybridBlocksItems.SMOOTH_GRAY_QUARTZ.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_GREEN_QUARTZ_STAIRS.get(), HybridBlocksItems.SMOOTH_GREEN_QUARTZ.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_LIGHT_BLUE_QUARTZ_STAIRS.get(), HybridBlocksItems.SMOOTH_LIGHT_BLUE_QUARTZ.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_LIGHT_GRAY_QUARTZ_STAIRS.get(), HybridBlocksItems.SMOOTH_LIGHT_GRAY_QUARTZ.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_LIME_QUARTZ_STAIRS.get(), HybridBlocksItems.SMOOTH_LIME_QUARTZ.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_MAGENTA_QUARTZ_STAIRS.get(), HybridBlocksItems.SMOOTH_MAGENTA_QUARTZ.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_ORANGE_QUARTZ_STAIRS.get(), HybridBlocksItems.SMOOTH_ORANGE_QUARTZ.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_PINK_QUARTZ_STAIRS.get(), HybridBlocksItems.SMOOTH_PINK_QUARTZ.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_PURPLE_QUARTZ_STAIRS.get(), HybridBlocksItems.SMOOTH_PURPLE_QUARTZ.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_RED_QUARTZ_STAIRS.get(), HybridBlocksItems.SMOOTH_RED_QUARTZ.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_WHITE_QUARTZ_STAIRS.get(), HybridBlocksItems.SMOOTH_WHITE_QUARTZ.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_YELLOW_QUARTZ_STAIRS.get(), HybridBlocksItems.SMOOTH_YELLOW_QUARTZ.get())

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BLACK_QUARTZ_SLAB.get(), HybridBlocksItems.BLACK_QUARTZ_BLOCK.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BLUE_QUARTZ_SLAB.get(), HybridBlocksItems.BLUE_QUARTZ_BLOCK.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BROWN_QUARTZ_SLAB.get(), HybridBlocksItems.BROWN_QUARTZ_BLOCK.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CYAN_QUARTZ_SLAB.get(), HybridBlocksItems.CYAN_QUARTZ_BLOCK.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.GRAY_QUARTZ_SLAB.get(), HybridBlocksItems.GRAY_QUARTZ_BLOCK.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.GREEN_QUARTZ_SLAB.get(), HybridBlocksItems.GREEN_QUARTZ_BLOCK.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIGHT_BLUE_QUARTZ_SLAB.get(), HybridBlocksItems.LIGHT_BLUE_QUARTZ_BLOCK.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIGHT_GRAY_QUARTZ_SLAB.get(), HybridBlocksItems.LIGHT_GRAY_QUARTZ_BLOCK.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIME_QUARTZ_SLAB.get(), HybridBlocksItems.LIME_QUARTZ_BLOCK.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MAGENTA_QUARTZ_SLAB.get(), HybridBlocksItems.MAGENTA_QUARTZ_BLOCK.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.ORANGE_QUARTZ_SLAB.get(), HybridBlocksItems.ORANGE_QUARTZ_BLOCK.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINK_QUARTZ_SLAB.get(), HybridBlocksItems.PINK_QUARTZ_BLOCK.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PURPLE_QUARTZ_SLAB.get(), HybridBlocksItems.PURPLE_QUARTZ_BLOCK.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.RED_QUARTZ_SLAB.get(), HybridBlocksItems.RED_QUARTZ_BLOCK.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.WHITE_QUARTZ_SLAB.get(), HybridBlocksItems.WHITE_QUARTZ_BLOCK.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.YELLOW_QUARTZ_SLAB.get(), HybridBlocksItems.YELLOW_QUARTZ_BLOCK.get(), 2)

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_BLACK_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_BLACK_QUARTZ.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_BLUE_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_BLUE_QUARTZ.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_BROWN_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_BROWN_QUARTZ.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_CYAN_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_CYAN_QUARTZ.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_GRAY_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_GRAY_QUARTZ.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_GREEN_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_GREEN_QUARTZ.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_LIGHT_BLUE_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_LIGHT_BLUE_QUARTZ.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_LIGHT_GRAY_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_LIGHT_GRAY_QUARTZ.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_LIME_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_LIME_QUARTZ.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_MAGENTA_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_MAGENTA_QUARTZ.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_ORANGE_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_ORANGE_QUARTZ.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_PINK_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_PINK_QUARTZ.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_PURPLE_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_PURPLE_QUARTZ.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_RED_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_RED_QUARTZ.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_WHITE_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_WHITE_QUARTZ.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMOOTH_YELLOW_QUARTZ_SLAB.get(), HybridBlocksItems.SMOOTH_YELLOW_QUARTZ.get(), 2)

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CRACKED_BRICK_STAIRS.get(), HybridBlocksItems.CRACKED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_NETHER_BRICK_STAIRS.get(), HybridBlocksItems.MIXED_NETHER_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_RED_NETHER_BRICK_STAIRS.get(), HybridBlocksItems.MIXED_RED_NETHER_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BLACK_BRICK_STAIRS.get(), HybridBlocksItems.BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BLUE_BRICK_STAIRS.get(), HybridBlocksItems.BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BROWN_BRICK_STAIRS.get(), HybridBlocksItems.BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CYAN_BRICK_STAIRS.get(), HybridBlocksItems.CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.GRAY_BRICK_STAIRS.get(), HybridBlocksItems.GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.GREEN_BRICK_STAIRS.get(), HybridBlocksItems.GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIGHT_BLUE_BRICK_STAIRS.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIGHT_GRAY_BRICK_STAIRS.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIME_BRICK_STAIRS.get(), HybridBlocksItems.LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MAGENTA_BRICK_STAIRS.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.ORANGE_BRICK_STAIRS.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINK_BRICK_STAIRS.get(), HybridBlocksItems.PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PURPLE_BRICK_STAIRS.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.RED_BRICK_STAIRS.get(), HybridBlocksItems.RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.WHITE_BRICK_STAIRS.get(), HybridBlocksItems.WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.YELLOW_BRICK_STAIRS.get(), HybridBlocksItems.YELLOW_BRICKS.get())

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_BLACK_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_BLUE_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_BROWN_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_CYAN_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_GRAY_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_GREEN_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_LIGHT_BLUE_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_LIGHT_GRAY_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_LIME_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_MAGENTA_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_ORANGE_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_PINK_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_PURPLE_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_RED_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_WHITE_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_YELLOW_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_YELLOW_BRICKS.get())

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CRACKED_BRICK_WALL.get(), HybridBlocksItems.CRACKED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_NETHER_BRICK_WALL.get(), HybridBlocksItems.MIXED_NETHER_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_RED_NETHER_BRICK_WALL.get(), HybridBlocksItems.MIXED_RED_NETHER_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BLACK_BRICK_WALL.get(), HybridBlocksItems.BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BLUE_BRICK_WALL.get(), HybridBlocksItems.BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BROWN_BRICK_WALL.get(), HybridBlocksItems.BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CYAN_BRICK_WALL.get(), HybridBlocksItems.CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.GRAY_BRICK_WALL.get(), HybridBlocksItems.GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.GREEN_BRICK_WALL.get(), HybridBlocksItems.GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIGHT_BLUE_BRICK_WALL.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIGHT_GRAY_BRICK_WALL.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIME_BRICK_WALL.get(), HybridBlocksItems.LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MAGENTA_BRICK_WALL.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.ORANGE_BRICK_WALL.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINK_BRICK_WALL.get(), HybridBlocksItems.PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PURPLE_BRICK_WALL.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.RED_BRICK_WALL.get(), HybridBlocksItems.RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.WHITE_BRICK_WALL.get(), HybridBlocksItems.WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.YELLOW_BRICK_WALL.get(), HybridBlocksItems.YELLOW_BRICKS.get())

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_BRICK_WALL.get(), HybridBlocksItems.MOSSY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_BLACK_BRICK_WALL.get(), HybridBlocksItems.MOSSY_BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_BLUE_BRICK_WALL.get(), HybridBlocksItems.MOSSY_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_BROWN_BRICK_WALL.get(), HybridBlocksItems.MOSSY_BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_CYAN_BRICK_WALL.get(), HybridBlocksItems.MOSSY_CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_GRAY_BRICK_WALL.get(), HybridBlocksItems.MOSSY_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_GREEN_BRICK_WALL.get(), HybridBlocksItems.MOSSY_GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_LIGHT_BLUE_BRICK_WALL.get(), HybridBlocksItems.MOSSY_LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_LIGHT_GRAY_BRICK_WALL.get(), HybridBlocksItems.MOSSY_LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_LIME_BRICK_WALL.get(), HybridBlocksItems.MOSSY_LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_MAGENTA_BRICK_WALL.get(), HybridBlocksItems.MOSSY_MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_ORANGE_BRICK_WALL.get(), HybridBlocksItems.MOSSY_ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_PINK_BRICK_WALL.get(), HybridBlocksItems.MOSSY_PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_PURPLE_BRICK_WALL.get(), HybridBlocksItems.MOSSY_PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_RED_BRICK_WALL.get(), HybridBlocksItems.MOSSY_RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_WHITE_BRICK_WALL.get(), HybridBlocksItems.MOSSY_WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_YELLOW_BRICK_WALL.get(), HybridBlocksItems.MOSSY_YELLOW_BRICKS.get())

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CRACKED_BRICK_SLAB.get(), HybridBlocksItems.CRACKED_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_NETHER_BRICK_SLAB.get(), HybridBlocksItems.MIXED_NETHER_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_RED_NETHER_BRICK_SLAB.get(), HybridBlocksItems.MIXED_RED_NETHER_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BLACK_BRICK_SLAB.get(), HybridBlocksItems.BLACK_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BLUE_BRICK_SLAB.get(), HybridBlocksItems.BLUE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BROWN_BRICK_SLAB.get(), HybridBlocksItems.BROWN_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CYAN_BRICK_SLAB.get(), HybridBlocksItems.CYAN_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.GRAY_BRICK_SLAB.get(), HybridBlocksItems.GRAY_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.GREEN_BRICK_SLAB.get(), HybridBlocksItems.GREEN_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIGHT_BLUE_BRICK_SLAB.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIGHT_GRAY_BRICK_SLAB.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIME_BRICK_SLAB.get(), HybridBlocksItems.LIME_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MAGENTA_BRICK_SLAB.get(), HybridBlocksItems.MAGENTA_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.ORANGE_BRICK_SLAB.get(), HybridBlocksItems.ORANGE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINK_BRICK_SLAB.get(), HybridBlocksItems.PINK_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PURPLE_BRICK_SLAB.get(), HybridBlocksItems.PURPLE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.RED_BRICK_SLAB.get(), HybridBlocksItems.RED_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.WHITE_BRICK_SLAB.get(), HybridBlocksItems.WHITE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.YELLOW_BRICK_SLAB.get(), HybridBlocksItems.YELLOW_BRICKS.get(), 2)

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_BLACK_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_BLACK_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_BLUE_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_BLUE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_BROWN_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_BROWN_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_CYAN_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_CYAN_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_GRAY_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_GRAY_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_GREEN_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_GREEN_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_LIGHT_BLUE_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_LIGHT_BLUE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_LIGHT_GRAY_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_LIGHT_GRAY_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_LIME_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_LIME_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_MAGENTA_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_MAGENTA_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_ORANGE_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_ORANGE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_PINK_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_PINK_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_PURPLE_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_PURPLE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_RED_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_RED_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_WHITE_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_WHITE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_YELLOW_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_YELLOW_BRICKS.get(), 2)

        chiseled(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_BLACK_QUARTZ_BLOCK.get(), HybridBlocksItems.BLACK_QUARTZ_BLOCK.get())
        chiseled(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_BLUE_QUARTZ_BLOCK.get(), HybridBlocksItems.BLUE_QUARTZ_BLOCK.get())
        chiseled(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_BROWN_QUARTZ_BLOCK.get(), HybridBlocksItems.BROWN_QUARTZ_BLOCK.get())
        chiseled(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_CYAN_QUARTZ_BLOCK.get(), HybridBlocksItems.CYAN_QUARTZ_BLOCK.get())
        chiseled(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_GRAY_QUARTZ_BLOCK.get(), HybridBlocksItems.GRAY_QUARTZ_BLOCK.get())
        chiseled(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_GREEN_QUARTZ_BLOCK.get(), HybridBlocksItems.GREEN_QUARTZ_BLOCK.get())
        chiseled(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_LIGHT_BLUE_QUARTZ_BLOCK.get(), HybridBlocksItems.LIGHT_BLUE_QUARTZ_BLOCK.get())
        chiseled(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_LIGHT_GRAY_QUARTZ_BLOCK.get(), HybridBlocksItems.LIGHT_GRAY_QUARTZ_BLOCK.get())
        chiseled(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_LIME_QUARTZ_BLOCK.get(), HybridBlocksItems.LIME_QUARTZ_BLOCK.get())
        chiseled(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_MAGENTA_QUARTZ_BLOCK.get(), HybridBlocksItems.MAGENTA_QUARTZ_BLOCK.get())
        chiseled(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_ORANGE_QUARTZ_BLOCK.get(), HybridBlocksItems.ORANGE_QUARTZ_BLOCK.get())
        chiseled(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_PINK_QUARTZ_BLOCK.get(), HybridBlocksItems.PINK_QUARTZ_BLOCK.get())
        chiseled(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_PURPLE_QUARTZ_BLOCK.get(), HybridBlocksItems.PURPLE_QUARTZ_BLOCK.get())
        chiseled(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_RED_QUARTZ_BLOCK.get(), HybridBlocksItems.RED_QUARTZ_BLOCK.get())
        chiseled(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_WHITE_QUARTZ_BLOCK.get(), HybridBlocksItems.WHITE_QUARTZ_BLOCK.get())
        chiseled(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_YELLOW_QUARTZ_BLOCK.get(), HybridBlocksItems.YELLOW_QUARTZ_BLOCK.get())

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_BLACK_QUARTZ_BLOCK.get(), HybridBlocksItems.BLACK_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_BLUE_QUARTZ_BLOCK.get(), HybridBlocksItems.BLUE_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_BROWN_QUARTZ_BLOCK.get(), HybridBlocksItems.BROWN_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_CYAN_QUARTZ_BLOCK.get(), HybridBlocksItems.CYAN_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_GRAY_QUARTZ_BLOCK.get(), HybridBlocksItems.GRAY_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_GREEN_QUARTZ_BLOCK.get(), HybridBlocksItems.GREEN_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_LIGHT_BLUE_QUARTZ_BLOCK.get(), HybridBlocksItems.LIGHT_BLUE_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_LIGHT_GRAY_QUARTZ_BLOCK.get(), HybridBlocksItems.LIGHT_GRAY_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_LIME_QUARTZ_BLOCK.get(), HybridBlocksItems.LIME_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_MAGENTA_QUARTZ_BLOCK.get(), HybridBlocksItems.MAGENTA_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_ORANGE_QUARTZ_BLOCK.get(), HybridBlocksItems.ORANGE_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_PINK_QUARTZ_BLOCK.get(), HybridBlocksItems.PINK_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_PURPLE_QUARTZ_BLOCK.get(), HybridBlocksItems.PURPLE_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_RED_QUARTZ_BLOCK.get(), HybridBlocksItems.RED_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_WHITE_QUARTZ_BLOCK.get(), HybridBlocksItems.WHITE_QUARTZ_BLOCK.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CHISELED_YELLOW_QUARTZ_BLOCK.get(), HybridBlocksItems.YELLOW_QUARTZ_BLOCK.get())

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.DORIC_COLUMN.get(), Items.CALCITE)

        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.CRACKED_BRICK_WALL.get(), HybridBlocksItems.CRACKED_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MIXED_NETHER_BRICK_WALL.get(), HybridBlocksItems.MIXED_NETHER_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MIXED_RED_NETHER_BRICK_WALL.get(), HybridBlocksItems.MIXED_RED_NETHER_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_BRICK_WALL.get(), HybridBlocksItems.MOSSY_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.BLACK_BRICK_WALL.get(), HybridBlocksItems.BLACK_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_BLACK_BRICK_WALL.get(), HybridBlocksItems.MOSSY_BLACK_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.BLUE_BRICK_WALL.get(), HybridBlocksItems.BLUE_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_BLUE_BRICK_WALL.get(), HybridBlocksItems.MOSSY_BLUE_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.BROWN_BRICK_WALL.get(), HybridBlocksItems.BROWN_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_BROWN_BRICK_WALL.get(), HybridBlocksItems.MOSSY_BROWN_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.CYAN_BRICK_WALL.get(), HybridBlocksItems.CYAN_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_CYAN_BRICK_WALL.get(), HybridBlocksItems.MOSSY_CYAN_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.GRAY_BRICK_WALL.get(), HybridBlocksItems.GRAY_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_GRAY_BRICK_WALL.get(), HybridBlocksItems.MOSSY_GRAY_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.GREEN_BRICK_WALL.get(), HybridBlocksItems.GREEN_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_GREEN_BRICK_WALL.get(), HybridBlocksItems.MOSSY_GREEN_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.LIGHT_BLUE_BRICK_WALL.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_LIGHT_BLUE_BRICK_WALL.get(), HybridBlocksItems.MOSSY_LIGHT_BLUE_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.LIGHT_GRAY_BRICK_WALL.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_LIGHT_GRAY_BRICK_WALL.get(), HybridBlocksItems.MOSSY_LIGHT_GRAY_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.LIME_BRICK_WALL.get(), HybridBlocksItems.LIME_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_LIME_BRICK_WALL.get(), HybridBlocksItems.MOSSY_LIME_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MAGENTA_BRICK_WALL.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_MAGENTA_BRICK_WALL.get(), HybridBlocksItems.MOSSY_MAGENTA_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.ORANGE_BRICK_WALL.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_ORANGE_BRICK_WALL.get(), HybridBlocksItems.MOSSY_ORANGE_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.PINK_BRICK_WALL.get(), HybridBlocksItems.PINK_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_PINK_BRICK_WALL.get(), HybridBlocksItems.MOSSY_PINK_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.PURPLE_BRICK_WALL.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_PURPLE_BRICK_WALL.get(), HybridBlocksItems.MOSSY_PURPLE_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.RED_BRICK_WALL.get(), HybridBlocksItems.RED_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_RED_BRICK_WALL.get(), HybridBlocksItems.MOSSY_RED_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.WHITE_BRICK_WALL.get(), HybridBlocksItems.WHITE_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_WHITE_BRICK_WALL.get(), HybridBlocksItems.MOSSY_WHITE_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.YELLOW_BRICK_WALL.get(), HybridBlocksItems.YELLOW_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_YELLOW_BRICK_WALL.get(), HybridBlocksItems.MOSSY_YELLOW_BRICKS.get())

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINWHEEL_BRICKS.get(), Blocks.BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINWHEEL_NETHER_BRICKS.get(), Blocks.NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINWHEEL_RED_NETHER_BRICKS.get(), Blocks.RED_NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINWHEEL_BLACK_BRICKS.get(), HybridBlocksItems.BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINWHEEL_BLUE_BRICKS.get(), HybridBlocksItems.BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINWHEEL_BROWN_BRICKS.get(), HybridBlocksItems.BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINWHEEL_CYAN_BRICKS.get(), HybridBlocksItems.CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINWHEEL_GRAY_BRICKS.get(), HybridBlocksItems.GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINWHEEL_GREEN_BRICKS.get(), HybridBlocksItems.GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINWHEEL_LIGHT_BLUE_BRICKS.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINWHEEL_LIGHT_GRAY_BRICKS.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINWHEEL_LIME_BRICKS.get(), HybridBlocksItems.LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINWHEEL_MAGENTA_BRICKS.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINWHEEL_ORANGE_BRICKS.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINWHEEL_PINK_BRICKS.get(), HybridBlocksItems.PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINWHEEL_PURPLE_BRICKS.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINWHEEL_RED_BRICKS.get(), HybridBlocksItems.RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINWHEEL_WHITE_BRICKS.get(), HybridBlocksItems.WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINWHEEL_YELLOW_BRICKS.get(), HybridBlocksItems.YELLOW_BRICKS.get())

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.JACK_ON_JACK_BRICKS.get(), Blocks.BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.JACK_ON_JACK_NETHER_BRICKS.get(), Blocks.NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.JACK_ON_JACK_RED_NETHER_BRICKS.get(), Blocks.RED_NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.JACK_ON_JACK_BLACK_BRICKS.get(), HybridBlocksItems.BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.JACK_ON_JACK_BLUE_BRICKS.get(), HybridBlocksItems.BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.JACK_ON_JACK_BROWN_BRICKS.get(), HybridBlocksItems.BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.JACK_ON_JACK_CYAN_BRICKS.get(), HybridBlocksItems.CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.JACK_ON_JACK_GRAY_BRICKS.get(), HybridBlocksItems.GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.JACK_ON_JACK_GREEN_BRICKS.get(), HybridBlocksItems.GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.JACK_ON_JACK_LIGHT_BLUE_BRICKS.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.JACK_ON_JACK_LIGHT_GRAY_BRICKS.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.JACK_ON_JACK_LIME_BRICKS.get(), HybridBlocksItems.LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.JACK_ON_JACK_MAGENTA_BRICKS.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.JACK_ON_JACK_ORANGE_BRICKS.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.JACK_ON_JACK_PINK_BRICKS.get(), HybridBlocksItems.PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.JACK_ON_JACK_PURPLE_BRICKS.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.JACK_ON_JACK_RED_BRICKS.get(), HybridBlocksItems.RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.JACK_ON_JACK_WHITE_BRICKS.get(), HybridBlocksItems.WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.JACK_ON_JACK_YELLOW_BRICKS.get(), HybridBlocksItems.YELLOW_BRICKS.get())

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BRICKS.get(), Items.BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_NETHER_BRICKS.get(), Items.NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_RED_NETHER_BRICKS.get(), Items.RED_NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BLACK_BRICKS.get(), HybridBlocksItems.BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BLUE_BRICKS.get(), HybridBlocksItems.BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BROWN_BRICKS.get(), HybridBlocksItems.BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_CYAN_BRICKS.get(), HybridBlocksItems.CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_GRAY_BRICKS.get(), HybridBlocksItems.GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_GREEN_BRICKS.get(), HybridBlocksItems.GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_LIGHT_BLUE_BRICKS.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_LIGHT_GRAY_BRICKS.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_LIME_BRICKS.get(), HybridBlocksItems.LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_MAGENTA_BRICKS.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_ORANGE_BRICKS.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_PINK_BRICKS.get(), HybridBlocksItems.PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_PURPLE_BRICKS.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_RED_BRICKS.get(), HybridBlocksItems.RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_WHITE_BRICKS.get(), HybridBlocksItems.WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_YELLOW_BRICKS.get(), HybridBlocksItems.YELLOW_BRICKS.get())

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BASKETWEAVE_BRICKS.get(), Items.BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BASKETWEAVE_NETHER_BRICKS.get(), Items.NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BASKETWEAVE_RED_NETHER_BRICKS.get(), Items.RED_NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BASKETWEAVE_BLACK_BRICKS.get(), HybridBlocksItems.BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BASKETWEAVE_BLUE_BRICKS.get(), HybridBlocksItems.BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BASKETWEAVE_BROWN_BRICKS.get(), HybridBlocksItems.BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BASKETWEAVE_CYAN_BRICKS.get(), HybridBlocksItems.CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BASKETWEAVE_GRAY_BRICKS.get(), HybridBlocksItems.GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BASKETWEAVE_GREEN_BRICKS.get(), HybridBlocksItems.GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BASKETWEAVE_LIGHT_BLUE_BRICKS.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BASKETWEAVE_LIGHT_GRAY_BRICKS.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BASKETWEAVE_LIME_BRICKS.get(), HybridBlocksItems.LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BASKETWEAVE_MAGENTA_BRICKS.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BASKETWEAVE_ORANGE_BRICKS.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BASKETWEAVE_PINK_BRICKS.get(), HybridBlocksItems.PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BASKETWEAVE_PURPLE_BRICKS.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BASKETWEAVE_RED_BRICKS.get(), HybridBlocksItems.RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BASKETWEAVE_WHITE_BRICKS.get(), HybridBlocksItems.WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BASKETWEAVE_YELLOW_BRICKS.get(), HybridBlocksItems.YELLOW_BRICKS.get())

        // stained quartz pillar
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksItems.BLACK_QUARTZ_PILLAR.get(), Items.BLACK_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksItems.BLUE_QUARTZ_PILLAR.get(), Items.BLUE_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksItems.BROWN_QUARTZ_PILLAR.get(), Items.BROWN_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksItems.CYAN_QUARTZ_PILLAR.get(), Items.CYAN_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksItems.GRAY_QUARTZ_PILLAR.get(), Items.GRAY_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksItems.GREEN_QUARTZ_PILLAR.get(), Items.GREEN_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksItems.LIGHT_BLUE_QUARTZ_PILLAR.get(), Items.LIGHT_BLUE_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksItems.LIGHT_GRAY_QUARTZ_PILLAR.get(), Items.LIGHT_GRAY_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksItems.LIME_QUARTZ_PILLAR.get(), Items.LIME_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksItems.MAGENTA_QUARTZ_PILLAR.get(), Items.MAGENTA_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksItems.ORANGE_QUARTZ_PILLAR.get(), Items.ORANGE_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksItems.PINK_QUARTZ_PILLAR.get(), Items.PINK_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksItems.PURPLE_QUARTZ_PILLAR.get(), Items.PURPLE_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksItems.RED_QUARTZ_PILLAR.get(), Items.RED_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksItems.WHITE_QUARTZ_PILLAR.get(), Items.WHITE_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksItems.YELLOW_QUARTZ_PILLAR.get(), Items.YELLOW_DYE)

        // stained bricks
        offerBricksDyeingRecipe(exporter, HybridBlocksItems.BLACK_BRICKS.get(), Items.BLACK_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksItems.BLUE_BRICKS.get(), Items.BLUE_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksItems.BROWN_BRICKS.get(), Items.BROWN_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksItems.CYAN_BRICKS.get(), Items.CYAN_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksItems.GRAY_BRICKS.get(), Items.GRAY_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksItems.GREEN_BRICKS.get(), Items.GREEN_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksItems.LIGHT_BLUE_BRICKS.get(), Items.LIGHT_BLUE_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksItems.LIGHT_GRAY_BRICKS.get(), Items.LIGHT_GRAY_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksItems.LIME_BRICKS.get(), Items.LIME_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksItems.MAGENTA_BRICKS.get(), Items.MAGENTA_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksItems.ORANGE_BRICKS.get(), Items.ORANGE_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksItems.PINK_BRICKS.get(), Items.PINK_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksItems.PURPLE_BRICKS.get(), Items.PURPLE_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksItems.RED_BRICKS.get(), Items.RED_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksItems.WHITE_BRICKS.get(), Items.WHITE_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksItems.YELLOW_BRICKS.get(), Items.YELLOW_DYE)

        // cracked bricks
        offerBricksSmeltingRecipe(exporter, Items.BRICKS, "has_bricks", "bricks", HybridBlocksItems.CRACKED_BRICKS.get(), Items.BRICKS)

        // stained cracked bricks
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksItems.BLACK_BRICKS.get(), HybridBlocksItems.CRACKED_BLACK_BRICKS.get(), Items.BLACK_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksItems.BLUE_BRICKS.get(), HybridBlocksItems.CRACKED_BLUE_BRICKS.get(), Items.BLUE_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksItems.BROWN_BRICKS.get(), HybridBlocksItems.CRACKED_BROWN_BRICKS.get(), Items.BROWN_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksItems.CYAN_BRICKS.get(), HybridBlocksItems.CRACKED_CYAN_BRICKS.get(), Items.CYAN_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksItems.GRAY_BRICKS.get(), HybridBlocksItems.CRACKED_GRAY_BRICKS.get(), Items.GRAY_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksItems.GREEN_BRICKS.get(), HybridBlocksItems.CRACKED_GREEN_BRICKS.get(), Items.GREEN_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksItems.LIGHT_BLUE_BRICKS.get(), HybridBlocksItems.CRACKED_LIGHT_BLUE_BRICKS.get(), Items.LIGHT_BLUE_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksItems.LIGHT_GRAY_BRICKS.get(), HybridBlocksItems.CRACKED_LIGHT_GRAY_BRICKS.get(), Items.LIGHT_GRAY_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksItems.LIME_BRICKS.get(), HybridBlocksItems.CRACKED_LIME_BRICKS.get(), Items.LIME_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksItems.MAGENTA_BRICKS.get(), HybridBlocksItems.CRACKED_MAGENTA_BRICKS.get(), Items.MAGENTA_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksItems.ORANGE_BRICKS.get(), HybridBlocksItems.CRACKED_ORANGE_BRICKS.get(), Items.ORANGE_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksItems.PINK_BRICKS.get(), HybridBlocksItems.CRACKED_PINK_BRICKS.get(), Items.PINK_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksItems.PURPLE_BRICKS.get(), HybridBlocksItems.CRACKED_PURPLE_BRICKS.get(), Items.PURPLE_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksItems.RED_BRICKS.get(), HybridBlocksItems.CRACKED_RED_BRICKS.get(), Items.RED_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksItems.WHITE_BRICKS.get(), HybridBlocksItems.CRACKED_WHITE_BRICKS.get(), Items.WHITE_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksItems.YELLOW_BRICKS.get(), HybridBlocksItems.CRACKED_YELLOW_BRICKS.get(), Items.YELLOW_DYE)

        simpleCookingRecipe(exporter, "smelting", RecipeSerializer.SMELTING_RECIPE, 200, Items.GLASS, HybridBlocksItems.CLEAR_GLASS.get(), 0.15f)
        offerStainedClearGlassRecipes(exporter, Items.BLACK_STAINED_GLASS, HybridBlocksItems.BLACK_STAINED_CLEAR_GLASS.get(), Items.BLACK_DYE)
        offerStainedClearGlassRecipes(exporter, Items.BLUE_STAINED_GLASS, HybridBlocksItems.BLUE_STAINED_CLEAR_GLASS.get(), Items.BLUE_DYE)
        offerStainedClearGlassRecipes(exporter, Items.BROWN_STAINED_GLASS, HybridBlocksItems.BROWN_STAINED_CLEAR_GLASS.get(), Items.BROWN_DYE)
        offerStainedClearGlassRecipes(exporter, Items.CYAN_STAINED_GLASS, HybridBlocksItems.CYAN_STAINED_CLEAR_GLASS.get(), Items.CYAN_DYE)
        offerStainedClearGlassRecipes(exporter, Items.GRAY_STAINED_GLASS, HybridBlocksItems.GRAY_STAINED_CLEAR_GLASS.get(), Items.GRAY_DYE)
        offerStainedClearGlassRecipes(exporter, Items.GREEN_STAINED_GLASS, HybridBlocksItems.GREEN_STAINED_CLEAR_GLASS.get(), Items.GREEN_DYE)
        offerStainedClearGlassRecipes(exporter, Items.LIGHT_BLUE_STAINED_GLASS, HybridBlocksItems.LIGHT_BLUE_STAINED_CLEAR_GLASS.get(), Items.LIGHT_BLUE_DYE)
        offerStainedClearGlassRecipes(exporter, Items.LIGHT_GRAY_STAINED_GLASS, HybridBlocksItems.LIGHT_GRAY_STAINED_CLEAR_GLASS.get(), Items.LIGHT_GRAY_DYE)
        offerStainedClearGlassRecipes(exporter, Items.LIME_STAINED_GLASS, HybridBlocksItems.LIME_STAINED_CLEAR_GLASS.get(), Items.LIME_DYE)
        offerStainedClearGlassRecipes(exporter, Items.MAGENTA_STAINED_GLASS, HybridBlocksItems.MAGENTA_STAINED_CLEAR_GLASS.get(), Items.MAGENTA_DYE)
        offerStainedClearGlassRecipes(exporter, Items.ORANGE_STAINED_GLASS, HybridBlocksItems.ORANGE_STAINED_CLEAR_GLASS.get(), Items.ORANGE_DYE)
        offerStainedClearGlassRecipes(exporter, Items.PINK_STAINED_GLASS, HybridBlocksItems.PINK_STAINED_CLEAR_GLASS.get(), Items.PINK_DYE)
        offerStainedClearGlassRecipes(exporter, Items.PURPLE_STAINED_GLASS, HybridBlocksItems.PURPLE_STAINED_CLEAR_GLASS.get(), Items.PURPLE_DYE)
        offerStainedClearGlassRecipes(exporter, Items.RED_STAINED_GLASS, HybridBlocksItems.RED_STAINED_CLEAR_GLASS.get(), Items.RED_DYE)
        offerStainedClearGlassRecipes(exporter, Items.WHITE_STAINED_GLASS, HybridBlocksItems.WHITE_STAINED_CLEAR_GLASS.get(), Items.WHITE_DYE)
        offerStainedClearGlassRecipes(exporter, Items.YELLOW_STAINED_GLASS, HybridBlocksItems.YELLOW_STAINED_CLEAR_GLASS.get(), Items.YELLOW_DYE)

        // mossy bricks
        offerMossingRecipes(exporter, "mossy_bricks", HybridBlocksItems.MOSSY_BRICKS.get(), Items.BRICKS)

        // stained mossy bricks
        offerStainedMossyBricksRecipes(exporter, HybridBlocksItems.BLACK_BRICKS.get(), HybridBlocksItems.MOSSY_BLACK_BRICKS.get(), Items.BLACK_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksItems.BLUE_BRICKS.get(), HybridBlocksItems.MOSSY_BLUE_BRICKS.get(), Items.BLUE_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksItems.BROWN_BRICKS.get(), HybridBlocksItems.MOSSY_BROWN_BRICKS.get(), Items.BROWN_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksItems.CYAN_BRICKS.get(), HybridBlocksItems.MOSSY_CYAN_BRICKS.get(), Items.CYAN_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksItems.GRAY_BRICKS.get(), HybridBlocksItems.MOSSY_GRAY_BRICKS.get(), Items.GRAY_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksItems.GREEN_BRICKS.get(), HybridBlocksItems.MOSSY_GREEN_BRICKS.get(), Items.GREEN_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksItems.LIGHT_BLUE_BRICKS.get(), HybridBlocksItems.MOSSY_LIGHT_BLUE_BRICKS.get(), Items.LIGHT_BLUE_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksItems.LIGHT_GRAY_BRICKS.get(), HybridBlocksItems.MOSSY_LIGHT_GRAY_BRICKS.get(), Items.LIGHT_GRAY_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksItems.LIME_BRICKS.get(), HybridBlocksItems.MOSSY_LIME_BRICKS.get(), Items.LIME_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksItems.MAGENTA_BRICKS.get(), HybridBlocksItems.MOSSY_MAGENTA_BRICKS.get(), Items.MAGENTA_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksItems.ORANGE_BRICKS.get(), HybridBlocksItems.MOSSY_ORANGE_BRICKS.get(), Items.ORANGE_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksItems.PINK_BRICKS.get(), HybridBlocksItems.MOSSY_PINK_BRICKS.get(), Items.PINK_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksItems.PURPLE_BRICKS.get(), HybridBlocksItems.MOSSY_PURPLE_BRICKS.get(), Items.PURPLE_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksItems.RED_BRICKS.get(), HybridBlocksItems.MOSSY_RED_BRICKS.get(), Items.RED_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksItems.WHITE_BRICKS.get(), HybridBlocksItems.MOSSY_WHITE_BRICKS.get(), Items.WHITE_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksItems.YELLOW_BRICKS.get(), HybridBlocksItems.MOSSY_YELLOW_BRICKS.get(), Items.YELLOW_DYE)
    }

    companion object {
        private fun convertBetween(to: Item, from: Item): String {
            return "${BuiltInRegistries.ITEM.getKey(to.asItem())}_from_${from.asItem()}"
        }

        private fun offerDyeingRecipe(
            exporter: Consumer<FinishedRecipe>,
            base: Item,
            unlockedBy: String,
            group: String,
            output: Item,
            dye: Item
        ) {
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 8)
                .define(Character.valueOf('#'), base)
                .define(Character.valueOf('X'), dye)

                .pattern("###")
                .pattern("#X#")
                .pattern("###")

                .group(group)
                .unlockedBy(unlockedBy, InventoryChangeTrigger.TriggerInstance.hasItems(base))

                .save(exporter)
        }

        private fun offerBrickRecipe(
            exporter: Consumer<FinishedRecipe>,
            base: Item,
            unlockedBy: String,
            group: String,
            output: Item
        ) {
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .define(Character.valueOf('#'), base)

                .pattern(" ##")
                .pattern(" ##")
                .pattern("   ")

                .group(group)
                .unlockedBy(unlockedBy, InventoryChangeTrigger.TriggerInstance.hasItems(base))

                .save(exporter)
        }

        private fun offerQuartzPillarDyeingRecipe(
            exporter: Consumer<FinishedRecipe>,
            output: Item,
            input: Item
        ) {
            offerDyeingRecipe(
                exporter,
                Items.QUARTZ_PILLAR,
                "has_quartz_pillar",
                "stained_quartz_pillar",
                output,
                input
            )
        }

        private fun offerSmoothQuartzDyeingRecipe(
            exporter: Consumer<FinishedRecipe>,
            output: Item,
            input: Item
        ) {
            offerDyeingRecipe(
                exporter,
                Items.SMOOTH_QUARTZ,
                "has_smooth_quartz",
                "stained_smooth_quartz",
                output,
                input
            )
        }

        private fun offerBricksDyeingRecipe(
            exporter: Consumer<FinishedRecipe>,
            output: Item,
            input: Item
        ) {
            offerDyeingRecipe(
                exporter,
                Items.BRICKS,
                "has_bricks",
                "stained_bricks",
                output,
                input
            )
        }

        private fun offerBricksSmeltingRecipe(
            exporter: Consumer<FinishedRecipe>,
            base: Item,
            unlockedBy: String,
            group: String,
            output: Item,
            input: Item
        ) {
            SimpleCookingRecipeBuilder.smelting(
                Ingredient.of(input),
                RecipeCategory.BUILDING_BLOCKS,
                output,
                0.1f,
                200
            )
                .group(group)
                .unlockedBy(unlockedBy, InventoryChangeTrigger.TriggerInstance.hasItems(base))
                .save(exporter, "${BuiltInRegistries.ITEM.getKey(output.asItem())}_from_smelting")
        }

        private fun offerStainedCrackedBricksRecipes(
            exporter: Consumer<FinishedRecipe>,
            base: Item,
            cracked: Item,
            dye: Item
        ) {
            offerDyeingRecipe(
                exporter,
                HybridBlocksItems.CRACKED_BRICKS.get(),
                "has_cracked_bricks",
                "stained_cracked_bricks",
                cracked,
                dye
            )

            offerBricksSmeltingRecipe(
                exporter,
                HybridBlocksItems.CRACKED_BRICKS.get(),
                "has_cracked_bricks",
                "stained_cracked_bricks",
                cracked,
                base
            )
        }

        private fun offerQuartzBricksRecipes(
            exporter: Consumer<FinishedRecipe>,
            base: Item,
            brick: Item,
        ) {
            offerBrickRecipe(
                exporter,
                base,
                "has_quartz_block",
                "quartz_bricks",
                brick
            )

            stonecutterResultFromBase(
                exporter,
                RecipeCategory.BUILDING_BLOCKS,
                brick,
                base
            )
        }

        private fun offerClearGlassSmeltingRecipe(
            exporter: Consumer<FinishedRecipe>,
            base: Item,
            unlockedBy: String,
            group: String,
            output: Item,
            input: Item
        ) {
            SimpleCookingRecipeBuilder.smelting(
                Ingredient.of(input),
                RecipeCategory.BUILDING_BLOCKS,
                output,
                0.1f,
                200
            )
                .group(group)
                .unlockedBy(unlockedBy, InventoryChangeTrigger.TriggerInstance.hasItems(base))
                .save(exporter, "${BuiltInRegistries.ITEM.getKey(output.asItem())}_from_smelting")
        }

        private fun offerStainedClearGlassRecipes(
            exporter: Consumer<FinishedRecipe>,
            base: Item,
            output: Item,
            dye: Item
        ) {
            offerDyeingRecipe(
                exporter,
                HybridBlocksItems.CLEAR_GLASS.get(),
                "has_clear_glass",
                "stained_clear_glass",
                output,
                dye
            )

            offerClearGlassSmeltingRecipe(
                exporter,
                HybridBlocksItems.CLEAR_GLASS.get(),
                "has_clear_glass",
                "stained_clear_glass",
                output,
                base
            )
        }

        private fun offerStainedMossyBricksRecipes(
            exporter: Consumer<FinishedRecipe>,
            base: Item,
            mossy: Item,
            dye: Item
        ) {
            offerDyeingRecipe(
                exporter,
                HybridBlocksItems.MOSSY_BRICKS.get(),
                "has_mossy_bricks",
                "stained_mossy_bricks",
                mossy,
                dye
            )

            offerMossingRecipes(
                exporter,
                "stained_mossy_bricks",
                mossy,
                base
            )
        }

        private fun offerMossingRecipes(
            exporter: Consumer<FinishedRecipe>,
            group: String,
            output: Item,
            input: Item
        ) {
            ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, output)
                .requires(input)
                .requires(Blocks.VINE)

                .group(group)
                .unlockedBy("has_vine", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.VINE))

                .save(exporter, convertBetween(output, Items.VINE))

            ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, output)
                .requires(input)
                .requires(Blocks.MOSS_BLOCK)

                .group(group)
                .unlockedBy("has_moss_block", InventoryChangeTrigger.TriggerInstance.hasItems(Blocks.MOSS_BLOCK))

                .save(exporter, convertBetween(output, Items.MOSS_BLOCK))
        }
    }
}
