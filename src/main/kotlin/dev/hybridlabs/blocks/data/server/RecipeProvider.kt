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

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.WHITE_BRICK_SLAB, HybridBlocksBlocks.WHITE_BRICKS)
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, HybridBlocksBlocks.WHITE_BRICK_WALL, HybridBlocksBlocks.WHITE_BRICKS)

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
