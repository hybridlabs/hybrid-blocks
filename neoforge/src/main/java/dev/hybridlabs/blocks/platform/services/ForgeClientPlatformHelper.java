package dev.hybridlabs.blocks.platform.services;


import dev.hybridlabs.blocks.platform.registration.RegistryObject;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.Block;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

public class ForgeClientPlatformHelper implements ClientPlatformHelper {

    @Override
    @OnlyIn(Dist.CLIENT)
    public <E extends Entity> void registerEntityRenderer(RegistryObject<EntityType<E>> entityType, EntityRendererProvider<E> entityRendererFactory) {}

    @Override
    public void registerBlockRenderers(RenderType renderType, Block... blocks) {
        for (Block block : blocks) {
            ItemBlockRenderTypes.setRenderLayer(block, renderType);
        }
    }
}