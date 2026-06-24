package dev.hybridlabs.blocks

import dev.hybridlabs.blocks.block.HybridBlocksBlocks
import dev.hybridlabs.blocks.block.entity.HBBlockEntityTypes
import dev.hybridlabs.blocks.forge.HybridBlocksModBusEvents
import dev.hybridlabs.blocks.item.HybridBlocksItemGroups
import dev.hybridlabs.blocks.item.HybridBlocksItems
import net.neoforged.fml.common.Mod

@Suppress("UnusedExpression")
@Mod(Constants.MOD_ID)
object HybridBlocksForge {

    init {

        CommonClass.init()

        HybridBlocksBlocks
        HBBlockEntityTypes
        HybridBlocksItems
        HybridBlocksItemGroups

        HybridBlocksModBusEvents
    }

}