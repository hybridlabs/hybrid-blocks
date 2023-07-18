package dev.hybridlabs.blocks.data.server

import dev.hybridlabs.blocks.HybridBlocks
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider
import net.minecraft.registry.Registries

/**
 * Generates block loot tables.
 */
class BlockLootTableProvider(output: FabricDataOutput) : FabricBlockLootTableProvider(output) {
    override fun generate() {
        Registries.BLOCK
            .filter { block ->
                val identifier = Registries.BLOCK.getId(block)
                identifier.namespace == HybridBlocks.MOD_ID
            }
            .forEach(::addDrop)
    }
}
