package dev.hybridlabs.blocks

import dev.hybridlabs.blocks.block.HybridBlocksBlocks
import dev.hybridlabs.blocks.item.HybridBlocksItemGroups
import dev.hybridlabs.blocks.item.HybridBlocksItems
import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object HybridBlocks : ModInitializer {
    const val MOD_ID = "hybrid-blocks"
    const val MOD_NAME = "Hybrid Blocks"

    private val logger = LoggerFactory.getLogger(MOD_ID)

    override fun onInitialize() {
        logger.info("Initializing $MOD_NAME")

        HybridBlocksBlocks

        HybridBlocksItems
        HybridBlocksItemGroups
    }
}
