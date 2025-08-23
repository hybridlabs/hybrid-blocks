package dev.hybridlabs.blocks.client

import dev.hybridlabs.blocks.block.HybridBlocksBlocks
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.minecraft.client.render.RenderLayer

object HybridBlocksClient : ClientModInitializer {
    override fun onInitializeClient() {
        registerBlockRenderLayers()
    }

    private fun registerBlockRenderLayers(registry: BlockRenderLayerMap = BlockRenderLayerMap.INSTANCE) {
        registry.putBlocks(
            RenderLayer.getTranslucent(),
            HybridBlocksBlocks.AQUARIUM_GLASS,
            HybridBlocksBlocks.WHITE_STAINED_AQUARIUM_GLASS,
            HybridBlocksBlocks.ORANGE_STAINED_AQUARIUM_GLASS,
            HybridBlocksBlocks.MAGENTA_STAINED_AQUARIUM_GLASS,
            HybridBlocksBlocks.LIGHT_BLUE_STAINED_AQUARIUM_GLASS,
            HybridBlocksBlocks.YELLOW_STAINED_AQUARIUM_GLASS,
            HybridBlocksBlocks.LIME_STAINED_AQUARIUM_GLASS,
            HybridBlocksBlocks.PINK_STAINED_AQUARIUM_GLASS,
            HybridBlocksBlocks.GRAY_STAINED_AQUARIUM_GLASS,
            HybridBlocksBlocks.LIGHT_GRAY_STAINED_AQUARIUM_GLASS,
            HybridBlocksBlocks.CYAN_STAINED_AQUARIUM_GLASS,
            HybridBlocksBlocks.PURPLE_STAINED_AQUARIUM_GLASS,
            HybridBlocksBlocks.BLUE_STAINED_AQUARIUM_GLASS,
            HybridBlocksBlocks.BROWN_STAINED_AQUARIUM_GLASS,
            HybridBlocksBlocks.GREEN_STAINED_AQUARIUM_GLASS,
            HybridBlocksBlocks.RED_STAINED_AQUARIUM_GLASS,
            HybridBlocksBlocks.BLACK_STAINED_AQUARIUM_GLASS,
            HybridBlocksBlocks.AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.WHITE_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.ORANGE_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.MAGENTA_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.LIGHT_BLUE_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.YELLOW_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.LIME_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.PINK_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.GRAY_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.LIGHT_GRAY_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.CYAN_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.PURPLE_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.BLUE_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.BROWN_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.GREEN_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.RED_STAINED_AQUARIUM_GLASS_PANE,
            HybridBlocksBlocks.BLACK_STAINED_AQUARIUM_GLASS_PANE,
        )
    }
}
