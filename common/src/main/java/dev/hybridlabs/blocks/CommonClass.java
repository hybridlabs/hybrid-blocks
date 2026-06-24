package dev.hybridlabs.blocks;

import dev.hybridlabs.blocks.platform.Services;
import dev.hybridlabs.blocks.platform.registration.RegistrationProvider;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

import static dev.hybridlabs.blocks.Constants.MOD_ID;
import static dev.hybridlabs.blocks.Constants.MOD_NAME;

public class CommonClass {

    public static final RegistrationProvider<Block> BLOCKS =
            RegistrationProvider.get(BuiltInRegistries.BLOCK, MOD_ID);
    public static final RegistrationProvider<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            RegistrationProvider.get(BuiltInRegistries.BLOCK_ENTITY_TYPE, MOD_ID);
    public static final RegistrationProvider<Item> ITEMS =
            RegistrationProvider.get(BuiltInRegistries.ITEM, MOD_ID);
    public static final RegistrationProvider<CreativeModeTab> CREATIVE_MODE_TABS =
            RegistrationProvider.get(BuiltInRegistries.CREATIVE_MODE_TAB, MOD_ID);

    public static ResourceLocation locate(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    public static void init() {
        if (Services.PLATFORM.isModLoaded(MOD_ID)) {
            Constants.LOGGER.info("{} loaded.", MOD_NAME);
        }
    }
}
