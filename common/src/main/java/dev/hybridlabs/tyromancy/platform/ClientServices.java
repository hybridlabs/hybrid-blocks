package dev.hybridlabs.tyromancy.platform;

import dev.hybridlabs.tyromancy.platform.services.ClientPlatformHelper;
import static dev.hybridlabs.tyromancy.platform.Services.load;

public class ClientServices {
    public static final ClientPlatformHelper RENDERER = load(ClientPlatformHelper.class);
}