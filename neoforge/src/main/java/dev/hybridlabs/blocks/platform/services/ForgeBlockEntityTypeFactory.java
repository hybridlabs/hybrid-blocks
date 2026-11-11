package dev.hybridlabs.blocks.platform.services;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class ForgeBlockEntityTypeFactory implements BlockEntityTypeFactory {

    @Override
    public <T extends BlockEntity> BlockEntityType<T> create(BlockEntityType.BlockEntitySupplier<T> factory, Block... blocks) {
        return new BlockEntityType<>(factory, blocks);
    }
}
