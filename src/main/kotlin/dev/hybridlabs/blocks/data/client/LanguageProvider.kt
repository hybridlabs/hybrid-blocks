package dev.hybridlabs.blocks.data.client

import dev.hybridlabs.blocks.HybridBlocks
import dev.hybridlabs.blocks.item.HybridBlocksItemGroups
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.Registries

/**
 * Generates the English (US) language file.
 */
class LanguageProvider(output: FabricDataOutput) : FabricLanguageProvider(output) {
    override fun generateTranslations(builder: TranslationBuilder) {
        // generate item group translation
        builder.add(Registries.ITEM_GROUP.getKey(HybridBlocksItemGroups.ALL).orElseThrow(), HybridBlocks.MOD_NAME)

        // generate block translations
        Registries.BLOCK
            .associateWith { block ->
                val identifier = Registries.BLOCK.getId(block)
                identifier
            }
            .filter { it.value.namespace == HybridBlocks.MOD_ID }
            .mapValues { it.value.path }
            .forEach { (block, path) ->
                val uppercased = path.split('_').joinToString(" ") { it.replaceFirstChar(Char::uppercaseChar) }
                if (path.endsWith("smooth_quartz")) {
                    builder.add(block, "$uppercased Block")
                } else {
                    builder.add(block, uppercased)
                }
            }
    }
}
