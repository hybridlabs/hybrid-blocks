package dev.hybridlabs.tyromancy

import dev.hybridlabs.tyromancy.block.TyromancyBlocks
import dev.hybridlabs.tyromancy.item.TyromancyItemGroups
import dev.hybridlabs.tyromancy.item.TyromancyItems
import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object Tyromancy : ModInitializer {
    const val MOD_ID = "tyromancy"
    const val MOD_NAME = "Tyromancy"

    private val logger = LoggerFactory.getLogger(MOD_ID)

    override fun onInitialize() {
        logger.info("Initializing $MOD_NAME")

        TyromancyBlocks

        TyromancyItems
        TyromancyItemGroups
    }
}
