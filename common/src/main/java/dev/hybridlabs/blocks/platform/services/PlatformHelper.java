package dev.hybridlabs.blocks.platform.services;

import java.nio.file.Path;

public interface PlatformHelper {

    String getPlatformName();

    boolean isModLoaded(String modId);

    boolean isDevelopmentEnvironment();

    default String getEnvironmentName() {

        return isDevelopmentEnvironment() ? "development" : "production";
    }

    Path getConfigDir();

}