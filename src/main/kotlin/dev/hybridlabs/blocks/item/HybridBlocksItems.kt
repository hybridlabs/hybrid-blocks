package dev.hybridlabs.blocks.item

import dev.hybridlabs.blocks.HybridBlocks
import dev.hybridlabs.blocks.block.HybridBlocksBlocks
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

/**
 * All Hybrid Blocks items.
 */
@Suppress("unused")
object HybridBlocksItems {
    val WHITE_STAINED_SMOOTH_QUARTZ = register("white_stained_smooth_quartz") { BlockItem(HybridBlocksBlocks.WHITE_STAINED_SMOOTH_QUARTZ, it) }
    val ORANGE_STAINED_SMOOTH_QUARTZ = register("orange_stained_smooth_quartz") { BlockItem(HybridBlocksBlocks.ORANGE_STAINED_SMOOTH_QUARTZ, it) }
    val MAGENTA_STAINED_SMOOTH_QUARTZ = register("magenta_stained_smooth_quartz") { BlockItem(HybridBlocksBlocks.MAGENTA_STAINED_SMOOTH_QUARTZ, it) }
    val LIGHT_BLUE_STAINED_SMOOTH_QUARTZ = register("light_blue_stained_smooth_quartz") { BlockItem(HybridBlocksBlocks.LIGHT_BLUE_STAINED_SMOOTH_QUARTZ, it) }
    val YELLOW_STAINED_SMOOTH_QUARTZ = register("yellow_stained_smooth_quartz") { BlockItem(HybridBlocksBlocks.YELLOW_STAINED_SMOOTH_QUARTZ, it) }
    val LIME_STAINED_SMOOTH_QUARTZ = register("lime_stained_smooth_quartz") { BlockItem(HybridBlocksBlocks.LIME_STAINED_SMOOTH_QUARTZ, it) }
    val PINK_STAINED_SMOOTH_QUARTZ = register("pink_stained_smooth_quartz") { BlockItem(HybridBlocksBlocks.PINK_STAINED_SMOOTH_QUARTZ, it) }
    val GRAY_STAINED_SMOOTH_QUARTZ = register("gray_stained_smooth_quartz") { BlockItem(HybridBlocksBlocks.GRAY_STAINED_SMOOTH_QUARTZ, it) }
    val LIGHT_GRAY_STAINED_SMOOTH_QUARTZ = register("light_gray_stained_smooth_quartz") { BlockItem(HybridBlocksBlocks.LIGHT_GRAY_STAINED_SMOOTH_QUARTZ, it) }
    val CYAN_STAINED_SMOOTH_QUARTZ = register("cyan_stained_smooth_quartz") { BlockItem(HybridBlocksBlocks.CYAN_STAINED_SMOOTH_QUARTZ, it) }
    val PURPLE_STAINED_SMOOTH_QUARTZ = register("purple_stained_smooth_quartz") { BlockItem(HybridBlocksBlocks.PURPLE_STAINED_SMOOTH_QUARTZ, it) }
    val BLUE_STAINED_SMOOTH_QUARTZ = register("blue_stained_smooth_quartz") { BlockItem(HybridBlocksBlocks.BLUE_STAINED_SMOOTH_QUARTZ, it) }
    val BROWN_STAINED_SMOOTH_QUARTZ = register("brown_stained_smooth_quartz") { BlockItem(HybridBlocksBlocks.BROWN_STAINED_SMOOTH_QUARTZ, it) }
    val GREEN_STAINED_SMOOTH_QUARTZ = register("green_stained_smooth_quartz") { BlockItem(HybridBlocksBlocks.GREEN_STAINED_SMOOTH_QUARTZ, it) }
    val RED_STAINED_SMOOTH_QUARTZ = register("red_stained_smooth_quartz") { BlockItem(HybridBlocksBlocks.RED_STAINED_SMOOTH_QUARTZ, it) }
    val BLACK_STAINED_SMOOTH_QUARTZ = register("black_stained_smooth_quartz") { BlockItem(HybridBlocksBlocks.BLACK_STAINED_SMOOTH_QUARTZ, it) }

    val WHITE_STAINED_BRICKS = register("white_stained_bricks") { BlockItem(HybridBlocksBlocks.WHITE_STAINED_BRICKS, it) }
    val ORANGE_STAINED_BRICKS = register("orange_stained_bricks") { BlockItem(HybridBlocksBlocks.ORANGE_STAINED_BRICKS, it) }
    val MAGENTA_STAINED_BRICKS = register("magenta_stained_bricks") { BlockItem(HybridBlocksBlocks.MAGENTA_STAINED_BRICKS, it) }
    val LIGHT_BLUE_STAINED_BRICKS = register("light_blue_stained_bricks") { BlockItem(HybridBlocksBlocks.LIGHT_BLUE_STAINED_BRICKS, it) }
    val YELLOW_STAINED_BRICKS = register("yellow_stained_bricks") { BlockItem(HybridBlocksBlocks.YELLOW_STAINED_BRICKS, it) }
    val LIME_STAINED_BRICKS = register("lime_stained_bricks") { BlockItem(HybridBlocksBlocks.LIME_STAINED_BRICKS, it) }
    val PINK_STAINED_BRICKS = register("pink_stained_bricks") { BlockItem(HybridBlocksBlocks.PINK_STAINED_BRICKS, it) }
    val GRAY_STAINED_BRICKS = register("gray_stained_bricks") { BlockItem(HybridBlocksBlocks.GRAY_STAINED_BRICKS, it) }
    val LIGHT_GRAY_STAINED_BRICKS = register("light_gray_stained_bricks") { BlockItem(HybridBlocksBlocks.LIGHT_GRAY_STAINED_BRICKS, it) }
    val CYAN_STAINED_BRICKS = register("cyan_stained_bricks") { BlockItem(HybridBlocksBlocks.CYAN_STAINED_BRICKS, it) }
    val PURPLE_STAINED_BRICKS = register("purple_stained_bricks") { BlockItem(HybridBlocksBlocks.PURPLE_STAINED_BRICKS, it) }
    val BLUE_STAINED_BRICKS = register("blue_stained_bricks") { BlockItem(HybridBlocksBlocks.BLUE_STAINED_BRICKS, it) }
    val BROWN_STAINED_BRICKS = register("brown_stained_bricks") { BlockItem(HybridBlocksBlocks.BROWN_STAINED_BRICKS, it) }
    val GREEN_STAINED_BRICKS = register("green_stained_bricks") { BlockItem(HybridBlocksBlocks.GREEN_STAINED_BRICKS, it) }
    val RED_STAINED_BRICKS = register("red_stained_bricks") { BlockItem(HybridBlocksBlocks.RED_STAINED_BRICKS, it) }
    val BLACK_STAINED_BRICKS = register("black_stained_bricks") { BlockItem(HybridBlocksBlocks.BLACK_STAINED_BRICKS, it) }

    private fun register(id: String, item: (settings: Item.Settings) -> Item): Item {
        return Registry.register(Registries.ITEM, Identifier(HybridBlocks.MOD_ID, id), item(Item.Settings()))
    }
}