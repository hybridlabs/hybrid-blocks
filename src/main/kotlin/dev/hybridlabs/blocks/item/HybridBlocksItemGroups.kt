package dev.hybridlabs.blocks.item

import dev.hybridlabs.blocks.HybridBlocks
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier

object HybridBlocksItemGroups {
    val ALL = register("item_group",
        FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.${HybridBlocks.MOD_ID}"))
            .icon { ItemStack(HybridBlocksItems.CRACKED_BRICKS) }
            .entries { _, entries ->
                Registries.BLOCK.filter { block ->
                    val identifier = Registries.BLOCK.getId(block)
                    identifier.namespace == HybridBlocks.MOD_ID
                }.forEach(entries::add)
            }
            .build()
    )

    private fun register(id: String, itemGroup: ItemGroup): ItemGroup {
        return Registry.register(Registries.ITEM_GROUP, Identifier(HybridBlocks.MOD_ID, id), itemGroup)
    }
}
