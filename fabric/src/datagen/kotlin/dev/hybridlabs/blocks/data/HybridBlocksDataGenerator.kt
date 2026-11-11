package dev.hybridlabs.blocks.data

import dev.hybridlabs.blocks.Constants
import dev.hybridlabs.blocks.data.client.LanguageProvider
import dev.hybridlabs.blocks.data.client.ModelProvider
import dev.hybridlabs.blocks.data.server.BlockLootTableProvider
import dev.hybridlabs.blocks.data.server.BlockTagProvider
import dev.hybridlabs.blocks.data.server.RecipeProvider
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import net.minecraft.core.Registry

/**
 * The data generator for Hybrid Blocks.
 */
object HybridBlocksDataGenerator : DataGeneratorEntrypoint {
    override fun onInitializeDataGenerator(generator: FabricDataGenerator) {
        val pack = generator.createPack()
        pack.addProvider(FabricDataGenerator.Pack.Factory(::ModelProvider))
        pack.addProvider(FabricDataGenerator.Pack.RegistryDependentFactory(::LanguageProvider))
        pack.addProvider(FabricDataGenerator.Pack.RegistryDependentFactory(::BlockLootTableProvider))
        pack.addProvider(FabricDataGenerator.Pack.RegistryDependentFactory(::BlockTagProvider))
        pack.addProvider(FabricDataGenerator.Pack.RegistryDependentFactory(::RecipeProvider))
    }

    fun <T : Any> filterHybridBlocks(registry: Registry<T>): (T) -> Boolean {
        return { o ->
            val id = registry.getKey(o)
            id!!.namespace == Constants.MOD_ID
        }
    }
}
