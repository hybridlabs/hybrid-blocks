package dev.hybridlabs.blocks

import dev.hybridlabs.blocks.Constants.MOD_ID
import net.neoforged.api.distmarker.Dist
import net.neoforged.fml.common.Mod

@Mod(MOD_ID, dist = [Dist.CLIENT])
object HybridBlocksClient {
    // Render layers are determined automatically in 26.1 from the sprites' translucency,
    // so there is nothing to register here anymore.
}
