package dev.hybridlabs.blocks.block.entity

import dev.hybridlabs.blocks.CommonClass
import dev.hybridlabs.blocks.block.HybridBlocksBlocks
import dev.hybridlabs.blocks.platform.registration.RegistryObject
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.entity.BlockEntity
import net.minecraft.world.level.block.entity.BlockEntityType

object HBBlockEntityTypes {
    val CHIMNEY =
        register(
            "chimney",
            ::ChimneyBlockEntity,
            HybridBlocksBlocks.WHITE_BRICK_CHIMNEY,
            HybridBlocksBlocks.LIGHT_GRAY_BRICK_CHIMNEY,
            HybridBlocksBlocks.GRAY_BRICK_CHIMNEY,
            HybridBlocksBlocks.BLACK_BRICK_CHIMNEY,
            HybridBlocksBlocks.BROWN_BRICK_CHIMNEY,
            HybridBlocksBlocks.RED_BRICK_CHIMNEY,
            HybridBlocksBlocks.ORANGE_BRICK_CHIMNEY,
            HybridBlocksBlocks.YELLOW_BRICK_CHIMNEY,
            HybridBlocksBlocks.LIME_BRICK_CHIMNEY,
            HybridBlocksBlocks.GREEN_BRICK_CHIMNEY,
            HybridBlocksBlocks.CYAN_BRICK_CHIMNEY,
            HybridBlocksBlocks.LIGHT_BLUE_BRICK_CHIMNEY,
            HybridBlocksBlocks.BLUE_BRICK_CHIMNEY,
            HybridBlocksBlocks.PURPLE_BRICK_CHIMNEY,
            HybridBlocksBlocks.MAGENTA_BRICK_CHIMNEY,
            HybridBlocksBlocks.PINK_BRICK_CHIMNEY,
            HybridBlocksBlocks.MUD_BRICK_CHIMNEY,
            HybridBlocksBlocks.BRICK_CHIMNEY,
            HybridBlocksBlocks.NETHER_BRICK_CHIMNEY,
            HybridBlocksBlocks.RED_NETHER_BRICK_CHIMNEY
        )

    fun <T : BlockEntity?> register(
        id: String,
        factory: BlockEntityType.BlockEntitySupplier<T>, vararg validBlocks: RegistryObject<Block>?,
    ): RegistryObject<BlockEntityType<T?>> {

        return CommonClass.BLOCK_ENTITY_TYPES.register(id) {
            val blocks = validBlocks.map { block -> block?.get() }.toTypedArray()
            val builder = BlockEntityType.Builder.of(factory, *blocks)
            builder.build(null)
        }
    }
}