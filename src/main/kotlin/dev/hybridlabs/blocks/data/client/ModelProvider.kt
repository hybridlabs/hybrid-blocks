package dev.hybridlabs.blocks.data.client

import dev.hybridlabs.blocks.block.HybridBlocksBlocks
import dev.hybridlabs.blocks.block.HybridBlocksFamilies
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.client.BlockStateModelGenerator
import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.data.client.TexturedModel

/**
 * Generates all models.
 */
class ModelProvider(output: FabricDataOutput) : FabricModelProvider(output) {
    override fun generateBlockStateModels(generator: BlockStateModelGenerator) {
        // generate simple cube all
        mapOf(
            HybridBlocksBlocks.CLEAR_GLASS to HybridBlocksBlocks.CLEAR_GLASS_PANE,
            HybridBlocksBlocks.WHITE_STAINED_CLEAR_GLASS to HybridBlocksBlocks.WHITE_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.ORANGE_STAINED_CLEAR_GLASS to HybridBlocksBlocks.ORANGE_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.MAGENTA_STAINED_CLEAR_GLASS to HybridBlocksBlocks.MAGENTA_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS to HybridBlocksBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.YELLOW_STAINED_CLEAR_GLASS to HybridBlocksBlocks.YELLOW_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.LIME_STAINED_CLEAR_GLASS to HybridBlocksBlocks.LIME_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.PINK_STAINED_CLEAR_GLASS to HybridBlocksBlocks.PINK_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.GRAY_STAINED_CLEAR_GLASS to HybridBlocksBlocks.GRAY_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS to HybridBlocksBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.CYAN_STAINED_CLEAR_GLASS to HybridBlocksBlocks.CYAN_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.PURPLE_STAINED_CLEAR_GLASS to HybridBlocksBlocks.PURPLE_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.BLUE_STAINED_CLEAR_GLASS to HybridBlocksBlocks.BLUE_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.BROWN_STAINED_CLEAR_GLASS to HybridBlocksBlocks.BROWN_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.GREEN_STAINED_CLEAR_GLASS to HybridBlocksBlocks.GREEN_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.RED_STAINED_CLEAR_GLASS to HybridBlocksBlocks.RED_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.BLACK_STAINED_CLEAR_GLASS to HybridBlocksBlocks.BLACK_STAINED_CLEAR_GLASS_PANE,
        ).forEach { (glass, pane) ->
            generator.registerGlassPane(glass, pane)
        }

        // axis rotated pillars
        setOf(
            HybridBlocksBlocks.WHITE_QUARTZ_PILLAR,
            HybridBlocksBlocks.ORANGE_QUARTZ_PILLAR,
            HybridBlocksBlocks.MAGENTA_QUARTZ_PILLAR,
            HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_PILLAR,
            HybridBlocksBlocks.YELLOW_QUARTZ_PILLAR,
            HybridBlocksBlocks.LIME_QUARTZ_PILLAR,
            HybridBlocksBlocks.PINK_QUARTZ_PILLAR,
            HybridBlocksBlocks.GRAY_QUARTZ_PILLAR,
            HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_PILLAR,
            HybridBlocksBlocks.CYAN_QUARTZ_PILLAR,
            HybridBlocksBlocks.PURPLE_QUARTZ_PILLAR,
            HybridBlocksBlocks.BLUE_QUARTZ_PILLAR,
            HybridBlocksBlocks.BROWN_QUARTZ_PILLAR,
            HybridBlocksBlocks.GREEN_QUARTZ_PILLAR,
            HybridBlocksBlocks.RED_QUARTZ_PILLAR,
            HybridBlocksBlocks.BLACK_QUARTZ_PILLAR,
        ).forEach { block ->
            generator.registerAxisRotated(
                block,
                TexturedModel.END_FOR_TOP_CUBE_COLUMN,
                TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL
            )
        }

        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.WHITE_BRICKS)
            .family(HybridBlocksFamilies.WHITE_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.ORANGE_BRICKS)
            .family(HybridBlocksFamilies.ORANGE_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MAGENTA_BRICKS)
            .family(HybridBlocksFamilies.MAGENTA_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.LIGHT_BLUE_BRICKS)
            .family(HybridBlocksFamilies.LIGHT_BLUE_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.YELLOW_BRICKS)
            .family(HybridBlocksFamilies.YELLOW_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.LIME_BRICKS)
            .family(HybridBlocksFamilies.LIME_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.PINK_BRICKS)
            .family(HybridBlocksFamilies.PINK_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.GRAY_BRICKS)
            .family(HybridBlocksFamilies.GRAY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.LIGHT_GRAY_BRICKS)
            .family(HybridBlocksFamilies.LIGHT_GRAY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.CYAN_BRICKS)
            .family(HybridBlocksFamilies.CYAN_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.PURPLE_BRICKS)
            .family(HybridBlocksFamilies.PURPLE_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.BLUE_BRICKS)
            .family(HybridBlocksFamilies.BLUE_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.BROWN_BRICKS)
            .family(HybridBlocksFamilies.BROWN_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.GREEN_BRICKS)
            .family(HybridBlocksFamilies.GREEN_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.RED_BRICKS)
            .family(HybridBlocksFamilies.RED_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.BLACK_BRICKS)
            .family(HybridBlocksFamilies.BLACK_BRICKS)

        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_WHITE_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_WHITE_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_ORANGE_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_ORANGE_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_MAGENTA_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_MAGENTA_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_LIGHT_BLUE_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_YELLOW_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_YELLOW_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_LIME_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_LIME_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_PINK_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_PINK_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_GRAY_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_GRAY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_LIGHT_GRAY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_CYAN_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_CYAN_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_PURPLE_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_PURPLE_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_BLUE_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_BLUE_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_BROWN_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_BROWN_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_GREEN_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_GREEN_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_RED_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_RED_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_BLACK_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_BLACK_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.CRACKED_BRICKS)
            .family(HybridBlocksFamilies.CRACKED_BRICKS)

        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.WHITE_QUARTZ)
            .family(HybridBlocksFamilies.WHITE_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.ORANGE_QUARTZ)
            .family(HybridBlocksFamilies.ORANGE_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MAGENTA_QUARTZ)
            .family(HybridBlocksFamilies.MAGENTA_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.LIGHT_BLUE_QUARTZ)
            .family(HybridBlocksFamilies.LIGHT_BLUE_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.YELLOW_QUARTZ)
            .family(HybridBlocksFamilies.YELLOW_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.LIME_QUARTZ)
            .family(HybridBlocksFamilies.LIME_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.PINK_QUARTZ)
            .family(HybridBlocksFamilies.PINK_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.GRAY_QUARTZ)
            .family(HybridBlocksFamilies.GRAY_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.LIGHT_GRAY_QUARTZ)
            .family(HybridBlocksFamilies.LIGHT_GRAY_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.CYAN_QUARTZ)
            .family(HybridBlocksFamilies.CYAN_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.PURPLE_QUARTZ)
            .family(HybridBlocksFamilies.PURPLE_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.BLUE_QUARTZ)
            .family(HybridBlocksFamilies.BLUE_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.BROWN_QUARTZ)
            .family(HybridBlocksFamilies.BROWN_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.GREEN_QUARTZ)
            .family(HybridBlocksFamilies.GREEN_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.RED_QUARTZ)
            .family(HybridBlocksFamilies.RED_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.BLACK_QUARTZ)
            .family(HybridBlocksFamilies.BLACK_QUARTZ)

        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_WHITE_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_WHITE_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_ORANGE_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_ORANGE_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_MAGENTA_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_MAGENTA_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_LIGHT_BLUE_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_LIGHT_BLUE_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_YELLOW_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_YELLOW_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_LIME_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_LIME_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_PINK_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_PINK_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_GRAY_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_GRAY_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_LIGHT_GRAY_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_LIGHT_GRAY_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_CYAN_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_CYAN_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_PURPLE_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_PURPLE_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_BLUE_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_BLUE_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_BROWN_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_BROWN_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_GREEN_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_GREEN_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_RED_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_RED_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_BLACK_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_BLACK_QUARTZ)
    }

    override fun generateItemModels(generator: ItemModelGenerator) {
    }
}
