package dev.hybridlabs.blocks.block.entity

import dev.hybridlabs.blocks.block.ChimneyBlock
import net.minecraft.core.BlockPos
import net.minecraft.world.level.Level
import net.minecraft.world.level.block.entity.BlockEntity
import net.minecraft.world.level.block.state.BlockState

class ChimneyBlockEntity(
    pos: BlockPos,
    state: BlockState,
) : BlockEntity(HBBlockEntityTypes.CHIMNEY.get(), pos, state) {

    companion object {
        fun particleTick(
            level: Level,
            pos: BlockPos,
            state: BlockState,
            blockEntity: ChimneyBlockEntity,
        ) {
            val random = level.random

            if (random.nextFloat() < 0.15f) {
                ChimneyBlock.makeParticles(level, pos)
            }
        }
    }
}