package dev.hybridlabs.blocks.item

import dev.hybridlabs.blocks.Constants
import dev.hybridlabs.blocks.HybridBlocksCommon
import dev.hybridlabs.blocks.block.HybridBlocksBlocks
import dev.hybridlabs.blocks.platform.registration.RegistryObject
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.network.chat.Component
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack

object HybridBlocksItemGroups {
    val HYBRID_BLOCKS = register(
        Constants.MOD_ID, CreativeModeTab.builder(CreativeModeTab.Row.TOP,0)
            .title(Component.translatable("itemGroup.${Constants.MOD_ID}.spawn_eggs"))
            .icon { ItemStack(HybridBlocksBlocks.YELLOW_BRICKS.get()) }
            .displayItems { _, entries ->
                BuiltInRegistries.ITEM.forEach { item ->
                    val id = BuiltInRegistries.ITEM.getKey(item)
                    if (id.namespace != Constants.MOD_ID) {
                        return@forEach
                    }
                }
            }
            .build()
    )

    private fun register(id: String, itemGroup: CreativeModeTab): RegistryObject<CreativeModeTab> {
        return HybridBlocksCommon.CREATIVE_MODE_TABS.register(id,{itemGroup})
    }
}
