package dev.hybridlabs.blocks.item

import dev.hybridlabs.blocks.HybridBlocksCommon
import dev.hybridlabs.blocks.block.HybridBlocksBlocks
import dev.hybridlabs.blocks.platform.registration.RegistryObject
import net.minecraft.world.item.Item
import net.minecraft.world.item.BlockItem
import java.util.function.Supplier

/**
 * All Hybrid Blocks items.
 */
@Suppress("unused")
object HybridBlocksItems {

    //#region Quartz
    val WHITE_QUARTZ_BLOCK = register("white_quartz_block") { BlockItem(HybridBlocksBlocks.WHITE_QUARTZ_BLOCK.get(), Item.Properties()) }
    val WHITE_QUARTZ_STAIRS = register("white_quartz_stairs") { BlockItem(HybridBlocksBlocks.WHITE_QUARTZ_STAIRS.get(), Item.Properties()) }
    val WHITE_QUARTZ_SLAB = register("white_quartz_slab") { BlockItem(HybridBlocksBlocks.WHITE_QUARTZ_SLAB.get(), Item.Properties()) }
    val CHISELED_WHITE_QUARTZ_BLOCK = register("chiseled_white_quartz_block") { BlockItem(HybridBlocksBlocks.CHISELED_WHITE_QUARTZ_BLOCK.get(), Item.Properties()) }
    val WHITE_QUARTZ_BRICKS = register("white_quartz_bricks") { BlockItem(HybridBlocksBlocks.WHITE_QUARTZ_BRICKS.get(), Item.Properties()) }
    val WHITE_QUARTZ_PILLAR = register("white_quartz_pillar") { BlockItem(HybridBlocksBlocks.WHITE_QUARTZ_PILLAR.get(), Item.Properties()) }
    val SMOOTH_WHITE_QUARTZ = register("smooth_white_quartz") { BlockItem(HybridBlocksBlocks.SMOOTH_WHITE_QUARTZ.get(), Item.Properties()) }
    val SMOOTH_WHITE_QUARTZ_STAIRS = register("smooth_white_quartz_stairs") { BlockItem(HybridBlocksBlocks.SMOOTH_WHITE_QUARTZ_STAIRS.get(), Item.Properties()) }
    val SMOOTH_WHITE_QUARTZ_SLAB = register("smooth_white_quartz_slab") { BlockItem(HybridBlocksBlocks.SMOOTH_WHITE_QUARTZ_SLAB.get(), Item.Properties()) }
    val WHITE_QUARTZ_TILES = register("white_quartz_tiles") { BlockItem(HybridBlocksBlocks.WHITE_QUARTZ_TILES.get(), Item.Properties()) }
    val WHITE_QUARTZ_TILE_STAIRS = register("white_quartz_tile_stairs") { BlockItem(HybridBlocksBlocks.WHITE_QUARTZ_TILE_STAIRS.get(), Item.Properties()) }
    val WHITE_QUARTZ_TILE_SLAB = register("white_quartz_tile_slab") { BlockItem(HybridBlocksBlocks.WHITE_QUARTZ_TILE_SLAB.get(), Item.Properties()) }

    val LIGHT_GRAY_QUARTZ_BLOCK = register("light_gray_quartz_block") { BlockItem(HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_BLOCK.get(), Item.Properties()) }
    val LIGHT_GRAY_QUARTZ_STAIRS = register("light_gray_quartz_stairs") { BlockItem(HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_STAIRS.get(), Item.Properties()) }
    val LIGHT_GRAY_QUARTZ_SLAB = register("light_gray_quartz_slab") { BlockItem(HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_SLAB.get(), Item.Properties()) }
    val CHISELED_LIGHT_GRAY_QUARTZ_BLOCK = register("chiseled_light_gray_quartz_block") { BlockItem(HybridBlocksBlocks.CHISELED_LIGHT_GRAY_QUARTZ_BLOCK.get(), Item.Properties()) }
    val LIGHT_GRAY_QUARTZ_BRICKS = register("light_gray_quartz_bricks") { BlockItem(HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_BRICKS.get(), Item.Properties()) }
    val LIGHT_GRAY_QUARTZ_PILLAR = register("light_gray_quartz_pillar") { BlockItem(HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_PILLAR.get(), Item.Properties()) }
    val SMOOTH_LIGHT_GRAY_QUARTZ = register("smooth_light_gray_quartz") { BlockItem(HybridBlocksBlocks.SMOOTH_LIGHT_GRAY_QUARTZ.get(), Item.Properties()) }
    val SMOOTH_LIGHT_GRAY_QUARTZ_STAIRS = register("smooth_light_gray_quartz_stairs") { BlockItem(HybridBlocksBlocks.SMOOTH_LIGHT_GRAY_QUARTZ_STAIRS.get(), Item.Properties()) }
    val SMOOTH_LIGHT_GRAY_QUARTZ_SLAB = register("smooth_light_gray_quartz_slab") { BlockItem(HybridBlocksBlocks.SMOOTH_LIGHT_GRAY_QUARTZ_SLAB.get(), Item.Properties()) }
    val LIGHT_GRAY_QUARTZ_TILES = register("light_gray_quartz_tiles") { BlockItem(HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_TILES.get(), Item.Properties()) }
    val LIGHT_GRAY_QUARTZ_TILE_STAIRS = register("light_gray_quartz_tile_stairs") { BlockItem(HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_TILE_STAIRS.get(), Item.Properties()) }
    val LIGHT_GRAY_QUARTZ_TILE_SLAB = register("light_gray_quartz_tile_slab") { BlockItem(HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_TILE_SLAB.get(), Item.Properties()) }

    val GRAY_QUARTZ_BLOCK = register("gray_quartz_block") { BlockItem(HybridBlocksBlocks.GRAY_QUARTZ_BLOCK.get(), Item.Properties()) }
    val GRAY_QUARTZ_STAIRS = register("gray_quartz_stairs") { BlockItem(HybridBlocksBlocks.GRAY_QUARTZ_STAIRS.get(), Item.Properties()) }
    val GRAY_QUARTZ_SLAB = register("gray_quartz_slab") { BlockItem(HybridBlocksBlocks.GRAY_QUARTZ_SLAB.get(), Item.Properties()) }
    val CHISELED_GRAY_QUARTZ_BLOCK = register("chiseled_gray_quartz_block") { BlockItem(HybridBlocksBlocks.CHISELED_GRAY_QUARTZ_BLOCK.get(), Item.Properties()) }
    val GRAY_QUARTZ_BRICKS = register("gray_quartz_bricks") { BlockItem(HybridBlocksBlocks.GRAY_QUARTZ_BRICKS.get(), Item.Properties()) }
    val GRAY_QUARTZ_PILLAR = register("gray_quartz_pillar") { BlockItem(HybridBlocksBlocks.GRAY_QUARTZ_PILLAR.get(), Item.Properties()) }
    val SMOOTH_GRAY_QUARTZ = register("smooth_gray_quartz") { BlockItem(HybridBlocksBlocks.SMOOTH_GRAY_QUARTZ.get(), Item.Properties()) }
    val SMOOTH_GRAY_QUARTZ_STAIRS = register("smooth_gray_quartz_stairs") { BlockItem(HybridBlocksBlocks.SMOOTH_GRAY_QUARTZ_STAIRS.get(), Item.Properties()) }
    val SMOOTH_GRAY_QUARTZ_SLAB = register("smooth_gray_quartz_slab") { BlockItem(HybridBlocksBlocks.SMOOTH_GRAY_QUARTZ_SLAB.get(), Item.Properties()) }
    val GRAY_QUARTZ_TILES = register("gray_quartz_tiles") { BlockItem(HybridBlocksBlocks.GRAY_QUARTZ_TILES.get(), Item.Properties()) }
    val GRAY_QUARTZ_TILE_STAIRS = register("gray_quartz_tile_stairs") { BlockItem(HybridBlocksBlocks.GRAY_QUARTZ_TILE_STAIRS.get(), Item.Properties()) }
    val GRAY_QUARTZ_TILE_SLAB = register("gray_quartz_tile_slab") { BlockItem(HybridBlocksBlocks.GRAY_QUARTZ_TILE_SLAB.get(), Item.Properties()) }

    val BLACK_QUARTZ_BLOCK = register("black_quartz_block") { BlockItem(HybridBlocksBlocks.BLACK_QUARTZ_BLOCK.get(), Item.Properties()) }
    val BLACK_QUARTZ_STAIRS = register("black_quartz_stairs") { BlockItem(HybridBlocksBlocks.BLACK_QUARTZ_STAIRS.get(), Item.Properties()) }
    val BLACK_QUARTZ_SLAB = register("black_quartz_slab") { BlockItem(HybridBlocksBlocks.BLACK_QUARTZ_SLAB.get(), Item.Properties()) }
    val CHISELED_BLACK_QUARTZ_BLOCK = register("chiseled_black_quartz_block") { BlockItem(HybridBlocksBlocks.CHISELED_BLACK_QUARTZ_BLOCK.get(), Item.Properties()) }
    val BLACK_QUARTZ_BRICKS = register("black_quartz_bricks") { BlockItem(HybridBlocksBlocks.BLACK_QUARTZ_BRICKS.get(), Item.Properties()) }
    val BLACK_QUARTZ_PILLAR = register("black_quartz_pillar") { BlockItem(HybridBlocksBlocks.BLACK_QUARTZ_PILLAR.get(), Item.Properties()) }
    val SMOOTH_BLACK_QUARTZ = register("smooth_black_quartz") { BlockItem(HybridBlocksBlocks.SMOOTH_BLACK_QUARTZ.get(), Item.Properties()) }
    val SMOOTH_BLACK_QUARTZ_STAIRS = register("smooth_black_quartz_stairs") { BlockItem(HybridBlocksBlocks.SMOOTH_BLACK_QUARTZ_STAIRS.get(), Item.Properties()) }
    val SMOOTH_BLACK_QUARTZ_SLAB = register("smooth_black_quartz_slab") { BlockItem(HybridBlocksBlocks.SMOOTH_BLACK_QUARTZ_SLAB.get(), Item.Properties()) }
    val BLACK_QUARTZ_TILES = register("black_quartz_tiles") { BlockItem(HybridBlocksBlocks.BLACK_QUARTZ_TILES.get(), Item.Properties()) }
    val BLACK_QUARTZ_TILE_STAIRS = register("black_quartz_tile_stairs") { BlockItem(HybridBlocksBlocks.BLACK_QUARTZ_TILE_STAIRS.get(), Item.Properties()) }
    val BLACK_QUARTZ_TILE_SLAB = register("black_quartz_tile_slab") { BlockItem(HybridBlocksBlocks.BLACK_QUARTZ_TILE_SLAB.get(), Item.Properties()) }

    val BROWN_QUARTZ_BLOCK = register("brown_quartz_block") { BlockItem(HybridBlocksBlocks.BROWN_QUARTZ_BLOCK.get(), Item.Properties()) }
    val BROWN_QUARTZ_STAIRS = register("brown_quartz_stairs") { BlockItem(HybridBlocksBlocks.BROWN_QUARTZ_STAIRS.get(), Item.Properties()) }
    val BROWN_QUARTZ_SLAB = register("brown_quartz_slab") { BlockItem(HybridBlocksBlocks.BROWN_QUARTZ_SLAB.get(), Item.Properties()) }
    val CHISELED_BROWN_QUARTZ_BLOCK = register("chiseled_brown_quartz_block") { BlockItem(HybridBlocksBlocks.CHISELED_BROWN_QUARTZ_BLOCK.get(), Item.Properties()) }
    val BROWN_QUARTZ_BRICKS = register("brown_quartz_bricks") { BlockItem(HybridBlocksBlocks.BROWN_QUARTZ_BRICKS.get(), Item.Properties()) }
    val BROWN_QUARTZ_PILLAR = register("brown_quartz_pillar") { BlockItem(HybridBlocksBlocks.BROWN_QUARTZ_PILLAR.get(), Item.Properties()) }
    val SMOOTH_BROWN_QUARTZ = register("smooth_brown_quartz") { BlockItem(HybridBlocksBlocks.SMOOTH_BROWN_QUARTZ.get(), Item.Properties()) }
    val SMOOTH_BROWN_QUARTZ_STAIRS = register("smooth_brown_quartz_stairs") { BlockItem(HybridBlocksBlocks.SMOOTH_BROWN_QUARTZ_STAIRS.get(), Item.Properties()) }
    val SMOOTH_BROWN_QUARTZ_SLAB = register("smooth_brown_quartz_slab") { BlockItem(HybridBlocksBlocks.SMOOTH_BROWN_QUARTZ_SLAB.get(), Item.Properties()) }
    val BROWN_QUARTZ_TILES = register("brown_quartz_tiles") { BlockItem(HybridBlocksBlocks.BROWN_QUARTZ_TILES.get(), Item.Properties()) }
    val BROWN_QUARTZ_TILE_STAIRS = register("brown_quartz_tile_stairs") { BlockItem(HybridBlocksBlocks.BROWN_QUARTZ_TILE_STAIRS.get(), Item.Properties()) }
    val BROWN_QUARTZ_TILE_SLAB = register("brown_quartz_tile_slab") { BlockItem(HybridBlocksBlocks.BROWN_QUARTZ_TILE_SLAB.get(), Item.Properties()) }

    val RED_QUARTZ_BLOCK = register("red_quartz_block") { BlockItem(HybridBlocksBlocks.RED_QUARTZ_BLOCK.get(), Item.Properties()) }
    val RED_QUARTZ_STAIRS = register("red_quartz_stairs") { BlockItem(HybridBlocksBlocks.RED_QUARTZ_STAIRS.get(), Item.Properties()) }
    val RED_QUARTZ_SLAB = register("red_quartz_slab") { BlockItem(HybridBlocksBlocks.RED_QUARTZ_SLAB.get(), Item.Properties()) }
    val CHISELED_RED_QUARTZ_BLOCK = register("chiseled_red_quartz_block") { BlockItem(HybridBlocksBlocks.CHISELED_RED_QUARTZ_BLOCK.get(), Item.Properties()) }
    val RED_QUARTZ_BRICKS = register("red_quartz_bricks") { BlockItem(HybridBlocksBlocks.RED_QUARTZ_BRICKS.get(), Item.Properties()) }
    val RED_QUARTZ_PILLAR = register("red_quartz_pillar") { BlockItem(HybridBlocksBlocks.RED_QUARTZ_PILLAR.get(), Item.Properties()) }
    val SMOOTH_RED_QUARTZ = register("smooth_red_quartz") { BlockItem(HybridBlocksBlocks.SMOOTH_RED_QUARTZ.get(), Item.Properties()) }
    val SMOOTH_RED_QUARTZ_STAIRS = register("smooth_red_quartz_stairs") { BlockItem(HybridBlocksBlocks.SMOOTH_RED_QUARTZ_STAIRS.get(), Item.Properties()) }
    val SMOOTH_RED_QUARTZ_SLAB = register("smooth_red_quartz_slab") { BlockItem(HybridBlocksBlocks.SMOOTH_RED_QUARTZ_SLAB.get(), Item.Properties()) }
    val RED_QUARTZ_TILES = register("red_quartz_tiles") { BlockItem(HybridBlocksBlocks.RED_QUARTZ_TILES.get(), Item.Properties()) }
    val RED_QUARTZ_TILE_STAIRS = register("red_quartz_tile_stairs") { BlockItem(HybridBlocksBlocks.RED_QUARTZ_TILE_STAIRS.get(), Item.Properties()) }
    val RED_QUARTZ_TILE_SLAB = register("red_quartz_tile_slab") { BlockItem(HybridBlocksBlocks.RED_QUARTZ_TILE_SLAB.get(), Item.Properties()) }

    val ORANGE_QUARTZ_BLOCK = register("orange_quartz_block") { BlockItem(HybridBlocksBlocks.ORANGE_QUARTZ_BLOCK.get(), Item.Properties()) }
    val ORANGE_QUARTZ_STAIRS = register("orange_quartz_stairs") { BlockItem(HybridBlocksBlocks.ORANGE_QUARTZ_STAIRS.get(), Item.Properties()) }
    val ORANGE_QUARTZ_SLAB = register("orange_quartz_slab") { BlockItem(HybridBlocksBlocks.ORANGE_QUARTZ_SLAB.get(), Item.Properties()) }
    val CHISELED_ORANGE_QUARTZ_BLOCK = register("chiseled_orange_quartz_block") { BlockItem(HybridBlocksBlocks.CHISELED_ORANGE_QUARTZ_BLOCK.get(), Item.Properties()) }
    val ORANGE_QUARTZ_BRICKS = register("orange_quartz_bricks") { BlockItem(HybridBlocksBlocks.ORANGE_QUARTZ_BRICKS.get(), Item.Properties()) }
    val ORANGE_QUARTZ_PILLAR = register("orange_quartz_pillar") { BlockItem(HybridBlocksBlocks.ORANGE_QUARTZ_PILLAR.get(), Item.Properties()) }
    val SMOOTH_ORANGE_QUARTZ = register("smooth_orange_quartz") { BlockItem(HybridBlocksBlocks.SMOOTH_ORANGE_QUARTZ.get(), Item.Properties()) }
    val SMOOTH_ORANGE_QUARTZ_STAIRS = register("smooth_orange_quartz_stairs") { BlockItem(HybridBlocksBlocks.SMOOTH_ORANGE_QUARTZ_STAIRS.get(), Item.Properties()) }
    val SMOOTH_ORANGE_QUARTZ_SLAB = register("smooth_orange_quartz_slab") { BlockItem(HybridBlocksBlocks.SMOOTH_ORANGE_QUARTZ_SLAB.get(), Item.Properties()) }
    val ORANGE_QUARTZ_TILES = register("orange_quartz_tiles") { BlockItem(HybridBlocksBlocks.ORANGE_QUARTZ_TILES.get(), Item.Properties()) }
    val ORANGE_QUARTZ_TILE_STAIRS = register("orange_quartz_tile_stairs") { BlockItem(HybridBlocksBlocks.ORANGE_QUARTZ_TILE_STAIRS.get(), Item.Properties()) }
    val ORANGE_QUARTZ_TILE_SLAB = register("orange_quartz_tile_slab") { BlockItem(HybridBlocksBlocks.ORANGE_QUARTZ_TILE_SLAB.get(), Item.Properties()) }

    val YELLOW_QUARTZ_BLOCK = register("yellow_quartz_block") { BlockItem(HybridBlocksBlocks.YELLOW_QUARTZ_BLOCK.get(), Item.Properties()) }
    val YELLOW_QUARTZ_STAIRS = register("yellow_quartz_stairs") { BlockItem(HybridBlocksBlocks.YELLOW_QUARTZ_STAIRS.get(), Item.Properties()) }
    val YELLOW_QUARTZ_SLAB = register("yellow_quartz_slab") { BlockItem(HybridBlocksBlocks.YELLOW_QUARTZ_SLAB.get(), Item.Properties()) }
    val CHISELED_YELLOW_QUARTZ_BLOCK = register("chiseled_yellow_quartz_block") { BlockItem(HybridBlocksBlocks.CHISELED_YELLOW_QUARTZ_BLOCK.get(), Item.Properties()) }
    val YELLOW_QUARTZ_BRICKS = register("yellow_quartz_bricks") { BlockItem(HybridBlocksBlocks.YELLOW_QUARTZ_BRICKS.get(), Item.Properties()) }
    val YELLOW_QUARTZ_PILLAR = register("yellow_quartz_pillar") { BlockItem(HybridBlocksBlocks.YELLOW_QUARTZ_PILLAR.get(), Item.Properties()) }
    val SMOOTH_YELLOW_QUARTZ = register("smooth_yellow_quartz") { BlockItem(HybridBlocksBlocks.SMOOTH_YELLOW_QUARTZ.get(), Item.Properties()) }
    val SMOOTH_YELLOW_QUARTZ_STAIRS = register("smooth_yellow_quartz_stairs") { BlockItem(HybridBlocksBlocks.SMOOTH_YELLOW_QUARTZ_STAIRS.get(), Item.Properties()) }
    val SMOOTH_YELLOW_QUARTZ_SLAB = register("smooth_yellow_quartz_slab") { BlockItem(HybridBlocksBlocks.SMOOTH_YELLOW_QUARTZ_SLAB.get(), Item.Properties()) }
    val YELLOW_QUARTZ_TILES = register("yellow_quartz_tiles") { BlockItem(HybridBlocksBlocks.YELLOW_QUARTZ_TILES.get(), Item.Properties()) }
    val YELLOW_QUARTZ_TILE_STAIRS = register("yellow_quartz_tile_stairs") { BlockItem(HybridBlocksBlocks.YELLOW_QUARTZ_TILE_STAIRS.get(), Item.Properties()) }
    val YELLOW_QUARTZ_TILE_SLAB = register("yellow_quartz_tile_slab") { BlockItem(HybridBlocksBlocks.YELLOW_QUARTZ_TILE_SLAB.get(), Item.Properties()) }

    val LIME_QUARTZ_BLOCK = register("lime_quartz_block") { BlockItem(HybridBlocksBlocks.LIME_QUARTZ_BLOCK.get(), Item.Properties()) }
    val LIME_QUARTZ_STAIRS = register("lime_quartz_stairs") { BlockItem(HybridBlocksBlocks.LIME_QUARTZ_STAIRS.get(), Item.Properties()) }
    val LIME_QUARTZ_SLAB = register("lime_quartz_slab") { BlockItem(HybridBlocksBlocks.LIME_QUARTZ_SLAB.get(), Item.Properties()) }
    val CHISELED_LIME_QUARTZ_BLOCK = register("chiseled_lime_quartz_block") { BlockItem(HybridBlocksBlocks.CHISELED_LIME_QUARTZ_BLOCK.get(), Item.Properties()) }
    val LIME_QUARTZ_BRICKS = register("lime_quartz_bricks") { BlockItem(HybridBlocksBlocks.LIME_QUARTZ_BRICKS.get(), Item.Properties()) }
    val LIME_QUARTZ_PILLAR = register("lime_quartz_pillar") { BlockItem(HybridBlocksBlocks.LIME_QUARTZ_PILLAR.get(), Item.Properties()) }
    val SMOOTH_LIME_QUARTZ = register("smooth_lime_quartz") { BlockItem(HybridBlocksBlocks.SMOOTH_LIME_QUARTZ.get(), Item.Properties()) }
    val SMOOTH_LIME_QUARTZ_STAIRS = register("smooth_lime_quartz_stairs") { BlockItem(HybridBlocksBlocks.SMOOTH_LIME_QUARTZ_STAIRS.get(), Item.Properties()) }
    val SMOOTH_LIME_QUARTZ_SLAB = register("smooth_lime_quartz_slab") { BlockItem(HybridBlocksBlocks.SMOOTH_LIME_QUARTZ_SLAB.get(), Item.Properties()) }
    val LIME_QUARTZ_TILES = register("lime_quartz_tiles") { BlockItem(HybridBlocksBlocks.LIME_QUARTZ_TILES.get(), Item.Properties()) }
    val LIME_QUARTZ_TILE_STAIRS = register("lime_quartz_tile_stairs") { BlockItem(HybridBlocksBlocks.LIME_QUARTZ_TILE_STAIRS.get(), Item.Properties()) }
    val LIME_QUARTZ_TILE_SLAB = register("lime_quartz_tile_slab") { BlockItem(HybridBlocksBlocks.LIME_QUARTZ_TILE_SLAB.get(), Item.Properties()) }

    val GREEN_QUARTZ_BLOCK = register("green_quartz_block") { BlockItem(HybridBlocksBlocks.GREEN_QUARTZ_BLOCK.get(), Item.Properties()) }
    val GREEN_QUARTZ_STAIRS = register("green_quartz_stairs") { BlockItem(HybridBlocksBlocks.GREEN_QUARTZ_STAIRS.get(), Item.Properties()) }
    val GREEN_QUARTZ_SLAB = register("green_quartz_slab") { BlockItem(HybridBlocksBlocks.GREEN_QUARTZ_SLAB.get(), Item.Properties()) }
    val CHISELED_GREEN_QUARTZ_BLOCK = register("chiseled_green_quartz_block") { BlockItem(HybridBlocksBlocks.CHISELED_GREEN_QUARTZ_BLOCK.get(), Item.Properties()) }
    val GREEN_QUARTZ_BRICKS = register("green_quartz_bricks") { BlockItem(HybridBlocksBlocks.GREEN_QUARTZ_BRICKS.get(), Item.Properties()) }
    val GREEN_QUARTZ_PILLAR = register("green_quartz_pillar") { BlockItem(HybridBlocksBlocks.GREEN_QUARTZ_PILLAR.get(), Item.Properties()) }
    val SMOOTH_GREEN_QUARTZ = register("smooth_green_quartz") { BlockItem(HybridBlocksBlocks.SMOOTH_GREEN_QUARTZ.get(), Item.Properties()) }
    val SMOOTH_GREEN_QUARTZ_STAIRS = register("smooth_green_quartz_stairs") { BlockItem(HybridBlocksBlocks.SMOOTH_GREEN_QUARTZ_STAIRS.get(), Item.Properties()) }
    val SMOOTH_GREEN_QUARTZ_SLAB = register("smooth_green_quartz_slab") { BlockItem(HybridBlocksBlocks.SMOOTH_GREEN_QUARTZ_SLAB.get(), Item.Properties()) }
    val GREEN_QUARTZ_TILES = register("green_quartz_tiles") { BlockItem(HybridBlocksBlocks.GREEN_QUARTZ_TILES.get(), Item.Properties()) }
    val GREEN_QUARTZ_TILE_STAIRS = register("green_quartz_tile_stairs") { BlockItem(HybridBlocksBlocks.GREEN_QUARTZ_TILE_STAIRS.get(), Item.Properties()) }
    val GREEN_QUARTZ_TILE_SLAB = register("green_quartz_tile_slab") { BlockItem(HybridBlocksBlocks.GREEN_QUARTZ_TILE_SLAB.get(), Item.Properties()) }

    val CYAN_QUARTZ_BLOCK = register("cyan_quartz_block") { BlockItem(HybridBlocksBlocks.CYAN_QUARTZ_BLOCK.get(), Item.Properties()) }
    val CYAN_QUARTZ_STAIRS = register("cyan_quartz_stairs") { BlockItem(HybridBlocksBlocks.CYAN_QUARTZ_STAIRS.get(), Item.Properties()) }
    val CYAN_QUARTZ_SLAB = register("cyan_quartz_slab") { BlockItem(HybridBlocksBlocks.CYAN_QUARTZ_SLAB.get(), Item.Properties()) }
    val CHISELED_CYAN_QUARTZ_BLOCK = register("chiseled_cyan_quartz_block") { BlockItem(HybridBlocksBlocks.CHISELED_CYAN_QUARTZ_BLOCK.get(), Item.Properties()) }
    val CYAN_QUARTZ_BRICKS = register("cyan_quartz_bricks") { BlockItem(HybridBlocksBlocks.CYAN_QUARTZ_BRICKS.get(), Item.Properties()) }
    val CYAN_QUARTZ_PILLAR = register("cyan_quartz_pillar") { BlockItem(HybridBlocksBlocks.CYAN_QUARTZ_PILLAR.get(), Item.Properties()) }
    val SMOOTH_CYAN_QUARTZ = register("smooth_cyan_quartz") { BlockItem(HybridBlocksBlocks.SMOOTH_CYAN_QUARTZ.get(), Item.Properties()) }
    val SMOOTH_CYAN_QUARTZ_STAIRS = register("smooth_cyan_quartz_stairs") { BlockItem(HybridBlocksBlocks.SMOOTH_CYAN_QUARTZ_STAIRS.get(), Item.Properties()) }
    val SMOOTH_CYAN_QUARTZ_SLAB = register("smooth_cyan_quartz_slab") { BlockItem(HybridBlocksBlocks.SMOOTH_CYAN_QUARTZ_SLAB.get(), Item.Properties()) }
    val CYAN_QUARTZ_TILES = register("cyan_quartz_tiles") { BlockItem(HybridBlocksBlocks.CYAN_QUARTZ_TILES.get(), Item.Properties()) }
    val CYAN_QUARTZ_TILE_STAIRS = register("cyan_quartz_tile_stairs") { BlockItem(HybridBlocksBlocks.CYAN_QUARTZ_TILE_STAIRS.get(), Item.Properties()) }
    val CYAN_QUARTZ_TILE_SLAB = register("cyan_quartz_tile_slab") { BlockItem(HybridBlocksBlocks.CYAN_QUARTZ_TILE_SLAB.get(), Item.Properties()) }

    val LIGHT_BLUE_QUARTZ_BLOCK = register("light_blue_quartz_block") { BlockItem(HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_BLOCK.get(), Item.Properties()) }
    val LIGHT_BLUE_QUARTZ_STAIRS = register("light_blue_quartz_stairs") { BlockItem(HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_STAIRS.get(), Item.Properties()) }
    val LIGHT_BLUE_QUARTZ_SLAB = register("light_blue_quartz_slab") { BlockItem(HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_SLAB.get(), Item.Properties()) }
    val CHISELED_LIGHT_BLUE_QUARTZ_BLOCK = register("chiseled_light_blue_quartz_block") { BlockItem(HybridBlocksBlocks.CHISELED_LIGHT_BLUE_QUARTZ_BLOCK.get(), Item.Properties()) }
    val LIGHT_BLUE_QUARTZ_BRICKS = register("light_blue_quartz_bricks") { BlockItem(HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_BRICKS.get(), Item.Properties()) }
    val LIGHT_BLUE_QUARTZ_PILLAR = register("light_blue_quartz_pillar") { BlockItem(HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_PILLAR.get(), Item.Properties()) }
    val SMOOTH_LIGHT_BLUE_QUARTZ = register("smooth_light_blue_quartz") { BlockItem(HybridBlocksBlocks.SMOOTH_LIGHT_BLUE_QUARTZ.get(), Item.Properties()) }
    val SMOOTH_LIGHT_BLUE_QUARTZ_STAIRS = register("smooth_light_blue_quartz_stairs") { BlockItem(HybridBlocksBlocks.SMOOTH_LIGHT_BLUE_QUARTZ_STAIRS.get(), Item.Properties()) }
    val SMOOTH_LIGHT_BLUE_QUARTZ_SLAB = register("smooth_light_blue_quartz_slab") { BlockItem(HybridBlocksBlocks.SMOOTH_LIGHT_BLUE_QUARTZ_SLAB.get(), Item.Properties()) }
    val LIGHT_BLUE_QUARTZ_TILES = register("light_blue_quartz_tiles") { BlockItem(HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_TILES.get(), Item.Properties()) }
    val LIGHT_BLUE_QUARTZ_TILE_STAIRS = register("light_blue_quartz_tile_stairs") { BlockItem(HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_TILE_STAIRS.get(), Item.Properties()) }
    val LIGHT_BLUE_QUARTZ_TILE_SLAB = register("light_blue_quartz_tile_slab") { BlockItem(HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_TILE_SLAB.get(), Item.Properties()) }

    val BLUE_QUARTZ_BLOCK = register("blue_quartz_block") { BlockItem(HybridBlocksBlocks.BLUE_QUARTZ_BLOCK.get(), Item.Properties()) }
    val BLUE_QUARTZ_STAIRS = register("blue_quartz_stairs") { BlockItem(HybridBlocksBlocks.BLUE_QUARTZ_STAIRS.get(), Item.Properties()) }
    val BLUE_QUARTZ_SLAB = register("blue_quartz_slab") { BlockItem(HybridBlocksBlocks.BLUE_QUARTZ_SLAB.get(), Item.Properties()) }
    val CHISELED_BLUE_QUARTZ_BLOCK = register("chiseled_blue_quartz_block") { BlockItem(HybridBlocksBlocks.CHISELED_BLUE_QUARTZ_BLOCK.get(), Item.Properties()) }
    val BLUE_QUARTZ_BRICKS = register("blue_quartz_bricks") { BlockItem(HybridBlocksBlocks.BLUE_QUARTZ_BRICKS.get(), Item.Properties()) }
    val BLUE_QUARTZ_PILLAR = register("blue_quartz_pillar") { BlockItem(HybridBlocksBlocks.BLUE_QUARTZ_PILLAR.get(), Item.Properties()) }
    val SMOOTH_BLUE_QUARTZ = register("smooth_blue_quartz") { BlockItem(HybridBlocksBlocks.SMOOTH_BLUE_QUARTZ.get(), Item.Properties()) }
    val SMOOTH_BLUE_QUARTZ_STAIRS = register("smooth_blue_quartz_stairs") { BlockItem(HybridBlocksBlocks.SMOOTH_BLUE_QUARTZ_STAIRS.get(), Item.Properties()) }
    val SMOOTH_BLUE_QUARTZ_SLAB = register("smooth_blue_quartz_slab") { BlockItem(HybridBlocksBlocks.SMOOTH_BLUE_QUARTZ_SLAB.get(), Item.Properties()) }
    val BLUE_QUARTZ_TILES = register("blue_quartz_tiles") { BlockItem(HybridBlocksBlocks.BLUE_QUARTZ_TILES.get(), Item.Properties()) }
    val BLUE_QUARTZ_TILE_STAIRS = register("blue_quartz_tile_stairs") { BlockItem(HybridBlocksBlocks.BLUE_QUARTZ_TILE_STAIRS.get(), Item.Properties()) }
    val BLUE_QUARTZ_TILE_SLAB = register("blue_quartz_tile_slab") { BlockItem(HybridBlocksBlocks.BLUE_QUARTZ_TILE_SLAB.get(), Item.Properties()) }

    val PURPLE_QUARTZ_BLOCK = register("purple_quartz_block") { BlockItem(HybridBlocksBlocks.PURPLE_QUARTZ_BLOCK.get(), Item.Properties()) }
    val PURPLE_QUARTZ_STAIRS = register("purple_quartz_stairs") { BlockItem(HybridBlocksBlocks.PURPLE_QUARTZ_STAIRS.get(), Item.Properties()) }
    val PURPLE_QUARTZ_SLAB = register("purple_quartz_slab") { BlockItem(HybridBlocksBlocks.PURPLE_QUARTZ_SLAB.get(), Item.Properties()) }
    val CHISELED_PURPLE_QUARTZ_BLOCK = register("chiseled_purple_quartz_block") { BlockItem(HybridBlocksBlocks.CHISELED_PURPLE_QUARTZ_BLOCK.get(), Item.Properties()) }
    val PURPLE_QUARTZ_BRICKS = register("purple_quartz_bricks") { BlockItem(HybridBlocksBlocks.PURPLE_QUARTZ_BRICKS.get(), Item.Properties()) }
    val PURPLE_QUARTZ_PILLAR = register("purple_quartz_pillar") { BlockItem(HybridBlocksBlocks.PURPLE_QUARTZ_PILLAR.get(), Item.Properties()) }
    val SMOOTH_PURPLE_QUARTZ = register("smooth_purple_quartz") { BlockItem(HybridBlocksBlocks.SMOOTH_PURPLE_QUARTZ.get(), Item.Properties()) }
    val SMOOTH_PURPLE_QUARTZ_STAIRS = register("smooth_purple_quartz_stairs") { BlockItem(HybridBlocksBlocks.SMOOTH_PURPLE_QUARTZ_STAIRS.get(), Item.Properties()) }
    val SMOOTH_PURPLE_QUARTZ_SLAB = register("smooth_purple_quartz_slab") { BlockItem(HybridBlocksBlocks.SMOOTH_PURPLE_QUARTZ_SLAB.get(), Item.Properties()) }
    val PURPLE_QUARTZ_TILES = register("purple_quartz_tiles") { BlockItem(HybridBlocksBlocks.PURPLE_QUARTZ_TILES.get(), Item.Properties()) }
    val PURPLE_QUARTZ_TILE_STAIRS = register("purple_quartz_tile_stairs") { BlockItem(HybridBlocksBlocks.PURPLE_QUARTZ_TILE_STAIRS.get(), Item.Properties()) }
    val PURPLE_QUARTZ_TILE_SLAB = register("purple_quartz_tile_slab") { BlockItem(HybridBlocksBlocks.PURPLE_QUARTZ_TILE_SLAB.get(), Item.Properties()) }

    val MAGENTA_QUARTZ_BLOCK = register("magenta_quartz_block") { BlockItem(HybridBlocksBlocks.MAGENTA_QUARTZ_BLOCK.get(), Item.Properties()) }
    val MAGENTA_QUARTZ_STAIRS = register("magenta_quartz_stairs") { BlockItem(HybridBlocksBlocks.MAGENTA_QUARTZ_STAIRS.get(), Item.Properties()) }
    val MAGENTA_QUARTZ_SLAB = register("magenta_quartz_slab") { BlockItem(HybridBlocksBlocks.MAGENTA_QUARTZ_SLAB.get(), Item.Properties()) }
    val CHISELED_MAGENTA_QUARTZ_BLOCK = register("chiseled_magenta_quartz_block") { BlockItem(HybridBlocksBlocks.CHISELED_MAGENTA_QUARTZ_BLOCK.get(), Item.Properties()) }
    val MAGENTA_QUARTZ_BRICKS = register("magenta_quartz_bricks") { BlockItem(HybridBlocksBlocks.MAGENTA_QUARTZ_BRICKS.get(), Item.Properties()) }
    val MAGENTA_QUARTZ_PILLAR = register("magenta_quartz_pillar") { BlockItem(HybridBlocksBlocks.MAGENTA_QUARTZ_PILLAR.get(), Item.Properties()) }
    val SMOOTH_MAGENTA_QUARTZ = register("smooth_magenta_quartz") { BlockItem(HybridBlocksBlocks.SMOOTH_MAGENTA_QUARTZ.get(), Item.Properties()) }
    val SMOOTH_MAGENTA_QUARTZ_STAIRS = register("smooth_magenta_quartz_stairs") { BlockItem(HybridBlocksBlocks.SMOOTH_MAGENTA_QUARTZ_STAIRS.get(), Item.Properties()) }
    val SMOOTH_MAGENTA_QUARTZ_SLAB = register("smooth_magenta_quartz_slab") { BlockItem(HybridBlocksBlocks.SMOOTH_MAGENTA_QUARTZ_SLAB.get(), Item.Properties()) }
    val MAGENTA_QUARTZ_TILES = register("magenta_quartz_tiles") { BlockItem(HybridBlocksBlocks.MAGENTA_QUARTZ_TILES.get(), Item.Properties()) }
    val MAGENTA_QUARTZ_TILE_STAIRS = register("magenta_quartz_tile_stairs") { BlockItem(HybridBlocksBlocks.MAGENTA_QUARTZ_TILE_STAIRS.get(), Item.Properties()) }
    val MAGENTA_QUARTZ_TILE_SLAB = register("magenta_quartz_tile_slab") { BlockItem(HybridBlocksBlocks.MAGENTA_QUARTZ_TILE_SLAB.get(), Item.Properties()) }

    val PINK_QUARTZ_BLOCK = register("pink_quartz_block") { BlockItem(HybridBlocksBlocks.PINK_QUARTZ_BLOCK.get(), Item.Properties()) }
    val PINK_QUARTZ_STAIRS = register("pink_quartz_stairs") { BlockItem(HybridBlocksBlocks.PINK_QUARTZ_STAIRS.get(), Item.Properties()) }
    val PINK_QUARTZ_SLAB = register("pink_quartz_slab") { BlockItem(HybridBlocksBlocks.PINK_QUARTZ_SLAB.get(), Item.Properties()) }
    val CHISELED_PINK_QUARTZ_BLOCK = register("chiseled_pink_quartz_block") { BlockItem(HybridBlocksBlocks.CHISELED_PINK_QUARTZ_BLOCK.get(), Item.Properties()) }
    val PINK_QUARTZ_BRICKS = register("pink_quartz_bricks") { BlockItem(HybridBlocksBlocks.PINK_QUARTZ_BRICKS.get(), Item.Properties()) }
    val PINK_QUARTZ_PILLAR = register("pink_quartz_pillar") { BlockItem(HybridBlocksBlocks.PINK_QUARTZ_PILLAR.get(), Item.Properties()) }
    val SMOOTH_PINK_QUARTZ = register("smooth_pink_quartz") { BlockItem(HybridBlocksBlocks.SMOOTH_PINK_QUARTZ.get(), Item.Properties()) }
    val SMOOTH_PINK_QUARTZ_STAIRS = register("smooth_pink_quartz_stairs") { BlockItem(HybridBlocksBlocks.SMOOTH_PINK_QUARTZ_STAIRS.get(), Item.Properties()) }
    val SMOOTH_PINK_QUARTZ_SLAB = register("smooth_pink_quartz_slab") { BlockItem(HybridBlocksBlocks.SMOOTH_PINK_QUARTZ_SLAB.get(), Item.Properties()) }
    val PINK_QUARTZ_TILES = register("pink_quartz_tiles") { BlockItem(HybridBlocksBlocks.PINK_QUARTZ_TILES.get(), Item.Properties()) }
    val PINK_QUARTZ_TILE_STAIRS = register("pink_quartz_tile_stairs") { BlockItem(HybridBlocksBlocks.PINK_QUARTZ_TILE_STAIRS.get(), Item.Properties()) }
    val PINK_QUARTZ_TILE_SLAB = register("pink_quartz_tile_slab") { BlockItem(HybridBlocksBlocks.PINK_QUARTZ_TILE_SLAB.get(), Item.Properties()) }
    //#endregion

    //#region Bricks
    //  normal bricks
    val SMALL_BRICKS = register("small_bricks") { BlockItem(HybridBlocksBlocks.SMALL_BRICKS.get(), Item.Properties()) }
    val SMALL_BRICK_STAIRS = register("small_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_BRICK_SLAB = register("small_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_BRICK_WALL = register("small_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_BRICKS = register("large_bricks") { BlockItem(HybridBlocksBlocks.LARGE_BRICKS.get(), Item.Properties()) }
    val LARGE_BRICK_STAIRS = register("large_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_BRICK_SLAB = register("large_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_BRICK_WALL = register("large_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_BRICK_WALL.get(), Item.Properties()) }

    //  mixed bricks
    val SMALL_MIXED_BRICKS = register("small_mixed_bricks") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_BRICKS.get(), Item.Properties()) }
    val SMALL_MIXED_BRICK_STAIRS = register("small_mixed_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_MIXED_BRICK_SLAB = register("small_mixed_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_MIXED_BRICK_WALL = register("small_mixed_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_BRICK_WALL.get(), Item.Properties()) }

    val MIXED_BRICKS = register("mixed_bricks") { BlockItem(HybridBlocksBlocks.MIXED_BRICKS.get(), Item.Properties()) }
    val MIXED_BRICK_STAIRS = register("mixed_brick_stairs") { BlockItem(HybridBlocksBlocks.MIXED_BRICK_STAIRS.get(), Item.Properties()) }
    val MIXED_BRICK_SLAB = register("mixed_brick_slab") { BlockItem(HybridBlocksBlocks.MIXED_BRICK_SLAB.get(), Item.Properties()) }
    val MIXED_BRICK_WALL = register("mixed_brick_wall") { BlockItem(HybridBlocksBlocks.MIXED_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_MIXED_BRICKS = register("large_mixed_bricks") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_BRICKS.get(), Item.Properties()) }
    val LARGE_MIXED_BRICK_STAIRS = register("large_mixed_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_MIXED_BRICK_SLAB = register("large_mixed_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_MIXED_BRICK_WALL = register("large_mixed_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_BRICK_WALL.get(), Item.Properties()) }

    val CRACKED_BRICKS = register("cracked_bricks") { BlockItem(HybridBlocksBlocks.CRACKED_BRICKS.get(), Item.Properties()) }
    val CRACKED_BRICK_STAIRS = register("cracked_brick_stairs") { BlockItem(HybridBlocksBlocks.CRACKED_BRICK_STAIRS.get(), Item.Properties()) }
    val CRACKED_BRICK_SLAB = register("cracked_brick_slab") { BlockItem(HybridBlocksBlocks.CRACKED_BRICK_SLAB.get(), Item.Properties()) }
    val CRACKED_BRICK_WALL = register("cracked_brick_wall") { BlockItem(HybridBlocksBlocks.CRACKED_BRICK_WALL.get(), Item.Properties()) }
    val BASKETWEAVE_BRICKS = register("basketweave_bricks") { BlockItem(HybridBlocksBlocks.BASKETWEAVE_BRICKS.get(), Item.Properties()) }
    val PINWHEEL_BRICKS = register("pinwheel_bricks") { BlockItem(HybridBlocksBlocks.PINWHEEL_BRICKS.get(), Item.Properties()) }
    val JACK_ON_JACK_BRICKS = register("jack_on_jack_bricks") { BlockItem(HybridBlocksBlocks.JACK_ON_JACK_BRICKS.get(), Item.Properties()) }

    //  shingles
    val SHINGLES = register("shingles") { BlockItem(HybridBlocksBlocks.SHINGLES.get(), Item.Properties()) }
    val SHINGLE_STAIRS = register("shingle_stairs") { BlockItem(HybridBlocksBlocks.SHINGLE_STAIRS.get(), Item.Properties()) }
    val SHINGLE_SLAB = register("shingle_slab") { BlockItem(HybridBlocksBlocks.SHINGLE_SLAB.get(), Item.Properties()) }
    val SHINGLE_WALL = register("shingle_wall") { BlockItem(HybridBlocksBlocks.SHINGLE_WALL.get(), Item.Properties()) }

    val MIXED_SHINGLES = register("mixed_shingles") { BlockItem(HybridBlocksBlocks.MIXED_SHINGLES.get(), Item.Properties()) }
    val MIXED_SHINGLE_STAIRS = register("mixed_shingle_stairs") { BlockItem(HybridBlocksBlocks.MIXED_SHINGLE_STAIRS.get(), Item.Properties()) }
    val MIXED_SHINGLE_SLAB = register("mixed_shingle_slab") { BlockItem(HybridBlocksBlocks.MIXED_SHINGLE_SLAB.get(), Item.Properties()) }
    val MIXED_SHINGLE_WALL = register("mixed_shingle_wall") { BlockItem(HybridBlocksBlocks.MIXED_SHINGLE_WALL.get(), Item.Properties()) }

    val BRICK_CHIMNEY = register("brick_chimney") { BlockItem(HybridBlocksBlocks.BRICK_CHIMNEY.get(), Item.Properties()) }
    //#endregion

    //#region White Bricks
    //  normal white bricks
    val SMALL_WHITE_BRICKS = register("small_white_bricks") { BlockItem(HybridBlocksBlocks.SMALL_WHITE_BRICKS.get(), Item.Properties()) }
    val SMALL_WHITE_BRICK_STAIRS = register("small_white_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_WHITE_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_WHITE_BRICK_SLAB = register("small_white_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_WHITE_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_WHITE_BRICK_WALL = register("small_white_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_WHITE_BRICK_WALL.get(), Item.Properties()) }
    
    val WHITE_BRICKS = register("white_bricks") { BlockItem(HybridBlocksBlocks.WHITE_BRICKS.get(), Item.Properties()) }
    val WHITE_BRICK_STAIRS = register("white_brick_stairs") { BlockItem(HybridBlocksBlocks.WHITE_BRICK_STAIRS.get(), Item.Properties()) }
    val WHITE_BRICK_SLAB = register("white_brick_slab") { BlockItem(HybridBlocksBlocks.WHITE_BRICK_SLAB.get(), Item.Properties()) }
    val WHITE_BRICK_WALL = register("white_brick_wall") { BlockItem(HybridBlocksBlocks.WHITE_BRICK_WALL.get(), Item.Properties()) }
    
    val LARGE_WHITE_BRICKS = register("large_white_bricks") { BlockItem(HybridBlocksBlocks.LARGE_WHITE_BRICKS.get(), Item.Properties()) }
    val LARGE_WHITE_BRICK_STAIRS = register("large_white_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_WHITE_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_WHITE_BRICK_SLAB = register("large_white_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_WHITE_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_WHITE_BRICK_WALL = register("large_white_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_WHITE_BRICK_WALL.get(), Item.Properties()) }

    //  mixed white bricks
    val SMALL_MIXED_WHITE_BRICKS = register("small_mixed_white_bricks") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_WHITE_BRICKS.get(), Item.Properties()) }
    val SMALL_MIXED_WHITE_BRICK_STAIRS = register("small_mixed_white_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_WHITE_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_MIXED_WHITE_BRICK_SLAB = register("small_mixed_white_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_WHITE_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_MIXED_WHITE_BRICK_WALL = register("small_mixed_white_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_WHITE_BRICK_WALL.get(), Item.Properties()) }

    val MIXED_WHITE_BRICKS = register("mixed_white_bricks") { BlockItem(HybridBlocksBlocks.MIXED_WHITE_BRICKS.get(), Item.Properties()) }
    val MIXED_WHITE_BRICK_STAIRS = register("mixed_white_brick_stairs") { BlockItem(HybridBlocksBlocks.MIXED_WHITE_BRICK_STAIRS.get(), Item.Properties()) }
    val MIXED_WHITE_BRICK_SLAB = register("mixed_white_brick_slab") { BlockItem(HybridBlocksBlocks.MIXED_WHITE_BRICK_SLAB.get(), Item.Properties()) }
    val MIXED_WHITE_BRICK_WALL = register("mixed_white_brick_wall") { BlockItem(HybridBlocksBlocks.MIXED_WHITE_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_MIXED_WHITE_BRICKS = register("large_mixed_white_bricks") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_WHITE_BRICKS.get(), Item.Properties()) }
    val LARGE_MIXED_WHITE_BRICK_STAIRS = register("large_mixed_white_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_WHITE_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_MIXED_WHITE_BRICK_SLAB = register("large_mixed_white_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_WHITE_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_MIXED_WHITE_BRICK_WALL = register("large_mixed_white_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_WHITE_BRICK_WALL.get(), Item.Properties()) }
    
    val CRACKED_WHITE_BRICKS = register("cracked_white_bricks") { BlockItem(HybridBlocksBlocks.CRACKED_WHITE_BRICKS.get(), Item.Properties()) }
    val BASKETWEAVE_WHITE_BRICKS = register("basketweave_white_bricks") { BlockItem(HybridBlocksBlocks.BASKETWEAVE_WHITE_BRICKS.get(), Item.Properties()) }
    val PINWHEEL_WHITE_BRICKS = register("pinwheel_white_bricks") { BlockItem(HybridBlocksBlocks.PINWHEEL_WHITE_BRICKS.get(), Item.Properties()) }
    val JACK_ON_JACK_WHITE_BRICKS = register("jack_on_jack_white_bricks") { BlockItem(HybridBlocksBlocks.JACK_ON_JACK_WHITE_BRICKS.get(), Item.Properties()) }

    //  white shingles
    val WHITE_SHINGLES = register("white_shingles") { BlockItem(HybridBlocksBlocks.WHITE_SHINGLES.get(), Item.Properties()) }
    val WHITE_SHINGLE_STAIRS = register("white_shingle_stairs") { BlockItem(HybridBlocksBlocks.WHITE_SHINGLE_STAIRS.get(), Item.Properties()) }
    val WHITE_SHINGLE_SLAB = register("white_shingle_slab") { BlockItem(HybridBlocksBlocks.WHITE_SHINGLE_SLAB.get(), Item.Properties()) }
    val WHITE_SHINGLE_WALL = register("white_shingle_wall") { BlockItem(HybridBlocksBlocks.WHITE_SHINGLE_WALL.get(), Item.Properties()) }
    
    val MIXED_WHITE_SHINGLES = register("mixed_white_shingles") { BlockItem(HybridBlocksBlocks.MIXED_WHITE_SHINGLES.get(), Item.Properties()) }
    val MIXED_WHITE_SHINGLE_STAIRS = register("mixed_white_shingle_stairs") { BlockItem(HybridBlocksBlocks.MIXED_WHITE_SHINGLE_STAIRS.get(), Item.Properties()) }
    val MIXED_WHITE_SHINGLE_SLAB = register("mixed_white_shingle_slab") { BlockItem(HybridBlocksBlocks.MIXED_WHITE_SHINGLE_SLAB.get(), Item.Properties()) }
    val MIXED_WHITE_SHINGLE_WALL = register("mixed_white_shingle_wall") { BlockItem(HybridBlocksBlocks.MIXED_WHITE_SHINGLE_WALL.get(), Item.Properties()) }

    val WHITE_BRICK_CHIMNEY = register("white_brick_chimney") { BlockItem(HybridBlocksBlocks.WHITE_BRICK_CHIMNEY.get(), Item.Properties()) }
    //#endregion

    //#region Light_Gray Bricks
    //  normal light_gray bricks
    val SMALL_LIGHT_GRAY_BRICKS = register("small_light_gray_bricks") { BlockItem(HybridBlocksBlocks.SMALL_LIGHT_GRAY_BRICKS.get(), Item.Properties()) }
    val SMALL_LIGHT_GRAY_BRICK_STAIRS = register("small_light_gray_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_LIGHT_GRAY_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_LIGHT_GRAY_BRICK_SLAB = register("small_light_gray_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_LIGHT_GRAY_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_LIGHT_GRAY_BRICK_WALL = register("small_light_gray_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_LIGHT_GRAY_BRICK_WALL.get(), Item.Properties()) }

    val LIGHT_GRAY_BRICKS = register("light_gray_bricks") { BlockItem(HybridBlocksBlocks.LIGHT_GRAY_BRICKS.get(), Item.Properties()) }
    val LIGHT_GRAY_BRICK_STAIRS = register("light_gray_brick_stairs") { BlockItem(HybridBlocksBlocks.LIGHT_GRAY_BRICK_STAIRS.get(), Item.Properties()) }
    val LIGHT_GRAY_BRICK_SLAB = register("light_gray_brick_slab") { BlockItem(HybridBlocksBlocks.LIGHT_GRAY_BRICK_SLAB.get(), Item.Properties()) }
    val LIGHT_GRAY_BRICK_WALL = register("light_gray_brick_wall") { BlockItem(HybridBlocksBlocks.LIGHT_GRAY_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_LIGHT_GRAY_BRICKS = register("large_light_gray_bricks") { BlockItem(HybridBlocksBlocks.LARGE_LIGHT_GRAY_BRICKS.get(), Item.Properties()) }
    val LARGE_LIGHT_GRAY_BRICK_STAIRS = register("large_light_gray_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_LIGHT_GRAY_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_LIGHT_GRAY_BRICK_SLAB = register("large_light_gray_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_LIGHT_GRAY_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_LIGHT_GRAY_BRICK_WALL = register("large_light_gray_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_LIGHT_GRAY_BRICK_WALL.get(), Item.Properties()) }

    //  mixed light_gray bricks
    val SMALL_MIXED_LIGHT_GRAY_BRICKS = register("small_mixed_light_gray_bricks") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_LIGHT_GRAY_BRICKS.get(), Item.Properties()) }
    val SMALL_MIXED_LIGHT_GRAY_BRICK_STAIRS = register("small_mixed_light_gray_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_LIGHT_GRAY_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_MIXED_LIGHT_GRAY_BRICK_SLAB = register("small_mixed_light_gray_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_LIGHT_GRAY_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_MIXED_LIGHT_GRAY_BRICK_WALL = register("small_mixed_light_gray_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_LIGHT_GRAY_BRICK_WALL.get(), Item.Properties()) }

    val MIXED_LIGHT_GRAY_BRICKS = register("mixed_light_gray_bricks") { BlockItem(HybridBlocksBlocks.MIXED_LIGHT_GRAY_BRICKS.get(), Item.Properties()) }
    val MIXED_LIGHT_GRAY_BRICK_STAIRS = register("mixed_light_gray_brick_stairs") { BlockItem(HybridBlocksBlocks.MIXED_LIGHT_GRAY_BRICK_STAIRS.get(), Item.Properties()) }
    val MIXED_LIGHT_GRAY_BRICK_SLAB = register("mixed_light_gray_brick_slab") { BlockItem(HybridBlocksBlocks.MIXED_LIGHT_GRAY_BRICK_SLAB.get(), Item.Properties()) }
    val MIXED_LIGHT_GRAY_BRICK_WALL = register("mixed_light_gray_brick_wall") { BlockItem(HybridBlocksBlocks.MIXED_LIGHT_GRAY_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_MIXED_LIGHT_GRAY_BRICKS = register("large_mixed_light_gray_bricks") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_LIGHT_GRAY_BRICKS.get(), Item.Properties()) }
    val LARGE_MIXED_LIGHT_GRAY_BRICK_STAIRS = register("large_mixed_light_gray_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_LIGHT_GRAY_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_MIXED_LIGHT_GRAY_BRICK_SLAB = register("large_mixed_light_gray_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_LIGHT_GRAY_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_MIXED_LIGHT_GRAY_BRICK_WALL = register("large_mixed_light_gray_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_LIGHT_GRAY_BRICK_WALL.get(), Item.Properties()) }

    val CRACKED_LIGHT_GRAY_BRICKS = register("cracked_light_gray_bricks") { BlockItem(HybridBlocksBlocks.CRACKED_LIGHT_GRAY_BRICKS.get(), Item.Properties()) }
    val BASKETWEAVE_LIGHT_GRAY_BRICKS = register("basketweave_light_gray_bricks") { BlockItem(HybridBlocksBlocks.BASKETWEAVE_LIGHT_GRAY_BRICKS.get(), Item.Properties()) }
    val PINWHEEL_LIGHT_GRAY_BRICKS = register("pinwheel_light_gray_bricks") { BlockItem(HybridBlocksBlocks.PINWHEEL_LIGHT_GRAY_BRICKS.get(), Item.Properties()) }
    val JACK_ON_JACK_LIGHT_GRAY_BRICKS = register("jack_on_jack_light_gray_bricks") { BlockItem(HybridBlocksBlocks.JACK_ON_JACK_LIGHT_GRAY_BRICKS.get(), Item.Properties()) }

    //  light_gray shingles
    val LIGHT_GRAY_SHINGLES = register("light_gray_shingles") { BlockItem(HybridBlocksBlocks.LIGHT_GRAY_SHINGLES.get(), Item.Properties()) }
    val LIGHT_GRAY_SHINGLE_STAIRS = register("light_gray_shingle_stairs") { BlockItem(HybridBlocksBlocks.LIGHT_GRAY_SHINGLE_STAIRS.get(), Item.Properties()) }
    val LIGHT_GRAY_SHINGLE_SLAB = register("light_gray_shingle_slab") { BlockItem(HybridBlocksBlocks.LIGHT_GRAY_SHINGLE_SLAB.get(), Item.Properties()) }
    val LIGHT_GRAY_SHINGLE_WALL = register("light_gray_shingle_wall") { BlockItem(HybridBlocksBlocks.LIGHT_GRAY_SHINGLE_WALL.get(), Item.Properties()) }

    val MIXED_LIGHT_GRAY_SHINGLES = register("mixed_light_gray_shingles") { BlockItem(HybridBlocksBlocks.MIXED_LIGHT_GRAY_SHINGLES.get(), Item.Properties()) }
    val MIXED_LIGHT_GRAY_SHINGLE_STAIRS = register("mixed_light_gray_shingle_stairs") { BlockItem(HybridBlocksBlocks.MIXED_LIGHT_GRAY_SHINGLE_STAIRS.get(), Item.Properties()) }
    val MIXED_LIGHT_GRAY_SHINGLE_SLAB = register("mixed_light_gray_shingle_slab") { BlockItem(HybridBlocksBlocks.MIXED_LIGHT_GRAY_SHINGLE_SLAB.get(), Item.Properties()) }
    val MIXED_LIGHT_GRAY_SHINGLE_WALL = register("mixed_light_gray_shingle_wall") { BlockItem(HybridBlocksBlocks.MIXED_LIGHT_GRAY_SHINGLE_WALL.get(), Item.Properties()) }

    val LIGHT_GRAY_BRICK_CHIMNEY = register("light_gray_brick_chimney") { BlockItem(HybridBlocksBlocks.LIGHT_GRAY_BRICK_CHIMNEY.get(), Item.Properties()) }
    //#endregion

    //#region Gray Bricks
    //  normal gray bricks
    val SMALL_GRAY_BRICKS = register("small_gray_bricks") { BlockItem(HybridBlocksBlocks.SMALL_GRAY_BRICKS.get(), Item.Properties()) }
    val SMALL_GRAY_BRICK_STAIRS = register("small_gray_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_GRAY_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_GRAY_BRICK_SLAB = register("small_gray_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_GRAY_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_GRAY_BRICK_WALL = register("small_gray_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_GRAY_BRICK_WALL.get(), Item.Properties()) }

    val GRAY_BRICKS = register("gray_bricks") { BlockItem(HybridBlocksBlocks.GRAY_BRICKS.get(), Item.Properties()) }
    val GRAY_BRICK_STAIRS = register("gray_brick_stairs") { BlockItem(HybridBlocksBlocks.GRAY_BRICK_STAIRS.get(), Item.Properties()) }
    val GRAY_BRICK_SLAB = register("gray_brick_slab") { BlockItem(HybridBlocksBlocks.GRAY_BRICK_SLAB.get(), Item.Properties()) }
    val GRAY_BRICK_WALL = register("gray_brick_wall") { BlockItem(HybridBlocksBlocks.GRAY_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_GRAY_BRICKS = register("large_gray_bricks") { BlockItem(HybridBlocksBlocks.LARGE_GRAY_BRICKS.get(), Item.Properties()) }
    val LARGE_GRAY_BRICK_STAIRS = register("large_gray_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_GRAY_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_GRAY_BRICK_SLAB = register("large_gray_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_GRAY_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_GRAY_BRICK_WALL = register("large_gray_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_GRAY_BRICK_WALL.get(), Item.Properties()) }

    //  mixed gray bricks
    val SMALL_MIXED_GRAY_BRICKS = register("small_mixed_gray_bricks") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_GRAY_BRICKS.get(), Item.Properties()) }
    val SMALL_MIXED_GRAY_BRICK_STAIRS = register("small_mixed_gray_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_GRAY_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_MIXED_GRAY_BRICK_SLAB = register("small_mixed_gray_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_GRAY_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_MIXED_GRAY_BRICK_WALL = register("small_mixed_gray_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_GRAY_BRICK_WALL.get(), Item.Properties()) }

    val MIXED_GRAY_BRICKS = register("mixed_gray_bricks") { BlockItem(HybridBlocksBlocks.MIXED_GRAY_BRICKS.get(), Item.Properties()) }
    val MIXED_GRAY_BRICK_STAIRS = register("mixed_gray_brick_stairs") { BlockItem(HybridBlocksBlocks.MIXED_GRAY_BRICK_STAIRS.get(), Item.Properties()) }
    val MIXED_GRAY_BRICK_SLAB = register("mixed_gray_brick_slab") { BlockItem(HybridBlocksBlocks.MIXED_GRAY_BRICK_SLAB.get(), Item.Properties()) }
    val MIXED_GRAY_BRICK_WALL = register("mixed_gray_brick_wall") { BlockItem(HybridBlocksBlocks.MIXED_GRAY_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_MIXED_GRAY_BRICKS = register("large_mixed_gray_bricks") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_GRAY_BRICKS.get(), Item.Properties()) }
    val LARGE_MIXED_GRAY_BRICK_STAIRS = register("large_mixed_gray_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_GRAY_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_MIXED_GRAY_BRICK_SLAB = register("large_mixed_gray_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_GRAY_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_MIXED_GRAY_BRICK_WALL = register("large_mixed_gray_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_GRAY_BRICK_WALL.get(), Item.Properties()) }

    val CRACKED_GRAY_BRICKS = register("cracked_gray_bricks") { BlockItem(HybridBlocksBlocks.CRACKED_GRAY_BRICKS.get(), Item.Properties()) }
    val BASKETWEAVE_GRAY_BRICKS = register("basketweave_gray_bricks") { BlockItem(HybridBlocksBlocks.BASKETWEAVE_GRAY_BRICKS.get(), Item.Properties()) }
    val PINWHEEL_GRAY_BRICKS = register("pinwheel_gray_bricks") { BlockItem(HybridBlocksBlocks.PINWHEEL_GRAY_BRICKS.get(), Item.Properties()) }
    val JACK_ON_JACK_GRAY_BRICKS = register("jack_on_jack_gray_bricks") { BlockItem(HybridBlocksBlocks.JACK_ON_JACK_GRAY_BRICKS.get(), Item.Properties()) }

    //  gray shingles
    val GRAY_SHINGLES = register("gray_shingles") { BlockItem(HybridBlocksBlocks.GRAY_SHINGLES.get(), Item.Properties()) }
    val GRAY_SHINGLE_STAIRS = register("gray_shingle_stairs") { BlockItem(HybridBlocksBlocks.GRAY_SHINGLE_STAIRS.get(), Item.Properties()) }
    val GRAY_SHINGLE_SLAB = register("gray_shingle_slab") { BlockItem(HybridBlocksBlocks.GRAY_SHINGLE_SLAB.get(), Item.Properties()) }
    val GRAY_SHINGLE_WALL = register("gray_shingle_wall") { BlockItem(HybridBlocksBlocks.GRAY_SHINGLE_WALL.get(), Item.Properties()) }

    val MIXED_GRAY_SHINGLES = register("mixed_gray_shingles") { BlockItem(HybridBlocksBlocks.MIXED_GRAY_SHINGLES.get(), Item.Properties()) }
    val MIXED_GRAY_SHINGLE_STAIRS = register("mixed_gray_shingle_stairs") { BlockItem(HybridBlocksBlocks.MIXED_GRAY_SHINGLE_STAIRS.get(), Item.Properties()) }
    val MIXED_GRAY_SHINGLE_SLAB = register("mixed_gray_shingle_slab") { BlockItem(HybridBlocksBlocks.MIXED_GRAY_SHINGLE_SLAB.get(), Item.Properties()) }
    val MIXED_GRAY_SHINGLE_WALL = register("mixed_gray_shingle_wall") { BlockItem(HybridBlocksBlocks.MIXED_GRAY_SHINGLE_WALL.get(), Item.Properties()) }

    val GRAY_BRICK_CHIMNEY = register("gray_brick_chimney") { BlockItem(HybridBlocksBlocks.GRAY_BRICK_CHIMNEY.get(), Item.Properties()) }
    //#endregion

    //#region Black Bricks
    //  normal black bricks
    val SMALL_BLACK_BRICKS = register("small_black_bricks") { BlockItem(HybridBlocksBlocks.SMALL_BLACK_BRICKS.get(), Item.Properties()) }
    val SMALL_BLACK_BRICK_STAIRS = register("small_black_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_BLACK_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_BLACK_BRICK_SLAB = register("small_black_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_BLACK_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_BLACK_BRICK_WALL = register("small_black_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_BLACK_BRICK_WALL.get(), Item.Properties()) }

    val BLACK_BRICKS = register("black_bricks") { BlockItem(HybridBlocksBlocks.BLACK_BRICKS.get(), Item.Properties()) }
    val BLACK_BRICK_STAIRS = register("black_brick_stairs") { BlockItem(HybridBlocksBlocks.BLACK_BRICK_STAIRS.get(), Item.Properties()) }
    val BLACK_BRICK_SLAB = register("black_brick_slab") { BlockItem(HybridBlocksBlocks.BLACK_BRICK_SLAB.get(), Item.Properties()) }
    val BLACK_BRICK_WALL = register("black_brick_wall") { BlockItem(HybridBlocksBlocks.BLACK_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_BLACK_BRICKS = register("large_black_bricks") { BlockItem(HybridBlocksBlocks.LARGE_BLACK_BRICKS.get(), Item.Properties()) }
    val LARGE_BLACK_BRICK_STAIRS = register("large_black_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_BLACK_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_BLACK_BRICK_SLAB = register("large_black_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_BLACK_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_BLACK_BRICK_WALL = register("large_black_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_BLACK_BRICK_WALL.get(), Item.Properties()) }

    //  mixed black bricks
    val SMALL_MIXED_BLACK_BRICKS = register("small_mixed_black_bricks") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_BLACK_BRICKS.get(), Item.Properties()) }
    val SMALL_MIXED_BLACK_BRICK_STAIRS = register("small_mixed_black_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_BLACK_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_MIXED_BLACK_BRICK_SLAB = register("small_mixed_black_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_BLACK_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_MIXED_BLACK_BRICK_WALL = register("small_mixed_black_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_BLACK_BRICK_WALL.get(), Item.Properties()) }

    val MIXED_BLACK_BRICKS = register("mixed_black_bricks") { BlockItem(HybridBlocksBlocks.MIXED_BLACK_BRICKS.get(), Item.Properties()) }
    val MIXED_BLACK_BRICK_STAIRS = register("mixed_black_brick_stairs") { BlockItem(HybridBlocksBlocks.MIXED_BLACK_BRICK_STAIRS.get(), Item.Properties()) }
    val MIXED_BLACK_BRICK_SLAB = register("mixed_black_brick_slab") { BlockItem(HybridBlocksBlocks.MIXED_BLACK_BRICK_SLAB.get(), Item.Properties()) }
    val MIXED_BLACK_BRICK_WALL = register("mixed_black_brick_wall") { BlockItem(HybridBlocksBlocks.MIXED_BLACK_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_MIXED_BLACK_BRICKS = register("large_mixed_black_bricks") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_BLACK_BRICKS.get(), Item.Properties()) }
    val LARGE_MIXED_BLACK_BRICK_STAIRS = register("large_mixed_black_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_BLACK_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_MIXED_BLACK_BRICK_SLAB = register("large_mixed_black_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_BLACK_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_MIXED_BLACK_BRICK_WALL = register("large_mixed_black_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_BLACK_BRICK_WALL.get(), Item.Properties()) }

    val CRACKED_BLACK_BRICKS = register("cracked_black_bricks") { BlockItem(HybridBlocksBlocks.CRACKED_BLACK_BRICKS.get(), Item.Properties()) }
    val BASKETWEAVE_BLACK_BRICKS = register("basketweave_black_bricks") { BlockItem(HybridBlocksBlocks.BASKETWEAVE_BLACK_BRICKS.get(), Item.Properties()) }
    val PINWHEEL_BLACK_BRICKS = register("pinwheel_black_bricks") { BlockItem(HybridBlocksBlocks.PINWHEEL_BLACK_BRICKS.get(), Item.Properties()) }
    val JACK_ON_JACK_BLACK_BRICKS = register("jack_on_jack_black_bricks") { BlockItem(HybridBlocksBlocks.JACK_ON_JACK_BLACK_BRICKS.get(), Item.Properties()) }

    //  black shingles
    val BLACK_SHINGLES = register("black_shingles") { BlockItem(HybridBlocksBlocks.BLACK_SHINGLES.get(), Item.Properties()) }
    val BLACK_SHINGLE_STAIRS = register("black_shingle_stairs") { BlockItem(HybridBlocksBlocks.BLACK_SHINGLE_STAIRS.get(), Item.Properties()) }
    val BLACK_SHINGLE_SLAB = register("black_shingle_slab") { BlockItem(HybridBlocksBlocks.BLACK_SHINGLE_SLAB.get(), Item.Properties()) }
    val BLACK_SHINGLE_WALL = register("black_shingle_wall") { BlockItem(HybridBlocksBlocks.BLACK_SHINGLE_WALL.get(), Item.Properties()) }

    val MIXED_BLACK_SHINGLES = register("mixed_black_shingles") { BlockItem(HybridBlocksBlocks.MIXED_BLACK_SHINGLES.get(), Item.Properties()) }
    val MIXED_BLACK_SHINGLE_STAIRS = register("mixed_black_shingle_stairs") { BlockItem(HybridBlocksBlocks.MIXED_BLACK_SHINGLE_STAIRS.get(), Item.Properties()) }
    val MIXED_BLACK_SHINGLE_SLAB = register("mixed_black_shingle_slab") { BlockItem(HybridBlocksBlocks.MIXED_BLACK_SHINGLE_SLAB.get(), Item.Properties()) }
    val MIXED_BLACK_SHINGLE_WALL = register("mixed_black_shingle_wall") { BlockItem(HybridBlocksBlocks.MIXED_BLACK_SHINGLE_WALL.get(), Item.Properties()) }

    val BLACK_BRICK_CHIMNEY = register("black_brick_chimney") { BlockItem(HybridBlocksBlocks.BLACK_BRICK_CHIMNEY.get(), Item.Properties()) }
    //#endregion

    //#region Brown Bricks
    //  normal brown bricks
    val SMALL_BROWN_BRICKS = register("small_brown_bricks") { BlockItem(HybridBlocksBlocks.SMALL_BROWN_BRICKS.get(), Item.Properties()) }
    val SMALL_BROWN_BRICK_STAIRS = register("small_brown_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_BROWN_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_BROWN_BRICK_SLAB = register("small_brown_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_BROWN_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_BROWN_BRICK_WALL = register("small_brown_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_BROWN_BRICK_WALL.get(), Item.Properties()) }

    val BROWN_BRICKS = register("brown_bricks") { BlockItem(HybridBlocksBlocks.BROWN_BRICKS.get(), Item.Properties()) }
    val BROWN_BRICK_STAIRS = register("brown_brick_stairs") { BlockItem(HybridBlocksBlocks.BROWN_BRICK_STAIRS.get(), Item.Properties()) }
    val BROWN_BRICK_SLAB = register("brown_brick_slab") { BlockItem(HybridBlocksBlocks.BROWN_BRICK_SLAB.get(), Item.Properties()) }
    val BROWN_BRICK_WALL = register("brown_brick_wall") { BlockItem(HybridBlocksBlocks.BROWN_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_BROWN_BRICKS = register("large_brown_bricks") { BlockItem(HybridBlocksBlocks.LARGE_BROWN_BRICKS.get(), Item.Properties()) }
    val LARGE_BROWN_BRICK_STAIRS = register("large_brown_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_BROWN_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_BROWN_BRICK_SLAB = register("large_brown_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_BROWN_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_BROWN_BRICK_WALL = register("large_brown_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_BROWN_BRICK_WALL.get(), Item.Properties()) }

    //  mixed brown bricks
    val SMALL_MIXED_BROWN_BRICKS = register("small_mixed_brown_bricks") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_BROWN_BRICKS.get(), Item.Properties()) }
    val SMALL_MIXED_BROWN_BRICK_STAIRS = register("small_mixed_brown_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_BROWN_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_MIXED_BROWN_BRICK_SLAB = register("small_mixed_brown_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_BROWN_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_MIXED_BROWN_BRICK_WALL = register("small_mixed_brown_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_BROWN_BRICK_WALL.get(), Item.Properties()) }

    val MIXED_BROWN_BRICKS = register("mixed_brown_bricks") { BlockItem(HybridBlocksBlocks.MIXED_BROWN_BRICKS.get(), Item.Properties()) }
    val MIXED_BROWN_BRICK_STAIRS = register("mixed_brown_brick_stairs") { BlockItem(HybridBlocksBlocks.MIXED_BROWN_BRICK_STAIRS.get(), Item.Properties()) }
    val MIXED_BROWN_BRICK_SLAB = register("mixed_brown_brick_slab") { BlockItem(HybridBlocksBlocks.MIXED_BROWN_BRICK_SLAB.get(), Item.Properties()) }
    val MIXED_BROWN_BRICK_WALL = register("mixed_brown_brick_wall") { BlockItem(HybridBlocksBlocks.MIXED_BROWN_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_MIXED_BROWN_BRICKS = register("large_mixed_brown_bricks") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_BROWN_BRICKS.get(), Item.Properties()) }
    val LARGE_MIXED_BROWN_BRICK_STAIRS = register("large_mixed_brown_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_BROWN_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_MIXED_BROWN_BRICK_SLAB = register("large_mixed_brown_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_BROWN_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_MIXED_BROWN_BRICK_WALL = register("large_mixed_brown_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_BROWN_BRICK_WALL.get(), Item.Properties()) }

    val CRACKED_BROWN_BRICKS = register("cracked_brown_bricks") { BlockItem(HybridBlocksBlocks.CRACKED_BROWN_BRICKS.get(), Item.Properties()) }
    val BASKETWEAVE_BROWN_BRICKS = register("basketweave_brown_bricks") { BlockItem(HybridBlocksBlocks.BASKETWEAVE_BROWN_BRICKS.get(), Item.Properties()) }
    val PINWHEEL_BROWN_BRICKS = register("pinwheel_brown_bricks") { BlockItem(HybridBlocksBlocks.PINWHEEL_BROWN_BRICKS.get(), Item.Properties()) }
    val JACK_ON_JACK_BROWN_BRICKS = register("jack_on_jack_brown_bricks") { BlockItem(HybridBlocksBlocks.JACK_ON_JACK_BROWN_BRICKS.get(), Item.Properties()) }

    //  brown shingles
    val BROWN_SHINGLES = register("brown_shingles") { BlockItem(HybridBlocksBlocks.BROWN_SHINGLES.get(), Item.Properties()) }
    val BROWN_SHINGLE_STAIRS = register("brown_shingle_stairs") { BlockItem(HybridBlocksBlocks.BROWN_SHINGLE_STAIRS.get(), Item.Properties()) }
    val BROWN_SHINGLE_SLAB = register("brown_shingle_slab") { BlockItem(HybridBlocksBlocks.BROWN_SHINGLE_SLAB.get(), Item.Properties()) }
    val BROWN_SHINGLE_WALL = register("brown_shingle_wall") { BlockItem(HybridBlocksBlocks.BROWN_SHINGLE_WALL.get(), Item.Properties()) }

    val MIXED_BROWN_SHINGLES = register("mixed_brown_shingles") { BlockItem(HybridBlocksBlocks.MIXED_BROWN_SHINGLES.get(), Item.Properties()) }
    val MIXED_BROWN_SHINGLE_STAIRS = register("mixed_brown_shingle_stairs") { BlockItem(HybridBlocksBlocks.MIXED_BROWN_SHINGLE_STAIRS.get(), Item.Properties()) }
    val MIXED_BROWN_SHINGLE_SLAB = register("mixed_brown_shingle_slab") { BlockItem(HybridBlocksBlocks.MIXED_BROWN_SHINGLE_SLAB.get(), Item.Properties()) }
    val MIXED_BROWN_SHINGLE_WALL = register("mixed_brown_shingle_wall") { BlockItem(HybridBlocksBlocks.MIXED_BROWN_SHINGLE_WALL.get(), Item.Properties()) }

    val BROWN_BRICK_CHIMNEY = register("brown_brick_chimney") { BlockItem(HybridBlocksBlocks.BROWN_BRICK_CHIMNEY.get(), Item.Properties()) }
    //#endregion

    //#region Red Bricks
    //  normal red bricks
    val SMALL_RED_BRICKS = register("small_red_bricks") { BlockItem(HybridBlocksBlocks.SMALL_RED_BRICKS.get(), Item.Properties()) }
    val SMALL_RED_BRICK_STAIRS = register("small_red_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_RED_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_RED_BRICK_SLAB = register("small_red_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_RED_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_RED_BRICK_WALL = register("small_red_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_RED_BRICK_WALL.get(), Item.Properties()) }

    val RED_BRICKS = register("red_bricks") { BlockItem(HybridBlocksBlocks.RED_BRICKS.get(), Item.Properties()) }
    val RED_BRICK_STAIRS = register("red_brick_stairs") { BlockItem(HybridBlocksBlocks.RED_BRICK_STAIRS.get(), Item.Properties()) }
    val RED_BRICK_SLAB = register("red_brick_slab") { BlockItem(HybridBlocksBlocks.RED_BRICK_SLAB.get(), Item.Properties()) }
    val RED_BRICK_WALL = register("red_brick_wall") { BlockItem(HybridBlocksBlocks.RED_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_RED_BRICKS = register("large_red_bricks") { BlockItem(HybridBlocksBlocks.LARGE_RED_BRICKS.get(), Item.Properties()) }
    val LARGE_RED_BRICK_STAIRS = register("large_red_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_RED_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_RED_BRICK_SLAB = register("large_red_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_RED_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_RED_BRICK_WALL = register("large_red_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_RED_BRICK_WALL.get(), Item.Properties()) }

    //  mixed red bricks
    val SMALL_MIXED_RED_BRICKS = register("small_mixed_red_bricks") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_RED_BRICKS.get(), Item.Properties()) }
    val SMALL_MIXED_RED_BRICK_STAIRS = register("small_mixed_red_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_RED_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_MIXED_RED_BRICK_SLAB = register("small_mixed_red_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_RED_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_MIXED_RED_BRICK_WALL = register("small_mixed_red_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_RED_BRICK_WALL.get(), Item.Properties()) }

    val MIXED_RED_BRICKS = register("mixed_red_bricks") { BlockItem(HybridBlocksBlocks.MIXED_RED_BRICKS.get(), Item.Properties()) }
    val MIXED_RED_BRICK_STAIRS = register("mixed_red_brick_stairs") { BlockItem(HybridBlocksBlocks.MIXED_RED_BRICK_STAIRS.get(), Item.Properties()) }
    val MIXED_RED_BRICK_SLAB = register("mixed_red_brick_slab") { BlockItem(HybridBlocksBlocks.MIXED_RED_BRICK_SLAB.get(), Item.Properties()) }
    val MIXED_RED_BRICK_WALL = register("mixed_red_brick_wall") { BlockItem(HybridBlocksBlocks.MIXED_RED_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_MIXED_RED_BRICKS = register("large_mixed_red_bricks") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_RED_BRICKS.get(), Item.Properties()) }
    val LARGE_MIXED_RED_BRICK_STAIRS = register("large_mixed_red_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_RED_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_MIXED_RED_BRICK_SLAB = register("large_mixed_red_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_RED_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_MIXED_RED_BRICK_WALL = register("large_mixed_red_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_RED_BRICK_WALL.get(), Item.Properties()) }

    val CRACKED_RED_BRICKS = register("cracked_red_bricks") { BlockItem(HybridBlocksBlocks.CRACKED_RED_BRICKS.get(), Item.Properties()) }
    val BASKETWEAVE_RED_BRICKS = register("basketweave_red_bricks") { BlockItem(HybridBlocksBlocks.BASKETWEAVE_RED_BRICKS.get(), Item.Properties()) }
    val PINWHEEL_RED_BRICKS = register("pinwheel_red_bricks") { BlockItem(HybridBlocksBlocks.PINWHEEL_RED_BRICKS.get(), Item.Properties()) }
    val JACK_ON_JACK_RED_BRICKS = register("jack_on_jack_red_bricks") { BlockItem(HybridBlocksBlocks.JACK_ON_JACK_RED_BRICKS.get(), Item.Properties()) }

    //  red shingles
    val RED_SHINGLES = register("red_shingles") { BlockItem(HybridBlocksBlocks.RED_SHINGLES.get(), Item.Properties()) }
    val RED_SHINGLE_STAIRS = register("red_shingle_stairs") { BlockItem(HybridBlocksBlocks.RED_SHINGLE_STAIRS.get(), Item.Properties()) }
    val RED_SHINGLE_SLAB = register("red_shingle_slab") { BlockItem(HybridBlocksBlocks.RED_SHINGLE_SLAB.get(), Item.Properties()) }
    val RED_SHINGLE_WALL = register("red_shingle_wall") { BlockItem(HybridBlocksBlocks.RED_SHINGLE_WALL.get(), Item.Properties()) }

    val MIXED_RED_SHINGLES = register("mixed_red_shingles") { BlockItem(HybridBlocksBlocks.MIXED_RED_SHINGLES.get(), Item.Properties()) }
    val MIXED_RED_SHINGLE_STAIRS = register("mixed_red_shingle_stairs") { BlockItem(HybridBlocksBlocks.MIXED_RED_SHINGLE_STAIRS.get(), Item.Properties()) }
    val MIXED_RED_SHINGLE_SLAB = register("mixed_red_shingle_slab") { BlockItem(HybridBlocksBlocks.MIXED_RED_SHINGLE_SLAB.get(), Item.Properties()) }
    val MIXED_RED_SHINGLE_WALL = register("mixed_red_shingle_wall") { BlockItem(HybridBlocksBlocks.MIXED_RED_SHINGLE_WALL.get(), Item.Properties()) }

    val RED_BRICK_CHIMNEY = register("red_brick_chimney") { BlockItem(HybridBlocksBlocks.RED_BRICK_CHIMNEY.get(), Item.Properties()) }
    //#endregion
    
    //#region Orange Bricks
    //  normal orange bricks
    val SMALL_ORANGE_BRICKS = register("small_orange_bricks") { BlockItem(HybridBlocksBlocks.SMALL_ORANGE_BRICKS.get(), Item.Properties()) }
    val SMALL_ORANGE_BRICK_STAIRS = register("small_orange_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_ORANGE_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_ORANGE_BRICK_SLAB = register("small_orange_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_ORANGE_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_ORANGE_BRICK_WALL = register("small_orange_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_ORANGE_BRICK_WALL.get(), Item.Properties()) }

    val ORANGE_BRICKS = register("orange_bricks") { BlockItem(HybridBlocksBlocks.ORANGE_BRICKS.get(), Item.Properties()) }
    val ORANGE_BRICK_STAIRS = register("orange_brick_stairs") { BlockItem(HybridBlocksBlocks.ORANGE_BRICK_STAIRS.get(), Item.Properties()) }
    val ORANGE_BRICK_SLAB = register("orange_brick_slab") { BlockItem(HybridBlocksBlocks.ORANGE_BRICK_SLAB.get(), Item.Properties()) }
    val ORANGE_BRICK_WALL = register("orange_brick_wall") { BlockItem(HybridBlocksBlocks.ORANGE_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_ORANGE_BRICKS = register("large_orange_bricks") { BlockItem(HybridBlocksBlocks.LARGE_ORANGE_BRICKS.get(), Item.Properties()) }
    val LARGE_ORANGE_BRICK_STAIRS = register("large_orange_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_ORANGE_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_ORANGE_BRICK_SLAB = register("large_orange_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_ORANGE_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_ORANGE_BRICK_WALL = register("large_orange_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_ORANGE_BRICK_WALL.get(), Item.Properties()) }

    //  mixed orange bricks
    val SMALL_MIXED_ORANGE_BRICKS = register("small_mixed_orange_bricks") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_ORANGE_BRICKS.get(), Item.Properties()) }
    val SMALL_MIXED_ORANGE_BRICK_STAIRS = register("small_mixed_orange_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_ORANGE_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_MIXED_ORANGE_BRICK_SLAB = register("small_mixed_orange_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_ORANGE_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_MIXED_ORANGE_BRICK_WALL = register("small_mixed_orange_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_ORANGE_BRICK_WALL.get(), Item.Properties()) }

    val MIXED_ORANGE_BRICKS = register("mixed_orange_bricks") { BlockItem(HybridBlocksBlocks.MIXED_ORANGE_BRICKS.get(), Item.Properties()) }
    val MIXED_ORANGE_BRICK_STAIRS = register("mixed_orange_brick_stairs") { BlockItem(HybridBlocksBlocks.MIXED_ORANGE_BRICK_STAIRS.get(), Item.Properties()) }
    val MIXED_ORANGE_BRICK_SLAB = register("mixed_orange_brick_slab") { BlockItem(HybridBlocksBlocks.MIXED_ORANGE_BRICK_SLAB.get(), Item.Properties()) }
    val MIXED_ORANGE_BRICK_WALL = register("mixed_orange_brick_wall") { BlockItem(HybridBlocksBlocks.MIXED_ORANGE_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_MIXED_ORANGE_BRICKS = register("large_mixed_orange_bricks") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_ORANGE_BRICKS.get(), Item.Properties()) }
    val LARGE_MIXED_ORANGE_BRICK_STAIRS = register("large_mixed_orange_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_ORANGE_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_MIXED_ORANGE_BRICK_SLAB = register("large_mixed_orange_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_ORANGE_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_MIXED_ORANGE_BRICK_WALL = register("large_mixed_orange_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_ORANGE_BRICK_WALL.get(), Item.Properties()) }

    val CRACKED_ORANGE_BRICKS = register("cracked_orange_bricks") { BlockItem(HybridBlocksBlocks.CRACKED_ORANGE_BRICKS.get(), Item.Properties()) }
    val BASKETWEAVE_ORANGE_BRICKS = register("basketweave_orange_bricks") { BlockItem(HybridBlocksBlocks.BASKETWEAVE_ORANGE_BRICKS.get(), Item.Properties()) }
    val PINWHEEL_ORANGE_BRICKS = register("pinwheel_orange_bricks") { BlockItem(HybridBlocksBlocks.PINWHEEL_ORANGE_BRICKS.get(), Item.Properties()) }
    val JACK_ON_JACK_ORANGE_BRICKS = register("jack_on_jack_orange_bricks") { BlockItem(HybridBlocksBlocks.JACK_ON_JACK_ORANGE_BRICKS.get(), Item.Properties()) }

    //  orange shingles
    val ORANGE_SHINGLES = register("orange_shingles") { BlockItem(HybridBlocksBlocks.ORANGE_SHINGLES.get(), Item.Properties()) }
    val ORANGE_SHINGLE_STAIRS = register("orange_shingle_stairs") { BlockItem(HybridBlocksBlocks.ORANGE_SHINGLE_STAIRS.get(), Item.Properties()) }
    val ORANGE_SHINGLE_SLAB = register("orange_shingle_slab") { BlockItem(HybridBlocksBlocks.ORANGE_SHINGLE_SLAB.get(), Item.Properties()) }
    val ORANGE_SHINGLE_WALL = register("orange_shingle_wall") { BlockItem(HybridBlocksBlocks.ORANGE_SHINGLE_WALL.get(), Item.Properties()) }

    val MIXED_ORANGE_SHINGLES = register("mixed_orange_shingles") { BlockItem(HybridBlocksBlocks.MIXED_ORANGE_SHINGLES.get(), Item.Properties()) }
    val MIXED_ORANGE_SHINGLE_STAIRS = register("mixed_orange_shingle_stairs") { BlockItem(HybridBlocksBlocks.MIXED_ORANGE_SHINGLE_STAIRS.get(), Item.Properties()) }
    val MIXED_ORANGE_SHINGLE_SLAB = register("mixed_orange_shingle_slab") { BlockItem(HybridBlocksBlocks.MIXED_ORANGE_SHINGLE_SLAB.get(), Item.Properties()) }
    val MIXED_ORANGE_SHINGLE_WALL = register("mixed_orange_shingle_wall") { BlockItem(HybridBlocksBlocks.MIXED_ORANGE_SHINGLE_WALL.get(), Item.Properties()) }

    val ORANGE_BRICK_CHIMNEY = register("orange_brick_chimney") { BlockItem(HybridBlocksBlocks.ORANGE_BRICK_CHIMNEY.get(), Item.Properties()) }
    //#endregion

    //#region Yellow Bricks
    //  normal yellow bricks
    val SMALL_YELLOW_BRICKS = register("small_yellow_bricks") { BlockItem(HybridBlocksBlocks.SMALL_YELLOW_BRICKS.get(), Item.Properties()) }
    val SMALL_YELLOW_BRICK_STAIRS = register("small_yellow_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_YELLOW_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_YELLOW_BRICK_SLAB = register("small_yellow_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_YELLOW_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_YELLOW_BRICK_WALL = register("small_yellow_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_YELLOW_BRICK_WALL.get(), Item.Properties()) }

    val YELLOW_BRICKS = register("yellow_bricks") { BlockItem(HybridBlocksBlocks.YELLOW_BRICKS.get(), Item.Properties()) }
    val YELLOW_BRICK_STAIRS = register("yellow_brick_stairs") { BlockItem(HybridBlocksBlocks.YELLOW_BRICK_STAIRS.get(), Item.Properties()) }
    val YELLOW_BRICK_SLAB = register("yellow_brick_slab") { BlockItem(HybridBlocksBlocks.YELLOW_BRICK_SLAB.get(), Item.Properties()) }
    val YELLOW_BRICK_WALL = register("yellow_brick_wall") { BlockItem(HybridBlocksBlocks.YELLOW_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_YELLOW_BRICKS = register("large_yellow_bricks") { BlockItem(HybridBlocksBlocks.LARGE_YELLOW_BRICKS.get(), Item.Properties()) }
    val LARGE_YELLOW_BRICK_STAIRS = register("large_yellow_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_YELLOW_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_YELLOW_BRICK_SLAB = register("large_yellow_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_YELLOW_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_YELLOW_BRICK_WALL = register("large_yellow_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_YELLOW_BRICK_WALL.get(), Item.Properties()) }

    //  mixed yellow bricks
    val SMALL_MIXED_YELLOW_BRICKS = register("small_mixed_yellow_bricks") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_YELLOW_BRICKS.get(), Item.Properties()) }
    val SMALL_MIXED_YELLOW_BRICK_STAIRS = register("small_mixed_yellow_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_YELLOW_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_MIXED_YELLOW_BRICK_SLAB = register("small_mixed_yellow_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_YELLOW_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_MIXED_YELLOW_BRICK_WALL = register("small_mixed_yellow_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_YELLOW_BRICK_WALL.get(), Item.Properties()) }

    val MIXED_YELLOW_BRICKS = register("mixed_yellow_bricks") { BlockItem(HybridBlocksBlocks.MIXED_YELLOW_BRICKS.get(), Item.Properties()) }
    val MIXED_YELLOW_BRICK_STAIRS = register("mixed_yellow_brick_stairs") { BlockItem(HybridBlocksBlocks.MIXED_YELLOW_BRICK_STAIRS.get(), Item.Properties()) }
    val MIXED_YELLOW_BRICK_SLAB = register("mixed_yellow_brick_slab") { BlockItem(HybridBlocksBlocks.MIXED_YELLOW_BRICK_SLAB.get(), Item.Properties()) }
    val MIXED_YELLOW_BRICK_WALL = register("mixed_yellow_brick_wall") { BlockItem(HybridBlocksBlocks.MIXED_YELLOW_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_MIXED_YELLOW_BRICKS = register("large_mixed_yellow_bricks") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_YELLOW_BRICKS.get(), Item.Properties()) }
    val LARGE_MIXED_YELLOW_BRICK_STAIRS = register("large_mixed_yellow_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_YELLOW_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_MIXED_YELLOW_BRICK_SLAB = register("large_mixed_yellow_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_YELLOW_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_MIXED_YELLOW_BRICK_WALL = register("large_mixed_yellow_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_YELLOW_BRICK_WALL.get(), Item.Properties()) }

    val CRACKED_YELLOW_BRICKS = register("cracked_yellow_bricks") { BlockItem(HybridBlocksBlocks.CRACKED_YELLOW_BRICKS.get(), Item.Properties()) }
    val BASKETWEAVE_YELLOW_BRICKS = register("basketweave_yellow_bricks") { BlockItem(HybridBlocksBlocks.BASKETWEAVE_YELLOW_BRICKS.get(), Item.Properties()) }
    val PINWHEEL_YELLOW_BRICKS = register("pinwheel_yellow_bricks") { BlockItem(HybridBlocksBlocks.PINWHEEL_YELLOW_BRICKS.get(), Item.Properties()) }
    val JACK_ON_JACK_YELLOW_BRICKS = register("jack_on_jack_yellow_bricks") { BlockItem(HybridBlocksBlocks.JACK_ON_JACK_YELLOW_BRICKS.get(), Item.Properties()) }

    //  yellow shingles
    val YELLOW_SHINGLES = register("yellow_shingles") { BlockItem(HybridBlocksBlocks.YELLOW_SHINGLES.get(), Item.Properties()) }
    val YELLOW_SHINGLE_STAIRS = register("yellow_shingle_stairs") { BlockItem(HybridBlocksBlocks.YELLOW_SHINGLE_STAIRS.get(), Item.Properties()) }
    val YELLOW_SHINGLE_SLAB = register("yellow_shingle_slab") { BlockItem(HybridBlocksBlocks.YELLOW_SHINGLE_SLAB.get(), Item.Properties()) }
    val YELLOW_SHINGLE_WALL = register("yellow_shingle_wall") { BlockItem(HybridBlocksBlocks.YELLOW_SHINGLE_WALL.get(), Item.Properties()) }

    val MIXED_YELLOW_SHINGLES = register("mixed_yellow_shingles") { BlockItem(HybridBlocksBlocks.MIXED_YELLOW_SHINGLES.get(), Item.Properties()) }
    val MIXED_YELLOW_SHINGLE_STAIRS = register("mixed_yellow_shingle_stairs") { BlockItem(HybridBlocksBlocks.MIXED_YELLOW_SHINGLE_STAIRS.get(), Item.Properties()) }
    val MIXED_YELLOW_SHINGLE_SLAB = register("mixed_yellow_shingle_slab") { BlockItem(HybridBlocksBlocks.MIXED_YELLOW_SHINGLE_SLAB.get(), Item.Properties()) }
    val MIXED_YELLOW_SHINGLE_WALL = register("mixed_yellow_shingle_wall") { BlockItem(HybridBlocksBlocks.MIXED_YELLOW_SHINGLE_WALL.get(), Item.Properties()) }

    val YELLOW_BRICK_CHIMNEY = register("yellow_brick_chimney") { BlockItem(HybridBlocksBlocks.YELLOW_BRICK_CHIMNEY.get(), Item.Properties()) }
    //#endregion

    //#region Lime Bricks
    //  normal lime bricks
    val SMALL_LIME_BRICKS = register("small_lime_bricks") { BlockItem(HybridBlocksBlocks.SMALL_LIME_BRICKS.get(), Item.Properties()) }
    val SMALL_LIME_BRICK_STAIRS = register("small_lime_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_LIME_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_LIME_BRICK_SLAB = register("small_lime_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_LIME_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_LIME_BRICK_WALL = register("small_lime_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_LIME_BRICK_WALL.get(), Item.Properties()) }

    val LIME_BRICKS = register("lime_bricks") { BlockItem(HybridBlocksBlocks.LIME_BRICKS.get(), Item.Properties()) }
    val LIME_BRICK_STAIRS = register("lime_brick_stairs") { BlockItem(HybridBlocksBlocks.LIME_BRICK_STAIRS.get(), Item.Properties()) }
    val LIME_BRICK_SLAB = register("lime_brick_slab") { BlockItem(HybridBlocksBlocks.LIME_BRICK_SLAB.get(), Item.Properties()) }
    val LIME_BRICK_WALL = register("lime_brick_wall") { BlockItem(HybridBlocksBlocks.LIME_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_LIME_BRICKS = register("large_lime_bricks") { BlockItem(HybridBlocksBlocks.LARGE_LIME_BRICKS.get(), Item.Properties()) }
    val LARGE_LIME_BRICK_STAIRS = register("large_lime_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_LIME_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_LIME_BRICK_SLAB = register("large_lime_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_LIME_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_LIME_BRICK_WALL = register("large_lime_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_LIME_BRICK_WALL.get(), Item.Properties()) }

    //  mixed lime bricks
    val SMALL_MIXED_LIME_BRICKS = register("small_mixed_lime_bricks") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_LIME_BRICKS.get(), Item.Properties()) }
    val SMALL_MIXED_LIME_BRICK_STAIRS = register("small_mixed_lime_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_LIME_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_MIXED_LIME_BRICK_SLAB = register("small_mixed_lime_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_LIME_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_MIXED_LIME_BRICK_WALL = register("small_mixed_lime_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_LIME_BRICK_WALL.get(), Item.Properties()) }

    val MIXED_LIME_BRICKS = register("mixed_lime_bricks") { BlockItem(HybridBlocksBlocks.MIXED_LIME_BRICKS.get(), Item.Properties()) }
    val MIXED_LIME_BRICK_STAIRS = register("mixed_lime_brick_stairs") { BlockItem(HybridBlocksBlocks.MIXED_LIME_BRICK_STAIRS.get(), Item.Properties()) }
    val MIXED_LIME_BRICK_SLAB = register("mixed_lime_brick_slab") { BlockItem(HybridBlocksBlocks.MIXED_LIME_BRICK_SLAB.get(), Item.Properties()) }
    val MIXED_LIME_BRICK_WALL = register("mixed_lime_brick_wall") { BlockItem(HybridBlocksBlocks.MIXED_LIME_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_MIXED_LIME_BRICKS = register("large_mixed_lime_bricks") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_LIME_BRICKS.get(), Item.Properties()) }
    val LARGE_MIXED_LIME_BRICK_STAIRS = register("large_mixed_lime_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_LIME_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_MIXED_LIME_BRICK_SLAB = register("large_mixed_lime_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_LIME_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_MIXED_LIME_BRICK_WALL = register("large_mixed_lime_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_LIME_BRICK_WALL.get(), Item.Properties()) }

    val CRACKED_LIME_BRICKS = register("cracked_lime_bricks") { BlockItem(HybridBlocksBlocks.CRACKED_LIME_BRICKS.get(), Item.Properties()) }
    val BASKETWEAVE_LIME_BRICKS = register("basketweave_lime_bricks") { BlockItem(HybridBlocksBlocks.BASKETWEAVE_LIME_BRICKS.get(), Item.Properties()) }
    val PINWHEEL_LIME_BRICKS = register("pinwheel_lime_bricks") { BlockItem(HybridBlocksBlocks.PINWHEEL_LIME_BRICKS.get(), Item.Properties()) }
    val JACK_ON_JACK_LIME_BRICKS = register("jack_on_jack_lime_bricks") { BlockItem(HybridBlocksBlocks.JACK_ON_JACK_LIME_BRICKS.get(), Item.Properties()) }

    //  lime shingles
    val LIME_SHINGLES = register("lime_shingles") { BlockItem(HybridBlocksBlocks.LIME_SHINGLES.get(), Item.Properties()) }
    val LIME_SHINGLE_STAIRS = register("lime_shingle_stairs") { BlockItem(HybridBlocksBlocks.LIME_SHINGLE_STAIRS.get(), Item.Properties()) }
    val LIME_SHINGLE_SLAB = register("lime_shingle_slab") { BlockItem(HybridBlocksBlocks.LIME_SHINGLE_SLAB.get(), Item.Properties()) }
    val LIME_SHINGLE_WALL = register("lime_shingle_wall") { BlockItem(HybridBlocksBlocks.LIME_SHINGLE_WALL.get(), Item.Properties()) }

    val MIXED_LIME_SHINGLES = register("mixed_lime_shingles") { BlockItem(HybridBlocksBlocks.MIXED_LIME_SHINGLES.get(), Item.Properties()) }
    val MIXED_LIME_SHINGLE_STAIRS = register("mixed_lime_shingle_stairs") { BlockItem(HybridBlocksBlocks.MIXED_LIME_SHINGLE_STAIRS.get(), Item.Properties()) }
    val MIXED_LIME_SHINGLE_SLAB = register("mixed_lime_shingle_slab") { BlockItem(HybridBlocksBlocks.MIXED_LIME_SHINGLE_SLAB.get(), Item.Properties()) }
    val MIXED_LIME_SHINGLE_WALL = register("mixed_lime_shingle_wall") { BlockItem(HybridBlocksBlocks.MIXED_LIME_SHINGLE_WALL.get(), Item.Properties()) }

    val LIME_BRICK_CHIMNEY = register("lime_brick_chimney") { BlockItem(HybridBlocksBlocks.LIME_BRICK_CHIMNEY.get(), Item.Properties()) }
    //#endregion

    //#region Green Bricks
    //  normal green bricks
    val SMALL_GREEN_BRICKS = register("small_green_bricks") { BlockItem(HybridBlocksBlocks.SMALL_GREEN_BRICKS.get(), Item.Properties()) }
    val SMALL_GREEN_BRICK_STAIRS = register("small_green_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_GREEN_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_GREEN_BRICK_SLAB = register("small_green_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_GREEN_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_GREEN_BRICK_WALL = register("small_green_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_GREEN_BRICK_WALL.get(), Item.Properties()) }

    val GREEN_BRICKS = register("green_bricks") { BlockItem(HybridBlocksBlocks.GREEN_BRICKS.get(), Item.Properties()) }
    val GREEN_BRICK_STAIRS = register("green_brick_stairs") { BlockItem(HybridBlocksBlocks.GREEN_BRICK_STAIRS.get(), Item.Properties()) }
    val GREEN_BRICK_SLAB = register("green_brick_slab") { BlockItem(HybridBlocksBlocks.GREEN_BRICK_SLAB.get(), Item.Properties()) }
    val GREEN_BRICK_WALL = register("green_brick_wall") { BlockItem(HybridBlocksBlocks.GREEN_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_GREEN_BRICKS = register("large_green_bricks") { BlockItem(HybridBlocksBlocks.LARGE_GREEN_BRICKS.get(), Item.Properties()) }
    val LARGE_GREEN_BRICK_STAIRS = register("large_green_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_GREEN_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_GREEN_BRICK_SLAB = register("large_green_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_GREEN_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_GREEN_BRICK_WALL = register("large_green_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_GREEN_BRICK_WALL.get(), Item.Properties()) }

    //  mixed green bricks
    val SMALL_MIXED_GREEN_BRICKS = register("small_mixed_green_bricks") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_GREEN_BRICKS.get(), Item.Properties()) }
    val SMALL_MIXED_GREEN_BRICK_STAIRS = register("small_mixed_green_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_GREEN_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_MIXED_GREEN_BRICK_SLAB = register("small_mixed_green_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_GREEN_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_MIXED_GREEN_BRICK_WALL = register("small_mixed_green_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_GREEN_BRICK_WALL.get(), Item.Properties()) }

    val MIXED_GREEN_BRICKS = register("mixed_green_bricks") { BlockItem(HybridBlocksBlocks.MIXED_GREEN_BRICKS.get(), Item.Properties()) }
    val MIXED_GREEN_BRICK_STAIRS = register("mixed_green_brick_stairs") { BlockItem(HybridBlocksBlocks.MIXED_GREEN_BRICK_STAIRS.get(), Item.Properties()) }
    val MIXED_GREEN_BRICK_SLAB = register("mixed_green_brick_slab") { BlockItem(HybridBlocksBlocks.MIXED_GREEN_BRICK_SLAB.get(), Item.Properties()) }
    val MIXED_GREEN_BRICK_WALL = register("mixed_green_brick_wall") { BlockItem(HybridBlocksBlocks.MIXED_GREEN_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_MIXED_GREEN_BRICKS = register("large_mixed_green_bricks") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_GREEN_BRICKS.get(), Item.Properties()) }
    val LARGE_MIXED_GREEN_BRICK_STAIRS = register("large_mixed_green_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_GREEN_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_MIXED_GREEN_BRICK_SLAB = register("large_mixed_green_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_GREEN_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_MIXED_GREEN_BRICK_WALL = register("large_mixed_green_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_GREEN_BRICK_WALL.get(), Item.Properties()) }

    val CRACKED_GREEN_BRICKS = register("cracked_green_bricks") { BlockItem(HybridBlocksBlocks.CRACKED_GREEN_BRICKS.get(), Item.Properties()) }
    val BASKETWEAVE_GREEN_BRICKS = register("basketweave_green_bricks") { BlockItem(HybridBlocksBlocks.BASKETWEAVE_GREEN_BRICKS.get(), Item.Properties()) }
    val PINWHEEL_GREEN_BRICKS = register("pinwheel_green_bricks") { BlockItem(HybridBlocksBlocks.PINWHEEL_GREEN_BRICKS.get(), Item.Properties()) }
    val JACK_ON_JACK_GREEN_BRICKS = register("jack_on_jack_green_bricks") { BlockItem(HybridBlocksBlocks.JACK_ON_JACK_GREEN_BRICKS.get(), Item.Properties()) }

    //  green shingles
    val GREEN_SHINGLES = register("green_shingles") { BlockItem(HybridBlocksBlocks.GREEN_SHINGLES.get(), Item.Properties()) }
    val GREEN_SHINGLE_STAIRS = register("green_shingle_stairs") { BlockItem(HybridBlocksBlocks.GREEN_SHINGLE_STAIRS.get(), Item.Properties()) }
    val GREEN_SHINGLE_SLAB = register("green_shingle_slab") { BlockItem(HybridBlocksBlocks.GREEN_SHINGLE_SLAB.get(), Item.Properties()) }
    val GREEN_SHINGLE_WALL = register("green_shingle_wall") { BlockItem(HybridBlocksBlocks.GREEN_SHINGLE_WALL.get(), Item.Properties()) }

    val MIXED_GREEN_SHINGLES = register("mixed_green_shingles") { BlockItem(HybridBlocksBlocks.MIXED_GREEN_SHINGLES.get(), Item.Properties()) }
    val MIXED_GREEN_SHINGLE_STAIRS = register("mixed_green_shingle_stairs") { BlockItem(HybridBlocksBlocks.MIXED_GREEN_SHINGLE_STAIRS.get(), Item.Properties()) }
    val MIXED_GREEN_SHINGLE_SLAB = register("mixed_green_shingle_slab") { BlockItem(HybridBlocksBlocks.MIXED_GREEN_SHINGLE_SLAB.get(), Item.Properties()) }
    val MIXED_GREEN_SHINGLE_WALL = register("mixed_green_shingle_wall") { BlockItem(HybridBlocksBlocks.MIXED_GREEN_SHINGLE_WALL.get(), Item.Properties()) }

    val GREEN_BRICK_CHIMNEY = register("green_brick_chimney") { BlockItem(HybridBlocksBlocks.GREEN_BRICK_CHIMNEY.get(), Item.Properties()) }
    //#endregion

    //#region Cyan Bricks
    //  normal cyan bricks
    val SMALL_CYAN_BRICKS = register("small_cyan_bricks") { BlockItem(HybridBlocksBlocks.SMALL_CYAN_BRICKS.get(), Item.Properties()) }
    val SMALL_CYAN_BRICK_STAIRS = register("small_cyan_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_CYAN_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_CYAN_BRICK_SLAB = register("small_cyan_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_CYAN_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_CYAN_BRICK_WALL = register("small_cyan_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_CYAN_BRICK_WALL.get(), Item.Properties()) }

    val CYAN_BRICKS = register("cyan_bricks") { BlockItem(HybridBlocksBlocks.CYAN_BRICKS.get(), Item.Properties()) }
    val CYAN_BRICK_STAIRS = register("cyan_brick_stairs") { BlockItem(HybridBlocksBlocks.CYAN_BRICK_STAIRS.get(), Item.Properties()) }
    val CYAN_BRICK_SLAB = register("cyan_brick_slab") { BlockItem(HybridBlocksBlocks.CYAN_BRICK_SLAB.get(), Item.Properties()) }
    val CYAN_BRICK_WALL = register("cyan_brick_wall") { BlockItem(HybridBlocksBlocks.CYAN_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_CYAN_BRICKS = register("large_cyan_bricks") { BlockItem(HybridBlocksBlocks.LARGE_CYAN_BRICKS.get(), Item.Properties()) }
    val LARGE_CYAN_BRICK_STAIRS = register("large_cyan_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_CYAN_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_CYAN_BRICK_SLAB = register("large_cyan_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_CYAN_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_CYAN_BRICK_WALL = register("large_cyan_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_CYAN_BRICK_WALL.get(), Item.Properties()) }

    //  mixed cyan bricks
    val SMALL_MIXED_CYAN_BRICKS = register("small_mixed_cyan_bricks") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_CYAN_BRICKS.get(), Item.Properties()) }
    val SMALL_MIXED_CYAN_BRICK_STAIRS = register("small_mixed_cyan_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_CYAN_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_MIXED_CYAN_BRICK_SLAB = register("small_mixed_cyan_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_CYAN_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_MIXED_CYAN_BRICK_WALL = register("small_mixed_cyan_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_CYAN_BRICK_WALL.get(), Item.Properties()) }

    val MIXED_CYAN_BRICKS = register("mixed_cyan_bricks") { BlockItem(HybridBlocksBlocks.MIXED_CYAN_BRICKS.get(), Item.Properties()) }
    val MIXED_CYAN_BRICK_STAIRS = register("mixed_cyan_brick_stairs") { BlockItem(HybridBlocksBlocks.MIXED_CYAN_BRICK_STAIRS.get(), Item.Properties()) }
    val MIXED_CYAN_BRICK_SLAB = register("mixed_cyan_brick_slab") { BlockItem(HybridBlocksBlocks.MIXED_CYAN_BRICK_SLAB.get(), Item.Properties()) }
    val MIXED_CYAN_BRICK_WALL = register("mixed_cyan_brick_wall") { BlockItem(HybridBlocksBlocks.MIXED_CYAN_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_MIXED_CYAN_BRICKS = register("large_mixed_cyan_bricks") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_CYAN_BRICKS.get(), Item.Properties()) }
    val LARGE_MIXED_CYAN_BRICK_STAIRS = register("large_mixed_cyan_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_CYAN_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_MIXED_CYAN_BRICK_SLAB = register("large_mixed_cyan_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_CYAN_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_MIXED_CYAN_BRICK_WALL = register("large_mixed_cyan_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_CYAN_BRICK_WALL.get(), Item.Properties()) }

    val CRACKED_CYAN_BRICKS = register("cracked_cyan_bricks") { BlockItem(HybridBlocksBlocks.CRACKED_CYAN_BRICKS.get(), Item.Properties()) }
    val BASKETWEAVE_CYAN_BRICKS = register("basketweave_cyan_bricks") { BlockItem(HybridBlocksBlocks.BASKETWEAVE_CYAN_BRICKS.get(), Item.Properties()) }
    val PINWHEEL_CYAN_BRICKS = register("pinwheel_cyan_bricks") { BlockItem(HybridBlocksBlocks.PINWHEEL_CYAN_BRICKS.get(), Item.Properties()) }
    val JACK_ON_JACK_CYAN_BRICKS = register("jack_on_jack_cyan_bricks") { BlockItem(HybridBlocksBlocks.JACK_ON_JACK_CYAN_BRICKS.get(), Item.Properties()) }

    //  cyan shingles
    val CYAN_SHINGLES = register("cyan_shingles") { BlockItem(HybridBlocksBlocks.CYAN_SHINGLES.get(), Item.Properties()) }
    val CYAN_SHINGLE_STAIRS = register("cyan_shingle_stairs") { BlockItem(HybridBlocksBlocks.CYAN_SHINGLE_STAIRS.get(), Item.Properties()) }
    val CYAN_SHINGLE_SLAB = register("cyan_shingle_slab") { BlockItem(HybridBlocksBlocks.CYAN_SHINGLE_SLAB.get(), Item.Properties()) }
    val CYAN_SHINGLE_WALL = register("cyan_shingle_wall") { BlockItem(HybridBlocksBlocks.CYAN_SHINGLE_WALL.get(), Item.Properties()) }

    val MIXED_CYAN_SHINGLES = register("mixed_cyan_shingles") { BlockItem(HybridBlocksBlocks.MIXED_CYAN_SHINGLES.get(), Item.Properties()) }
    val MIXED_CYAN_SHINGLE_STAIRS = register("mixed_cyan_shingle_stairs") { BlockItem(HybridBlocksBlocks.MIXED_CYAN_SHINGLE_STAIRS.get(), Item.Properties()) }
    val MIXED_CYAN_SHINGLE_SLAB = register("mixed_cyan_shingle_slab") { BlockItem(HybridBlocksBlocks.MIXED_CYAN_SHINGLE_SLAB.get(), Item.Properties()) }
    val MIXED_CYAN_SHINGLE_WALL = register("mixed_cyan_shingle_wall") { BlockItem(HybridBlocksBlocks.MIXED_CYAN_SHINGLE_WALL.get(), Item.Properties()) }

    val CYAN_BRICK_CHIMNEY = register("cyan_brick_chimney") { BlockItem(HybridBlocksBlocks.CYAN_BRICK_CHIMNEY.get(), Item.Properties()) }
    //#endregion

    //#region Light_Blue Bricks
    //  normal light_blue bricks
    val SMALL_LIGHT_BLUE_BRICKS = register("small_light_blue_bricks") { BlockItem(HybridBlocksBlocks.SMALL_LIGHT_BLUE_BRICKS.get(), Item.Properties()) }
    val SMALL_LIGHT_BLUE_BRICK_STAIRS = register("small_light_blue_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_LIGHT_BLUE_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_LIGHT_BLUE_BRICK_SLAB = register("small_light_blue_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_LIGHT_BLUE_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_LIGHT_BLUE_BRICK_WALL = register("small_light_blue_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_LIGHT_BLUE_BRICK_WALL.get(), Item.Properties()) }

    val LIGHT_BLUE_BRICKS = register("light_blue_bricks") { BlockItem(HybridBlocksBlocks.LIGHT_BLUE_BRICKS.get(), Item.Properties()) }
    val LIGHT_BLUE_BRICK_STAIRS = register("light_blue_brick_stairs") { BlockItem(HybridBlocksBlocks.LIGHT_BLUE_BRICK_STAIRS.get(), Item.Properties()) }
    val LIGHT_BLUE_BRICK_SLAB = register("light_blue_brick_slab") { BlockItem(HybridBlocksBlocks.LIGHT_BLUE_BRICK_SLAB.get(), Item.Properties()) }
    val LIGHT_BLUE_BRICK_WALL = register("light_blue_brick_wall") { BlockItem(HybridBlocksBlocks.LIGHT_BLUE_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_LIGHT_BLUE_BRICKS = register("large_light_blue_bricks") { BlockItem(HybridBlocksBlocks.LARGE_LIGHT_BLUE_BRICKS.get(), Item.Properties()) }
    val LARGE_LIGHT_BLUE_BRICK_STAIRS = register("large_light_blue_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_LIGHT_BLUE_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_LIGHT_BLUE_BRICK_SLAB = register("large_light_blue_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_LIGHT_BLUE_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_LIGHT_BLUE_BRICK_WALL = register("large_light_blue_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_LIGHT_BLUE_BRICK_WALL.get(), Item.Properties()) }

    //  mixed light_blue bricks
    val SMALL_MIXED_LIGHT_BLUE_BRICKS = register("small_mixed_light_blue_bricks") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_LIGHT_BLUE_BRICKS.get(), Item.Properties()) }
    val SMALL_MIXED_LIGHT_BLUE_BRICK_STAIRS = register("small_mixed_light_blue_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_LIGHT_BLUE_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_MIXED_LIGHT_BLUE_BRICK_SLAB = register("small_mixed_light_blue_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_LIGHT_BLUE_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_MIXED_LIGHT_BLUE_BRICK_WALL = register("small_mixed_light_blue_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_LIGHT_BLUE_BRICK_WALL.get(), Item.Properties()) }

    val MIXED_LIGHT_BLUE_BRICKS = register("mixed_light_blue_bricks") { BlockItem(HybridBlocksBlocks.MIXED_LIGHT_BLUE_BRICKS.get(), Item.Properties()) }
    val MIXED_LIGHT_BLUE_BRICK_STAIRS = register("mixed_light_blue_brick_stairs") { BlockItem(HybridBlocksBlocks.MIXED_LIGHT_BLUE_BRICK_STAIRS.get(), Item.Properties()) }
    val MIXED_LIGHT_BLUE_BRICK_SLAB = register("mixed_light_blue_brick_slab") { BlockItem(HybridBlocksBlocks.MIXED_LIGHT_BLUE_BRICK_SLAB.get(), Item.Properties()) }
    val MIXED_LIGHT_BLUE_BRICK_WALL = register("mixed_light_blue_brick_wall") { BlockItem(HybridBlocksBlocks.MIXED_LIGHT_BLUE_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_MIXED_LIGHT_BLUE_BRICKS = register("large_mixed_light_blue_bricks") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_LIGHT_BLUE_BRICKS.get(), Item.Properties()) }
    val LARGE_MIXED_LIGHT_BLUE_BRICK_STAIRS = register("large_mixed_light_blue_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_LIGHT_BLUE_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_MIXED_LIGHT_BLUE_BRICK_SLAB = register("large_mixed_light_blue_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_LIGHT_BLUE_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_MIXED_LIGHT_BLUE_BRICK_WALL = register("large_mixed_light_blue_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_LIGHT_BLUE_BRICK_WALL.get(), Item.Properties()) }

    val CRACKED_LIGHT_BLUE_BRICKS = register("cracked_light_blue_bricks") { BlockItem(HybridBlocksBlocks.CRACKED_LIGHT_BLUE_BRICKS.get(), Item.Properties()) }
    val BASKETWEAVE_LIGHT_BLUE_BRICKS = register("basketweave_light_blue_bricks") { BlockItem(HybridBlocksBlocks.BASKETWEAVE_LIGHT_BLUE_BRICKS.get(), Item.Properties()) }
    val PINWHEEL_LIGHT_BLUE_BRICKS = register("pinwheel_light_blue_bricks") { BlockItem(HybridBlocksBlocks.PINWHEEL_LIGHT_BLUE_BRICKS.get(), Item.Properties()) }
    val JACK_ON_JACK_LIGHT_BLUE_BRICKS = register("jack_on_jack_light_blue_bricks") { BlockItem(HybridBlocksBlocks.JACK_ON_JACK_LIGHT_BLUE_BRICKS.get(), Item.Properties()) }

    //  light_blue shingles
    val LIGHT_BLUE_SHINGLES = register("light_blue_shingles") { BlockItem(HybridBlocksBlocks.LIGHT_BLUE_SHINGLES.get(), Item.Properties()) }
    val LIGHT_BLUE_SHINGLE_STAIRS = register("light_blue_shingle_stairs") { BlockItem(HybridBlocksBlocks.LIGHT_BLUE_SHINGLE_STAIRS.get(), Item.Properties()) }
    val LIGHT_BLUE_SHINGLE_SLAB = register("light_blue_shingle_slab") { BlockItem(HybridBlocksBlocks.LIGHT_BLUE_SHINGLE_SLAB.get(), Item.Properties()) }
    val LIGHT_BLUE_SHINGLE_WALL = register("light_blue_shingle_wall") { BlockItem(HybridBlocksBlocks.LIGHT_BLUE_SHINGLE_WALL.get(), Item.Properties()) }

    val MIXED_LIGHT_BLUE_SHINGLES = register("mixed_light_blue_shingles") { BlockItem(HybridBlocksBlocks.MIXED_LIGHT_BLUE_SHINGLES.get(), Item.Properties()) }
    val MIXED_LIGHT_BLUE_SHINGLE_STAIRS = register("mixed_light_blue_shingle_stairs") { BlockItem(HybridBlocksBlocks.MIXED_LIGHT_BLUE_SHINGLE_STAIRS.get(), Item.Properties()) }
    val MIXED_LIGHT_BLUE_SHINGLE_SLAB = register("mixed_light_blue_shingle_slab") { BlockItem(HybridBlocksBlocks.MIXED_LIGHT_BLUE_SHINGLE_SLAB.get(), Item.Properties()) }
    val MIXED_LIGHT_BLUE_SHINGLE_WALL = register("mixed_light_blue_shingle_wall") { BlockItem(HybridBlocksBlocks.MIXED_LIGHT_BLUE_SHINGLE_WALL.get(), Item.Properties()) }

    val LIGHT_BLUE_BRICK_CHIMNEY = register("light_blue_brick_chimney") { BlockItem(HybridBlocksBlocks.LIGHT_BLUE_BRICK_CHIMNEY.get(), Item.Properties()) }
    //#endregion

    //#region Blue Bricks
    //  normal blue bricks
    val SMALL_BLUE_BRICKS = register("small_blue_bricks") { BlockItem(HybridBlocksBlocks.SMALL_BLUE_BRICKS.get(), Item.Properties()) }
    val SMALL_BLUE_BRICK_STAIRS = register("small_blue_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_BLUE_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_BLUE_BRICK_SLAB = register("small_blue_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_BLUE_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_BLUE_BRICK_WALL = register("small_blue_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_BLUE_BRICK_WALL.get(), Item.Properties()) }

    val BLUE_BRICKS = register("blue_bricks") { BlockItem(HybridBlocksBlocks.BLUE_BRICKS.get(), Item.Properties()) }
    val BLUE_BRICK_STAIRS = register("blue_brick_stairs") { BlockItem(HybridBlocksBlocks.BLUE_BRICK_STAIRS.get(), Item.Properties()) }
    val BLUE_BRICK_SLAB = register("blue_brick_slab") { BlockItem(HybridBlocksBlocks.BLUE_BRICK_SLAB.get(), Item.Properties()) }
    val BLUE_BRICK_WALL = register("blue_brick_wall") { BlockItem(HybridBlocksBlocks.BLUE_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_BLUE_BRICKS = register("large_blue_bricks") { BlockItem(HybridBlocksBlocks.LARGE_BLUE_BRICKS.get(), Item.Properties()) }
    val LARGE_BLUE_BRICK_STAIRS = register("large_blue_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_BLUE_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_BLUE_BRICK_SLAB = register("large_blue_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_BLUE_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_BLUE_BRICK_WALL = register("large_blue_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_BLUE_BRICK_WALL.get(), Item.Properties()) }

    //  mixed blue bricks
    val SMALL_MIXED_BLUE_BRICKS = register("small_mixed_blue_bricks") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_BLUE_BRICKS.get(), Item.Properties()) }
    val SMALL_MIXED_BLUE_BRICK_STAIRS = register("small_mixed_blue_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_BLUE_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_MIXED_BLUE_BRICK_SLAB = register("small_mixed_blue_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_BLUE_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_MIXED_BLUE_BRICK_WALL = register("small_mixed_blue_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_BLUE_BRICK_WALL.get(), Item.Properties()) }

    val MIXED_BLUE_BRICKS = register("mixed_blue_bricks") { BlockItem(HybridBlocksBlocks.MIXED_BLUE_BRICKS.get(), Item.Properties()) }
    val MIXED_BLUE_BRICK_STAIRS = register("mixed_blue_brick_stairs") { BlockItem(HybridBlocksBlocks.MIXED_BLUE_BRICK_STAIRS.get(), Item.Properties()) }
    val MIXED_BLUE_BRICK_SLAB = register("mixed_blue_brick_slab") { BlockItem(HybridBlocksBlocks.MIXED_BLUE_BRICK_SLAB.get(), Item.Properties()) }
    val MIXED_BLUE_BRICK_WALL = register("mixed_blue_brick_wall") { BlockItem(HybridBlocksBlocks.MIXED_BLUE_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_MIXED_BLUE_BRICKS = register("large_mixed_blue_bricks") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_BLUE_BRICKS.get(), Item.Properties()) }
    val LARGE_MIXED_BLUE_BRICK_STAIRS = register("large_mixed_blue_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_BLUE_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_MIXED_BLUE_BRICK_SLAB = register("large_mixed_blue_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_BLUE_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_MIXED_BLUE_BRICK_WALL = register("large_mixed_blue_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_BLUE_BRICK_WALL.get(), Item.Properties()) }

    val CRACKED_BLUE_BRICKS = register("cracked_blue_bricks") { BlockItem(HybridBlocksBlocks.CRACKED_BLUE_BRICKS.get(), Item.Properties()) }
    val BASKETWEAVE_BLUE_BRICKS = register("basketweave_blue_bricks") { BlockItem(HybridBlocksBlocks.BASKETWEAVE_BLUE_BRICKS.get(), Item.Properties()) }
    val PINWHEEL_BLUE_BRICKS = register("pinwheel_blue_bricks") { BlockItem(HybridBlocksBlocks.PINWHEEL_BLUE_BRICKS.get(), Item.Properties()) }
    val JACK_ON_JACK_BLUE_BRICKS = register("jack_on_jack_blue_bricks") { BlockItem(HybridBlocksBlocks.JACK_ON_JACK_BLUE_BRICKS.get(), Item.Properties()) }

    //  blue shingles
    val BLUE_SHINGLES = register("blue_shingles") { BlockItem(HybridBlocksBlocks.BLUE_SHINGLES.get(), Item.Properties()) }
    val BLUE_SHINGLE_STAIRS = register("blue_shingle_stairs") { BlockItem(HybridBlocksBlocks.BLUE_SHINGLE_STAIRS.get(), Item.Properties()) }
    val BLUE_SHINGLE_SLAB = register("blue_shingle_slab") { BlockItem(HybridBlocksBlocks.BLUE_SHINGLE_SLAB.get(), Item.Properties()) }
    val BLUE_SHINGLE_WALL = register("blue_shingle_wall") { BlockItem(HybridBlocksBlocks.BLUE_SHINGLE_WALL.get(), Item.Properties()) }

    val MIXED_BLUE_SHINGLES = register("mixed_blue_shingles") { BlockItem(HybridBlocksBlocks.MIXED_BLUE_SHINGLES.get(), Item.Properties()) }
    val MIXED_BLUE_SHINGLE_STAIRS = register("mixed_blue_shingle_stairs") { BlockItem(HybridBlocksBlocks.MIXED_BLUE_SHINGLE_STAIRS.get(), Item.Properties()) }
    val MIXED_BLUE_SHINGLE_SLAB = register("mixed_blue_shingle_slab") { BlockItem(HybridBlocksBlocks.MIXED_BLUE_SHINGLE_SLAB.get(), Item.Properties()) }
    val MIXED_BLUE_SHINGLE_WALL = register("mixed_blue_shingle_wall") { BlockItem(HybridBlocksBlocks.MIXED_BLUE_SHINGLE_WALL.get(), Item.Properties()) }

    val BLUE_BRICK_CHIMNEY = register("blue_brick_chimney") { BlockItem(HybridBlocksBlocks.BLUE_BRICK_CHIMNEY.get(), Item.Properties()) }
    //#endregion

    //#region Purple Bricks
    //  normal purple bricks
    val SMALL_PURPLE_BRICKS = register("small_purple_bricks") { BlockItem(HybridBlocksBlocks.SMALL_PURPLE_BRICKS.get(), Item.Properties()) }
    val SMALL_PURPLE_BRICK_STAIRS = register("small_purple_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_PURPLE_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_PURPLE_BRICK_SLAB = register("small_purple_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_PURPLE_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_PURPLE_BRICK_WALL = register("small_purple_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_PURPLE_BRICK_WALL.get(), Item.Properties()) }

    val PURPLE_BRICKS = register("purple_bricks") { BlockItem(HybridBlocksBlocks.PURPLE_BRICKS.get(), Item.Properties()) }
    val PURPLE_BRICK_STAIRS = register("purple_brick_stairs") { BlockItem(HybridBlocksBlocks.PURPLE_BRICK_STAIRS.get(), Item.Properties()) }
    val PURPLE_BRICK_SLAB = register("purple_brick_slab") { BlockItem(HybridBlocksBlocks.PURPLE_BRICK_SLAB.get(), Item.Properties()) }
    val PURPLE_BRICK_WALL = register("purple_brick_wall") { BlockItem(HybridBlocksBlocks.PURPLE_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_PURPLE_BRICKS = register("large_purple_bricks") { BlockItem(HybridBlocksBlocks.LARGE_PURPLE_BRICKS.get(), Item.Properties()) }
    val LARGE_PURPLE_BRICK_STAIRS = register("large_purple_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_PURPLE_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_PURPLE_BRICK_SLAB = register("large_purple_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_PURPLE_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_PURPLE_BRICK_WALL = register("large_purple_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_PURPLE_BRICK_WALL.get(), Item.Properties()) }

    //  mixed purple bricks
    val SMALL_MIXED_PURPLE_BRICKS = register("small_mixed_purple_bricks") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_PURPLE_BRICKS.get(), Item.Properties()) }
    val SMALL_MIXED_PURPLE_BRICK_STAIRS = register("small_mixed_purple_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_PURPLE_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_MIXED_PURPLE_BRICK_SLAB = register("small_mixed_purple_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_PURPLE_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_MIXED_PURPLE_BRICK_WALL = register("small_mixed_purple_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_PURPLE_BRICK_WALL.get(), Item.Properties()) }

    val MIXED_PURPLE_BRICKS = register("mixed_purple_bricks") { BlockItem(HybridBlocksBlocks.MIXED_PURPLE_BRICKS.get(), Item.Properties()) }
    val MIXED_PURPLE_BRICK_STAIRS = register("mixed_purple_brick_stairs") { BlockItem(HybridBlocksBlocks.MIXED_PURPLE_BRICK_STAIRS.get(), Item.Properties()) }
    val MIXED_PURPLE_BRICK_SLAB = register("mixed_purple_brick_slab") { BlockItem(HybridBlocksBlocks.MIXED_PURPLE_BRICK_SLAB.get(), Item.Properties()) }
    val MIXED_PURPLE_BRICK_WALL = register("mixed_purple_brick_wall") { BlockItem(HybridBlocksBlocks.MIXED_PURPLE_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_MIXED_PURPLE_BRICKS = register("large_mixed_purple_bricks") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_PURPLE_BRICKS.get(), Item.Properties()) }
    val LARGE_MIXED_PURPLE_BRICK_STAIRS = register("large_mixed_purple_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_PURPLE_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_MIXED_PURPLE_BRICK_SLAB = register("large_mixed_purple_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_PURPLE_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_MIXED_PURPLE_BRICK_WALL = register("large_mixed_purple_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_PURPLE_BRICK_WALL.get(), Item.Properties()) }

    val CRACKED_PURPLE_BRICKS = register("cracked_purple_bricks") { BlockItem(HybridBlocksBlocks.CRACKED_PURPLE_BRICKS.get(), Item.Properties()) }
    val BASKETWEAVE_PURPLE_BRICKS = register("basketweave_purple_bricks") { BlockItem(HybridBlocksBlocks.BASKETWEAVE_PURPLE_BRICKS.get(), Item.Properties()) }
    val PINWHEEL_PURPLE_BRICKS = register("pinwheel_purple_bricks") { BlockItem(HybridBlocksBlocks.PINWHEEL_PURPLE_BRICKS.get(), Item.Properties()) }
    val JACK_ON_JACK_PURPLE_BRICKS = register("jack_on_jack_purple_bricks") { BlockItem(HybridBlocksBlocks.JACK_ON_JACK_PURPLE_BRICKS.get(), Item.Properties()) }

    //  purple shingles
    val PURPLE_SHINGLES = register("purple_shingles") { BlockItem(HybridBlocksBlocks.PURPLE_SHINGLES.get(), Item.Properties()) }
    val PURPLE_SHINGLE_STAIRS = register("purple_shingle_stairs") { BlockItem(HybridBlocksBlocks.PURPLE_SHINGLE_STAIRS.get(), Item.Properties()) }
    val PURPLE_SHINGLE_SLAB = register("purple_shingle_slab") { BlockItem(HybridBlocksBlocks.PURPLE_SHINGLE_SLAB.get(), Item.Properties()) }
    val PURPLE_SHINGLE_WALL = register("purple_shingle_wall") { BlockItem(HybridBlocksBlocks.PURPLE_SHINGLE_WALL.get(), Item.Properties()) }

    val MIXED_PURPLE_SHINGLES = register("mixed_purple_shingles") { BlockItem(HybridBlocksBlocks.MIXED_PURPLE_SHINGLES.get(), Item.Properties()) }
    val MIXED_PURPLE_SHINGLE_STAIRS = register("mixed_purple_shingle_stairs") { BlockItem(HybridBlocksBlocks.MIXED_PURPLE_SHINGLE_STAIRS.get(), Item.Properties()) }
    val MIXED_PURPLE_SHINGLE_SLAB = register("mixed_purple_shingle_slab") { BlockItem(HybridBlocksBlocks.MIXED_PURPLE_SHINGLE_SLAB.get(), Item.Properties()) }
    val MIXED_PURPLE_SHINGLE_WALL = register("mixed_purple_shingle_wall") { BlockItem(HybridBlocksBlocks.MIXED_PURPLE_SHINGLE_WALL.get(), Item.Properties()) }

    val PURPLE_BRICK_CHIMNEY = register("purple_brick_chimney") { BlockItem(HybridBlocksBlocks.PURPLE_BRICK_CHIMNEY.get(), Item.Properties()) }
    //#endregion

    //#region Pink Bricks
    //  normal pink bricks
    val SMALL_PINK_BRICKS = register("small_pink_bricks") { BlockItem(HybridBlocksBlocks.SMALL_PINK_BRICKS.get(), Item.Properties()) }
    val SMALL_PINK_BRICK_STAIRS = register("small_pink_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_PINK_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_PINK_BRICK_SLAB = register("small_pink_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_PINK_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_PINK_BRICK_WALL = register("small_pink_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_PINK_BRICK_WALL.get(), Item.Properties()) }

    val PINK_BRICKS = register("pink_bricks") { BlockItem(HybridBlocksBlocks.PINK_BRICKS.get(), Item.Properties()) }
    val PINK_BRICK_STAIRS = register("pink_brick_stairs") { BlockItem(HybridBlocksBlocks.PINK_BRICK_STAIRS.get(), Item.Properties()) }
    val PINK_BRICK_SLAB = register("pink_brick_slab") { BlockItem(HybridBlocksBlocks.PINK_BRICK_SLAB.get(), Item.Properties()) }
    val PINK_BRICK_WALL = register("pink_brick_wall") { BlockItem(HybridBlocksBlocks.PINK_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_PINK_BRICKS = register("large_pink_bricks") { BlockItem(HybridBlocksBlocks.LARGE_PINK_BRICKS.get(), Item.Properties()) }
    val LARGE_PINK_BRICK_STAIRS = register("large_pink_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_PINK_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_PINK_BRICK_SLAB = register("large_pink_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_PINK_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_PINK_BRICK_WALL = register("large_pink_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_PINK_BRICK_WALL.get(), Item.Properties()) }

    //  mixed pink bricks
    val SMALL_MIXED_PINK_BRICKS = register("small_mixed_pink_bricks") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_PINK_BRICKS.get(), Item.Properties()) }
    val SMALL_MIXED_PINK_BRICK_STAIRS = register("small_mixed_pink_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_PINK_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_MIXED_PINK_BRICK_SLAB = register("small_mixed_pink_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_PINK_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_MIXED_PINK_BRICK_WALL = register("small_mixed_pink_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_PINK_BRICK_WALL.get(), Item.Properties()) }

    val MIXED_PINK_BRICKS = register("mixed_pink_bricks") { BlockItem(HybridBlocksBlocks.MIXED_PINK_BRICKS.get(), Item.Properties()) }
    val MIXED_PINK_BRICK_STAIRS = register("mixed_pink_brick_stairs") { BlockItem(HybridBlocksBlocks.MIXED_PINK_BRICK_STAIRS.get(), Item.Properties()) }
    val MIXED_PINK_BRICK_SLAB = register("mixed_pink_brick_slab") { BlockItem(HybridBlocksBlocks.MIXED_PINK_BRICK_SLAB.get(), Item.Properties()) }
    val MIXED_PINK_BRICK_WALL = register("mixed_pink_brick_wall") { BlockItem(HybridBlocksBlocks.MIXED_PINK_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_MIXED_PINK_BRICKS = register("large_mixed_pink_bricks") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_PINK_BRICKS.get(), Item.Properties()) }
    val LARGE_MIXED_PINK_BRICK_STAIRS = register("large_mixed_pink_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_PINK_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_MIXED_PINK_BRICK_SLAB = register("large_mixed_pink_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_PINK_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_MIXED_PINK_BRICK_WALL = register("large_mixed_pink_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_PINK_BRICK_WALL.get(), Item.Properties()) }

    val CRACKED_PINK_BRICKS = register("cracked_pink_bricks") { BlockItem(HybridBlocksBlocks.CRACKED_PINK_BRICKS.get(), Item.Properties()) }
    val BASKETWEAVE_PINK_BRICKS = register("basketweave_pink_bricks") { BlockItem(HybridBlocksBlocks.BASKETWEAVE_PINK_BRICKS.get(), Item.Properties()) }
    val PINWHEEL_PINK_BRICKS = register("pinwheel_pink_bricks") { BlockItem(HybridBlocksBlocks.PINWHEEL_PINK_BRICKS.get(), Item.Properties()) }
    val JACK_ON_JACK_PINK_BRICKS = register("jack_on_jack_pink_bricks") { BlockItem(HybridBlocksBlocks.JACK_ON_JACK_PINK_BRICKS.get(), Item.Properties()) }

    //  pink shingles
    val PINK_SHINGLES = register("pink_shingles") { BlockItem(HybridBlocksBlocks.PINK_SHINGLES.get(), Item.Properties()) }
    val PINK_SHINGLE_STAIRS = register("pink_shingle_stairs") { BlockItem(HybridBlocksBlocks.PINK_SHINGLE_STAIRS.get(), Item.Properties()) }
    val PINK_SHINGLE_SLAB = register("pink_shingle_slab") { BlockItem(HybridBlocksBlocks.PINK_SHINGLE_SLAB.get(), Item.Properties()) }
    val PINK_SHINGLE_WALL = register("pink_shingle_wall") { BlockItem(HybridBlocksBlocks.PINK_SHINGLE_WALL.get(), Item.Properties()) }

    val MIXED_PINK_SHINGLES = register("mixed_pink_shingles") { BlockItem(HybridBlocksBlocks.MIXED_PINK_SHINGLES.get(), Item.Properties()) }
    val MIXED_PINK_SHINGLE_STAIRS = register("mixed_pink_shingle_stairs") { BlockItem(HybridBlocksBlocks.MIXED_PINK_SHINGLE_STAIRS.get(), Item.Properties()) }
    val MIXED_PINK_SHINGLE_SLAB = register("mixed_pink_shingle_slab") { BlockItem(HybridBlocksBlocks.MIXED_PINK_SHINGLE_SLAB.get(), Item.Properties()) }
    val MIXED_PINK_SHINGLE_WALL = register("mixed_pink_shingle_wall") { BlockItem(HybridBlocksBlocks.MIXED_PINK_SHINGLE_WALL.get(), Item.Properties()) }

    val PINK_BRICK_CHIMNEY = register("pink_brick_chimney") { BlockItem(HybridBlocksBlocks.PINK_BRICK_CHIMNEY.get(), Item.Properties()) }
    //#endregion

    //#region Magenta Bricks
    //  normal magenta bricks
    val SMALL_MAGENTA_BRICKS = register("small_magenta_bricks") { BlockItem(HybridBlocksBlocks.SMALL_MAGENTA_BRICKS.get(), Item.Properties()) }
    val SMALL_MAGENTA_BRICK_STAIRS = register("small_magenta_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_MAGENTA_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_MAGENTA_BRICK_SLAB = register("small_magenta_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_MAGENTA_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_MAGENTA_BRICK_WALL = register("small_magenta_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_MAGENTA_BRICK_WALL.get(), Item.Properties()) }

    val MAGENTA_BRICKS = register("magenta_bricks") { BlockItem(HybridBlocksBlocks.MAGENTA_BRICKS.get(), Item.Properties()) }
    val MAGENTA_BRICK_STAIRS = register("magenta_brick_stairs") { BlockItem(HybridBlocksBlocks.MAGENTA_BRICK_STAIRS.get(), Item.Properties()) }
    val MAGENTA_BRICK_SLAB = register("magenta_brick_slab") { BlockItem(HybridBlocksBlocks.MAGENTA_BRICK_SLAB.get(), Item.Properties()) }
    val MAGENTA_BRICK_WALL = register("magenta_brick_wall") { BlockItem(HybridBlocksBlocks.MAGENTA_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_MAGENTA_BRICKS = register("large_magenta_bricks") { BlockItem(HybridBlocksBlocks.LARGE_MAGENTA_BRICKS.get(), Item.Properties()) }
    val LARGE_MAGENTA_BRICK_STAIRS = register("large_magenta_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_MAGENTA_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_MAGENTA_BRICK_SLAB = register("large_magenta_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_MAGENTA_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_MAGENTA_BRICK_WALL = register("large_magenta_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_MAGENTA_BRICK_WALL.get(), Item.Properties()) }

    //  mixed magenta bricks
    val SMALL_MIXED_MAGENTA_BRICKS = register("small_mixed_magenta_bricks") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_MAGENTA_BRICKS.get(), Item.Properties()) }
    val SMALL_MIXED_MAGENTA_BRICK_STAIRS = register("small_mixed_magenta_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_MAGENTA_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_MIXED_MAGENTA_BRICK_SLAB = register("small_mixed_magenta_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_MAGENTA_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_MIXED_MAGENTA_BRICK_WALL = register("small_mixed_magenta_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_MAGENTA_BRICK_WALL.get(), Item.Properties()) }

    val MIXED_MAGENTA_BRICKS = register("mixed_magenta_bricks") { BlockItem(HybridBlocksBlocks.MIXED_MAGENTA_BRICKS.get(), Item.Properties()) }
    val MIXED_MAGENTA_BRICK_STAIRS = register("mixed_magenta_brick_stairs") { BlockItem(HybridBlocksBlocks.MIXED_MAGENTA_BRICK_STAIRS.get(), Item.Properties()) }
    val MIXED_MAGENTA_BRICK_SLAB = register("mixed_magenta_brick_slab") { BlockItem(HybridBlocksBlocks.MIXED_MAGENTA_BRICK_SLAB.get(), Item.Properties()) }
    val MIXED_MAGENTA_BRICK_WALL = register("mixed_magenta_brick_wall") { BlockItem(HybridBlocksBlocks.MIXED_MAGENTA_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_MIXED_MAGENTA_BRICKS = register("large_mixed_magenta_bricks") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_MAGENTA_BRICKS.get(), Item.Properties()) }
    val LARGE_MIXED_MAGENTA_BRICK_STAIRS = register("large_mixed_magenta_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_MAGENTA_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_MIXED_MAGENTA_BRICK_SLAB = register("large_mixed_magenta_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_MAGENTA_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_MIXED_MAGENTA_BRICK_WALL = register("large_mixed_magenta_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_MAGENTA_BRICK_WALL.get(), Item.Properties()) }

    val CRACKED_MAGENTA_BRICKS = register("cracked_magenta_bricks") { BlockItem(HybridBlocksBlocks.CRACKED_MAGENTA_BRICKS.get(), Item.Properties()) }
    val BASKETWEAVE_MAGENTA_BRICKS = register("basketweave_magenta_bricks") { BlockItem(HybridBlocksBlocks.BASKETWEAVE_MAGENTA_BRICKS.get(), Item.Properties()) }
    val PINWHEEL_MAGENTA_BRICKS = register("pinwheel_magenta_bricks") { BlockItem(HybridBlocksBlocks.PINWHEEL_MAGENTA_BRICKS.get(), Item.Properties()) }
    val JACK_ON_JACK_MAGENTA_BRICKS = register("jack_on_jack_magenta_bricks") { BlockItem(HybridBlocksBlocks.JACK_ON_JACK_MAGENTA_BRICKS.get(), Item.Properties()) }

    //  magenta shingles
    val MAGENTA_SHINGLES = register("magenta_shingles") { BlockItem(HybridBlocksBlocks.MAGENTA_SHINGLES.get(), Item.Properties()) }
    val MAGENTA_SHINGLE_STAIRS = register("magenta_shingle_stairs") { BlockItem(HybridBlocksBlocks.MAGENTA_SHINGLE_STAIRS.get(), Item.Properties()) }
    val MAGENTA_SHINGLE_SLAB = register("magenta_shingle_slab") { BlockItem(HybridBlocksBlocks.MAGENTA_SHINGLE_SLAB.get(), Item.Properties()) }
    val MAGENTA_SHINGLE_WALL = register("magenta_shingle_wall") { BlockItem(HybridBlocksBlocks.MAGENTA_SHINGLE_WALL.get(), Item.Properties()) }

    val MIXED_MAGENTA_SHINGLES = register("mixed_magenta_shingles") { BlockItem(HybridBlocksBlocks.MIXED_MAGENTA_SHINGLES.get(), Item.Properties()) }
    val MIXED_MAGENTA_SHINGLE_STAIRS = register("mixed_magenta_shingle_stairs") { BlockItem(HybridBlocksBlocks.MIXED_MAGENTA_SHINGLE_STAIRS.get(), Item.Properties()) }
    val MIXED_MAGENTA_SHINGLE_SLAB = register("mixed_magenta_shingle_slab") { BlockItem(HybridBlocksBlocks.MIXED_MAGENTA_SHINGLE_SLAB.get(), Item.Properties()) }
    val MIXED_MAGENTA_SHINGLE_WALL = register("mixed_magenta_shingle_wall") { BlockItem(HybridBlocksBlocks.MIXED_MAGENTA_SHINGLE_WALL.get(), Item.Properties()) }

    val MAGENTA_BRICK_CHIMNEY = register("magenta_brick_chimney") { BlockItem(HybridBlocksBlocks.MAGENTA_BRICK_CHIMNEY.get(), Item.Properties()) }
    //#endregion

    //#region Nether Bricks
    //  normal nether bricks
    val SMALL_NETHER_BRICKS = register("small_nether_bricks") { BlockItem(HybridBlocksBlocks.SMALL_NETHER_BRICKS.get(), Item.Properties()) }
    val SMALL_NETHER_BRICK_STAIRS = register("small_nether_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_NETHER_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_NETHER_BRICK_SLAB = register("small_nether_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_NETHER_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_NETHER_BRICK_WALL = register("small_nether_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_NETHER_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_NETHER_BRICKS = register("large_nether_bricks") { BlockItem(HybridBlocksBlocks.LARGE_NETHER_BRICKS.get(), Item.Properties()) }
    val LARGE_NETHER_BRICK_STAIRS = register("large_nether_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_NETHER_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_NETHER_BRICK_SLAB = register("large_nether_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_NETHER_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_NETHER_BRICK_WALL = register("large_nether_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_NETHER_BRICK_WALL.get(), Item.Properties()) }

    //  mixed nether bricks
    val SMALL_MIXED_NETHER_BRICKS = register("small_mixed_nether_bricks") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_NETHER_BRICKS.get(), Item.Properties()) }
    val SMALL_MIXED_NETHER_BRICK_STAIRS = register("small_mixed_nether_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_NETHER_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_MIXED_NETHER_BRICK_SLAB = register("small_mixed_nether_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_NETHER_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_MIXED_NETHER_BRICK_WALL = register("small_mixed_nether_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_NETHER_BRICK_WALL.get(), Item.Properties()) }

    val MIXED_NETHER_BRICKS = register("mixed_nether_bricks") { BlockItem(HybridBlocksBlocks.MIXED_NETHER_BRICKS.get(), Item.Properties()) }
    val MIXED_NETHER_BRICK_STAIRS = register("mixed_nether_brick_stairs") { BlockItem(HybridBlocksBlocks.MIXED_NETHER_BRICK_STAIRS.get(), Item.Properties()) }
    val MIXED_NETHER_BRICK_SLAB = register("mixed_nether_brick_slab") { BlockItem(HybridBlocksBlocks.MIXED_NETHER_BRICK_SLAB.get(), Item.Properties()) }
    val MIXED_NETHER_BRICK_WALL = register("mixed_nether_brick_wall") { BlockItem(HybridBlocksBlocks.MIXED_NETHER_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_MIXED_NETHER_BRICKS = register("large_mixed_nether_bricks") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_NETHER_BRICKS.get(), Item.Properties()) }
    val LARGE_MIXED_NETHER_BRICK_STAIRS = register("large_mixed_nether_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_NETHER_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_MIXED_NETHER_BRICK_SLAB = register("large_mixed_nether_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_NETHER_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_MIXED_NETHER_BRICK_WALL = register("large_mixed_nether_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_NETHER_BRICK_WALL.get(), Item.Properties()) }

    val BASKETWEAVE_NETHER_BRICKS = register("basketweave_nether_bricks") { BlockItem(HybridBlocksBlocks.BASKETWEAVE_NETHER_BRICKS.get(), Item.Properties()) }
    val PINWHEEL_NETHER_BRICKS = register("pinwheel_nether_bricks") { BlockItem(HybridBlocksBlocks.PINWHEEL_NETHER_BRICKS.get(), Item.Properties()) }
    val JACK_ON_JACK_NETHER_BRICKS = register("jack_on_jack_nether_bricks") { BlockItem(HybridBlocksBlocks.JACK_ON_JACK_NETHER_BRICKS.get(), Item.Properties()) }

    //  nether shingles
    val NETHER_SHINGLES = register("nether_shingles") { BlockItem(HybridBlocksBlocks.NETHER_SHINGLES.get(), Item.Properties()) }
    val NETHER_SHINGLE_STAIRS = register("nether_shingle_stairs") { BlockItem(HybridBlocksBlocks.NETHER_SHINGLE_STAIRS.get(), Item.Properties()) }
    val NETHER_SHINGLE_SLAB = register("nether_shingle_slab") { BlockItem(HybridBlocksBlocks.NETHER_SHINGLE_SLAB.get(), Item.Properties()) }
    val NETHER_SHINGLE_WALL = register("nether_shingle_wall") { BlockItem(HybridBlocksBlocks.NETHER_SHINGLE_WALL.get(), Item.Properties()) }

    val MIXED_NETHER_SHINGLES = register("mixed_nether_shingles") { BlockItem(HybridBlocksBlocks.MIXED_NETHER_SHINGLES.get(), Item.Properties()) }
    val MIXED_NETHER_SHINGLE_STAIRS = register("mixed_nether_shingle_stairs") { BlockItem(HybridBlocksBlocks.MIXED_NETHER_SHINGLE_STAIRS.get(), Item.Properties()) }
    val MIXED_NETHER_SHINGLE_SLAB = register("mixed_nether_shingle_slab") { BlockItem(HybridBlocksBlocks.MIXED_NETHER_SHINGLE_SLAB.get(), Item.Properties()) }
    val MIXED_NETHER_SHINGLE_WALL = register("mixed_nether_shingle_wall") { BlockItem(HybridBlocksBlocks.MIXED_NETHER_SHINGLE_WALL.get(), Item.Properties()) }

    val NETHER_BRICK_CHIMNEY = register("nether_brick_chimney") { BlockItem(HybridBlocksBlocks.NETHER_BRICK_CHIMNEY.get(), Item.Properties()) }
    //#endregion

    //#region Red_Nether Bricks
    //  normal red_nether bricks
    val SMALL_RED_NETHER_BRICKS = register("small_red_nether_bricks") { BlockItem(HybridBlocksBlocks.SMALL_RED_NETHER_BRICKS.get(), Item.Properties()) }
    val SMALL_RED_NETHER_BRICK_STAIRS = register("small_red_nether_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_RED_NETHER_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_RED_NETHER_BRICK_SLAB = register("small_red_nether_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_RED_NETHER_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_RED_NETHER_BRICK_WALL = register("small_red_nether_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_RED_NETHER_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_RED_NETHER_BRICKS = register("large_red_nether_bricks") { BlockItem(HybridBlocksBlocks.LARGE_RED_NETHER_BRICKS.get(), Item.Properties()) }
    val LARGE_RED_NETHER_BRICK_STAIRS = register("large_red_nether_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_RED_NETHER_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_RED_NETHER_BRICK_SLAB = register("large_red_nether_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_RED_NETHER_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_RED_NETHER_BRICK_WALL = register("large_red_nether_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_RED_NETHER_BRICK_WALL.get(), Item.Properties()) }

    //  mixed red_nether bricks
    val SMALL_MIXED_RED_NETHER_BRICKS = register("small_mixed_red_nether_bricks") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_RED_NETHER_BRICKS.get(), Item.Properties()) }
    val SMALL_MIXED_RED_NETHER_BRICK_STAIRS = register("small_mixed_red_nether_brick_stairs") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_RED_NETHER_BRICK_STAIRS.get(), Item.Properties()) }
    val SMALL_MIXED_RED_NETHER_BRICK_SLAB = register("small_mixed_red_nether_brick_slab") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_RED_NETHER_BRICK_SLAB.get(), Item.Properties()) }
    val SMALL_MIXED_RED_NETHER_BRICK_WALL = register("small_mixed_red_nether_brick_wall") { BlockItem(HybridBlocksBlocks.SMALL_MIXED_RED_NETHER_BRICK_WALL.get(), Item.Properties()) }

    val MIXED_RED_NETHER_BRICKS = register("mixed_red_nether_bricks") { BlockItem(HybridBlocksBlocks.MIXED_RED_NETHER_BRICKS.get(), Item.Properties()) }
    val MIXED_RED_NETHER_BRICK_STAIRS = register("mixed_red_nether_brick_stairs") { BlockItem(HybridBlocksBlocks.MIXED_RED_NETHER_BRICK_STAIRS.get(), Item.Properties()) }
    val MIXED_RED_NETHER_BRICK_SLAB = register("mixed_red_nether_brick_slab") { BlockItem(HybridBlocksBlocks.MIXED_RED_NETHER_BRICK_SLAB.get(), Item.Properties()) }
    val MIXED_RED_NETHER_BRICK_WALL = register("mixed_red_nether_brick_wall") { BlockItem(HybridBlocksBlocks.MIXED_RED_NETHER_BRICK_WALL.get(), Item.Properties()) }

    val LARGE_MIXED_RED_NETHER_BRICKS = register("large_mixed_red_nether_bricks") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_RED_NETHER_BRICKS.get(), Item.Properties()) }
    val LARGE_MIXED_RED_NETHER_BRICK_STAIRS = register("large_mixed_red_nether_brick_stairs") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_RED_NETHER_BRICK_STAIRS.get(), Item.Properties()) }
    val LARGE_MIXED_RED_NETHER_BRICK_SLAB = register("large_mixed_red_nether_brick_slab") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_RED_NETHER_BRICK_SLAB.get(), Item.Properties()) }
    val LARGE_MIXED_RED_NETHER_BRICK_WALL = register("large_mixed_red_nether_brick_wall") { BlockItem(HybridBlocksBlocks.LARGE_MIXED_RED_NETHER_BRICK_WALL.get(), Item.Properties()) }

    val CRACKED_RED_NETHER_BRICKS = register("cracked_red_nether_bricks") { BlockItem(HybridBlocksBlocks.CRACKED_RED_NETHER_BRICKS.get(), Item.Properties()) }
    val BASKETWEAVE_RED_NETHER_BRICKS = register("basketweave_red_nether_bricks") { BlockItem(HybridBlocksBlocks.BASKETWEAVE_RED_NETHER_BRICKS.get(), Item.Properties()) }
    val PINWHEEL_RED_NETHER_BRICKS = register("pinwheel_red_nether_bricks") { BlockItem(HybridBlocksBlocks.PINWHEEL_RED_NETHER_BRICKS.get(), Item.Properties()) }
    val JACK_ON_JACK_RED_NETHER_BRICKS = register("jack_on_jack_red_nether_bricks") { BlockItem(HybridBlocksBlocks.JACK_ON_JACK_RED_NETHER_BRICKS.get(), Item.Properties()) }

    //  red_nether shingles
    val RED_NETHER_SHINGLES = register("red_nether_shingles") { BlockItem(HybridBlocksBlocks.RED_NETHER_SHINGLES.get(), Item.Properties()) }
    val RED_NETHER_SHINGLE_STAIRS = register("red_nether_shingle_stairs") { BlockItem(HybridBlocksBlocks.RED_NETHER_SHINGLE_STAIRS.get(), Item.Properties()) }
    val RED_NETHER_SHINGLE_SLAB = register("red_nether_shingle_slab") { BlockItem(HybridBlocksBlocks.RED_NETHER_SHINGLE_SLAB.get(), Item.Properties()) }
    val RED_NETHER_SHINGLE_WALL = register("red_nether_shingle_wall") { BlockItem(HybridBlocksBlocks.RED_NETHER_SHINGLE_WALL.get(), Item.Properties()) }

    val MIXED_RED_NETHER_SHINGLES = register("mixed_red_nether_shingles") { BlockItem(HybridBlocksBlocks.MIXED_RED_NETHER_SHINGLES.get(), Item.Properties()) }
    val MIXED_RED_NETHER_SHINGLE_STAIRS = register("mixed_red_nether_shingle_stairs") { BlockItem(HybridBlocksBlocks.MIXED_RED_NETHER_SHINGLE_STAIRS.get(), Item.Properties()) }
    val MIXED_RED_NETHER_SHINGLE_SLAB = register("mixed_red_nether_shingle_slab") { BlockItem(HybridBlocksBlocks.MIXED_RED_NETHER_SHINGLE_SLAB.get(), Item.Properties()) }
    val MIXED_RED_NETHER_SHINGLE_WALL = register("mixed_red_nether_shingle_wall") { BlockItem(HybridBlocksBlocks.MIXED_RED_NETHER_SHINGLE_WALL.get(), Item.Properties()) }

    val RED_NETHER_BRICK_CHIMNEY = register("red_nether_brick_chimney") { BlockItem(HybridBlocksBlocks.RED_NETHER_BRICK_CHIMNEY.get(), Item.Properties()) }
    //#endregion

    //#region Mossy Bricks
    val MOSSY_BRICKS = register("mossy_bricks") { BlockItem(HybridBlocksBlocks.MOSSY_BRICKS.get(), Item.Properties()) }
    val MOSSY_BRICK_STAIRS = register("mossy_brick_stairs") { BlockItem(HybridBlocksBlocks.MOSSY_BRICK_STAIRS.get(), Item.Properties()) }
    val MOSSY_BRICK_SLAB = register("mossy_brick_slab") { BlockItem(HybridBlocksBlocks.MOSSY_BRICK_SLAB.get(), Item.Properties()) }
    val MOSSY_BRICK_WALL = register("mossy_brick_wall") { BlockItem(HybridBlocksBlocks.MOSSY_BRICK_WALL.get(), Item.Properties()) }

    val MOSSY_WHITE_BRICKS = register("mossy_white_bricks") { BlockItem(HybridBlocksBlocks.MOSSY_WHITE_BRICKS.get(), Item.Properties()) }
    val MOSSY_WHITE_BRICK_STAIRS = register("mossy_white_brick_stairs") { BlockItem(HybridBlocksBlocks.MOSSY_WHITE_BRICK_STAIRS.get(), Item.Properties()) }
    val MOSSY_WHITE_BRICK_SLAB = register("mossy_white_brick_slab") { BlockItem(HybridBlocksBlocks.MOSSY_WHITE_BRICK_SLAB.get(), Item.Properties()) }
    val MOSSY_WHITE_BRICK_WALL = register("mossy_white_brick_wall") { BlockItem(HybridBlocksBlocks.MOSSY_WHITE_BRICK_WALL.get(), Item.Properties()) }

    val MOSSY_LIGHT_GRAY_BRICKS = register("mossy_light_gray_bricks") { BlockItem(HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICKS.get(), Item.Properties()) }
    val MOSSY_LIGHT_GRAY_BRICK_STAIRS = register("mossy_light_gray_brick_stairs") { BlockItem(HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICK_STAIRS.get(), Item.Properties()) }
    val MOSSY_LIGHT_GRAY_BRICK_SLAB = register("mossy_light_gray_brick_slab") { BlockItem(HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICK_SLAB.get(), Item.Properties()) }
    val MOSSY_LIGHT_GRAY_BRICK_WALL = register("mossy_light_gray_brick_wall") { BlockItem(HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICK_WALL.get(), Item.Properties()) }

    val MOSSY_GRAY_BRICKS = register("mossy_gray_bricks") { BlockItem(HybridBlocksBlocks.MOSSY_GRAY_BRICKS.get(), Item.Properties()) }
    val MOSSY_GRAY_BRICK_STAIRS = register("mossy_gray_brick_stairs") { BlockItem(HybridBlocksBlocks.MOSSY_GRAY_BRICK_STAIRS.get(), Item.Properties()) }
    val MOSSY_GRAY_BRICK_SLAB = register("mossy_gray_brick_slab") { BlockItem(HybridBlocksBlocks.MOSSY_GRAY_BRICK_SLAB.get(), Item.Properties()) }
    val MOSSY_GRAY_BRICK_WALL = register("mossy_gray_brick_wall") { BlockItem(HybridBlocksBlocks.MOSSY_GRAY_BRICK_WALL.get(), Item.Properties()) }

    val MOSSY_BLACK_BRICKS = register("mossy_black_bricks") { BlockItem(HybridBlocksBlocks.MOSSY_BLACK_BRICKS.get(), Item.Properties()) }
    val MOSSY_BLACK_BRICK_STAIRS = register("mossy_black_brick_stairs") { BlockItem(HybridBlocksBlocks.MOSSY_BLACK_BRICK_STAIRS.get(), Item.Properties()) }
    val MOSSY_BLACK_BRICK_SLAB = register("mossy_black_brick_slab") { BlockItem(HybridBlocksBlocks.MOSSY_BLACK_BRICK_SLAB.get(), Item.Properties()) }
    val MOSSY_BLACK_BRICK_WALL = register("mossy_black_brick_wall") { BlockItem(HybridBlocksBlocks.MOSSY_BLACK_BRICK_WALL.get(), Item.Properties()) }

    val MOSSY_BROWN_BRICKS = register("mossy_brown_bricks") { BlockItem(HybridBlocksBlocks.MOSSY_BROWN_BRICKS.get(), Item.Properties()) }
    val MOSSY_BROWN_BRICK_STAIRS = register("mossy_brown_brick_stairs") { BlockItem(HybridBlocksBlocks.MOSSY_BROWN_BRICK_STAIRS.get(), Item.Properties()) }
    val MOSSY_BROWN_BRICK_SLAB = register("mossy_brown_brick_slab") { BlockItem(HybridBlocksBlocks.MOSSY_BROWN_BRICK_SLAB.get(), Item.Properties()) }
    val MOSSY_BROWN_BRICK_WALL = register("mossy_brown_brick_wall") { BlockItem(HybridBlocksBlocks.MOSSY_BROWN_BRICK_WALL.get(), Item.Properties()) }

    val MOSSY_RED_BRICKS = register("mossy_red_bricks") { BlockItem(HybridBlocksBlocks.MOSSY_RED_BRICKS.get(), Item.Properties()) }
    val MOSSY_RED_BRICK_STAIRS = register("mossy_red_brick_stairs") { BlockItem(HybridBlocksBlocks.MOSSY_RED_BRICK_STAIRS.get(), Item.Properties()) }
    val MOSSY_RED_BRICK_SLAB = register("mossy_red_brick_slab") { BlockItem(HybridBlocksBlocks.MOSSY_RED_BRICK_SLAB.get(), Item.Properties()) }
    val MOSSY_RED_BRICK_WALL = register("mossy_red_brick_wall") { BlockItem(HybridBlocksBlocks.MOSSY_RED_BRICK_WALL.get(), Item.Properties()) }

    val MOSSY_ORANGE_BRICKS = register("mossy_orange_bricks") { BlockItem(HybridBlocksBlocks.MOSSY_ORANGE_BRICKS.get(), Item.Properties()) }
    val MOSSY_ORANGE_BRICK_STAIRS = register("mossy_orange_brick_stairs") { BlockItem(HybridBlocksBlocks.MOSSY_ORANGE_BRICK_STAIRS.get(), Item.Properties()) }
    val MOSSY_ORANGE_BRICK_SLAB = register("mossy_orange_brick_slab") { BlockItem(HybridBlocksBlocks.MOSSY_ORANGE_BRICK_SLAB.get(), Item.Properties()) }
    val MOSSY_ORANGE_BRICK_WALL = register("mossy_orange_brick_wall") { BlockItem(HybridBlocksBlocks.MOSSY_ORANGE_BRICK_WALL.get(), Item.Properties()) }

    val MOSSY_YELLOW_BRICKS = register("mossy_yellow_bricks") { BlockItem(HybridBlocksBlocks.MOSSY_YELLOW_BRICKS.get(), Item.Properties()) }
    val MOSSY_YELLOW_BRICK_STAIRS = register("mossy_yellow_brick_stairs") { BlockItem(HybridBlocksBlocks.MOSSY_YELLOW_BRICK_STAIRS.get(), Item.Properties()) }
    val MOSSY_YELLOW_BRICK_SLAB = register("mossy_yellow_brick_slab") { BlockItem(HybridBlocksBlocks.MOSSY_YELLOW_BRICK_SLAB.get(), Item.Properties()) }
    val MOSSY_YELLOW_BRICK_WALL = register("mossy_yellow_brick_wall") { BlockItem(HybridBlocksBlocks.MOSSY_YELLOW_BRICK_WALL.get(), Item.Properties()) }

    val MOSSY_LIME_BRICKS = register("mossy_lime_bricks") { BlockItem(HybridBlocksBlocks.MOSSY_LIME_BRICKS.get(), Item.Properties()) }
    val MOSSY_LIME_BRICK_STAIRS = register("mossy_lime_brick_stairs") { BlockItem(HybridBlocksBlocks.MOSSY_LIME_BRICK_STAIRS.get(), Item.Properties()) }
    val MOSSY_LIME_BRICK_SLAB = register("mossy_lime_brick_slab") { BlockItem(HybridBlocksBlocks.MOSSY_LIME_BRICK_SLAB.get(), Item.Properties()) }
    val MOSSY_LIME_BRICK_WALL = register("mossy_lime_brick_wall") { BlockItem(HybridBlocksBlocks.MOSSY_LIME_BRICK_WALL.get(), Item.Properties()) }

    val MOSSY_GREEN_BRICKS = register("mossy_green_bricks") { BlockItem(HybridBlocksBlocks.MOSSY_GREEN_BRICKS.get(), Item.Properties()) }
    val MOSSY_GREEN_BRICK_STAIRS = register("mossy_green_brick_stairs") { BlockItem(HybridBlocksBlocks.MOSSY_GREEN_BRICK_STAIRS.get(), Item.Properties()) }
    val MOSSY_GREEN_BRICK_SLAB = register("mossy_green_brick_slab") { BlockItem(HybridBlocksBlocks.MOSSY_GREEN_BRICK_SLAB.get(), Item.Properties()) }
    val MOSSY_GREEN_BRICK_WALL = register("mossy_green_brick_wall") { BlockItem(HybridBlocksBlocks.MOSSY_GREEN_BRICK_WALL.get(), Item.Properties()) }

    val MOSSY_CYAN_BRICKS = register("mossy_cyan_bricks") { BlockItem(HybridBlocksBlocks.MOSSY_CYAN_BRICKS.get(), Item.Properties()) }
    val MOSSY_CYAN_BRICK_STAIRS = register("mossy_cyan_brick_stairs") { BlockItem(HybridBlocksBlocks.MOSSY_CYAN_BRICK_STAIRS.get(), Item.Properties()) }
    val MOSSY_CYAN_BRICK_SLAB = register("mossy_cyan_brick_slab") { BlockItem(HybridBlocksBlocks.MOSSY_CYAN_BRICK_SLAB.get(), Item.Properties()) }
    val MOSSY_CYAN_BRICK_WALL = register("mossy_cyan_brick_wall") { BlockItem(HybridBlocksBlocks.MOSSY_CYAN_BRICK_WALL.get(), Item.Properties()) }

    val MOSSY_LIGHT_BLUE_BRICKS = register("mossy_light_blue_bricks") { BlockItem(HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICKS.get(), Item.Properties()) }
    val MOSSY_LIGHT_BLUE_BRICK_STAIRS = register("mossy_light_blue_brick_stairs") { BlockItem(HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICK_STAIRS.get(), Item.Properties()) }
    val MOSSY_LIGHT_BLUE_BRICK_SLAB = register("mossy_light_blue_brick_slab") { BlockItem(HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICK_SLAB.get(), Item.Properties()) }
    val MOSSY_LIGHT_BLUE_BRICK_WALL = register("mossy_light_blue_brick_wall") { BlockItem(HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICK_WALL.get(), Item.Properties()) }

    val MOSSY_BLUE_BRICKS = register("mossy_blue_bricks") { BlockItem(HybridBlocksBlocks.MOSSY_BLUE_BRICKS.get(), Item.Properties()) }
    val MOSSY_BLUE_BRICK_STAIRS = register("mossy_blue_brick_stairs") { BlockItem(HybridBlocksBlocks.MOSSY_BLUE_BRICK_STAIRS.get(), Item.Properties()) }
    val MOSSY_BLUE_BRICK_SLAB = register("mossy_blue_brick_slab") { BlockItem(HybridBlocksBlocks.MOSSY_BLUE_BRICK_SLAB.get(), Item.Properties()) }
    val MOSSY_BLUE_BRICK_WALL = register("mossy_blue_brick_wall") { BlockItem(HybridBlocksBlocks.MOSSY_BLUE_BRICK_WALL.get(), Item.Properties()) }

    val MOSSY_PURPLE_BRICKS = register("mossy_purple_bricks") { BlockItem(HybridBlocksBlocks.MOSSY_PURPLE_BRICKS.get(), Item.Properties()) }
    val MOSSY_PURPLE_BRICK_STAIRS = register("mossy_purple_brick_stairs") { BlockItem(HybridBlocksBlocks.MOSSY_PURPLE_BRICK_STAIRS.get(), Item.Properties()) }
    val MOSSY_PURPLE_BRICK_SLAB = register("mossy_purple_brick_slab") { BlockItem(HybridBlocksBlocks.MOSSY_PURPLE_BRICK_SLAB.get(), Item.Properties()) }
    val MOSSY_PURPLE_BRICK_WALL = register("mossy_purple_brick_wall") { BlockItem(HybridBlocksBlocks.MOSSY_PURPLE_BRICK_WALL.get(), Item.Properties()) }

    val MOSSY_MAGENTA_BRICKS = register("mossy_magenta_bricks") { BlockItem(HybridBlocksBlocks.MOSSY_MAGENTA_BRICKS.get(), Item.Properties()) }
    val MOSSY_MAGENTA_BRICK_STAIRS = register("mossy_magenta_brick_stairs") { BlockItem(HybridBlocksBlocks.MOSSY_MAGENTA_BRICK_STAIRS.get(), Item.Properties()) }
    val MOSSY_MAGENTA_BRICK_SLAB = register("mossy_magenta_brick_slab") { BlockItem(HybridBlocksBlocks.MOSSY_MAGENTA_BRICK_SLAB.get(), Item.Properties()) }
    val MOSSY_MAGENTA_BRICK_WALL = register("mossy_magenta_brick_wall") { BlockItem(HybridBlocksBlocks.MOSSY_MAGENTA_BRICK_WALL.get(), Item.Properties()) }

    val MOSSY_PINK_BRICKS = register("mossy_pink_bricks") { BlockItem(HybridBlocksBlocks.MOSSY_PINK_BRICKS.get(), Item.Properties()) }
    val MOSSY_PINK_BRICK_STAIRS = register("mossy_pink_brick_stairs") { BlockItem(HybridBlocksBlocks.MOSSY_PINK_BRICK_STAIRS.get(), Item.Properties()) }
    val MOSSY_PINK_BRICK_SLAB = register("mossy_pink_brick_slab") { BlockItem(HybridBlocksBlocks.MOSSY_PINK_BRICK_SLAB.get(), Item.Properties()) }
    val MOSSY_PINK_BRICK_WALL = register("mossy_pink_brick_wall") { BlockItem(HybridBlocksBlocks.MOSSY_PINK_BRICK_WALL.get(), Item.Properties()) }
    //#endregion

    val DORIC_COLUMN = register("doric_column") { BlockItem(HybridBlocksBlocks.DORIC_COLUMN.get(), Item.Properties()) }

    //#region Clear Glass
    val CLEAR_GLASS = register("clear_glass") { BlockItem(HybridBlocksBlocks.CLEAR_GLASS.get(), Item.Properties()) }
    val WHITE_STAINED_CLEAR_GLASS = register("white_stained_clear_glass") { BlockItem(HybridBlocksBlocks.WHITE_STAINED_CLEAR_GLASS.get(), Item.Properties()) }
    val LIGHT_GRAY_STAINED_CLEAR_GLASS = register("light_gray_stained_clear_glass") { BlockItem(HybridBlocksBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS.get(), Item.Properties()) }
    val GRAY_STAINED_CLEAR_GLASS = register("gray_stained_clear_glass") { BlockItem(HybridBlocksBlocks.GRAY_STAINED_CLEAR_GLASS.get(), Item.Properties()) }
    val BLACK_STAINED_CLEAR_GLASS = register("black_stained_clear_glass") { BlockItem(HybridBlocksBlocks.BLACK_STAINED_CLEAR_GLASS.get(), Item.Properties()) }
    val BROWN_STAINED_CLEAR_GLASS = register("brown_stained_clear_glass") { BlockItem(HybridBlocksBlocks.BROWN_STAINED_CLEAR_GLASS.get(), Item.Properties()) }
    val RED_STAINED_CLEAR_GLASS = register("red_stained_clear_glass") { BlockItem(HybridBlocksBlocks.RED_STAINED_CLEAR_GLASS.get(), Item.Properties()) }
    val ORANGE_STAINED_CLEAR_GLASS = register("orange_stained_clear_glass") { BlockItem(HybridBlocksBlocks.ORANGE_STAINED_CLEAR_GLASS.get(), Item.Properties()) }
    val YELLOW_STAINED_CLEAR_GLASS = register("yellow_stained_clear_glass") { BlockItem(HybridBlocksBlocks.YELLOW_STAINED_CLEAR_GLASS.get(), Item.Properties()) }
    val LIME_STAINED_CLEAR_GLASS = register("lime_stained_clear_glass") { BlockItem(HybridBlocksBlocks.LIME_STAINED_CLEAR_GLASS.get(), Item.Properties()) }
    val GREEN_STAINED_CLEAR_GLASS = register("green_stained_clear_glass") { BlockItem(HybridBlocksBlocks.GREEN_STAINED_CLEAR_GLASS.get(), Item.Properties()) }
    val CYAN_STAINED_CLEAR_GLASS = register("cyan_stained_clear_glass") { BlockItem(HybridBlocksBlocks.CYAN_STAINED_CLEAR_GLASS.get(), Item.Properties()) }
    val LIGHT_BLUE_STAINED_CLEAR_GLASS = register("light_blue_stained_clear_glass") { BlockItem(HybridBlocksBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS.get(), Item.Properties()) }
    val BLUE_STAINED_CLEAR_GLASS = register("blue_stained_clear_glass") { BlockItem(HybridBlocksBlocks.BLUE_STAINED_CLEAR_GLASS.get(), Item.Properties()) }
    val PURPLE_STAINED_CLEAR_GLASS = register("purple_stained_clear_glass") { BlockItem(HybridBlocksBlocks.PURPLE_STAINED_CLEAR_GLASS.get(), Item.Properties()) }
    val MAGENTA_STAINED_CLEAR_GLASS = register("magenta_stained_clear_glass") { BlockItem(HybridBlocksBlocks.MAGENTA_STAINED_CLEAR_GLASS.get(), Item.Properties()) }
    val PINK_STAINED_CLEAR_GLASS = register("pink_stained_clear_glass") { BlockItem(HybridBlocksBlocks.PINK_STAINED_CLEAR_GLASS.get(), Item.Properties()) }

    val CLEAR_GLASS_PANE = register("clear_glass_pane") { BlockItem(HybridBlocksBlocks.CLEAR_GLASS_PANE.get(), Item.Properties()) }
    val WHITE_STAINED_CLEAR_GLASS_PANE = register("white_stained_clear_glass_pane") { BlockItem(HybridBlocksBlocks.WHITE_STAINED_CLEAR_GLASS_PANE.get(), Item.Properties()) }
    val LIGHT_GRAY_STAINED_CLEAR_GLASS_PANE = register("light_gray_stained_clear_glass_pane") { BlockItem(HybridBlocksBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS_PANE.get(), Item.Properties()) }
    val GRAY_STAINED_CLEAR_GLASS_PANE = register("gray_stained_clear_glass_pane") { BlockItem(HybridBlocksBlocks.GRAY_STAINED_CLEAR_GLASS_PANE.get(), Item.Properties()) }
    val BLACK_STAINED_CLEAR_GLASS_PANE = register("black_stained_clear_glass_pane") { BlockItem(HybridBlocksBlocks.BLACK_STAINED_CLEAR_GLASS_PANE.get(), Item.Properties()) }
    val BROWN_STAINED_CLEAR_GLASS_PANE = register("brown_stained_clear_glass_pane") { BlockItem(HybridBlocksBlocks.BROWN_STAINED_CLEAR_GLASS_PANE.get(), Item.Properties()) }
    val RED_STAINED_CLEAR_GLASS_PANE = register("red_stained_clear_glass_pane") { BlockItem(HybridBlocksBlocks.RED_STAINED_CLEAR_GLASS_PANE.get(), Item.Properties()) }
    val ORANGE_STAINED_CLEAR_GLASS_PANE = register("orange_stained_clear_glass_pane") { BlockItem(HybridBlocksBlocks.ORANGE_STAINED_CLEAR_GLASS_PANE.get(), Item.Properties()) }
    val YELLOW_STAINED_CLEAR_GLASS_PANE = register("yellow_stained_clear_glass_pane") { BlockItem(HybridBlocksBlocks.YELLOW_STAINED_CLEAR_GLASS_PANE.get(), Item.Properties()) }
    val LIME_STAINED_CLEAR_GLASS_PANE = register("lime_stained_clear_glass_pane") { BlockItem(HybridBlocksBlocks.LIME_STAINED_CLEAR_GLASS_PANE.get(), Item.Properties()) }
    val GREEN_STAINED_CLEAR_GLASS_PANE = register("green_stained_clear_glass_pane") { BlockItem(HybridBlocksBlocks.GREEN_STAINED_CLEAR_GLASS_PANE.get(), Item.Properties()) }
    val CYAN_STAINED_CLEAR_GLASS_PANE = register("cyan_stained_clear_glass_pane") { BlockItem(HybridBlocksBlocks.CYAN_STAINED_CLEAR_GLASS_PANE.get(), Item.Properties()) }
    val LIGHT_BLUE_STAINED_CLEAR_GLASS_PANE = register("light_blue_stained_clear_glass_pane") { BlockItem(HybridBlocksBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS_PANE.get(), Item.Properties()) }
    val BLUE_STAINED_CLEAR_GLASS_PANE = register("blue_stained_clear_glass_pane") { BlockItem(HybridBlocksBlocks.BLUE_STAINED_CLEAR_GLASS_PANE.get(), Item.Properties()) }
    val PURPLE_STAINED_CLEAR_GLASS_PANE = register("purple_stained_clear_glass_pane") { BlockItem(HybridBlocksBlocks.PURPLE_STAINED_CLEAR_GLASS_PANE.get(), Item.Properties()) }
    val MAGENTA_STAINED_CLEAR_GLASS_PANE = register("magenta_stained_clear_glass_pane") { BlockItem(HybridBlocksBlocks.MAGENTA_STAINED_CLEAR_GLASS_PANE.get(), Item.Properties()) }
    val PINK_STAINED_CLEAR_GLASS_PANE = register("pink_stained_clear_glass_pane") { BlockItem(HybridBlocksBlocks.PINK_STAINED_CLEAR_GLASS_PANE.get(), Item.Properties()) }
    //#endregion

    private fun <T : Item> register(id: String, item: Supplier<T>): RegistryObject<T> {
        return HybridBlocksCommon.ITEMS.register(id, item)
    }
}