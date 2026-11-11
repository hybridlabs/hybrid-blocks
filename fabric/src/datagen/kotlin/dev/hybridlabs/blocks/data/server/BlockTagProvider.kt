package dev.hybridlabs.blocks.data.server

import dev.hybridlabs.blocks.HybridBlocks
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.tags.BlockTags
import net.minecraft.world.level.block.Block
import java.util.concurrent.CompletableFuture

/**
 * Generates all block tags.
 */
class BlockTagProvider(
    output: FabricPackOutput,
    registriesFuture: CompletableFuture<HolderLookup.Provider>
) : FabricTagsProvider.BlockTagsProvider(output, registriesFuture) {
    override fun addTags(arg: HolderLookup.Provider) {
        BuiltInRegistries.BLOCK.forEach { block ->
            val id = BuiltInRegistries.BLOCK.getKey(block)
            if (id.namespace != HybridBlocks.MOD_ID) {
                return@forEach
            }

            val wallPath = id.path
            if (setOf(
                    "wall"
                ).any { wallPath.endsWith(it) }) {
                valueLookupBuilder(BlockTags.WALLS).add(block)
            }

            val slabPath = id.path
            if (setOf(
                    "slab"
                ).any { slabPath.endsWith(it) }) {
                valueLookupBuilder(BlockTags.SLABS).add(block)
            }

            val stairsPath = id.path
            if (setOf(
                    "stairs"
                ).any { stairsPath.endsWith(it) }) {
                valueLookupBuilder(BlockTags.STAIRS).add(block)
            }

            val pickaxePath = id.path
            if (setOf(
                    "quartz",
                    "tile",
                    "tiles",
                    "brick",
                    "bricks",
                    "pillar",
                    "column",
                    "shingle",
                    "shingles",
                    "chimney",
                    "polished",
                    "concrete",
                ).any { pickaxePath.contains(it) }) {
                valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE).add(block)
            }

            val shearsPath = id.path
            if (setOf(
                    "wool",
                ).any { shearsPath.contains(it) }) {
                valueLookupBuilder(BlockTags.WOOL).add(block)
            }
        }
    }
}