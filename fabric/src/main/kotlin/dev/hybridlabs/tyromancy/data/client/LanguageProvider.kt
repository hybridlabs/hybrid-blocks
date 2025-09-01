package dev.hybridlabs.tyromancy.data.client

import dev.hybridlabs.tyromancy.data.TyromancyDataGenerator.filterTyromancy
import dev.hybridlabs.tyromancy.item.TyromancyItemGroups
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.core.registries.BuiltInRegistries

/**
 * Generates the English (US) language file.
 */
class LanguageProvider(output: FabricDataOutput) : FabricLanguageProvider(output) {
    override fun generateTranslations(builder: TranslationBuilder) {
        // generate item group translation
        builder.add(
            BuiltInRegistries.CREATIVE_MODE_TAB.getResourceKey(TyromancyItemGroups.TYROMANCY.get())
                .orElseThrow { IllegalStateException("Item group not registered") }, "Tyromancy"
        )

        // generate block translations
        BuiltInRegistries.BLOCK
            .filter(filterTyromancy(BuiltInRegistries.BLOCK))
            .forEach { block ->
                val id = BuiltInRegistries.BLOCK.getKey(block)
                val path = id.path
                val displayName = path.split('_')
                    .joinToString(" ") { it.replaceFirstChar(Char::titlecase) }

                builder.add(block, displayName)
            }
    }
}
