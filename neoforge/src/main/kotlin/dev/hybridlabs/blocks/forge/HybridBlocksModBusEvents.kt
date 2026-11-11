package dev.hybridlabs.blocks.forge

import dev.hybridlabs.blocks.Constants
import net.neoforged.fml.event.lifecycle.FMLDedicatedServerSetupEvent
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS
import thedarkcolour.kotlinforforge.neoforge.forge.runForDist

object HybridBlocksModBusEvents {
    init {
        runForDist(
            clientTarget = {},
            serverTarget = {
                MOD_BUS.addListener(::onServerSetup)
            })
    }

    private fun onServerSetup(event: FMLDedicatedServerSetupEvent) {
        Constants.LOGGER.info("Server starting...")
    }
}
