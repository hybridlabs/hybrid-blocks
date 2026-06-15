package dev.hybridlabs.blocks.block

import dev.hybridlabs.blocks.block.entity.ChimneyBlockEntity
import dev.hybridlabs.blocks.block.entity.HBBlockEntityTypes
import net.minecraft.core.BlockPos
import net.minecraft.core.particles.ParticleTypes
import net.minecraft.world.entity.Entity
import net.minecraft.world.entity.player.Player
import net.minecraft.world.level.BlockGetter
import net.minecraft.world.level.Level
import net.minecraft.world.level.block.BaseEntityBlock.createTickerHelper
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.EntityBlock
import net.minecraft.world.level.block.entity.BlockEntity
import net.minecraft.world.level.block.entity.BlockEntityTicker
import net.minecraft.world.level.block.entity.BlockEntityType
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.phys.shapes.CollisionContext
import net.minecraft.world.phys.shapes.VoxelShape

class ChimneyBlock(
    private val fireDamage: Int,
    settings: Properties,
) : Block(settings), EntityBlock {

    override fun newBlockEntity(blockPos: BlockPos, blockState: BlockState): BlockEntity {
        return ChimneyBlockEntity(blockPos, blockState)
    }

    override fun <T : BlockEntity> getTicker(
        level: Level,
        state: BlockState,
        type: BlockEntityType<T>
    ): BlockEntityTicker<T>? {
        return if (level.isClientSide) {
            createTickerHelper(
                type,
                HBBlockEntityTypes.CHIMNEY.get(),
                ChimneyBlockEntity::particleTick
            )
        } else {
            null
        }
    }

    override fun onPlace(state: BlockState, world: Level, pos: BlockPos, oldState: BlockState, movedByPiston: Boolean) {
        if (!world.isClientSide) {
            world.scheduleTick(pos, this, 24000)
        }
        super.onPlace(state, world, pos, oldState, movedByPiston)
    }

    override fun stepOn(world: Level, pos: BlockPos, state: BlockState, entity: Entity) {
        if (world.isClientSide) return

        if (entity is Player && !entity.isInvulnerableTo(world.damageSources().hotFloor())) {
                entity.hurt(world.damageSources().hotFloor(), fireDamage.toFloat())
        }

        super.stepOn(world, pos, state, entity)
    }

    override fun getCollisionShape(
        state: BlockState,
        world: BlockGetter,
        pos: BlockPos,
        context: CollisionContext,
    ): VoxelShape {
        return SHAPE
    }

    override fun getShape(
        state: BlockState,
        world: BlockGetter,
        pos: BlockPos,
        context: CollisionContext,
    ): VoxelShape {
        return SHAPE
    }

    companion object {
        
        private val SHAPE: VoxelShape = box(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)

        fun makeParticles(
            level: Level,
            pos: BlockPos,
        ) {
            val random = level.random

            val particle = ParticleTypes.CAMPFIRE_SIGNAL_SMOKE

            level.addParticle(
                particle,
                false,
                pos.x + 0.5 + random.nextDouble() / 3.0 * (if (random.nextBoolean()) 1 else -1),
                pos.y + random.nextDouble() + random.nextDouble(),
                pos.z + 0.5 + random.nextDouble() / 3.0 * (if (random.nextBoolean()) 1 else -1),
                0.0,
                0.03,
                0.0
            )
        }
    }
}