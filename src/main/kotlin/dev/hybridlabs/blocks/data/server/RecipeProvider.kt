package dev.hybridlabs.blocks.data.server

import dev.hybridlabs.blocks.block.HybridBlocksBlocks
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.block.Blocks
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder
import net.minecraft.data.server.recipe.RecipeJsonProvider
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder
import net.minecraft.item.ItemConvertible
import net.minecraft.item.Items
import net.minecraft.recipe.Ingredient
import net.minecraft.recipe.book.RecipeCategory
import net.minecraft.registry.Registries
import java.util.function.Consumer

/**
 * Generates all recipes.
 */
@Suppress("SameParameterValue")
class RecipeProvider(output: FabricDataOutput) : FabricRecipeProvider(output) {
    override fun generate(exporter: Consumer<RecipeJsonProvider>) {
        // stained smooth quartz
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.SMOOTH_BLACK_QUARTZ, Items.BLACK_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.SMOOTH_BLUE_QUARTZ, Items.BLUE_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.SMOOTH_BROWN_QUARTZ, Items.BROWN_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.SMOOTH_CYAN_QUARTZ, Items.CYAN_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.SMOOTH_GRAY_QUARTZ, Items.GRAY_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.SMOOTH_GREEN_QUARTZ, Items.GREEN_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.SMOOTH_LIGHT_BLUE_QUARTZ, Items.LIGHT_BLUE_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.SMOOTH_LIGHT_GRAY_QUARTZ, Items.LIGHT_GRAY_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.SMOOTH_LIME_QUARTZ, Items.LIME_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.SMOOTH_MAGENTA_QUARTZ, Items.MAGENTA_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.SMOOTH_ORANGE_QUARTZ, Items.ORANGE_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.SMOOTH_PINK_QUARTZ, Items.PINK_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.SMOOTH_PURPLE_QUARTZ, Items.PURPLE_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.SMOOTH_RED_QUARTZ, Items.RED_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.SMOOTH_WHITE_QUARTZ, Items.WHITE_DYE)
        offerSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.SMOOTH_YELLOW_QUARTZ, Items.YELLOW_DYE)

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BLACK_QUARTZ_SLAB, HybridBlocksBlocks.BLACK_QUARTZ_BLOCK)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BLUE_QUARTZ_SLAB, HybridBlocksBlocks.BLUE_QUARTZ_BLOCK)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BROWN_QUARTZ_SLAB, HybridBlocksBlocks.BROWN_QUARTZ_BLOCK)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CYAN_QUARTZ_SLAB, HybridBlocksBlocks.CYAN_QUARTZ_BLOCK)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.GRAY_QUARTZ_SLAB, HybridBlocksBlocks.GRAY_QUARTZ_BLOCK)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.GREEN_QUARTZ_SLAB, HybridBlocksBlocks.GREEN_QUARTZ_BLOCK)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_SLAB, HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_BLOCK)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_SLAB, HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_BLOCK)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.LIME_QUARTZ_SLAB, HybridBlocksBlocks.LIME_QUARTZ_BLOCK)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MAGENTA_QUARTZ_SLAB, HybridBlocksBlocks.MAGENTA_QUARTZ_BLOCK)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.ORANGE_QUARTZ_SLAB, HybridBlocksBlocks.ORANGE_QUARTZ_BLOCK)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINK_QUARTZ_SLAB, HybridBlocksBlocks.PINK_QUARTZ_BLOCK)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PURPLE_QUARTZ_SLAB, HybridBlocksBlocks.PURPLE_QUARTZ_BLOCK)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.RED_QUARTZ_SLAB, HybridBlocksBlocks.RED_QUARTZ_BLOCK)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.WHITE_QUARTZ_SLAB, HybridBlocksBlocks.WHITE_QUARTZ_BLOCK)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.YELLOW_QUARTZ_SLAB, HybridBlocksBlocks.YELLOW_QUARTZ_BLOCK)

        createStairsRecipe(HybridBlocksBlocks.BLACK_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.BLACK_QUARTZ_BLOCK))
            .criterion(hasItem(Blocks.QUARTZ_BLOCK), conditionsFromItem(Blocks.QUARTZ_BLOCK))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.BLUE_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.BLUE_QUARTZ_BLOCK))
            .criterion(hasItem(Blocks.QUARTZ_BLOCK), conditionsFromItem(Blocks.QUARTZ_BLOCK))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.BROWN_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.BROWN_QUARTZ_BLOCK))
            .criterion(hasItem(Blocks.QUARTZ_BLOCK), conditionsFromItem(Blocks.QUARTZ_BLOCK))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.CYAN_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.CYAN_QUARTZ_BLOCK))
            .criterion(hasItem(Blocks.QUARTZ_BLOCK), conditionsFromItem(Blocks.QUARTZ_BLOCK))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.GRAY_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.GRAY_QUARTZ_BLOCK))
            .criterion(hasItem(Blocks.QUARTZ_BLOCK), conditionsFromItem(Blocks.QUARTZ_BLOCK))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.GREEN_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.GREEN_QUARTZ_BLOCK))
            .criterion(hasItem(Blocks.QUARTZ_BLOCK), conditionsFromItem(Blocks.QUARTZ_BLOCK))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_BLOCK))
            .criterion(hasItem(Blocks.QUARTZ_BLOCK), conditionsFromItem(Blocks.QUARTZ_BLOCK))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_BLOCK))
            .criterion(hasItem(Blocks.QUARTZ_BLOCK), conditionsFromItem(Blocks.QUARTZ_BLOCK))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.LIME_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.LIME_QUARTZ_BLOCK))
            .criterion(hasItem(Blocks.QUARTZ_BLOCK), conditionsFromItem(Blocks.QUARTZ_BLOCK))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.MAGENTA_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.MAGENTA_QUARTZ_BLOCK))
            .criterion(hasItem(Blocks.QUARTZ_BLOCK), conditionsFromItem(Blocks.QUARTZ_BLOCK))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.ORANGE_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.ORANGE_QUARTZ_BLOCK))
            .criterion(hasItem(Blocks.QUARTZ_BLOCK), conditionsFromItem(Blocks.QUARTZ_BLOCK))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.PINK_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.PINK_QUARTZ_BLOCK))
            .criterion(hasItem(Blocks.QUARTZ_BLOCK), conditionsFromItem(Blocks.QUARTZ_BLOCK))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.PURPLE_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.PURPLE_QUARTZ_BLOCK))
            .criterion(hasItem(Blocks.QUARTZ_BLOCK), conditionsFromItem(Blocks.QUARTZ_BLOCK))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.RED_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.RED_QUARTZ_BLOCK))
            .criterion(hasItem(Blocks.QUARTZ_BLOCK), conditionsFromItem(Blocks.QUARTZ_BLOCK))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.WHITE_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.WHITE_QUARTZ_BLOCK))
            .criterion(hasItem(Blocks.QUARTZ_BLOCK), conditionsFromItem(Blocks.QUARTZ_BLOCK))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.YELLOW_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.YELLOW_QUARTZ_BLOCK))
            .criterion(hasItem(Blocks.QUARTZ_BLOCK), conditionsFromItem(Blocks.QUARTZ_BLOCK))
            .offerTo(exporter)

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_BLACK_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_BLACK_QUARTZ)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_BLUE_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_BLUE_QUARTZ)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_BROWN_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_BROWN_QUARTZ)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_CYAN_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_CYAN_QUARTZ)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_GRAY_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_GRAY_QUARTZ)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_GREEN_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_GREEN_QUARTZ)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_LIGHT_BLUE_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_LIGHT_BLUE_QUARTZ)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_LIGHT_GRAY_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_LIGHT_GRAY_QUARTZ)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_LIME_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_LIME_QUARTZ)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_MAGENTA_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_MAGENTA_QUARTZ)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_ORANGE_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_ORANGE_QUARTZ)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_PINK_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_PINK_QUARTZ)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_PURPLE_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_PURPLE_QUARTZ)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_RED_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_RED_QUARTZ)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_WHITE_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_WHITE_QUARTZ)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_YELLOW_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_YELLOW_QUARTZ)

        offerQuartzBricksRecipes(exporter, HybridBlocksBlocks.BLACK_QUARTZ_BLOCK, HybridBlocksBlocks.BLACK_QUARTZ_BRICKS)
        offerQuartzBricksRecipes(exporter, HybridBlocksBlocks.BLUE_QUARTZ_BLOCK, HybridBlocksBlocks.BLUE_QUARTZ_BRICKS)
        offerQuartzBricksRecipes(exporter, HybridBlocksBlocks.BROWN_QUARTZ_BLOCK, HybridBlocksBlocks.BROWN_QUARTZ_BRICKS)
        offerQuartzBricksRecipes(exporter, HybridBlocksBlocks.CYAN_QUARTZ_BLOCK, HybridBlocksBlocks.CYAN_QUARTZ_BRICKS)
        offerQuartzBricksRecipes(exporter, HybridBlocksBlocks.GRAY_QUARTZ_BLOCK, HybridBlocksBlocks.GRAY_QUARTZ_BRICKS)
        offerQuartzBricksRecipes(exporter, HybridBlocksBlocks.GREEN_QUARTZ_BLOCK, HybridBlocksBlocks.GREEN_QUARTZ_BRICKS)
        offerQuartzBricksRecipes(exporter, HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_BLOCK, HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_BRICKS)
        offerQuartzBricksRecipes(exporter, HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_BLOCK, HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_BRICKS)
        offerQuartzBricksRecipes(exporter, HybridBlocksBlocks.LIME_QUARTZ_BLOCK, HybridBlocksBlocks.LIME_QUARTZ_BRICKS)
        offerQuartzBricksRecipes(exporter, HybridBlocksBlocks.MAGENTA_QUARTZ_BLOCK, HybridBlocksBlocks.MAGENTA_QUARTZ_BRICKS)
        offerQuartzBricksRecipes(exporter, HybridBlocksBlocks.ORANGE_QUARTZ_BLOCK, HybridBlocksBlocks.ORANGE_QUARTZ_BRICKS)
        offerQuartzBricksRecipes(exporter, HybridBlocksBlocks.PINK_QUARTZ_BLOCK, HybridBlocksBlocks.PINK_QUARTZ_BRICKS)
        offerQuartzBricksRecipes(exporter, HybridBlocksBlocks.PURPLE_QUARTZ_BLOCK, HybridBlocksBlocks.PURPLE_QUARTZ_BRICKS)
        offerQuartzBricksRecipes(exporter, HybridBlocksBlocks.RED_QUARTZ_BLOCK, HybridBlocksBlocks.RED_QUARTZ_BRICKS)
        offerQuartzBricksRecipes(exporter, HybridBlocksBlocks.WHITE_QUARTZ_BLOCK, HybridBlocksBlocks.WHITE_QUARTZ_BRICKS)
        offerQuartzBricksRecipes(exporter, HybridBlocksBlocks.YELLOW_QUARTZ_BLOCK, HybridBlocksBlocks.YELLOW_QUARTZ_BRICKS)

        createStairsRecipe(HybridBlocksBlocks.SMOOTH_BLACK_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.SMOOTH_BLACK_QUARTZ))
            .criterion(hasItem(Blocks.SMOOTH_QUARTZ), conditionsFromItem(Blocks.SMOOTH_QUARTZ))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.SMOOTH_BLUE_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.SMOOTH_BLUE_QUARTZ))
            .criterion(hasItem(Blocks.SMOOTH_QUARTZ), conditionsFromItem(Blocks.SMOOTH_QUARTZ))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.SMOOTH_BROWN_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.SMOOTH_BROWN_QUARTZ))
            .criterion(hasItem(Blocks.SMOOTH_QUARTZ), conditionsFromItem(Blocks.SMOOTH_QUARTZ))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.SMOOTH_CYAN_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.SMOOTH_CYAN_QUARTZ))
            .criterion(hasItem(Blocks.SMOOTH_QUARTZ), conditionsFromItem(Blocks.SMOOTH_QUARTZ))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.SMOOTH_GRAY_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.SMOOTH_GRAY_QUARTZ))
            .criterion(hasItem(Blocks.SMOOTH_QUARTZ), conditionsFromItem(Blocks.SMOOTH_QUARTZ))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.SMOOTH_GREEN_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.SMOOTH_GREEN_QUARTZ))
            .criterion(hasItem(Blocks.SMOOTH_QUARTZ), conditionsFromItem(Blocks.SMOOTH_QUARTZ))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.SMOOTH_LIGHT_BLUE_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.SMOOTH_LIGHT_BLUE_QUARTZ))
            .criterion(hasItem(Blocks.SMOOTH_QUARTZ), conditionsFromItem(Blocks.SMOOTH_QUARTZ))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.SMOOTH_LIGHT_GRAY_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.SMOOTH_LIGHT_GRAY_QUARTZ))
            .criterion(hasItem(Blocks.SMOOTH_QUARTZ), conditionsFromItem(Blocks.SMOOTH_QUARTZ))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.SMOOTH_LIME_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.SMOOTH_LIME_QUARTZ))
            .criterion(hasItem(Blocks.SMOOTH_QUARTZ), conditionsFromItem(Blocks.SMOOTH_QUARTZ))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.SMOOTH_MAGENTA_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.SMOOTH_MAGENTA_QUARTZ))
            .criterion(hasItem(Blocks.SMOOTH_QUARTZ), conditionsFromItem(Blocks.SMOOTH_QUARTZ))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.SMOOTH_ORANGE_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.SMOOTH_ORANGE_QUARTZ))
            .criterion(hasItem(Blocks.SMOOTH_QUARTZ), conditionsFromItem(Blocks.SMOOTH_QUARTZ))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.SMOOTH_PINK_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.SMOOTH_PINK_QUARTZ))
            .criterion(hasItem(Blocks.SMOOTH_QUARTZ), conditionsFromItem(Blocks.SMOOTH_QUARTZ))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.SMOOTH_PURPLE_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.SMOOTH_PURPLE_QUARTZ))
            .criterion(hasItem(Blocks.SMOOTH_QUARTZ), conditionsFromItem(Blocks.SMOOTH_QUARTZ))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.SMOOTH_RED_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.SMOOTH_RED_QUARTZ))
            .criterion(hasItem(Blocks.SMOOTH_QUARTZ), conditionsFromItem(Blocks.SMOOTH_QUARTZ))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.SMOOTH_WHITE_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.SMOOTH_WHITE_QUARTZ))
            .criterion(hasItem(Blocks.SMOOTH_QUARTZ), conditionsFromItem(Blocks.SMOOTH_QUARTZ))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.SMOOTH_YELLOW_QUARTZ_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.SMOOTH_YELLOW_QUARTZ))
            .criterion(hasItem(Blocks.SMOOTH_QUARTZ), conditionsFromItem(Blocks.SMOOTH_QUARTZ))
            .offerTo(exporter)

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CRACKED_BRICK_SLAB, HybridBlocksBlocks.CRACKED_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_BRICK_SLAB, HybridBlocksBlocks.MOSSY_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_NETHER_BRICK_SLAB, HybridBlocksBlocks.MIXED_NETHER_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_RED_NETHER_BRICK_SLAB, HybridBlocksBlocks.MIXED_RED_NETHER_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BLACK_BRICK_SLAB, HybridBlocksBlocks.BLACK_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_BLACK_BRICK_SLAB, HybridBlocksBlocks.MOSSY_BLACK_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BLUE_BRICK_SLAB, HybridBlocksBlocks.BLUE_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_BLUE_BRICK_SLAB, HybridBlocksBlocks.MOSSY_BLUE_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BROWN_BRICK_SLAB, HybridBlocksBlocks.BROWN_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_BROWN_BRICK_SLAB, HybridBlocksBlocks.MOSSY_BROWN_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CYAN_BRICK_SLAB, HybridBlocksBlocks.CYAN_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_CYAN_BRICK_SLAB, HybridBlocksBlocks.MOSSY_CYAN_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.GRAY_BRICK_SLAB, HybridBlocksBlocks.GRAY_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_GRAY_BRICK_SLAB, HybridBlocksBlocks.MOSSY_GRAY_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.GREEN_BRICK_SLAB, HybridBlocksBlocks.GREEN_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_GREEN_BRICK_SLAB, HybridBlocksBlocks.MOSSY_GREEN_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.LIGHT_BLUE_BRICK_SLAB, HybridBlocksBlocks.LIGHT_BLUE_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICK_SLAB, HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.LIGHT_GRAY_BRICK_SLAB, HybridBlocksBlocks.LIGHT_GRAY_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICK_SLAB, HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.LIME_BRICK_SLAB, HybridBlocksBlocks.LIME_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_LIME_BRICK_SLAB, HybridBlocksBlocks.MOSSY_LIME_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MAGENTA_BRICK_SLAB, HybridBlocksBlocks.MAGENTA_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_MAGENTA_BRICK_SLAB, HybridBlocksBlocks.MOSSY_MAGENTA_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.ORANGE_BRICK_SLAB, HybridBlocksBlocks.ORANGE_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_ORANGE_BRICK_SLAB, HybridBlocksBlocks.MOSSY_ORANGE_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINK_BRICK_SLAB, HybridBlocksBlocks.PINK_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_PINK_BRICK_SLAB, HybridBlocksBlocks.MOSSY_PINK_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PURPLE_BRICK_SLAB, HybridBlocksBlocks.PURPLE_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_PURPLE_BRICK_SLAB, HybridBlocksBlocks.MOSSY_PURPLE_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.RED_BRICK_SLAB, HybridBlocksBlocks.RED_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_RED_BRICK_SLAB, HybridBlocksBlocks.MOSSY_RED_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.WHITE_BRICK_SLAB, HybridBlocksBlocks.WHITE_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_WHITE_BRICK_SLAB, HybridBlocksBlocks.MOSSY_WHITE_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.YELLOW_BRICK_SLAB, HybridBlocksBlocks.YELLOW_BRICKS)
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_YELLOW_BRICK_SLAB, HybridBlocksBlocks.MOSSY_YELLOW_BRICKS)

        createStairsRecipe(HybridBlocksBlocks.CRACKED_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.CRACKED_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.MOSSY_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.MOSSY_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.MIXED_NETHER_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.MIXED_NETHER_BRICKS))
            .criterion(hasItem(Blocks.NETHER_BRICKS), conditionsFromItem(Blocks.NETHER_BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.MIXED_RED_NETHER_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.MIXED_RED_NETHER_BRICKS))
            .criterion(hasItem(Blocks.RED_NETHER_BRICKS), conditionsFromItem(Blocks.RED_NETHER_BRICKS))
        createStairsRecipe(HybridBlocksBlocks.BLUE_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.BLUE_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.MOSSY_BLUE_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.MOSSY_BLUE_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.BROWN_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.BROWN_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.MOSSY_BROWN_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.MOSSY_BROWN_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.CYAN_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.CYAN_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.MOSSY_CYAN_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.MOSSY_CYAN_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.GRAY_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.GRAY_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.MOSSY_GRAY_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.MOSSY_GRAY_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.GREEN_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.GREEN_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.LIGHT_BLUE_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.LIGHT_BLUE_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.LIGHT_GRAY_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.LIGHT_GRAY_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.LIME_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.LIME_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.MOSSY_LIME_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.MOSSY_LIME_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.MAGENTA_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.MAGENTA_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.MOSSY_MAGENTA_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.MOSSY_MAGENTA_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.ORANGE_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.ORANGE_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.MOSSY_ORANGE_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.MOSSY_ORANGE_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.PINK_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.PINK_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.MOSSY_PINK_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.MOSSY_PINK_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.PURPLE_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.PURPLE_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.MOSSY_PURPLE_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.MOSSY_PURPLE_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.RED_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.RED_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.MOSSY_RED_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.MOSSY_RED_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.WHITE_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.WHITE_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.MOSSY_WHITE_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.MOSSY_WHITE_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.YELLOW_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.YELLOW_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)
        createStairsRecipe(HybridBlocksBlocks.MOSSY_YELLOW_BRICK_STAIRS, Ingredient.ofItems(HybridBlocksBlocks.MOSSY_YELLOW_BRICKS))
            .criterion(hasItem(Blocks.BRICKS), conditionsFromItem(Blocks.BRICKS))
            .offerTo(exporter)

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BLACK_QUARTZ_PILLAR, HybridBlocksBlocks.BLACK_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BLUE_QUARTZ_PILLAR, HybridBlocksBlocks.BLUE_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BROWN_QUARTZ_PILLAR, HybridBlocksBlocks.BROWN_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CYAN_QUARTZ_PILLAR, HybridBlocksBlocks.CYAN_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.GRAY_QUARTZ_PILLAR, HybridBlocksBlocks.GRAY_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.GREEN_QUARTZ_PILLAR, HybridBlocksBlocks.GREEN_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_PILLAR, HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_PILLAR, HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.LIME_QUARTZ_PILLAR, HybridBlocksBlocks.LIME_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MAGENTA_QUARTZ_PILLAR, HybridBlocksBlocks.MAGENTA_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.ORANGE_QUARTZ_PILLAR, HybridBlocksBlocks.ORANGE_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINK_QUARTZ_PILLAR, HybridBlocksBlocks.PINK_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PURPLE_QUARTZ_PILLAR, HybridBlocksBlocks.PURPLE_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.RED_QUARTZ_PILLAR, HybridBlocksBlocks.RED_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.WHITE_QUARTZ_PILLAR, HybridBlocksBlocks.WHITE_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.YELLOW_QUARTZ_PILLAR, HybridBlocksBlocks.YELLOW_QUARTZ_BLOCK)

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BLACK_QUARTZ_STAIRS, HybridBlocksBlocks.BLACK_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BLUE_QUARTZ_STAIRS, HybridBlocksBlocks.BLUE_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BROWN_QUARTZ_STAIRS, HybridBlocksBlocks.BROWN_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CYAN_QUARTZ_STAIRS, HybridBlocksBlocks.CYAN_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.GRAY_QUARTZ_STAIRS, HybridBlocksBlocks.GRAY_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.GREEN_QUARTZ_STAIRS, HybridBlocksBlocks.GREEN_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_STAIRS, HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_STAIRS, HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.LIME_QUARTZ_STAIRS, HybridBlocksBlocks.LIME_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MAGENTA_QUARTZ_STAIRS, HybridBlocksBlocks.MAGENTA_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.ORANGE_QUARTZ_STAIRS, HybridBlocksBlocks.ORANGE_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINK_QUARTZ_STAIRS, HybridBlocksBlocks.PINK_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PURPLE_QUARTZ_STAIRS, HybridBlocksBlocks.PURPLE_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.RED_QUARTZ_STAIRS, HybridBlocksBlocks.RED_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.WHITE_QUARTZ_STAIRS, HybridBlocksBlocks.WHITE_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.YELLOW_QUARTZ_STAIRS, HybridBlocksBlocks.YELLOW_QUARTZ_BLOCK)

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_BLACK_QUARTZ_STAIRS, HybridBlocksBlocks.SMOOTH_BLACK_QUARTZ)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_BLUE_QUARTZ_STAIRS, HybridBlocksBlocks.SMOOTH_BLUE_QUARTZ)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_BROWN_QUARTZ_STAIRS, HybridBlocksBlocks.SMOOTH_BROWN_QUARTZ)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_CYAN_QUARTZ_STAIRS, HybridBlocksBlocks.SMOOTH_CYAN_QUARTZ)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_GRAY_QUARTZ_STAIRS, HybridBlocksBlocks.SMOOTH_GRAY_QUARTZ)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_GREEN_QUARTZ_STAIRS, HybridBlocksBlocks.SMOOTH_GREEN_QUARTZ)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_LIGHT_BLUE_QUARTZ_STAIRS, HybridBlocksBlocks.SMOOTH_LIGHT_BLUE_QUARTZ)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_LIGHT_GRAY_QUARTZ_STAIRS, HybridBlocksBlocks.SMOOTH_LIGHT_GRAY_QUARTZ)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_LIME_QUARTZ_STAIRS, HybridBlocksBlocks.SMOOTH_LIME_QUARTZ)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_MAGENTA_QUARTZ_STAIRS, HybridBlocksBlocks.SMOOTH_MAGENTA_QUARTZ)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_ORANGE_QUARTZ_STAIRS, HybridBlocksBlocks.SMOOTH_ORANGE_QUARTZ)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_PINK_QUARTZ_STAIRS, HybridBlocksBlocks.SMOOTH_PINK_QUARTZ)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_PURPLE_QUARTZ_STAIRS, HybridBlocksBlocks.SMOOTH_PURPLE_QUARTZ)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_RED_QUARTZ_STAIRS, HybridBlocksBlocks.SMOOTH_RED_QUARTZ)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_WHITE_QUARTZ_STAIRS, HybridBlocksBlocks.SMOOTH_WHITE_QUARTZ)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_YELLOW_QUARTZ_STAIRS, HybridBlocksBlocks.SMOOTH_YELLOW_QUARTZ)

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BLACK_QUARTZ_SLAB, HybridBlocksBlocks.BLACK_QUARTZ_BLOCK, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BLUE_QUARTZ_SLAB, HybridBlocksBlocks.BLUE_QUARTZ_BLOCK, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BROWN_QUARTZ_SLAB, HybridBlocksBlocks.BROWN_QUARTZ_BLOCK, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CYAN_QUARTZ_SLAB, HybridBlocksBlocks.CYAN_QUARTZ_BLOCK, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.GRAY_QUARTZ_SLAB, HybridBlocksBlocks.GRAY_QUARTZ_BLOCK, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.GREEN_QUARTZ_SLAB, HybridBlocksBlocks.GREEN_QUARTZ_BLOCK, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_SLAB, HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_BLOCK, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_SLAB, HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_BLOCK, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.LIME_QUARTZ_SLAB, HybridBlocksBlocks.LIME_QUARTZ_BLOCK, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MAGENTA_QUARTZ_SLAB, HybridBlocksBlocks.MAGENTA_QUARTZ_BLOCK, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.ORANGE_QUARTZ_SLAB, HybridBlocksBlocks.ORANGE_QUARTZ_BLOCK, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINK_QUARTZ_SLAB, HybridBlocksBlocks.PINK_QUARTZ_BLOCK, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PURPLE_QUARTZ_SLAB, HybridBlocksBlocks.PURPLE_QUARTZ_BLOCK, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.RED_QUARTZ_SLAB, HybridBlocksBlocks.RED_QUARTZ_BLOCK, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.WHITE_QUARTZ_SLAB, HybridBlocksBlocks.WHITE_QUARTZ_BLOCK, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.YELLOW_QUARTZ_SLAB, HybridBlocksBlocks.YELLOW_QUARTZ_BLOCK, 2)

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_BLACK_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_BLACK_QUARTZ, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_BLUE_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_BLUE_QUARTZ, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_BROWN_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_BROWN_QUARTZ, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_CYAN_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_CYAN_QUARTZ, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_GRAY_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_GRAY_QUARTZ, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_GREEN_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_GREEN_QUARTZ, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_LIGHT_BLUE_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_LIGHT_BLUE_QUARTZ, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_LIGHT_GRAY_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_LIGHT_GRAY_QUARTZ, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_LIME_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_LIME_QUARTZ, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_MAGENTA_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_MAGENTA_QUARTZ, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_ORANGE_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_ORANGE_QUARTZ, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_PINK_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_PINK_QUARTZ, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_PURPLE_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_PURPLE_QUARTZ, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_RED_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_RED_QUARTZ, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_WHITE_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_WHITE_QUARTZ, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.SMOOTH_YELLOW_QUARTZ_SLAB, HybridBlocksBlocks.SMOOTH_YELLOW_QUARTZ, 2)

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CRACKED_BRICK_STAIRS, HybridBlocksBlocks.CRACKED_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_NETHER_BRICK_STAIRS, HybridBlocksBlocks.MIXED_NETHER_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_RED_NETHER_BRICK_STAIRS, HybridBlocksBlocks.MIXED_RED_NETHER_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BLACK_BRICK_STAIRS, HybridBlocksBlocks.BLACK_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BLUE_BRICK_STAIRS, HybridBlocksBlocks.BLUE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BROWN_BRICK_STAIRS, HybridBlocksBlocks.BROWN_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CYAN_BRICK_STAIRS, HybridBlocksBlocks.CYAN_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.GRAY_BRICK_STAIRS, HybridBlocksBlocks.GRAY_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.GREEN_BRICK_STAIRS, HybridBlocksBlocks.GREEN_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.LIGHT_BLUE_BRICK_STAIRS, HybridBlocksBlocks.LIGHT_BLUE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.LIGHT_GRAY_BRICK_STAIRS, HybridBlocksBlocks.LIGHT_GRAY_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.LIME_BRICK_STAIRS, HybridBlocksBlocks.LIME_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MAGENTA_BRICK_STAIRS, HybridBlocksBlocks.MAGENTA_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.ORANGE_BRICK_STAIRS, HybridBlocksBlocks.ORANGE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINK_BRICK_STAIRS, HybridBlocksBlocks.PINK_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PURPLE_BRICK_STAIRS, HybridBlocksBlocks.PURPLE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.RED_BRICK_STAIRS, HybridBlocksBlocks.RED_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.WHITE_BRICK_STAIRS, HybridBlocksBlocks.WHITE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.YELLOW_BRICK_STAIRS, HybridBlocksBlocks.YELLOW_BRICKS)

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_BRICK_STAIRS, HybridBlocksBlocks.MOSSY_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_BLACK_BRICK_STAIRS, HybridBlocksBlocks.MOSSY_BLACK_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_BLUE_BRICK_STAIRS, HybridBlocksBlocks.MOSSY_BLUE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_BROWN_BRICK_STAIRS, HybridBlocksBlocks.MOSSY_BROWN_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_CYAN_BRICK_STAIRS, HybridBlocksBlocks.MOSSY_CYAN_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_GRAY_BRICK_STAIRS, HybridBlocksBlocks.MOSSY_GRAY_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_GREEN_BRICK_STAIRS, HybridBlocksBlocks.MOSSY_GREEN_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICK_STAIRS, HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICK_STAIRS, HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_LIME_BRICK_STAIRS, HybridBlocksBlocks.MOSSY_LIME_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_MAGENTA_BRICK_STAIRS, HybridBlocksBlocks.MOSSY_MAGENTA_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_ORANGE_BRICK_STAIRS, HybridBlocksBlocks.MOSSY_ORANGE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_PINK_BRICK_STAIRS, HybridBlocksBlocks.MOSSY_PINK_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_PURPLE_BRICK_STAIRS, HybridBlocksBlocks.MOSSY_PURPLE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_RED_BRICK_STAIRS, HybridBlocksBlocks.MOSSY_RED_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_WHITE_BRICK_STAIRS, HybridBlocksBlocks.MOSSY_WHITE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_YELLOW_BRICK_STAIRS, HybridBlocksBlocks.MOSSY_YELLOW_BRICKS)

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CRACKED_BRICK_WALL, HybridBlocksBlocks.CRACKED_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_NETHER_BRICK_WALL, HybridBlocksBlocks.MIXED_NETHER_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_RED_NETHER_BRICK_WALL, HybridBlocksBlocks.MIXED_RED_NETHER_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BLACK_BRICK_WALL, HybridBlocksBlocks.BLACK_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BLUE_BRICK_WALL, HybridBlocksBlocks.BLUE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BROWN_BRICK_WALL, HybridBlocksBlocks.BROWN_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CYAN_BRICK_WALL, HybridBlocksBlocks.CYAN_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.GRAY_BRICK_WALL, HybridBlocksBlocks.GRAY_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.GREEN_BRICK_WALL, HybridBlocksBlocks.GREEN_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.LIGHT_BLUE_BRICK_WALL, HybridBlocksBlocks.LIGHT_BLUE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.LIGHT_GRAY_BRICK_WALL, HybridBlocksBlocks.LIGHT_GRAY_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.LIME_BRICK_WALL, HybridBlocksBlocks.LIME_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MAGENTA_BRICK_WALL, HybridBlocksBlocks.MAGENTA_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.ORANGE_BRICK_WALL, HybridBlocksBlocks.ORANGE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINK_BRICK_WALL, HybridBlocksBlocks.PINK_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PURPLE_BRICK_WALL, HybridBlocksBlocks.PURPLE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.RED_BRICK_WALL, HybridBlocksBlocks.RED_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.WHITE_BRICK_WALL, HybridBlocksBlocks.WHITE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.YELLOW_BRICK_WALL, HybridBlocksBlocks.YELLOW_BRICKS)

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_BRICK_WALL, HybridBlocksBlocks.MOSSY_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_BLACK_BRICK_WALL, HybridBlocksBlocks.MOSSY_BLACK_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_BLUE_BRICK_WALL, HybridBlocksBlocks.MOSSY_BLUE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_BROWN_BRICK_WALL, HybridBlocksBlocks.MOSSY_BROWN_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_CYAN_BRICK_WALL, HybridBlocksBlocks.MOSSY_CYAN_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_GRAY_BRICK_WALL, HybridBlocksBlocks.MOSSY_GRAY_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_GREEN_BRICK_WALL, HybridBlocksBlocks.MOSSY_GREEN_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICK_WALL, HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICK_WALL, HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_LIME_BRICK_WALL, HybridBlocksBlocks.MOSSY_LIME_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_MAGENTA_BRICK_WALL, HybridBlocksBlocks.MOSSY_MAGENTA_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_ORANGE_BRICK_WALL, HybridBlocksBlocks.MOSSY_ORANGE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_PINK_BRICK_WALL, HybridBlocksBlocks.MOSSY_PINK_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_PURPLE_BRICK_WALL, HybridBlocksBlocks.MOSSY_PURPLE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_RED_BRICK_WALL, HybridBlocksBlocks.MOSSY_RED_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_WHITE_BRICK_WALL, HybridBlocksBlocks.MOSSY_WHITE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_YELLOW_BRICK_WALL, HybridBlocksBlocks.MOSSY_YELLOW_BRICKS)

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CRACKED_BRICK_SLAB, HybridBlocksBlocks.CRACKED_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_NETHER_BRICK_SLAB, HybridBlocksBlocks.MIXED_NETHER_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_RED_NETHER_BRICK_SLAB, HybridBlocksBlocks.MIXED_RED_NETHER_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BLACK_BRICK_SLAB, HybridBlocksBlocks.BLACK_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BLUE_BRICK_SLAB, HybridBlocksBlocks.BLUE_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BROWN_BRICK_SLAB, HybridBlocksBlocks.BROWN_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CYAN_BRICK_SLAB, HybridBlocksBlocks.CYAN_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.GRAY_BRICK_SLAB, HybridBlocksBlocks.GRAY_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.GREEN_BRICK_SLAB, HybridBlocksBlocks.GREEN_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.LIGHT_BLUE_BRICK_SLAB, HybridBlocksBlocks.LIGHT_BLUE_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.LIGHT_GRAY_BRICK_SLAB, HybridBlocksBlocks.LIGHT_GRAY_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.LIME_BRICK_SLAB, HybridBlocksBlocks.LIME_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MAGENTA_BRICK_SLAB, HybridBlocksBlocks.MAGENTA_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.ORANGE_BRICK_SLAB, HybridBlocksBlocks.ORANGE_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINK_BRICK_SLAB, HybridBlocksBlocks.PINK_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PURPLE_BRICK_SLAB, HybridBlocksBlocks.PURPLE_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.RED_BRICK_SLAB, HybridBlocksBlocks.RED_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.WHITE_BRICK_SLAB, HybridBlocksBlocks.WHITE_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.YELLOW_BRICK_SLAB, HybridBlocksBlocks.YELLOW_BRICKS, 2)

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_BRICK_SLAB, HybridBlocksBlocks.MOSSY_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_BLACK_BRICK_SLAB, HybridBlocksBlocks.MOSSY_BLACK_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_BLUE_BRICK_SLAB, HybridBlocksBlocks.MOSSY_BLUE_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_BROWN_BRICK_SLAB, HybridBlocksBlocks.MOSSY_BROWN_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_CYAN_BRICK_SLAB, HybridBlocksBlocks.MOSSY_CYAN_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_GRAY_BRICK_SLAB, HybridBlocksBlocks.MOSSY_GRAY_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_GREEN_BRICK_SLAB, HybridBlocksBlocks.MOSSY_GREEN_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICK_SLAB, HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICK_SLAB, HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_LIME_BRICK_SLAB, HybridBlocksBlocks.MOSSY_LIME_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_MAGENTA_BRICK_SLAB, HybridBlocksBlocks.MOSSY_MAGENTA_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_ORANGE_BRICK_SLAB, HybridBlocksBlocks.MOSSY_ORANGE_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_PINK_BRICK_SLAB, HybridBlocksBlocks.MOSSY_PINK_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_PURPLE_BRICK_SLAB, HybridBlocksBlocks.MOSSY_PURPLE_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_RED_BRICK_SLAB, HybridBlocksBlocks.MOSSY_RED_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_WHITE_BRICK_SLAB, HybridBlocksBlocks.MOSSY_WHITE_BRICKS, 2)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MOSSY_YELLOW_BRICK_SLAB, HybridBlocksBlocks.MOSSY_YELLOW_BRICKS, 2)

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_BLACK_QUARTZ_BLOCK, HybridBlocksBlocks.BLACK_QUARTZ_BLOCK)
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_BLUE_QUARTZ_BLOCK, HybridBlocksBlocks.BLUE_QUARTZ_BLOCK)
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_BROWN_QUARTZ_BLOCK, HybridBlocksBlocks.BROWN_QUARTZ_BLOCK)
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_CYAN_QUARTZ_BLOCK, HybridBlocksBlocks.CYAN_QUARTZ_BLOCK)
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_GRAY_QUARTZ_BLOCK, HybridBlocksBlocks.GRAY_QUARTZ_BLOCK)
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_GREEN_QUARTZ_BLOCK, HybridBlocksBlocks.GREEN_QUARTZ_BLOCK)
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_LIGHT_BLUE_QUARTZ_BLOCK, HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_BLOCK)
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_LIGHT_GRAY_QUARTZ_BLOCK, HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_BLOCK)
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_LIME_QUARTZ_BLOCK, HybridBlocksBlocks.LIME_QUARTZ_BLOCK)
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_MAGENTA_QUARTZ_BLOCK, HybridBlocksBlocks.MAGENTA_QUARTZ_BLOCK)
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_ORANGE_QUARTZ_BLOCK, HybridBlocksBlocks.ORANGE_QUARTZ_BLOCK)
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_PINK_QUARTZ_BLOCK, HybridBlocksBlocks.PINK_QUARTZ_BLOCK)
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_PURPLE_QUARTZ_BLOCK, HybridBlocksBlocks.PURPLE_QUARTZ_BLOCK)
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_RED_QUARTZ_BLOCK, HybridBlocksBlocks.RED_QUARTZ_BLOCK)
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_WHITE_QUARTZ_BLOCK, HybridBlocksBlocks.WHITE_QUARTZ_BLOCK)
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_YELLOW_QUARTZ_BLOCK, HybridBlocksBlocks.YELLOW_QUARTZ_BLOCK)

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_BLACK_QUARTZ_BLOCK, HybridBlocksBlocks.BLACK_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_BLUE_QUARTZ_BLOCK, HybridBlocksBlocks.BLUE_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_BROWN_QUARTZ_BLOCK, HybridBlocksBlocks.BROWN_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_CYAN_QUARTZ_BLOCK, HybridBlocksBlocks.CYAN_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_GRAY_QUARTZ_BLOCK, HybridBlocksBlocks.GRAY_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_GREEN_QUARTZ_BLOCK, HybridBlocksBlocks.GREEN_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_LIGHT_BLUE_QUARTZ_BLOCK, HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_LIGHT_GRAY_QUARTZ_BLOCK, HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_LIME_QUARTZ_BLOCK, HybridBlocksBlocks.LIME_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_MAGENTA_QUARTZ_BLOCK, HybridBlocksBlocks.MAGENTA_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_ORANGE_QUARTZ_BLOCK, HybridBlocksBlocks.ORANGE_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_PINK_QUARTZ_BLOCK, HybridBlocksBlocks.PINK_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_PURPLE_QUARTZ_BLOCK, HybridBlocksBlocks.PURPLE_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_RED_QUARTZ_BLOCK, HybridBlocksBlocks.RED_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_WHITE_QUARTZ_BLOCK, HybridBlocksBlocks.WHITE_QUARTZ_BLOCK)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.CHISELED_YELLOW_QUARTZ_BLOCK, HybridBlocksBlocks.YELLOW_QUARTZ_BLOCK)

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.CRACKED_BRICK_WALL, HybridBlocksBlocks.CRACKED_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.MIXED_NETHER_BRICK_WALL, HybridBlocksBlocks.MIXED_NETHER_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.MIXED_RED_NETHER_BRICK_WALL, HybridBlocksBlocks.MIXED_RED_NETHER_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.MOSSY_BRICK_WALL, HybridBlocksBlocks.MOSSY_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.BLACK_BRICK_WALL, HybridBlocksBlocks.BLACK_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.MOSSY_BLACK_BRICK_WALL, HybridBlocksBlocks.MOSSY_BLACK_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.BLUE_BRICK_WALL, HybridBlocksBlocks.BLUE_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.MOSSY_BLUE_BRICK_WALL, HybridBlocksBlocks.MOSSY_BLUE_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.BROWN_BRICK_WALL, HybridBlocksBlocks.BROWN_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.MOSSY_BROWN_BRICK_WALL, HybridBlocksBlocks.MOSSY_BROWN_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.CYAN_BRICK_WALL, HybridBlocksBlocks.CYAN_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.MOSSY_CYAN_BRICK_WALL, HybridBlocksBlocks.MOSSY_CYAN_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.GRAY_BRICK_WALL, HybridBlocksBlocks.GRAY_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.MOSSY_GRAY_BRICK_WALL, HybridBlocksBlocks.MOSSY_GRAY_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.GREEN_BRICK_WALL, HybridBlocksBlocks.GREEN_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.MOSSY_GREEN_BRICK_WALL, HybridBlocksBlocks.MOSSY_GREEN_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.LIGHT_BLUE_BRICK_WALL, HybridBlocksBlocks.LIGHT_BLUE_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICK_WALL, HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.LIGHT_GRAY_BRICK_WALL, HybridBlocksBlocks.LIGHT_GRAY_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICK_WALL, HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.LIME_BRICK_WALL, HybridBlocksBlocks.LIME_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.MOSSY_LIME_BRICK_WALL, HybridBlocksBlocks.MOSSY_LIME_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.MAGENTA_BRICK_WALL, HybridBlocksBlocks.MAGENTA_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.MOSSY_MAGENTA_BRICK_WALL, HybridBlocksBlocks.MOSSY_MAGENTA_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.ORANGE_BRICK_WALL, HybridBlocksBlocks.ORANGE_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.MOSSY_ORANGE_BRICK_WALL, HybridBlocksBlocks.MOSSY_ORANGE_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.PINK_BRICK_WALL, HybridBlocksBlocks.PINK_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.MOSSY_PINK_BRICK_WALL, HybridBlocksBlocks.MOSSY_PINK_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.PURPLE_BRICK_WALL, HybridBlocksBlocks.PURPLE_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.MOSSY_PURPLE_BRICK_WALL, HybridBlocksBlocks.MOSSY_PURPLE_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.RED_BRICK_WALL, HybridBlocksBlocks.RED_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.MOSSY_RED_BRICK_WALL, HybridBlocksBlocks.MOSSY_RED_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.WHITE_BRICK_WALL, HybridBlocksBlocks.WHITE_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.MOSSY_WHITE_BRICK_WALL, HybridBlocksBlocks.MOSSY_WHITE_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.YELLOW_BRICK_WALL, HybridBlocksBlocks.YELLOW_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, HybridBlocksBlocks.MOSSY_YELLOW_BRICK_WALL, HybridBlocksBlocks.MOSSY_YELLOW_BRICKS)

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINWHEEL_BRICKS, Blocks.BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINWHEEL_NETHER_BRICKS, Blocks.NETHER_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINWHEEL_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINWHEEL_BLACK_BRICKS, HybridBlocksBlocks.BLACK_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINWHEEL_BLUE_BRICKS, HybridBlocksBlocks.BLUE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINWHEEL_BROWN_BRICKS, HybridBlocksBlocks.BROWN_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINWHEEL_CYAN_BRICKS, HybridBlocksBlocks.CYAN_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINWHEEL_GRAY_BRICKS, HybridBlocksBlocks.GRAY_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINWHEEL_GREEN_BRICKS, HybridBlocksBlocks.GREEN_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINWHEEL_LIGHT_BLUE_BRICKS, HybridBlocksBlocks.LIGHT_BLUE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINWHEEL_LIGHT_GRAY_BRICKS, HybridBlocksBlocks.LIGHT_GRAY_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINWHEEL_LIME_BRICKS, HybridBlocksBlocks.LIME_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINWHEEL_MAGENTA_BRICKS, HybridBlocksBlocks.MAGENTA_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINWHEEL_ORANGE_BRICKS, HybridBlocksBlocks.ORANGE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINWHEEL_PINK_BRICKS, HybridBlocksBlocks.PINK_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINWHEEL_PURPLE_BRICKS, HybridBlocksBlocks.PURPLE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINWHEEL_RED_BRICKS, HybridBlocksBlocks.RED_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINWHEEL_WHITE_BRICKS, HybridBlocksBlocks.WHITE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.PINWHEEL_YELLOW_BRICKS, HybridBlocksBlocks.YELLOW_BRICKS)

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.JACK_ON_JACK_BRICKS, Blocks.BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.JACK_ON_JACK_NETHER_BRICKS, Blocks.NETHER_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.JACK_ON_JACK_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.JACK_ON_JACK_BLACK_BRICKS, HybridBlocksBlocks.BLACK_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.JACK_ON_JACK_BLUE_BRICKS, HybridBlocksBlocks.BLUE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.JACK_ON_JACK_BROWN_BRICKS, HybridBlocksBlocks.BROWN_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.JACK_ON_JACK_CYAN_BRICKS, HybridBlocksBlocks.CYAN_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.JACK_ON_JACK_GRAY_BRICKS, HybridBlocksBlocks.GRAY_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.JACK_ON_JACK_GREEN_BRICKS, HybridBlocksBlocks.GREEN_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.JACK_ON_JACK_LIGHT_BLUE_BRICKS, HybridBlocksBlocks.LIGHT_BLUE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.JACK_ON_JACK_LIGHT_GRAY_BRICKS, HybridBlocksBlocks.LIGHT_GRAY_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.JACK_ON_JACK_LIME_BRICKS, HybridBlocksBlocks.LIME_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.JACK_ON_JACK_MAGENTA_BRICKS, HybridBlocksBlocks.MAGENTA_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.JACK_ON_JACK_ORANGE_BRICKS, HybridBlocksBlocks.ORANGE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.JACK_ON_JACK_PINK_BRICKS, HybridBlocksBlocks.PINK_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.JACK_ON_JACK_PURPLE_BRICKS, HybridBlocksBlocks.PURPLE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.JACK_ON_JACK_RED_BRICKS, HybridBlocksBlocks.RED_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.JACK_ON_JACK_WHITE_BRICKS, HybridBlocksBlocks.WHITE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.JACK_ON_JACK_YELLOW_BRICKS, HybridBlocksBlocks.YELLOW_BRICKS)

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_BRICKS, Blocks.BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_NETHER_BRICKS, Blocks.NETHER_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_BLACK_BRICKS, HybridBlocksBlocks.BLACK_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_BLUE_BRICKS, HybridBlocksBlocks.BLUE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_BROWN_BRICKS, HybridBlocksBlocks.BROWN_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_CYAN_BRICKS, HybridBlocksBlocks.CYAN_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_GRAY_BRICKS, HybridBlocksBlocks.GRAY_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_GREEN_BRICKS, HybridBlocksBlocks.GREEN_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_LIGHT_BLUE_BRICKS, HybridBlocksBlocks.LIGHT_BLUE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_LIGHT_GRAY_BRICKS, HybridBlocksBlocks.LIGHT_GRAY_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_LIME_BRICKS, HybridBlocksBlocks.LIME_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_MAGENTA_BRICKS, HybridBlocksBlocks.MAGENTA_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_ORANGE_BRICKS, HybridBlocksBlocks.ORANGE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_PINK_BRICKS, HybridBlocksBlocks.PINK_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_PURPLE_BRICKS, HybridBlocksBlocks.PURPLE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_RED_BRICKS, HybridBlocksBlocks.RED_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_WHITE_BRICKS, HybridBlocksBlocks.WHITE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.MIXED_YELLOW_BRICKS, HybridBlocksBlocks.YELLOW_BRICKS)

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BASKETWEAVE_BRICKS, Blocks.BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BASKETWEAVE_NETHER_BRICKS, Blocks.NETHER_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BASKETWEAVE_RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BASKETWEAVE_BLACK_BRICKS, HybridBlocksBlocks.BLACK_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BASKETWEAVE_BLUE_BRICKS, HybridBlocksBlocks.BLUE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BASKETWEAVE_BROWN_BRICKS, HybridBlocksBlocks.BROWN_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BASKETWEAVE_CYAN_BRICKS, HybridBlocksBlocks.CYAN_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BASKETWEAVE_GRAY_BRICKS, HybridBlocksBlocks.GRAY_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BASKETWEAVE_GREEN_BRICKS, HybridBlocksBlocks.GREEN_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BASKETWEAVE_LIGHT_BLUE_BRICKS, HybridBlocksBlocks.LIGHT_BLUE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BASKETWEAVE_LIGHT_GRAY_BRICKS, HybridBlocksBlocks.LIGHT_GRAY_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BASKETWEAVE_LIME_BRICKS, HybridBlocksBlocks.LIME_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BASKETWEAVE_MAGENTA_BRICKS, HybridBlocksBlocks.MAGENTA_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BASKETWEAVE_ORANGE_BRICKS, HybridBlocksBlocks.ORANGE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BASKETWEAVE_PINK_BRICKS, HybridBlocksBlocks.PINK_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BASKETWEAVE_PURPLE_BRICKS, HybridBlocksBlocks.PURPLE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BASKETWEAVE_RED_BRICKS, HybridBlocksBlocks.RED_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BASKETWEAVE_WHITE_BRICKS, HybridBlocksBlocks.WHITE_BRICKS)
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.BASKETWEAVE_YELLOW_BRICKS, HybridBlocksBlocks.YELLOW_BRICKS)

        // stained quartz pillar
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksBlocks.BLACK_QUARTZ_PILLAR, Items.BLACK_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksBlocks.BLUE_QUARTZ_PILLAR, Items.BLUE_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksBlocks.BROWN_QUARTZ_PILLAR, Items.BROWN_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksBlocks.CYAN_QUARTZ_PILLAR, Items.CYAN_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksBlocks.GRAY_QUARTZ_PILLAR, Items.GRAY_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksBlocks.GREEN_QUARTZ_PILLAR, Items.GREEN_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_PILLAR, Items.LIGHT_BLUE_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_PILLAR, Items.LIGHT_GRAY_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksBlocks.LIME_QUARTZ_PILLAR, Items.LIME_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksBlocks.MAGENTA_QUARTZ_PILLAR, Items.MAGENTA_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksBlocks.ORANGE_QUARTZ_PILLAR, Items.ORANGE_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksBlocks.PINK_QUARTZ_PILLAR, Items.PINK_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksBlocks.PURPLE_QUARTZ_PILLAR, Items.PURPLE_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksBlocks.RED_QUARTZ_PILLAR, Items.RED_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksBlocks.WHITE_QUARTZ_PILLAR, Items.WHITE_DYE)
        offerQuartzPillarDyeingRecipe(exporter, HybridBlocksBlocks.YELLOW_QUARTZ_PILLAR, Items.YELLOW_DYE)

        // stained bricks
        offerBricksDyeingRecipe(exporter, HybridBlocksBlocks.BLACK_BRICKS, Items.BLACK_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksBlocks.BLUE_BRICKS, Items.BLUE_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksBlocks.BROWN_BRICKS, Items.BROWN_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksBlocks.CYAN_BRICKS, Items.CYAN_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksBlocks.GRAY_BRICKS, Items.GRAY_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksBlocks.GREEN_BRICKS, Items.GREEN_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksBlocks.LIGHT_BLUE_BRICKS, Items.LIGHT_BLUE_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksBlocks.LIGHT_GRAY_BRICKS, Items.LIGHT_GRAY_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksBlocks.LIME_BRICKS, Items.LIME_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksBlocks.MAGENTA_BRICKS, Items.MAGENTA_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksBlocks.ORANGE_BRICKS, Items.ORANGE_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksBlocks.PINK_BRICKS, Items.PINK_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksBlocks.PURPLE_BRICKS, Items.PURPLE_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksBlocks.RED_BRICKS, Items.RED_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksBlocks.WHITE_BRICKS, Items.WHITE_DYE)
        offerBricksDyeingRecipe(exporter, HybridBlocksBlocks.YELLOW_BRICKS, Items.YELLOW_DYE)

        // cracked bricks
        offerBricksSmeltingRecipe(exporter, Blocks.BRICKS, "has_bricks", "bricks", HybridBlocksBlocks.CRACKED_BRICKS, Blocks.BRICKS)

        // stained cracked bricks
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksBlocks.BLACK_BRICKS, HybridBlocksBlocks.CRACKED_BLACK_BRICKS, Items.BLACK_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksBlocks.BLUE_BRICKS, HybridBlocksBlocks.CRACKED_BLUE_BRICKS, Items.BLUE_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksBlocks.BROWN_BRICKS, HybridBlocksBlocks.CRACKED_BROWN_BRICKS, Items.BROWN_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksBlocks.CYAN_BRICKS, HybridBlocksBlocks.CRACKED_CYAN_BRICKS, Items.CYAN_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksBlocks.GRAY_BRICKS, HybridBlocksBlocks.CRACKED_GRAY_BRICKS, Items.GRAY_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksBlocks.GREEN_BRICKS, HybridBlocksBlocks.CRACKED_GREEN_BRICKS, Items.GREEN_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksBlocks.LIGHT_BLUE_BRICKS, HybridBlocksBlocks.CRACKED_LIGHT_BLUE_BRICKS, Items.LIGHT_BLUE_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksBlocks.LIGHT_GRAY_BRICKS, HybridBlocksBlocks.CRACKED_LIGHT_GRAY_BRICKS, Items.LIGHT_GRAY_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksBlocks.LIME_BRICKS, HybridBlocksBlocks.CRACKED_LIME_BRICKS, Items.LIME_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksBlocks.MAGENTA_BRICKS, HybridBlocksBlocks.CRACKED_MAGENTA_BRICKS, Items.MAGENTA_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksBlocks.ORANGE_BRICKS, HybridBlocksBlocks.CRACKED_ORANGE_BRICKS, Items.ORANGE_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksBlocks.PINK_BRICKS, HybridBlocksBlocks.CRACKED_PINK_BRICKS, Items.PINK_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksBlocks.PURPLE_BRICKS, HybridBlocksBlocks.CRACKED_PURPLE_BRICKS, Items.PURPLE_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksBlocks.RED_BRICKS, HybridBlocksBlocks.CRACKED_RED_BRICKS, Items.RED_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksBlocks.WHITE_BRICKS, HybridBlocksBlocks.CRACKED_WHITE_BRICKS, Items.WHITE_DYE)
        offerStainedCrackedBricksRecipes(exporter, HybridBlocksBlocks.YELLOW_BRICKS, HybridBlocksBlocks.CRACKED_YELLOW_BRICKS, Items.YELLOW_DYE)

        offerStainedClearGlassRecipes(exporter, Blocks.BLACK_STAINED_GLASS, HybridBlocksBlocks.BLACK_STAINED_CLEAR_GLASS, Items.BLACK_DYE)
        offerStainedClearGlassRecipes(exporter, Blocks.BLUE_STAINED_GLASS, HybridBlocksBlocks.BLUE_STAINED_CLEAR_GLASS, Items.BLUE_DYE)
        offerStainedClearGlassRecipes(exporter, Blocks.BROWN_STAINED_GLASS, HybridBlocksBlocks.BROWN_STAINED_CLEAR_GLASS, Items.BROWN_DYE)
        offerStainedClearGlassRecipes(exporter, Blocks.CYAN_STAINED_GLASS, HybridBlocksBlocks.CYAN_STAINED_CLEAR_GLASS, Items.CYAN_DYE)
        offerStainedClearGlassRecipes(exporter, Blocks.GRAY_STAINED_GLASS, HybridBlocksBlocks.GRAY_STAINED_CLEAR_GLASS, Items.GRAY_DYE)
        offerStainedClearGlassRecipes(exporter, Blocks.GREEN_STAINED_GLASS, HybridBlocksBlocks.GREEN_STAINED_CLEAR_GLASS, Items.GREEN_DYE)
        offerStainedClearGlassRecipes(exporter, Blocks.LIGHT_BLUE_STAINED_GLASS, HybridBlocksBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS, Items.LIGHT_BLUE_DYE)
        offerStainedClearGlassRecipes(exporter, Blocks.LIGHT_GRAY_STAINED_GLASS, HybridBlocksBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS, Items.LIGHT_GRAY_DYE)
        offerStainedClearGlassRecipes(exporter, Blocks.LIME_STAINED_GLASS, HybridBlocksBlocks.LIME_STAINED_CLEAR_GLASS, Items.LIME_DYE)
        offerStainedClearGlassRecipes(exporter, Blocks.MAGENTA_STAINED_GLASS, HybridBlocksBlocks.MAGENTA_STAINED_CLEAR_GLASS, Items.MAGENTA_DYE)
        offerStainedClearGlassRecipes(exporter, Blocks.ORANGE_STAINED_GLASS, HybridBlocksBlocks.ORANGE_STAINED_CLEAR_GLASS, Items.ORANGE_DYE)
        offerStainedClearGlassRecipes(exporter, Blocks.PINK_STAINED_GLASS, HybridBlocksBlocks.PINK_STAINED_CLEAR_GLASS, Items.PINK_DYE)
        offerStainedClearGlassRecipes(exporter, Blocks.PURPLE_STAINED_GLASS, HybridBlocksBlocks.PURPLE_STAINED_CLEAR_GLASS, Items.PURPLE_DYE)
        offerStainedClearGlassRecipes(exporter, Blocks.RED_STAINED_GLASS, HybridBlocksBlocks.RED_STAINED_CLEAR_GLASS, Items.RED_DYE)
        offerStainedClearGlassRecipes(exporter, Blocks.WHITE_STAINED_GLASS, HybridBlocksBlocks.WHITE_STAINED_CLEAR_GLASS, Items.WHITE_DYE)
        offerStainedClearGlassRecipes(exporter, Blocks.YELLOW_STAINED_GLASS, HybridBlocksBlocks.YELLOW_STAINED_CLEAR_GLASS, Items.YELLOW_DYE)

        // mossy bricks
        offerMossingRecipes(exporter, "mossy_bricks", HybridBlocksBlocks.MOSSY_BRICKS, Blocks.BRICKS)

        // stained mossy bricks
        offerStainedMossyBricksRecipes(exporter, HybridBlocksBlocks.BLACK_BRICKS, HybridBlocksBlocks.MOSSY_BLACK_BRICKS, Items.BLACK_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksBlocks.BLUE_BRICKS, HybridBlocksBlocks.MOSSY_BLUE_BRICKS, Items.BLUE_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksBlocks.BROWN_BRICKS, HybridBlocksBlocks.MOSSY_BROWN_BRICKS, Items.BROWN_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksBlocks.CYAN_BRICKS, HybridBlocksBlocks.MOSSY_CYAN_BRICKS, Items.CYAN_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksBlocks.GRAY_BRICKS, HybridBlocksBlocks.MOSSY_GRAY_BRICKS, Items.GRAY_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksBlocks.GREEN_BRICKS, HybridBlocksBlocks.MOSSY_GREEN_BRICKS, Items.GREEN_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksBlocks.LIGHT_BLUE_BRICKS, HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICKS, Items.LIGHT_BLUE_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksBlocks.LIGHT_GRAY_BRICKS, HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICKS, Items.LIGHT_GRAY_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksBlocks.LIME_BRICKS, HybridBlocksBlocks.MOSSY_LIME_BRICKS, Items.LIME_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksBlocks.MAGENTA_BRICKS, HybridBlocksBlocks.MOSSY_MAGENTA_BRICKS, Items.MAGENTA_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksBlocks.ORANGE_BRICKS, HybridBlocksBlocks.MOSSY_ORANGE_BRICKS, Items.ORANGE_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksBlocks.PINK_BRICKS, HybridBlocksBlocks.MOSSY_PINK_BRICKS, Items.PINK_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksBlocks.PURPLE_BRICKS, HybridBlocksBlocks.MOSSY_PURPLE_BRICKS, Items.PURPLE_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksBlocks.RED_BRICKS, HybridBlocksBlocks.MOSSY_RED_BRICKS, Items.RED_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksBlocks.WHITE_BRICKS, HybridBlocksBlocks.MOSSY_WHITE_BRICKS, Items.WHITE_DYE)
        offerStainedMossyBricksRecipes(exporter, HybridBlocksBlocks.YELLOW_BRICKS, HybridBlocksBlocks.MOSSY_YELLOW_BRICKS, Items.YELLOW_DYE)
    }

    companion object {
        private fun convertBetween(to: ItemConvertible, from: ItemConvertible): String {
            return "${Registries.ITEM.getId(to.asItem())}_from_${getItemPath(from)}"
        }

        private fun offerDyeingRecipe(
            exporter: Consumer<RecipeJsonProvider>,
            base: ItemConvertible,
            criterion: String,
            group: String,
            output: ItemConvertible,
            dye: ItemConvertible
        ) {
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 8)
                .input(Character.valueOf('#'), base)
                .input(Character.valueOf('X'), dye)

                .pattern("###")
                .pattern("#X#")
                .pattern("###")

                .group(group)
                .criterion(criterion, conditionsFromItem(base))

                .offerTo(exporter)
        }

        private fun offerBrickRecipe(
            exporter: Consumer<RecipeJsonProvider>,
            base: ItemConvertible,
            criterion: String,
            group: String,
            output: ItemConvertible
        ) {
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .input(Character.valueOf('#'), base)

                .pattern(" ##")
                .pattern(" ##")
                .pattern("   ")

                .group(group)
                .criterion(criterion, conditionsFromItem(base))

                .offerTo(exporter)
        }

        private fun offerQuartzPillarDyeingRecipe(
            exporter: Consumer<RecipeJsonProvider>,
            output: ItemConvertible,
            input: ItemConvertible
        ) {
            offerDyeingRecipe(
                exporter,
                Blocks.QUARTZ_PILLAR,
                "has_quartz_pillar",
                "stained_quartz_pillar",
                output,
                input
            )
        }

        private fun offerSmoothQuartzDyeingRecipe(
            exporter: Consumer<RecipeJsonProvider>,
            output: ItemConvertible,
            input: ItemConvertible
        ) {
            offerDyeingRecipe(
                exporter,
                Blocks.SMOOTH_QUARTZ,
                "has_smooth_quartz",
                "stained_smooth_quartz",
                output,
                input
            )
        }

        private fun offerBricksDyeingRecipe(
            exporter: Consumer<RecipeJsonProvider>,
            output: ItemConvertible,
            input: ItemConvertible
        ) {
            offerDyeingRecipe(
                exporter,
                Blocks.BRICKS,
                "has_bricks",
                "stained_bricks",
                output,
                input
            )
        }

        private fun offerBricksSmeltingRecipe(
            exporter: Consumer<RecipeJsonProvider>,
            base: ItemConvertible,
            criterion: String,
            group: String,
            output: ItemConvertible,
            input: ItemConvertible
        ) {
            CookingRecipeJsonBuilder.createSmelting(
                Ingredient.ofItems(input),
                RecipeCategory.BUILDING_BLOCKS,
                output,
                0.1f,
                200
            )
                .group(group)
                .criterion(criterion, conditionsFromItem(base))
                .offerTo(exporter, "${Registries.ITEM.getId(output.asItem())}_from_smelting")
        }

        private fun offerStainedCrackedBricksRecipes(
            exporter: Consumer<RecipeJsonProvider>,
            base: ItemConvertible,
            cracked: ItemConvertible,
            dye: ItemConvertible
        ) {
            offerDyeingRecipe(
                exporter,
                HybridBlocksBlocks.CRACKED_BRICKS,
                "has_cracked_bricks",
                "stained_cracked_bricks",
                cracked,
                dye
            )

            offerBricksSmeltingRecipe(
                exporter,
                HybridBlocksBlocks.CRACKED_BRICKS,
                "has_cracked_bricks",
                "stained_cracked_bricks",
                cracked,
                base
            )
        }

        private fun offerQuartzBricksRecipes(
            exporter: Consumer<RecipeJsonProvider>,
            base: ItemConvertible,
            brick: ItemConvertible,
        ) {
            offerBrickRecipe(
                exporter,
                base,
                "has_quartz_block",
                "quartz_bricks",
                brick
            )

            offerStonecuttingRecipe(
                exporter,
                RecipeCategory.BUILDING_BLOCKS,
                brick,
                base
            )
        }

        private fun offerClearGlassSmeltingRecipe(
            exporter: Consumer<RecipeJsonProvider>,
            base: ItemConvertible,
            criterion: String,
            group: String,
            output: ItemConvertible,
            input: ItemConvertible
        ) {
            CookingRecipeJsonBuilder.createSmelting(
                Ingredient.ofItems(input),
                RecipeCategory.BUILDING_BLOCKS,
                output,
                0.1f,
                200
            )
                .group(group)
                .criterion(criterion, conditionsFromItem(base))
                .offerTo(exporter, "${Registries.ITEM.getId(output.asItem())}_from_smelting")
        }

        private fun offerStainedClearGlassRecipes(
            exporter: Consumer<RecipeJsonProvider>,
            base: ItemConvertible,
            cracked: ItemConvertible,
            dye: ItemConvertible
        ) {
            offerDyeingRecipe(
                exporter,
                HybridBlocksBlocks.CLEAR_GLASS,
                "has_clear_glass",
                "stained_clear_glass",
                cracked,
                dye
            )

            offerClearGlassSmeltingRecipe(
                exporter,
                HybridBlocksBlocks.CLEAR_GLASS,
                "has_clear_glass",
                "stained_clear_glass",
                cracked,
                base
            )
        }

        private fun offerStainedMossyBricksRecipes(
            exporter: Consumer<RecipeJsonProvider>,
            base: ItemConvertible,
            mossy: ItemConvertible,
            dye: ItemConvertible
        ) {
            offerDyeingRecipe(
                exporter,
                HybridBlocksBlocks.MOSSY_BRICKS,
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
            exporter: Consumer<RecipeJsonProvider>,
            group: String,
            output: ItemConvertible,
            input: ItemConvertible
        ) {
            ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output)
                .input(input)
                .input(Blocks.VINE)

                .group(group)
                .criterion("has_vine", conditionsFromItem(Blocks.VINE))

                .offerTo(exporter, convertBetween(output, Blocks.VINE))

            ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output)
                .input(input)
                .input(Blocks.MOSS_BLOCK)

                .group(group)
                .criterion("has_moss_block", conditionsFromItem(Blocks.MOSS_BLOCK))

                .offerTo(exporter, convertBetween(output, Blocks.MOSS_BLOCK))
        }
    }
}
