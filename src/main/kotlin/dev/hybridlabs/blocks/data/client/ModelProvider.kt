package dev.hybridlabs.blocks.data.client

import dev.hybridlabs.blocks.block.HybridBlocksBlocks
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
        // generate simple cube alls
        setOf(
            HybridBlocksBlocks.WHITE_STAINED_SMOOTH_QUARTZ,
            HybridBlocksBlocks.ORANGE_STAINED_SMOOTH_QUARTZ,
            HybridBlocksBlocks.MAGENTA_STAINED_SMOOTH_QUARTZ,
            HybridBlocksBlocks.LIGHT_BLUE_STAINED_SMOOTH_QUARTZ,
            HybridBlocksBlocks.YELLOW_STAINED_SMOOTH_QUARTZ,
            HybridBlocksBlocks.LIME_STAINED_SMOOTH_QUARTZ,
            HybridBlocksBlocks.PINK_STAINED_SMOOTH_QUARTZ,
            HybridBlocksBlocks.GRAY_STAINED_SMOOTH_QUARTZ,
            HybridBlocksBlocks.LIGHT_GRAY_STAINED_SMOOTH_QUARTZ,
            HybridBlocksBlocks.CYAN_STAINED_SMOOTH_QUARTZ,
            HybridBlocksBlocks.PURPLE_STAINED_SMOOTH_QUARTZ,
            HybridBlocksBlocks.BLUE_STAINED_SMOOTH_QUARTZ,
            HybridBlocksBlocks.BROWN_STAINED_SMOOTH_QUARTZ,
            HybridBlocksBlocks.GREEN_STAINED_SMOOTH_QUARTZ,
            HybridBlocksBlocks.RED_STAINED_SMOOTH_QUARTZ,
            HybridBlocksBlocks.BLACK_STAINED_SMOOTH_QUARTZ,

            HybridBlocksBlocks.WHITE_STAINED_BRICKS,
            HybridBlocksBlocks.ORANGE_STAINED_BRICKS,
            HybridBlocksBlocks.MAGENTA_STAINED_BRICKS,
            HybridBlocksBlocks.LIGHT_BLUE_STAINED_BRICKS,
            HybridBlocksBlocks.YELLOW_STAINED_BRICKS,
            HybridBlocksBlocks.LIME_STAINED_BRICKS,
            HybridBlocksBlocks.PINK_STAINED_BRICKS,
            HybridBlocksBlocks.GRAY_STAINED_BRICKS,
            HybridBlocksBlocks.LIGHT_GRAY_STAINED_BRICKS,
            HybridBlocksBlocks.CYAN_STAINED_BRICKS,
            HybridBlocksBlocks.PURPLE_STAINED_BRICKS,
            HybridBlocksBlocks.BLUE_STAINED_BRICKS,
            HybridBlocksBlocks.BROWN_STAINED_BRICKS,
            HybridBlocksBlocks.GREEN_STAINED_BRICKS,
            HybridBlocksBlocks.RED_STAINED_BRICKS,
            HybridBlocksBlocks.BLACK_STAINED_BRICKS,

            HybridBlocksBlocks.CRACKED_BRICKS,
            HybridBlocksBlocks.WHITE_STAINED_CRACKED_BRICKS,
            HybridBlocksBlocks.ORANGE_STAINED_CRACKED_BRICKS,
            HybridBlocksBlocks.MAGENTA_STAINED_CRACKED_BRICKS,
            HybridBlocksBlocks.LIGHT_BLUE_STAINED_CRACKED_BRICKS,
            HybridBlocksBlocks.YELLOW_STAINED_CRACKED_BRICKS,
            HybridBlocksBlocks.LIME_STAINED_CRACKED_BRICKS,
            HybridBlocksBlocks.PINK_STAINED_CRACKED_BRICKS,
            HybridBlocksBlocks.GRAY_STAINED_CRACKED_BRICKS,
            HybridBlocksBlocks.LIGHT_GRAY_STAINED_CRACKED_BRICKS,
            HybridBlocksBlocks.CYAN_STAINED_CRACKED_BRICKS,
            HybridBlocksBlocks.PURPLE_STAINED_CRACKED_BRICKS,
            HybridBlocksBlocks.BLUE_STAINED_CRACKED_BRICKS,
            HybridBlocksBlocks.BROWN_STAINED_CRACKED_BRICKS,
            HybridBlocksBlocks.GREEN_STAINED_CRACKED_BRICKS,
            HybridBlocksBlocks.RED_STAINED_CRACKED_BRICKS,
            HybridBlocksBlocks.BLACK_STAINED_CRACKED_BRICKS,

            HybridBlocksBlocks.MOSSY_BRICKS,
            HybridBlocksBlocks.WHITE_STAINED_MOSSY_BRICKS,
            HybridBlocksBlocks.ORANGE_STAINED_MOSSY_BRICKS,
            HybridBlocksBlocks.MAGENTA_STAINED_MOSSY_BRICKS,
            HybridBlocksBlocks.LIGHT_BLUE_STAINED_MOSSY_BRICKS,
            HybridBlocksBlocks.YELLOW_STAINED_MOSSY_BRICKS,
            HybridBlocksBlocks.LIME_STAINED_MOSSY_BRICKS,
            HybridBlocksBlocks.PINK_STAINED_MOSSY_BRICKS,
            HybridBlocksBlocks.GRAY_STAINED_MOSSY_BRICKS,
            HybridBlocksBlocks.LIGHT_GRAY_STAINED_MOSSY_BRICKS,
            HybridBlocksBlocks.CYAN_STAINED_MOSSY_BRICKS,
            HybridBlocksBlocks.PURPLE_STAINED_MOSSY_BRICKS,
            HybridBlocksBlocks.BLUE_STAINED_MOSSY_BRICKS,
            HybridBlocksBlocks.BROWN_STAINED_MOSSY_BRICKS,
            HybridBlocksBlocks.GREEN_STAINED_MOSSY_BRICKS,
            HybridBlocksBlocks.RED_STAINED_MOSSY_BRICKS,
            HybridBlocksBlocks.BLACK_STAINED_MOSSY_BRICKS,
        ).forEach(generator::registerSimpleCubeAll)


        mapOf(
            HybridBlocksBlocks.AQUARIUM_GLASS to HybridBlocksBlocks.AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.WHITE_STAINED_AQUARIUM_GLASS to HybridBlocksBlocks.WHITE_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.ORANGE_STAINED_AQUARIUM_GLASS to HybridBlocksBlocks.ORANGE_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.MAGENTA_STAINED_AQUARIUM_GLASS to HybridBlocksBlocks.MAGENTA_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.LIGHT_BLUE_STAINED_AQUARIUM_GLASS to HybridBlocksBlocks.LIGHT_BLUE_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.YELLOW_STAINED_AQUARIUM_GLASS to HybridBlocksBlocks.YELLOW_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.LIME_STAINED_AQUARIUM_GLASS to HybridBlocksBlocks.LIME_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.PINK_STAINED_AQUARIUM_GLASS to HybridBlocksBlocks.PINK_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.GRAY_STAINED_AQUARIUM_GLASS to HybridBlocksBlocks.GRAY_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.LIGHT_GRAY_STAINED_AQUARIUM_GLASS to HybridBlocksBlocks.LIGHT_GRAY_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.CYAN_STAINED_AQUARIUM_GLASS to HybridBlocksBlocks.CYAN_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.PURPLE_STAINED_AQUARIUM_GLASS to HybridBlocksBlocks.PURPLE_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.BLUE_STAINED_AQUARIUM_GLASS to HybridBlocksBlocks.BLUE_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.BROWN_STAINED_AQUARIUM_GLASS to HybridBlocksBlocks.BROWN_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.GREEN_STAINED_AQUARIUM_GLASS to HybridBlocksBlocks.GREEN_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.RED_STAINED_AQUARIUM_GLASS to HybridBlocksBlocks.RED_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.BLACK_STAINED_AQUARIUM_GLASS to HybridBlocksBlocks.BLACK_STAINED_AQUARIUM_GLASS_PANE,
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
    }

    override fun generateItemModels(generator: ItemModelGenerator) {
    }
}
