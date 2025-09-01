package dev.hybridlabs.blocks.data.server

import dev.hybridlabs.blocks.HybridBlocks
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.core.registries.Registries
import net.minecraft.tags.BlockTags
import net.minecraft.world.level.block.Block
import java.util.concurrent.CompletableFuture

/**
 * Generates all block tags.
 */
class BlockTagProvider(
    output: FabricDataOutput,
    registriesFuture: CompletableFuture<HolderLookup.Provider>
) : FabricTagProvider<Block>(output, Registries.BLOCK, registriesFuture) {
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
                getOrCreateTagBuilder(BlockTags.WALLS).add(block)
            }

            val slabPath = id.path
            if (setOf(
                    "slab"
                ).any { slabPath.endsWith(it) }) {
                getOrCreateTagBuilder(BlockTags.SLABS).add(block)
            }

            val stairsPath = id.path
            if (setOf(
                    "stairs"
                ).any { stairsPath.endsWith(it) }) {
                getOrCreateTagBuilder(BlockTags.STAIRS).add(block)
            }

            val pickaxePath = id.path
            if (setOf(
                    "quartz",
                    "brick",
                    "bricks",
                    "pillar",
                ).any { pickaxePath.contains(it) }) {
                getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE).add(block)
            }
        }
    }
}
