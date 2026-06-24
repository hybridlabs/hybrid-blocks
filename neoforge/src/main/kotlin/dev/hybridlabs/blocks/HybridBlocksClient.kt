package dev.hybridlabs.blocks

import dev.hybridlabs.blocks.Constants.MOD_ID
import dev.hybridlabs.blocks.block.HybridBlocksBlocks
import net.minecraft.client.renderer.ItemBlockRenderTypes
import net.minecraft.client.renderer.RenderType
import net.neoforged.api.distmarker.Dist
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.common.Mod
import net.neoforged.neoforge.client.event.EntityRenderersEvent

@Mod(MOD_ID, dist = [Dist.CLIENT])
object HybridBlocksClient {
    @SubscribeEvent
    fun onRegisterRenderers(event: EntityRenderersEvent.RegisterRenderers) {
        registerBlockRenderLayers()
    }

    private fun registerBlockRenderLayers() {
        val translucent = RenderType.translucent()

        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.CLEAR_GLASS.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.WHITE_STAINED_CLEAR_GLASS.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.ORANGE_STAINED_CLEAR_GLASS.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.MAGENTA_STAINED_CLEAR_GLASS.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.YELLOW_STAINED_CLEAR_GLASS.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.LIME_STAINED_CLEAR_GLASS.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.PINK_STAINED_CLEAR_GLASS.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.GRAY_STAINED_CLEAR_GLASS.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.CYAN_STAINED_CLEAR_GLASS.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.PURPLE_STAINED_CLEAR_GLASS.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.BLUE_STAINED_CLEAR_GLASS.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.BROWN_STAINED_CLEAR_GLASS.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.GREEN_STAINED_CLEAR_GLASS.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.RED_STAINED_CLEAR_GLASS.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.BLACK_STAINED_CLEAR_GLASS.get(), translucent)

        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.CLEAR_GLASS_PANE.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.WHITE_STAINED_CLEAR_GLASS_PANE.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.ORANGE_STAINED_CLEAR_GLASS_PANE.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.MAGENTA_STAINED_CLEAR_GLASS_PANE.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS_PANE.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.YELLOW_STAINED_CLEAR_GLASS_PANE.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.LIME_STAINED_CLEAR_GLASS_PANE.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.PINK_STAINED_CLEAR_GLASS_PANE.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.GRAY_STAINED_CLEAR_GLASS_PANE.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS_PANE.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.CYAN_STAINED_CLEAR_GLASS_PANE.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.PURPLE_STAINED_CLEAR_GLASS_PANE.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.BLUE_STAINED_CLEAR_GLASS_PANE.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.BROWN_STAINED_CLEAR_GLASS_PANE.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.GREEN_STAINED_CLEAR_GLASS_PANE.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.RED_STAINED_CLEAR_GLASS_PANE.get(), translucent)
        ItemBlockRenderTypes.setRenderLayer(HybridBlocksBlocks.BLACK_STAINED_CLEAR_GLASS_PANE.get(), translucent)
    }
}