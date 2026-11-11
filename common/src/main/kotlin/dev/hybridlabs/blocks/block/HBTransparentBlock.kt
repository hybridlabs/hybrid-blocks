package dev.hybridlabs.blocks.block

import net.minecraft.core.BlockPos
import net.minecraft.world.level.BlockGetter
import net.minecraft.world.level.block.HalfTransparentBlock
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.phys.shapes.CollisionContext
import net.minecraft.world.phys.shapes.Shapes
import net.minecraft.world.phys.shapes.VoxelShape

open class HBTransparentBlock(properties: Properties) : HalfTransparentBlock(properties) {
    override fun getVisualShape(
        blockState: BlockState,
        blockGetter: BlockGetter,
        blockPos: BlockPos,
        collisionContext: CollisionContext,
    ): VoxelShape {
        return Shapes.empty()
    }

    override fun getShadeBrightness(
        blockState: BlockState,
        blockGetter: BlockGetter,
        blockPos: BlockPos
    ): Float {
        return 1.0f
    }

    override fun propagatesSkylightDown(
        blockState: BlockState,
    ): Boolean {
        return true
    }
}