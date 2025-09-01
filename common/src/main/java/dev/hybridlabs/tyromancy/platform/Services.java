package dev.hybridlabs.tyromancy.platform;

import dev.hybridlabs.tyromancy.Constants;
import dev.hybridlabs.tyromancy.platform.services.*;
import java.util.ServiceLoader;

public class Services {

    public static final PlatformHelper PLATFORM = load(PlatformHelper.class);

    public static <T> T load(Class<T> clazz) {

        final T loadedService = ServiceLoader.load(clazz)
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        Constants.LOG.debug("Loaded {} for service {}", loadedService, clazz);
        return loadedService;
    }
}