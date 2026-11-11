package dev.hybridlabs.blocks.item;

import dev.hybridlabs.blocks.Constants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTab;

/**
 * Fills the Hybrid Blocks creative tab. Written in Java because {@code CreativeModeTab.Output}
 * became protected in 26.1: Java infers the parameter types of the lambda without naming the
 * protected type, Kotlin cannot.
 */
public class HybridBlocksTabDisplay {
    public static final CreativeModeTab.DisplayItemsGenerator DISPLAY_ITEMS = (parameters, output) ->
            BuiltInRegistries.ITEM.forEach(item -> {
                var id = BuiltInRegistries.ITEM.getKey(item);
                if (id.getNamespace().equals(Constants.MOD_ID)) {
                    output.accept(item);
                }
            });
}
