package dev.hybridlabs.blocks.platform.services;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

/**
 * Creates {@link BlockEntityType}s. Vanilla made the constructor private in 26.1, so each loader
 * provides its own way of constructing them: Fabric via its object builder API, NeoForge via its
 * own public constructor patch.
 */
public interface BlockEntityTypeFactory {
    BlockEntityTypeFactory INSTANCE = dev.hybridlabs.blocks.platform.Services.load(BlockEntityTypeFactory.class);

    <T extends BlockEntity> BlockEntityType<T> create(BlockEntityType.BlockEntitySupplier<T> factory, Block... blocks);
}
