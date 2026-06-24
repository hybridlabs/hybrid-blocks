package dev.hybridlabs.blocks.platform.services;

import dev.hybridlabs.blocks.Constants;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.javafmlmod.FMLModContainer;
import net.neoforged.fml.loading.FMLLoader;
import net.neoforged.fml.loading.FMLPaths;
import thedarkcolour.kotlinforforge.neoforge.KotlinModContainer;

import java.nio.file.Path;

public class ForgePlatformHelper implements PlatformHelper {

    public static IEventBus getEventBus() {
        final ModContainer cont = ModList.get().getModContainerById(Constants.MOD_ID).orElseThrow();
        if (cont instanceof FMLModContainer fmlModContainer) {
            return fmlModContainer.getEventBus();
        } else if (cont instanceof KotlinModContainer kotlinModContainer) {
            return kotlinModContainer.getEventBus$kotlinforforge_langNeoForge();
        } else {
            throw new ClassCastException("The container of the mod " + Constants.MOD_ID + " is not a FML one!");
        }
    }

    @Override
    public String getPlatformName() {

        return "Forge";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return !FMLLoader.isProduction();
    }

    @Override
    public Path getConfigDir() {
        return FMLPaths.CONFIGDIR.get();
    }

    @Override
    public BlockBehaviour.Properties getBlockSettings() {
        return BlockBehaviour.Properties.of();
    }
}