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

            val wallPath = identifier.path
            if (setOf(
                    "wall"
                ).any { wallPath.endsWith(it) }) {
                getOrCreateTagBuilder(BlockTags.WALLS).add(block)
            }

            val slabPath = identifier.path
            if (setOf(
                    "slab"
                ).any { slabPath.endsWith(it) }) {
                getOrCreateTagBuilder(BlockTags.SLABS).add(block)
            }

            val stairsPath = identifier.path
            if (setOf(
                    "stairs"
                ).any { stairsPath.endsWith(it) }) {
                getOrCreateTagBuilder(BlockTags.STAIRS).add(block)
            }

            val pickaxePath = identifier.path
            if (setOf(
                    "quartz",
                    "brick",
                    "bricks",
                    "pillar",
                ).any { pickaxePath.contains(it) }) {
                getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(block)
            }
        }
    }
}
