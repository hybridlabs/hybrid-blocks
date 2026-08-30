package dev.hybridlabs.blocks.data.server

import dev.hybridlabs.blocks.data.server.RecipeProvider.Companion.offerQuartzSetRecipes
import dev.hybridlabs.blocks.item.HybridBlocksItems
import dev.hybridlabs.blocks.platform.registration.RegistryObject
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.advancements.critereon.InventoryChangeTrigger
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.data.recipes.RecipeCategory
import net.minecraft.data.recipes.RecipeOutput
import net.minecraft.data.recipes.ShapedRecipeBuilder
import net.minecraft.data.recipes.ShapelessRecipeBuilder
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items
import net.minecraft.world.item.crafting.Ingredient
import net.minecraft.world.item.crafting.RecipeSerializer
import net.minecraft.world.item.crafting.SmeltingRecipe
import net.minecraft.world.level.ItemLike
import net.minecraft.world.level.block.Blocks
import java.util.concurrent.CompletableFuture

/**
 * Generates all recipes.
 */
@Suppress("SameParameterValue")
class RecipeProvider(output: FabricDataOutput, lookupProvider: CompletableFuture<HolderLookup.Provider>) :
    FabricRecipeProvider(output, lookupProvider) {
    override fun buildRecipes(exporter: RecipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.POLISHED_CALCITE.get(), 4)
            .pattern("CC ")
            .pattern("CC ")
            .pattern("   ")
            .define('C', Items.CALCITE)
            .unlockedBy("has_calcite", InventoryChangeTrigger.TriggerInstance.hasItems(Items.CALCITE))
            .save(exporter)

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.POLISHED_CALCITE.get(), Items.CALCITE)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.POLISHED_CALCITE_BRICKS.get(), HybridBlocksItems.POLISHED_CALCITE.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.POLISHED_CALCITE_TILES.get(), HybridBlocksItems.POLISHED_CALCITE.get())

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.POLISHED_CALCITE_STAIRS.get(), HybridBlocksItems.POLISHED_CALCITE.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.POLISHED_CALCITE_BRICK_STAIRS.get(), HybridBlocksItems.POLISHED_CALCITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.POLISHED_CALCITE_TILE_STAIRS.get(), HybridBlocksItems.POLISHED_CALCITE_TILES.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.POLISHED_CALCITE_STAIRS.get(), Items.CALCITE)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.POLISHED_CALCITE_BRICK_STAIRS.get(), Items.CALCITE)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.POLISHED_CALCITE_TILE_STAIRS.get(), Items.CALCITE)

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.POLISHED_CALCITE_SLAB.get(), HybridBlocksItems.POLISHED_CALCITE.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.POLISHED_CALCITE_BRICK_SLAB.get(), HybridBlocksItems.POLISHED_CALCITE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.POLISHED_CALCITE_TILE_SLAB.get(), HybridBlocksItems.POLISHED_CALCITE_TILES.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.POLISHED_CALCITE_SLAB.get(), Items.CALCITE, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.POLISHED_CALCITE_BRICK_SLAB.get(), Items.CALCITE, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.POLISHED_CALCITE_TILE_SLAB.get(), Items.CALCITE, 2)

        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.POLISHED_CALCITE_SLAB.get(), HybridBlocksItems.POLISHED_CALCITE.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.POLISHED_CALCITE_BRICK_SLAB.get(), HybridBlocksItems.POLISHED_CALCITE_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.POLISHED_CALCITE_TILE_SLAB.get(), HybridBlocksItems.POLISHED_CALCITE_TILES.get())

        stairBuilder(exporter,HybridBlocksItems.POLISHED_CALCITE_STAIRS.get(), HybridBlocksItems.POLISHED_CALCITE.get())
        stairBuilder(exporter,HybridBlocksItems.POLISHED_CALCITE_BRICK_STAIRS.get(), HybridBlocksItems.POLISHED_CALCITE_BRICKS.get())
        stairBuilder(exporter,HybridBlocksItems.POLISHED_CALCITE_TILE_STAIRS.get(), HybridBlocksItems.POLISHED_CALCITE_TILES.get())

        //#region Quartz
        offerStainedQuartzSetRecipes(exporter, WHITE_QUARTZ_SET, Items.WHITE_DYE)
        offerStainedQuartzSetRecipes(exporter, ORANGE_QUARTZ_SET, Items.ORANGE_DYE)
        offerStainedQuartzSetRecipes(exporter, MAGENTA_QUARTZ_SET, Items.MAGENTA_DYE)
        offerStainedQuartzSetRecipes(exporter, LIGHT_BLUE_QUARTZ_SET, Items.LIGHT_BLUE_DYE)
        offerStainedQuartzSetRecipes(exporter, YELLOW_QUARTZ_SET, Items.YELLOW_DYE)
        offerStainedQuartzSetRecipes(exporter, LIME_QUARTZ_SET, Items.LIME_DYE)
        offerStainedQuartzSetRecipes(exporter, PINK_QUARTZ_SET, Items.PINK_DYE)
        offerStainedQuartzSetRecipes(exporter, GRAY_QUARTZ_SET, Items.GRAY_DYE)
        offerStainedQuartzSetRecipes(exporter, LIGHT_GRAY_QUARTZ_SET, Items.LIGHT_GRAY_DYE)
        offerStainedQuartzSetRecipes(exporter, CYAN_QUARTZ_SET, Items.CYAN_DYE)
        offerStainedQuartzSetRecipes(exporter, PURPLE_QUARTZ_SET, Items.PURPLE_DYE)
        offerStainedQuartzSetRecipes(exporter, BLUE_QUARTZ_SET, Items.BLUE_DYE)
        offerStainedQuartzSetRecipes(exporter, BROWN_QUARTZ_SET, Items.BROWN_DYE)
        offerStainedQuartzSetRecipes(exporter, GREEN_QUARTZ_SET, Items.GREEN_DYE)
        offerStainedQuartzSetRecipes(exporter, RED_QUARTZ_SET, Items.RED_DYE)
        offerStainedQuartzSetRecipes(exporter, BLACK_QUARTZ_SET, Items.BLACK_DYE)

        // vanilla quartz keeps its own recipes; only the added brick stairs and slab need them
        offerStairsAndSlabRecipes(
            exporter,
            Items.QUARTZ_BRICKS,
            HybridBlocksItems.QUARTZ_BRICK_STAIRS.get(),
            HybridBlocksItems.QUARTZ_BRICK_SLAB.get()
        )

        //#endregion

        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CRACKED_MEDIUM_MUD_BRICK_SLAB.get(), HybridBlocksItems.CRACKED_MEDIUM_MUD_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CRACKED_BRICK_SLAB.get(), HybridBlocksItems.CRACKED_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_MEDIUM_MUD_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_MEDIUM_MUD_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_BLACK_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_BLACK_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_BLUE_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_BLUE_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_BROWN_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_BROWN_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_CYAN_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_CYAN_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_GRAY_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_GRAY_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_GREEN_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_GREEN_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_LIGHT_BLUE_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_LIGHT_BLUE_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_LIGHT_GRAY_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_LIGHT_GRAY_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_LIME_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_LIME_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_MAGENTA_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_MAGENTA_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_ORANGE_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_ORANGE_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_PINK_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_PINK_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_PURPLE_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_PURPLE_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_RED_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_RED_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_WHITE_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_WHITE_BRICKS.get())
        slab(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_YELLOW_BRICK_SLAB.get(), HybridBlocksItems.MOSSY_YELLOW_BRICKS.get())

        stairBuilder(exporter,HybridBlocksItems.CRACKED_MEDIUM_MUD_BRICK_STAIRS.get(), HybridBlocksItems.CRACKED_MEDIUM_MUD_BRICKS.get())
        stairBuilder(exporter,HybridBlocksItems.CRACKED_BRICK_STAIRS.get(), HybridBlocksItems.CRACKED_BRICKS.get())
        stairBuilder(exporter,HybridBlocksItems.MOSSY_MEDIUM_MUD_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_MEDIUM_MUD_BRICKS.get())
        stairBuilder(exporter,HybridBlocksItems.MOSSY_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_BRICKS.get())
        stairBuilder(exporter,HybridBlocksItems.MOSSY_BLUE_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_BLUE_BRICKS.get())
        stairBuilder(exporter,HybridBlocksItems.MOSSY_BROWN_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_BROWN_BRICKS.get())
        stairBuilder(exporter,HybridBlocksItems.MOSSY_CYAN_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_CYAN_BRICKS.get())
        stairBuilder(exporter,HybridBlocksItems.MOSSY_GRAY_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_GRAY_BRICKS.get())
        stairBuilder(exporter,HybridBlocksItems.MOSSY_LIGHT_BLUE_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_LIGHT_BLUE_BRICKS.get())
        stairBuilder(exporter,HybridBlocksItems.MOSSY_LIGHT_GRAY_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_LIGHT_GRAY_BRICKS.get())
        stairBuilder(exporter,HybridBlocksItems.MOSSY_LIME_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_LIME_BRICKS.get())
        stairBuilder(exporter,HybridBlocksItems.MOSSY_MAGENTA_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_MAGENTA_BRICKS.get())
        stairBuilder(exporter,HybridBlocksItems.MOSSY_ORANGE_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_ORANGE_BRICKS.get())
        stairBuilder(exporter,HybridBlocksItems.MOSSY_PINK_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_PINK_BRICKS.get())
        stairBuilder(exporter,HybridBlocksItems.MOSSY_PURPLE_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_PURPLE_BRICKS.get())
        stairBuilder(exporter,HybridBlocksItems.MOSSY_RED_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_RED_BRICKS.get())
        stairBuilder(exporter,HybridBlocksItems.MOSSY_WHITE_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_WHITE_BRICKS.get())
        stairBuilder(exporter,HybridBlocksItems.MOSSY_YELLOW_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_YELLOW_BRICKS.get())

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CRACKED_BRICK_STAIRS.get(), HybridBlocksItems.CRACKED_BRICKS.get())

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_MEDIUM_MUD_BRICK_STAIRS.get(), HybridBlocksItems.MOSSY_MEDIUM_MUD_BRICKS.get())
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

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MOSSY_MEDIUM_MUD_BRICK_WALL.get(), HybridBlocksItems.MOSSY_MEDIUM_MUD_BRICKS.get())
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

        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.CRACKED_BRICK_WALL.get(), HybridBlocksItems.CRACKED_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_BRICK_WALL.get(), HybridBlocksItems.MOSSY_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_BLACK_BRICK_WALL.get(), HybridBlocksItems.MOSSY_BLACK_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_BLUE_BRICK_WALL.get(), HybridBlocksItems.MOSSY_BLUE_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_BROWN_BRICK_WALL.get(), HybridBlocksItems.MOSSY_BROWN_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_CYAN_BRICK_WALL.get(), HybridBlocksItems.MOSSY_CYAN_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_GRAY_BRICK_WALL.get(), HybridBlocksItems.MOSSY_GRAY_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_GREEN_BRICK_WALL.get(), HybridBlocksItems.MOSSY_GREEN_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_LIGHT_BLUE_BRICK_WALL.get(), HybridBlocksItems.MOSSY_LIGHT_BLUE_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_LIGHT_GRAY_BRICK_WALL.get(), HybridBlocksItems.MOSSY_LIGHT_GRAY_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_LIME_BRICK_WALL.get(), HybridBlocksItems.MOSSY_LIME_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_MAGENTA_BRICK_WALL.get(), HybridBlocksItems.MOSSY_MAGENTA_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_ORANGE_BRICK_WALL.get(), HybridBlocksItems.MOSSY_ORANGE_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_PINK_BRICK_WALL.get(), HybridBlocksItems.MOSSY_PINK_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_PURPLE_BRICK_WALL.get(), HybridBlocksItems.MOSSY_PURPLE_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_RED_BRICK_WALL.get(), HybridBlocksItems.MOSSY_RED_BRICKS.get())
        wall(exporter, RecipeCategory.DECORATIONS, HybridBlocksItems.MOSSY_WHITE_BRICK_WALL.get(), HybridBlocksItems.MOSSY_WHITE_BRICKS.get())
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

        //#region Shingles
        offerShinglesDyeingRecipe(exporter, HybridBlocksItems.BLACK_SHINGLES.get(), Items.BLACK_DYE)
        offerShinglesDyeingRecipe(exporter, HybridBlocksItems.BLUE_SHINGLES.get(), Items.BLUE_DYE)
        offerShinglesDyeingRecipe(exporter, HybridBlocksItems.BROWN_SHINGLES.get(), Items.BROWN_DYE)
        offerShinglesDyeingRecipe(exporter, HybridBlocksItems.CYAN_SHINGLES.get(), Items.CYAN_DYE)
        offerShinglesDyeingRecipe(exporter, HybridBlocksItems.GRAY_SHINGLES.get(), Items.GRAY_DYE)
        offerShinglesDyeingRecipe(exporter, HybridBlocksItems.GREEN_SHINGLES.get(), Items.GREEN_DYE)
        offerShinglesDyeingRecipe(exporter, HybridBlocksItems.LIGHT_BLUE_SHINGLES.get(), Items.LIGHT_BLUE_DYE)
        offerShinglesDyeingRecipe(exporter, HybridBlocksItems.LIGHT_GRAY_SHINGLES.get(), Items.LIGHT_GRAY_DYE)
        offerShinglesDyeingRecipe(exporter, HybridBlocksItems.LIME_SHINGLES.get(), Items.LIME_DYE)
        offerShinglesDyeingRecipe(exporter, HybridBlocksItems.MAGENTA_SHINGLES.get(), Items.MAGENTA_DYE)
        offerShinglesDyeingRecipe(exporter, HybridBlocksItems.ORANGE_SHINGLES.get(), Items.ORANGE_DYE)
        offerShinglesDyeingRecipe(exporter, HybridBlocksItems.PINK_SHINGLES.get(), Items.PINK_DYE)
        offerShinglesDyeingRecipe(exporter, HybridBlocksItems.PURPLE_SHINGLES.get(), Items.PURPLE_DYE)
        offerShinglesDyeingRecipe(exporter, HybridBlocksItems.RED_SHINGLES.get(), Items.RED_DYE)
        offerShinglesDyeingRecipe(exporter, HybridBlocksItems.WHITE_SHINGLES.get(), Items.WHITE_DYE)
        offerShinglesDyeingRecipe(exporter, HybridBlocksItems.YELLOW_SHINGLES.get(), Items.YELLOW_DYE)

        offerBrickAndShingleRecipes(exporter)
        //#endregion
        //#endregion

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_MUD_BRICK_WALL.get(), Items.MUD_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_MUD_BRICK_STAIRS.get(), Items.MUD_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_MUD_BRICK_SLAB.get(), Items.MUD_BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MEDIUM_MUD_BRICK_WALL.get(), Items.MUD_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MEDIUM_MUD_BRICK_STAIRS.get(), Items.MUD_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MEDIUM_MUD_BRICK_SLAB.get(), Items.MUD_BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MEDIUM_MIXED_MUD_BRICK_WALL.get(), Items.MUD_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MEDIUM_MIXED_MUD_BRICK_STAIRS.get(), Items.MUD_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MEDIUM_MIXED_MUD_BRICK_SLAB.get(), Items.MUD_BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MUD_BRICK_WALL.get(), Items.MUD_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MUD_BRICK_STAIRS.get(), Items.MUD_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MUD_BRICK_SLAB.get(), Items.MUD_BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_MUD_BRICK_WALL.get(), Items.MUD_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_MUD_BRICK_STAIRS.get(), Items.MUD_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_MUD_BRICK_SLAB.get(), Items.MUD_BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MUD_BRICK_WALL.get(), Items.MUD_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MUD_BRICK_STAIRS.get(), Items.MUD_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MUD_BRICK_SLAB.get(), Items.MUD_BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_MUD_BRICK_WALL.get(), Items.MUD_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_MUD_BRICK_STAIRS.get(), Items.MUD_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_MUD_BRICK_SLAB.get(), Items.MUD_BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SHINGLE_WALL.get(), Items.MUD_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SHINGLE_STAIRS.get(), Items.MUD_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SHINGLE_SLAB.get(), Items.MUD_BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_SHINGLE_WALL.get(), Items.MUD_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_SHINGLE_STAIRS.get(), Items.MUD_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_SHINGLE_SLAB.get(), Items.MUD_BRICKS, 2)
        
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BRICK_WALL.get(), Items.BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BRICK_STAIRS.get(), Items.BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BRICK_SLAB.get(), Items.BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_BRICK_WALL.get(), Items.BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_BRICK_STAIRS.get(), Items.BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_BRICK_SLAB.get(), Items.BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_BRICK_WALL.get(), Items.BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_BRICK_STAIRS.get(), Items.BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_BRICK_SLAB.get(), Items.BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_BRICK_WALL.get(), Items.BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_BRICK_STAIRS.get(), Items.BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_BRICK_SLAB.get(), Items.BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_BRICK_WALL.get(), Items.BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_BRICK_STAIRS.get(), Items.BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_BRICK_SLAB.get(), Items.BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SHINGLE_WALL.get(), Items.BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SHINGLE_STAIRS.get(), Items.BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SHINGLE_SLAB.get(), Items.BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_SHINGLE_WALL.get(), Items.BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_SHINGLE_STAIRS.get(), Items.BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_SHINGLE_SLAB.get(), Items.BRICKS, 2)
        
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_WHITE_BRICK_WALL.get(), HybridBlocksItems.WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_WHITE_BRICK_STAIRS.get(), HybridBlocksItems.WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_WHITE_BRICK_SLAB.get(), HybridBlocksItems.WHITE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_WHITE_BRICK_WALL.get(), HybridBlocksItems.WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_WHITE_BRICK_STAIRS.get(), HybridBlocksItems.WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_WHITE_BRICK_SLAB.get(), HybridBlocksItems.WHITE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_WHITE_BRICK_WALL.get(), HybridBlocksItems.WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_WHITE_BRICK_STAIRS.get(), HybridBlocksItems.WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_WHITE_BRICK_SLAB.get(), HybridBlocksItems.WHITE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_WHITE_BRICK_WALL.get(), HybridBlocksItems.WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_WHITE_BRICK_STAIRS.get(), HybridBlocksItems.WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_WHITE_BRICK_SLAB.get(), HybridBlocksItems.WHITE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_WHITE_BRICK_WALL.get(), HybridBlocksItems.WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_WHITE_BRICK_STAIRS.get(), HybridBlocksItems.WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_WHITE_BRICK_SLAB.get(), HybridBlocksItems.WHITE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.WHITE_SHINGLE_WALL.get(), HybridBlocksItems.WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.WHITE_SHINGLE_STAIRS.get(), HybridBlocksItems.WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.WHITE_SHINGLE_SLAB.get(), HybridBlocksItems.WHITE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_WHITE_SHINGLE_WALL.get(), HybridBlocksItems.WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_WHITE_SHINGLE_STAIRS.get(), HybridBlocksItems.WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_WHITE_SHINGLE_SLAB.get(), HybridBlocksItems.WHITE_BRICKS.get(), 2)
        
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_LIGHT_GRAY_BRICK_WALL.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_LIGHT_GRAY_BRICK_STAIRS.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_LIGHT_GRAY_BRICK_SLAB.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_LIGHT_GRAY_BRICK_WALL.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_LIGHT_GRAY_BRICK_STAIRS.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_LIGHT_GRAY_BRICK_SLAB.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_LIGHT_GRAY_BRICK_WALL.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_LIGHT_GRAY_BRICK_STAIRS.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_LIGHT_GRAY_BRICK_SLAB.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_LIGHT_GRAY_BRICK_WALL.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_LIGHT_GRAY_BRICK_STAIRS.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_LIGHT_GRAY_BRICK_SLAB.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_LIGHT_GRAY_BRICK_WALL.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_LIGHT_GRAY_BRICK_STAIRS.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_LIGHT_GRAY_BRICK_SLAB.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIGHT_GRAY_SHINGLE_WALL.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIGHT_GRAY_SHINGLE_STAIRS.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIGHT_GRAY_SHINGLE_SLAB.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_LIGHT_GRAY_SHINGLE_WALL.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_LIGHT_GRAY_SHINGLE_STAIRS.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_LIGHT_GRAY_SHINGLE_SLAB.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get(), 2)

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_GRAY_BRICK_WALL.get(), HybridBlocksItems.GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_GRAY_BRICK_STAIRS.get(), HybridBlocksItems.GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_GRAY_BRICK_SLAB.get(), HybridBlocksItems.GRAY_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_GRAY_BRICK_WALL.get(), HybridBlocksItems.GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_GRAY_BRICK_STAIRS.get(), HybridBlocksItems.GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_GRAY_BRICK_SLAB.get(), HybridBlocksItems.GRAY_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_GRAY_BRICK_WALL.get(), HybridBlocksItems.GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_GRAY_BRICK_STAIRS.get(), HybridBlocksItems.GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_GRAY_BRICK_SLAB.get(), HybridBlocksItems.GRAY_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_GRAY_BRICK_WALL.get(), HybridBlocksItems.GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_GRAY_BRICK_STAIRS.get(), HybridBlocksItems.GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_GRAY_BRICK_SLAB.get(), HybridBlocksItems.GRAY_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_GRAY_BRICK_WALL.get(), HybridBlocksItems.GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_GRAY_BRICK_STAIRS.get(), HybridBlocksItems.GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_GRAY_BRICK_SLAB.get(), HybridBlocksItems.GRAY_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.GRAY_SHINGLE_WALL.get(), HybridBlocksItems.GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.GRAY_SHINGLE_STAIRS.get(), HybridBlocksItems.GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.GRAY_SHINGLE_SLAB.get(), HybridBlocksItems.GRAY_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_GRAY_SHINGLE_WALL.get(), HybridBlocksItems.GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_GRAY_SHINGLE_STAIRS.get(), HybridBlocksItems.GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_GRAY_SHINGLE_SLAB.get(), HybridBlocksItems.GRAY_BRICKS.get(), 2)

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BLACK_BRICK_WALL.get(), HybridBlocksItems.BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BLACK_BRICK_STAIRS.get(), HybridBlocksItems.BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BLACK_BRICK_SLAB.get(), HybridBlocksItems.BLACK_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_BLACK_BRICK_WALL.get(), HybridBlocksItems.BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_BLACK_BRICK_STAIRS.get(), HybridBlocksItems.BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_BLACK_BRICK_SLAB.get(), HybridBlocksItems.BLACK_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_BLACK_BRICK_WALL.get(), HybridBlocksItems.BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_BLACK_BRICK_STAIRS.get(), HybridBlocksItems.BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_BLACK_BRICK_SLAB.get(), HybridBlocksItems.BLACK_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_BLACK_BRICK_WALL.get(), HybridBlocksItems.BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_BLACK_BRICK_STAIRS.get(), HybridBlocksItems.BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_BLACK_BRICK_SLAB.get(), HybridBlocksItems.BLACK_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_BLACK_BRICK_WALL.get(), HybridBlocksItems.BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_BLACK_BRICK_STAIRS.get(), HybridBlocksItems.BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_BLACK_BRICK_SLAB.get(), HybridBlocksItems.BLACK_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BLACK_SHINGLE_WALL.get(), HybridBlocksItems.BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BLACK_SHINGLE_STAIRS.get(), HybridBlocksItems.BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BLACK_SHINGLE_SLAB.get(), HybridBlocksItems.BLACK_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BLACK_SHINGLE_WALL.get(), HybridBlocksItems.BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BLACK_SHINGLE_STAIRS.get(), HybridBlocksItems.BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BLACK_SHINGLE_SLAB.get(), HybridBlocksItems.BLACK_BRICKS.get(), 2)

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_RED_BRICK_WALL.get(), HybridBlocksItems.RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_RED_BRICK_STAIRS.get(), HybridBlocksItems.RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_RED_BRICK_SLAB.get(), HybridBlocksItems.RED_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_RED_BRICK_WALL.get(), HybridBlocksItems.RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_RED_BRICK_STAIRS.get(), HybridBlocksItems.RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_RED_BRICK_SLAB.get(), HybridBlocksItems.RED_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_RED_BRICK_WALL.get(), HybridBlocksItems.RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_RED_BRICK_STAIRS.get(), HybridBlocksItems.RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_RED_BRICK_SLAB.get(), HybridBlocksItems.RED_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_RED_BRICK_WALL.get(), HybridBlocksItems.RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_RED_BRICK_STAIRS.get(), HybridBlocksItems.RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_RED_BRICK_SLAB.get(), HybridBlocksItems.RED_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_RED_BRICK_WALL.get(), HybridBlocksItems.RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_RED_BRICK_STAIRS.get(), HybridBlocksItems.RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_RED_BRICK_SLAB.get(), HybridBlocksItems.RED_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.RED_SHINGLE_WALL.get(), HybridBlocksItems.RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.RED_SHINGLE_STAIRS.get(), HybridBlocksItems.RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.RED_SHINGLE_SLAB.get(), HybridBlocksItems.RED_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_RED_SHINGLE_WALL.get(), HybridBlocksItems.RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_RED_SHINGLE_STAIRS.get(), HybridBlocksItems.RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_RED_SHINGLE_SLAB.get(), HybridBlocksItems.RED_BRICKS.get(), 2)

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_ORANGE_BRICK_WALL.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_ORANGE_BRICK_STAIRS.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_ORANGE_BRICK_SLAB.get(), HybridBlocksItems.ORANGE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_ORANGE_BRICK_WALL.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_ORANGE_BRICK_STAIRS.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_ORANGE_BRICK_SLAB.get(), HybridBlocksItems.ORANGE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_ORANGE_BRICK_WALL.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_ORANGE_BRICK_STAIRS.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_ORANGE_BRICK_SLAB.get(), HybridBlocksItems.ORANGE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_ORANGE_BRICK_WALL.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_ORANGE_BRICK_STAIRS.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_ORANGE_BRICK_SLAB.get(), HybridBlocksItems.ORANGE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_ORANGE_BRICK_WALL.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_ORANGE_BRICK_STAIRS.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_ORANGE_BRICK_SLAB.get(), HybridBlocksItems.ORANGE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.ORANGE_SHINGLE_WALL.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.ORANGE_SHINGLE_STAIRS.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.ORANGE_SHINGLE_SLAB.get(), HybridBlocksItems.ORANGE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_ORANGE_SHINGLE_WALL.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_ORANGE_SHINGLE_STAIRS.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_ORANGE_SHINGLE_SLAB.get(), HybridBlocksItems.ORANGE_BRICKS.get(), 2)

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_YELLOW_BRICK_WALL.get(), HybridBlocksItems.YELLOW_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_YELLOW_BRICK_STAIRS.get(), HybridBlocksItems.YELLOW_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_YELLOW_BRICK_SLAB.get(), HybridBlocksItems.YELLOW_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_YELLOW_BRICK_WALL.get(), HybridBlocksItems.YELLOW_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_YELLOW_BRICK_STAIRS.get(), HybridBlocksItems.YELLOW_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_YELLOW_BRICK_SLAB.get(), HybridBlocksItems.YELLOW_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_YELLOW_BRICK_WALL.get(), HybridBlocksItems.YELLOW_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_YELLOW_BRICK_STAIRS.get(), HybridBlocksItems.YELLOW_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_YELLOW_BRICK_SLAB.get(), HybridBlocksItems.YELLOW_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_YELLOW_BRICK_WALL.get(), HybridBlocksItems.YELLOW_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_YELLOW_BRICK_STAIRS.get(), HybridBlocksItems.YELLOW_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_YELLOW_BRICK_SLAB.get(), HybridBlocksItems.YELLOW_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_YELLOW_BRICK_WALL.get(), HybridBlocksItems.YELLOW_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_YELLOW_BRICK_STAIRS.get(), HybridBlocksItems.YELLOW_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_YELLOW_BRICK_SLAB.get(), HybridBlocksItems.YELLOW_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.YELLOW_SHINGLE_WALL.get(), HybridBlocksItems.YELLOW_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.YELLOW_SHINGLE_STAIRS.get(), HybridBlocksItems.YELLOW_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.YELLOW_SHINGLE_SLAB.get(), HybridBlocksItems.YELLOW_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_YELLOW_SHINGLE_WALL.get(), HybridBlocksItems.YELLOW_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_YELLOW_SHINGLE_STAIRS.get(), HybridBlocksItems.YELLOW_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_YELLOW_SHINGLE_SLAB.get(), HybridBlocksItems.YELLOW_BRICKS.get(), 2)

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BROWN_BRICK_WALL.get(), HybridBlocksItems.BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BROWN_BRICK_STAIRS.get(), HybridBlocksItems.BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BROWN_BRICK_SLAB.get(), HybridBlocksItems.BROWN_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_BROWN_BRICK_WALL.get(), HybridBlocksItems.BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_BROWN_BRICK_STAIRS.get(), HybridBlocksItems.BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_BROWN_BRICK_SLAB.get(), HybridBlocksItems.BROWN_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_BROWN_BRICK_WALL.get(), HybridBlocksItems.BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_BROWN_BRICK_STAIRS.get(), HybridBlocksItems.BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_BROWN_BRICK_SLAB.get(), HybridBlocksItems.BROWN_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_BROWN_BRICK_WALL.get(), HybridBlocksItems.BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_BROWN_BRICK_STAIRS.get(), HybridBlocksItems.BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_BROWN_BRICK_SLAB.get(), HybridBlocksItems.BROWN_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_BROWN_BRICK_WALL.get(), HybridBlocksItems.BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_BROWN_BRICK_STAIRS.get(), HybridBlocksItems.BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_BROWN_BRICK_SLAB.get(), HybridBlocksItems.BROWN_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BROWN_SHINGLE_WALL.get(), HybridBlocksItems.BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BROWN_SHINGLE_STAIRS.get(), HybridBlocksItems.BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BROWN_SHINGLE_SLAB.get(), HybridBlocksItems.BROWN_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BROWN_SHINGLE_WALL.get(), HybridBlocksItems.BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BROWN_SHINGLE_STAIRS.get(), HybridBlocksItems.BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BROWN_SHINGLE_SLAB.get(), HybridBlocksItems.BROWN_BRICKS.get(), 2)

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_GREEN_BRICK_WALL.get(), HybridBlocksItems.GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_GREEN_BRICK_STAIRS.get(), HybridBlocksItems.GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_GREEN_BRICK_SLAB.get(), HybridBlocksItems.GREEN_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_GREEN_BRICK_WALL.get(), HybridBlocksItems.GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_GREEN_BRICK_STAIRS.get(), HybridBlocksItems.GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_GREEN_BRICK_SLAB.get(), HybridBlocksItems.GREEN_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_GREEN_BRICK_WALL.get(), HybridBlocksItems.GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_GREEN_BRICK_STAIRS.get(), HybridBlocksItems.GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_GREEN_BRICK_SLAB.get(), HybridBlocksItems.GREEN_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_GREEN_BRICK_WALL.get(), HybridBlocksItems.GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_GREEN_BRICK_STAIRS.get(), HybridBlocksItems.GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_GREEN_BRICK_SLAB.get(), HybridBlocksItems.GREEN_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_GREEN_BRICK_WALL.get(), HybridBlocksItems.GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_GREEN_BRICK_STAIRS.get(), HybridBlocksItems.GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_GREEN_BRICK_SLAB.get(), HybridBlocksItems.GREEN_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.GREEN_SHINGLE_WALL.get(), HybridBlocksItems.GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.GREEN_SHINGLE_STAIRS.get(), HybridBlocksItems.GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.GREEN_SHINGLE_SLAB.get(), HybridBlocksItems.GREEN_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_GREEN_SHINGLE_WALL.get(), HybridBlocksItems.GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_GREEN_SHINGLE_STAIRS.get(), HybridBlocksItems.GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_GREEN_SHINGLE_SLAB.get(), HybridBlocksItems.GREEN_BRICKS.get(), 2)

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_LIME_BRICK_WALL.get(), HybridBlocksItems.LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_LIME_BRICK_STAIRS.get(), HybridBlocksItems.LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_LIME_BRICK_SLAB.get(), HybridBlocksItems.LIME_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_LIME_BRICK_WALL.get(), HybridBlocksItems.LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_LIME_BRICK_STAIRS.get(), HybridBlocksItems.LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_LIME_BRICK_SLAB.get(), HybridBlocksItems.LIME_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_LIME_BRICK_WALL.get(), HybridBlocksItems.LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_LIME_BRICK_STAIRS.get(), HybridBlocksItems.LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_LIME_BRICK_SLAB.get(), HybridBlocksItems.LIME_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_LIME_BRICK_WALL.get(), HybridBlocksItems.LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_LIME_BRICK_STAIRS.get(), HybridBlocksItems.LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_LIME_BRICK_SLAB.get(), HybridBlocksItems.LIME_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_LIME_BRICK_WALL.get(), HybridBlocksItems.LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_LIME_BRICK_STAIRS.get(), HybridBlocksItems.LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_LIME_BRICK_SLAB.get(), HybridBlocksItems.LIME_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIME_SHINGLE_WALL.get(), HybridBlocksItems.LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIME_SHINGLE_STAIRS.get(), HybridBlocksItems.LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIME_SHINGLE_SLAB.get(), HybridBlocksItems.LIME_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_LIME_SHINGLE_WALL.get(), HybridBlocksItems.LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_LIME_SHINGLE_STAIRS.get(), HybridBlocksItems.LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_LIME_SHINGLE_SLAB.get(), HybridBlocksItems.LIME_BRICKS.get(), 2)

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_CYAN_BRICK_WALL.get(), HybridBlocksItems.CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_CYAN_BRICK_STAIRS.get(), HybridBlocksItems.CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_CYAN_BRICK_SLAB.get(), HybridBlocksItems.CYAN_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_CYAN_BRICK_WALL.get(), HybridBlocksItems.CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_CYAN_BRICK_STAIRS.get(), HybridBlocksItems.CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_CYAN_BRICK_SLAB.get(), HybridBlocksItems.CYAN_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_CYAN_BRICK_WALL.get(), HybridBlocksItems.CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_CYAN_BRICK_STAIRS.get(), HybridBlocksItems.CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_CYAN_BRICK_SLAB.get(), HybridBlocksItems.CYAN_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_CYAN_BRICK_WALL.get(), HybridBlocksItems.CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_CYAN_BRICK_STAIRS.get(), HybridBlocksItems.CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_CYAN_BRICK_SLAB.get(), HybridBlocksItems.CYAN_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_CYAN_BRICK_WALL.get(), HybridBlocksItems.CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_CYAN_BRICK_STAIRS.get(), HybridBlocksItems.CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_CYAN_BRICK_SLAB.get(), HybridBlocksItems.CYAN_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CYAN_SHINGLE_WALL.get(), HybridBlocksItems.CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CYAN_SHINGLE_STAIRS.get(), HybridBlocksItems.CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.CYAN_SHINGLE_SLAB.get(), HybridBlocksItems.CYAN_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_CYAN_SHINGLE_WALL.get(), HybridBlocksItems.CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_CYAN_SHINGLE_STAIRS.get(), HybridBlocksItems.CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_CYAN_SHINGLE_SLAB.get(), HybridBlocksItems.CYAN_BRICKS.get(), 2)

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BLUE_BRICK_WALL.get(), HybridBlocksItems.BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BLUE_BRICK_STAIRS.get(), HybridBlocksItems.BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BLUE_BRICK_SLAB.get(), HybridBlocksItems.BLUE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_BLUE_BRICK_WALL.get(), HybridBlocksItems.BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_BLUE_BRICK_STAIRS.get(), HybridBlocksItems.BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_BLUE_BRICK_SLAB.get(), HybridBlocksItems.BLUE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_BLUE_BRICK_WALL.get(), HybridBlocksItems.BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_BLUE_BRICK_STAIRS.get(), HybridBlocksItems.BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_BLUE_BRICK_SLAB.get(), HybridBlocksItems.BLUE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_BLUE_BRICK_WALL.get(), HybridBlocksItems.BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_BLUE_BRICK_STAIRS.get(), HybridBlocksItems.BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_BLUE_BRICK_SLAB.get(), HybridBlocksItems.BLUE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_BLUE_BRICK_WALL.get(), HybridBlocksItems.BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_BLUE_BRICK_STAIRS.get(), HybridBlocksItems.BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_BLUE_BRICK_SLAB.get(), HybridBlocksItems.BLUE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BLUE_SHINGLE_WALL.get(), HybridBlocksItems.BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BLUE_SHINGLE_STAIRS.get(), HybridBlocksItems.BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.BLUE_SHINGLE_SLAB.get(), HybridBlocksItems.BLUE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BLUE_SHINGLE_WALL.get(), HybridBlocksItems.BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BLUE_SHINGLE_STAIRS.get(), HybridBlocksItems.BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_BLUE_SHINGLE_SLAB.get(), HybridBlocksItems.BLUE_BRICKS.get(), 2)

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_LIGHT_BLUE_BRICK_WALL.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_LIGHT_BLUE_BRICK_STAIRS.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_LIGHT_BLUE_BRICK_SLAB.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_LIGHT_BLUE_BRICK_WALL.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_LIGHT_BLUE_BRICK_STAIRS.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_LIGHT_BLUE_BRICK_SLAB.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_LIGHT_BLUE_BRICK_WALL.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_LIGHT_BLUE_BRICK_STAIRS.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_LIGHT_BLUE_BRICK_SLAB.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_LIGHT_BLUE_BRICK_WALL.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_LIGHT_BLUE_BRICK_STAIRS.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_LIGHT_BLUE_BRICK_SLAB.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_LIGHT_BLUE_BRICK_WALL.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_LIGHT_BLUE_BRICK_STAIRS.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_LIGHT_BLUE_BRICK_SLAB.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIGHT_BLUE_SHINGLE_WALL.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIGHT_BLUE_SHINGLE_STAIRS.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LIGHT_BLUE_SHINGLE_SLAB.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_LIGHT_BLUE_SHINGLE_WALL.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_LIGHT_BLUE_SHINGLE_STAIRS.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_LIGHT_BLUE_SHINGLE_SLAB.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get(), 2)

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_PURPLE_BRICK_WALL.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_PURPLE_BRICK_STAIRS.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_PURPLE_BRICK_SLAB.get(), HybridBlocksItems.PURPLE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_PURPLE_BRICK_WALL.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_PURPLE_BRICK_STAIRS.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_PURPLE_BRICK_SLAB.get(), HybridBlocksItems.PURPLE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_PURPLE_BRICK_WALL.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_PURPLE_BRICK_STAIRS.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_PURPLE_BRICK_SLAB.get(), HybridBlocksItems.PURPLE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_PURPLE_BRICK_WALL.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_PURPLE_BRICK_STAIRS.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_PURPLE_BRICK_SLAB.get(), HybridBlocksItems.PURPLE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_PURPLE_BRICK_WALL.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_PURPLE_BRICK_STAIRS.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_PURPLE_BRICK_SLAB.get(), HybridBlocksItems.PURPLE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PURPLE_SHINGLE_WALL.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PURPLE_SHINGLE_STAIRS.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PURPLE_SHINGLE_SLAB.get(), HybridBlocksItems.PURPLE_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_PURPLE_SHINGLE_WALL.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_PURPLE_SHINGLE_STAIRS.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_PURPLE_SHINGLE_SLAB.get(), HybridBlocksItems.PURPLE_BRICKS.get(), 2)

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_MAGENTA_BRICK_WALL.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_MAGENTA_BRICK_STAIRS.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_MAGENTA_BRICK_SLAB.get(), HybridBlocksItems.MAGENTA_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MAGENTA_BRICK_WALL.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MAGENTA_BRICK_STAIRS.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MAGENTA_BRICK_SLAB.get(), HybridBlocksItems.MAGENTA_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_MAGENTA_BRICK_WALL.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_MAGENTA_BRICK_STAIRS.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_MAGENTA_BRICK_SLAB.get(), HybridBlocksItems.MAGENTA_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MAGENTA_BRICK_WALL.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MAGENTA_BRICK_STAIRS.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MAGENTA_BRICK_SLAB.get(), HybridBlocksItems.MAGENTA_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_MAGENTA_BRICK_WALL.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_MAGENTA_BRICK_STAIRS.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_MAGENTA_BRICK_SLAB.get(), HybridBlocksItems.MAGENTA_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MAGENTA_SHINGLE_WALL.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MAGENTA_SHINGLE_STAIRS.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MAGENTA_SHINGLE_SLAB.get(), HybridBlocksItems.MAGENTA_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_MAGENTA_SHINGLE_WALL.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_MAGENTA_SHINGLE_STAIRS.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_MAGENTA_SHINGLE_SLAB.get(), HybridBlocksItems.MAGENTA_BRICKS.get(), 2)

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_PINK_BRICK_WALL.get(), HybridBlocksItems.PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_PINK_BRICK_STAIRS.get(), HybridBlocksItems.PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_PINK_BRICK_SLAB.get(), HybridBlocksItems.PINK_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_PINK_BRICK_WALL.get(), HybridBlocksItems.PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_PINK_BRICK_STAIRS.get(), HybridBlocksItems.PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_PINK_BRICK_SLAB.get(), HybridBlocksItems.PINK_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_PINK_BRICK_WALL.get(), HybridBlocksItems.PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_PINK_BRICK_STAIRS.get(), HybridBlocksItems.PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_PINK_BRICK_SLAB.get(), HybridBlocksItems.PINK_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_PINK_BRICK_WALL.get(), HybridBlocksItems.PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_PINK_BRICK_STAIRS.get(), HybridBlocksItems.PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_PINK_BRICK_SLAB.get(), HybridBlocksItems.PINK_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_PINK_BRICK_WALL.get(), HybridBlocksItems.PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_PINK_BRICK_STAIRS.get(), HybridBlocksItems.PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_PINK_BRICK_SLAB.get(), HybridBlocksItems.PINK_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINK_SHINGLE_WALL.get(), HybridBlocksItems.PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINK_SHINGLE_STAIRS.get(), HybridBlocksItems.PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.PINK_SHINGLE_SLAB.get(), HybridBlocksItems.PINK_BRICKS.get(), 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_PINK_SHINGLE_WALL.get(), HybridBlocksItems.PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_PINK_SHINGLE_STAIRS.get(), HybridBlocksItems.PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_PINK_SHINGLE_SLAB.get(), HybridBlocksItems.PINK_BRICKS.get(), 2)

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_NETHER_BRICK_WALL.get(), Items.NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_NETHER_BRICK_STAIRS.get(), Items.NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_NETHER_BRICK_SLAB.get(), Items.NETHER_BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_NETHER_BRICK_WALL.get(), Items.NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_NETHER_BRICK_STAIRS.get(), Items.NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_NETHER_BRICK_SLAB.get(), Items.NETHER_BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_NETHER_BRICK_WALL.get(), Items.NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_NETHER_BRICK_STAIRS.get(), Items.NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_NETHER_BRICK_SLAB.get(), Items.NETHER_BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_NETHER_BRICK_WALL.get(), Items.NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_NETHER_BRICK_STAIRS.get(), Items.NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_NETHER_BRICK_SLAB.get(), Items.NETHER_BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_NETHER_BRICK_WALL.get(), Items.NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_NETHER_BRICK_STAIRS.get(), Items.NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_NETHER_BRICK_SLAB.get(), Items.NETHER_BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.NETHER_SHINGLE_WALL.get(), Items.NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.NETHER_SHINGLE_STAIRS.get(), Items.NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.NETHER_SHINGLE_SLAB.get(), Items.NETHER_BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_NETHER_SHINGLE_WALL.get(), Items.NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_NETHER_SHINGLE_STAIRS.get(), Items.NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_NETHER_SHINGLE_SLAB.get(), Items.NETHER_BRICKS, 2)

        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_RED_NETHER_BRICK_WALL.get(), Items.RED_NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_RED_NETHER_BRICK_STAIRS.get(), Items.RED_NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_RED_NETHER_BRICK_SLAB.get(), Items.RED_NETHER_BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_RED_NETHER_BRICK_WALL.get(), Items.RED_NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_RED_NETHER_BRICK_STAIRS.get(), Items.RED_NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_RED_NETHER_BRICK_SLAB.get(), Items.RED_NETHER_BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_RED_NETHER_BRICK_WALL.get(), Items.RED_NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_RED_NETHER_BRICK_STAIRS.get(), Items.RED_NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_RED_NETHER_BRICK_SLAB.get(), Items.RED_NETHER_BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_RED_NETHER_BRICK_WALL.get(), Items.RED_NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_RED_NETHER_BRICK_STAIRS.get(), Items.RED_NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_RED_NETHER_BRICK_SLAB.get(), Items.RED_NETHER_BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_RED_NETHER_BRICK_WALL.get(), Items.RED_NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_RED_NETHER_BRICK_STAIRS.get(), Items.RED_NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_RED_NETHER_BRICK_SLAB.get(), Items.RED_NETHER_BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.RED_NETHER_SHINGLE_WALL.get(), Items.RED_NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.RED_NETHER_SHINGLE_STAIRS.get(), Items.RED_NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.RED_NETHER_SHINGLE_SLAB.get(), Items.RED_NETHER_BRICKS, 2)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_RED_NETHER_SHINGLE_WALL.get(), Items.RED_NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_RED_NETHER_SHINGLE_STAIRS.get(), Items.RED_NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.MIXED_RED_NETHER_SHINGLE_SLAB.get(), Items.RED_NETHER_BRICKS, 2)
        
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

        //#region Small Bricks
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_BRICKS.get(), Items.BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_NETHER_BRICKS.get(), Items.NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_RED_NETHER_BRICKS.get(), Items.RED_NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_BLACK_BRICKS.get(), HybridBlocksItems.BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_BLUE_BRICKS.get(), HybridBlocksItems.BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_BROWN_BRICKS.get(), HybridBlocksItems.BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_CYAN_BRICKS.get(), HybridBlocksItems.CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_GRAY_BRICKS.get(), HybridBlocksItems.GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_GREEN_BRICKS.get(), HybridBlocksItems.GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_LIGHT_BLUE_BRICKS.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_LIGHT_GRAY_BRICKS.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_LIME_BRICKS.get(), HybridBlocksItems.LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MAGENTA_BRICKS.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_ORANGE_BRICKS.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_PINK_BRICKS.get(), HybridBlocksItems.PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_PURPLE_BRICKS.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_RED_BRICKS.get(), HybridBlocksItems.RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_WHITE_BRICKS.get(), HybridBlocksItems.WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_YELLOW_BRICKS.get(), HybridBlocksItems.YELLOW_BRICKS.get())
        //#endregion

        //#region Small Mixed Bricks
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_BRICKS.get(), Items.BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_NETHER_BRICKS.get(), Items.NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_RED_NETHER_BRICKS.get(), Items.RED_NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_BLACK_BRICKS.get(), HybridBlocksItems.BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_BLUE_BRICKS.get(), HybridBlocksItems.BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_BROWN_BRICKS.get(), HybridBlocksItems.BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_CYAN_BRICKS.get(), HybridBlocksItems.CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_GRAY_BRICKS.get(), HybridBlocksItems.GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_GREEN_BRICKS.get(), HybridBlocksItems.GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_LIGHT_BLUE_BRICKS.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_LIGHT_GRAY_BRICKS.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_LIME_BRICKS.get(), HybridBlocksItems.LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_MAGENTA_BRICKS.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_ORANGE_BRICKS.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_PINK_BRICKS.get(), HybridBlocksItems.PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_PURPLE_BRICKS.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_RED_BRICKS.get(), HybridBlocksItems.RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_WHITE_BRICKS.get(), HybridBlocksItems.WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.SMALL_MIXED_YELLOW_BRICKS.get(), HybridBlocksItems.YELLOW_BRICKS.get())
        //#endregion

        //#region Large Bricks
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_BRICKS.get(), Items.BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_NETHER_BRICKS.get(), Items.NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_RED_NETHER_BRICKS.get(), Items.RED_NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_BLACK_BRICKS.get(), HybridBlocksItems.BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_BLUE_BRICKS.get(), HybridBlocksItems.BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_BROWN_BRICKS.get(), HybridBlocksItems.BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_CYAN_BRICKS.get(), HybridBlocksItems.CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_GRAY_BRICKS.get(), HybridBlocksItems.GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_GREEN_BRICKS.get(), HybridBlocksItems.GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_LIGHT_BLUE_BRICKS.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_LIGHT_GRAY_BRICKS.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_LIME_BRICKS.get(), HybridBlocksItems.LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MAGENTA_BRICKS.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_ORANGE_BRICKS.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_PINK_BRICKS.get(), HybridBlocksItems.PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_PURPLE_BRICKS.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_RED_BRICKS.get(), HybridBlocksItems.RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_WHITE_BRICKS.get(), HybridBlocksItems.WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_YELLOW_BRICKS.get(), HybridBlocksItems.YELLOW_BRICKS.get())
        //#endregion

        //#region Large Mixed Bricks
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_BRICKS.get(), Items.BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_NETHER_BRICKS.get(), Items.NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_RED_NETHER_BRICKS.get(), Items.RED_NETHER_BRICKS)
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_BLACK_BRICKS.get(), HybridBlocksItems.BLACK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_BLUE_BRICKS.get(), HybridBlocksItems.BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_BROWN_BRICKS.get(), HybridBlocksItems.BROWN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_CYAN_BRICKS.get(), HybridBlocksItems.CYAN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_GRAY_BRICKS.get(), HybridBlocksItems.GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_GREEN_BRICKS.get(), HybridBlocksItems.GREEN_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_LIGHT_BLUE_BRICKS.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_LIGHT_GRAY_BRICKS.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_LIME_BRICKS.get(), HybridBlocksItems.LIME_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_MAGENTA_BRICKS.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_ORANGE_BRICKS.get(), HybridBlocksItems.ORANGE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_PINK_BRICKS.get(), HybridBlocksItems.PINK_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_PURPLE_BRICKS.get(), HybridBlocksItems.PURPLE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_RED_BRICKS.get(), HybridBlocksItems.RED_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_WHITE_BRICKS.get(), HybridBlocksItems.WHITE_BRICKS.get())
        stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksItems.LARGE_MIXED_YELLOW_BRICKS.get(), HybridBlocksItems.YELLOW_BRICKS.get())
        //#endregion

        //#region Chimney
        offerChimneyRecipe(exporter, Items.MUD_BRICKS, getHasName(Items.MUD_BRICKS),HybridBlocksItems.MUD_BRICK_CHIMNEY.get())
        offerChimneyRecipe(exporter, Items.BRICKS, getHasName(Items.BRICKS),HybridBlocksItems.BRICK_CHIMNEY.get())
        offerChimneyRecipe(exporter, Items.NETHER_BRICKS, getHasName(Items.NETHER_BRICKS),HybridBlocksItems.NETHER_BRICK_CHIMNEY.get())
        offerChimneyRecipe(exporter, Items.RED_NETHER_BRICKS, getHasName(Items.RED_NETHER_BRICKS), HybridBlocksItems.RED_NETHER_BRICK_CHIMNEY.get())
        offerChimneyRecipe(exporter, HybridBlocksItems.BLACK_BRICKS.get(), getHasName(HybridBlocksItems.BLACK_BRICKS.get()), HybridBlocksItems.BLACK_BRICK_CHIMNEY.get())
        offerChimneyRecipe(exporter, HybridBlocksItems.BLUE_BRICKS.get(), getHasName(HybridBlocksItems.BLUE_BRICKS.get()), HybridBlocksItems.BLUE_BRICK_CHIMNEY.get())
        offerChimneyRecipe(exporter, HybridBlocksItems.BROWN_BRICKS.get(), getHasName(HybridBlocksItems.BROWN_BRICKS.get()), HybridBlocksItems.BROWN_BRICK_CHIMNEY.get())
        offerChimneyRecipe(exporter, HybridBlocksItems.CYAN_BRICKS.get(), getHasName(HybridBlocksItems.CYAN_BRICKS.get()),  HybridBlocksItems.CYAN_BRICK_CHIMNEY.get())
        offerChimneyRecipe(exporter, HybridBlocksItems.GRAY_BRICKS.get(), getHasName(HybridBlocksItems.GRAY_BRICKS.get()), HybridBlocksItems.GRAY_BRICK_CHIMNEY.get())
        offerChimneyRecipe(exporter, HybridBlocksItems.GREEN_BRICKS.get(), getHasName(HybridBlocksItems.GREEN_BRICKS.get()), HybridBlocksItems.GREEN_BRICK_CHIMNEY.get())
        offerChimneyRecipe(exporter, HybridBlocksItems.LIGHT_BLUE_BRICKS.get(), getHasName(HybridBlocksItems.LIGHT_BLUE_BRICKS.get()), HybridBlocksItems.LIGHT_BLUE_BRICK_CHIMNEY.get())
        offerChimneyRecipe(exporter, HybridBlocksItems.LIGHT_GRAY_BRICKS.get(), getHasName(HybridBlocksItems.LIGHT_GRAY_BRICKS.get()), HybridBlocksItems.LIGHT_GRAY_BRICK_CHIMNEY.get())
        offerChimneyRecipe(exporter, HybridBlocksItems.LIME_BRICKS.get(), getHasName(HybridBlocksItems.LIME_BRICKS.get()), HybridBlocksItems.LIME_BRICK_CHIMNEY.get())
        offerChimneyRecipe(exporter, HybridBlocksItems.MAGENTA_BRICKS.get(), getHasName(HybridBlocksItems.MAGENTA_BRICKS.get()), HybridBlocksItems.MAGENTA_BRICK_CHIMNEY.get())
        offerChimneyRecipe(exporter, HybridBlocksItems.ORANGE_BRICKS.get(), getHasName(HybridBlocksItems.ORANGE_BRICKS.get()), HybridBlocksItems.ORANGE_BRICK_CHIMNEY.get())
        offerChimneyRecipe(exporter, HybridBlocksItems.PINK_BRICKS.get(), getHasName(HybridBlocksItems.PINK_BRICKS.get()), HybridBlocksItems.PINK_BRICK_CHIMNEY.get())
        offerChimneyRecipe(exporter, HybridBlocksItems.PURPLE_BRICKS.get(), getHasName(HybridBlocksItems.PURPLE_BRICKS.get()), HybridBlocksItems.PURPLE_BRICK_CHIMNEY.get())
        offerChimneyRecipe(exporter, HybridBlocksItems.RED_BRICKS.get(), getHasName(HybridBlocksItems.RED_BRICKS.get()), HybridBlocksItems.RED_BRICK_CHIMNEY.get())
        offerChimneyRecipe(exporter, HybridBlocksItems.WHITE_BRICKS.get(), getHasName(HybridBlocksItems.WHITE_BRICKS.get()), HybridBlocksItems.WHITE_BRICK_CHIMNEY.get())
        offerChimneyRecipe(exporter, HybridBlocksItems.YELLOW_BRICKS.get(), getHasName(HybridBlocksItems.YELLOW_BRICKS.get()), HybridBlocksItems.YELLOW_BRICK_CHIMNEY.get())
        //#endregion

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

        simpleCookingRecipe(exporter, "smelting", RecipeSerializer.SMELTING_RECIPE, ::SmeltingRecipe, 200, Items.GLASS, HybridBlocksItems.CLEAR_GLASS.get(), 0.15f)
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
        offerMossingRecipes(exporter, "mossy_mud_bricks", HybridBlocksItems.MOSSY_MEDIUM_MUD_BRICKS.get(), Items.BRICKS)

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
            return "${to}_from_${from.descriptionId}"
        }

        private fun offerShinglesDyeingRecipe(
            exporter: RecipeOutput,
            output: Item,
            input: Item,
        ) {
            offerDyeingRecipe(
                exporter,
                HybridBlocksItems.SHINGLES.get(),
                "has_shingles",
                "stained_shingles",
                output,
                input
            )
        }

        //#region Bricks And Shingles
        private data class BrickAndShingleRecipeSets(
            val base: RegistryObject<BlockItem>,
            val stairBuilders: RegistryObject<BlockItem>,
            val slabs: RegistryObject<BlockItem>,
            val walls: RegistryObject<BlockItem>,
        )

        private val BRICK_AND_SHINGLE_SETS = listOf(

            //#region Bricks
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MEDIUM_MUD_BRICKS,
                HybridBlocksItems.MEDIUM_MUD_BRICK_STAIRS,
                HybridBlocksItems.MEDIUM_MUD_BRICK_SLAB,
                HybridBlocksItems.MEDIUM_MUD_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.BLACK_BRICKS,
                HybridBlocksItems.BLACK_BRICK_STAIRS,
                HybridBlocksItems.BLACK_BRICK_SLAB,
                HybridBlocksItems.BLACK_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.BLUE_BRICKS,
                HybridBlocksItems.BLUE_BRICK_STAIRS,
                HybridBlocksItems.BLUE_BRICK_SLAB,
                HybridBlocksItems.BLUE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.BROWN_BRICKS,
                HybridBlocksItems.BROWN_BRICK_STAIRS,
                HybridBlocksItems.BROWN_BRICK_SLAB,
                HybridBlocksItems.BROWN_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.CYAN_BRICKS,
                HybridBlocksItems.CYAN_BRICK_STAIRS,
                HybridBlocksItems.CYAN_BRICK_SLAB,
                HybridBlocksItems.CYAN_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.GRAY_BRICKS,
                HybridBlocksItems.GRAY_BRICK_STAIRS,
                HybridBlocksItems.GRAY_BRICK_SLAB,
                HybridBlocksItems.GRAY_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.GREEN_BRICKS,
                HybridBlocksItems.GREEN_BRICK_STAIRS,
                HybridBlocksItems.GREEN_BRICK_SLAB,
                HybridBlocksItems.GREEN_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LIGHT_BLUE_BRICKS,
                HybridBlocksItems.LIGHT_BLUE_BRICK_STAIRS,
                HybridBlocksItems.LIGHT_BLUE_BRICK_SLAB,
                HybridBlocksItems.LIGHT_BLUE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LIGHT_GRAY_BRICKS,
                HybridBlocksItems.LIGHT_GRAY_BRICK_STAIRS,
                HybridBlocksItems.LIGHT_GRAY_BRICK_SLAB,
                HybridBlocksItems.LIGHT_GRAY_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LIME_BRICKS,
                HybridBlocksItems.LIME_BRICK_STAIRS,
                HybridBlocksItems.LIME_BRICK_SLAB,
                HybridBlocksItems.LIME_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MAGENTA_BRICKS,
                HybridBlocksItems.MAGENTA_BRICK_STAIRS,
                HybridBlocksItems.MAGENTA_BRICK_SLAB,
                HybridBlocksItems.MAGENTA_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.ORANGE_BRICKS,
                HybridBlocksItems.ORANGE_BRICK_STAIRS,
                HybridBlocksItems.ORANGE_BRICK_SLAB,
                HybridBlocksItems.ORANGE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.PINK_BRICKS,
                HybridBlocksItems.PINK_BRICK_STAIRS,
                HybridBlocksItems.PINK_BRICK_SLAB,
                HybridBlocksItems.PINK_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.PURPLE_BRICKS,
                HybridBlocksItems.PURPLE_BRICK_STAIRS,
                HybridBlocksItems.PURPLE_BRICK_SLAB,
                HybridBlocksItems.PURPLE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.RED_BRICKS,
                HybridBlocksItems.RED_BRICK_STAIRS,
                HybridBlocksItems.RED_BRICK_SLAB,
                HybridBlocksItems.RED_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.WHITE_BRICKS,
                HybridBlocksItems.WHITE_BRICK_STAIRS,
                HybridBlocksItems.WHITE_BRICK_SLAB,
                HybridBlocksItems.WHITE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.YELLOW_BRICKS,
                HybridBlocksItems.YELLOW_BRICK_STAIRS,
                HybridBlocksItems.YELLOW_BRICK_SLAB,
                HybridBlocksItems.YELLOW_BRICK_WALL
            ),
            //#endregion

            //#region Mixed Bricks
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MEDIUM_MIXED_MUD_BRICKS,
                HybridBlocksItems.MEDIUM_MIXED_MUD_BRICK_STAIRS,
                HybridBlocksItems.MEDIUM_MIXED_MUD_BRICK_SLAB,
                HybridBlocksItems.MEDIUM_MIXED_MUD_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_MUD_BRICKS,
                HybridBlocksItems.MIXED_MUD_BRICK_STAIRS,
                HybridBlocksItems.MIXED_MUD_BRICK_SLAB,
                HybridBlocksItems.MIXED_MUD_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_BRICKS,
                HybridBlocksItems.MIXED_BRICK_STAIRS,
                HybridBlocksItems.MIXED_BRICK_SLAB,
                HybridBlocksItems.MIXED_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_NETHER_BRICKS,
                HybridBlocksItems.MIXED_NETHER_BRICK_STAIRS,
                HybridBlocksItems.MIXED_NETHER_BRICK_SLAB,
                HybridBlocksItems.MIXED_NETHER_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_RED_NETHER_BRICKS,
                HybridBlocksItems.MIXED_RED_NETHER_BRICK_STAIRS,
                HybridBlocksItems.MIXED_RED_NETHER_BRICK_SLAB,
                HybridBlocksItems.MIXED_RED_NETHER_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_BLACK_BRICKS,
                HybridBlocksItems.MIXED_BLACK_BRICK_STAIRS,
                HybridBlocksItems.MIXED_BLACK_BRICK_SLAB,
                HybridBlocksItems.MIXED_BLACK_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_BLUE_BRICKS,
                HybridBlocksItems.MIXED_BLUE_BRICK_STAIRS,
                HybridBlocksItems.MIXED_BLUE_BRICK_SLAB,
                HybridBlocksItems.MIXED_BLUE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_BROWN_BRICKS,
                HybridBlocksItems.MIXED_BROWN_BRICK_STAIRS,
                HybridBlocksItems.MIXED_BROWN_BRICK_SLAB,
                HybridBlocksItems.MIXED_BROWN_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_CYAN_BRICKS,
                HybridBlocksItems.MIXED_CYAN_BRICK_STAIRS,
                HybridBlocksItems.MIXED_CYAN_BRICK_SLAB,
                HybridBlocksItems.MIXED_CYAN_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_GRAY_BRICKS,
                HybridBlocksItems.MIXED_GRAY_BRICK_STAIRS,
                HybridBlocksItems.MIXED_GRAY_BRICK_SLAB,
                HybridBlocksItems.MIXED_GRAY_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_GREEN_BRICKS,
                HybridBlocksItems.MIXED_GREEN_BRICK_STAIRS,
                HybridBlocksItems.MIXED_GREEN_BRICK_SLAB,
                HybridBlocksItems.MIXED_GREEN_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_LIGHT_BLUE_BRICKS,
                HybridBlocksItems.MIXED_LIGHT_BLUE_BRICK_STAIRS,
                HybridBlocksItems.MIXED_LIGHT_BLUE_BRICK_SLAB,
                HybridBlocksItems.MIXED_LIGHT_BLUE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_LIGHT_GRAY_BRICKS,
                HybridBlocksItems.MIXED_LIGHT_GRAY_BRICK_STAIRS,
                HybridBlocksItems.MIXED_LIGHT_GRAY_BRICK_SLAB,
                HybridBlocksItems.MIXED_LIGHT_GRAY_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_LIME_BRICKS,
                HybridBlocksItems.MIXED_LIME_BRICK_STAIRS,
                HybridBlocksItems.MIXED_LIME_BRICK_SLAB,
                HybridBlocksItems.MIXED_LIME_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_MAGENTA_BRICKS,
                HybridBlocksItems.MIXED_MAGENTA_BRICK_STAIRS,
                HybridBlocksItems.MIXED_MAGENTA_BRICK_SLAB,
                HybridBlocksItems.MIXED_MAGENTA_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_ORANGE_BRICKS,
                HybridBlocksItems.MIXED_ORANGE_BRICK_STAIRS,
                HybridBlocksItems.MIXED_ORANGE_BRICK_SLAB,
                HybridBlocksItems.MIXED_ORANGE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_PINK_BRICKS,
                HybridBlocksItems.MIXED_PINK_BRICK_STAIRS,
                HybridBlocksItems.MIXED_PINK_BRICK_SLAB,
                HybridBlocksItems.MIXED_PINK_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_PURPLE_BRICKS,
                HybridBlocksItems.MIXED_PURPLE_BRICK_STAIRS,
                HybridBlocksItems.MIXED_PURPLE_BRICK_SLAB,
                HybridBlocksItems.MIXED_PURPLE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_RED_BRICKS,
                HybridBlocksItems.MIXED_RED_BRICK_STAIRS,
                HybridBlocksItems.MIXED_RED_BRICK_SLAB,
                HybridBlocksItems.MIXED_RED_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_WHITE_BRICKS,
                HybridBlocksItems.MIXED_WHITE_BRICK_STAIRS,
                HybridBlocksItems.MIXED_WHITE_BRICK_SLAB,
                HybridBlocksItems.MIXED_WHITE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_YELLOW_BRICKS,
                HybridBlocksItems.MIXED_YELLOW_BRICK_STAIRS,
                HybridBlocksItems.MIXED_YELLOW_BRICK_SLAB,
                HybridBlocksItems.MIXED_YELLOW_BRICK_WALL
            ),
            //#endregion

            //#region Small Bricks
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_MUD_BRICKS,
                HybridBlocksItems.SMALL_MUD_BRICK_STAIRS,
                HybridBlocksItems.SMALL_MUD_BRICK_SLAB,
                HybridBlocksItems.SMALL_MUD_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_BRICKS,
                HybridBlocksItems.SMALL_BRICK_STAIRS,
                HybridBlocksItems.SMALL_BRICK_SLAB,
                HybridBlocksItems.SMALL_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_NETHER_BRICKS,
                HybridBlocksItems.SMALL_NETHER_BRICK_STAIRS,
                HybridBlocksItems.SMALL_NETHER_BRICK_SLAB,
                HybridBlocksItems.SMALL_NETHER_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_RED_NETHER_BRICKS,
                HybridBlocksItems.SMALL_RED_NETHER_BRICK_STAIRS,
                HybridBlocksItems.SMALL_RED_NETHER_BRICK_SLAB,
                HybridBlocksItems.SMALL_RED_NETHER_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_BLACK_BRICKS,
                HybridBlocksItems.SMALL_BLACK_BRICK_STAIRS,
                HybridBlocksItems.SMALL_BLACK_BRICK_SLAB,
                HybridBlocksItems.SMALL_BLACK_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_BLUE_BRICKS,
                HybridBlocksItems.SMALL_BLUE_BRICK_STAIRS,
                HybridBlocksItems.SMALL_BLUE_BRICK_SLAB,
                HybridBlocksItems.SMALL_BLUE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_BROWN_BRICKS,
                HybridBlocksItems.SMALL_BROWN_BRICK_STAIRS,
                HybridBlocksItems.SMALL_BROWN_BRICK_SLAB,
                HybridBlocksItems.SMALL_BROWN_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_CYAN_BRICKS,
                HybridBlocksItems.SMALL_CYAN_BRICK_STAIRS,
                HybridBlocksItems.SMALL_CYAN_BRICK_SLAB,
                HybridBlocksItems.SMALL_CYAN_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_GRAY_BRICKS,
                HybridBlocksItems.SMALL_GRAY_BRICK_STAIRS,
                HybridBlocksItems.SMALL_GRAY_BRICK_SLAB,
                HybridBlocksItems.SMALL_GRAY_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_GREEN_BRICKS,
                HybridBlocksItems.SMALL_GREEN_BRICK_STAIRS,
                HybridBlocksItems.SMALL_GREEN_BRICK_SLAB,
                HybridBlocksItems.SMALL_GREEN_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_LIGHT_BLUE_BRICKS,
                HybridBlocksItems.SMALL_LIGHT_BLUE_BRICK_STAIRS,
                HybridBlocksItems.SMALL_LIGHT_BLUE_BRICK_SLAB,
                HybridBlocksItems.SMALL_LIGHT_BLUE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_LIGHT_GRAY_BRICKS,
                HybridBlocksItems.SMALL_LIGHT_GRAY_BRICK_STAIRS,
                HybridBlocksItems.SMALL_LIGHT_GRAY_BRICK_SLAB,
                HybridBlocksItems.SMALL_LIGHT_GRAY_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_LIME_BRICKS,
                HybridBlocksItems.SMALL_LIME_BRICK_STAIRS,
                HybridBlocksItems.SMALL_LIME_BRICK_SLAB,
                HybridBlocksItems.SMALL_LIME_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_MAGENTA_BRICKS,
                HybridBlocksItems.SMALL_MAGENTA_BRICK_STAIRS,
                HybridBlocksItems.SMALL_MAGENTA_BRICK_SLAB,
                HybridBlocksItems.SMALL_MAGENTA_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_ORANGE_BRICKS,
                HybridBlocksItems.SMALL_ORANGE_BRICK_STAIRS,
                HybridBlocksItems.SMALL_ORANGE_BRICK_SLAB,
                HybridBlocksItems.SMALL_ORANGE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_PINK_BRICKS,
                HybridBlocksItems.SMALL_PINK_BRICK_STAIRS,
                HybridBlocksItems.SMALL_PINK_BRICK_SLAB,
                HybridBlocksItems.SMALL_PINK_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_PURPLE_BRICKS,
                HybridBlocksItems.SMALL_PURPLE_BRICK_STAIRS,
                HybridBlocksItems.SMALL_PURPLE_BRICK_SLAB,
                HybridBlocksItems.SMALL_PURPLE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_RED_BRICKS,
                HybridBlocksItems.SMALL_RED_BRICK_STAIRS,
                HybridBlocksItems.SMALL_RED_BRICK_SLAB,
                HybridBlocksItems.SMALL_RED_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_WHITE_BRICKS,
                HybridBlocksItems.SMALL_WHITE_BRICK_STAIRS,
                HybridBlocksItems.SMALL_WHITE_BRICK_SLAB,
                HybridBlocksItems.SMALL_WHITE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_YELLOW_BRICKS,
                HybridBlocksItems.SMALL_YELLOW_BRICK_STAIRS,
                HybridBlocksItems.SMALL_YELLOW_BRICK_SLAB,
                HybridBlocksItems.SMALL_YELLOW_BRICK_WALL
            ),
            //#endregion

            //#region Small Mixed Bricks
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_MIXED_MUD_BRICKS,
                HybridBlocksItems.SMALL_MIXED_MUD_BRICK_STAIRS,
                HybridBlocksItems.SMALL_MIXED_MUD_BRICK_SLAB,
                HybridBlocksItems.SMALL_MIXED_MUD_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_MIXED_BRICKS,
                HybridBlocksItems.SMALL_MIXED_BRICK_STAIRS,
                HybridBlocksItems.SMALL_MIXED_BRICK_SLAB,
                HybridBlocksItems.SMALL_MIXED_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_MIXED_NETHER_BRICKS,
                HybridBlocksItems.SMALL_MIXED_NETHER_BRICK_STAIRS,
                HybridBlocksItems.SMALL_MIXED_NETHER_BRICK_SLAB,
                HybridBlocksItems.SMALL_MIXED_NETHER_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_MIXED_RED_NETHER_BRICKS,
                HybridBlocksItems.SMALL_MIXED_RED_NETHER_BRICK_STAIRS,
                HybridBlocksItems.SMALL_MIXED_RED_NETHER_BRICK_SLAB,
                HybridBlocksItems.SMALL_MIXED_RED_NETHER_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_MIXED_BLACK_BRICKS,
                HybridBlocksItems.SMALL_MIXED_BLACK_BRICK_STAIRS,
                HybridBlocksItems.SMALL_MIXED_BLACK_BRICK_SLAB,
                HybridBlocksItems.SMALL_MIXED_BLACK_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_MIXED_BLUE_BRICKS,
                HybridBlocksItems.SMALL_MIXED_BLUE_BRICK_STAIRS,
                HybridBlocksItems.SMALL_MIXED_BLUE_BRICK_SLAB,
                HybridBlocksItems.SMALL_MIXED_BLUE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_MIXED_BROWN_BRICKS,
                HybridBlocksItems.SMALL_MIXED_BROWN_BRICK_STAIRS,
                HybridBlocksItems.SMALL_MIXED_BROWN_BRICK_SLAB,
                HybridBlocksItems.SMALL_MIXED_BROWN_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_MIXED_CYAN_BRICKS,
                HybridBlocksItems.SMALL_MIXED_CYAN_BRICK_STAIRS,
                HybridBlocksItems.SMALL_MIXED_CYAN_BRICK_SLAB,
                HybridBlocksItems.SMALL_MIXED_CYAN_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_MIXED_GRAY_BRICKS,
                HybridBlocksItems.SMALL_MIXED_GRAY_BRICK_STAIRS,
                HybridBlocksItems.SMALL_MIXED_GRAY_BRICK_SLAB,
                HybridBlocksItems.SMALL_MIXED_GRAY_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_MIXED_GREEN_BRICKS,
                HybridBlocksItems.SMALL_MIXED_GREEN_BRICK_STAIRS,
                HybridBlocksItems.SMALL_MIXED_GREEN_BRICK_SLAB,
                HybridBlocksItems.SMALL_MIXED_GREEN_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_MIXED_LIGHT_BLUE_BRICKS,
                HybridBlocksItems.SMALL_MIXED_LIGHT_BLUE_BRICK_STAIRS,
                HybridBlocksItems.SMALL_MIXED_LIGHT_BLUE_BRICK_SLAB,
                HybridBlocksItems.SMALL_MIXED_LIGHT_BLUE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_MIXED_LIGHT_GRAY_BRICKS,
                HybridBlocksItems.SMALL_MIXED_LIGHT_GRAY_BRICK_STAIRS,
                HybridBlocksItems.SMALL_MIXED_LIGHT_GRAY_BRICK_SLAB,
                HybridBlocksItems.SMALL_MIXED_LIGHT_GRAY_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_MIXED_LIME_BRICKS,
                HybridBlocksItems.SMALL_MIXED_LIME_BRICK_STAIRS,
                HybridBlocksItems.SMALL_MIXED_LIME_BRICK_SLAB,
                HybridBlocksItems.SMALL_MIXED_LIME_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_MIXED_MAGENTA_BRICKS,
                HybridBlocksItems.SMALL_MIXED_MAGENTA_BRICK_STAIRS,
                HybridBlocksItems.SMALL_MIXED_MAGENTA_BRICK_SLAB,
                HybridBlocksItems.SMALL_MIXED_MAGENTA_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_MIXED_ORANGE_BRICKS,
                HybridBlocksItems.SMALL_MIXED_ORANGE_BRICK_STAIRS,
                HybridBlocksItems.SMALL_MIXED_ORANGE_BRICK_SLAB,
                HybridBlocksItems.SMALL_MIXED_ORANGE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_MIXED_PINK_BRICKS,
                HybridBlocksItems.SMALL_MIXED_PINK_BRICK_STAIRS,
                HybridBlocksItems.SMALL_MIXED_PINK_BRICK_SLAB,
                HybridBlocksItems.SMALL_MIXED_PINK_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_MIXED_PURPLE_BRICKS,
                HybridBlocksItems.SMALL_MIXED_PURPLE_BRICK_STAIRS,
                HybridBlocksItems.SMALL_MIXED_PURPLE_BRICK_SLAB,
                HybridBlocksItems.SMALL_MIXED_PURPLE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_MIXED_RED_BRICKS,
                HybridBlocksItems.SMALL_MIXED_RED_BRICK_STAIRS,
                HybridBlocksItems.SMALL_MIXED_RED_BRICK_SLAB,
                HybridBlocksItems.SMALL_MIXED_RED_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_MIXED_WHITE_BRICKS,
                HybridBlocksItems.SMALL_MIXED_WHITE_BRICK_STAIRS,
                HybridBlocksItems.SMALL_MIXED_WHITE_BRICK_SLAB,
                HybridBlocksItems.SMALL_MIXED_WHITE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SMALL_MIXED_YELLOW_BRICKS,
                HybridBlocksItems.SMALL_MIXED_YELLOW_BRICK_STAIRS,
                HybridBlocksItems.SMALL_MIXED_YELLOW_BRICK_SLAB,
                HybridBlocksItems.SMALL_MIXED_YELLOW_BRICK_WALL
            ),
            //#endregion

            //#region Large Bricks
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_MUD_BRICKS,
                HybridBlocksItems.LARGE_MUD_BRICK_STAIRS,
                HybridBlocksItems.LARGE_MUD_BRICK_SLAB,
                HybridBlocksItems.LARGE_MUD_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_BRICKS,
                HybridBlocksItems.LARGE_BRICK_STAIRS,
                HybridBlocksItems.LARGE_BRICK_SLAB,
                HybridBlocksItems.LARGE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_NETHER_BRICKS,
                HybridBlocksItems.LARGE_NETHER_BRICK_STAIRS,
                HybridBlocksItems.LARGE_NETHER_BRICK_SLAB,
                HybridBlocksItems.LARGE_NETHER_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_RED_NETHER_BRICKS,
                HybridBlocksItems.LARGE_RED_NETHER_BRICK_STAIRS,
                HybridBlocksItems.LARGE_RED_NETHER_BRICK_SLAB,
                HybridBlocksItems.LARGE_RED_NETHER_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_BLACK_BRICKS,
                HybridBlocksItems.LARGE_BLACK_BRICK_STAIRS,
                HybridBlocksItems.LARGE_BLACK_BRICK_SLAB,
                HybridBlocksItems.LARGE_BLACK_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_BLUE_BRICKS,
                HybridBlocksItems.LARGE_BLUE_BRICK_STAIRS,
                HybridBlocksItems.LARGE_BLUE_BRICK_SLAB,
                HybridBlocksItems.LARGE_BLUE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_BROWN_BRICKS,
                HybridBlocksItems.LARGE_BROWN_BRICK_STAIRS,
                HybridBlocksItems.LARGE_BROWN_BRICK_SLAB,
                HybridBlocksItems.LARGE_BROWN_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_CYAN_BRICKS,
                HybridBlocksItems.LARGE_CYAN_BRICK_STAIRS,
                HybridBlocksItems.LARGE_CYAN_BRICK_SLAB,
                HybridBlocksItems.LARGE_CYAN_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_GRAY_BRICKS,
                HybridBlocksItems.LARGE_GRAY_BRICK_STAIRS,
                HybridBlocksItems.LARGE_GRAY_BRICK_SLAB,
                HybridBlocksItems.LARGE_GRAY_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_GREEN_BRICKS,
                HybridBlocksItems.LARGE_GREEN_BRICK_STAIRS,
                HybridBlocksItems.LARGE_GREEN_BRICK_SLAB,
                HybridBlocksItems.LARGE_GREEN_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_LIGHT_BLUE_BRICKS,
                HybridBlocksItems.LARGE_LIGHT_BLUE_BRICK_STAIRS,
                HybridBlocksItems.LARGE_LIGHT_BLUE_BRICK_SLAB,
                HybridBlocksItems.LARGE_LIGHT_BLUE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_LIGHT_GRAY_BRICKS,
                HybridBlocksItems.LARGE_LIGHT_GRAY_BRICK_STAIRS,
                HybridBlocksItems.LARGE_LIGHT_GRAY_BRICK_SLAB,
                HybridBlocksItems.LARGE_LIGHT_GRAY_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_LIME_BRICKS,
                HybridBlocksItems.LARGE_LIME_BRICK_STAIRS,
                HybridBlocksItems.LARGE_LIME_BRICK_SLAB,
                HybridBlocksItems.LARGE_LIME_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_MAGENTA_BRICKS,
                HybridBlocksItems.LARGE_MAGENTA_BRICK_STAIRS,
                HybridBlocksItems.LARGE_MAGENTA_BRICK_SLAB,
                HybridBlocksItems.LARGE_MAGENTA_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_ORANGE_BRICKS,
                HybridBlocksItems.LARGE_ORANGE_BRICK_STAIRS,
                HybridBlocksItems.LARGE_ORANGE_BRICK_SLAB,
                HybridBlocksItems.LARGE_ORANGE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_PINK_BRICKS,
                HybridBlocksItems.LARGE_PINK_BRICK_STAIRS,
                HybridBlocksItems.LARGE_PINK_BRICK_SLAB,
                HybridBlocksItems.LARGE_PINK_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_PURPLE_BRICKS,
                HybridBlocksItems.LARGE_PURPLE_BRICK_STAIRS,
                HybridBlocksItems.LARGE_PURPLE_BRICK_SLAB,
                HybridBlocksItems.LARGE_PURPLE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_RED_BRICKS,
                HybridBlocksItems.LARGE_RED_BRICK_STAIRS,
                HybridBlocksItems.LARGE_RED_BRICK_SLAB,
                HybridBlocksItems.LARGE_RED_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_WHITE_BRICKS,
                HybridBlocksItems.LARGE_WHITE_BRICK_STAIRS,
                HybridBlocksItems.LARGE_WHITE_BRICK_SLAB,
                HybridBlocksItems.LARGE_WHITE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_YELLOW_BRICKS,
                HybridBlocksItems.LARGE_YELLOW_BRICK_STAIRS,
                HybridBlocksItems.LARGE_YELLOW_BRICK_SLAB,
                HybridBlocksItems.LARGE_YELLOW_BRICK_WALL
            ),
            //#endregion

            //#region Large Mixed Bricks
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_MIXED_MUD_BRICKS,
                HybridBlocksItems.LARGE_MIXED_MUD_BRICK_STAIRS,
                HybridBlocksItems.LARGE_MIXED_MUD_BRICK_SLAB,
                HybridBlocksItems.LARGE_MIXED_MUD_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_MIXED_BRICKS,
                HybridBlocksItems.LARGE_MIXED_BRICK_STAIRS,
                HybridBlocksItems.LARGE_MIXED_BRICK_SLAB,
                HybridBlocksItems.LARGE_MIXED_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_MIXED_NETHER_BRICKS,
                HybridBlocksItems.LARGE_MIXED_NETHER_BRICK_STAIRS,
                HybridBlocksItems.LARGE_MIXED_NETHER_BRICK_SLAB,
                HybridBlocksItems.LARGE_MIXED_NETHER_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_MIXED_RED_NETHER_BRICKS,
                HybridBlocksItems.LARGE_MIXED_RED_NETHER_BRICK_STAIRS,
                HybridBlocksItems.LARGE_MIXED_RED_NETHER_BRICK_SLAB,
                HybridBlocksItems.LARGE_MIXED_RED_NETHER_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_MIXED_BLACK_BRICKS,
                HybridBlocksItems.LARGE_MIXED_BLACK_BRICK_STAIRS,
                HybridBlocksItems.LARGE_MIXED_BLACK_BRICK_SLAB,
                HybridBlocksItems.LARGE_MIXED_BLACK_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_MIXED_BLUE_BRICKS,
                HybridBlocksItems.LARGE_MIXED_BLUE_BRICK_STAIRS,
                HybridBlocksItems.LARGE_MIXED_BLUE_BRICK_SLAB,
                HybridBlocksItems.LARGE_MIXED_BLUE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_MIXED_BROWN_BRICKS,
                HybridBlocksItems.LARGE_MIXED_BROWN_BRICK_STAIRS,
                HybridBlocksItems.LARGE_MIXED_BROWN_BRICK_SLAB,
                HybridBlocksItems.LARGE_MIXED_BROWN_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_MIXED_CYAN_BRICKS,
                HybridBlocksItems.LARGE_MIXED_CYAN_BRICK_STAIRS,
                HybridBlocksItems.LARGE_MIXED_CYAN_BRICK_SLAB,
                HybridBlocksItems.LARGE_MIXED_CYAN_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_MIXED_GRAY_BRICKS,
                HybridBlocksItems.LARGE_MIXED_GRAY_BRICK_STAIRS,
                HybridBlocksItems.LARGE_MIXED_GRAY_BRICK_SLAB,
                HybridBlocksItems.LARGE_MIXED_GRAY_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_MIXED_GREEN_BRICKS,
                HybridBlocksItems.LARGE_MIXED_GREEN_BRICK_STAIRS,
                HybridBlocksItems.LARGE_MIXED_GREEN_BRICK_SLAB,
                HybridBlocksItems.LARGE_MIXED_GREEN_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_MIXED_LIGHT_BLUE_BRICKS,
                HybridBlocksItems.LARGE_MIXED_LIGHT_BLUE_BRICK_STAIRS,
                HybridBlocksItems.LARGE_MIXED_LIGHT_BLUE_BRICK_SLAB,
                HybridBlocksItems.LARGE_MIXED_LIGHT_BLUE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_MIXED_LIGHT_GRAY_BRICKS,
                HybridBlocksItems.LARGE_MIXED_LIGHT_GRAY_BRICK_STAIRS,
                HybridBlocksItems.LARGE_MIXED_LIGHT_GRAY_BRICK_SLAB,
                HybridBlocksItems.LARGE_MIXED_LIGHT_GRAY_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_MIXED_LIME_BRICKS,
                HybridBlocksItems.LARGE_MIXED_LIME_BRICK_STAIRS,
                HybridBlocksItems.LARGE_MIXED_LIME_BRICK_SLAB,
                HybridBlocksItems.LARGE_MIXED_LIME_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_MIXED_MAGENTA_BRICKS,
                HybridBlocksItems.LARGE_MIXED_MAGENTA_BRICK_STAIRS,
                HybridBlocksItems.LARGE_MIXED_MAGENTA_BRICK_SLAB,
                HybridBlocksItems.LARGE_MIXED_MAGENTA_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_MIXED_ORANGE_BRICKS,
                HybridBlocksItems.LARGE_MIXED_ORANGE_BRICK_STAIRS,
                HybridBlocksItems.LARGE_MIXED_ORANGE_BRICK_SLAB,
                HybridBlocksItems.LARGE_MIXED_ORANGE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_MIXED_PINK_BRICKS,
                HybridBlocksItems.LARGE_MIXED_PINK_BRICK_STAIRS,
                HybridBlocksItems.LARGE_MIXED_PINK_BRICK_SLAB,
                HybridBlocksItems.LARGE_MIXED_PINK_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_MIXED_PURPLE_BRICKS,
                HybridBlocksItems.LARGE_MIXED_PURPLE_BRICK_STAIRS,
                HybridBlocksItems.LARGE_MIXED_PURPLE_BRICK_SLAB,
                HybridBlocksItems.LARGE_MIXED_PURPLE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_MIXED_RED_BRICKS,
                HybridBlocksItems.LARGE_MIXED_RED_BRICK_STAIRS,
                HybridBlocksItems.LARGE_MIXED_RED_BRICK_SLAB,
                HybridBlocksItems.LARGE_MIXED_RED_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_MIXED_WHITE_BRICKS,
                HybridBlocksItems.LARGE_MIXED_WHITE_BRICK_STAIRS,
                HybridBlocksItems.LARGE_MIXED_WHITE_BRICK_SLAB,
                HybridBlocksItems.LARGE_MIXED_WHITE_BRICK_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LARGE_MIXED_YELLOW_BRICKS,
                HybridBlocksItems.LARGE_MIXED_YELLOW_BRICK_STAIRS,
                HybridBlocksItems.LARGE_MIXED_YELLOW_BRICK_SLAB,
                HybridBlocksItems.LARGE_MIXED_YELLOW_BRICK_WALL
            ),
            //#endregion

            //#region Shingles
            BrickAndShingleRecipeSets(
                HybridBlocksItems.SHINGLES,
                HybridBlocksItems.SHINGLE_STAIRS,
                HybridBlocksItems.SHINGLE_SLAB,
                HybridBlocksItems.SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MUD_SHINGLES,
                HybridBlocksItems.MUD_SHINGLE_STAIRS,
                HybridBlocksItems.MUD_SHINGLE_SLAB,
                HybridBlocksItems.MUD_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.NETHER_SHINGLES,
                HybridBlocksItems.NETHER_SHINGLE_STAIRS,
                HybridBlocksItems.NETHER_SHINGLE_SLAB,
                HybridBlocksItems.NETHER_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.RED_NETHER_SHINGLES,
                HybridBlocksItems.RED_NETHER_SHINGLE_STAIRS,
                HybridBlocksItems.RED_NETHER_SHINGLE_SLAB,
                HybridBlocksItems.RED_NETHER_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.BLACK_SHINGLES,
                HybridBlocksItems.BLACK_SHINGLE_STAIRS,
                HybridBlocksItems.BLACK_SHINGLE_SLAB,
                HybridBlocksItems.BLACK_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.BLUE_SHINGLES,
                HybridBlocksItems.BLUE_SHINGLE_STAIRS,
                HybridBlocksItems.BLUE_SHINGLE_SLAB,
                HybridBlocksItems.BLUE_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.BROWN_SHINGLES,
                HybridBlocksItems.BROWN_SHINGLE_STAIRS,
                HybridBlocksItems.BROWN_SHINGLE_SLAB,
                HybridBlocksItems.BROWN_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.CYAN_SHINGLES,
                HybridBlocksItems.CYAN_SHINGLE_STAIRS,
                HybridBlocksItems.CYAN_SHINGLE_SLAB,
                HybridBlocksItems.CYAN_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.GRAY_SHINGLES,
                HybridBlocksItems.GRAY_SHINGLE_STAIRS,
                HybridBlocksItems.GRAY_SHINGLE_SLAB,
                HybridBlocksItems.GRAY_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.GREEN_SHINGLES,
                HybridBlocksItems.GREEN_SHINGLE_STAIRS,
                HybridBlocksItems.GREEN_SHINGLE_SLAB,
                HybridBlocksItems.GREEN_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LIGHT_BLUE_SHINGLES,
                HybridBlocksItems.LIGHT_BLUE_SHINGLE_STAIRS,
                HybridBlocksItems.LIGHT_BLUE_SHINGLE_SLAB,
                HybridBlocksItems.LIGHT_BLUE_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LIGHT_GRAY_SHINGLES,
                HybridBlocksItems.LIGHT_GRAY_SHINGLE_STAIRS,
                HybridBlocksItems.LIGHT_GRAY_SHINGLE_SLAB,
                HybridBlocksItems.LIGHT_GRAY_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.LIME_SHINGLES,
                HybridBlocksItems.LIME_SHINGLE_STAIRS,
                HybridBlocksItems.LIME_SHINGLE_SLAB,
                HybridBlocksItems.LIME_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MAGENTA_SHINGLES,
                HybridBlocksItems.MAGENTA_SHINGLE_STAIRS,
                HybridBlocksItems.MAGENTA_SHINGLE_SLAB,
                HybridBlocksItems.MAGENTA_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.ORANGE_SHINGLES,
                HybridBlocksItems.ORANGE_SHINGLE_STAIRS,
                HybridBlocksItems.ORANGE_SHINGLE_SLAB,
                HybridBlocksItems.ORANGE_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.PINK_SHINGLES,
                HybridBlocksItems.PINK_SHINGLE_STAIRS,
                HybridBlocksItems.PINK_SHINGLE_SLAB,
                HybridBlocksItems.PINK_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.PURPLE_SHINGLES,
                HybridBlocksItems.PURPLE_SHINGLE_STAIRS,
                HybridBlocksItems.PURPLE_SHINGLE_SLAB,
                HybridBlocksItems.PURPLE_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.RED_SHINGLES,
                HybridBlocksItems.RED_SHINGLE_STAIRS,
                HybridBlocksItems.RED_SHINGLE_SLAB,
                HybridBlocksItems.RED_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.WHITE_SHINGLES,
                HybridBlocksItems.WHITE_SHINGLE_STAIRS,
                HybridBlocksItems.WHITE_SHINGLE_SLAB,
                HybridBlocksItems.WHITE_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.YELLOW_SHINGLES,
                HybridBlocksItems.YELLOW_SHINGLE_STAIRS,
                HybridBlocksItems.YELLOW_SHINGLE_SLAB,
                HybridBlocksItems.YELLOW_SHINGLE_WALL
            ),
            //#endregion

            //#region Mixed Shingles
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_MUD_SHINGLES,
                HybridBlocksItems.MIXED_MUD_SHINGLE_STAIRS,
                HybridBlocksItems.MIXED_MUD_SHINGLE_SLAB,
                HybridBlocksItems.MIXED_MUD_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_SHINGLES,
                HybridBlocksItems.MIXED_SHINGLE_STAIRS,
                HybridBlocksItems.MIXED_SHINGLE_SLAB,
                HybridBlocksItems.MIXED_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_NETHER_SHINGLES,
                HybridBlocksItems.MIXED_NETHER_SHINGLE_STAIRS,
                HybridBlocksItems.MIXED_NETHER_SHINGLE_SLAB,
                HybridBlocksItems.MIXED_NETHER_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_RED_NETHER_SHINGLES,
                HybridBlocksItems.MIXED_RED_NETHER_SHINGLE_STAIRS,
                HybridBlocksItems.MIXED_RED_NETHER_SHINGLE_SLAB,
                HybridBlocksItems.MIXED_RED_NETHER_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_BLACK_SHINGLES,
                HybridBlocksItems.MIXED_BLACK_SHINGLE_STAIRS,
                HybridBlocksItems.MIXED_BLACK_SHINGLE_SLAB,
                HybridBlocksItems.MIXED_BLACK_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_BLUE_SHINGLES,
                HybridBlocksItems.MIXED_BLUE_SHINGLE_STAIRS,
                HybridBlocksItems.MIXED_BLUE_SHINGLE_SLAB,
                HybridBlocksItems.MIXED_BLUE_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_BROWN_SHINGLES,
                HybridBlocksItems.MIXED_BROWN_SHINGLE_STAIRS,
                HybridBlocksItems.MIXED_BROWN_SHINGLE_SLAB,
                HybridBlocksItems.MIXED_BROWN_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_CYAN_SHINGLES,
                HybridBlocksItems.MIXED_CYAN_SHINGLE_STAIRS,
                HybridBlocksItems.MIXED_CYAN_SHINGLE_SLAB,
                HybridBlocksItems.MIXED_CYAN_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_GRAY_SHINGLES,
                HybridBlocksItems.MIXED_GRAY_SHINGLE_STAIRS,
                HybridBlocksItems.MIXED_GRAY_SHINGLE_SLAB,
                HybridBlocksItems.MIXED_GRAY_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_GREEN_SHINGLES,
                HybridBlocksItems.MIXED_GREEN_SHINGLE_STAIRS,
                HybridBlocksItems.MIXED_GREEN_SHINGLE_SLAB,
                HybridBlocksItems.MIXED_GREEN_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_LIGHT_BLUE_SHINGLES,
                HybridBlocksItems.MIXED_LIGHT_BLUE_SHINGLE_STAIRS,
                HybridBlocksItems.MIXED_LIGHT_BLUE_SHINGLE_SLAB,
                HybridBlocksItems.MIXED_LIGHT_BLUE_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_LIGHT_GRAY_SHINGLES,
                HybridBlocksItems.MIXED_LIGHT_GRAY_SHINGLE_STAIRS,
                HybridBlocksItems.MIXED_LIGHT_GRAY_SHINGLE_SLAB,
                HybridBlocksItems.MIXED_LIGHT_GRAY_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_LIME_SHINGLES,
                HybridBlocksItems.MIXED_LIME_SHINGLE_STAIRS,
                HybridBlocksItems.MIXED_LIME_SHINGLE_SLAB,
                HybridBlocksItems.MIXED_LIME_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_MAGENTA_SHINGLES,
                HybridBlocksItems.MIXED_MAGENTA_SHINGLE_STAIRS,
                HybridBlocksItems.MIXED_MAGENTA_SHINGLE_SLAB,
                HybridBlocksItems.MIXED_MAGENTA_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_ORANGE_SHINGLES,
                HybridBlocksItems.MIXED_ORANGE_SHINGLE_STAIRS,
                HybridBlocksItems.MIXED_ORANGE_SHINGLE_SLAB,
                HybridBlocksItems.MIXED_ORANGE_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_PINK_SHINGLES,
                HybridBlocksItems.MIXED_PINK_SHINGLE_STAIRS,
                HybridBlocksItems.MIXED_PINK_SHINGLE_SLAB,
                HybridBlocksItems.MIXED_PINK_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_PURPLE_SHINGLES,
                HybridBlocksItems.MIXED_PURPLE_SHINGLE_STAIRS,
                HybridBlocksItems.MIXED_PURPLE_SHINGLE_SLAB,
                HybridBlocksItems.MIXED_PURPLE_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_RED_SHINGLES,
                HybridBlocksItems.MIXED_RED_SHINGLE_STAIRS,
                HybridBlocksItems.MIXED_RED_SHINGLE_SLAB,
                HybridBlocksItems.MIXED_RED_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_WHITE_SHINGLES,
                HybridBlocksItems.MIXED_WHITE_SHINGLE_STAIRS,
                HybridBlocksItems.MIXED_WHITE_SHINGLE_SLAB,
                HybridBlocksItems.MIXED_WHITE_SHINGLE_WALL
            ),
            BrickAndShingleRecipeSets(
                HybridBlocksItems.MIXED_YELLOW_SHINGLES,
                HybridBlocksItems.MIXED_YELLOW_SHINGLE_STAIRS,
                HybridBlocksItems.MIXED_YELLOW_SHINGLE_SLAB,
                HybridBlocksItems.MIXED_YELLOW_SHINGLE_WALL
            )
        )
        //#endregion

        private fun offerBrickAndShingleRecipes(exporter: RecipeOutput) {
            BRICK_AND_SHINGLE_SETS.forEach { set ->
                val base = set.base.get()
                val stairBuilders = set.stairBuilders.get()
                val slabs = set.slabs.get()
                val walls = set.walls.get()

                stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, stairBuilders, base)
                stairBuilder(exporter, stairBuilders, base)

                stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, slabs, base, 2)
                slab(exporter, RecipeCategory.BUILDING_BLOCKS, slabs, base)

                stonecutterResultFromBase(exporter, RecipeCategory.DECORATIONS, walls, base)
                wall(exporter, RecipeCategory.DECORATIONS, walls, base)
            }
        }
        //#endregion

        private fun stairBuilder(
            finishedRecipeConsumer: RecipeOutput,
            stairBuilders: ItemLike,
            material: ItemLike,
        ) {
            stairBuilder(stairBuilders, Ingredient.of(material))
                .unlockedBy(getHasName(material), has(material))
                .save(finishedRecipeConsumer)
        }

        private fun offerChimneyRecipe(
            exporter: RecipeOutput,
            base: Item,
            unlockedBy: String,
            output: Item,
        ) {
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .define(Character.valueOf('#'), base)

                .pattern("# #")
                .pattern("   ")
                .pattern("   ")

                .group("chimney")
                .unlockedBy(unlockedBy, InventoryChangeTrigger.TriggerInstance.hasItems(base))

                .save(exporter)
        }

        private fun offerQuartzTilesRecipe(
            exporter: RecipeOutput,
            base: Item,
            unlockedBy: String,
            output: Item,
        ) {
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4)
                .define(Character.valueOf('#'), base)
                .define(Character.valueOf('X'), Items.QUARTZ_BLOCK)

                .pattern("#X ")
                .pattern("X# ")
                .pattern("   ")

                .group("quartz_tiles")
                .unlockedBy(unlockedBy, InventoryChangeTrigger.TriggerInstance.hasItems(base))

                .save(exporter)
        }

        private fun offerDyeingRecipe(
            exporter: RecipeOutput,
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
            exporter: RecipeOutput,
            base: Item,
            unlockedBy: String,
            group: String,
            output: Item,
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
            exporter: RecipeOutput,
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
            exporter: RecipeOutput,
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
            exporter: RecipeOutput,
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
            exporter: RecipeOutput,
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
            exporter: RecipeOutput,
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
            exporter: RecipeOutput,
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
            exporter: RecipeOutput,
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
            exporter: RecipeOutput,
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
            exporter: RecipeOutput,
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
            exporter: RecipeOutput,
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

        //#region Quartz Sets
        /**
         * Every block variant a single quartz colour ships with.
         */
        private data class QuartzRecipeSet(
            val block: RegistryObject<BlockItem>,
            val stairs: RegistryObject<BlockItem>,
            val slab: RegistryObject<BlockItem>,
            val smooth: RegistryObject<BlockItem>,
            val smoothStairs: RegistryObject<BlockItem>,
            val smoothSlab: RegistryObject<BlockItem>,
            val bricks: RegistryObject<BlockItem>,
            val brickStairs: RegistryObject<BlockItem>,
            val brickSlab: RegistryObject<BlockItem>,
            val pillar: RegistryObject<BlockItem>,
            val chiseled: RegistryObject<BlockItem>,
            val tiles: RegistryObject<BlockItem>,
            val tileStairs: RegistryObject<BlockItem>,
            val tileSlab: RegistryObject<BlockItem>,
        )

        private val WHITE_QUARTZ_SET = QuartzRecipeSet(
            HybridBlocksItems.WHITE_QUARTZ_BLOCK,
            HybridBlocksItems.WHITE_QUARTZ_STAIRS,
            HybridBlocksItems.WHITE_QUARTZ_SLAB,
            HybridBlocksItems.SMOOTH_WHITE_QUARTZ,
            HybridBlocksItems.SMOOTH_WHITE_QUARTZ_STAIRS,
            HybridBlocksItems.SMOOTH_WHITE_QUARTZ_SLAB,
            HybridBlocksItems.WHITE_QUARTZ_BRICKS,
            HybridBlocksItems.WHITE_QUARTZ_BRICK_STAIRS,
            HybridBlocksItems.WHITE_QUARTZ_BRICK_SLAB,
            HybridBlocksItems.WHITE_QUARTZ_PILLAR,
            HybridBlocksItems.CHISELED_WHITE_QUARTZ_BLOCK,
            HybridBlocksItems.WHITE_QUARTZ_TILES,
            HybridBlocksItems.WHITE_QUARTZ_TILE_STAIRS,
            HybridBlocksItems.WHITE_QUARTZ_TILE_SLAB,
        )

        private val ORANGE_QUARTZ_SET = QuartzRecipeSet(
            HybridBlocksItems.ORANGE_QUARTZ_BLOCK,
            HybridBlocksItems.ORANGE_QUARTZ_STAIRS,
            HybridBlocksItems.ORANGE_QUARTZ_SLAB,
            HybridBlocksItems.SMOOTH_ORANGE_QUARTZ,
            HybridBlocksItems.SMOOTH_ORANGE_QUARTZ_STAIRS,
            HybridBlocksItems.SMOOTH_ORANGE_QUARTZ_SLAB,
            HybridBlocksItems.ORANGE_QUARTZ_BRICKS,
            HybridBlocksItems.ORANGE_QUARTZ_BRICK_STAIRS,
            HybridBlocksItems.ORANGE_QUARTZ_BRICK_SLAB,
            HybridBlocksItems.ORANGE_QUARTZ_PILLAR,
            HybridBlocksItems.CHISELED_ORANGE_QUARTZ_BLOCK,
            HybridBlocksItems.ORANGE_QUARTZ_TILES,
            HybridBlocksItems.ORANGE_QUARTZ_TILE_STAIRS,
            HybridBlocksItems.ORANGE_QUARTZ_TILE_SLAB,
        )

        private val MAGENTA_QUARTZ_SET = QuartzRecipeSet(
            HybridBlocksItems.MAGENTA_QUARTZ_BLOCK,
            HybridBlocksItems.MAGENTA_QUARTZ_STAIRS,
            HybridBlocksItems.MAGENTA_QUARTZ_SLAB,
            HybridBlocksItems.SMOOTH_MAGENTA_QUARTZ,
            HybridBlocksItems.SMOOTH_MAGENTA_QUARTZ_STAIRS,
            HybridBlocksItems.SMOOTH_MAGENTA_QUARTZ_SLAB,
            HybridBlocksItems.MAGENTA_QUARTZ_BRICKS,
            HybridBlocksItems.MAGENTA_QUARTZ_BRICK_STAIRS,
            HybridBlocksItems.MAGENTA_QUARTZ_BRICK_SLAB,
            HybridBlocksItems.MAGENTA_QUARTZ_PILLAR,
            HybridBlocksItems.CHISELED_MAGENTA_QUARTZ_BLOCK,
            HybridBlocksItems.MAGENTA_QUARTZ_TILES,
            HybridBlocksItems.MAGENTA_QUARTZ_TILE_STAIRS,
            HybridBlocksItems.MAGENTA_QUARTZ_TILE_SLAB,
        )

        private val LIGHT_BLUE_QUARTZ_SET = QuartzRecipeSet(
            HybridBlocksItems.LIGHT_BLUE_QUARTZ_BLOCK,
            HybridBlocksItems.LIGHT_BLUE_QUARTZ_STAIRS,
            HybridBlocksItems.LIGHT_BLUE_QUARTZ_SLAB,
            HybridBlocksItems.SMOOTH_LIGHT_BLUE_QUARTZ,
            HybridBlocksItems.SMOOTH_LIGHT_BLUE_QUARTZ_STAIRS,
            HybridBlocksItems.SMOOTH_LIGHT_BLUE_QUARTZ_SLAB,
            HybridBlocksItems.LIGHT_BLUE_QUARTZ_BRICKS,
            HybridBlocksItems.LIGHT_BLUE_QUARTZ_BRICK_STAIRS,
            HybridBlocksItems.LIGHT_BLUE_QUARTZ_BRICK_SLAB,
            HybridBlocksItems.LIGHT_BLUE_QUARTZ_PILLAR,
            HybridBlocksItems.CHISELED_LIGHT_BLUE_QUARTZ_BLOCK,
            HybridBlocksItems.LIGHT_BLUE_QUARTZ_TILES,
            HybridBlocksItems.LIGHT_BLUE_QUARTZ_TILE_STAIRS,
            HybridBlocksItems.LIGHT_BLUE_QUARTZ_TILE_SLAB,
        )

        private val YELLOW_QUARTZ_SET = QuartzRecipeSet(
            HybridBlocksItems.YELLOW_QUARTZ_BLOCK,
            HybridBlocksItems.YELLOW_QUARTZ_STAIRS,
            HybridBlocksItems.YELLOW_QUARTZ_SLAB,
            HybridBlocksItems.SMOOTH_YELLOW_QUARTZ,
            HybridBlocksItems.SMOOTH_YELLOW_QUARTZ_STAIRS,
            HybridBlocksItems.SMOOTH_YELLOW_QUARTZ_SLAB,
            HybridBlocksItems.YELLOW_QUARTZ_BRICKS,
            HybridBlocksItems.YELLOW_QUARTZ_BRICK_STAIRS,
            HybridBlocksItems.YELLOW_QUARTZ_BRICK_SLAB,
            HybridBlocksItems.YELLOW_QUARTZ_PILLAR,
            HybridBlocksItems.CHISELED_YELLOW_QUARTZ_BLOCK,
            HybridBlocksItems.YELLOW_QUARTZ_TILES,
            HybridBlocksItems.YELLOW_QUARTZ_TILE_STAIRS,
            HybridBlocksItems.YELLOW_QUARTZ_TILE_SLAB,
        )

        private val LIME_QUARTZ_SET = QuartzRecipeSet(
            HybridBlocksItems.LIME_QUARTZ_BLOCK,
            HybridBlocksItems.LIME_QUARTZ_STAIRS,
            HybridBlocksItems.LIME_QUARTZ_SLAB,
            HybridBlocksItems.SMOOTH_LIME_QUARTZ,
            HybridBlocksItems.SMOOTH_LIME_QUARTZ_STAIRS,
            HybridBlocksItems.SMOOTH_LIME_QUARTZ_SLAB,
            HybridBlocksItems.LIME_QUARTZ_BRICKS,
            HybridBlocksItems.LIME_QUARTZ_BRICK_STAIRS,
            HybridBlocksItems.LIME_QUARTZ_BRICK_SLAB,
            HybridBlocksItems.LIME_QUARTZ_PILLAR,
            HybridBlocksItems.CHISELED_LIME_QUARTZ_BLOCK,
            HybridBlocksItems.LIME_QUARTZ_TILES,
            HybridBlocksItems.LIME_QUARTZ_TILE_STAIRS,
            HybridBlocksItems.LIME_QUARTZ_TILE_SLAB,
        )

        private val PINK_QUARTZ_SET = QuartzRecipeSet(
            HybridBlocksItems.PINK_QUARTZ_BLOCK,
            HybridBlocksItems.PINK_QUARTZ_STAIRS,
            HybridBlocksItems.PINK_QUARTZ_SLAB,
            HybridBlocksItems.SMOOTH_PINK_QUARTZ,
            HybridBlocksItems.SMOOTH_PINK_QUARTZ_STAIRS,
            HybridBlocksItems.SMOOTH_PINK_QUARTZ_SLAB,
            HybridBlocksItems.PINK_QUARTZ_BRICKS,
            HybridBlocksItems.PINK_QUARTZ_BRICK_STAIRS,
            HybridBlocksItems.PINK_QUARTZ_BRICK_SLAB,
            HybridBlocksItems.PINK_QUARTZ_PILLAR,
            HybridBlocksItems.CHISELED_PINK_QUARTZ_BLOCK,
            HybridBlocksItems.PINK_QUARTZ_TILES,
            HybridBlocksItems.PINK_QUARTZ_TILE_STAIRS,
            HybridBlocksItems.PINK_QUARTZ_TILE_SLAB,
        )

        private val GRAY_QUARTZ_SET = QuartzRecipeSet(
            HybridBlocksItems.GRAY_QUARTZ_BLOCK,
            HybridBlocksItems.GRAY_QUARTZ_STAIRS,
            HybridBlocksItems.GRAY_QUARTZ_SLAB,
            HybridBlocksItems.SMOOTH_GRAY_QUARTZ,
            HybridBlocksItems.SMOOTH_GRAY_QUARTZ_STAIRS,
            HybridBlocksItems.SMOOTH_GRAY_QUARTZ_SLAB,
            HybridBlocksItems.GRAY_QUARTZ_BRICKS,
            HybridBlocksItems.GRAY_QUARTZ_BRICK_STAIRS,
            HybridBlocksItems.GRAY_QUARTZ_BRICK_SLAB,
            HybridBlocksItems.GRAY_QUARTZ_PILLAR,
            HybridBlocksItems.CHISELED_GRAY_QUARTZ_BLOCK,
            HybridBlocksItems.GRAY_QUARTZ_TILES,
            HybridBlocksItems.GRAY_QUARTZ_TILE_STAIRS,
            HybridBlocksItems.GRAY_QUARTZ_TILE_SLAB,
        )

        private val LIGHT_GRAY_QUARTZ_SET = QuartzRecipeSet(
            HybridBlocksItems.LIGHT_GRAY_QUARTZ_BLOCK,
            HybridBlocksItems.LIGHT_GRAY_QUARTZ_STAIRS,
            HybridBlocksItems.LIGHT_GRAY_QUARTZ_SLAB,
            HybridBlocksItems.SMOOTH_LIGHT_GRAY_QUARTZ,
            HybridBlocksItems.SMOOTH_LIGHT_GRAY_QUARTZ_STAIRS,
            HybridBlocksItems.SMOOTH_LIGHT_GRAY_QUARTZ_SLAB,
            HybridBlocksItems.LIGHT_GRAY_QUARTZ_BRICKS,
            HybridBlocksItems.LIGHT_GRAY_QUARTZ_BRICK_STAIRS,
            HybridBlocksItems.LIGHT_GRAY_QUARTZ_BRICK_SLAB,
            HybridBlocksItems.LIGHT_GRAY_QUARTZ_PILLAR,
            HybridBlocksItems.CHISELED_LIGHT_GRAY_QUARTZ_BLOCK,
            HybridBlocksItems.LIGHT_GRAY_QUARTZ_TILES,
            HybridBlocksItems.LIGHT_GRAY_QUARTZ_TILE_STAIRS,
            HybridBlocksItems.LIGHT_GRAY_QUARTZ_TILE_SLAB,
        )

        private val CYAN_QUARTZ_SET = QuartzRecipeSet(
            HybridBlocksItems.CYAN_QUARTZ_BLOCK,
            HybridBlocksItems.CYAN_QUARTZ_STAIRS,
            HybridBlocksItems.CYAN_QUARTZ_SLAB,
            HybridBlocksItems.SMOOTH_CYAN_QUARTZ,
            HybridBlocksItems.SMOOTH_CYAN_QUARTZ_STAIRS,
            HybridBlocksItems.SMOOTH_CYAN_QUARTZ_SLAB,
            HybridBlocksItems.CYAN_QUARTZ_BRICKS,
            HybridBlocksItems.CYAN_QUARTZ_BRICK_STAIRS,
            HybridBlocksItems.CYAN_QUARTZ_BRICK_SLAB,
            HybridBlocksItems.CYAN_QUARTZ_PILLAR,
            HybridBlocksItems.CHISELED_CYAN_QUARTZ_BLOCK,
            HybridBlocksItems.CYAN_QUARTZ_TILES,
            HybridBlocksItems.CYAN_QUARTZ_TILE_STAIRS,
            HybridBlocksItems.CYAN_QUARTZ_TILE_SLAB,
        )

        private val PURPLE_QUARTZ_SET = QuartzRecipeSet(
            HybridBlocksItems.PURPLE_QUARTZ_BLOCK,
            HybridBlocksItems.PURPLE_QUARTZ_STAIRS,
            HybridBlocksItems.PURPLE_QUARTZ_SLAB,
            HybridBlocksItems.SMOOTH_PURPLE_QUARTZ,
            HybridBlocksItems.SMOOTH_PURPLE_QUARTZ_STAIRS,
            HybridBlocksItems.SMOOTH_PURPLE_QUARTZ_SLAB,
            HybridBlocksItems.PURPLE_QUARTZ_BRICKS,
            HybridBlocksItems.PURPLE_QUARTZ_BRICK_STAIRS,
            HybridBlocksItems.PURPLE_QUARTZ_BRICK_SLAB,
            HybridBlocksItems.PURPLE_QUARTZ_PILLAR,
            HybridBlocksItems.CHISELED_PURPLE_QUARTZ_BLOCK,
            HybridBlocksItems.PURPLE_QUARTZ_TILES,
            HybridBlocksItems.PURPLE_QUARTZ_TILE_STAIRS,
            HybridBlocksItems.PURPLE_QUARTZ_TILE_SLAB,
        )

        private val BLUE_QUARTZ_SET = QuartzRecipeSet(
            HybridBlocksItems.BLUE_QUARTZ_BLOCK,
            HybridBlocksItems.BLUE_QUARTZ_STAIRS,
            HybridBlocksItems.BLUE_QUARTZ_SLAB,
            HybridBlocksItems.SMOOTH_BLUE_QUARTZ,
            HybridBlocksItems.SMOOTH_BLUE_QUARTZ_STAIRS,
            HybridBlocksItems.SMOOTH_BLUE_QUARTZ_SLAB,
            HybridBlocksItems.BLUE_QUARTZ_BRICKS,
            HybridBlocksItems.BLUE_QUARTZ_BRICK_STAIRS,
            HybridBlocksItems.BLUE_QUARTZ_BRICK_SLAB,
            HybridBlocksItems.BLUE_QUARTZ_PILLAR,
            HybridBlocksItems.CHISELED_BLUE_QUARTZ_BLOCK,
            HybridBlocksItems.BLUE_QUARTZ_TILES,
            HybridBlocksItems.BLUE_QUARTZ_TILE_STAIRS,
            HybridBlocksItems.BLUE_QUARTZ_TILE_SLAB,
        )

        private val BROWN_QUARTZ_SET = QuartzRecipeSet(
            HybridBlocksItems.BROWN_QUARTZ_BLOCK,
            HybridBlocksItems.BROWN_QUARTZ_STAIRS,
            HybridBlocksItems.BROWN_QUARTZ_SLAB,
            HybridBlocksItems.SMOOTH_BROWN_QUARTZ,
            HybridBlocksItems.SMOOTH_BROWN_QUARTZ_STAIRS,
            HybridBlocksItems.SMOOTH_BROWN_QUARTZ_SLAB,
            HybridBlocksItems.BROWN_QUARTZ_BRICKS,
            HybridBlocksItems.BROWN_QUARTZ_BRICK_STAIRS,
            HybridBlocksItems.BROWN_QUARTZ_BRICK_SLAB,
            HybridBlocksItems.BROWN_QUARTZ_PILLAR,
            HybridBlocksItems.CHISELED_BROWN_QUARTZ_BLOCK,
            HybridBlocksItems.BROWN_QUARTZ_TILES,
            HybridBlocksItems.BROWN_QUARTZ_TILE_STAIRS,
            HybridBlocksItems.BROWN_QUARTZ_TILE_SLAB,
        )

        private val GREEN_QUARTZ_SET = QuartzRecipeSet(
            HybridBlocksItems.GREEN_QUARTZ_BLOCK,
            HybridBlocksItems.GREEN_QUARTZ_STAIRS,
            HybridBlocksItems.GREEN_QUARTZ_SLAB,
            HybridBlocksItems.SMOOTH_GREEN_QUARTZ,
            HybridBlocksItems.SMOOTH_GREEN_QUARTZ_STAIRS,
            HybridBlocksItems.SMOOTH_GREEN_QUARTZ_SLAB,
            HybridBlocksItems.GREEN_QUARTZ_BRICKS,
            HybridBlocksItems.GREEN_QUARTZ_BRICK_STAIRS,
            HybridBlocksItems.GREEN_QUARTZ_BRICK_SLAB,
            HybridBlocksItems.GREEN_QUARTZ_PILLAR,
            HybridBlocksItems.CHISELED_GREEN_QUARTZ_BLOCK,
            HybridBlocksItems.GREEN_QUARTZ_TILES,
            HybridBlocksItems.GREEN_QUARTZ_TILE_STAIRS,
            HybridBlocksItems.GREEN_QUARTZ_TILE_SLAB,
        )

        private val RED_QUARTZ_SET = QuartzRecipeSet(
            HybridBlocksItems.RED_QUARTZ_BLOCK,
            HybridBlocksItems.RED_QUARTZ_STAIRS,
            HybridBlocksItems.RED_QUARTZ_SLAB,
            HybridBlocksItems.SMOOTH_RED_QUARTZ,
            HybridBlocksItems.SMOOTH_RED_QUARTZ_STAIRS,
            HybridBlocksItems.SMOOTH_RED_QUARTZ_SLAB,
            HybridBlocksItems.RED_QUARTZ_BRICKS,
            HybridBlocksItems.RED_QUARTZ_BRICK_STAIRS,
            HybridBlocksItems.RED_QUARTZ_BRICK_SLAB,
            HybridBlocksItems.RED_QUARTZ_PILLAR,
            HybridBlocksItems.CHISELED_RED_QUARTZ_BLOCK,
            HybridBlocksItems.RED_QUARTZ_TILES,
            HybridBlocksItems.RED_QUARTZ_TILE_STAIRS,
            HybridBlocksItems.RED_QUARTZ_TILE_SLAB,
        )

        private val BLACK_QUARTZ_SET = QuartzRecipeSet(
            HybridBlocksItems.BLACK_QUARTZ_BLOCK,
            HybridBlocksItems.BLACK_QUARTZ_STAIRS,
            HybridBlocksItems.BLACK_QUARTZ_SLAB,
            HybridBlocksItems.SMOOTH_BLACK_QUARTZ,
            HybridBlocksItems.SMOOTH_BLACK_QUARTZ_STAIRS,
            HybridBlocksItems.SMOOTH_BLACK_QUARTZ_SLAB,
            HybridBlocksItems.BLACK_QUARTZ_BRICKS,
            HybridBlocksItems.BLACK_QUARTZ_BRICK_STAIRS,
            HybridBlocksItems.BLACK_QUARTZ_BRICK_SLAB,
            HybridBlocksItems.BLACK_QUARTZ_PILLAR,
            HybridBlocksItems.CHISELED_BLACK_QUARTZ_BLOCK,
            HybridBlocksItems.BLACK_QUARTZ_TILES,
            HybridBlocksItems.BLACK_QUARTZ_TILE_STAIRS,
            HybridBlocksItems.BLACK_QUARTZ_TILE_SLAB,
        )
        /**
         * Emits every crafting and stonecutting recipe inside a quartz set. Colour agnostic: it only
         * ever walks from a set's own base block outwards, so nothing here depends on a dye.
         */
        private fun offerQuartzSetRecipes(exporter: RecipeOutput, set: QuartzRecipeSet) {
            val block = set.block.get()
            val smooth = set.smooth.get()
            val tiles = set.tiles.get()

            // base block -> stairs, slab
            offerStairsAndSlabRecipes(exporter, block, set.stairs.get(), set.slab.get())

            // smooth -> smooth stairs, smooth slab
            offerStairsAndSlabRecipes(exporter, smooth, set.smoothStairs.get(), set.smoothSlab.get())

            // tiles -> tile stairs, tile slab
            offerStairsAndSlabRecipes(exporter, tiles, set.tileStairs.get(), set.tileSlab.get())

            // base block -> bricks (crafting + stonecutting)
            offerQuartzBricksRecipes(exporter, block, set.bricks.get())

            // bricks -> brick stairs, brick slab
            offerStairsAndSlabRecipes(exporter, set.bricks.get(), set.brickStairs.get(), set.brickSlab.get())

            // base block -> tiles, crafted against vanilla quartz
            offerQuartzTilesRecipe(exporter, block, getHasName(block), tiles)

            // base block -> chiseled (crafting + stonecutting)
            chiseled(exporter, RecipeCategory.BUILDING_BLOCKS, set.chiseled.get(), block)
            stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, set.chiseled.get(), block)

            // base block -> pillar; the crafting route is the dyeing recipe, so stonecutting only
            stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, set.pillar.get(), block)
        }

        /**
         * [offerQuartzSetRecipes] plus the dyeing recipes that turn vanilla quartz into this colour.
         * Only the three blocks with a vanilla counterpart are dyed; everything else in the set is
         * reached from the stained base block.
         */
        private fun offerStainedQuartzSetRecipes(exporter: RecipeOutput, set: QuartzRecipeSet, dye: Item) {
            offerQuartzSetRecipes(exporter, set)

            offerQuartzBlockDyeingRecipe(exporter, set.block.get(), dye)
            offerSmoothQuartzDyeingRecipe(exporter, set.smooth.get(), dye)
            offerQuartzPillarDyeingRecipe(exporter, set.pillar.get(), dye)
        }

        /**
         * Crafting and stonecutting for the stairs and slab cut from [base].
         */
        private fun offerStairsAndSlabRecipes(
            exporter: RecipeOutput,
            base: Item,
            stairs: Item,
            slab: Item,
        ) {
            stairBuilder(exporter, stairs, base)
            stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, stairs, base)

            slab(exporter, RecipeCategory.BUILDING_BLOCKS, slab, base)
            stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, slab, base, 2)
        }

        private fun offerQuartzBlockDyeingRecipe(
            exporter: RecipeOutput,
            output: Item,
            input: Item
        ) {
            offerDyeingRecipe(
                exporter,
                Items.QUARTZ_BLOCK,
                "has_quartz_block",
                "stained_quartz_block",
                output,
                input
            )
        }
        //#endregion
    }
}
