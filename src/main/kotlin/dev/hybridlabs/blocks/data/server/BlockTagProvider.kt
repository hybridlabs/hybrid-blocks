package dev.hybridlabs.blocks.data.server

import dev.hybridlabs.blocks.HybridBlocks
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.registry.Registries
import net.minecraft.registry.RegistryWrapper
import net.minecraft.registry.tag.BlockTags
import java.util.concurrent.CompletableFuture

/**
 * Generates all block tags.
 */
class BlockTagProvider(output: FabricDataOutput, future: CompletableFuture<RegistryWrapper.WrapperLookup>) : FabricTagProvider.BlockTagProvider(output, future) {
    override fun configure(arg: RegistryWrapper.WrapperLookup) {
        Registries.BLOCK.forEach { block ->
            val identifier = Registries.BLOCK.getId(block)
            if (identifier.namespace != HybridBlocks.MOD_ID) {
                return@forEach
            }

            val path = identifier.path
            if (setOf(
                    "smooth_quartz",
                    "bricks",
                    "pillar",
                ).any { path.endsWith(it) }) {
                getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block)
            }
        }
    }
}
