package dev.hybridlabs.client

import dev.hybridlabs.blocks.Constants
import net.minecraft.data.models.model.ModelTemplate
import net.minecraft.data.models.model.TextureSlot
import net.minecraft.resources.ResourceLocation
import java.util.Optional

object HBModelTemplates {
    val TEMPLATE_CHIMNEY: ModelTemplate = create("block/template_chimney", TextureSlot.TEXTURE, TextureSlot.PARTICLE)

    private fun create(id: String, vararg slots: TextureSlot): ModelTemplate {
        return ModelTemplate(Optional.of(
            ResourceLocation(Constants.MOD_ID, id)),
            Optional.empty(), *slots)
    }
}
