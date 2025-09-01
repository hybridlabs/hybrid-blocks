package dev.hybridlabs.blocks.data.client

import dev.hybridlabs.blocks.data.HybridBlocksDataGenerator.filterHybridBlocks
import dev.hybridlabs.blocks.item.HybridBlocksItemGroups
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
            BuiltInRegistries.CREATIVE_MODE_TAB.getResourceKey(HybridBlocksItemGroups.HYBRID_BLOCKS.get())
                .orElseThrow { IllegalStateException("Item group not registered") }, "Hybrid Blocks"
        )

        // generate block translations
        BuiltInRegistries.BLOCK
            .filter(filterHybridBlocks(BuiltInRegistries.BLOCK))
            .forEach { block ->
                val id = BuiltInRegistries.BLOCK.getKey(block)
                val path = id.path
                val displayName = path.split('_')
                    .joinToString(" ") { it.replaceFirstChar(Char::titlecase) }

                if (path.endsWith("smooth_quartz")) {
                    builder.add(block, "$displayName Block")
                } else {
                    builder.add(block, displayName)
                }
            }
    }
}
