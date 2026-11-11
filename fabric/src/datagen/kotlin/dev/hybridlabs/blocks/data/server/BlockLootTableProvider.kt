package dev.hybridlabs.blocks.data.server

import dev.hybridlabs.blocks.HybridBlocks
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.BuiltInRegistries
import java.util.concurrent.CompletableFuture

/**
 * Generates block loot tables.
 */
class BlockLootTableProvider(output: FabricPackOutput, registryLookup: CompletableFuture<HolderLookup.Provider>) :
    FabricBlockLootSubProvider(output, registryLookup) {
    override fun generate() {
        BuiltInRegistries.BLOCK
            .filter { block ->
                val id = BuiltInRegistries.BLOCK.getKey(block)
                id.namespace == HybridBlocks.MOD_ID
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