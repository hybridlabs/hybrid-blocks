package dev.hybridlabs.blocks.data.server

import dev.hybridlabs.blocks.HybridBlocks
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceKey
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
                builder(BlockTags.WALLS).add(ResourceKey.create(Registries.BLOCK, id))
            }

            val slabPath = id.path
            if (setOf(
                    "slab"
                ).any { slabPath.endsWith(it) }) {
                builder(BlockTags.SLABS).add(ResourceKey.create(Registries.BLOCK, id))
            }

            val stairsPath = id.path
            if (setOf(
                    "stairs"
                ).any { stairsPath.endsWith(it) }) {
                builder(BlockTags.STAIRS).add(ResourceKey.create(Registries.BLOCK, id))
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
                builder(BlockTags.MINEABLE_WITH_PICKAXE).add(ResourceKey.create(Registries.BLOCK, id))
            }

            val shearsPath = id.path
            if (setOf(
                    "wool",
                ).any { shearsPath.contains(it) }) {
                builder(BlockTags.WOOL).add(ResourceKey.create(Registries.BLOCK, id))
            }
        }
    }
}