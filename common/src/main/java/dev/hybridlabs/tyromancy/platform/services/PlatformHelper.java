package dev.hybridlabs.tyromancy.platform.services;

import net.minecraft.world.level.block.state.BlockBehaviour;

import java.nio.file.Path;

public interface PlatformHelper {

    String getPlatformName();

    boolean isModLoaded(String modId);

    boolean isDevelopmentEnvironment();

    default String getEnvironmentName() {

        return isDevelopmentEnvironment() ? "development" : "production";
    }

    Path getConfigDir();

    BlockBehaviour.Properties getBlockSettings();

}