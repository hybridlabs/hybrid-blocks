package dev.hybridlabs.blocks.data.server

import dev.hybridlabs.blocks.block.HybridBlocksBlocks
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.block.Blocks
import net.minecraft.data.server.recipe.RecipeJsonProvider
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder
import net.minecraft.item.ItemConvertible
import net.minecraft.item.Items
import net.minecraft.recipe.book.RecipeCategory
import java.util.function.Consumer

/**
 * Generates all recipes.
 */
class RecipeProvider(output: FabricDataOutput) : FabricRecipeProvider(output) {
    override fun generate(exporter: Consumer<RecipeJsonProvider>) {
        offerStainedSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.BLACK_STAINED_SMOOTH_QUARTZ, Items.BLACK_DYE)
        offerStainedSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.BLUE_STAINED_SMOOTH_QUARTZ, Items.BLUE_DYE)
        offerStainedSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.BROWN_STAINED_SMOOTH_QUARTZ, Items.BROWN_DYE)
        offerStainedSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.CYAN_STAINED_SMOOTH_QUARTZ, Items.CYAN_DYE)
        offerStainedSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.GRAY_STAINED_SMOOTH_QUARTZ, Items.GRAY_DYE)
        offerStainedSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.GREEN_STAINED_SMOOTH_QUARTZ, Items.GREEN_DYE)
        offerStainedSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.LIGHT_BLUE_STAINED_SMOOTH_QUARTZ, Items.LIGHT_BLUE_DYE)
        offerStainedSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.LIGHT_GRAY_STAINED_SMOOTH_QUARTZ, Items.LIGHT_GRAY_DYE)
        offerStainedSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.LIME_STAINED_SMOOTH_QUARTZ, Items.LIME_DYE)
        offerStainedSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.MAGENTA_STAINED_SMOOTH_QUARTZ, Items.MAGENTA_DYE)
        offerStainedSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.ORANGE_STAINED_SMOOTH_QUARTZ, Items.ORANGE_DYE)
        offerStainedSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.PINK_STAINED_SMOOTH_QUARTZ, Items.PINK_DYE)
        offerStainedSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.PURPLE_STAINED_SMOOTH_QUARTZ, Items.PURPLE_DYE)
        offerStainedSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.RED_STAINED_SMOOTH_QUARTZ, Items.RED_DYE)
        offerStainedSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.WHITE_STAINED_SMOOTH_QUARTZ, Items.WHITE_DYE)
        offerStainedSmoothQuartzDyeingRecipe(exporter, HybridBlocksBlocks.YELLOW_STAINED_SMOOTH_QUARTZ, Items.YELLOW_DYE)

        offerStainedBricksDyeingRecipe(exporter, HybridBlocksBlocks.BLACK_STAINED_BRICKS, Items.BLACK_DYE)
        offerStainedBricksDyeingRecipe(exporter, HybridBlocksBlocks.BLUE_STAINED_BRICKS, Items.BLUE_DYE)
        offerStainedBricksDyeingRecipe(exporter, HybridBlocksBlocks.BROWN_STAINED_BRICKS, Items.BROWN_DYE)
        offerStainedBricksDyeingRecipe(exporter, HybridBlocksBlocks.CYAN_STAINED_BRICKS, Items.CYAN_DYE)
        offerStainedBricksDyeingRecipe(exporter, HybridBlocksBlocks.GRAY_STAINED_BRICKS, Items.GRAY_DYE)
        offerStainedBricksDyeingRecipe(exporter, HybridBlocksBlocks.GREEN_STAINED_BRICKS, Items.GREEN_DYE)
        offerStainedBricksDyeingRecipe(exporter, HybridBlocksBlocks.LIGHT_BLUE_STAINED_BRICKS, Items.LIGHT_BLUE_DYE)
        offerStainedBricksDyeingRecipe(exporter, HybridBlocksBlocks.LIGHT_GRAY_STAINED_BRICKS, Items.LIGHT_GRAY_DYE)
        offerStainedBricksDyeingRecipe(exporter, HybridBlocksBlocks.LIME_STAINED_BRICKS, Items.LIME_DYE)
        offerStainedBricksDyeingRecipe(exporter, HybridBlocksBlocks.MAGENTA_STAINED_BRICKS, Items.MAGENTA_DYE)
        offerStainedBricksDyeingRecipe(exporter, HybridBlocksBlocks.ORANGE_STAINED_BRICKS, Items.ORANGE_DYE)
        offerStainedBricksDyeingRecipe(exporter, HybridBlocksBlocks.PINK_STAINED_BRICKS, Items.PINK_DYE)
        offerStainedBricksDyeingRecipe(exporter, HybridBlocksBlocks.PURPLE_STAINED_BRICKS, Items.PURPLE_DYE)
        offerStainedBricksDyeingRecipe(exporter, HybridBlocksBlocks.RED_STAINED_BRICKS, Items.RED_DYE)
        offerStainedBricksDyeingRecipe(exporter, HybridBlocksBlocks.WHITE_STAINED_BRICKS, Items.WHITE_DYE)
        offerStainedBricksDyeingRecipe(exporter, HybridBlocksBlocks.YELLOW_STAINED_BRICKS, Items.YELLOW_DYE)
    }

    companion object {
        fun offerDyeingRecipe(
            exporter: Consumer<RecipeJsonProvider>,
            base: ItemConvertible,
            criterion: String,
            group: String,
            output: ItemConvertible,
            input: ItemConvertible
        ) {
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 8)
                .input(Character.valueOf('#'), base)
                .input(Character.valueOf('X'), input)

                .pattern("###")
                .pattern("#X#")
                .pattern("###")

                .group(group)
                .criterion(criterion, conditionsFromItem(base))

                .offerTo(exporter)
        }

        fun offerStainedSmoothQuartzDyeingRecipe(
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

        fun offerStainedBricksDyeingRecipe(
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
    }
}
