package dev.hybridlabs.blocks.data.server

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
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(
            *Registries.BLOCK
                .mapNotNull { block ->
                    val identifier = Registries.BLOCK.getId(block)
                    val path = identifier.path
                    if (setOf(
                            "smooth_quartz",
                            "bricks",
                        ).any { path.endsWith(it) }) {
                        identifier
                    } else {
                        null
                    }
                }
                .toTypedArray()
        )
    }
}
