package dev.hybridlabs.tyromancy.data.server

import dev.hybridlabs.tyromancy.Tyromancy
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider
import net.minecraft.core.registries.BuiltInRegistries

/**
 * Generates block loot tables.
 */
class BlockLootTableProvider(output: FabricDataOutput) : FabricBlockLootTableProvider(output) {
    override fun generate() {
        BuiltInRegistries.BLOCK
            .filter { block ->
                val id = BuiltInRegistries.BLOCK.getKey(block)
                id.namespace == Tyromancy.MOD_ID
            }
            .forEach { block ->
                val id = BuiltInRegistries.BLOCK.getKey(block)
                if (id.path.endsWith("slab")) {
                    add(block, createSlabItemTable(block))
                } else {
                    dropSelf(block)
                }
            }
    }
}