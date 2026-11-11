package dev.hybridlabs.blocks.forge

import dev.hybridlabs.blocks.Constants
import dev.hybridlabs.blocks.client.render.block.HBBlockRenderers
import net.minecraftforge.client.event.EntityRenderersEvent
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent
import thedarkcolour.kotlinforforge.forge.MOD_BUS
import thedarkcolour.kotlinforforge.forge.runForDist

object HybridBlocksModBusEvents {
    init {
        runForDist(
            clientTarget = {
                MOD_BUS.addListener(::registerBlockEntityRenderers)
            },
            serverTarget = {
                MOD_BUS.addListener(::onServerSetup)
            })
    }

    private fun registerBlockEntityRenderers(event: EntityRenderersEvent.RegisterRenderers) {
        HBBlockRenderers.registerRenderShapes()
    }

    private fun onServerSetup(event: FMLDedicatedServerSetupEvent) {
        Constants.LOGGER.info("Server starting...")
    }
}
