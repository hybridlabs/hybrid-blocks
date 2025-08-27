package dev.hybridlabs.blocks

import dev.hybridlabs.blocks.block.HybridBlocksBlocks
import dev.hybridlabs.blocks.block.HybridBlocksFamilies
import dev.hybridlabs.blocks.item.HybridBlocksItemGroups
import dev.hybridlabs.blocks.item.HybridBlocksItems
import net.minecraft.client.Minecraft
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent
import thedarkcolour.kotlinforforge.forge.MOD_BUS
import thedarkcolour.kotlinforforge.forge.runForDist

@Mod(Constants.FORGE_MOD_ID)
object HybridBlocksForge {
    private val LOGGER = Constants.LOG
    init {
        HybridBlocksCommon.init()

        HybridBlocksBlocks
        HybridBlocksFamilies

        HybridBlocksItems
        HybridBlocksItemGroups

        val obj = runForDist(
            clientTarget = {
                MOD_BUS.addListener(HybridBlocksForge::onClientSetup)
                "test"
            },
            serverTarget = {
                MOD_BUS.addListener(HybridBlocksForge::onServerSetup)
                "test"
            })

        println(obj)
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