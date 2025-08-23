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
            HybridBlocksBlocks.WHITE_STAINED_QUARTZ_PILLAR,
            HybridBlocksBlocks.ORANGE_STAINED_QUARTZ_PILLAR,
            HybridBlocksBlocks.MAGENTA_STAINED_QUARTZ_PILLAR,
            HybridBlocksBlocks.LIGHT_BLUE_STAINED_QUARTZ_PILLAR,
            HybridBlocksBlocks.YELLOW_STAINED_QUARTZ_PILLAR,
            HybridBlocksBlocks.LIME_STAINED_QUARTZ_PILLAR,
            HybridBlocksBlocks.PINK_STAINED_QUARTZ_PILLAR,
            HybridBlocksBlocks.GRAY_STAINED_QUARTZ_PILLAR,
            HybridBlocksBlocks.LIGHT_GRAY_STAINED_QUARTZ_PILLAR,
            HybridBlocksBlocks.CYAN_STAINED_QUARTZ_PILLAR,
            HybridBlocksBlocks.PURPLE_STAINED_QUARTZ_PILLAR,
            HybridBlocksBlocks.BLUE_STAINED_QUARTZ_PILLAR,
            HybridBlocksBlocks.BROWN_STAINED_QUARTZ_PILLAR,
            HybridBlocksBlocks.GREEN_STAINED_QUARTZ_PILLAR,
            HybridBlocksBlocks.RED_STAINED_QUARTZ_PILLAR,
            HybridBlocksBlocks.BLACK_STAINED_QUARTZ_PILLAR,
        ).forEach { block ->
            generator.registerAxisRotated(
                block,
                TexturedModel.END_FOR_TOP_CUBE_COLUMN,
                TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL
            )
        }

        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.WHITE_STAINED_BRICKS)
            .family(HybridBlocksFamilies.WHITE_STAINED_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.ORANGE_STAINED_BRICKS)
            .family(HybridBlocksFamilies.ORANGE_STAINED_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MAGENTA_STAINED_BRICKS)
            .family(HybridBlocksFamilies.MAGENTA_STAINED_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.LIGHT_BLUE_STAINED_BRICKS)
            .family(HybridBlocksFamilies.LIGHT_BLUE_STAINED_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.YELLOW_STAINED_BRICKS)
            .family(HybridBlocksFamilies.YELLOW_STAINED_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.LIME_STAINED_BRICKS)
            .family(HybridBlocksFamilies.LIME_STAINED_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.PINK_STAINED_BRICKS)
            .family(HybridBlocksFamilies.PINK_STAINED_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.GRAY_STAINED_BRICKS)
            .family(HybridBlocksFamilies.GRAY_STAINED_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.LIGHT_GRAY_STAINED_BRICKS)
            .family(HybridBlocksFamilies.LIGHT_GRAY_STAINED_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.CYAN_STAINED_BRICKS)
            .family(HybridBlocksFamilies.CYAN_STAINED_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.PURPLE_STAINED_BRICKS)
            .family(HybridBlocksFamilies.PURPLE_STAINED_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.BLUE_STAINED_BRICKS)
            .family(HybridBlocksFamilies.BLUE_STAINED_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.BROWN_STAINED_BRICKS)
            .family(HybridBlocksFamilies.BROWN_STAINED_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.GREEN_STAINED_BRICKS)
            .family(HybridBlocksFamilies.GREEN_STAINED_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.RED_STAINED_BRICKS)
            .family(HybridBlocksFamilies.RED_STAINED_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.BLACK_STAINED_BRICKS)
            .family(HybridBlocksFamilies.BLACK_STAINED_BRICKS)

        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.WHITE_STAINED_MOSSY_BRICKS)
            .family(HybridBlocksFamilies.WHITE_STAINED_MOSSY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.ORANGE_STAINED_MOSSY_BRICKS)
            .family(HybridBlocksFamilies.ORANGE_STAINED_MOSSY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MAGENTA_STAINED_MOSSY_BRICKS)
            .family(HybridBlocksFamilies.MAGENTA_STAINED_MOSSY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.LIGHT_BLUE_STAINED_MOSSY_BRICKS)
            .family(HybridBlocksFamilies.LIGHT_BLUE_STAINED_MOSSY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.YELLOW_STAINED_MOSSY_BRICKS)
            .family(HybridBlocksFamilies.YELLOW_STAINED_MOSSY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.LIME_STAINED_MOSSY_BRICKS)
            .family(HybridBlocksFamilies.LIME_STAINED_MOSSY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.PINK_STAINED_MOSSY_BRICKS)
            .family(HybridBlocksFamilies.PINK_STAINED_MOSSY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.GRAY_STAINED_MOSSY_BRICKS)
            .family(HybridBlocksFamilies.GRAY_STAINED_MOSSY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.LIGHT_GRAY_STAINED_MOSSY_BRICKS)
            .family(HybridBlocksFamilies.LIGHT_GRAY_STAINED_MOSSY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.CYAN_STAINED_MOSSY_BRICKS)
            .family(HybridBlocksFamilies.CYAN_STAINED_MOSSY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.PURPLE_STAINED_MOSSY_BRICKS)
            .family(HybridBlocksFamilies.PURPLE_STAINED_MOSSY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.BLUE_STAINED_MOSSY_BRICKS)
            .family(HybridBlocksFamilies.BLUE_STAINED_MOSSY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.BROWN_STAINED_MOSSY_BRICKS)
            .family(HybridBlocksFamilies.BROWN_STAINED_MOSSY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.GREEN_STAINED_MOSSY_BRICKS)
            .family(HybridBlocksFamilies.GREEN_STAINED_MOSSY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.RED_STAINED_MOSSY_BRICKS)
            .family(HybridBlocksFamilies.RED_STAINED_MOSSY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.BLACK_STAINED_MOSSY_BRICKS)
            .family(HybridBlocksFamilies.BLACK_STAINED_MOSSY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.CRACKED_BRICKS)
            .family(HybridBlocksFamilies.CRACKED_BRICKS)

        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.WHITE_STAINED_SMOOTH_QUARTZ)
            .family(HybridBlocksFamilies.WHITE_STAINED_SMOOTH_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.ORANGE_STAINED_SMOOTH_QUARTZ)
            .family(HybridBlocksFamilies.ORANGE_STAINED_SMOOTH_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MAGENTA_STAINED_SMOOTH_QUARTZ)
            .family(HybridBlocksFamilies.MAGENTA_STAINED_SMOOTH_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.LIGHT_BLUE_STAINED_SMOOTH_QUARTZ)
            .family(HybridBlocksFamilies.LIGHT_BLUE_STAINED_SMOOTH_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.YELLOW_STAINED_SMOOTH_QUARTZ)
            .family(HybridBlocksFamilies.YELLOW_STAINED_SMOOTH_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.LIME_STAINED_SMOOTH_QUARTZ)
            .family(HybridBlocksFamilies.LIME_STAINED_SMOOTH_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.PINK_STAINED_SMOOTH_QUARTZ)
            .family(HybridBlocksFamilies.PINK_STAINED_SMOOTH_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.GRAY_STAINED_SMOOTH_QUARTZ)
            .family(HybridBlocksFamilies.GRAY_STAINED_SMOOTH_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.LIGHT_GRAY_STAINED_SMOOTH_QUARTZ)
            .family(HybridBlocksFamilies.LIGHT_GRAY_STAINED_SMOOTH_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.CYAN_STAINED_SMOOTH_QUARTZ)
            .family(HybridBlocksFamilies.CYAN_STAINED_SMOOTH_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.PURPLE_STAINED_SMOOTH_QUARTZ)
            .family(HybridBlocksFamilies.PURPLE_STAINED_SMOOTH_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.BLUE_STAINED_SMOOTH_QUARTZ)
            .family(HybridBlocksFamilies.BLUE_STAINED_SMOOTH_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.BROWN_STAINED_SMOOTH_QUARTZ)
            .family(HybridBlocksFamilies.BROWN_STAINED_SMOOTH_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.GREEN_STAINED_SMOOTH_QUARTZ)
            .family(HybridBlocksFamilies.GREEN_STAINED_SMOOTH_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.RED_STAINED_SMOOTH_QUARTZ)
            .family(HybridBlocksFamilies.RED_STAINED_SMOOTH_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.BLACK_STAINED_SMOOTH_QUARTZ)
            .family(HybridBlocksFamilies.BLACK_STAINED_SMOOTH_QUARTZ)
    }

    override fun generateItemModels(generator: ItemModelGenerator) {
    }
}
