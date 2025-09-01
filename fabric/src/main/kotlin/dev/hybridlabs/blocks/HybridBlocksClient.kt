package dev.hybridlabs.blocks

import dev.hybridlabs.blocks.block.HybridBlocksBlocks
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.minecraft.client.renderer.RenderType

object HybridBlocksClient : ClientModInitializer {
    override fun onInitializeClient() {
        registerBlockRenderLayers()
    }

    private fun registerBlockRenderLayers(registry: BlockRenderLayerMap = BlockRenderLayerMap.INSTANCE) {
        registry.putBlocks(
            RenderType.translucent(),
            HybridBlocksBlocks.CLEAR_GLASS.get(),
            HybridBlocksBlocks.WHITE_STAINED_CLEAR_GLASS.get(),
            HybridBlocksBlocks.ORANGE_STAINED_CLEAR_GLASS.get(),
            HybridBlocksBlocks.MAGENTA_STAINED_CLEAR_GLASS.get(),
            HybridBlocksBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS.get(),
            HybridBlocksBlocks.YELLOW_STAINED_CLEAR_GLASS.get(),
            HybridBlocksBlocks.LIME_STAINED_CLEAR_GLASS.get(),
            HybridBlocksBlocks.PINK_STAINED_CLEAR_GLASS.get(),
            HybridBlocksBlocks.GRAY_STAINED_CLEAR_GLASS.get(),
            HybridBlocksBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS.get(),
            HybridBlocksBlocks.CYAN_STAINED_CLEAR_GLASS.get(),
            HybridBlocksBlocks.PURPLE_STAINED_CLEAR_GLASS.get(),
            HybridBlocksBlocks.BLUE_STAINED_CLEAR_GLASS.get(),
            HybridBlocksBlocks.BROWN_STAINED_CLEAR_GLASS.get(),
            HybridBlocksBlocks.GREEN_STAINED_CLEAR_GLASS.get(),
            HybridBlocksBlocks.RED_STAINED_CLEAR_GLASS.get(),
            HybridBlocksBlocks.BLACK_STAINED_CLEAR_GLASS.get(),
            HybridBlocksBlocks.CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.WHITE_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.ORANGE_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.MAGENTA_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.YELLOW_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.LIME_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.PINK_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.GRAY_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.CYAN_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.PURPLE_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.BLUE_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.BROWN_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.GREEN_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.RED_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.BLACK_STAINED_CLEAR_GLASS_PANE.get(),
        )
    }
}