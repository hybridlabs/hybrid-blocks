package dev.hybridlabs.tyromancy;

import dev.hybridlabs.tyromancy.platform.Services;
import dev.hybridlabs.tyromancy.platform.registration.RegistrationProvider;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static dev.hybridlabs.tyromancy.Constants.MOD_ID;

public class TyromancyCommon {

    public static final RegistrationProvider<Block> BLOCKS = RegistrationProvider.get(BuiltInRegistries.BLOCK, MOD_ID);
    public static final RegistrationProvider<Item> ITEMS = RegistrationProvider.get(BuiltInRegistries.ITEM, MOD_ID);
    public static final RegistrationProvider<CreativeModeTab> CREATIVE_MODE_TABS =
            RegistrationProvider.get(BuiltInRegistries.CREATIVE_MODE_TAB, MOD_ID);


    public static void init() {

        Constants.LOG.info("Hello from Common init on {}! we are currently in a {} environment!",
                Services.PLATFORM.getPlatformName(),
                Services.PLATFORM.getEnvironmentName());

        if (Services.PLATFORM.isModLoaded(MOD_ID)) {
            Constants.LOG.info("Tyromancy loaded.");
        }
    }
}
