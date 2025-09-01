package dev.hybridlabs.blocks

import dev.hybridlabs.blocks.Constants.FORGE_MOD_ID
import dev.hybridlabs.blocks.block.HybridBlocksBlocks
import net.minecraft.client.renderer.ItemBlockRenderTypes
import net.minecraft.client.renderer.RenderType
import net.minecraftforge.api.distmarker.Dist
import net.minecraftforge.client.event.EntityRenderersEvent
import net.minecraftforge.eventbus.api.SubscribeEvent
import net.minecraftforge.fml.common.Mod

@Mod.EventBusSubscriber(modid = FORGE_MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = [Dist.CLIENT])
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
