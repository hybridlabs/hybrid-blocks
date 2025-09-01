package dev.hybridlabs.tyromancy.data

import dev.hybridlabs.tyromancy.Constants
import dev.hybridlabs.tyromancy.data.client.LanguageProvider
import dev.hybridlabs.tyromancy.data.client.ModelProvider
import dev.hybridlabs.tyromancy.data.server.BlockLootTableProvider
import dev.hybridlabs.tyromancy.data.server.BlockTagProvider
import dev.hybridlabs.tyromancy.data.server.RecipeProvider
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import net.minecraft.core.Registry

/**
 * The data generator for Tyromancy.
 */
object TyromancyDataGenerator : DataGeneratorEntrypoint {
    override fun onInitializeDataGenerator(generator: FabricDataGenerator) {
        val pack = generator.createPack()
        pack.addProvider(::ModelProvider)
        pack.addProvider(::LanguageProvider)
        pack.addProvider(::BlockLootTableProvider)
        pack.addProvider(::BlockTagProvider)
        pack.addProvider(::RecipeProvider)
    }

    fun <T> filterTyromancy(registry: Registry<T>): (T) -> Boolean {
        return { o ->
            val id = registry.getKey(o)
            id?.namespace == Constants.MOD_ID
        }
    }
}
