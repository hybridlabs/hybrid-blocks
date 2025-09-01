package dev.hybridlabs.tyromancy.item

import dev.hybridlabs.tyromancy.Constants
import dev.hybridlabs.tyromancy.TyromancyCommon
import dev.hybridlabs.tyromancy.block.TyromancyBlocks
import dev.hybridlabs.tyromancy.platform.registration.RegistryObject
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.network.chat.Component
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack
import net.minecraft.world.level.block.Blocks

object TyromancyItemGroups {
    val TYROMANCY = register(
        Constants.MOD_ID, CreativeModeTab.builder(CreativeModeTab.Row.TOP,0)
            .title(Component.translatable("itemGroup.${Constants.MOD_ID}.blocks"))
            .icon { ItemStack(Blocks.CAKE) }
            .displayItems { _, entries ->
                BuiltInRegistries.ITEM.forEach { item ->
                    val id = BuiltInRegistries.ITEM.getKey(item)
                    if (id.namespace != Constants.MOD_ID) {
                        return@forEach
                    }
                    if (item is BlockItem) {
                        entries.accept(item)
                    }
                }
            }
            .build()
    )

    private fun register(id: String, itemGroup: CreativeModeTab): RegistryObject<CreativeModeTab> {
        return TyromancyCommon.CREATIVE_MODE_TABS.register(id) { itemGroup }
    }
}
