package main.kotlin.dev.hybridlabs.blocks

import main.kotlin.dev.hybridlabs.blocks.item.HBItemGroups

@Suppress("UnusedExpression")
@Mod(Constants.MOD_ID)
object HybridAquaticForge {


    init {

        CommonClass.init()

        HBBlocks
        HBBlockEntityTypes
        HBItems
        HBItemGroups
    }

}