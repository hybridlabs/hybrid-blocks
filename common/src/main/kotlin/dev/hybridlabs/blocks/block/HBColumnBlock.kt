package dev.hybridlabs.blocks.block

import net.minecraft.core.BlockPos
import net.minecraft.core.Direction
import net.minecraft.world.item.context.BlockPlaceContext
import net.minecraft.world.level.BlockGetter
import net.minecraft.world.level.LevelAccessor
import net.minecraft.world.level.LevelReader
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.block.state.StateDefinition
import net.minecraft.world.level.block.state.properties.DripstoneThickness
import net.minecraft.world.level.block.state.properties.EnumProperty
import net.minecraft.world.phys.shapes.CollisionContext
import net.minecraft.world.phys.shapes.VoxelShape

@Suppress("SameParameterValue", "OVERRIDE_DEPRECATION")
class HBColumnBlock(
    properties: Properties,
) : Block(properties) {

    init {
        this.registerDefaultState(
            stateDefinition.any()
                .setValue(THICKNESS, DripstoneThickness.TIP)
        )
    }

    override fun canSurvive(state: BlockState, world: LevelReader, pos: BlockPos): Boolean {
        val supportingPos = pos.below()
        val supportingState = world.getBlockState(supportingPos)
        return supportingState.`is`(this) || supportingState.isFaceSturdy(world, supportingPos, Direction.UP)
    }

    override fun getStateForPlacement(ctx: BlockPlaceContext): BlockState {
        val world = ctx.level
        val pos = ctx.clickedPos
        return defaultBlockState()
            .setValue(THICKNESS, getThickness(world, pos))
    }

    override fun updateShape(
        state: BlockState,
        direction: Direction,
        neighborState: BlockState,
        world: LevelAccessor,
        pos: BlockPos,
        neighborPos: BlockPos,
    ): BlockState {

        return if (direction != Direction.DOWN && direction != Direction.UP) {
            state
        } else {
            state.setValue(THICKNESS, getThickness(world, pos))
        }
    }

    private fun getThickness(world: LevelReader, currentPos: BlockPos): DripstoneThickness {
        val blockAbove = world.getBlockState(currentPos.above())

        return if (blockAbove.`is`(this)) {
            val blockBelow = world.getBlockState(currentPos.below())
            if (blockBelow.`is`(this)) {
                DripstoneThickness.MIDDLE
            } else {
                DripstoneThickness.BASE
            }
        } else {
            DripstoneThickness.TIP
        }
    }

    override fun getCollisionShape(
        state: BlockState,
        world: BlockGetter,
        pos: BlockPos,
        context: CollisionContext,
    ): VoxelShape {
        val offset = state.getOffset(world, pos)
        return SHAPE.move(offset.x, 0.0, offset.z)
    }

    override fun getShape(
        state: BlockState,
        world: BlockGetter,
        pos: BlockPos,
        context: CollisionContext,
    ): VoxelShape {
        val offset = state.getOffset(world, pos)
        return SHAPE.move(offset.x, 0.0, offset.z)
    }


    override fun createBlockStateDefinition(builder: StateDefinition.Builder<Block?, BlockState?>) {
        builder.add(THICKNESS)
    }

    companion object {
        val THICKNESS: EnumProperty<DripstoneThickness> = EnumProperty.create(
            "thickness",
            DripstoneThickness::class.java,
            DripstoneThickness.TIP,
            DripstoneThickness.MIDDLE,
            DripstoneThickness.BASE
        )

        private val SHAPE = box(2.5, 0.0, 2.5, 13.5, 16.0, 13.5)
    }
}
