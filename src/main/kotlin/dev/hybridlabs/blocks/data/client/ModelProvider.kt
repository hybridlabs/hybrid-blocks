package dev.hybridlabs.blocks.data.client

import dev.hybridlabs.blocks.block.HybridBlocksBlocks
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.client.BlockStateModelGenerator
import net.minecraft.data.client.ItemModelGenerator

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
        ).forEach(generator::registerSimpleCubeAll)
    }

    override fun generateItemModels(generator: ItemModelGenerator) {
    }
}
