package dev.hybridlabs.tyromancy

import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.minecraft.client.renderer.RenderType

object TyromancyClient : ClientModInitializer {
    override fun onInitializeClient() {
        registerBlockRenderLayers()
    }

    private fun registerBlockRenderLayers(registry: BlockRenderLayerMap = BlockRenderLayerMap.INSTANCE) {
        registry.putBlocks(
            RenderType.translucent(),
        )
    }
}