package dev.hybridlabs.tyromancy

import dev.hybridlabs.tyromancy.block.TyromancyBlocks
import dev.hybridlabs.tyromancy.item.TyromancyItemGroups
import dev.hybridlabs.tyromancy.item.TyromancyItems
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent
import thedarkcolour.kotlinforforge.forge.MOD_BUS
import thedarkcolour.kotlinforforge.forge.runForDist

@Suppress("UnusedExpression")
@Mod(Constants.FORGE_MOD_ID)
object TyromancyForge {
    private val LOGGER = Constants.LOG

    init {
        TyromancyCommon.init()

        TyromancyBlocks

        TyromancyItems
        TyromancyItemGroups

        runForDist(
            clientTarget = {
                MOD_BUS.addListener(TyromancyForge::onClientSetup)
                "test"
            },
            serverTarget = {
                MOD_BUS.addListener(TyromancyForge::onServerSetup)
                "test"
            }
        )
    }

    private fun onClientSetup(event: FMLClientSetupEvent) {
        LOGGER.info("Initializing client...")
    }

    /**
     * Fired on the global Forge bus.
     */
    private fun onServerSetup(event: FMLDedicatedServerSetupEvent) {
        LOGGER.info("Server starting...")
    }
}