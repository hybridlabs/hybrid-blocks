package dev.hybridlabs.blocks.platform;

import dev.hybridlabs.blocks.platform.services.ClientPlatformHelper;
import static dev.hybridlabs.blocks.platform.Services.load;

public class ClientServices {
    public static final ClientPlatformHelper PLATFORM = load(ClientPlatformHelper.class);
}