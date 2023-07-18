package dev.hybridlabs.blocks.data

import dev.hybridlabs.blocks.data.client.LanguageProvider
import dev.hybridlabs.blocks.data.client.ModelProvider
import dev.hybridlabs.blocks.data.server.BlockLootTableProvider
import dev.hybridlabs.blocks.data.server.BlockTagProvider
import dev.hybridlabs.blocks.data.server.RecipeProvider
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator

/**
 * The data generator for Hybrid Blocks.
 */
object HybridBlocksDataGenerator : DataGeneratorEntrypoint {
    override fun onInitializeDataGenerator(generator: FabricDataGenerator) {
        val pack = generator.createPack()
        pack.addProvider(::ModelProvider)
        pack.addProvider(::LanguageProvider)
        pack.addProvider(::BlockLootTableProvider)
        pack.addProvider(::BlockTagProvider)
        pack.addProvider(::RecipeProvider)
    }
}
