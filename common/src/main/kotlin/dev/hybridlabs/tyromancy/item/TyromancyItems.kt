package dev.hybridlabs.tyromancy.item

import dev.hybridlabs.tyromancy.TyromancyCommon
import dev.hybridlabs.tyromancy.block.TyromancyBlocks
import dev.hybridlabs.tyromancy.platform.registration.RegistryObject
import net.minecraft.world.item.Item
import net.minecraft.world.item.BlockItem
import java.util.function.Supplier

/**
 * All Tyromancy items.
 */
@Suppress("unused")
object TyromancyItems {

    private fun <T : Item> register(id: String, item: Supplier<T>): RegistryObject<T> {
        return TyromancyCommon.ITEMS.register(id, item)
    }
}
