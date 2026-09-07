package dev.hybridlabs.blocks.block

import dev.hybridlabs.blocks.CommonClass
import dev.hybridlabs.blocks.platform.registration.RegistryObject
import java.util.function.Supplier
import net.minecraft.world.item.DyeColor
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.block.RotatedPillarBlock
import net.minecraft.world.level.block.SlabBlock
import net.minecraft.world.level.block.StainedGlassBlock
import net.minecraft.world.level.block.StainedGlassPaneBlock
import net.minecraft.world.level.block.WallBlock
import net.minecraft.world.level.block.state.BlockBehaviour

/**
 * All Hybrid Blocks blocks.
 */
object HybridBlocksBlocks {
    val POLISHED_CALCITE = simple("polished_calcite", Blocks.CALCITE, DyeColor.WHITE)
    val POLISHED_CALCITE_STAIRS = stairs("polished_calcite_stairs", Blocks.QUARTZ_STAIRS, Blocks.CALCITE, DyeColor.WHITE)
    val POLISHED_CALCITE_SLAB = slab("polished_calcite_slab", Blocks.CALCITE, DyeColor.WHITE)
    val POLISHED_CALCITE_BRICKS = simple("polished_calcite_bricks", Blocks.CALCITE, DyeColor.WHITE)
    val POLISHED_CALCITE_BRICK_STAIRS = stairs("polished_calcite_brick_stairs", Blocks.CALCITE, Blocks.CALCITE, DyeColor.WHITE)
    val POLISHED_CALCITE_BRICK_SLAB = slab("polished_calcite_brick_slab", Blocks.CALCITE, DyeColor.WHITE)
    val POLISHED_CALCITE_TILES = simple("polished_calcite_tiles", Blocks.CALCITE, DyeColor.WHITE)
    val POLISHED_CALCITE_TILE_STAIRS = stairs("polished_calcite_tile_stairs", Blocks.CALCITE, Blocks.CALCITE, DyeColor.WHITE)
    val POLISHED_CALCITE_TILE_SLAB = slab("polished_calcite_tile_slab", Blocks.CALCITE, DyeColor.WHITE)

    // region Quartz
    val QUARTZ_BRICK_STAIRS = stairs("quartz_brick_stairs", Blocks.QUARTZ_BRICKS, Blocks.QUARTZ_BRICKS)
    val QUARTZ_BRICK_SLAB = slab("quartz_brick_slab", Blocks.QUARTZ_BRICKS)

    val WHITE_QUARTZ_BLOCK = simple("white_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.WHITE)
    val WHITE_QUARTZ_STAIRS = stairs("white_quartz_stairs", Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK, DyeColor.WHITE)
    val WHITE_QUARTZ_SLAB = slab("white_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.WHITE)
    val CHISELED_WHITE_QUARTZ_BLOCK = simple("chiseled_white_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.WHITE)
    val WHITE_QUARTZ_BRICKS = simple("white_quartz_bricks", Blocks.QUARTZ_BLOCK, DyeColor.WHITE)
    val WHITE_QUARTZ_BRICK_STAIRS = stairs("white_quartz_brick_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.WHITE)
    val WHITE_QUARTZ_BRICK_SLAB = slab("white_quartz_brick_slab", Blocks.QUARTZ_BLOCK, DyeColor.WHITE)
    val WHITE_QUARTZ_PILLAR = pillar("white_quartz_pillar", Blocks.QUARTZ_PILLAR, DyeColor.WHITE)
    val SMOOTH_WHITE_QUARTZ = simple("smooth_white_quartz", Blocks.SMOOTH_QUARTZ, DyeColor.WHITE)
    val SMOOTH_WHITE_QUARTZ_STAIRS = stairs("smooth_white_quartz_stairs", Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK, DyeColor.WHITE)
    val SMOOTH_WHITE_QUARTZ_SLAB = slab("smooth_white_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.WHITE)
    val WHITE_QUARTZ_TILES = simple("white_quartz_tiles", Blocks.QUARTZ_BLOCK, DyeColor.WHITE)
    val WHITE_QUARTZ_TILE_STAIRS = stairs("white_quartz_tile_stairs", Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK, DyeColor.WHITE)
    val WHITE_QUARTZ_TILE_SLAB = slab("white_quartz_tile_slab", Blocks.QUARTZ_BLOCK, DyeColor.WHITE)

    val ORANGE_QUARTZ_BLOCK = simple("orange_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.ORANGE)
    val ORANGE_QUARTZ_STAIRS = stairs("orange_quartz_stairs", Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK, DyeColor.ORANGE)
    val ORANGE_QUARTZ_SLAB = slab("orange_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.ORANGE)
    val CHISELED_ORANGE_QUARTZ_BLOCK = simple("chiseled_orange_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.ORANGE)
    val ORANGE_QUARTZ_BRICKS = simple("orange_quartz_bricks", Blocks.QUARTZ_BLOCK, DyeColor.ORANGE)
    val ORANGE_QUARTZ_BRICK_STAIRS = stairs("orange_quartz_brick_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.ORANGE)
    val ORANGE_QUARTZ_BRICK_SLAB = slab("orange_quartz_brick_slab", Blocks.QUARTZ_BLOCK, DyeColor.ORANGE)
    val ORANGE_QUARTZ_PILLAR = pillar("orange_quartz_pillar", Blocks.QUARTZ_PILLAR, DyeColor.ORANGE)
    val SMOOTH_ORANGE_QUARTZ = simple("smooth_orange_quartz", Blocks.SMOOTH_QUARTZ, DyeColor.ORANGE)
    val SMOOTH_ORANGE_QUARTZ_STAIRS = stairs("smooth_orange_quartz_stairs", Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK, DyeColor.ORANGE)
    val SMOOTH_ORANGE_QUARTZ_SLAB = slab("smooth_orange_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.ORANGE)
    val ORANGE_QUARTZ_TILES = simple("orange_quartz_tiles", Blocks.QUARTZ_BLOCK, DyeColor.ORANGE)
    val ORANGE_QUARTZ_TILE_STAIRS = stairs("orange_quartz_tile_stairs", Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK, DyeColor.ORANGE)
    val ORANGE_QUARTZ_TILE_SLAB = slab("orange_quartz_tile_slab", Blocks.QUARTZ_BLOCK, DyeColor.ORANGE)

    val MAGENTA_QUARTZ_BLOCK = simple("magenta_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.MAGENTA)
    val MAGENTA_QUARTZ_STAIRS = stairs("magenta_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.MAGENTA)
    val MAGENTA_QUARTZ_SLAB = slab("magenta_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.MAGENTA)
    val CHISELED_MAGENTA_QUARTZ_BLOCK = simple("chiseled_magenta_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.MAGENTA)
    val MAGENTA_QUARTZ_BRICKS = simple("magenta_quartz_bricks", Blocks.QUARTZ_BLOCK, DyeColor.MAGENTA)
    val MAGENTA_QUARTZ_BRICK_STAIRS = stairs("magenta_quartz_brick_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.MAGENTA)
    val MAGENTA_QUARTZ_BRICK_SLAB = slab("magenta_quartz_brick_slab", Blocks.QUARTZ_BLOCK, DyeColor.MAGENTA)
    val MAGENTA_QUARTZ_PILLAR = pillar("magenta_quartz_pillar", Blocks.QUARTZ_PILLAR, DyeColor.MAGENTA)
    val SMOOTH_MAGENTA_QUARTZ = simple("smooth_magenta_quartz", Blocks.SMOOTH_QUARTZ, DyeColor.MAGENTA)
    val SMOOTH_MAGENTA_QUARTZ_STAIRS = stairs("smooth_magenta_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.MAGENTA)
    val SMOOTH_MAGENTA_QUARTZ_SLAB = slab("smooth_magenta_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.MAGENTA)
    val MAGENTA_QUARTZ_TILES = simple("magenta_quartz_tiles", Blocks.QUARTZ_BLOCK, DyeColor.MAGENTA)
    val MAGENTA_QUARTZ_TILE_STAIRS = stairs("magenta_quartz_tile_stairs", Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK, DyeColor.MAGENTA)
    val MAGENTA_QUARTZ_TILE_SLAB = slab("magenta_quartz_tile_slab", Blocks.QUARTZ_BLOCK, DyeColor.MAGENTA)

    val LIGHT_BLUE_QUARTZ_BLOCK = simple("light_blue_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.LIGHT_BLUE)
    val LIGHT_BLUE_QUARTZ_STAIRS = stairs("light_blue_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.LIGHT_BLUE)
    val LIGHT_BLUE_QUARTZ_SLAB = slab("light_blue_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.LIGHT_BLUE)
    val CHISELED_LIGHT_BLUE_QUARTZ_BLOCK = simple("chiseled_light_blue_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.LIGHT_BLUE)
    val LIGHT_BLUE_QUARTZ_BRICKS = simple("light_blue_quartz_bricks", Blocks.QUARTZ_BLOCK, DyeColor.LIGHT_BLUE)
    val LIGHT_BLUE_QUARTZ_BRICK_STAIRS = stairs("light_blue_quartz_brick_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.LIGHT_BLUE)
    val LIGHT_BLUE_QUARTZ_BRICK_SLAB = slab("light_blue_quartz_brick_slab", Blocks.QUARTZ_BLOCK, DyeColor.LIGHT_BLUE)
    val LIGHT_BLUE_QUARTZ_PILLAR = pillar("light_blue_quartz_pillar", Blocks.QUARTZ_PILLAR, DyeColor.LIGHT_BLUE)
    val SMOOTH_LIGHT_BLUE_QUARTZ = simple("smooth_light_blue_quartz", Blocks.SMOOTH_QUARTZ, DyeColor.LIGHT_BLUE)
    val SMOOTH_LIGHT_BLUE_QUARTZ_STAIRS = stairs("smooth_light_blue_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.LIGHT_BLUE)
    val SMOOTH_LIGHT_BLUE_QUARTZ_SLAB = slab("smooth_light_blue_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.LIGHT_BLUE)
    val LIGHT_BLUE_QUARTZ_TILES = simple("light_blue_quartz_tiles", Blocks.QUARTZ_BLOCK, DyeColor.LIGHT_BLUE)
    val LIGHT_BLUE_QUARTZ_TILE_STAIRS = stairs("light_blue_quartz_tile_stairs", Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK, DyeColor.LIGHT_BLUE)
    val LIGHT_BLUE_QUARTZ_TILE_SLAB = slab("light_blue_quartz_tile_slab", Blocks.QUARTZ_BLOCK, DyeColor.LIGHT_BLUE)

    val YELLOW_QUARTZ_BLOCK = simple("yellow_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.YELLOW)
    val YELLOW_QUARTZ_STAIRS = stairs("yellow_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.YELLOW)
    val YELLOW_QUARTZ_SLAB = slab("yellow_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.YELLOW)
    val CHISELED_YELLOW_QUARTZ_BLOCK = simple("chiseled_yellow_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.YELLOW)
    val YELLOW_QUARTZ_BRICKS = simple("yellow_quartz_bricks", Blocks.QUARTZ_BLOCK, DyeColor.YELLOW)
    val YELLOW_QUARTZ_BRICK_STAIRS = stairs("yellow_quartz_brick_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.YELLOW)
    val YELLOW_QUARTZ_BRICK_SLAB = slab("yellow_quartz_brick_slab", Blocks.QUARTZ_BLOCK, DyeColor.YELLOW)
    val YELLOW_QUARTZ_PILLAR = pillar("yellow_quartz_pillar", Blocks.QUARTZ_PILLAR, DyeColor.YELLOW)
    val SMOOTH_YELLOW_QUARTZ = simple("smooth_yellow_quartz", Blocks.SMOOTH_QUARTZ, DyeColor.YELLOW)
    val SMOOTH_YELLOW_QUARTZ_STAIRS = stairs("smooth_yellow_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.YELLOW)
    val SMOOTH_YELLOW_QUARTZ_SLAB = slab("smooth_yellow_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.YELLOW)
    val YELLOW_QUARTZ_TILES = simple("yellow_quartz_tiles", Blocks.QUARTZ_BLOCK, DyeColor.YELLOW)
    val YELLOW_QUARTZ_TILE_STAIRS = stairs("yellow_quartz_tile_stairs", Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK, DyeColor.YELLOW)
    val YELLOW_QUARTZ_TILE_SLAB = slab("yellow_quartz_tile_slab", Blocks.QUARTZ_BLOCK, DyeColor.YELLOW)

    val LIME_QUARTZ_BLOCK = simple("lime_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.LIME)
    val LIME_QUARTZ_STAIRS = stairs("lime_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.LIME)
    val LIME_QUARTZ_SLAB = slab("lime_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.LIME)
    val CHISELED_LIME_QUARTZ_BLOCK = simple("chiseled_lime_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.LIME)
    val LIME_QUARTZ_BRICKS = simple("lime_quartz_bricks", Blocks.QUARTZ_BLOCK, DyeColor.LIME)
    val LIME_QUARTZ_BRICK_STAIRS = stairs("lime_quartz_brick_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.LIME)
    val LIME_QUARTZ_BRICK_SLAB = slab("lime_quartz_brick_slab", Blocks.QUARTZ_BLOCK, DyeColor.LIME)
    val LIME_QUARTZ_PILLAR = pillar("lime_quartz_pillar", Blocks.QUARTZ_PILLAR, DyeColor.LIME)
    val SMOOTH_LIME_QUARTZ = simple("smooth_lime_quartz", Blocks.SMOOTH_QUARTZ, DyeColor.LIME)
    val SMOOTH_LIME_QUARTZ_STAIRS = stairs("smooth_lime_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.LIME)
    val SMOOTH_LIME_QUARTZ_SLAB = slab("smooth_lime_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.LIME)
    val LIME_QUARTZ_TILES = simple("lime_quartz_tiles", Blocks.QUARTZ_BLOCK, DyeColor.LIME)
    val LIME_QUARTZ_TILE_STAIRS = stairs("lime_quartz_tile_stairs", Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK, DyeColor.LIME)
    val LIME_QUARTZ_TILE_SLAB = slab("lime_quartz_tile_slab", Blocks.QUARTZ_BLOCK, DyeColor.LIME)

    val PINK_QUARTZ_BLOCK = simple("pink_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.PINK)
    val PINK_QUARTZ_STAIRS = stairs("pink_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.PINK)
    val PINK_QUARTZ_SLAB = slab("pink_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.PINK)
    val CHISELED_PINK_QUARTZ_BLOCK = simple("chiseled_pink_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.PINK)
    val PINK_QUARTZ_BRICKS = simple("pink_quartz_bricks", Blocks.QUARTZ_BLOCK, DyeColor.PINK)
    val PINK_QUARTZ_BRICK_STAIRS = stairs("pink_quartz_brick_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.PINK)
    val PINK_QUARTZ_BRICK_SLAB = slab("pink_quartz_brick_slab", Blocks.QUARTZ_BLOCK, DyeColor.PINK)
    val PINK_QUARTZ_PILLAR = pillar("pink_quartz_pillar", Blocks.QUARTZ_PILLAR, DyeColor.PINK)
    val SMOOTH_PINK_QUARTZ = simple("smooth_pink_quartz", Blocks.SMOOTH_QUARTZ, DyeColor.PINK)
    val SMOOTH_PINK_QUARTZ_STAIRS = stairs("smooth_pink_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.PINK)
    val SMOOTH_PINK_QUARTZ_SLAB = slab("smooth_pink_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.PINK)
    val PINK_QUARTZ_TILES = simple("pink_quartz_tiles", Blocks.QUARTZ_BLOCK, DyeColor.PINK)
    val PINK_QUARTZ_TILE_STAIRS = stairs("pink_quartz_tile_stairs", Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK, DyeColor.PINK)
    val PINK_QUARTZ_TILE_SLAB = slab("pink_quartz_tile_slab", Blocks.QUARTZ_BLOCK, DyeColor.PINK)

    val GRAY_QUARTZ_BLOCK = simple("gray_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.GRAY)
    val GRAY_QUARTZ_STAIRS = stairs("gray_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.GRAY)
    val GRAY_QUARTZ_SLAB = slab("gray_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.GRAY)
    val CHISELED_GRAY_QUARTZ_BLOCK = simple("chiseled_gray_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.GRAY)
    val GRAY_QUARTZ_BRICKS = simple("gray_quartz_bricks", Blocks.QUARTZ_BLOCK, DyeColor.GRAY)
    val GRAY_QUARTZ_BRICK_STAIRS = stairs("gray_quartz_brick_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.GRAY)
    val GRAY_QUARTZ_BRICK_SLAB = slab("gray_quartz_brick_slab", Blocks.QUARTZ_BLOCK, DyeColor.GRAY)
    val GRAY_QUARTZ_PILLAR = pillar("gray_quartz_pillar", Blocks.QUARTZ_PILLAR, DyeColor.GRAY)
    val SMOOTH_GRAY_QUARTZ = simple("smooth_gray_quartz", Blocks.SMOOTH_QUARTZ, DyeColor.GRAY)
    val SMOOTH_GRAY_QUARTZ_STAIRS = stairs("smooth_gray_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.GRAY)
    val SMOOTH_GRAY_QUARTZ_SLAB = slab("smooth_gray_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.GRAY)
    val GRAY_QUARTZ_TILES = simple("gray_quartz_tiles", Blocks.QUARTZ_BLOCK, DyeColor.GRAY)
    val GRAY_QUARTZ_TILE_STAIRS = stairs("gray_quartz_tile_stairs", Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK, DyeColor.GRAY)
    val GRAY_QUARTZ_TILE_SLAB = slab("gray_quartz_tile_slab", Blocks.QUARTZ_BLOCK, DyeColor.GRAY)

    val LIGHT_GRAY_QUARTZ_BLOCK = simple("light_gray_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.LIGHT_GRAY)
    val LIGHT_GRAY_QUARTZ_STAIRS = stairs("light_gray_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.LIGHT_GRAY)
    val LIGHT_GRAY_QUARTZ_SLAB = slab("light_gray_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.LIGHT_GRAY)
    val CHISELED_LIGHT_GRAY_QUARTZ_BLOCK = simple("chiseled_light_gray_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.LIGHT_GRAY)
    val LIGHT_GRAY_QUARTZ_BRICKS = simple("light_gray_quartz_bricks", Blocks.QUARTZ_BLOCK, DyeColor.LIGHT_GRAY)
    val LIGHT_GRAY_QUARTZ_BRICK_STAIRS = stairs("light_gray_quartz_brick_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.LIGHT_GRAY)
    val LIGHT_GRAY_QUARTZ_BRICK_SLAB = slab("light_gray_quartz_brick_slab", Blocks.QUARTZ_BLOCK, DyeColor.LIGHT_GRAY)
    val LIGHT_GRAY_QUARTZ_PILLAR = pillar("light_gray_quartz_pillar", Blocks.QUARTZ_PILLAR, DyeColor.LIGHT_GRAY)
    val SMOOTH_LIGHT_GRAY_QUARTZ = simple("smooth_light_gray_quartz", Blocks.SMOOTH_QUARTZ, DyeColor.LIGHT_GRAY)
    val SMOOTH_LIGHT_GRAY_QUARTZ_STAIRS = stairs("smooth_light_gray_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.LIGHT_GRAY)
    val SMOOTH_LIGHT_GRAY_QUARTZ_SLAB = slab("smooth_light_gray_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.LIGHT_GRAY)
    val LIGHT_GRAY_QUARTZ_TILES = simple("light_gray_quartz_tiles", Blocks.QUARTZ_BLOCK, DyeColor.YELLOW)
    val LIGHT_GRAY_QUARTZ_TILE_STAIRS = stairs("light_gray_quartz_tile_stairs", Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK, DyeColor.LIGHT_GRAY)
    val LIGHT_GRAY_QUARTZ_TILE_SLAB = slab("light_gray_quartz_tile_slab", Blocks.QUARTZ_BLOCK, DyeColor.LIGHT_GRAY)

    val CYAN_QUARTZ_BLOCK = simple("cyan_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.CYAN)
    val CYAN_QUARTZ_STAIRS = stairs("cyan_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.CYAN)
    val CYAN_QUARTZ_SLAB = slab("cyan_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.CYAN)
    val CHISELED_CYAN_QUARTZ_BLOCK = simple("chiseled_cyan_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.CYAN)
    val CYAN_QUARTZ_BRICKS = simple("cyan_quartz_bricks", Blocks.QUARTZ_BLOCK, DyeColor.CYAN)
    val CYAN_QUARTZ_BRICK_STAIRS = stairs("cyan_quartz_brick_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.CYAN)
    val CYAN_QUARTZ_BRICK_SLAB = slab("cyan_quartz_brick_slab", Blocks.QUARTZ_BLOCK, DyeColor.CYAN)
    val CYAN_QUARTZ_PILLAR = pillar("cyan_quartz_pillar", Blocks.QUARTZ_PILLAR, DyeColor.CYAN)
    val SMOOTH_CYAN_QUARTZ = simple("smooth_cyan_quartz", Blocks.SMOOTH_QUARTZ, DyeColor.CYAN)
    val SMOOTH_CYAN_QUARTZ_STAIRS = stairs("smooth_cyan_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.CYAN)
    val SMOOTH_CYAN_QUARTZ_SLAB = slab("smooth_cyan_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.CYAN)
    val CYAN_QUARTZ_TILES = simple("cyan_quartz_tiles", Blocks.QUARTZ_BLOCK, DyeColor.CYAN)
    val CYAN_QUARTZ_TILE_STAIRS = stairs("cyan_quartz_tile_stairs", Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK, DyeColor.CYAN)
    val CYAN_QUARTZ_TILE_SLAB = slab("cyan_quartz_tile_slab", Blocks.QUARTZ_BLOCK, DyeColor.CYAN)

    val PURPLE_QUARTZ_BLOCK = simple("purple_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.PURPLE)
    val PURPLE_QUARTZ_STAIRS = stairs("purple_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.PURPLE)
    val PURPLE_QUARTZ_SLAB = slab("purple_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.PURPLE)
    val CHISELED_PURPLE_QUARTZ_BLOCK = simple("chiseled_purple_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.PURPLE)
    val PURPLE_QUARTZ_BRICKS = simple("purple_quartz_bricks", Blocks.QUARTZ_BLOCK, DyeColor.PURPLE)
    val PURPLE_QUARTZ_BRICK_STAIRS = stairs("purple_quartz_brick_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.PURPLE)
    val PURPLE_QUARTZ_BRICK_SLAB = slab("purple_quartz_brick_slab", Blocks.QUARTZ_BLOCK, DyeColor.PURPLE)
    val PURPLE_QUARTZ_PILLAR = pillar("purple_quartz_pillar", Blocks.QUARTZ_PILLAR, DyeColor.PURPLE)
    val SMOOTH_PURPLE_QUARTZ = simple("smooth_purple_quartz", Blocks.SMOOTH_QUARTZ, DyeColor.PURPLE)
    val SMOOTH_PURPLE_QUARTZ_STAIRS = stairs("smooth_purple_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.PURPLE)
    val SMOOTH_PURPLE_QUARTZ_SLAB = slab("smooth_purple_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.PURPLE)
    val PURPLE_QUARTZ_TILES = simple("purple_quartz_tiles", Blocks.QUARTZ_BLOCK, DyeColor.PURPLE)
    val PURPLE_QUARTZ_TILE_STAIRS = stairs("purple_quartz_tile_stairs", Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK, DyeColor.PURPLE)
    val PURPLE_QUARTZ_TILE_SLAB = slab("purple_quartz_tile_slab", Blocks.QUARTZ_BLOCK, DyeColor.PURPLE)

    val BLUE_QUARTZ_BLOCK = simple("blue_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.BLUE)
    val BLUE_QUARTZ_STAIRS = stairs("blue_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.BLUE)
    val BLUE_QUARTZ_SLAB = slab("blue_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.BLUE)
    val CHISELED_BLUE_QUARTZ_BLOCK = simple("chiseled_blue_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.BLUE)
    val BLUE_QUARTZ_BRICKS = simple("blue_quartz_bricks", Blocks.QUARTZ_BLOCK, DyeColor.BLUE)
    val BLUE_QUARTZ_BRICK_STAIRS = stairs("blue_quartz_brick_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.BLUE)
    val BLUE_QUARTZ_BRICK_SLAB = slab("blue_quartz_brick_slab", Blocks.QUARTZ_BLOCK, DyeColor.BLUE)
    val BLUE_QUARTZ_PILLAR = pillar("blue_quartz_pillar", Blocks.QUARTZ_PILLAR, DyeColor.BLUE)
    val SMOOTH_BLUE_QUARTZ = simple("smooth_blue_quartz", Blocks.SMOOTH_QUARTZ, DyeColor.BLUE)
    val SMOOTH_BLUE_QUARTZ_STAIRS = stairs("smooth_blue_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.BLUE)
    val SMOOTH_BLUE_QUARTZ_SLAB = slab("smooth_blue_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.BLUE)
    val BLUE_QUARTZ_TILES = simple("blue_quartz_tiles", Blocks.QUARTZ_BLOCK, DyeColor.BLUE)
    val BLUE_QUARTZ_TILE_STAIRS = stairs("blue_quartz_tile_stairs", Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK, DyeColor.BLUE)
    val BLUE_QUARTZ_TILE_SLAB = slab("blue_quartz_tile_slab", Blocks.QUARTZ_BLOCK, DyeColor.BLUE)

    val BROWN_QUARTZ_BLOCK = simple("brown_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.BROWN)
    val BROWN_QUARTZ_STAIRS = stairs("brown_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.BROWN)
    val BROWN_QUARTZ_SLAB = slab("brown_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.BROWN)
    val CHISELED_BROWN_QUARTZ_BLOCK = simple("chiseled_brown_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.BROWN)
    val BROWN_QUARTZ_BRICKS = simple("brown_quartz_bricks", Blocks.QUARTZ_BLOCK, DyeColor.BROWN)
    val BROWN_QUARTZ_BRICK_STAIRS = stairs("brown_quartz_brick_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.BROWN)
    val BROWN_QUARTZ_BRICK_SLAB = slab("brown_quartz_brick_slab", Blocks.QUARTZ_BLOCK, DyeColor.BROWN)
    val BROWN_QUARTZ_PILLAR = pillar("brown_quartz_pillar", Blocks.QUARTZ_PILLAR, DyeColor.BROWN)
    val SMOOTH_BROWN_QUARTZ = simple("smooth_brown_quartz", Blocks.SMOOTH_QUARTZ, DyeColor.BROWN)
    val SMOOTH_BROWN_QUARTZ_STAIRS = stairs("smooth_brown_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.BROWN)
    val SMOOTH_BROWN_QUARTZ_SLAB = slab("smooth_brown_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.BROWN)
    val BROWN_QUARTZ_TILES = simple("brown_quartz_tiles", Blocks.QUARTZ_BLOCK, DyeColor.BROWN)
    val BROWN_QUARTZ_TILE_STAIRS = stairs("brown_quartz_tile_stairs", Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK, DyeColor.BROWN)
    val BROWN_QUARTZ_TILE_SLAB = slab("brown_quartz_tile_slab", Blocks.QUARTZ_BLOCK, DyeColor.BROWN)

    val GREEN_QUARTZ_BLOCK = simple("green_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.GREEN)
    val GREEN_QUARTZ_STAIRS = stairs("green_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.GREEN)
    val GREEN_QUARTZ_SLAB = slab("green_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.GREEN)
    val CHISELED_GREEN_QUARTZ_BLOCK = simple("chiseled_green_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.GREEN)
    val GREEN_QUARTZ_BRICKS = simple("green_quartz_bricks", Blocks.QUARTZ_BLOCK, DyeColor.GREEN)
    val GREEN_QUARTZ_BRICK_STAIRS = stairs("green_quartz_brick_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.GREEN)
    val GREEN_QUARTZ_BRICK_SLAB = slab("green_quartz_brick_slab", Blocks.QUARTZ_BLOCK, DyeColor.GREEN)
    val GREEN_QUARTZ_PILLAR = pillar("green_quartz_pillar", Blocks.QUARTZ_PILLAR, DyeColor.GREEN)
    val SMOOTH_GREEN_QUARTZ = simple("smooth_green_quartz", Blocks.SMOOTH_QUARTZ, DyeColor.GREEN)
    val SMOOTH_GREEN_QUARTZ_STAIRS = stairs("smooth_green_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.GREEN)
    val SMOOTH_GREEN_QUARTZ_SLAB = slab("smooth_green_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.GREEN)
    val GREEN_QUARTZ_TILES = simple("green_quartz_tiles", Blocks.QUARTZ_BLOCK, DyeColor.GREEN)
    val GREEN_QUARTZ_TILE_STAIRS = stairs("green_quartz_tile_stairs", Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK, DyeColor.GREEN)
    val GREEN_QUARTZ_TILE_SLAB = slab("green_quartz_tile_slab", Blocks.QUARTZ_BLOCK, DyeColor.GREEN)

    val RED_QUARTZ_BLOCK = simple("red_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.RED)
    val RED_QUARTZ_STAIRS = stairs("red_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.RED)
    val RED_QUARTZ_SLAB = slab("red_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.RED)
    val CHISELED_RED_QUARTZ_BLOCK = simple("chiseled_red_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.RED)
    val RED_QUARTZ_BRICKS = simple("red_quartz_bricks", Blocks.QUARTZ_BLOCK, DyeColor.RED)
    val RED_QUARTZ_BRICK_STAIRS = stairs("red_quartz_brick_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.RED)
    val RED_QUARTZ_BRICK_SLAB = slab("red_quartz_brick_slab", Blocks.QUARTZ_BLOCK, DyeColor.RED)
    val RED_QUARTZ_PILLAR = pillar("red_quartz_pillar", Blocks.QUARTZ_PILLAR, DyeColor.RED)
    val SMOOTH_RED_QUARTZ = simple("smooth_red_quartz", Blocks.SMOOTH_QUARTZ, DyeColor.RED)
    val SMOOTH_RED_QUARTZ_STAIRS = stairs("smooth_red_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.RED)
    val SMOOTH_RED_QUARTZ_SLAB = slab("smooth_red_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.RED)
    val RED_QUARTZ_TILES = simple("red_quartz_tiles", Blocks.QUARTZ_BLOCK, DyeColor.RED)
    val RED_QUARTZ_TILE_STAIRS = stairs("red_quartz_tile_stairs", Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK, DyeColor.RED)
    val RED_QUARTZ_TILE_SLAB = slab("red_quartz_tile_slab", Blocks.QUARTZ_BLOCK, DyeColor.RED)

    val BLACK_QUARTZ_BLOCK = simple("black_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.BLACK)
    val BLACK_QUARTZ_STAIRS = stairs("black_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.BLACK)
    val BLACK_QUARTZ_SLAB = slab("black_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.BLACK)
    val CHISELED_BLACK_QUARTZ_BLOCK = simple("chiseled_black_quartz_block", Blocks.QUARTZ_BLOCK, DyeColor.BLACK)
    val BLACK_QUARTZ_BRICKS = simple("black_quartz_bricks", Blocks.QUARTZ_BLOCK, DyeColor.BLACK)
    val BLACK_QUARTZ_BRICK_STAIRS = stairs("black_quartz_brick_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.BLACK)
    val BLACK_QUARTZ_BRICK_SLAB = slab("black_quartz_brick_slab", Blocks.QUARTZ_BLOCK, DyeColor.BLACK)
    val BLACK_QUARTZ_PILLAR = pillar("black_quartz_pillar", Blocks.QUARTZ_PILLAR, DyeColor.BLACK)
    val SMOOTH_BLACK_QUARTZ = simple("smooth_black_quartz", Blocks.SMOOTH_QUARTZ, DyeColor.BLACK)
    val SMOOTH_BLACK_QUARTZ_STAIRS = stairs("smooth_black_quartz_stairs", Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BLOCK, DyeColor.BLACK)
    val SMOOTH_BLACK_QUARTZ_SLAB = slab("smooth_black_quartz_slab", Blocks.QUARTZ_BLOCK, DyeColor.BLACK)
    val BLACK_QUARTZ_TILES = simple("black_quartz_tiles", Blocks.QUARTZ_BLOCK, DyeColor.BLACK)
    val BLACK_QUARTZ_TILE_STAIRS = stairs("black_quartz_tile_stairs", Blocks.QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK, DyeColor.BLACK)
    val BLACK_QUARTZ_TILE_SLAB = slab("black_quartz_tile_slab", Blocks.QUARTZ_BLOCK, DyeColor.BLACK)
    // endregion

    //#region All Bricks

    //#region Bricks

    //  large bricks
    val LARGE_BRICKS = simple("large_bricks", Blocks.BRICKS, DyeColor.RED)
    val LARGE_BRICK_STAIRS = stairs("large_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.RED)
    val LARGE_BRICK_SLAB = slab("large_brick_slab", Blocks.BRICKS, DyeColor.RED)
    val LARGE_BRICK_WALL = wall("large_brick_wall", Blocks.BRICK_WALL, DyeColor.RED)

    // small bricks
    val SMALL_BRICKS = simple("small_bricks", Blocks.BRICKS, DyeColor.RED)
    val SMALL_BRICK_STAIRS = stairs("small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.RED)
    val SMALL_BRICK_SLAB = slab("small_brick_slab", Blocks.BRICKS, DyeColor.RED)
    val SMALL_BRICK_WALL = wall("small_brick_wall", Blocks.BRICK_WALL, DyeColor.RED)

    // brick variants
    val CRACKED_BRICKS = simple("cracked_bricks", Blocks.BRICKS)
    val CRACKED_BRICK_STAIRS = stairs("cracked_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.RED)
    val CRACKED_BRICK_SLAB = slab("cracked_brick_slab", Blocks.BRICKS, DyeColor.RED)
    val CRACKED_BRICK_WALL = wall("cracked_brick_wall", Blocks.BRICK_WALL, DyeColor.RED)

    val BASKETWEAVE_BRICKS = simple("basketweave_bricks", Blocks.BRICKS, DyeColor.RED)

    val PINWHEEL_BRICKS = simple("pinwheel_bricks", Blocks.BRICKS, DyeColor.RED)

    val JACK_ON_JACK_BRICKS = simple("jack_on_jack_bricks", Blocks.BRICKS, DyeColor.RED)

    // mixed bricks
    val MIXED_BRICKS = simple("mixed_bricks", Blocks.BRICKS, DyeColor.RED)
    val MIXED_BRICK_STAIRS = stairs("mixed_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.RED)
    val MIXED_BRICK_SLAB = slab("mixed_brick_slab", Blocks.BRICKS, DyeColor.RED)
    val MIXED_BRICK_WALL = wall("mixed_brick_wall", Blocks.BRICK_WALL, DyeColor.RED)

    //  mixed large bricks
    val LARGE_MIXED_BRICKS = simple("large_mixed_bricks", Blocks.BRICKS, DyeColor.RED)
    val LARGE_MIXED_BRICK_STAIRS = stairs("large_mixed_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.RED)
    val LARGE_MIXED_BRICK_SLAB = slab("large_mixed_brick_slab", Blocks.BRICKS, DyeColor.RED)
    val LARGE_MIXED_BRICK_WALL = wall("large_mixed_brick_wall", Blocks.BRICK_WALL, DyeColor.RED)

    //  mixed small bricks
    val SMALL_MIXED_BRICKS = simple("small_mixed_bricks", Blocks.BRICKS, DyeColor.RED)
    val SMALL_MIXED_BRICK_STAIRS = stairs("small_mixed_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.RED)
    val SMALL_MIXED_BRICK_SLAB = slab("small_mixed_brick_slab", Blocks.BRICKS, DyeColor.RED)
    val SMALL_MIXED_BRICK_WALL = wall("small_mixed_brick_wall", Blocks.BRICK_WALL, DyeColor.RED)

    //  shingles
    val SHINGLES = simple("shingles", Blocks.BRICKS)

    val SHINGLE_STAIRS = stairs("shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.RED)
    val SHINGLE_SLAB = slab("shingle_slab", Blocks.BRICKS, DyeColor.RED)
    val SHINGLE_WALL = wall("shingle_wall", Blocks.BRICK_WALL, DyeColor.RED)

    //  mixed shingles
    val MIXED_SHINGLES = simple("mixed_shingles", Blocks.BRICKS)
    val MIXED_SHINGLE_STAIRS = stairs("mixed_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.RED)
    val MIXED_SHINGLE_SLAB = slab("mixed_shingle_slab", Blocks.BRICKS, DyeColor.RED)
    val MIXED_SHINGLE_WALL = wall("mixed_shingle_wall", Blocks.BRICK_WALL, DyeColor.RED)

    val BRICK_CHIMNEY = chimney("brick_chimney", Blocks.BRICKS, DyeColor.RED)
    //#endregion

    //#region Nether Bricks

    //  large nether bricks
    val LARGE_NETHER_BRICKS = simple("large_nether_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val LARGE_NETHER_BRICK_STAIRS = stairs("large_nether_brick_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val LARGE_NETHER_BRICK_SLAB = slab("large_nether_brick_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val LARGE_NETHER_BRICK_WALL = wall("large_nether_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    // small nether bricks
    val SMALL_NETHER_BRICKS = simple("small_nether_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val SMALL_NETHER_BRICK_STAIRS = stairs("nether_small_brick_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val SMALL_NETHER_BRICK_SLAB = slab("nether_small_brick_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val SMALL_NETHER_BRICK_WALL = wall("nether_small_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    // nether brick variants
    val CRACKED_NETHER_BRICK_STAIRS = stairs("cracked_nether_brick_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val CRACKED_NETHER_BRICK_SLAB = slab("cracked_nether_brick_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val CRACKED_NETHER_BRICK_WALL = wall("cracked_nether_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)
    val BASKETWEAVE_NETHER_BRICKS = simple("basketweave_nether_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val PINWHEEL_NETHER_BRICKS = simple("pinwheel_nether_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val JACK_ON_JACK_NETHER_BRICKS = simple("jack_on_jack_nether_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)

    // mixed nether bricks
    val MIXED_NETHER_BRICKS = simple("mixed_nether_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val MIXED_NETHER_BRICK_STAIRS = stairs("mixed_nether_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.RED)
    val MIXED_NETHER_BRICK_SLAB = slab("mixed_nether_brick_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val MIXED_NETHER_BRICK_WALL = wall("mixed_nether_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    //  mixed large nether bricks
    val LARGE_MIXED_NETHER_BRICKS = simple("large_mixed_nether_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val LARGE_MIXED_NETHER_BRICK_STAIRS = stairs("large_mixed_nether_brick_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val LARGE_MIXED_NETHER_BRICK_SLAB = slab("large_mixed_nether_brick_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val LARGE_MIXED_NETHER_BRICK_WALL = wall("large_mixed_nether_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    //  mixed small nether bricks
    val SMALL_MIXED_NETHER_BRICKS = simple("small_mixed_nether_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val SMALL_MIXED_NETHER_BRICK_STAIRS = stairs("mixed_nether_small_brick_stairs", Blocks.BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val SMALL_MIXED_NETHER_BRICK_SLAB = slab("mixed_nether_small_brick_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val SMALL_MIXED_NETHER_BRICK_WALL = wall("mixed_nether_small_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    //  nether shingles
    val NETHER_SHINGLES = simple("nether_shingles", Blocks.NETHER_BRICKS)
    val NETHER_SHINGLE_STAIRS = stairs("nether_shingle_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val NETHER_SHINGLE_SLAB = slab("nether_shingle_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val NETHER_SHINGLE_WALL = wall("nether_shingle_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    //  mixed nether shingles
    val MIXED_NETHER_SHINGLES = simple("mixed_nether_shingles", Blocks.NETHER_BRICKS)
    val MIXED_NETHER_SHINGLE_STAIRS = stairs("mixed_nether_shingle_stairs", Blocks.BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val MIXED_NETHER_SHINGLE_SLAB = slab("mixed_nether_shingle_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val MIXED_NETHER_SHINGLE_WALL = wall("mixed_nether_shingle_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    val NETHER_BRICK_CHIMNEY = chimney("nether_brick_chimney", Blocks.NETHER_BRICKS, DyeColor.RED)
    //#endregion

    //#region Red_Nether Bricks

    //  large red_nether bricks
    val LARGE_RED_NETHER_BRICKS = simple("large_red_nether_bricks", Blocks.RED_NETHER_BRICKS, DyeColor.RED)
    val LARGE_RED_NETHER_BRICK_STAIRS = stairs("large_red_nether_brick_stairs", Blocks.BRICKS, Blocks.RED_NETHER_BRICKS, DyeColor.RED)
    val LARGE_RED_NETHER_BRICK_SLAB = slab("large_red_nether_brick_slab", Blocks.RED_NETHER_BRICKS, DyeColor.RED)
    val LARGE_RED_NETHER_BRICK_WALL = wall("large_red_nether_brick_wall", Blocks.RED_NETHER_BRICK_WALL, DyeColor.RED)

    // small red_nether bricks
    val SMALL_RED_NETHER_BRICKS = simple("small_red_nether_bricks", Blocks.RED_NETHER_BRICKS, DyeColor.RED)
    val SMALL_RED_NETHER_BRICK_STAIRS = stairs("red_nether_small_brick_stairs", Blocks.RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS, DyeColor.RED)
    val SMALL_RED_NETHER_BRICK_SLAB = slab("red_nether_small_brick_slab", Blocks.RED_NETHER_BRICKS, DyeColor.RED)
    val SMALL_RED_NETHER_BRICK_WALL = wall("red_nether_small_brick_wall", Blocks.RED_NETHER_BRICK_WALL, DyeColor.RED)

    // red_nether brick variants
    val CRACKED_RED_NETHER_BRICKS = simple("cracked_red_nether_bricks", Blocks.RED_NETHER_BRICKS)
    val CRACKED_RED_NETHER_BRICK_STAIRS = stairs("cracked_red_nether_brick_stairs", Blocks.RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS, DyeColor.RED)
    val CRACKED_RED_NETHER_BRICK_SLAB = slab("cracked_red_nether_brick_slab", Blocks.RED_NETHER_BRICKS, DyeColor.RED)
    val CRACKED_RED_NETHER_BRICK_WALL = wall("cracked_red_nether_brick_wall", Blocks.RED_NETHER_BRICK_WALL, DyeColor.RED)
    val BASKETWEAVE_RED_NETHER_BRICKS = simple("basketweave_red_nether_bricks", Blocks.RED_NETHER_BRICKS, DyeColor.RED)
    val PINWHEEL_RED_NETHER_BRICKS = simple("pinwheel_red_nether_bricks", Blocks.RED_NETHER_BRICKS, DyeColor.RED)
    val JACK_ON_JACK_RED_NETHER_BRICKS = simple("jack_on_jack_red_nether_bricks", Blocks.RED_NETHER_BRICKS, DyeColor.RED)

    // mixed red_nether bricks
    val MIXED_RED_NETHER_BRICKS = simple("mixed_red_nether_bricks", Blocks.RED_NETHER_BRICKS, DyeColor.RED)
    val MIXED_RED_NETHER_BRICK_STAIRS = stairs("mixed_red_nether_brick_stairs", Blocks.RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS, DyeColor.RED)
    val MIXED_RED_NETHER_BRICK_SLAB = slab("mixed_red_nether_brick_slab", Blocks.RED_NETHER_BRICKS, DyeColor.RED)
    val MIXED_RED_NETHER_BRICK_WALL = wall("mixed_red_nether_brick_wall", Blocks.RED_NETHER_BRICK_WALL, DyeColor.RED)

    //  mixed large red_nether bricks
    val LARGE_MIXED_RED_NETHER_BRICKS = simple("large_mixed_red_nether_bricks", Blocks.RED_NETHER_BRICKS, DyeColor.RED)
    val LARGE_MIXED_RED_NETHER_BRICK_STAIRS = stairs("large_mixed_red_nether_brick_stairs", Blocks.RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS, DyeColor.RED)
    val LARGE_MIXED_RED_NETHER_BRICK_SLAB = slab("large_mixed_red_nether_brick_slab", Blocks.RED_NETHER_BRICKS, DyeColor.RED)
    val LARGE_MIXED_RED_NETHER_BRICK_WALL = wall("large_mixed_red_nether_brick_wall", Blocks.RED_NETHER_BRICK_WALL, DyeColor.RED)

    //  mixed small red_nether bricks
    val SMALL_MIXED_RED_NETHER_BRICKS = simple("small_mixed_red_nether_bricks", Blocks.RED_NETHER_BRICKS, DyeColor.RED)
    val SMALL_MIXED_RED_NETHER_BRICK_STAIRS = stairs("small_mixed_red_nether_brick_stairs", Blocks.RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS, DyeColor.RED)
    val SMALL_MIXED_RED_NETHER_BRICK_SLAB = slab("small_mixed_red_nether_brick_slab", Blocks.RED_NETHER_BRICKS, DyeColor.RED)
    val SMALL_MIXED_RED_NETHER_BRICK_WALL = wall("small_mixed_red_nether_brick_wall", Blocks.RED_NETHER_BRICK_WALL, DyeColor.RED)

    //  red_nether shingles
    val RED_NETHER_SHINGLES = simple("red_nether_shingles", Blocks.RED_NETHER_BRICKS)
    val RED_NETHER_SHINGLE_STAIRS = stairs("red_nether_shingle_stairs", Blocks.RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS, DyeColor.RED)
    val RED_NETHER_SHINGLE_SLAB = slab("red_nether_shingle_slab", Blocks.RED_NETHER_BRICKS, DyeColor.RED)
    val RED_NETHER_SHINGLE_WALL = wall("red_nether_shingle_wall", Blocks.RED_NETHER_BRICK_WALL, DyeColor.RED)

    //  mixed red_nether shingles
    val MIXED_RED_NETHER_SHINGLES = simple("mixed_red_nether_shingles", Blocks.RED_NETHER_BRICKS)
    val MIXED_RED_NETHER_SHINGLE_STAIRS = stairs("mixed_red_nether_shingle_stairs", Blocks.RED_NETHER_BRICKS, Blocks.RED_NETHER_BRICKS, DyeColor.RED)
    val MIXED_RED_NETHER_SHINGLE_SLAB = slab("mixed_red_nether_shingle_slab", Blocks.RED_NETHER_BRICKS, DyeColor.RED)
    val MIXED_RED_NETHER_SHINGLE_WALL = wall("mixed_red_nether_shingle_wall", Blocks.RED_NETHER_BRICK_WALL, DyeColor.RED)

    val RED_NETHER_BRICK_CHIMNEY = chimney("red_nether_brick_chimney", Blocks.RED_NETHER_BRICKS, DyeColor.RED)
    //#endregion

    //#region Mud Bricks
    val MEDIUM_MUD_BRICKS = simple("medium_mud_bricks", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_MUD_BRICK_STAIRS = stairs("medium_mud_brick_stairs", Blocks.MUD_BRICKS, Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_MUD_BRICK_SLAB = slab("medium_mud_brick_slab", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_MUD_BRICK_WALL = wall("medium_mud_brick_wall", Blocks.MUD_BRICK_WALL, DyeColor.BROWN)

    //  large mud bricks
    val LARGE_MUD_BRICKS = simple("large_mud_bricks", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val LARGE_MUD_BRICK_STAIRS = stairs("large_mud_brick_stairs", Blocks.MUD_BRICKS, Blocks.MUD_BRICKS, DyeColor.BROWN)
    val LARGE_MUD_BRICK_SLAB = slab("large_mud_brick_slab", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val LARGE_MUD_BRICK_WALL = wall("large_mud_brick_wall", Blocks.MUD_BRICK_WALL, DyeColor.BROWN)

    // small mud bricks
    val SMALL_MUD_BRICKS = simple("small_mud_bricks", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val SMALL_MUD_BRICK_STAIRS = stairs("small_mud_brick_stairs", Blocks.MUD_BRICKS, Blocks.MUD_BRICKS, DyeColor.BROWN)
    val SMALL_MUD_BRICK_SLAB = slab("small_mud_brick_slab", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val SMALL_MUD_BRICK_WALL = wall("small_mud_brick_wall", Blocks.MUD_BRICK_WALL, DyeColor.BROWN)

    // mud brick variants
    val CRACKED_MEDIUM_MUD_BRICKS = simple("cracked_medium_mud_bricks", Blocks.MUD_BRICKS)
    val CRACKED_MEDIUM_MUD_BRICK_STAIRS = stairs("cracked_medium_mud_brick_stairs", Blocks.MUD_BRICKS, Blocks.MUD_BRICKS, DyeColor.RED)
    val CRACKED_MEDIUM_MUD_BRICK_SLAB = slab("cracked_medium_mud_brick_slab", Blocks.MUD_BRICKS, DyeColor.RED)
    val CRACKED_MEDIUM_MUD_BRICK_WALL = wall("cracked_medium_mud_brick_wall", Blocks.MUD_BRICK_WALL, DyeColor.RED)

    val BASKETWEAVE_MUD_BRICKS = simple("basketweave_mud_bricks", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val PINWHEEL_MUD_BRICKS = simple("pinwheel_mud_bricks", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val JACK_ON_JACK_MUD_BRICKS = simple("jack_on_jack_mud_bricks", Blocks.MUD_BRICKS, DyeColor.BROWN)

    // mixed mud bricks
    val MIXED_MUD_BRICKS = simple("mixed_mud_bricks", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MIXED_MUD_BRICK_STAIRS = stairs("mixed_mud_brick_stairs", Blocks.MUD_BRICKS, Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MIXED_MUD_BRICK_SLAB = slab("mixed_mud_brick_slab", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MIXED_MUD_BRICK_WALL = wall("mixed_mud_brick_wall", Blocks.MUD_BRICK_WALL, DyeColor.BROWN)

    val MEDIUM_MIXED_MUD_BRICKS = simple("medium_mixed_mud_bricks", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_MIXED_MUD_BRICK_STAIRS = stairs("medium_mixed_mud_brick_stairs", Blocks.MUD_BRICKS, Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_MIXED_MUD_BRICK_SLAB = slab("medium_mixed_mud_brick_slab", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_MIXED_MUD_BRICK_WALL = wall("medium_mixed_mud_brick_wall", Blocks.MUD_BRICK_WALL, DyeColor.BROWN)

    //  mixed large mud bricks
    val LARGE_MIXED_MUD_BRICKS = simple("large_mixed_mud_bricks", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val LARGE_MIXED_MUD_BRICK_STAIRS = stairs("large_mixed_mud_brick_stairs", Blocks.MUD_BRICKS, Blocks.MUD_BRICKS, DyeColor.BROWN)
    val LARGE_MIXED_MUD_BRICK_SLAB = slab("large_mixed_mud_brick_slab", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val LARGE_MIXED_MUD_BRICK_WALL = wall("large_mixed_mud_brick_wall", Blocks.MUD_BRICK_WALL, DyeColor.BROWN)

    //  mixed small mud bricks
    val SMALL_MIXED_MUD_BRICKS = simple("small_mixed_mud_bricks", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val SMALL_MIXED_MUD_BRICK_STAIRS = stairs("mixed_small_mud_brick_stairs", Blocks.MUD_BRICKS, Blocks.MUD_BRICKS, DyeColor.BROWN)
    val SMALL_MIXED_MUD_BRICK_SLAB = slab("mixed_small_mud_brick_slab", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val SMALL_MIXED_MUD_BRICK_WALL = wall("mixed_small_mud_brick_wall", Blocks.MUD_BRICK_WALL, DyeColor.BROWN)

    //  mud shingles
    val MUD_SHINGLES = simple("mud_shingles", Blocks.MUD_BRICKS)
    val MUD_SHINGLE_STAIRS = stairs("mud_shingle_stairs", Blocks.MUD_BRICKS, Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MUD_SHINGLE_SLAB = slab("mud_shingle_slab", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MUD_SHINGLE_WALL = wall("mud_shingle_wall", Blocks.MUD_BRICK_WALL, DyeColor.BROWN)

    //  mixed mud shingles
    val MIXED_MUD_SHINGLES = simple("mixed_mud_shingles", Blocks.MUD_BRICKS)
    val MIXED_MUD_SHINGLE_STAIRS = stairs("mixed_mud_shingle_stairs", Blocks.MUD_BRICKS, Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MIXED_MUD_SHINGLE_SLAB = slab("mixed_mud_shingle_slab", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MIXED_MUD_SHINGLE_WALL = wall("mixed_mud_shingle_wall", Blocks.MUD_BRICK_WALL, DyeColor.BROWN)

    val MUD_BRICK_CHIMNEY = chimney("mud_brick_chimney", Blocks.MUD_BRICKS, DyeColor.BROWN)
    //#endregion

    //#region White Bricks
    val WHITE_BRICKS = simple("white_bricks", Blocks.BRICKS, DyeColor.WHITE)
    val WHITE_BRICK_STAIRS = stairs("white_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.WHITE)
    val WHITE_BRICK_SLAB = slab("white_brick_slab", Blocks.BRICKS, DyeColor.WHITE)
    val WHITE_BRICK_WALL = wall("white_brick_wall", Blocks.BRICK_WALL, DyeColor.WHITE)

    //  large white bricks
    val LARGE_WHITE_BRICKS = simple("large_white_bricks", Blocks.BRICKS, DyeColor.WHITE)
    val LARGE_WHITE_BRICK_STAIRS = stairs("large_white_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.WHITE)
    val LARGE_WHITE_BRICK_SLAB = slab("large_white_brick_slab", Blocks.BRICKS, DyeColor.WHITE)
    val LARGE_WHITE_BRICK_WALL = wall("large_white_brick_wall", Blocks.BRICK_WALL, DyeColor.WHITE)

    // small white bricks
    val SMALL_WHITE_BRICKS = simple("small_white_bricks", Blocks.BRICKS, DyeColor.WHITE)
    val SMALL_WHITE_BRICK_STAIRS = stairs("white_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.WHITE)
    val SMALL_WHITE_BRICK_SLAB = slab("white_small_brick_slab", Blocks.BRICKS, DyeColor.WHITE)
    val SMALL_WHITE_BRICK_WALL = wall("white_small_brick_wall", Blocks.BRICK_WALL, DyeColor.WHITE)

    // white brick variants
    val CRACKED_WHITE_BRICKS = simple("cracked_white_bricks", Blocks.BRICKS, DyeColor.WHITE)
    val CRACKED_WHITE_BRICK_STAIRS = stairs("cracked_white_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.RED)
    val CRACKED_WHITE_BRICK_SLAB = slab("cracked_white_brick_slab", Blocks.BRICKS, DyeColor.WHITE)
    val CRACKED_WHITE_BRICK_WALL = wall("cracked_white_brick_wall", Blocks.BRICK_WALL, DyeColor.WHITE)
    val BASKETWEAVE_WHITE_BRICKS = simple("basketweave_white_bricks", Blocks.BRICKS, DyeColor.WHITE)
    val PINWHEEL_WHITE_BRICKS = simple("pinwheel_white_bricks", Blocks.BRICKS, DyeColor.WHITE)
    val JACK_ON_JACK_WHITE_BRICKS = simple("jack_on_jack_white_bricks", Blocks.BRICKS, DyeColor.WHITE)

    // mixed white bricks
    val MIXED_WHITE_BRICKS = simple("mixed_white_bricks", Blocks.BRICKS, DyeColor.WHITE)
    val MIXED_WHITE_BRICK_STAIRS = stairs("mixed_white_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.WHITE)
    val MIXED_WHITE_BRICK_SLAB = slab("mixed_white_brick_slab", Blocks.BRICKS, DyeColor.WHITE)
    val MIXED_WHITE_BRICK_WALL = wall("mixed_white_brick_wall", Blocks.BRICK_WALL, DyeColor.WHITE)

    //  mixed large white bricks
    val LARGE_MIXED_WHITE_BRICKS = simple("large_mixed_white_bricks", Blocks.BRICKS, DyeColor.WHITE)
    val LARGE_MIXED_WHITE_BRICK_STAIRS = stairs("large_mixed_white_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.WHITE)
    val LARGE_MIXED_WHITE_BRICK_SLAB = slab("large_mixed_white_brick_slab", Blocks.BRICKS, DyeColor.WHITE)
    val LARGE_MIXED_WHITE_BRICK_WALL = wall("large_mixed_white_brick_wall", Blocks.BRICK_WALL, DyeColor.WHITE)

    //  mixed small white bricks
    val SMALL_MIXED_WHITE_BRICKS = simple("small_mixed_white_bricks", Blocks.BRICKS, DyeColor.WHITE)
    val SMALL_MIXED_WHITE_BRICK_STAIRS = stairs("mixed_white_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.WHITE)
    val SMALL_MIXED_WHITE_BRICK_SLAB = slab("mixed_white_small_brick_slab", Blocks.BRICKS, DyeColor.WHITE)
    val SMALL_MIXED_WHITE_BRICK_WALL = wall("mixed_white_small_brick_wall", Blocks.BRICK_WALL, DyeColor.WHITE)

    //  white shingles
    val WHITE_SHINGLES = simple("white_shingles", Blocks.BRICKS)
    val WHITE_SHINGLE_STAIRS = stairs("white_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.WHITE)
    val WHITE_SHINGLE_SLAB = slab("white_shingle_slab", Blocks.BRICKS, DyeColor.WHITE)
    val WHITE_SHINGLE_WALL = wall("white_shingle_wall", Blocks.BRICK_WALL, DyeColor.WHITE)

    //  mixed white shingles
    val MIXED_WHITE_SHINGLES = simple("mixed_white_shingles", Blocks.BRICKS)
    val MIXED_WHITE_SHINGLE_STAIRS = stairs("mixed_white_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.WHITE)
    val MIXED_WHITE_SHINGLE_SLAB = slab("mixed_white_shingle_slab", Blocks.BRICKS, DyeColor.WHITE)
    val MIXED_WHITE_SHINGLE_WALL = wall("mixed_white_shingle_wall", Blocks.BRICK_WALL, DyeColor.WHITE)

    val WHITE_BRICK_CHIMNEY = chimney("white_brick_chimney", Blocks.BRICKS, DyeColor.WHITE)
    //#endregion

    //#region Orange Bricks
    val ORANGE_BRICKS = simple("orange_bricks", Blocks.BRICKS, DyeColor.ORANGE)
    val ORANGE_BRICK_STAIRS = stairs("orange_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.ORANGE)
    val ORANGE_BRICK_SLAB = slab("orange_brick_slab", Blocks.BRICKS, DyeColor.ORANGE)
    val ORANGE_BRICK_WALL = wall("orange_brick_wall", Blocks.BRICK_WALL, DyeColor.ORANGE)

    //  large orange bricks
    val LARGE_ORANGE_BRICKS = simple("large_orange_bricks", Blocks.BRICKS, DyeColor.ORANGE)
    val LARGE_ORANGE_BRICK_STAIRS = stairs("large_orange_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.ORANGE)
    val LARGE_ORANGE_BRICK_SLAB = slab("large_orange_brick_slab", Blocks.BRICKS, DyeColor.ORANGE)
    val LARGE_ORANGE_BRICK_WALL = wall("large_orange_brick_wall", Blocks.BRICK_WALL, DyeColor.ORANGE)

    // small orange bricks
    val SMALL_ORANGE_BRICKS = simple("small_orange_bricks", Blocks.BRICKS, DyeColor.ORANGE)
    val SMALL_ORANGE_BRICK_STAIRS = stairs("orange_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.ORANGE)
    val SMALL_ORANGE_BRICK_SLAB = slab("orange_small_brick_slab", Blocks.BRICKS, DyeColor.ORANGE)
    val SMALL_ORANGE_BRICK_WALL = wall("orange_small_brick_wall", Blocks.BRICK_WALL, DyeColor.ORANGE)

    // orange brick variants
    val CRACKED_ORANGE_BRICKS = simple("cracked_orange_bricks", Blocks.BRICKS)
    val CRACKED_ORANGE_BRICK_STAIRS = stairs("cracked_orange_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.ORANGE)
    val CRACKED_ORANGE_BRICK_SLAB = slab("cracked_orange_brick_slab", Blocks.BRICKS, DyeColor.ORANGE)
    val CRACKED_ORANGE_BRICK_WALL = wall("cracked_orange_brick_wall", Blocks.BRICK_WALL, DyeColor.ORANGE)
    val BASKETWEAVE_ORANGE_BRICKS = simple("basketweave_orange_bricks", Blocks.BRICKS, DyeColor.ORANGE)
    val PINWHEEL_ORANGE_BRICKS = simple("pinwheel_orange_bricks", Blocks.BRICKS, DyeColor.ORANGE)
    val JACK_ON_JACK_ORANGE_BRICKS = simple("jack_on_jack_orange_bricks", Blocks.BRICKS, DyeColor.ORANGE)

    // mixed orange bricks
    val MIXED_ORANGE_BRICKS = simple("mixed_orange_bricks", Blocks.BRICKS, DyeColor.ORANGE)
    val MIXED_ORANGE_BRICK_STAIRS = stairs("mixed_orange_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.ORANGE)
    val MIXED_ORANGE_BRICK_SLAB = slab("mixed_orange_brick_slab", Blocks.BRICKS, DyeColor.ORANGE)
    val MIXED_ORANGE_BRICK_WALL = wall("mixed_orange_brick_wall", Blocks.BRICK_WALL, DyeColor.ORANGE)

    //  mixed large orange bricks
    val LARGE_MIXED_ORANGE_BRICKS = simple("large_mixed_orange_bricks", Blocks.BRICKS, DyeColor.ORANGE)
    val LARGE_MIXED_ORANGE_BRICK_STAIRS = stairs("large_mixed_orange_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.ORANGE)
    val LARGE_MIXED_ORANGE_BRICK_SLAB = slab("large_mixed_orange_brick_slab", Blocks.BRICKS, DyeColor.ORANGE)
    val LARGE_MIXED_ORANGE_BRICK_WALL = wall("large_mixed_orange_brick_wall", Blocks.BRICK_WALL, DyeColor.ORANGE)

    //  mixed small orange bricks
    val SMALL_MIXED_ORANGE_BRICKS = simple("small_mixed_orange_bricks", Blocks.BRICKS, DyeColor.ORANGE)
    val SMALL_MIXED_ORANGE_BRICK_STAIRS = stairs("mixed_orange_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.ORANGE)
    val SMALL_MIXED_ORANGE_BRICK_SLAB = slab("mixed_orange_small_brick_slab", Blocks.BRICKS, DyeColor.ORANGE)
    val SMALL_MIXED_ORANGE_BRICK_WALL = wall("mixed_orange_small_brick_wall", Blocks.BRICK_WALL, DyeColor.ORANGE)

    //  orange shingles
    val ORANGE_SHINGLES = simple("orange_shingles", Blocks.BRICKS)
    val ORANGE_SHINGLE_STAIRS = stairs("orange_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.ORANGE)
    val ORANGE_SHINGLE_SLAB = slab("orange_shingle_slab", Blocks.BRICKS, DyeColor.ORANGE)
    val ORANGE_SHINGLE_WALL = wall("orange_shingle_wall", Blocks.BRICK_WALL, DyeColor.ORANGE)

    //  mixed orange shingles
    val MIXED_ORANGE_SHINGLES = simple("mixed_orange_shingles", Blocks.BRICKS)
    val MIXED_ORANGE_SHINGLE_STAIRS = stairs("mixed_orange_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.ORANGE)
    val MIXED_ORANGE_SHINGLE_SLAB = slab("mixed_orange_shingle_slab", Blocks.BRICKS, DyeColor.ORANGE)
    val MIXED_ORANGE_SHINGLE_WALL = wall("mixed_orange_shingle_wall", Blocks.BRICK_WALL, DyeColor.ORANGE)

    val ORANGE_BRICK_CHIMNEY = chimney("orange_brick_chimney", Blocks.BRICKS, DyeColor.ORANGE)
    //#endregion

    //#region Magenta Bricks
    val MAGENTA_BRICKS = simple("magenta_bricks", Blocks.BRICKS, DyeColor.MAGENTA)
    val MAGENTA_BRICK_STAIRS = stairs("magenta_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.MAGENTA)
    val MAGENTA_BRICK_SLAB = slab("magenta_brick_slab", Blocks.BRICKS, DyeColor.MAGENTA)
    val MAGENTA_BRICK_WALL = wall("magenta_brick_wall", Blocks.BRICK_WALL, DyeColor.MAGENTA)

    //  large magenta bricks
    val LARGE_MAGENTA_BRICKS = simple("large_magenta_bricks", Blocks.BRICKS, DyeColor.MAGENTA)
    val LARGE_MAGENTA_BRICK_STAIRS = stairs("large_magenta_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.MAGENTA)
    val LARGE_MAGENTA_BRICK_SLAB = slab("large_magenta_brick_slab", Blocks.BRICKS, DyeColor.MAGENTA)
    val LARGE_MAGENTA_BRICK_WALL = wall("large_magenta_brick_wall", Blocks.BRICK_WALL, DyeColor.MAGENTA)

    // small magenta bricks
    val SMALL_MAGENTA_BRICKS = simple("small_magenta_bricks", Blocks.BRICKS, DyeColor.MAGENTA)
    val SMALL_MAGENTA_BRICK_STAIRS = stairs("magenta_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.MAGENTA)
    val SMALL_MAGENTA_BRICK_SLAB = slab("magenta_small_brick_slab", Blocks.BRICKS, DyeColor.MAGENTA)
    val SMALL_MAGENTA_BRICK_WALL = wall("magenta_small_brick_wall", Blocks.BRICK_WALL, DyeColor.MAGENTA)

    // magenta brick variants
    val CRACKED_MAGENTA_BRICKS = simple("cracked_magenta_bricks", Blocks.BRICKS)
    val CRACKED_MAGENTA_BRICK_STAIRS = stairs("cracked_magenta_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.MAGENTA)
    val CRACKED_MAGENTA_BRICK_SLAB = slab("cracked_magenta_brick_slab", Blocks.BRICKS, DyeColor.MAGENTA)
    val CRACKED_MAGENTA_BRICK_WALL = wall("cracked_magenta_brick_wall", Blocks.BRICK_WALL, DyeColor.MAGENTA)
    val BASKETWEAVE_MAGENTA_BRICKS = simple("basketweave_magenta_bricks", Blocks.BRICKS, DyeColor.MAGENTA)
    val PINWHEEL_MAGENTA_BRICKS = simple("pinwheel_magenta_bricks", Blocks.BRICKS, DyeColor.MAGENTA)
    val JACK_ON_JACK_MAGENTA_BRICKS = simple("jack_on_jack_magenta_bricks", Blocks.BRICKS, DyeColor.MAGENTA)

    // mixed magenta bricks
    val MIXED_MAGENTA_BRICKS = simple("mixed_magenta_bricks", Blocks.BRICKS, DyeColor.MAGENTA)
    val MIXED_MAGENTA_BRICK_STAIRS = stairs("mixed_magenta_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.MAGENTA)
    val MIXED_MAGENTA_BRICK_SLAB = slab("mixed_magenta_brick_slab", Blocks.BRICKS, DyeColor.MAGENTA)
    val MIXED_MAGENTA_BRICK_WALL = wall("mixed_magenta_brick_wall", Blocks.BRICK_WALL, DyeColor.MAGENTA)

    //  mixed large magenta bricks
    val LARGE_MIXED_MAGENTA_BRICKS = simple("large_mixed_magenta_bricks", Blocks.BRICKS, DyeColor.MAGENTA)
    val LARGE_MIXED_MAGENTA_BRICK_STAIRS = stairs("large_mixed_magenta_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.MAGENTA)
    val LARGE_MIXED_MAGENTA_BRICK_SLAB = slab("large_mixed_magenta_brick_slab", Blocks.BRICKS, DyeColor.MAGENTA)
    val LARGE_MIXED_MAGENTA_BRICK_WALL = wall("large_mixed_magenta_brick_wall", Blocks.BRICK_WALL, DyeColor.MAGENTA)

    //  mixed small magenta bricks
    val SMALL_MIXED_MAGENTA_BRICKS = simple("small_mixed_magenta_bricks", Blocks.BRICKS, DyeColor.MAGENTA)
    val SMALL_MIXED_MAGENTA_BRICK_STAIRS = stairs("mixed_magenta_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.MAGENTA)
    val SMALL_MIXED_MAGENTA_BRICK_SLAB = slab("mixed_magenta_small_brick_slab", Blocks.BRICKS, DyeColor.MAGENTA)
    val SMALL_MIXED_MAGENTA_BRICK_WALL = wall("mixed_magenta_small_brick_wall", Blocks.BRICK_WALL, DyeColor.MAGENTA)

    //  magenta shingles
    val MAGENTA_SHINGLES = simple("magenta_shingles", Blocks.BRICKS)
    val MAGENTA_SHINGLE_STAIRS = stairs("magenta_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.MAGENTA)
    val MAGENTA_SHINGLE_SLAB = slab("magenta_shingle_slab", Blocks.BRICKS, DyeColor.MAGENTA)
    val MAGENTA_SHINGLE_WALL = wall("magenta_shingle_wall", Blocks.BRICK_WALL, DyeColor.MAGENTA)

    //  mixed magenta shingles
    val MIXED_MAGENTA_SHINGLES = simple("mixed_magenta_shingles", Blocks.BRICKS)
    val MIXED_MAGENTA_SHINGLE_STAIRS = stairs("mixed_magenta_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.MAGENTA)
    val MIXED_MAGENTA_SHINGLE_SLAB = slab("mixed_magenta_shingle_slab", Blocks.BRICKS, DyeColor.MAGENTA)
    val MIXED_MAGENTA_SHINGLE_WALL = wall("mixed_magenta_shingle_wall", Blocks.BRICK_WALL, DyeColor.MAGENTA)

    val MAGENTA_BRICK_CHIMNEY = chimney("magenta_brick_chimney", Blocks.BRICKS, DyeColor.MAGENTA)
    //#endregion

    //#region Light Blue Bricks
    val LIGHT_BLUE_BRICKS = simple("light_blue_bricks", Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val LIGHT_BLUE_BRICK_STAIRS = stairs("light_blue_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val LIGHT_BLUE_BRICK_SLAB = slab("light_blue_brick_slab", Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val LIGHT_BLUE_BRICK_WALL = wall("light_blue_brick_wall", Blocks.BRICK_WALL, DyeColor.LIGHT_BLUE)

    //  large light_blue bricks
    val LARGE_LIGHT_BLUE_BRICKS = simple("large_light_blue_bricks", Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val LARGE_LIGHT_BLUE_BRICK_STAIRS = stairs("large_light_blue_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val LARGE_LIGHT_BLUE_BRICK_SLAB = slab("large_light_blue_brick_slab", Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val LARGE_LIGHT_BLUE_BRICK_WALL = wall("large_light_blue_brick_wall", Blocks.BRICK_WALL, DyeColor.LIGHT_BLUE)

    // small light_blue bricks
    val SMALL_LIGHT_BLUE_BRICKS = simple("small_light_blue_bricks", Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val SMALL_LIGHT_BLUE_BRICK_STAIRS = stairs("light_blue_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val SMALL_LIGHT_BLUE_BRICK_SLAB = slab("light_blue_small_brick_slab", Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val SMALL_LIGHT_BLUE_BRICK_WALL = wall("light_blue_small_brick_wall", Blocks.BRICK_WALL, DyeColor.LIGHT_BLUE)

    // light_blue brick variants
    val CRACKED_LIGHT_BLUE_BRICKS = simple("cracked_light_blue_bricks", Blocks.BRICKS)
    val CRACKED_LIGHT_BLUE_BRICK_STAIRS = stairs("cracked_light_blue_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val CRACKED_LIGHT_BLUE_BRICK_SLAB = slab("cracked_light_blue_brick_slab", Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val CRACKED_LIGHT_BLUE_BRICK_WALL = wall("cracked_light_blue_brick_wall", Blocks.BRICK_WALL, DyeColor.LIGHT_BLUE)
    val BASKETWEAVE_LIGHT_BLUE_BRICKS = simple("basketweave_light_blue_bricks", Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val PINWHEEL_LIGHT_BLUE_BRICKS = simple("pinwheel_light_blue_bricks", Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val JACK_ON_JACK_LIGHT_BLUE_BRICKS = simple("jack_on_jack_light_blue_bricks", Blocks.BRICKS, DyeColor.LIGHT_BLUE)

    // mixed light_blue bricks
    val MIXED_LIGHT_BLUE_BRICKS = simple("mixed_light_blue_bricks", Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val MIXED_LIGHT_BLUE_BRICK_STAIRS = stairs("mixed_light_blue_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val MIXED_LIGHT_BLUE_BRICK_SLAB = slab("mixed_light_blue_brick_slab", Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val MIXED_LIGHT_BLUE_BRICK_WALL = wall("mixed_light_blue_brick_wall", Blocks.BRICK_WALL, DyeColor.LIGHT_BLUE)

    //  mixed large light_blue bricks
    val LARGE_MIXED_LIGHT_BLUE_BRICKS = simple("large_mixed_light_blue_bricks", Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val LARGE_MIXED_LIGHT_BLUE_BRICK_STAIRS = stairs("large_mixed_light_blue_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val LARGE_MIXED_LIGHT_BLUE_BRICK_SLAB = slab("large_mixed_light_blue_brick_slab", Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val LARGE_MIXED_LIGHT_BLUE_BRICK_WALL = wall("large_mixed_light_blue_brick_wall", Blocks.BRICK_WALL, DyeColor.LIGHT_BLUE)

    //  mixed small light_blue bricks
    val SMALL_MIXED_LIGHT_BLUE_BRICKS = simple("small_mixed_light_blue_bricks", Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val SMALL_MIXED_LIGHT_BLUE_BRICK_STAIRS = stairs("mixed_light_blue_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val SMALL_MIXED_LIGHT_BLUE_BRICK_SLAB = slab("mixed_light_blue_small_brick_slab", Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val SMALL_MIXED_LIGHT_BLUE_BRICK_WALL = wall("mixed_light_blue_small_brick_wall", Blocks.BRICK_WALL, DyeColor.LIGHT_BLUE)

    //  light_blue shingles
    val LIGHT_BLUE_SHINGLES = simple("light_blue_shingles", Blocks.BRICKS)
    val LIGHT_BLUE_SHINGLE_STAIRS = stairs("light_blue_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val LIGHT_BLUE_SHINGLE_SLAB = slab("light_blue_shingle_slab", Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val LIGHT_BLUE_SHINGLE_WALL = wall("light_blue_shingle_wall", Blocks.BRICK_WALL, DyeColor.LIGHT_BLUE)

    //  mixed light_blue shingles
    val MIXED_LIGHT_BLUE_SHINGLES = simple("mixed_light_blue_shingles", Blocks.BRICKS)
    val MIXED_LIGHT_BLUE_SHINGLE_STAIRS = stairs("mixed_light_blue_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val MIXED_LIGHT_BLUE_SHINGLE_SLAB = slab("mixed_light_blue_shingle_slab", Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val MIXED_LIGHT_BLUE_SHINGLE_WALL = wall("mixed_light_blue_shingle_wall", Blocks.BRICK_WALL, DyeColor.LIGHT_BLUE)

    val LIGHT_BLUE_BRICK_CHIMNEY = chimney("light_blue_brick_chimney", Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    //#endregion

    //#region Yellow Bricks
    val YELLOW_BRICKS = simple("yellow_bricks", Blocks.BRICKS, DyeColor.YELLOW)
    val YELLOW_BRICK_STAIRS = stairs("yellow_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.YELLOW)
    val YELLOW_BRICK_SLAB = slab("yellow_brick_slab", Blocks.BRICKS, DyeColor.YELLOW)
    val YELLOW_BRICK_WALL = wall("yellow_brick_wall", Blocks.BRICK_WALL, DyeColor.YELLOW)

    //  large yellow bricks
    val LARGE_YELLOW_BRICKS = simple("large_yellow_bricks", Blocks.BRICKS, DyeColor.YELLOW)
    val LARGE_YELLOW_BRICK_STAIRS = stairs("large_yellow_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.YELLOW)
    val LARGE_YELLOW_BRICK_SLAB = slab("large_yellow_brick_slab", Blocks.BRICKS, DyeColor.YELLOW)
    val LARGE_YELLOW_BRICK_WALL = wall("large_yellow_brick_wall", Blocks.BRICK_WALL, DyeColor.YELLOW)

    // small yellow bricks
    val SMALL_YELLOW_BRICKS = simple("small_yellow_bricks", Blocks.BRICKS, DyeColor.YELLOW)
    val SMALL_YELLOW_BRICK_STAIRS = stairs("yellow_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.YELLOW)
    val SMALL_YELLOW_BRICK_SLAB = slab("yellow_small_brick_slab", Blocks.BRICKS, DyeColor.YELLOW)
    val SMALL_YELLOW_BRICK_WALL = wall("yellow_small_brick_wall", Blocks.BRICK_WALL, DyeColor.YELLOW)

    // yellow brick variants
    val CRACKED_YELLOW_BRICKS = simple("cracked_yellow_bricks", Blocks.BRICKS)
    val CRACKED_YELLOW_BRICK_STAIRS = stairs("cracked_yellow_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.YELLOW)
    val CRACKED_YELLOW_BRICK_SLAB = slab("cracked_yellow_brick_slab", Blocks.BRICKS, DyeColor.YELLOW)
    val CRACKED_YELLOW_BRICK_WALL = wall("cracked_yellow_brick_wall", Blocks.BRICK_WALL, DyeColor.YELLOW)
    val BASKETWEAVE_YELLOW_BRICKS = simple("basketweave_yellow_bricks", Blocks.BRICKS, DyeColor.YELLOW)
    val PINWHEEL_YELLOW_BRICKS = simple("pinwheel_yellow_bricks", Blocks.BRICKS, DyeColor.YELLOW)
    val JACK_ON_JACK_YELLOW_BRICKS = simple("jack_on_jack_yellow_bricks", Blocks.BRICKS, DyeColor.YELLOW)

    // mixed yellow bricks
    val MIXED_YELLOW_BRICKS = simple("mixed_yellow_bricks", Blocks.BRICKS, DyeColor.YELLOW)
    val MIXED_YELLOW_BRICK_STAIRS = stairs("mixed_yellow_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.YELLOW)
    val MIXED_YELLOW_BRICK_SLAB = slab("mixed_yellow_brick_slab", Blocks.BRICKS, DyeColor.YELLOW)
    val MIXED_YELLOW_BRICK_WALL = wall("mixed_yellow_brick_wall", Blocks.BRICK_WALL, DyeColor.YELLOW)

    //  mixed large yellow bricks
    val LARGE_MIXED_YELLOW_BRICKS = simple("large_mixed_yellow_bricks", Blocks.BRICKS, DyeColor.YELLOW)
    val LARGE_MIXED_YELLOW_BRICK_STAIRS = stairs("large_mixed_yellow_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.YELLOW)
    val LARGE_MIXED_YELLOW_BRICK_SLAB = slab("large_mixed_yellow_brick_slab", Blocks.BRICKS, DyeColor.YELLOW)
    val LARGE_MIXED_YELLOW_BRICK_WALL = wall("large_mixed_yellow_brick_wall", Blocks.BRICK_WALL, DyeColor.YELLOW)

    //  mixed small yellow bricks
    val SMALL_MIXED_YELLOW_BRICKS = simple("small_mixed_yellow_bricks", Blocks.BRICKS, DyeColor.YELLOW)
    val SMALL_MIXED_YELLOW_BRICK_STAIRS = stairs("mixed_yellow_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.YELLOW)
    val SMALL_MIXED_YELLOW_BRICK_SLAB = slab("mixed_yellow_small_brick_slab", Blocks.BRICKS, DyeColor.YELLOW)
    val SMALL_MIXED_YELLOW_BRICK_WALL = wall("mixed_yellow_small_brick_wall", Blocks.BRICK_WALL, DyeColor.YELLOW)

    //  yellow shingles
    val YELLOW_SHINGLES = simple("yellow_shingles", Blocks.BRICKS)
    val YELLOW_SHINGLE_STAIRS = stairs("yellow_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.YELLOW)
    val YELLOW_SHINGLE_SLAB = slab("yellow_shingle_slab", Blocks.BRICKS, DyeColor.YELLOW)
    val YELLOW_SHINGLE_WALL = wall("yellow_shingle_wall", Blocks.BRICK_WALL, DyeColor.YELLOW)

    //  mixed yellow shingles
    val MIXED_YELLOW_SHINGLES = simple("mixed_yellow_shingles", Blocks.BRICKS)
    val MIXED_YELLOW_SHINGLE_STAIRS = stairs("mixed_yellow_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.YELLOW)
    val MIXED_YELLOW_SHINGLE_SLAB = slab("mixed_yellow_shingle_slab", Blocks.BRICKS, DyeColor.YELLOW)
    val MIXED_YELLOW_SHINGLE_WALL = wall("mixed_yellow_shingle_wall", Blocks.BRICK_WALL, DyeColor.YELLOW)

    val YELLOW_BRICK_CHIMNEY = chimney("yellow_brick_chimney", Blocks.BRICKS, DyeColor.YELLOW)
    //#endregion

    //#region Lime Bricks
    val LIME_BRICKS = simple("lime_bricks", Blocks.BRICKS, DyeColor.LIME)
    val LIME_BRICK_STAIRS = stairs("lime_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIME)
    val LIME_BRICK_SLAB = slab("lime_brick_slab", Blocks.BRICKS, DyeColor.LIME)
    val LIME_BRICK_WALL = wall("lime_brick_wall", Blocks.BRICK_WALL, DyeColor.LIME)

    //  large lime bricks
    val LARGE_LIME_BRICKS = simple("large_lime_bricks", Blocks.BRICKS, DyeColor.LIME)
    val LARGE_LIME_BRICK_STAIRS = stairs("large_lime_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIME)
    val LARGE_LIME_BRICK_SLAB = slab("large_lime_brick_slab", Blocks.BRICKS, DyeColor.LIME)
    val LARGE_LIME_BRICK_WALL = wall("large_lime_brick_wall", Blocks.BRICK_WALL, DyeColor.LIME)

    // small lime bricks
    val SMALL_LIME_BRICKS = simple("small_lime_bricks", Blocks.BRICKS, DyeColor.LIME)
    val SMALL_LIME_BRICK_STAIRS = stairs("lime_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIME)
    val SMALL_LIME_BRICK_SLAB = slab("lime_small_brick_slab", Blocks.BRICKS, DyeColor.LIME)
    val SMALL_LIME_BRICK_WALL = wall("lime_small_brick_wall", Blocks.BRICK_WALL, DyeColor.LIME)

    // lime brick variants
    val CRACKED_LIME_BRICKS = simple("cracked_lime_bricks", Blocks.BRICKS)
    val CRACKED_LIME_BRICK_STAIRS = stairs("cracked_lime_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIME)
    val CRACKED_LIME_BRICK_SLAB = slab("cracked_lime_brick_slab", Blocks.BRICKS, DyeColor.LIME)
    val CRACKED_LIME_BRICK_WALL = wall("cracked_lime_brick_wall", Blocks.BRICK_WALL, DyeColor.LIME)
    val BASKETWEAVE_LIME_BRICKS = simple("basketweave_lime_bricks", Blocks.BRICKS, DyeColor.LIME)
    val PINWHEEL_LIME_BRICKS = simple("pinwheel_lime_bricks", Blocks.BRICKS, DyeColor.LIME)
    val JACK_ON_JACK_LIME_BRICKS = simple("jack_on_jack_lime_bricks", Blocks.BRICKS, DyeColor.LIME)

    // mixed lime bricks
    val MIXED_LIME_BRICKS = simple("mixed_lime_bricks", Blocks.BRICKS, DyeColor.LIME)
    val MIXED_LIME_BRICK_STAIRS = stairs("mixed_lime_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIME)
    val MIXED_LIME_BRICK_SLAB = slab("mixed_lime_brick_slab", Blocks.BRICKS, DyeColor.LIME)
    val MIXED_LIME_BRICK_WALL = wall("mixed_lime_brick_wall", Blocks.BRICK_WALL, DyeColor.LIME)

    //  mixed large lime bricks
    val LARGE_MIXED_LIME_BRICKS = simple("large_mixed_lime_bricks", Blocks.BRICKS, DyeColor.LIME)
    val LARGE_MIXED_LIME_BRICK_STAIRS = stairs("large_mixed_lime_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIME)
    val LARGE_MIXED_LIME_BRICK_SLAB = slab("large_mixed_lime_brick_slab", Blocks.BRICKS, DyeColor.LIME)
    val LARGE_MIXED_LIME_BRICK_WALL = wall("large_mixed_lime_brick_wall", Blocks.BRICK_WALL, DyeColor.LIME)

    //  mixed small lime bricks
    val SMALL_MIXED_LIME_BRICKS = simple("small_mixed_lime_bricks", Blocks.BRICKS, DyeColor.LIME)
    val SMALL_MIXED_LIME_BRICK_STAIRS = stairs("mixed_lime_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIME)
    val SMALL_MIXED_LIME_BRICK_SLAB = slab("mixed_lime_small_brick_slab", Blocks.BRICKS, DyeColor.LIME)
    val SMALL_MIXED_LIME_BRICK_WALL = wall("mixed_lime_small_brick_wall", Blocks.BRICK_WALL, DyeColor.LIME)

    //  lime shingles
    val LIME_SHINGLES = simple("lime_shingles", Blocks.BRICKS)
    val LIME_SHINGLE_STAIRS = stairs("lime_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIME)
    val LIME_SHINGLE_SLAB = slab("lime_shingle_slab", Blocks.BRICKS, DyeColor.LIME)
    val LIME_SHINGLE_WALL = wall("lime_shingle_wall", Blocks.BRICK_WALL, DyeColor.LIME)

    //  mixed lime shingles
    val MIXED_LIME_SHINGLES = simple("mixed_lime_shingles", Blocks.BRICKS)
    val MIXED_LIME_SHINGLE_STAIRS = stairs("mixed_lime_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIME)
    val MIXED_LIME_SHINGLE_SLAB = slab("mixed_lime_shingle_slab", Blocks.BRICKS, DyeColor.LIME)
    val MIXED_LIME_SHINGLE_WALL = wall("mixed_lime_shingle_wall", Blocks.BRICK_WALL, DyeColor.LIME)

    val LIME_BRICK_CHIMNEY = chimney("lime_brick_chimney", Blocks.BRICKS, DyeColor.LIME)
    //#endregion

    //#region Pink Bricks
    val PINK_BRICKS = simple("pink_bricks", Blocks.BRICKS, DyeColor.PINK)
    val PINK_BRICK_STAIRS = stairs("pink_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.PINK)
    val PINK_BRICK_SLAB = slab("pink_brick_slab", Blocks.BRICKS, DyeColor.PINK)
    val PINK_BRICK_WALL = wall("pink_brick_wall", Blocks.BRICK_WALL, DyeColor.PINK)

    //  large pink bricks
    val LARGE_PINK_BRICKS = simple("large_pink_bricks", Blocks.BRICKS, DyeColor.PINK)
    val LARGE_PINK_BRICK_STAIRS = stairs("large_pink_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.PINK)
    val LARGE_PINK_BRICK_SLAB = slab("large_pink_brick_slab", Blocks.BRICKS, DyeColor.PINK)
    val LARGE_PINK_BRICK_WALL = wall("large_pink_brick_wall", Blocks.BRICK_WALL, DyeColor.PINK)

    // small pink bricks
    val SMALL_PINK_BRICKS = simple("small_pink_bricks", Blocks.BRICKS, DyeColor.PINK)
    val SMALL_PINK_BRICK_STAIRS = stairs("pink_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.PINK)
    val SMALL_PINK_BRICK_SLAB = slab("pink_small_brick_slab", Blocks.BRICKS, DyeColor.PINK)
    val SMALL_PINK_BRICK_WALL = wall("pink_small_brick_wall", Blocks.BRICK_WALL, DyeColor.PINK)

    // pink brick variants
    val CRACKED_PINK_BRICKS = simple("cracked_pink_bricks", Blocks.BRICKS)
    val CRACKED_PINK_BRICK_STAIRS = stairs("cracked_pink_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.PINK)
    val CRACKED_PINK_BRICK_SLAB = slab("cracked_pink_brick_slab", Blocks.BRICKS, DyeColor.PINK)
    val CRACKED_PINK_BRICK_WALL = wall("cracked_pink_brick_wall", Blocks.BRICK_WALL, DyeColor.PINK)
    val BASKETWEAVE_PINK_BRICKS = simple("basketweave_pink_bricks", Blocks.BRICKS, DyeColor.PINK)
    val PINWHEEL_PINK_BRICKS = simple("pinwheel_pink_bricks", Blocks.BRICKS, DyeColor.PINK)
    val JACK_ON_JACK_PINK_BRICKS = simple("jack_on_jack_pink_bricks", Blocks.BRICKS, DyeColor.PINK)

    // mixed pink bricks
    val MIXED_PINK_BRICKS = simple("mixed_pink_bricks", Blocks.BRICKS, DyeColor.PINK)
    val MIXED_PINK_BRICK_STAIRS = stairs("mixed_pink_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.PINK)
    val MIXED_PINK_BRICK_SLAB = slab("mixed_pink_brick_slab", Blocks.BRICKS, DyeColor.PINK)
    val MIXED_PINK_BRICK_WALL = wall("mixed_pink_brick_wall", Blocks.BRICK_WALL, DyeColor.PINK)

    //  mixed large pink bricks
    val LARGE_MIXED_PINK_BRICKS = simple("large_mixed_pink_bricks", Blocks.BRICKS, DyeColor.PINK)
    val LARGE_MIXED_PINK_BRICK_STAIRS = stairs("large_mixed_pink_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.PINK)
    val LARGE_MIXED_PINK_BRICK_SLAB = slab("large_mixed_pink_brick_slab", Blocks.BRICKS, DyeColor.PINK)
    val LARGE_MIXED_PINK_BRICK_WALL = wall("large_mixed_pink_brick_wall", Blocks.BRICK_WALL, DyeColor.PINK)

    //  mixed small pink bricks
    val SMALL_MIXED_PINK_BRICKS = simple("small_mixed_pink_bricks", Blocks.BRICKS, DyeColor.PINK)
    val SMALL_MIXED_PINK_BRICK_STAIRS = stairs("mixed_pink_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.PINK)
    val SMALL_MIXED_PINK_BRICK_SLAB = slab("mixed_pink_small_brick_slab", Blocks.BRICKS, DyeColor.PINK)
    val SMALL_MIXED_PINK_BRICK_WALL = wall("mixed_pink_small_brick_wall", Blocks.BRICK_WALL, DyeColor.PINK)

    //  pink shingles
    val PINK_SHINGLES = simple("pink_shingles", Blocks.BRICKS)
    val PINK_SHINGLE_STAIRS = stairs("pink_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.PINK)
    val PINK_SHINGLE_SLAB = slab("pink_shingle_slab", Blocks.BRICKS, DyeColor.PINK)
    val PINK_SHINGLE_WALL = wall("pink_shingle_wall", Blocks.BRICK_WALL, DyeColor.PINK)

    //  mixed pink shingles
    val MIXED_PINK_SHINGLES = simple("mixed_pink_shingles", Blocks.BRICKS)
    val MIXED_PINK_SHINGLE_STAIRS = stairs("mixed_pink_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.PINK)
    val MIXED_PINK_SHINGLE_SLAB = slab("mixed_pink_shingle_slab", Blocks.BRICKS, DyeColor.PINK)
    val MIXED_PINK_SHINGLE_WALL = wall("mixed_pink_shingle_wall", Blocks.BRICK_WALL, DyeColor.PINK)

    val PINK_BRICK_CHIMNEY = chimney("pink_brick_chimney", Blocks.BRICKS, DyeColor.PINK)
    //#endregion

    //#region Gray Bricks
    val GRAY_BRICKS = simple("gray_bricks", Blocks.BRICKS, DyeColor.GRAY)
    val GRAY_BRICK_STAIRS = stairs("gray_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.GRAY)
    val GRAY_BRICK_SLAB = slab("gray_brick_slab", Blocks.BRICKS, DyeColor.GRAY)
    val GRAY_BRICK_WALL = wall("gray_brick_wall", Blocks.BRICK_WALL, DyeColor.GRAY)

    //  large gray bricks
    val LARGE_GRAY_BRICKS = simple("large_gray_bricks", Blocks.BRICKS, DyeColor.GRAY)
    val LARGE_GRAY_BRICK_STAIRS = stairs("large_gray_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.GRAY)
    val LARGE_GRAY_BRICK_SLAB = slab("large_gray_brick_slab", Blocks.BRICKS, DyeColor.GRAY)
    val LARGE_GRAY_BRICK_WALL = wall("large_gray_brick_wall", Blocks.BRICK_WALL, DyeColor.GRAY)

    // small gray bricks
    val SMALL_GRAY_BRICKS = simple("small_gray_bricks", Blocks.BRICKS, DyeColor.GRAY)
    val SMALL_GRAY_BRICK_STAIRS = stairs("gray_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.GRAY)
    val SMALL_GRAY_BRICK_SLAB = slab("gray_small_brick_slab", Blocks.BRICKS, DyeColor.GRAY)
    val SMALL_GRAY_BRICK_WALL = wall("gray_small_brick_wall", Blocks.BRICK_WALL, DyeColor.GRAY)

    // gray brick variants
    val CRACKED_GRAY_BRICKS = simple("cracked_gray_bricks", Blocks.BRICKS)
    val CRACKED_GRAY_BRICK_STAIRS = stairs("cracked_gray_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.GRAY)
    val CRACKED_GRAY_BRICK_SLAB = slab("cracked_gray_brick_slab", Blocks.BRICKS, DyeColor.GRAY)
    val CRACKED_GRAY_BRICK_WALL = wall("cracked_gray_brick_wall", Blocks.BRICK_WALL, DyeColor.GRAY)
    val BASKETWEAVE_GRAY_BRICKS = simple("basketweave_gray_bricks", Blocks.BRICKS, DyeColor.GRAY)
    val PINWHEEL_GRAY_BRICKS = simple("pinwheel_gray_bricks", Blocks.BRICKS, DyeColor.GRAY)
    val JACK_ON_JACK_GRAY_BRICKS = simple("jack_on_jack_gray_bricks", Blocks.BRICKS, DyeColor.GRAY)

    // mixed gray bricks
    val MIXED_GRAY_BRICKS = simple("mixed_gray_bricks", Blocks.BRICKS, DyeColor.GRAY)
    val MIXED_GRAY_BRICK_STAIRS = stairs("mixed_gray_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.GRAY)
    val MIXED_GRAY_BRICK_SLAB = slab("mixed_gray_brick_slab", Blocks.BRICKS, DyeColor.GRAY)
    val MIXED_GRAY_BRICK_WALL = wall("mixed_gray_brick_wall", Blocks.BRICK_WALL, DyeColor.GRAY)

    //  mixed large gray bricks
    val LARGE_MIXED_GRAY_BRICKS = simple("large_mixed_gray_bricks", Blocks.BRICKS, DyeColor.GRAY)
    val LARGE_MIXED_GRAY_BRICK_STAIRS = stairs("large_mixed_gray_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.GRAY)
    val LARGE_MIXED_GRAY_BRICK_SLAB = slab("large_mixed_gray_brick_slab", Blocks.BRICKS, DyeColor.GRAY)
    val LARGE_MIXED_GRAY_BRICK_WALL = wall("large_mixed_gray_brick_wall", Blocks.BRICK_WALL, DyeColor.GRAY)

    //  mixed small gray bricks
    val SMALL_MIXED_GRAY_BRICKS = simple("small_mixed_gray_bricks", Blocks.BRICKS, DyeColor.GRAY)
    val SMALL_MIXED_GRAY_BRICK_STAIRS = stairs("mixed_gray_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.GRAY)
    val SMALL_MIXED_GRAY_BRICK_SLAB = slab("mixed_gray_small_brick_slab", Blocks.BRICKS, DyeColor.GRAY)
    val SMALL_MIXED_GRAY_BRICK_WALL = wall("mixed_gray_small_brick_wall", Blocks.BRICK_WALL, DyeColor.GRAY)

    //  gray shingles
    val GRAY_SHINGLES = simple("gray_shingles", Blocks.BRICKS)
    val GRAY_SHINGLE_STAIRS = stairs("gray_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.GRAY)
    val GRAY_SHINGLE_SLAB = slab("gray_shingle_slab", Blocks.BRICKS, DyeColor.GRAY)
    val GRAY_SHINGLE_WALL = wall("gray_shingle_wall", Blocks.BRICK_WALL, DyeColor.GRAY)

    //  mixed gray shingles
    val MIXED_GRAY_SHINGLES = simple("mixed_gray_shingles", Blocks.BRICKS)
    val MIXED_GRAY_SHINGLE_STAIRS = stairs("mixed_gray_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.GRAY)
    val MIXED_GRAY_SHINGLE_SLAB = slab("mixed_gray_shingle_slab", Blocks.BRICKS, DyeColor.GRAY)
    val MIXED_GRAY_SHINGLE_WALL = wall("mixed_gray_shingle_wall", Blocks.BRICK_WALL, DyeColor.GRAY)

    val GRAY_BRICK_CHIMNEY = chimney("gray_brick_chimney", Blocks.BRICKS, DyeColor.GRAY)
    //#endregion

    //#region Light Gray Bricks
    val LIGHT_GRAY_BRICKS = simple("light_gray_bricks", Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val LIGHT_GRAY_BRICK_STAIRS = stairs("light_gray_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val LIGHT_GRAY_BRICK_SLAB = slab("light_gray_brick_slab", Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val LIGHT_GRAY_BRICK_WALL = wall("light_gray_brick_wall", Blocks.BRICK_WALL, DyeColor.LIGHT_GRAY)

    //  large light_gray bricks
    val LARGE_LIGHT_GRAY_BRICKS = simple("large_light_gray_bricks", Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val LARGE_LIGHT_GRAY_BRICK_STAIRS = stairs("large_light_gray_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val LARGE_LIGHT_GRAY_BRICK_SLAB = slab("large_light_gray_brick_slab", Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val LARGE_LIGHT_GRAY_BRICK_WALL = wall("large_light_gray_brick_wall", Blocks.BRICK_WALL, DyeColor.LIGHT_GRAY)

    // small light_gray bricks
    val SMALL_LIGHT_GRAY_BRICKS = simple("small_light_gray_bricks", Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val SMALL_LIGHT_GRAY_BRICK_STAIRS = stairs("light_gray_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val SMALL_LIGHT_GRAY_BRICK_SLAB = slab("light_gray_small_brick_slab", Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val SMALL_LIGHT_GRAY_BRICK_WALL = wall("light_gray_small_brick_wall", Blocks.BRICK_WALL, DyeColor.LIGHT_GRAY)

    // light_gray brick variants
    val CRACKED_LIGHT_GRAY_BRICKS = simple("cracked_light_gray_bricks", Blocks.BRICKS)
    val CRACKED_LIGHT_GRAY_BRICK_STAIRS = stairs("cracked_light_gray_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val CRACKED_LIGHT_GRAY_BRICK_SLAB = slab("cracked_light_gray_brick_slab", Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val CRACKED_LIGHT_GRAY_BRICK_WALL = wall("cracked_light_gray_brick_wall", Blocks.BRICK_WALL, DyeColor.LIGHT_GRAY)
    val BASKETWEAVE_LIGHT_GRAY_BRICKS = simple("basketweave_light_gray_bricks", Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val PINWHEEL_LIGHT_GRAY_BRICKS = simple("pinwheel_light_gray_bricks", Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val JACK_ON_JACK_LIGHT_GRAY_BRICKS = simple("jack_on_jack_light_gray_bricks", Blocks.BRICKS, DyeColor.LIGHT_GRAY)

    // mixed light_gray bricks
    val MIXED_LIGHT_GRAY_BRICKS = simple("mixed_light_gray_bricks", Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val MIXED_LIGHT_GRAY_BRICK_STAIRS = stairs("mixed_light_gray_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val MIXED_LIGHT_GRAY_BRICK_SLAB = slab("mixed_light_gray_brick_slab", Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val MIXED_LIGHT_GRAY_BRICK_WALL = wall("mixed_light_gray_brick_wall", Blocks.BRICK_WALL, DyeColor.LIGHT_GRAY)

    //  mixed large light_gray bricks
    val LARGE_MIXED_LIGHT_GRAY_BRICKS = simple("large_mixed_light_gray_bricks", Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val LARGE_MIXED_LIGHT_GRAY_BRICK_STAIRS = stairs("large_mixed_light_gray_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val LARGE_MIXED_LIGHT_GRAY_BRICK_SLAB = slab("large_mixed_light_gray_brick_slab", Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val LARGE_MIXED_LIGHT_GRAY_BRICK_WALL = wall("large_mixed_light_gray_brick_wall", Blocks.BRICK_WALL, DyeColor.LIGHT_GRAY)

    //  mixed small light_gray bricks
    val SMALL_MIXED_LIGHT_GRAY_BRICKS = simple("small_mixed_light_gray_bricks", Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val SMALL_MIXED_LIGHT_GRAY_BRICK_STAIRS = stairs("mixed_light_gray_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val SMALL_MIXED_LIGHT_GRAY_BRICK_SLAB = slab("mixed_light_gray_small_brick_slab", Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val SMALL_MIXED_LIGHT_GRAY_BRICK_WALL = wall("mixed_light_gray_small_brick_wall", Blocks.BRICK_WALL, DyeColor.LIGHT_GRAY)

    //  light_gray shingles
    val LIGHT_GRAY_SHINGLES = simple("light_gray_shingles", Blocks.BRICKS)
    val LIGHT_GRAY_SHINGLE_STAIRS = stairs("light_gray_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val LIGHT_GRAY_SHINGLE_SLAB = slab("light_gray_shingle_slab", Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val LIGHT_GRAY_SHINGLE_WALL = wall("light_gray_shingle_wall", Blocks.BRICK_WALL, DyeColor.LIGHT_GRAY)

    //  mixed light_gray shingles
    val MIXED_LIGHT_GRAY_SHINGLES = simple("mixed_light_gray_shingles", Blocks.BRICKS)
    val MIXED_LIGHT_GRAY_SHINGLE_STAIRS = stairs("mixed_light_gray_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val MIXED_LIGHT_GRAY_SHINGLE_SLAB = slab("mixed_light_gray_shingle_slab", Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val MIXED_LIGHT_GRAY_SHINGLE_WALL = wall("mixed_light_gray_shingle_wall", Blocks.BRICK_WALL, DyeColor.LIGHT_GRAY)

    val LIGHT_GRAY_BRICK_CHIMNEY = chimney("light_gray_brick_chimney", Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    //#endregion

    //#region Cyan Bricks
    val CYAN_BRICKS = simple("cyan_bricks", Blocks.BRICKS, DyeColor.CYAN)
    val CYAN_BRICK_STAIRS = stairs("cyan_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.CYAN)
    val CYAN_BRICK_SLAB = slab("cyan_brick_slab", Blocks.BRICKS, DyeColor.CYAN)
    val CYAN_BRICK_WALL = wall("cyan_brick_wall", Blocks.BRICK_WALL, DyeColor.CYAN)

    //  large cyan bricks
    val LARGE_CYAN_BRICKS = simple("large_cyan_bricks", Blocks.BRICKS, DyeColor.CYAN)
    val LARGE_CYAN_BRICK_STAIRS = stairs("large_cyan_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.CYAN)
    val LARGE_CYAN_BRICK_SLAB = slab("large_cyan_brick_slab", Blocks.BRICKS, DyeColor.CYAN)
    val LARGE_CYAN_BRICK_WALL = wall("large_cyan_brick_wall", Blocks.BRICK_WALL, DyeColor.CYAN)

    // small cyan bricks
    val SMALL_CYAN_BRICKS = simple("small_cyan_bricks", Blocks.BRICKS, DyeColor.CYAN)
    val SMALL_CYAN_BRICK_STAIRS = stairs("cyan_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.CYAN)
    val SMALL_CYAN_BRICK_SLAB = slab("cyan_small_brick_slab", Blocks.BRICKS, DyeColor.CYAN)
    val SMALL_CYAN_BRICK_WALL = wall("cyan_small_brick_wall", Blocks.BRICK_WALL, DyeColor.CYAN)

    // cyan brick variants
    val CRACKED_CYAN_BRICKS = simple("cracked_cyan_bricks", Blocks.BRICKS)
    val CRACKED_CYAN_BRICK_STAIRS = stairs("cracked_cyan_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.CYAN)
    val CRACKED_CYAN_BRICK_SLAB = slab("cracked_cyan_brick_slab", Blocks.BRICKS, DyeColor.CYAN)
    val CRACKED_CYAN_BRICK_WALL = wall("cracked_cyan_brick_wall", Blocks.BRICK_WALL, DyeColor.CYAN)
    val BASKETWEAVE_CYAN_BRICKS = simple("basketweave_cyan_bricks", Blocks.BRICKS, DyeColor.CYAN)
    val PINWHEEL_CYAN_BRICKS = simple("pinwheel_cyan_bricks", Blocks.BRICKS, DyeColor.CYAN)
    val JACK_ON_JACK_CYAN_BRICKS = simple("jack_on_jack_cyan_bricks", Blocks.BRICKS, DyeColor.CYAN)

    // mixed cyan bricks
    val MIXED_CYAN_BRICKS = simple("mixed_cyan_bricks", Blocks.BRICKS, DyeColor.CYAN)
    val MIXED_CYAN_BRICK_STAIRS = stairs("mixed_cyan_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.CYAN)
    val MIXED_CYAN_BRICK_SLAB = slab("mixed_cyan_brick_slab", Blocks.BRICKS, DyeColor.CYAN)
    val MIXED_CYAN_BRICK_WALL = wall("mixed_cyan_brick_wall", Blocks.BRICK_WALL, DyeColor.CYAN)

    //  mixed large cyan bricks
    val LARGE_MIXED_CYAN_BRICKS = simple("large_mixed_cyan_bricks", Blocks.BRICKS, DyeColor.CYAN)
    val LARGE_MIXED_CYAN_BRICK_STAIRS = stairs("large_mixed_cyan_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.CYAN)
    val LARGE_MIXED_CYAN_BRICK_SLAB = slab("large_mixed_cyan_brick_slab", Blocks.BRICKS, DyeColor.CYAN)
    val LARGE_MIXED_CYAN_BRICK_WALL = wall("large_mixed_cyan_brick_wall", Blocks.BRICK_WALL, DyeColor.CYAN)

    //  mixed small cyan bricks
    val SMALL_MIXED_CYAN_BRICKS = simple("small_mixed_cyan_bricks", Blocks.BRICKS, DyeColor.CYAN)
    val SMALL_MIXED_CYAN_BRICK_STAIRS = stairs("mixed_cyan_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.CYAN)
    val SMALL_MIXED_CYAN_BRICK_SLAB = slab("mixed_cyan_small_brick_slab", Blocks.BRICKS, DyeColor.CYAN)
    val SMALL_MIXED_CYAN_BRICK_WALL = wall("mixed_cyan_small_brick_wall", Blocks.BRICK_WALL, DyeColor.CYAN)

    //  cyan shingles
    val CYAN_SHINGLES = simple("cyan_shingles", Blocks.BRICKS)
    val CYAN_SHINGLE_STAIRS = stairs("cyan_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.CYAN)
    val CYAN_SHINGLE_SLAB = slab("cyan_shingle_slab", Blocks.BRICKS, DyeColor.CYAN)
    val CYAN_SHINGLE_WALL = wall("cyan_shingle_wall", Blocks.BRICK_WALL, DyeColor.CYAN)

    //  mixed cyan shingles
    val MIXED_CYAN_SHINGLES = simple("mixed_cyan_shingles", Blocks.BRICKS)
    val MIXED_CYAN_SHINGLE_STAIRS = stairs("mixed_cyan_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.CYAN)
    val MIXED_CYAN_SHINGLE_SLAB = slab("mixed_cyan_shingle_slab", Blocks.BRICKS, DyeColor.CYAN)
    val MIXED_CYAN_SHINGLE_WALL = wall("mixed_cyan_shingle_wall", Blocks.BRICK_WALL, DyeColor.CYAN)

    val CYAN_BRICK_CHIMNEY = chimney("cyan_brick_chimney", Blocks.BRICKS, DyeColor.CYAN)
    //#endregion

    //#region Purple Bricks
    val PURPLE_BRICKS = simple("purple_bricks", Blocks.BRICKS, DyeColor.PURPLE)
    val PURPLE_BRICK_STAIRS = stairs("purple_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.PURPLE)
    val PURPLE_BRICK_SLAB = slab("purple_brick_slab", Blocks.BRICKS, DyeColor.PURPLE)
    val PURPLE_BRICK_WALL = wall("purple_brick_wall", Blocks.BRICK_WALL, DyeColor.PURPLE)

    //  large purple bricks
    val LARGE_PURPLE_BRICKS = simple("large_purple_bricks", Blocks.BRICKS, DyeColor.PURPLE)
    val LARGE_PURPLE_BRICK_STAIRS = stairs("large_purple_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.PURPLE)
    val LARGE_PURPLE_BRICK_SLAB = slab("large_purple_brick_slab", Blocks.BRICKS, DyeColor.PURPLE)
    val LARGE_PURPLE_BRICK_WALL = wall("large_purple_brick_wall", Blocks.BRICK_WALL, DyeColor.PURPLE)

    // small purple bricks
    val SMALL_PURPLE_BRICKS = simple("small_purple_bricks", Blocks.BRICKS, DyeColor.PURPLE)
    val SMALL_PURPLE_BRICK_STAIRS = stairs("purple_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.PURPLE)
    val SMALL_PURPLE_BRICK_SLAB = slab("purple_small_brick_slab", Blocks.BRICKS, DyeColor.PURPLE)
    val SMALL_PURPLE_BRICK_WALL = wall("purple_small_brick_wall", Blocks.BRICK_WALL, DyeColor.PURPLE)

    // purple brick variants
    val CRACKED_PURPLE_BRICKS = simple("cracked_purple_bricks", Blocks.BRICKS)
    val CRACKED_PURPLE_BRICK_STAIRS = stairs("cracked_purple_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.PURPLE)
    val CRACKED_PURPLE_BRICK_SLAB = slab("cracked_purple_brick_slab", Blocks.BRICKS, DyeColor.PURPLE)
    val CRACKED_PURPLE_BRICK_WALL = wall("cracked_purple_brick_wall", Blocks.BRICK_WALL, DyeColor.PURPLE)
    val BASKETWEAVE_PURPLE_BRICKS = simple("basketweave_purple_bricks", Blocks.BRICKS, DyeColor.PURPLE)
    val PINWHEEL_PURPLE_BRICKS = simple("pinwheel_purple_bricks", Blocks.BRICKS, DyeColor.PURPLE)
    val JACK_ON_JACK_PURPLE_BRICKS = simple("jack_on_jack_purple_bricks", Blocks.BRICKS, DyeColor.PURPLE)

    // mixed purple bricks
    val MIXED_PURPLE_BRICKS = simple("mixed_purple_bricks", Blocks.BRICKS, DyeColor.PURPLE)
    val MIXED_PURPLE_BRICK_STAIRS = stairs("mixed_purple_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.PURPLE)
    val MIXED_PURPLE_BRICK_SLAB = slab("mixed_purple_brick_slab", Blocks.BRICKS, DyeColor.PURPLE)
    val MIXED_PURPLE_BRICK_WALL = wall("mixed_purple_brick_wall", Blocks.BRICK_WALL, DyeColor.PURPLE)

    //  mixed large purple bricks
    val LARGE_MIXED_PURPLE_BRICKS = simple("large_mixed_purple_bricks", Blocks.BRICKS, DyeColor.PURPLE)
    val LARGE_MIXED_PURPLE_BRICK_STAIRS = stairs("large_mixed_purple_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.PURPLE)
    val LARGE_MIXED_PURPLE_BRICK_SLAB = slab("large_mixed_purple_brick_slab", Blocks.BRICKS, DyeColor.PURPLE)
    val LARGE_MIXED_PURPLE_BRICK_WALL = wall("large_mixed_purple_brick_wall", Blocks.BRICK_WALL, DyeColor.PURPLE)

    //  mixed small purple bricks
    val SMALL_MIXED_PURPLE_BRICKS = simple("small_mixed_purple_bricks", Blocks.BRICKS, DyeColor.PURPLE)
    val SMALL_MIXED_PURPLE_BRICK_STAIRS = stairs("mixed_purple_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.PURPLE)
    val SMALL_MIXED_PURPLE_BRICK_SLAB = slab("mixed_purple_small_brick_slab", Blocks.BRICKS, DyeColor.PURPLE)
    val SMALL_MIXED_PURPLE_BRICK_WALL = wall("mixed_purple_small_brick_wall", Blocks.BRICK_WALL, DyeColor.PURPLE)

    //  purple shingles
    val PURPLE_SHINGLES = simple("purple_shingles", Blocks.BRICKS)
    val PURPLE_SHINGLE_STAIRS = stairs("purple_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.PURPLE)
    val PURPLE_SHINGLE_SLAB = slab("purple_shingle_slab", Blocks.BRICKS, DyeColor.PURPLE)
    val PURPLE_SHINGLE_WALL = wall("purple_shingle_wall", Blocks.BRICK_WALL, DyeColor.PURPLE)

    //  mixed purple shingles
    val MIXED_PURPLE_SHINGLES = simple("mixed_purple_shingles", Blocks.BRICKS)
    val MIXED_PURPLE_SHINGLE_STAIRS = stairs("mixed_purple_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.PURPLE)
    val MIXED_PURPLE_SHINGLE_SLAB = slab("mixed_purple_shingle_slab", Blocks.BRICKS, DyeColor.PURPLE)
    val MIXED_PURPLE_SHINGLE_WALL = wall("mixed_purple_shingle_wall", Blocks.BRICK_WALL, DyeColor.PURPLE)

    val PURPLE_BRICK_CHIMNEY = chimney("purple_brick_chimney", Blocks.BRICKS, DyeColor.PURPLE)
    //#endregion

    //#region Blue Bricks
    val BLUE_BRICKS = simple("blue_bricks", Blocks.BRICKS, DyeColor.BLUE)
    val BLUE_BRICK_STAIRS = stairs("blue_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BLUE)
    val BLUE_BRICK_SLAB = slab("blue_brick_slab", Blocks.BRICKS, DyeColor.BLUE)
    val BLUE_BRICK_WALL = wall("blue_brick_wall", Blocks.BRICK_WALL, DyeColor.BLUE)

    //  large blue bricks
    val LARGE_BLUE_BRICKS = simple("large_blue_bricks", Blocks.BRICKS, DyeColor.BLUE)
    val LARGE_BLUE_BRICK_STAIRS = stairs("large_blue_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BLUE)
    val LARGE_BLUE_BRICK_SLAB = slab("large_blue_brick_slab", Blocks.BRICKS, DyeColor.BLUE)
    val LARGE_BLUE_BRICK_WALL = wall("large_blue_brick_wall", Blocks.BRICK_WALL, DyeColor.BLUE)

    // small blue bricks
    val SMALL_BLUE_BRICKS = simple("small_blue_bricks", Blocks.BRICKS, DyeColor.BLUE)
    val SMALL_BLUE_BRICK_STAIRS = stairs("blue_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BLUE)
    val SMALL_BLUE_BRICK_SLAB = slab("blue_small_brick_slab", Blocks.BRICKS, DyeColor.BLUE)
    val SMALL_BLUE_BRICK_WALL = wall("blue_small_brick_wall", Blocks.BRICK_WALL, DyeColor.BLUE)

    // blue brick variants
    val CRACKED_BLUE_BRICKS = simple("cracked_blue_bricks", Blocks.BRICKS)
    val CRACKED_BLUE_BRICK_STAIRS = stairs("cracked_blue_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BLUE)
    val CRACKED_BLUE_BRICK_SLAB = slab("cracked_blue_brick_slab", Blocks.BRICKS, DyeColor.BLUE)
    val CRACKED_BLUE_BRICK_WALL = wall("cracked_blue_brick_wall", Blocks.BRICK_WALL, DyeColor.BLUE)
    val BASKETWEAVE_BLUE_BRICKS = simple("basketweave_blue_bricks", Blocks.BRICKS, DyeColor.BLUE)
    val PINWHEEL_BLUE_BRICKS = simple("pinwheel_blue_bricks", Blocks.BRICKS, DyeColor.BLUE)
    val JACK_ON_JACK_BLUE_BRICKS = simple("jack_on_jack_blue_bricks", Blocks.BRICKS, DyeColor.BLUE)

    // mixed blue bricks
    val MIXED_BLUE_BRICKS = simple("mixed_blue_bricks", Blocks.BRICKS, DyeColor.BLUE)
    val MIXED_BLUE_BRICK_STAIRS = stairs("mixed_blue_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BLUE)
    val MIXED_BLUE_BRICK_SLAB = slab("mixed_blue_brick_slab", Blocks.BRICKS, DyeColor.BLUE)
    val MIXED_BLUE_BRICK_WALL = wall("mixed_blue_brick_wall", Blocks.BRICK_WALL, DyeColor.BLUE)

    //  mixed large blue bricks
    val LARGE_MIXED_BLUE_BRICKS = simple("large_mixed_blue_bricks", Blocks.BRICKS, DyeColor.BLUE)
    val LARGE_MIXED_BLUE_BRICK_STAIRS = stairs("large_mixed_blue_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BLUE)
    val LARGE_MIXED_BLUE_BRICK_SLAB = slab("large_mixed_blue_brick_slab", Blocks.BRICKS, DyeColor.BLUE)
    val LARGE_MIXED_BLUE_BRICK_WALL = wall("large_mixed_blue_brick_wall", Blocks.BRICK_WALL, DyeColor.BLUE)

    //  mixed small blue bricks
    val SMALL_MIXED_BLUE_BRICKS = simple("small_mixed_blue_bricks", Blocks.BRICKS, DyeColor.BLUE)
    val SMALL_MIXED_BLUE_BRICK_STAIRS = stairs("mixed_blue_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BLUE)
    val SMALL_MIXED_BLUE_BRICK_SLAB = slab("mixed_blue_small_brick_slab", Blocks.BRICKS, DyeColor.BLUE)
    val SMALL_MIXED_BLUE_BRICK_WALL = wall("mixed_blue_small_brick_wall", Blocks.BRICK_WALL, DyeColor.BLUE)

    //  blue shingles
    val BLUE_SHINGLES = simple("blue_shingles", Blocks.BRICKS)
    val BLUE_SHINGLE_STAIRS = stairs("blue_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BLUE)
    val BLUE_SHINGLE_SLAB = slab("blue_shingle_slab", Blocks.BRICKS, DyeColor.BLUE)
    val BLUE_SHINGLE_WALL = wall("blue_shingle_wall", Blocks.BRICK_WALL, DyeColor.BLUE)

    //  mixed blue shingles
    val MIXED_BLUE_SHINGLES = simple("mixed_blue_shingles", Blocks.BRICKS)
    val MIXED_BLUE_SHINGLE_STAIRS = stairs("mixed_blue_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BLUE)
    val MIXED_BLUE_SHINGLE_SLAB = slab("mixed_blue_shingle_slab", Blocks.BRICKS, DyeColor.BLUE)
    val MIXED_BLUE_SHINGLE_WALL = wall("mixed_blue_shingle_wall", Blocks.BRICK_WALL, DyeColor.BLUE)

    val BLUE_BRICK_CHIMNEY = chimney("blue_brick_chimney", Blocks.BRICKS, DyeColor.BLUE)
    //#endregion

    //#region Brown Bricks
    val BROWN_BRICKS = simple("brown_bricks", Blocks.BRICKS, DyeColor.BROWN)
    val BROWN_BRICK_STAIRS = stairs("brown_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BROWN)
    val BROWN_BRICK_SLAB = slab("brown_brick_slab", Blocks.BRICKS, DyeColor.BROWN)
    val BROWN_BRICK_WALL = wall("brown_brick_wall", Blocks.BRICK_WALL, DyeColor.BROWN)

    //  large brown bricks
    val LARGE_BROWN_BRICKS = simple("large_brown_bricks", Blocks.BRICKS, DyeColor.BROWN)
    val LARGE_BROWN_BRICK_STAIRS = stairs("large_brown_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BROWN)
    val LARGE_BROWN_BRICK_SLAB = slab("large_brown_brick_slab", Blocks.BRICKS, DyeColor.BROWN)
    val LARGE_BROWN_BRICK_WALL = wall("large_brown_brick_wall", Blocks.BRICK_WALL, DyeColor.BROWN)

    // small brown bricks
    val SMALL_BROWN_BRICKS = simple("small_brown_bricks", Blocks.BRICKS, DyeColor.BROWN)
    val SMALL_BROWN_BRICK_STAIRS = stairs("brown_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BROWN)
    val SMALL_BROWN_BRICK_SLAB = slab("brown_small_brick_slab", Blocks.BRICKS, DyeColor.BROWN)
    val SMALL_BROWN_BRICK_WALL = wall("brown_small_brick_wall", Blocks.BRICK_WALL, DyeColor.BROWN)

    // brown brick variants
    val CRACKED_BROWN_BRICKS = simple("cracked_brown_bricks", Blocks.BRICKS)
    val CRACKED_BROWN_BRICK_STAIRS = stairs("cracked_brown_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BROWN)
    val CRACKED_BROWN_BRICK_SLAB = slab("cracked_brown_brick_slab", Blocks.BRICKS, DyeColor.BROWN)
    val CRACKED_BROWN_BRICK_WALL = wall("cracked_brown_brick_wall", Blocks.BRICK_WALL, DyeColor.BROWN)
    val BASKETWEAVE_BROWN_BRICKS = simple("basketweave_brown_bricks", Blocks.BRICKS, DyeColor.BROWN)
    val PINWHEEL_BROWN_BRICKS = simple("pinwheel_brown_bricks", Blocks.BRICKS, DyeColor.BROWN)
    val JACK_ON_JACK_BROWN_BRICKS = simple("jack_on_jack_brown_bricks", Blocks.BRICKS, DyeColor.BROWN)

    // mixed brown bricks
    val MIXED_BROWN_BRICKS = simple("mixed_brown_bricks", Blocks.BRICKS, DyeColor.BROWN)
    val MIXED_BROWN_BRICK_STAIRS = stairs("mixed_brown_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BROWN)
    val MIXED_BROWN_BRICK_SLAB = slab("mixed_brown_brick_slab", Blocks.BRICKS, DyeColor.BROWN)
    val MIXED_BROWN_BRICK_WALL = wall("mixed_brown_brick_wall", Blocks.BRICK_WALL, DyeColor.BROWN)

    //  mixed large brown bricks
    val LARGE_MIXED_BROWN_BRICKS = simple("large_mixed_brown_bricks", Blocks.BRICKS, DyeColor.BROWN)
    val LARGE_MIXED_BROWN_BRICK_STAIRS = stairs("large_mixed_brown_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BROWN)
    val LARGE_MIXED_BROWN_BRICK_SLAB = slab("large_mixed_brown_brick_slab", Blocks.BRICKS, DyeColor.BROWN)
    val LARGE_MIXED_BROWN_BRICK_WALL = wall("large_mixed_brown_brick_wall", Blocks.BRICK_WALL, DyeColor.BROWN)

    //  mixed small brown bricks
    val SMALL_MIXED_BROWN_BRICKS = simple("small_mixed_brown_bricks", Blocks.BRICKS, DyeColor.BROWN)
    val SMALL_MIXED_BROWN_BRICK_STAIRS = stairs("mixed_brown_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BROWN)
    val SMALL_MIXED_BROWN_BRICK_SLAB = slab("mixed_brown_small_brick_slab", Blocks.BRICKS, DyeColor.BROWN)
    val SMALL_MIXED_BROWN_BRICK_WALL = wall("mixed_brown_small_brick_wall", Blocks.BRICK_WALL, DyeColor.BROWN)

    //  brown shingles
    val BROWN_SHINGLES = simple("brown_shingles", Blocks.BRICKS)
    val BROWN_SHINGLE_STAIRS = stairs("brown_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BROWN)
    val BROWN_SHINGLE_SLAB = slab("brown_shingle_slab", Blocks.BRICKS, DyeColor.BROWN)
    val BROWN_SHINGLE_WALL = wall("brown_shingle_wall", Blocks.BRICK_WALL, DyeColor.BROWN)

    //  mixed brown shingles
    val MIXED_BROWN_SHINGLES = simple("mixed_brown_shingles", Blocks.BRICKS)
    val MIXED_BROWN_SHINGLE_STAIRS = stairs("mixed_brown_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BROWN)
    val MIXED_BROWN_SHINGLE_SLAB = slab("mixed_brown_shingle_slab", Blocks.BRICKS, DyeColor.BROWN)
    val MIXED_BROWN_SHINGLE_WALL = wall("mixed_brown_shingle_wall", Blocks.BRICK_WALL, DyeColor.BROWN)

    val BROWN_BRICK_CHIMNEY = chimney("brown_brick_chimney", Blocks.BRICKS, DyeColor.BROWN)
    //#endregion

    //#region Green Bricks
    val GREEN_BRICKS = simple("green_bricks", Blocks.BRICKS, DyeColor.GREEN)
    val GREEN_BRICK_STAIRS = stairs("green_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.GREEN)
    val GREEN_BRICK_SLAB = slab("green_brick_slab", Blocks.BRICKS, DyeColor.GREEN)
    val GREEN_BRICK_WALL = wall("green_brick_wall", Blocks.BRICK_WALL, DyeColor.GREEN)

    //  large green bricks
    val LARGE_GREEN_BRICKS = simple("large_green_bricks", Blocks.BRICKS, DyeColor.GREEN)
    val LARGE_GREEN_BRICK_STAIRS = stairs("large_green_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.GREEN)
    val LARGE_GREEN_BRICK_SLAB = slab("large_green_brick_slab", Blocks.BRICKS, DyeColor.GREEN)
    val LARGE_GREEN_BRICK_WALL = wall("large_green_brick_wall", Blocks.BRICK_WALL, DyeColor.GREEN)

    // small green bricks
    val SMALL_GREEN_BRICKS = simple("small_green_bricks", Blocks.BRICKS, DyeColor.GREEN)
    val SMALL_GREEN_BRICK_STAIRS = stairs("green_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.GREEN)
    val SMALL_GREEN_BRICK_SLAB = slab("green_small_brick_slab", Blocks.BRICKS, DyeColor.GREEN)
    val SMALL_GREEN_BRICK_WALL = wall("green_small_brick_wall", Blocks.BRICK_WALL, DyeColor.GREEN)

    // green brick variants
    val CRACKED_GREEN_BRICKS = simple("cracked_green_bricks", Blocks.BRICKS)
    val CRACKED_GREEN_BRICK_STAIRS = stairs("cracked_green_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.GREEN)
    val CRACKED_GREEN_BRICK_SLAB = slab("cracked_green_brick_slab", Blocks.BRICKS, DyeColor.GREEN)
    val CRACKED_GREEN_BRICK_WALL = wall("cracked_green_brick_wall", Blocks.BRICK_WALL, DyeColor.GREEN)
    val BASKETWEAVE_GREEN_BRICKS = simple("basketweave_green_bricks", Blocks.BRICKS, DyeColor.GREEN)
    val PINWHEEL_GREEN_BRICKS = simple("pinwheel_green_bricks", Blocks.BRICKS, DyeColor.GREEN)
    val JACK_ON_JACK_GREEN_BRICKS = simple("jack_on_jack_green_bricks", Blocks.BRICKS, DyeColor.GREEN)

    // mixed green bricks
    val MIXED_GREEN_BRICKS = simple("mixed_green_bricks", Blocks.BRICKS, DyeColor.GREEN)
    val MIXED_GREEN_BRICK_STAIRS = stairs("mixed_green_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.GREEN)
    val MIXED_GREEN_BRICK_SLAB = slab("mixed_green_brick_slab", Blocks.BRICKS, DyeColor.GREEN)
    val MIXED_GREEN_BRICK_WALL = wall("mixed_green_brick_wall", Blocks.BRICK_WALL, DyeColor.GREEN)

    //  mixed large green bricks
    val LARGE_MIXED_GREEN_BRICKS = simple("large_mixed_green_bricks", Blocks.BRICKS, DyeColor.GREEN)
    val LARGE_MIXED_GREEN_BRICK_STAIRS = stairs("large_mixed_green_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.GREEN)
    val LARGE_MIXED_GREEN_BRICK_SLAB = slab("large_mixed_green_brick_slab", Blocks.BRICKS, DyeColor.GREEN)
    val LARGE_MIXED_GREEN_BRICK_WALL = wall("large_mixed_green_brick_wall", Blocks.BRICK_WALL, DyeColor.GREEN)

    //  mixed small green bricks
    val SMALL_MIXED_GREEN_BRICKS = simple("small_mixed_green_bricks", Blocks.BRICKS, DyeColor.GREEN)
    val SMALL_MIXED_GREEN_BRICK_STAIRS = stairs("mixed_green_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.GREEN)
    val SMALL_MIXED_GREEN_BRICK_SLAB = slab("mixed_green_small_brick_slab", Blocks.BRICKS, DyeColor.GREEN)
    val SMALL_MIXED_GREEN_BRICK_WALL = wall("mixed_green_small_brick_wall", Blocks.BRICK_WALL, DyeColor.GREEN)

    //  green shingles
    val GREEN_SHINGLES = simple("green_shingles", Blocks.BRICKS)
    val GREEN_SHINGLE_STAIRS = stairs("green_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.GREEN)
    val GREEN_SHINGLE_SLAB = slab("green_shingle_slab", Blocks.BRICKS, DyeColor.GREEN)
    val GREEN_SHINGLE_WALL = wall("green_shingle_wall", Blocks.BRICK_WALL, DyeColor.GREEN)

    //  mixed green shingles
    val MIXED_GREEN_SHINGLES = simple("mixed_green_shingles", Blocks.BRICKS)
    val MIXED_GREEN_SHINGLE_STAIRS = stairs("mixed_green_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.GREEN)
    val MIXED_GREEN_SHINGLE_SLAB = slab("mixed_green_shingle_slab", Blocks.BRICKS, DyeColor.GREEN)
    val MIXED_GREEN_SHINGLE_WALL = wall("mixed_green_shingle_wall", Blocks.BRICK_WALL, DyeColor.GREEN)

    val GREEN_BRICK_CHIMNEY = chimney("green_brick_chimney", Blocks.BRICKS, DyeColor.GREEN)
    //#endregion

    //#region Red Bricks
    val RED_BRICKS = simple("red_bricks", Blocks.BRICKS, DyeColor.RED)
    val RED_BRICK_STAIRS = stairs("red_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.RED)
    val RED_BRICK_SLAB = slab("red_brick_slab", Blocks.BRICKS, DyeColor.RED)
    val RED_BRICK_WALL = wall("red_brick_wall", Blocks.BRICK_WALL, DyeColor.RED)

    //  large red bricks
    val LARGE_RED_BRICKS = simple("large_red_bricks", Blocks.BRICKS, DyeColor.RED)
    val LARGE_RED_BRICK_STAIRS = stairs("large_red_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.RED)
    val LARGE_RED_BRICK_SLAB = slab("large_red_brick_slab", Blocks.BRICKS, DyeColor.RED)
    val LARGE_RED_BRICK_WALL = wall("large_red_brick_wall", Blocks.BRICK_WALL, DyeColor.RED)

    // small red bricks
    val SMALL_RED_BRICKS = simple("small_red_bricks", Blocks.BRICKS, DyeColor.RED)
    val SMALL_RED_BRICK_STAIRS = stairs("red_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.RED)
    val SMALL_RED_BRICK_SLAB = slab("red_small_brick_slab", Blocks.BRICKS, DyeColor.RED)
    val SMALL_RED_BRICK_WALL = wall("red_small_brick_wall", Blocks.BRICK_WALL, DyeColor.RED)

    // red brick variants
    val CRACKED_RED_BRICKS = simple("cracked_red_bricks", Blocks.BRICKS)
    val CRACKED_RED_BRICK_STAIRS = stairs("cracked_red_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.RED)
    val CRACKED_RED_BRICK_SLAB = slab("cracked_red_brick_slab", Blocks.BRICKS, DyeColor.RED)
    val CRACKED_RED_BRICK_WALL = wall("cracked_red_brick_wall", Blocks.BRICK_WALL, DyeColor.RED)
    val BASKETWEAVE_RED_BRICKS = simple("basketweave_red_bricks", Blocks.BRICKS, DyeColor.RED)
    val PINWHEEL_RED_BRICKS = simple("pinwheel_red_bricks", Blocks.BRICKS, DyeColor.RED)
    val JACK_ON_JACK_RED_BRICKS = simple("jack_on_jack_red_bricks", Blocks.BRICKS, DyeColor.RED)

    // mixed red bricks
    val MIXED_RED_BRICKS = simple("mixed_red_bricks", Blocks.BRICKS, DyeColor.RED)
    val MIXED_RED_BRICK_STAIRS = stairs("mixed_red_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.RED)
    val MIXED_RED_BRICK_SLAB = slab("mixed_red_brick_slab", Blocks.BRICKS, DyeColor.RED)
    val MIXED_RED_BRICK_WALL = wall("mixed_red_brick_wall", Blocks.BRICK_WALL, DyeColor.RED)

    //  mixed large red bricks
    val LARGE_MIXED_RED_BRICKS = simple("large_mixed_red_bricks", Blocks.BRICKS, DyeColor.RED)
    val LARGE_MIXED_RED_BRICK_STAIRS = stairs("large_mixed_red_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.RED)
    val LARGE_MIXED_RED_BRICK_SLAB = slab("large_mixed_red_brick_slab", Blocks.BRICKS, DyeColor.RED)
    val LARGE_MIXED_RED_BRICK_WALL = wall("large_mixed_red_brick_wall", Blocks.BRICK_WALL, DyeColor.RED)

    //  mixed small red bricks
    val SMALL_MIXED_RED_BRICKS = simple("small_mixed_red_bricks", Blocks.BRICKS, DyeColor.RED)
    val SMALL_MIXED_RED_BRICK_STAIRS = stairs("mixed_red_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.RED)
    val SMALL_MIXED_RED_BRICK_SLAB = slab("mixed_red_small_brick_slab", Blocks.BRICKS, DyeColor.RED)
    val SMALL_MIXED_RED_BRICK_WALL = wall("mixed_red_small_brick_wall", Blocks.BRICK_WALL, DyeColor.RED)

    //  red shingles
    val RED_SHINGLES = simple("red_shingles", Blocks.BRICKS)
    val RED_SHINGLE_STAIRS = stairs("red_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.RED)
    val RED_SHINGLE_SLAB = slab("red_shingle_slab", Blocks.BRICKS, DyeColor.RED)
    val RED_SHINGLE_WALL = wall("red_shingle_wall", Blocks.BRICK_WALL, DyeColor.RED)

    //  mixed red shingles
    val MIXED_RED_SHINGLES = simple("mixed_red_shingles", Blocks.BRICKS)
    val MIXED_RED_SHINGLE_STAIRS = stairs("mixed_red_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.RED)
    val MIXED_RED_SHINGLE_SLAB = slab("mixed_red_shingle_slab", Blocks.BRICKS, DyeColor.RED)
    val MIXED_RED_SHINGLE_WALL = wall("mixed_red_shingle_wall", Blocks.BRICK_WALL, DyeColor.RED)

    val RED_BRICK_CHIMNEY = chimney("red_brick_chimney", Blocks.BRICKS, DyeColor.RED)
    //#endregion

    //#region Black Bricks
    val BLACK_BRICKS = simple("black_bricks", Blocks.BRICKS, DyeColor.BLACK)
    val BLACK_BRICK_STAIRS = stairs("black_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BLACK)
    val BLACK_BRICK_SLAB = slab("black_brick_slab", Blocks.BRICKS, DyeColor.BLACK)
    val BLACK_BRICK_WALL = wall("black_brick_wall", Blocks.BRICK_WALL, DyeColor.BLACK)

    //  large black bricks
    val LARGE_BLACK_BRICKS = simple("large_black_bricks", Blocks.BRICKS, DyeColor.BLACK)
    val LARGE_BLACK_BRICK_STAIRS = stairs("large_black_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BLACK)
    val LARGE_BLACK_BRICK_SLAB = slab("large_black_brick_slab", Blocks.BRICKS, DyeColor.BLACK)
    val LARGE_BLACK_BRICK_WALL = wall("large_black_brick_wall", Blocks.BRICK_WALL, DyeColor.BLACK)

    // small black bricks
    val SMALL_BLACK_BRICKS = simple("small_black_bricks", Blocks.BRICKS, DyeColor.BLACK)
    val SMALL_BLACK_BRICK_STAIRS = stairs("black_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BLACK)
    val SMALL_BLACK_BRICK_SLAB = slab("black_small_brick_slab", Blocks.BRICKS, DyeColor.BLACK)
    val SMALL_BLACK_BRICK_WALL = wall("black_small_brick_wall", Blocks.BRICK_WALL, DyeColor.BLACK)

    // black brick variants
    val CRACKED_BLACK_BRICKS = simple("cracked_black_bricks", Blocks.BRICKS)
    val CRACKED_BLACK_BRICK_STAIRS = stairs("cracked_black_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BLACK)
    val CRACKED_BLACK_BRICK_SLAB = slab("cracked_black_brick_slab", Blocks.BRICKS, DyeColor.BLACK)
    val CRACKED_BLACK_BRICK_WALL = wall("cracked_black_brick_wall", Blocks.BRICK_WALL, DyeColor.BLACK)
    val BASKETWEAVE_BLACK_BRICKS = simple("basketweave_black_bricks", Blocks.BRICKS, DyeColor.BLACK)
    val PINWHEEL_BLACK_BRICKS = simple("pinwheel_black_bricks", Blocks.BRICKS, DyeColor.BLACK)
    val JACK_ON_JACK_BLACK_BRICKS = simple("jack_on_jack_black_bricks", Blocks.BRICKS, DyeColor.BLACK)

    // mixed black bricks
    val MIXED_BLACK_BRICKS = simple("mixed_black_bricks", Blocks.BRICKS, DyeColor.BLACK)
    val MIXED_BLACK_BRICK_STAIRS = stairs("mixed_black_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BLACK)
    val MIXED_BLACK_BRICK_SLAB = slab("mixed_black_brick_slab", Blocks.BRICKS, DyeColor.BLACK)
    val MIXED_BLACK_BRICK_WALL = wall("mixed_black_brick_wall", Blocks.BRICK_WALL, DyeColor.BLACK)

    //  mixed large black bricks
    val LARGE_MIXED_BLACK_BRICKS = simple("large_mixed_black_bricks", Blocks.BRICKS, DyeColor.BLACK)
    val LARGE_MIXED_BLACK_BRICK_STAIRS = stairs("large_mixed_black_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BLACK)
    val LARGE_MIXED_BLACK_BRICK_SLAB = slab("large_mixed_black_brick_slab", Blocks.BRICKS, DyeColor.BLACK)
    val LARGE_MIXED_BLACK_BRICK_WALL = wall("large_mixed_black_brick_wall", Blocks.BRICK_WALL, DyeColor.BLACK)

    //  mixed small black bricks
    val SMALL_MIXED_BLACK_BRICKS = simple("small_mixed_black_bricks", Blocks.BRICKS, DyeColor.BLACK)
    val SMALL_MIXED_BLACK_BRICK_STAIRS = stairs("mixed_black_small_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BLACK)
    val SMALL_MIXED_BLACK_BRICK_SLAB = slab("mixed_black_small_brick_slab", Blocks.BRICKS, DyeColor.BLACK)
    val SMALL_MIXED_BLACK_BRICK_WALL = wall("mixed_black_small_brick_wall", Blocks.BRICK_WALL, DyeColor.BLACK)

    //  black shingles
    val BLACK_SHINGLES = simple("black_shingles", Blocks.BRICKS)
    val BLACK_SHINGLE_STAIRS = stairs("black_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BLACK)
    val BLACK_SHINGLE_SLAB = slab("black_shingle_slab", Blocks.BRICKS, DyeColor.BLACK)
    val BLACK_SHINGLE_WALL = wall("black_shingle_wall", Blocks.BRICK_WALL, DyeColor.BLACK)

    //  mixed black shingles
    val MIXED_BLACK_SHINGLES = simple("mixed_black_shingles", Blocks.BRICKS)
    val MIXED_BLACK_SHINGLE_STAIRS = stairs("mixed_black_shingle_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BLACK)
    val MIXED_BLACK_SHINGLE_SLAB = slab("mixed_black_shingle_slab", Blocks.BRICKS, DyeColor.BLACK)
    val MIXED_BLACK_SHINGLE_WALL = wall("mixed_black_shingle_wall", Blocks.BRICK_WALL, DyeColor.BLACK)

    val BLACK_BRICK_CHIMNEY = chimney("black_brick_chimney", Blocks.BRICKS, DyeColor.BLACK)
    //#endregion

    val MOSSY_MEDIUM_MUD_BRICKS = simple("mossy_medium_mud_bricks", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MOSSY_MEDIUM_MUD_BRICK_STAIRS = stairs("mossy_medium_mud_brick_stairs", Blocks.MUD_BRICKS, Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MOSSY_MEDIUM_MUD_BRICK_SLAB = slab("mossy_medium_mud_brick_slab", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MOSSY_MEDIUM_MUD_BRICK_WALL = wall("mossy_medium_mud_brick_wall", Blocks.MUD_BRICK_WALL, DyeColor.BROWN)

    val MOSSY_BRICKS = simple("mossy_bricks", Blocks.BRICKS, DyeColor.BLACK)
    val MOSSY_BRICK_STAIRS = stairs("mossy_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BLACK)
    val MOSSY_BRICK_SLAB = slab("mossy_brick_slab", Blocks.BRICKS, DyeColor.BLACK)
    val MOSSY_BRICK_WALL = wall("mossy_brick_wall", Blocks.BRICK_WALL, DyeColor.BLACK)

    val MOSSY_WHITE_BRICKS = simple("mossy_white_bricks", Blocks.BRICKS, DyeColor.WHITE)
    val MOSSY_WHITE_BRICK_STAIRS = stairs("mossy_white_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.WHITE)
    val MOSSY_WHITE_BRICK_SLAB = slab("mossy_white_brick_slab", Blocks.BRICKS, DyeColor.WHITE)
    val MOSSY_WHITE_BRICK_WALL = wall("mossy_white_brick_wall", Blocks.BRICK_WALL, DyeColor.WHITE)

    val MOSSY_ORANGE_BRICKS = simple("mossy_orange_bricks", Blocks.BRICKS, DyeColor.ORANGE)
    val MOSSY_ORANGE_BRICK_STAIRS = stairs("mossy_orange_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.ORANGE)
    val MOSSY_ORANGE_BRICK_SLAB = slab("mossy_orange_brick_slab", Blocks.BRICKS, DyeColor.ORANGE)
    val MOSSY_ORANGE_BRICK_WALL = wall("mossy_orange_brick_wall", Blocks.BRICK_WALL, DyeColor.ORANGE)

    val MOSSY_MAGENTA_BRICKS = simple("mossy_magenta_bricks", Blocks.BRICKS, DyeColor.MAGENTA)
    val MOSSY_MAGENTA_BRICK_STAIRS = stairs("mossy_magenta_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.MAGENTA)
    val MOSSY_MAGENTA_BRICK_SLAB = slab("mossy_magenta_brick_slab", Blocks.BRICKS, DyeColor.MAGENTA)
    val MOSSY_MAGENTA_BRICK_WALL = wall("mossy_magenta_brick_wall", Blocks.BRICK_WALL, DyeColor.MAGENTA)

    val MOSSY_LIGHT_BLUE_BRICKS = simple("mossy_light_blue_bricks", Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val MOSSY_LIGHT_BLUE_BRICK_STAIRS = stairs("mossy_light_blue_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val MOSSY_LIGHT_BLUE_BRICK_SLAB = slab("mossy_light_blue_brick_slab", Blocks.BRICKS, DyeColor.LIGHT_BLUE)
    val MOSSY_LIGHT_BLUE_BRICK_WALL = wall("mossy_light_blue_brick_wall", Blocks.BRICK_WALL, DyeColor.LIGHT_BLUE)

    val MOSSY_YELLOW_BRICKS = simple("mossy_yellow_bricks", Blocks.BRICKS, DyeColor.YELLOW)
    val MOSSY_YELLOW_BRICK_STAIRS = stairs("mossy_yellow_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.YELLOW)
    val MOSSY_YELLOW_BRICK_SLAB = slab("mossy_yellow_brick_slab", Blocks.BRICKS, DyeColor.YELLOW)
    val MOSSY_YELLOW_BRICK_WALL = wall("mossy_yellow_brick_wall", Blocks.BRICK_WALL, DyeColor.YELLOW)

    val MOSSY_LIME_BRICKS = simple("mossy_lime_bricks", Blocks.BRICKS, DyeColor.LIME)
    val MOSSY_LIME_BRICK_STAIRS = stairs("mossy_lime_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIME)
    val MOSSY_LIME_BRICK_SLAB = slab("mossy_lime_brick_slab", Blocks.BRICKS, DyeColor.LIME)
    val MOSSY_LIME_BRICK_WALL = wall("mossy_lime_brick_wall", Blocks.BRICK_WALL, DyeColor.LIME)

    val MOSSY_PINK_BRICKS = simple("mossy_pink_bricks", Blocks.BRICKS, DyeColor.PINK)
    val MOSSY_PINK_BRICK_STAIRS = stairs("mossy_pink_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.PINK)
    val MOSSY_PINK_BRICK_SLAB = slab("mossy_pink_brick_slab", Blocks.BRICKS, DyeColor.PINK)
    val MOSSY_PINK_BRICK_WALL = wall("mossy_pink_brick_wall", Blocks.BRICK_WALL, DyeColor.PINK)

    val MOSSY_GRAY_BRICKS = simple("mossy_gray_bricks", Blocks.BRICKS, DyeColor.GRAY)
    val MOSSY_GRAY_BRICK_STAIRS = stairs("mossy_gray_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.GRAY)
    val MOSSY_GRAY_BRICK_SLAB = slab("mossy_gray_brick_slab", Blocks.BRICKS, DyeColor.GRAY)
    val MOSSY_GRAY_BRICK_WALL = wall("mossy_gray_brick_wall", Blocks.BRICK_WALL, DyeColor.GRAY)

    val MOSSY_LIGHT_GRAY_BRICKS = simple("mossy_light_gray_bricks", Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val MOSSY_LIGHT_GRAY_BRICK_STAIRS = stairs("mossy_light_gray_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val MOSSY_LIGHT_GRAY_BRICK_SLAB = slab("mossy_light_gray_brick_slab", Blocks.BRICKS, DyeColor.LIGHT_GRAY)
    val MOSSY_LIGHT_GRAY_BRICK_WALL = wall("mossy_light_gray_brick_wall", Blocks.BRICK_WALL, DyeColor.LIGHT_GRAY)

    val MOSSY_CYAN_BRICKS = simple("mossy_cyan_bricks", Blocks.BRICKS, DyeColor.CYAN)
    val MOSSY_CYAN_BRICK_STAIRS = stairs("mossy_cyan_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.CYAN)
    val MOSSY_CYAN_BRICK_SLAB = slab("mossy_cyan_brick_slab", Blocks.BRICKS, DyeColor.CYAN)
    val MOSSY_CYAN_BRICK_WALL = wall("mossy_cyan_brick_wall", Blocks.BRICK_WALL, DyeColor.CYAN)

    val MOSSY_PURPLE_BRICKS = simple("mossy_purple_bricks", Blocks.BRICKS, DyeColor.PURPLE)
    val MOSSY_PURPLE_BRICK_STAIRS = stairs("mossy_purple_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.PURPLE)
    val MOSSY_PURPLE_BRICK_SLAB = slab("mossy_purple_brick_slab", Blocks.BRICKS, DyeColor.PURPLE)
    val MOSSY_PURPLE_BRICK_WALL = wall("mossy_purple_brick_wall", Blocks.BRICK_WALL, DyeColor.PURPLE)

    val MOSSY_BLUE_BRICKS = simple("mossy_blue_bricks", Blocks.BRICKS, DyeColor.BLUE)
    val MOSSY_BLUE_BRICK_STAIRS = stairs("mossy_blue_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BLUE)
    val MOSSY_BLUE_BRICK_SLAB = slab("mossy_blue_brick_slab", Blocks.BRICKS, DyeColor.BLUE)
    val MOSSY_BLUE_BRICK_WALL = wall("mossy_blue_brick_wall", Blocks.BRICK_WALL, DyeColor.BLUE)

    val MOSSY_BROWN_BRICKS = simple("mossy_brown_bricks", Blocks.BRICKS, DyeColor.BROWN)
    val MOSSY_BROWN_BRICK_STAIRS = stairs("mossy_brown_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BROWN)
    val MOSSY_BROWN_BRICK_SLAB = slab("mossy_brown_brick_slab", Blocks.BRICKS, DyeColor.BROWN)
    val MOSSY_BROWN_BRICK_WALL = wall("mossy_brown_brick_wall", Blocks.BRICK_WALL, DyeColor.BROWN)

    val MOSSY_GREEN_BRICKS = simple("mossy_green_bricks", Blocks.BRICKS, DyeColor.GREEN)
    val MOSSY_GREEN_BRICK_STAIRS = stairs("mossy_green_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.GREEN)
    val MOSSY_GREEN_BRICK_SLAB = slab("mossy_green_brick_slab", Blocks.BRICKS, DyeColor.GREEN)
    val MOSSY_GREEN_BRICK_WALL = wall("mossy_green_brick_wall", Blocks.BRICK_WALL, DyeColor.GREEN)

    val MOSSY_RED_BRICKS = simple("mossy_red_bricks", Blocks.BRICKS, DyeColor.RED)
    val MOSSY_RED_BRICK_STAIRS = stairs("mossy_red_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.RED)
    val MOSSY_RED_BRICK_SLAB = slab("mossy_red_brick_slab", Blocks.BRICKS, DyeColor.RED)
    val MOSSY_RED_BRICK_WALL = wall("mossy_red_brick_wall", Blocks.BRICK_WALL, DyeColor.RED)

    val MOSSY_BLACK_BRICKS = simple("mossy_black_bricks", Blocks.BRICKS, DyeColor.BLACK)
    val MOSSY_BLACK_BRICK_STAIRS = stairs("mossy_black_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.BLACK)
    val MOSSY_BLACK_BRICK_SLAB = slab("mossy_black_brick_slab", Blocks.BRICKS, DyeColor.BLACK)
    val MOSSY_BLACK_BRICK_WALL = wall("mossy_black_brick_wall", Blocks.BRICK_WALL, DyeColor.BLACK)
    //#endregion

    //#region Hybrid Aquatic Bricks
    val MEDIUM_SCHIST_BRICKS = simple("medium_schist_bricks", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_SCHIST_BRICK_STAIRS = stairs("medium_schist_brick_stairs", Blocks.MUD_BRICKS, Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_SCHIST_BRICK_SLAB = slab("medium_schist_brick_slab", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_SCHIST_BRICK_WALL = wall("medium_schist_brick_wall", Blocks.MUD_BRICK_WALL, DyeColor.BROWN)

    val MEDIUM_MIXED_SCHIST_BRICKS = simple("medium_mixed_schist_bricks", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_MIXED_SCHIST_BRICK_STAIRS = stairs("medium_mixed_schist_brick_stairs", Blocks.MUD_BRICKS, Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_MIXED_SCHIST_BRICK_SLAB = slab("medium_mixed_schist_brick_slab", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_MIXED_SCHIST_BRICK_WALL = wall("medium_mixed_schist_brick_wall", Blocks.MUD_BRICK_WALL, DyeColor.BROWN)

    // small nether bricks
    val SMALL_SCHIST_BRICKS = simple("small_schist_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val SMALL_SCHIST_BRICK_STAIRS = stairs("small_schist_brick_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val SMALL_SCHIST_BRICK_SLAB = slab("small_schist_brick_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val SMALL_SCHIST_BRICK_WALL = wall("small_schist_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    // nether brick variants
    val CRACKED_MEDIUM_SCHIST_BRICKS = simple("cracked_medium_schist_bricks", Blocks.MUD_BRICKS)
    val CRACKED_MEDIUM_SCHIST_BRICK_STAIRS = stairs("cracked_medium_schist_brick_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val CRACKED_MEDIUM_SCHIST_BRICK_SLAB = slab("cracked_medium_schist_brick_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val CRACKED_MEDIUM_SCHIST_BRICK_WALL = wall("cracked_medium_schist_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    val BASKETWEAVE_SCHIST_BRICKS = simple("basketweave_schist_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val PINWHEEL_SCHIST_BRICKS = simple("pinwheel_schist_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val JACK_ON_JACK_SCHIST_BRICKS = simple("jack_on_jack_schist_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)

    // mixed nether bricks
    val MIXED_SCHIST_BRICKS = simple("mixed_schist_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val MIXED_SCHIST_BRICK_STAIRS = stairs("mixed_schist_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.RED)
    val MIXED_SCHIST_BRICK_SLAB = slab("mixed_schist_brick_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val MIXED_SCHIST_BRICK_WALL = wall("mixed_schist_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    //  mixed large nether bricks
    val LARGE_MIXED_SCHIST_BRICKS = simple("large_mixed_schist_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val LARGE_MIXED_SCHIST_BRICK_STAIRS = stairs("large_mixed_schist_brick_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val LARGE_MIXED_SCHIST_BRICK_SLAB = slab("large_mixed_schist_brick_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val LARGE_MIXED_SCHIST_BRICK_WALL = wall("large_mixed_schist_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    //  mixed small nether bricks
    val SMALL_MIXED_SCHIST_BRICKS = simple("small_mixed_schist_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val SMALL_MIXED_SCHIST_BRICK_STAIRS = stairs("mixed_schist_small_brick_stairs", Blocks.BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val SMALL_MIXED_SCHIST_BRICK_SLAB = slab("mixed_schist_small_brick_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val SMALL_MIXED_SCHIST_BRICK_WALL = wall("mixed_schist_small_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    //  nether shingles
    val SCHIST_SHINGLES = simple("schist_shingles", Blocks.NETHER_BRICKS)
    val SCHIST_SHINGLE_STAIRS = stairs("schist_shingle_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val SCHIST_SHINGLE_SLAB = slab("schist_shingle_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val SCHIST_SHINGLE_WALL = wall("schist_shingle_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    //  mixed nether shingles
    val MIXED_SCHIST_SHINGLES = simple("mixed_schist_shingles", Blocks.NETHER_BRICKS)
    val MIXED_SCHIST_SHINGLE_STAIRS = stairs("mixed_schist_shingle_stairs", Blocks.BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val MIXED_SCHIST_SHINGLE_SLAB = slab("mixed_schist_shingle_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val MIXED_SCHIST_SHINGLE_WALL = wall("mixed_schist_shingle_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    val SCHIST_CHIMNEY = chimney("schist_chimney", Blocks.NETHER_BRICKS, DyeColor.RED)

    val MEDIUM_CHIMNEYSTONE_BRICKS = simple("medium_chimneystone_bricks", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_CHIMNEYSTONE_BRICK_STAIRS = stairs("medium_chimneystone_brick_stairs", Blocks.MUD_BRICKS, Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_CHIMNEYSTONE_BRICK_SLAB = slab("medium_chimneystone_brick_slab", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_CHIMNEYSTONE_BRICK_WALL = wall("medium_chimneystone_brick_wall", Blocks.MUD_BRICK_WALL, DyeColor.BROWN)

    val MEDIUM_MIXED_CHIMNEYSTONE_BRICKS = simple("medium_mixed_chimneystone_bricks", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_MIXED_CHIMNEYSTONE_BRICK_STAIRS = stairs("medium_mixed_chimneystone_brick_stairs", Blocks.MUD_BRICKS, Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_MIXED_CHIMNEYSTONE_BRICK_SLAB = slab("medium_mixed_chimneystone_brick_slab", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_MIXED_CHIMNEYSTONE_BRICK_WALL = wall("medium_mixed_chimneystone_brick_wall", Blocks.MUD_BRICK_WALL, DyeColor.BROWN)

    // small chimneystone bricks
    val SMALL_CHIMNEYSTONE_BRICKS = simple("small_chimneystone_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val SMALL_CHIMNEYSTONE_BRICK_STAIRS = stairs("small_chimneystone_brick_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val SMALL_CHIMNEYSTONE_BRICK_SLAB = slab("small_chimneystone_brick_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val SMALL_CHIMNEYSTONE_BRICK_WALL = wall("small_chimneystone_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    // chimneystone brick variants
    val CRACKED_MEDIUM_CHIMNEYSTONE_BRICKS = simple("cracked_medium_chimneystone_bricks", Blocks.MUD_BRICKS)
    val CRACKED_MEDIUM_CHIMNEYSTONE_BRICK_STAIRS = stairs("cracked_medium_chimneystone_brick_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val CRACKED_MEDIUM_CHIMNEYSTONE_BRICK_SLAB = slab("cracked_medium_chimneystone_brick_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val CRACKED_MEDIUM_CHIMNEYSTONE_BRICK_WALL = wall("cracked_medium_chimneystone_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    val BASKETWEAVE_CHIMNEYSTONE_BRICKS = simple("basketweave_chimneystone_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val PINWHEEL_CHIMNEYSTONE_BRICKS = simple("pinwheel_chimneystone_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val JACK_ON_JACK_CHIMNEYSTONE_BRICKS = simple("jack_on_jack_chimneystone_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)

    // mixed chimneystone bricks
    val MIXED_CHIMNEYSTONE_BRICKS = simple("mixed_chimneystone_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val MIXED_CHIMNEYSTONE_BRICK_STAIRS = stairs("mixed_chimneystone_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.RED)
    val MIXED_CHIMNEYSTONE_BRICK_SLAB = slab("mixed_chimneystone_brick_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val MIXED_CHIMNEYSTONE_BRICK_WALL = wall("mixed_chimneystone_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    //  mixed large chimneystone bricks
    val LARGE_MIXED_CHIMNEYSTONE_BRICKS = simple("large_mixed_chimneystone_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val LARGE_MIXED_CHIMNEYSTONE_BRICK_STAIRS = stairs("large_mixed_chimneystone_brick_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val LARGE_MIXED_CHIMNEYSTONE_BRICK_SLAB = slab("large_mixed_chimneystone_brick_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val LARGE_MIXED_CHIMNEYSTONE_BRICK_WALL = wall("large_mixed_chimneystone_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    //  mixed small chimneystone bricks
    val SMALL_MIXED_CHIMNEYSTONE_BRICKS = simple("small_mixed_chimneystone_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val SMALL_MIXED_CHIMNEYSTONE_BRICK_STAIRS = stairs("mixed_chimneystone_small_brick_stairs", Blocks.BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val SMALL_MIXED_CHIMNEYSTONE_BRICK_SLAB = slab("mixed_chimneystone_small_brick_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val SMALL_MIXED_CHIMNEYSTONE_BRICK_WALL = wall("mixed_chimneystone_small_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    //  chimneystone shingles
    val CHIMNEYSTONE_SHINGLES = simple("chimneystone_shingles", Blocks.NETHER_BRICKS)
    val CHIMNEYSTONE_SHINGLE_STAIRS = stairs("chimneystone_shingle_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val CHIMNEYSTONE_SHINGLE_SLAB = slab("chimneystone_shingle_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val CHIMNEYSTONE_SHINGLE_WALL = wall("chimneystone_shingle_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    //  mixed chimneystone shingles
    val MIXED_CHIMNEYSTONE_SHINGLES = simple("mixed_chimneystone_shingles", Blocks.NETHER_BRICKS)
    val MIXED_CHIMNEYSTONE_SHINGLE_STAIRS = stairs("mixed_chimneystone_shingle_stairs", Blocks.BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val MIXED_CHIMNEYSTONE_SHINGLE_SLAB = slab("mixed_chimneystone_shingle_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val MIXED_CHIMNEYSTONE_SHINGLE_WALL = wall("mixed_chimneystone_shingle_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    val CHIMNEYSTONE_CHIMNEY = chimney("chimneystone_chimney", Blocks.NETHER_BRICKS, DyeColor.RED)

    val MEDIUM_RED_BRINESTONE_BRICKS = simple("medium_red_brinestone_bricks", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_RED_BRINESTONE_BRICK_STAIRS = stairs("medium_red_brinestone_brick_stairs", Blocks.MUD_BRICKS, Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_RED_BRINESTONE_BRICK_SLAB = slab("medium_red_brinestone_brick_slab", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_RED_BRINESTONE_BRICK_WALL = wall("medium_red_brinestone_brick_wall", Blocks.MUD_BRICK_WALL, DyeColor.BROWN)

    val MEDIUM_MIXED_RED_BRINESTONE_BRICKS = simple("medium_mixed_red_brinestone_bricks", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_MIXED_RED_BRINESTONE_BRICK_STAIRS = stairs("medium_mixed_red_brinestone_brick_stairs", Blocks.MUD_BRICKS, Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_MIXED_RED_BRINESTONE_BRICK_SLAB = slab("medium_mixed_red_brinestone_brick_slab", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_MIXED_RED_BRINESTONE_BRICK_WALL = wall("medium_mixed_red_brinestone_brick_wall", Blocks.MUD_BRICK_WALL, DyeColor.BROWN)

    // small red brinestone bricks
    val SMALL_RED_BRINESTONE_BRICKS = simple("small_red_brinestone_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val SMALL_RED_BRINESTONE_BRICK_STAIRS = stairs("small_red_brinestone_brick_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val SMALL_RED_BRINESTONE_BRICK_SLAB = slab("small_red_brinestone_brick_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val SMALL_RED_BRINESTONE_BRICK_WALL = wall("small_red_brinestone_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    // red brinestone brick variants
    val CRACKED_MEDIUM_RED_BRINESTONE_BRICKS = simple("cracked_medium_red_brinestone_bricks", Blocks.MUD_BRICKS)
    val CRACKED_MEDIUM_RED_BRINESTONE_BRICK_STAIRS = stairs("cracked_medium_red_brinestone_brick_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val CRACKED_MEDIUM_RED_BRINESTONE_BRICK_SLAB = slab("cracked_medium_red_brinestone_brick_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val CRACKED_MEDIUM_RED_BRINESTONE_BRICK_WALL = wall("cracked_medium_red_brinestone_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    val BASKETWEAVE_RED_BRINESTONE_BRICKS = simple("basketweave_red_brinestone_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val PINWHEEL_RED_BRINESTONE_BRICKS = simple("pinwheel_red_brinestone_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val JACK_ON_JACK_RED_BRINESTONE_BRICKS = simple("jack_on_jack_red_brinestone_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)

    // mixed red brinestone bricks
    val MIXED_RED_BRINESTONE_BRICKS = simple("mixed_red_brinestone_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val MIXED_RED_BRINESTONE_BRICK_STAIRS = stairs("mixed_red_brinestone_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.RED)
    val MIXED_RED_BRINESTONE_BRICK_SLAB = slab("mixed_red_brinestone_brick_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val MIXED_RED_BRINESTONE_BRICK_WALL = wall("mixed_red_brinestone_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    //  mixed large red brinestone bricks
    val LARGE_MIXED_RED_BRINESTONE_BRICKS = simple("large_mixed_red_brinestone_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val LARGE_MIXED_RED_BRINESTONE_BRICK_STAIRS = stairs("large_mixed_red_brinestone_brick_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val LARGE_MIXED_RED_BRINESTONE_BRICK_SLAB = slab("large_mixed_red_brinestone_brick_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val LARGE_MIXED_RED_BRINESTONE_BRICK_WALL = wall("large_mixed_red_brinestone_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    //  mixed small red brinestone bricks
    val SMALL_MIXED_RED_BRINESTONE_BRICKS = simple("small_mixed_red_brinestone_bricks", Blocks.NETHER_BRICKS, DyeColor.RED)
    val SMALL_MIXED_RED_BRINESTONE_BRICK_STAIRS = stairs("mixed_red_brinestone_small_brick_stairs", Blocks.BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val SMALL_MIXED_RED_BRINESTONE_BRICK_SLAB = slab("mixed_red_brinestone_small_brick_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val SMALL_MIXED_RED_BRINESTONE_BRICK_WALL = wall("mixed_red_brinestone_small_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    //  red brinestone shingles
    val RED_BRINESTONE_SHINGLES = simple("red_brinestone_shingles", Blocks.NETHER_BRICKS)
    val RED_BRINESTONE_SHINGLE_STAIRS = stairs("red_brinestone_shingle_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val RED_BRINESTONE_SHINGLE_SLAB = slab("red_brinestone_shingle_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val RED_BRINESTONE_SHINGLE_WALL = wall("red_brinestone_shingle_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    //  mixed red brinestone shingles
    val MIXED_RED_BRINESTONE_SHINGLES = simple("mixed_red_brinestone_shingles", Blocks.NETHER_BRICKS)
    val MIXED_RED_BRINESTONE_SHINGLE_STAIRS = stairs("mixed_red_brinestone_shingle_stairs", Blocks.BRICKS, Blocks.NETHER_BRICKS, DyeColor.RED)
    val MIXED_RED_BRINESTONE_SHINGLE_SLAB = slab("mixed_red_brinestone_shingle_slab", Blocks.NETHER_BRICKS, DyeColor.RED)
    val MIXED_RED_BRINESTONE_SHINGLE_WALL = wall("mixed_red_brinestone_shingle_wall", Blocks.NETHER_BRICK_WALL, DyeColor.RED)

    val RED_BRINESTONE_CHIMNEY = chimney("red_brinestone_chimney", Blocks.NETHER_BRICKS, DyeColor.RED)

    val MEDIUM_ORANGE_BRINESTONE_BRICKS = simple("medium_orange_brinestone_bricks", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_ORANGE_BRINESTONE_BRICK_STAIRS = stairs("medium_orange_brinestone_brick_stairs", Blocks.MUD_BRICKS, Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_ORANGE_BRINESTONE_BRICK_SLAB = slab("medium_orange_brinestone_brick_slab", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_ORANGE_BRINESTONE_BRICK_WALL = wall("medium_orange_brinestone_brick_wall", Blocks.MUD_BRICK_WALL, DyeColor.BROWN)

    val MEDIUM_MIXED_ORANGE_BRINESTONE_BRICKS = simple("medium_mixed_orange_brinestone_bricks", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_MIXED_ORANGE_BRINESTONE_BRICK_STAIRS = stairs("medium_mixed_orange_brinestone_brick_stairs", Blocks.MUD_BRICKS, Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_MIXED_ORANGE_BRINESTONE_BRICK_SLAB = slab("medium_mixed_orange_brinestone_brick_slab", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_MIXED_ORANGE_BRINESTONE_BRICK_WALL = wall("medium_mixed_orange_brinestone_brick_wall", Blocks.MUD_BRICK_WALL, DyeColor.BROWN)

    // small nether bricks
    val SMALL_ORANGE_BRINESTONE_BRICKS = simple("small_orange_brinestone_bricks", Blocks.NETHER_BRICKS, DyeColor.ORANGE)
    val SMALL_ORANGE_BRINESTONE_BRICK_STAIRS = stairs("small_orange_brinestone_brick_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.ORANGE)
    val SMALL_ORANGE_BRINESTONE_BRICK_SLAB = slab("small_orange_brinestone_brick_slab", Blocks.NETHER_BRICKS, DyeColor.ORANGE)
    val SMALL_ORANGE_BRINESTONE_BRICK_WALL = wall("small_orange_brinestone_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.ORANGE)

    // nether brick variants
    val CRACKED_MEDIUM_ORANGE_BRINESTONE_BRICKS = simple("cracked_medium_orange_brinestone_bricks", Blocks.MUD_BRICKS)
    val CRACKED_MEDIUM_ORANGE_BRINESTONE_BRICK_STAIRS = stairs("cracked_medium_orange_brinestone_brick_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.ORANGE)
    val CRACKED_MEDIUM_ORANGE_BRINESTONE_BRICK_SLAB = slab("cracked_medium_orange_brinestone_brick_slab", Blocks.NETHER_BRICKS, DyeColor.ORANGE)
    val CRACKED_MEDIUM_ORANGE_BRINESTONE_BRICK_WALL = wall("cracked_medium_orange_brinestone_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.ORANGE)

    val BASKETWEAVE_ORANGE_BRINESTONE_BRICKS = simple("basketweave_orange_brinestone_bricks", Blocks.NETHER_BRICKS, DyeColor.ORANGE)
    val PINWHEEL_ORANGE_BRINESTONE_BRICKS = simple("pinwheel_orange_brinestone_bricks", Blocks.NETHER_BRICKS, DyeColor.ORANGE)
    val JACK_ON_JACK_ORANGE_BRINESTONE_BRICKS = simple("jack_on_jack_orange_brinestone_bricks", Blocks.NETHER_BRICKS, DyeColor.ORANGE)

    // mixed nether bricks
    val MIXED_ORANGE_BRINESTONE_BRICKS = simple("mixed_orange_brinestone_bricks", Blocks.NETHER_BRICKS, DyeColor.ORANGE)
    val MIXED_ORANGE_BRINESTONE_BRICK_STAIRS = stairs("mixed_orange_brinestone_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.ORANGE)
    val MIXED_ORANGE_BRINESTONE_BRICK_SLAB = slab("mixed_orange_brinestone_brick_slab", Blocks.NETHER_BRICKS, DyeColor.ORANGE)
    val MIXED_ORANGE_BRINESTONE_BRICK_WALL = wall("mixed_orange_brinestone_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.ORANGE)

    //  mixed large nether bricks
    val LARGE_MIXED_ORANGE_BRINESTONE_BRICKS = simple("large_mixed_orange_brinestone_bricks", Blocks.NETHER_BRICKS, DyeColor.ORANGE)
    val LARGE_MIXED_ORANGE_BRINESTONE_BRICK_STAIRS = stairs("large_mixed_orange_brinestone_brick_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.ORANGE)
    val LARGE_MIXED_ORANGE_BRINESTONE_BRICK_SLAB = slab("large_mixed_orange_brinestone_brick_slab", Blocks.NETHER_BRICKS, DyeColor.ORANGE)
    val LARGE_MIXED_ORANGE_BRINESTONE_BRICK_WALL = wall("large_mixed_orange_brinestone_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.ORANGE)

    //  mixed small nether bricks
    val SMALL_MIXED_ORANGE_BRINESTONE_BRICKS = simple("small_mixed_orange_brinestone_bricks", Blocks.NETHER_BRICKS, DyeColor.ORANGE)
    val SMALL_MIXED_ORANGE_BRINESTONE_BRICK_STAIRS = stairs("mixed_orange_brinestone_small_brick_stairs", Blocks.BRICKS, Blocks.NETHER_BRICKS, DyeColor.ORANGE)
    val SMALL_MIXED_ORANGE_BRINESTONE_BRICK_SLAB = slab("mixed_orange_brinestone_small_brick_slab", Blocks.NETHER_BRICKS, DyeColor.ORANGE)
    val SMALL_MIXED_ORANGE_BRINESTONE_BRICK_WALL = wall("mixed_orange_brinestone_small_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.ORANGE)

    //  nether shingles
    val ORANGE_BRINESTONE_SHINGLES = simple("orange_brinestone_shingles", Blocks.NETHER_BRICKS)
    val ORANGE_BRINESTONE_SHINGLE_STAIRS = stairs("orange_brinestone_shingle_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.ORANGE)
    val ORANGE_BRINESTONE_SHINGLE_SLAB = slab("orange_brinestone_shingle_slab", Blocks.NETHER_BRICKS, DyeColor.ORANGE)
    val ORANGE_BRINESTONE_SHINGLE_WALL = wall("orange_brinestone_shingle_wall", Blocks.NETHER_BRICK_WALL, DyeColor.ORANGE)

    //  mixed nether shingles
    val MIXED_ORANGE_BRINESTONE_SHINGLES = simple("mixed_orange_brinestone_shingles", Blocks.NETHER_BRICKS)
    val MIXED_ORANGE_BRINESTONE_SHINGLE_STAIRS = stairs("mixed_orange_brinestone_shingle_stairs", Blocks.BRICKS, Blocks.NETHER_BRICKS, DyeColor.ORANGE)
    val MIXED_ORANGE_BRINESTONE_SHINGLE_SLAB = slab("mixed_orange_brinestone_shingle_slab", Blocks.NETHER_BRICKS, DyeColor.ORANGE)
    val MIXED_ORANGE_BRINESTONE_SHINGLE_WALL = wall("mixed_orange_brinestone_shingle_wall", Blocks.NETHER_BRICK_WALL, DyeColor.ORANGE)

    val ORANGE_BRINESTONE_CHIMNEY = chimney("orange_brinestone_chimney", Blocks.NETHER_BRICKS, DyeColor.ORANGE)

    val MEDIUM_YELLOW_BRINESTONE_BRICKS = simple("medium_yellow_brinestone_bricks", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_YELLOW_BRINESTONE_BRICK_STAIRS = stairs("medium_yellow_brinestone_brick_stairs", Blocks.MUD_BRICKS, Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_YELLOW_BRINESTONE_BRICK_SLAB = slab("medium_yellow_brinestone_brick_slab", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_YELLOW_BRINESTONE_BRICK_WALL = wall("medium_yellow_brinestone_brick_wall", Blocks.MUD_BRICK_WALL, DyeColor.BROWN)

    val MEDIUM_MIXED_YELLOW_BRINESTONE_BRICKS = simple("medium_mixed_yellow_brinestone_bricks", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_MIXED_YELLOW_BRINESTONE_BRICK_STAIRS = stairs("medium_mixed_yellow_brinestone_brick_stairs", Blocks.MUD_BRICKS, Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_MIXED_YELLOW_BRINESTONE_BRICK_SLAB = slab("medium_mixed_yellow_brinestone_brick_slab", Blocks.MUD_BRICKS, DyeColor.BROWN)
    val MEDIUM_MIXED_YELLOW_BRINESTONE_BRICK_WALL = wall("medium_mixed_yellow_brinestone_brick_wall", Blocks.MUD_BRICK_WALL, DyeColor.BROWN)

    // small nether bricks
    val SMALL_YELLOW_BRINESTONE_BRICKS = simple("small_yellow_brinestone_bricks", Blocks.NETHER_BRICKS, DyeColor.YELLOW)
    val SMALL_YELLOW_BRINESTONE_BRICK_STAIRS = stairs("small_yellow_brinestone_brick_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.YELLOW)
    val SMALL_YELLOW_BRINESTONE_BRICK_SLAB = slab("small_yellow_brinestone_brick_slab", Blocks.NETHER_BRICKS, DyeColor.YELLOW)
    val SMALL_YELLOW_BRINESTONE_BRICK_WALL = wall("small_yellow_brinestone_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.YELLOW)

    // nether brick variants
    val CRACKED_MEDIUM_YELLOW_BRINESTONE_BRICKS = simple("cracked_medium_yellow_brinestone_bricks", Blocks.MUD_BRICKS)
    val CRACKED_MEDIUM_YELLOW_BRINESTONE_BRICK_STAIRS = stairs("cracked_medium_yellow_brinestone_brick_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.YELLOW)
    val CRACKED_MEDIUM_YELLOW_BRINESTONE_BRICK_SLAB = slab("cracked_medium_yellow_brinestone_brick_slab", Blocks.NETHER_BRICKS, DyeColor.YELLOW)
    val CRACKED_MEDIUM_YELLOW_BRINESTONE_BRICK_WALL = wall("cracked_medium_yellow_brinestone_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.YELLOW)

    val BASKETWEAVE_YELLOW_BRINESTONE_BRICKS = simple("basketweave_yellow_brinestone_bricks", Blocks.NETHER_BRICKS, DyeColor.YELLOW)
    val PINWHEEL_YELLOW_BRINESTONE_BRICKS = simple("pinwheel_yellow_brinestone_bricks", Blocks.NETHER_BRICKS, DyeColor.YELLOW)
    val JACK_ON_JACK_YELLOW_BRINESTONE_BRICKS = simple("jack_on_jack_yellow_brinestone_bricks", Blocks.NETHER_BRICKS, DyeColor.YELLOW)

    // mixed nether bricks
    val MIXED_YELLOW_BRINESTONE_BRICKS = simple("mixed_yellow_brinestone_bricks", Blocks.NETHER_BRICKS, DyeColor.YELLOW)
    val MIXED_YELLOW_BRINESTONE_BRICK_STAIRS = stairs("mixed_yellow_brinestone_brick_stairs", Blocks.BRICKS, Blocks.BRICKS, DyeColor.YELLOW)
    val MIXED_YELLOW_BRINESTONE_BRICK_SLAB = slab("mixed_yellow_brinestone_brick_slab", Blocks.NETHER_BRICKS, DyeColor.YELLOW)
    val MIXED_YELLOW_BRINESTONE_BRICK_WALL = wall("mixed_yellow_brinestone_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.YELLOW)

    //  mixed large nether bricks
    val LARGE_MIXED_YELLOW_BRINESTONE_BRICKS = simple("large_mixed_yellow_brinestone_bricks", Blocks.NETHER_BRICKS, DyeColor.YELLOW)
    val LARGE_MIXED_YELLOW_BRINESTONE_BRICK_STAIRS = stairs("large_mixed_yellow_brinestone_brick_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.YELLOW)
    val LARGE_MIXED_YELLOW_BRINESTONE_BRICK_SLAB = slab("large_mixed_yellow_brinestone_brick_slab", Blocks.NETHER_BRICKS, DyeColor.YELLOW)
    val LARGE_MIXED_YELLOW_BRINESTONE_BRICK_WALL = wall("large_mixed_yellow_brinestone_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.YELLOW)

    //  mixed small nether bricks
    val SMALL_MIXED_YELLOW_BRINESTONE_BRICKS = simple("small_mixed_yellow_brinestone_bricks", Blocks.NETHER_BRICKS, DyeColor.YELLOW)
    val SMALL_MIXED_YELLOW_BRINESTONE_BRICK_STAIRS = stairs("mixed_yellow_brinestone_small_brick_stairs", Blocks.BRICKS, Blocks.NETHER_BRICKS, DyeColor.YELLOW)
    val SMALL_MIXED_YELLOW_BRINESTONE_BRICK_SLAB = slab("mixed_yellow_brinestone_small_brick_slab", Blocks.NETHER_BRICKS, DyeColor.YELLOW)
    val SMALL_MIXED_YELLOW_BRINESTONE_BRICK_WALL = wall("mixed_yellow_brinestone_small_brick_wall", Blocks.NETHER_BRICK_WALL, DyeColor.YELLOW)

    //  nether shingles
    val YELLOW_BRINESTONE_SHINGLES = simple("yellow_brinestone_shingles", Blocks.NETHER_BRICKS)
    val YELLOW_BRINESTONE_SHINGLE_STAIRS = stairs("yellow_brinestone_shingle_stairs", Blocks.NETHER_BRICKS, Blocks.NETHER_BRICKS, DyeColor.YELLOW)
    val YELLOW_BRINESTONE_SHINGLE_SLAB = slab("yellow_brinestone_shingle_slab", Blocks.NETHER_BRICKS, DyeColor.YELLOW)
    val YELLOW_BRINESTONE_SHINGLE_WALL = wall("yellow_brinestone_shingle_wall", Blocks.NETHER_BRICK_WALL, DyeColor.YELLOW)

    //  mixed nether shingles
    val MIXED_YELLOW_BRINESTONE_SHINGLES = simple("mixed_yellow_brinestone_shingles", Blocks.NETHER_BRICKS)
    val MIXED_YELLOW_BRINESTONE_SHINGLE_STAIRS = stairs("mixed_yellow_brinestone_shingle_stairs", Blocks.BRICKS, Blocks.NETHER_BRICKS, DyeColor.YELLOW)
    val MIXED_YELLOW_BRINESTONE_SHINGLE_SLAB = slab("mixed_yellow_brinestone_shingle_slab", Blocks.NETHER_BRICKS, DyeColor.YELLOW)
    val MIXED_YELLOW_BRINESTONE_SHINGLE_WALL = wall("mixed_yellow_brinestone_shingle_wall", Blocks.NETHER_BRICK_WALL, DyeColor.YELLOW)

    val YELLOW_BRINESTONE_CHIMNEY = chimney("yellow_brinestone_chimney", Blocks.NETHER_BRICKS, DyeColor.YELLOW)
    //#endregion

    //#region Wool Sets
    val WHITE_WOOL_STAIRS = stairs("white_wool_stairs", Blocks.WHITE_WOOL, Blocks.WHITE_WOOL, DyeColor.WHITE)
    val WHITE_WOOL_SLAB = slab("white_wool_slab", Blocks.WHITE_WOOL, DyeColor.WHITE)

    val ORANGE_WOOL_STAIRS = stairs("orange_wool_stairs", Blocks.ORANGE_WOOL, Blocks.ORANGE_WOOL, DyeColor.ORANGE)
    val ORANGE_WOOL_SLAB = slab("orange_wool_slab", Blocks.ORANGE_WOOL, DyeColor.ORANGE)

    val MAGENTA_WOOL_STAIRS = stairs("magenta_wool_stairs", Blocks.MAGENTA_WOOL, Blocks.MAGENTA_WOOL, DyeColor.MAGENTA)
    val MAGENTA_WOOL_SLAB = slab("magenta_wool_slab", Blocks.MAGENTA_WOOL, DyeColor.MAGENTA)

    val LIGHT_BLUE_WOOL_STAIRS = stairs("light_blue_wool_stairs", Blocks.LIGHT_BLUE_WOOL, Blocks.LIGHT_BLUE_WOOL, DyeColor.LIGHT_BLUE)
    val LIGHT_BLUE_WOOL_SLAB = slab("light_blue_wool_slab", Blocks.LIGHT_BLUE_WOOL, DyeColor.LIGHT_BLUE)

    val YELLOW_WOOL_STAIRS = stairs("yellow_wool_stairs", Blocks.YELLOW_WOOL, Blocks.YELLOW_WOOL, DyeColor.YELLOW)
    val YELLOW_WOOL_SLAB = slab("yellow_wool_slab", Blocks.YELLOW_WOOL, DyeColor.YELLOW)

    val LIME_WOOL_STAIRS = stairs("lime_wool_stairs", Blocks.LIME_WOOL, Blocks.LIME_WOOL, DyeColor.LIME)
    val LIME_WOOL_SLAB = slab("lime_wool_slab", Blocks.LIME_WOOL, DyeColor.LIME)

    val PINK_WOOL_STAIRS = stairs("pink_wool_stairs", Blocks.PINK_WOOL, Blocks.PINK_WOOL, DyeColor.PINK)
    val PINK_WOOL_SLAB = slab("pink_wool_slab", Blocks.PINK_WOOL, DyeColor.PINK)

    val GRAY_WOOL_STAIRS = stairs("gray_wool_stairs", Blocks.GRAY_WOOL, Blocks.GRAY_WOOL, DyeColor.GRAY)
    val GRAY_WOOL_SLAB = slab("gray_wool_slab", Blocks.GRAY_WOOL, DyeColor.GRAY)

    val LIGHT_GRAY_WOOL_STAIRS = stairs("light_gray_wool_stairs", Blocks.LIGHT_GRAY_WOOL, Blocks.LIGHT_GRAY_WOOL, DyeColor.LIGHT_GRAY)
    val LIGHT_GRAY_WOOL_SLAB = slab("light_gray_wool_slab", Blocks.LIGHT_GRAY_WOOL, DyeColor.LIGHT_GRAY)

    val CYAN_WOOL_STAIRS = stairs("cyan_wool_stairs", Blocks.CYAN_WOOL, Blocks.CYAN_WOOL, DyeColor.CYAN)
    val CYAN_WOOL_SLAB = slab("cyan_wool_slab", Blocks.CYAN_WOOL, DyeColor.CYAN)

    val PURPLE_WOOL_STAIRS = stairs("purple_wool_stairs", Blocks.PURPLE_WOOL, Blocks.PURPLE_WOOL, DyeColor.PURPLE)
    val PURPLE_WOOL_SLAB = slab("purple_wool_slab", Blocks.PURPLE_WOOL, DyeColor.PURPLE)

    val BROWN_WOOL_STAIRS = stairs("brown_wool_stairs", Blocks.BROWN_WOOL, Blocks.BROWN_WOOL, DyeColor.BROWN)
    val BROWN_WOOL_SLAB = slab("brown_wool_slab", Blocks.BROWN_WOOL, DyeColor.BROWN)

    val GREEN_WOOL_STAIRS = stairs("green_wool_stairs", Blocks.GREEN_WOOL, Blocks.GREEN_WOOL, DyeColor.GREEN)
    val GREEN_WOOL_SLAB = slab("green_wool_slab", Blocks.GREEN_WOOL, DyeColor.GREEN)

    val BLUE_WOOL_STAIRS = stairs("blue_wool_stairs", Blocks.BLUE_WOOL, Blocks.BLUE_WOOL, DyeColor.BLUE)
    val BLUE_WOOL_SLAB = slab("blue_wool_slab", Blocks.BLUE_WOOL, DyeColor.BLUE)

    val RED_WOOL_STAIRS = stairs("red_wool_stairs", Blocks.RED_WOOL, Blocks.RED_WOOL, DyeColor.RED)
    val RED_WOOL_SLAB = slab("red_wool_slab", Blocks.RED_WOOL, DyeColor.RED)

    val BLACK_WOOL_STAIRS = stairs("black_wool_stairs", Blocks.BLACK_WOOL, Blocks.BLACK_WOOL, DyeColor.BLACK)
    val BLACK_WOOL_SLAB = slab("black_wool_slab", Blocks.BLACK_WOOL, DyeColor.BLACK)
    //#endregion

    //#region Concrete Sets
    val WHITE_CONCRETE_STAIRS = stairs("white_concrete_stairs", Blocks.WHITE_CONCRETE, Blocks.WHITE_CONCRETE, DyeColor.WHITE)
    val WHITE_CONCRETE_SLAB = slab("white_concrete_slab", Blocks.WHITE_CONCRETE, DyeColor.WHITE)

    val ORANGE_CONCRETE_STAIRS = stairs("orange_concrete_stairs", Blocks.ORANGE_CONCRETE, Blocks.ORANGE_CONCRETE, DyeColor.ORANGE)
    val ORANGE_CONCRETE_SLAB = slab("orange_concrete_slab", Blocks.ORANGE_CONCRETE, DyeColor.ORANGE)

    val MAGENTA_CONCRETE_STAIRS = stairs("magenta_concrete_stairs", Blocks.MAGENTA_CONCRETE, Blocks.MAGENTA_CONCRETE, DyeColor.MAGENTA)
    val MAGENTA_CONCRETE_SLAB = slab("magenta_concrete_slab", Blocks.MAGENTA_CONCRETE, DyeColor.MAGENTA)

    val LIGHT_BLUE_CONCRETE_STAIRS = stairs("light_blue_concrete_stairs", Blocks.LIGHT_BLUE_CONCRETE, Blocks.LIGHT_BLUE_CONCRETE, DyeColor.LIGHT_BLUE)
    val LIGHT_BLUE_CONCRETE_SLAB = slab("light_blue_concrete_slab", Blocks.LIGHT_BLUE_CONCRETE, DyeColor.LIGHT_BLUE)

    val YELLOW_CONCRETE_STAIRS = stairs("yellow_concrete_stairs", Blocks.YELLOW_CONCRETE, Blocks.YELLOW_CONCRETE, DyeColor.YELLOW)
    val YELLOW_CONCRETE_SLAB = slab("yellow_concrete_slab", Blocks.YELLOW_CONCRETE, DyeColor.YELLOW)

    val LIME_CONCRETE_STAIRS = stairs("lime_concrete_stairs", Blocks.LIME_CONCRETE, Blocks.LIME_CONCRETE, DyeColor.LIME)
    val LIME_CONCRETE_SLAB = slab("lime_concrete_slab", Blocks.LIME_CONCRETE, DyeColor.LIME)

    val PINK_CONCRETE_STAIRS = stairs("pink_concrete_stairs", Blocks.PINK_CONCRETE, Blocks.PINK_CONCRETE, DyeColor.PINK)
    val PINK_CONCRETE_SLAB = slab("pink_concrete_slab", Blocks.PINK_CONCRETE, DyeColor.PINK)

    val GRAY_CONCRETE_STAIRS = stairs("gray_concrete_stairs", Blocks.GRAY_CONCRETE, Blocks.GRAY_CONCRETE, DyeColor.GRAY)
    val GRAY_CONCRETE_SLAB = slab("gray_concrete_slab", Blocks.GRAY_CONCRETE, DyeColor.GRAY)

    val LIGHT_GRAY_CONCRETE_STAIRS = stairs("light_gray_concrete_stairs", Blocks.LIGHT_GRAY_CONCRETE, Blocks.LIGHT_GRAY_CONCRETE, DyeColor.LIGHT_GRAY)
    val LIGHT_GRAY_CONCRETE_SLAB = slab("light_gray_concrete_slab", Blocks.LIGHT_GRAY_CONCRETE, DyeColor.LIGHT_GRAY)

    val CYAN_CONCRETE_STAIRS = stairs("cyan_concrete_stairs", Blocks.CYAN_CONCRETE, Blocks.CYAN_CONCRETE, DyeColor.CYAN)
    val CYAN_CONCRETE_SLAB = slab("cyan_concrete_slab", Blocks.CYAN_CONCRETE, DyeColor.CYAN)

    val PURPLE_CONCRETE_STAIRS = stairs("purple_concrete_stairs", Blocks.PURPLE_CONCRETE, Blocks.PURPLE_CONCRETE, DyeColor.PURPLE)
    val PURPLE_CONCRETE_SLAB = slab("purple_concrete_slab", Blocks.PURPLE_CONCRETE, DyeColor.PURPLE)

    val BROWN_CONCRETE_STAIRS = stairs("brown_concrete_stairs", Blocks.BROWN_CONCRETE, Blocks.BROWN_CONCRETE, DyeColor.BROWN)
    val BROWN_CONCRETE_SLAB = slab("brown_concrete_slab", Blocks.BROWN_CONCRETE, DyeColor.BROWN)

    val GREEN_CONCRETE_STAIRS = stairs("green_concrete_stairs", Blocks.GREEN_CONCRETE, Blocks.GREEN_CONCRETE, DyeColor.GREEN)
    val GREEN_CONCRETE_SLAB = slab("green_concrete_slab", Blocks.GREEN_CONCRETE, DyeColor.GREEN)

    val BLUE_CONCRETE_STAIRS = stairs("blue_concrete_stairs", Blocks.BLUE_CONCRETE, Blocks.BLUE_CONCRETE, DyeColor.BLUE)
    val BLUE_CONCRETE_SLAB = slab("blue_concrete_slab", Blocks.BLUE_CONCRETE, DyeColor.BLUE)

    val RED_CONCRETE_STAIRS = stairs("red_concrete_stairs", Blocks.RED_CONCRETE, Blocks.RED_CONCRETE, DyeColor.RED)
    val RED_CONCRETE_SLAB = slab("red_concrete_slab", Blocks.RED_CONCRETE, DyeColor.RED)

    val BLACK_CONCRETE_STAIRS = stairs("black_concrete_stairs", Blocks.BLACK_CONCRETE, Blocks.BLACK_CONCRETE, DyeColor.BLACK)
    val BLACK_CONCRETE_SLAB = slab("black_concrete_slab", Blocks.BLACK_CONCRETE, DyeColor.BLACK)
    //#endregion

    // region Clear Glass
    val CLEAR_GLASS = register("clear_glass") { HBTransparentBlock(copyOf(Blocks.GLASS)) }

    val WHITE_STAINED_CLEAR_GLASS = stainedGlass("white_stained_clear_glass", DyeColor.WHITE, Blocks.WHITE_STAINED_GLASS)
    val ORANGE_STAINED_CLEAR_GLASS = stainedGlass("orange_stained_clear_glass", DyeColor.ORANGE, Blocks.ORANGE_STAINED_GLASS)
    val MAGENTA_STAINED_CLEAR_GLASS = stainedGlass("magenta_stained_clear_glass", DyeColor.MAGENTA, Blocks.MAGENTA_STAINED_GLASS)
    val LIGHT_BLUE_STAINED_CLEAR_GLASS = stainedGlass("light_blue_stained_clear_glass", DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_STAINED_GLASS)
    val YELLOW_STAINED_CLEAR_GLASS = stainedGlass("yellow_stained_clear_glass", DyeColor.YELLOW, Blocks.YELLOW_STAINED_GLASS)
    val LIME_STAINED_CLEAR_GLASS = stainedGlass("lime_stained_clear_glass", DyeColor.LIME, Blocks.LIME_STAINED_GLASS)
    val PINK_STAINED_CLEAR_GLASS = stainedGlass("pink_stained_clear_glass", DyeColor.PINK, Blocks.PINK_STAINED_GLASS)
    val GRAY_STAINED_CLEAR_GLASS = stainedGlass("gray_stained_clear_glass", DyeColor.GRAY, Blocks.GRAY_STAINED_GLASS)
    val LIGHT_GRAY_STAINED_CLEAR_GLASS = stainedGlass("light_gray_stained_clear_glass", DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_STAINED_GLASS)
    val CYAN_STAINED_CLEAR_GLASS = stainedGlass("cyan_stained_clear_glass", DyeColor.CYAN, Blocks.CYAN_STAINED_GLASS)
    val PURPLE_STAINED_CLEAR_GLASS = stainedGlass("purple_stained_clear_glass", DyeColor.PURPLE, Blocks.PURPLE_STAINED_GLASS)
    val BLUE_STAINED_CLEAR_GLASS = stainedGlass("blue_stained_clear_glass", DyeColor.BLUE, Blocks.BLUE_STAINED_GLASS)
    val BROWN_STAINED_CLEAR_GLASS = stainedGlass("brown_stained_clear_glass", DyeColor.BROWN, Blocks.BROWN_STAINED_GLASS)
    val GREEN_STAINED_CLEAR_GLASS = stainedGlass("green_stained_clear_glass", DyeColor.GREEN, Blocks.GREEN_STAINED_GLASS)
    val RED_STAINED_CLEAR_GLASS = stainedGlass("red_stained_clear_glass", DyeColor.RED, Blocks.RED_STAINED_GLASS)
    val BLACK_STAINED_CLEAR_GLASS = stainedGlass("black_stained_clear_glass", DyeColor.BLACK, Blocks.BLACK_STAINED_GLASS)

    val CLEAR_GLASS_PANE = register("clear_glass_pane") { HBBarsBlock(copyOf(Blocks.GLASS_PANE)) }

    val WHITE_STAINED_CLEAR_GLASS_PANE = stainedGlassPane("white_stained_clear_glass_pane", DyeColor.WHITE, Blocks.WHITE_STAINED_GLASS_PANE)
    val ORANGE_STAINED_CLEAR_GLASS_PANE = stainedGlassPane("orange_stained_clear_glass_pane", DyeColor.ORANGE, Blocks.ORANGE_STAINED_GLASS_PANE)
    val MAGENTA_STAINED_CLEAR_GLASS_PANE = stainedGlassPane("magenta_stained_clear_glass_pane", DyeColor.MAGENTA, Blocks.MAGENTA_STAINED_GLASS_PANE)
    val LIGHT_BLUE_STAINED_CLEAR_GLASS_PANE = stainedGlassPane("light_blue_stained_clear_glass_pane", DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_STAINED_GLASS_PANE)
    val YELLOW_STAINED_CLEAR_GLASS_PANE = stainedGlassPane("yellow_stained_clear_glass_pane", DyeColor.YELLOW, Blocks.YELLOW_STAINED_GLASS_PANE)
    val LIME_STAINED_CLEAR_GLASS_PANE = stainedGlassPane("lime_stained_clear_glass_pane", DyeColor.LIME, Blocks.LIME_STAINED_GLASS_PANE)
    val PINK_STAINED_CLEAR_GLASS_PANE = stainedGlassPane("pink_stained_clear_glass_pane", DyeColor.PINK, Blocks.PINK_STAINED_GLASS_PANE)
    val GRAY_STAINED_CLEAR_GLASS_PANE = stainedGlassPane("gray_stained_clear_glass_pane", DyeColor.GRAY, Blocks.GRAY_STAINED_GLASS_PANE)
    val LIGHT_GRAY_STAINED_CLEAR_GLASS_PANE = stainedGlassPane("light_gray_stained_clear_glass_pane", DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_STAINED_GLASS_PANE)
    val CYAN_STAINED_CLEAR_GLASS_PANE = stainedGlassPane("cyan_stained_clear_glass_pane", DyeColor.CYAN, Blocks.CYAN_STAINED_GLASS_PANE)
    val PURPLE_STAINED_CLEAR_GLASS_PANE = stainedGlassPane("purple_stained_clear_glass_pane", DyeColor.PURPLE, Blocks.PURPLE_STAINED_GLASS_PANE)
    val BLUE_STAINED_CLEAR_GLASS_PANE = stainedGlassPane("blue_stained_clear_glass_pane", DyeColor.BLUE, Blocks.BLUE_STAINED_GLASS_PANE)
    val BROWN_STAINED_CLEAR_GLASS_PANE = stainedGlassPane("brown_stained_clear_glass_pane", DyeColor.BROWN, Blocks.BROWN_STAINED_GLASS_PANE)
    val GREEN_STAINED_CLEAR_GLASS_PANE = stainedGlassPane("green_stained_clear_glass_pane", DyeColor.GREEN, Blocks.GREEN_STAINED_GLASS_PANE)
    val RED_STAINED_CLEAR_GLASS_PANE = stainedGlassPane("red_stained_clear_glass_pane", DyeColor.RED, Blocks.RED_STAINED_GLASS_PANE)
    val BLACK_STAINED_CLEAR_GLASS_PANE = stainedGlassPane("black_stained_clear_glass_pane", DyeColor.BLACK, Blocks.BLACK_STAINED_GLASS_PANE)
    // endregion

    private fun copyOf(base: Block): BlockBehaviour.Properties = BlockBehaviour.Properties.ofFullCopy(base)
    private fun copyOf(base: Block, color: DyeColor): BlockBehaviour.Properties = BlockBehaviour.Properties.ofFullCopy(base).mapColor(color)

    private fun simple(id: String, base: Block, color: DyeColor? = null) = register(id) { Block(if (color != null) copyOf(base, color) else copyOf(base)) }
    private fun slab(id: String, base: Block, color: DyeColor? = null) = register(id) { SlabBlock(if (color != null) copyOf(base, color) else copyOf(base)) }
    private fun wall(id: String, base: Block, color: DyeColor? = null) = register(id) { WallBlock(if (color != null) copyOf(base, color) else copyOf(base)) }
    private fun pillar(id: String, base: Block, color: DyeColor? = null) = register(id) { RotatedPillarBlock(if (color != null) copyOf(base, color) else copyOf(base)) }
    private fun stairs(id: String, copyState: Block, base: Block, color: DyeColor? = null) = register(id) { HBStairBlock(copyState.defaultBlockState(), if (color != null) copyOf(base, color) else copyOf(base)) }
    private fun stainedGlass(id: String, color: DyeColor, base: Block) = register(id) { StainedGlassBlock(color, copyOf(base)) }
    private fun stainedGlassPane(id: String, color: DyeColor, base: Block) = register(id) { StainedGlassPaneBlock(color, copyOf(base)) }
    private fun chimney(id: String, base: Block, color: DyeColor? = null) = register(id) { ChimneyBlock(2, if (color != null) copyOf(base, color) else copyOf(base)) }

    private fun register(id: String, block: Supplier<Block>): RegistryObject<Block> {
        return CommonClass.BLOCKS.register(id, block)
    }
}
