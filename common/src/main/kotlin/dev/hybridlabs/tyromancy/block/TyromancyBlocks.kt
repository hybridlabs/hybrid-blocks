package dev.hybridlabs.tyromancy.block

import dev.hybridlabs.tyromancy.TyromancyCommon
import dev.hybridlabs.tyromancy.platform.registration.RegistryObject
import net.minecraft.world.item.DyeColor
import net.minecraft.world.level.block.*
import net.minecraft.world.level.block.state.BlockBehaviour
import java.util.function.Supplier

/**
 * All Tyromancy blocks.
 */
object TyromancyBlocks {

    private fun register(id: String, block: Supplier<Block>): RegistryObject<Block> {
        return TyromancyCommon.BLOCKS.register(id, block)
    }
}
