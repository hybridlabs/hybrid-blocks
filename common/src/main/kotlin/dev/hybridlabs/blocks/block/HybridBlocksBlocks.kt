package dev.hybridlabs.blocks.block

import dev.hybridlabs.blocks.CommonClass
import dev.hybridlabs.blocks.platform.registration.RegistryObject
import net.minecraft.world.item.DyeColor
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.block.RotatedPillarBlock
import net.minecraft.world.level.block.SlabBlock
import net.minecraft.world.level.block.StainedGlassBlock
import net.minecraft.world.level.block.StainedGlassPaneBlock
import net.minecraft.world.level.block.WallBlock
import net.minecraft.world.level.block.state.BlockBehaviour
import java.util.function.Supplier

/**
 * All Hybrid Blocks blocks.
 */
object HybridBlocksBlocks {
    
    val POLISHED_CALCITE = register("polished_calcite") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).mapColor(DyeColor.WHITE))}
    val POLISHED_CALCITE_STAIRS = register("polished_calcite_stairs") { HBStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).mapColor(DyeColor.WHITE)) }
    val POLISHED_CALCITE_SLAB = register("polished_calcite_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).mapColor(DyeColor.WHITE)) }
    val POLISHED_CALCITE_BRICKS = register("polished_calcite_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).mapColor(DyeColor.WHITE))}
    val POLISHED_CALCITE_BRICK_STAIRS = register("polished_calcite_brick_stairs") { HBStairBlock(Blocks.CALCITE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).mapColor(DyeColor.WHITE))}
    val POLISHED_CALCITE_BRICK_SLAB = register("polished_calcite_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).mapColor(DyeColor.WHITE))}
    val POLISHED_CALCITE_TILES = register("polished_calcite_tiles") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).mapColor(DyeColor.WHITE))}
    val POLISHED_CALCITE_TILE_STAIRS = register("polished_calcite_tile_stairs") { HBStairBlock(Blocks.CALCITE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).mapColor(DyeColor.WHITE))}
    val POLISHED_CALCITE_TILE_SLAB = register("polished_calcite_tile_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE).mapColor(DyeColor.WHITE))}
    
    // region Quartz
    val QUARTZ_BRICK_STAIRS = register("quartz_brick_stairs") { HBStairBlock(Blocks.QUARTZ_BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS))}
    val QUARTZ_BRICK_SLAB = register("quartz_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BRICKS))}

    val WHITE_QUARTZ_BLOCK = register("white_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE))}
    val WHITE_QUARTZ_STAIRS = register("white_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE)) }
    val WHITE_QUARTZ_SLAB = register("white_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE)) }
    val CHISELED_WHITE_QUARTZ_BLOCK = register("chiseled_white_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE))}
    val WHITE_QUARTZ_BRICKS = register("white_quartz_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE))}
    val WHITE_QUARTZ_BRICK_STAIRS = register("white_quartz_brick_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE))}
    val WHITE_QUARTZ_BRICK_SLAB = register("white_quartz_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE))}
    val WHITE_QUARTZ_PILLAR = register("white_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.WHITE)) }
    val SMOOTH_WHITE_QUARTZ = register("smooth_white_quartz") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.WHITE))}
    val SMOOTH_WHITE_QUARTZ_STAIRS = register("smooth_white_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE))}
    val SMOOTH_WHITE_QUARTZ_SLAB = register("smooth_white_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE))}
    val WHITE_QUARTZ_TILES = register("white_quartz_tiles") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE))}
    val WHITE_QUARTZ_TILE_STAIRS = register("white_quartz_tile_stairs") { HBStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE))}
    val WHITE_QUARTZ_TILE_SLAB = register("white_quartz_tile_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE))}

    val ORANGE_QUARTZ_BLOCK = register("orange_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.ORANGE))}
    val ORANGE_QUARTZ_STAIRS = register("orange_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.ORANGE))}
    val ORANGE_QUARTZ_SLAB = register("orange_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.ORANGE))}
    val CHISELED_ORANGE_QUARTZ_BLOCK = register("chiseled_orange_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.ORANGE))}
    val ORANGE_QUARTZ_BRICKS = register("orange_quartz_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.ORANGE))}
    val ORANGE_QUARTZ_BRICK_STAIRS = register("orange_quartz_brick_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.ORANGE))}
    val ORANGE_QUARTZ_BRICK_SLAB = register("orange_quartz_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.ORANGE))}
    val ORANGE_QUARTZ_PILLAR = register("orange_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.ORANGE))}
    val SMOOTH_ORANGE_QUARTZ = register("smooth_orange_quartz") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.ORANGE))}
    val SMOOTH_ORANGE_QUARTZ_STAIRS = register("smooth_orange_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.ORANGE))}
    val SMOOTH_ORANGE_QUARTZ_SLAB = register("smooth_orange_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.ORANGE))}
    val ORANGE_QUARTZ_TILES = register("orange_quartz_tiles") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.ORANGE))}
    val ORANGE_QUARTZ_TILE_STAIRS = register("orange_quartz_tile_stairs") { HBStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.ORANGE))}
    val ORANGE_QUARTZ_TILE_SLAB = register("orange_quartz_tile_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.ORANGE))}

    val MAGENTA_QUARTZ_BLOCK = register("magenta_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.MAGENTA))}
    val MAGENTA_QUARTZ_STAIRS = register("magenta_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.MAGENTA))}
    val MAGENTA_QUARTZ_SLAB = register("magenta_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.MAGENTA))}
    val CHISELED_MAGENTA_QUARTZ_BLOCK = register("chiseled_magenta_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.MAGENTA))}
    val MAGENTA_QUARTZ_BRICKS = register("magenta_quartz_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.MAGENTA))}
    val MAGENTA_QUARTZ_BRICK_STAIRS = register("magenta_quartz_brick_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.MAGENTA))}
    val MAGENTA_QUARTZ_BRICK_SLAB = register("magenta_quartz_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.MAGENTA))}
    val MAGENTA_QUARTZ_PILLAR = register("magenta_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.MAGENTA))}
    val SMOOTH_MAGENTA_QUARTZ = register("smooth_magenta_quartz") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.MAGENTA))}
    val SMOOTH_MAGENTA_QUARTZ_STAIRS = register("smooth_magenta_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.MAGENTA))}
    val SMOOTH_MAGENTA_QUARTZ_SLAB = register("smooth_magenta_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.MAGENTA))}
    val MAGENTA_QUARTZ_TILES = register("magenta_quartz_tiles") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.MAGENTA))}
    val MAGENTA_QUARTZ_TILE_STAIRS = register("magenta_quartz_tile_stairs") { HBStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.MAGENTA))}
    val MAGENTA_QUARTZ_TILE_SLAB = register("magenta_quartz_tile_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.MAGENTA))}

    val LIGHT_BLUE_QUARTZ_BLOCK = register("light_blue_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE))}
    val LIGHT_BLUE_QUARTZ_STAIRS = register("light_blue_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE))}
    val LIGHT_BLUE_QUARTZ_SLAB = register("light_blue_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE))}
    val CHISELED_LIGHT_BLUE_QUARTZ_BLOCK = register("chiseled_light_blue_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE))}
    val LIGHT_BLUE_QUARTZ_BRICKS = register("light_blue_quartz_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE))}
    val LIGHT_BLUE_QUARTZ_BRICK_STAIRS = register("light_blue_quartz_brick_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE))}
    val LIGHT_BLUE_QUARTZ_BRICK_SLAB = register("light_blue_quartz_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE))}
    val LIGHT_BLUE_QUARTZ_PILLAR = register("light_blue_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.LIGHT_BLUE))}
    val SMOOTH_LIGHT_BLUE_QUARTZ = register("smooth_light_blue_quartz") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.LIGHT_BLUE))}
    val SMOOTH_LIGHT_BLUE_QUARTZ_STAIRS = register("smooth_light_blue_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE))}
    val SMOOTH_LIGHT_BLUE_QUARTZ_SLAB = register("smooth_light_blue_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE))}
    val LIGHT_BLUE_QUARTZ_TILES = register("light_blue_quartz_tiles") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE))}
    val LIGHT_BLUE_QUARTZ_TILE_STAIRS = register("light_blue_quartz_tile_stairs") { HBStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE))}
    val LIGHT_BLUE_QUARTZ_TILE_SLAB = register("light_blue_quartz_tile_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE))}

    val YELLOW_QUARTZ_BLOCK = register("yellow_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.YELLOW))}
    val YELLOW_QUARTZ_STAIRS = register("yellow_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.YELLOW))}
    val YELLOW_QUARTZ_SLAB = register("yellow_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.YELLOW))}
    val CHISELED_YELLOW_QUARTZ_BLOCK = register("chiseled_yellow_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.YELLOW))}
    val YELLOW_QUARTZ_BRICKS = register("yellow_quartz_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.YELLOW))}
    val YELLOW_QUARTZ_BRICK_STAIRS = register("yellow_quartz_brick_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.YELLOW))}
    val YELLOW_QUARTZ_BRICK_SLAB = register("yellow_quartz_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.YELLOW))}
    val YELLOW_QUARTZ_PILLAR = register("yellow_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.YELLOW))}
    val SMOOTH_YELLOW_QUARTZ = register("smooth_yellow_quartz") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.YELLOW))}
    val SMOOTH_YELLOW_QUARTZ_STAIRS = register("smooth_yellow_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.YELLOW))}
    val SMOOTH_YELLOW_QUARTZ_SLAB = register("smooth_yellow_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.YELLOW))}
    val YELLOW_QUARTZ_TILES = register("yellow_quartz_tiles") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.YELLOW))}
    val YELLOW_QUARTZ_TILE_STAIRS = register("yellow_quartz_tile_stairs") { HBStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.YELLOW))}
    val YELLOW_QUARTZ_TILE_SLAB = register("yellow_quartz_tile_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.YELLOW))}

    val LIME_QUARTZ_BLOCK = register("lime_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIME))}
    val LIME_QUARTZ_STAIRS = register("lime_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIME))}
    val LIME_QUARTZ_SLAB = register("lime_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIME))}
    val CHISELED_LIME_QUARTZ_BLOCK = register("chiseled_lime_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIME))}
    val LIME_QUARTZ_BRICKS = register("lime_quartz_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIME))}
    val LIME_QUARTZ_BRICK_STAIRS = register("lime_quartz_brick_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIME))}
    val LIME_QUARTZ_BRICK_SLAB = register("lime_quartz_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIME))}
    val LIME_QUARTZ_PILLAR = register("lime_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.LIME))}
    val SMOOTH_LIME_QUARTZ = register("smooth_lime_quartz") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.LIME))}
    val SMOOTH_LIME_QUARTZ_STAIRS = register("smooth_lime_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIME))}
    val SMOOTH_LIME_QUARTZ_SLAB = register("smooth_lime_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIME))}
    val LIME_QUARTZ_TILES = register("lime_quartz_tiles") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIME))}
    val LIME_QUARTZ_TILE_STAIRS = register("lime_quartz_tile_stairs") { HBStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIME))}
    val LIME_QUARTZ_TILE_SLAB = register("lime_quartz_tile_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIME))}

    val PINK_QUARTZ_BLOCK = register("pink_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PINK))}
    val PINK_QUARTZ_STAIRS = register("pink_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PINK))}
    val PINK_QUARTZ_SLAB = register("pink_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PINK))}
    val CHISELED_PINK_QUARTZ_BLOCK = register("chiseled_pink_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PINK))}
    val PINK_QUARTZ_BRICKS = register("pink_quartz_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PINK))}
    val PINK_QUARTZ_BRICK_STAIRS = register("pink_quartz_brick_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PINK))}
    val PINK_QUARTZ_BRICK_SLAB = register("pink_quartz_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PINK))}
    val PINK_QUARTZ_PILLAR = register("pink_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.PINK))}
    val SMOOTH_PINK_QUARTZ = register("smooth_pink_quartz") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.PINK))}
    val SMOOTH_PINK_QUARTZ_STAIRS = register("smooth_pink_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PINK))}
    val SMOOTH_PINK_QUARTZ_SLAB = register("smooth_pink_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PINK))}
    val PINK_QUARTZ_TILES = register("pink_quartz_tiles") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PINK))}
    val PINK_QUARTZ_TILE_STAIRS = register("pink_quartz_tile_stairs") { HBStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PINK))}
    val PINK_QUARTZ_TILE_SLAB = register("pink_quartz_tile_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PINK))}

    val GRAY_QUARTZ_BLOCK = register("gray_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GRAY))}
    val GRAY_QUARTZ_STAIRS = register("gray_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GRAY))}
    val GRAY_QUARTZ_SLAB = register("gray_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GRAY))}
    val CHISELED_GRAY_QUARTZ_BLOCK = register("chiseled_gray_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GRAY))}
    val GRAY_QUARTZ_BRICKS = register("gray_quartz_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GRAY))}
    val GRAY_QUARTZ_BRICK_STAIRS = register("gray_quartz_brick_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GRAY))}
    val GRAY_QUARTZ_BRICK_SLAB = register("gray_quartz_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GRAY))}
    val GRAY_QUARTZ_PILLAR = register("gray_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.GRAY))}
    val SMOOTH_GRAY_QUARTZ = register("smooth_gray_quartz") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.GRAY))}
    val SMOOTH_GRAY_QUARTZ_STAIRS = register("smooth_gray_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GRAY))}
    val SMOOTH_GRAY_QUARTZ_SLAB = register("smooth_gray_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GRAY))}
    val GRAY_QUARTZ_TILES = register("gray_quartz_tiles") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GRAY))}
    val GRAY_QUARTZ_TILE_STAIRS = register("gray_quartz_tile_stairs") { HBStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GRAY))}
    val GRAY_QUARTZ_TILE_SLAB = register("gray_quartz_tile_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GRAY))}

    val LIGHT_GRAY_QUARTZ_BLOCK = register("light_gray_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_GRAY))}
    val LIGHT_GRAY_QUARTZ_STAIRS = register("light_gray_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_GRAY))}
    val LIGHT_GRAY_QUARTZ_SLAB = register("light_gray_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_GRAY))}
    val CHISELED_LIGHT_GRAY_QUARTZ_BLOCK = register("chiseled_light_gray_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_GRAY))}
    val LIGHT_GRAY_QUARTZ_BRICKS = register("light_gray_quartz_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_GRAY))}
    val LIGHT_GRAY_QUARTZ_BRICK_STAIRS = register("light_gray_quartz_brick_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_GRAY))}
    val LIGHT_GRAY_QUARTZ_BRICK_SLAB = register("light_gray_quartz_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_GRAY))}
    val LIGHT_GRAY_QUARTZ_PILLAR = register("light_gray_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.LIGHT_GRAY))}
    val SMOOTH_LIGHT_GRAY_QUARTZ = register("smooth_light_gray_quartz") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.LIGHT_GRAY))}
    val SMOOTH_LIGHT_GRAY_QUARTZ_STAIRS = register("smooth_light_gray_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_GRAY))}
    val SMOOTH_LIGHT_GRAY_QUARTZ_SLAB = register("smooth_light_gray_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_GRAY))}
    val LIGHT_GRAY_QUARTZ_TILES = register("light_gray_quartz_tiles") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.YELLOW))}
    val LIGHT_GRAY_QUARTZ_TILE_STAIRS = register("light_gray_quartz_tile_stairs") { HBStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_GRAY))}
    val LIGHT_GRAY_QUARTZ_TILE_SLAB = register("light_gray_quartz_tile_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_GRAY))}

    val CYAN_QUARTZ_BLOCK = register("cyan_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.CYAN))}
    val CYAN_QUARTZ_STAIRS = register("cyan_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.CYAN))}
    val CYAN_QUARTZ_SLAB = register("cyan_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.CYAN))}
    val CHISELED_CYAN_QUARTZ_BLOCK = register("chiseled_cyan_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.CYAN))}
    val CYAN_QUARTZ_BRICKS = register("cyan_quartz_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.CYAN))}
    val CYAN_QUARTZ_BRICK_STAIRS = register("cyan_quartz_brick_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.CYAN))}
    val CYAN_QUARTZ_BRICK_SLAB = register("cyan_quartz_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.CYAN))}
    val CYAN_QUARTZ_PILLAR = register("cyan_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.CYAN))}
    val SMOOTH_CYAN_QUARTZ = register("smooth_cyan_quartz") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.CYAN))}
    val SMOOTH_CYAN_QUARTZ_STAIRS = register("smooth_cyan_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.CYAN))}
    val SMOOTH_CYAN_QUARTZ_SLAB = register("smooth_cyan_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.CYAN))}
    val CYAN_QUARTZ_TILES = register("cyan_quartz_tiles") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.CYAN))}
    val CYAN_QUARTZ_TILE_STAIRS = register("cyan_quartz_tile_stairs") { HBStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.CYAN))}
    val CYAN_QUARTZ_TILE_SLAB = register("cyan_quartz_tile_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.CYAN))}

    val PURPLE_QUARTZ_BLOCK = register("purple_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PURPLE))}
    val PURPLE_QUARTZ_STAIRS = register("purple_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PURPLE))}
    val PURPLE_QUARTZ_SLAB = register("purple_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PURPLE))}
    val CHISELED_PURPLE_QUARTZ_BLOCK = register("chiseled_purple_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PURPLE))}
    val PURPLE_QUARTZ_BRICKS = register("purple_quartz_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PURPLE))}
    val PURPLE_QUARTZ_BRICK_STAIRS = register("purple_quartz_brick_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PURPLE))}
    val PURPLE_QUARTZ_BRICK_SLAB = register("purple_quartz_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PURPLE))}
    val PURPLE_QUARTZ_PILLAR = register("purple_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.PURPLE))}
    val SMOOTH_PURPLE_QUARTZ = register("smooth_purple_quartz") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.PURPLE))}
    val SMOOTH_PURPLE_QUARTZ_STAIRS = register("smooth_purple_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PURPLE))}
    val SMOOTH_PURPLE_QUARTZ_SLAB = register("smooth_purple_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PURPLE))}
    val PURPLE_QUARTZ_TILES = register("purple_quartz_tiles") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PURPLE))}
    val PURPLE_QUARTZ_TILE_STAIRS = register("purple_quartz_tile_stairs") { HBStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PURPLE))}
    val PURPLE_QUARTZ_TILE_SLAB = register("purple_quartz_tile_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PURPLE))}

    val BLUE_QUARTZ_BLOCK = register("blue_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLUE))}
    val BLUE_QUARTZ_STAIRS = register("blue_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLUE))}
    val BLUE_QUARTZ_SLAB = register("blue_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLUE))}
    val CHISELED_BLUE_QUARTZ_BLOCK = register("chiseled_blue_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLUE))}
    val BLUE_QUARTZ_BRICKS = register("blue_quartz_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLUE))}
    val BLUE_QUARTZ_BRICK_STAIRS = register("blue_quartz_brick_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLUE))}
    val BLUE_QUARTZ_BRICK_SLAB = register("blue_quartz_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLUE))}
    val BLUE_QUARTZ_PILLAR = register("blue_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.BLUE))}
    val SMOOTH_BLUE_QUARTZ = register("smooth_blue_quartz") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.BLUE))}
    val SMOOTH_BLUE_QUARTZ_STAIRS = register("smooth_blue_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLUE))}
    val SMOOTH_BLUE_QUARTZ_SLAB = register("smooth_blue_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLUE))}
    val BLUE_QUARTZ_TILES = register("blue_quartz_tiles") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLUE))}
    val BLUE_QUARTZ_TILE_STAIRS = register("blue_quartz_tile_stairs") { HBStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLUE))}
    val BLUE_QUARTZ_TILE_SLAB = register("blue_quartz_tile_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLUE))}

    val BROWN_QUARTZ_BLOCK = register("brown_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BROWN))}
    val BROWN_QUARTZ_STAIRS = register("brown_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BROWN))}
    val BROWN_QUARTZ_SLAB = register("brown_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BROWN))}
    val CHISELED_BROWN_QUARTZ_BLOCK = register("chiseled_brown_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BROWN))}
    val BROWN_QUARTZ_BRICKS = register("brown_quartz_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BROWN))}
    val BROWN_QUARTZ_BRICK_STAIRS = register("brown_quartz_brick_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BROWN))}
    val BROWN_QUARTZ_BRICK_SLAB = register("brown_quartz_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BROWN))}
    val BROWN_QUARTZ_PILLAR = register("brown_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.BROWN))}
    val SMOOTH_BROWN_QUARTZ = register("smooth_brown_quartz") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.BROWN))}
    val SMOOTH_BROWN_QUARTZ_STAIRS = register("smooth_brown_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BROWN))}
    val SMOOTH_BROWN_QUARTZ_SLAB = register("smooth_brown_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BROWN))}
    val BROWN_QUARTZ_TILES = register("brown_quartz_tiles") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BROWN))}
    val BROWN_QUARTZ_TILE_STAIRS = register("brown_quartz_tile_stairs") { HBStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BROWN))}
    val BROWN_QUARTZ_TILE_SLAB = register("brown_quartz_tile_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BROWN))}

    val GREEN_QUARTZ_BLOCK = register("green_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GREEN))}
    val GREEN_QUARTZ_STAIRS = register("green_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GREEN))}
    val GREEN_QUARTZ_SLAB = register("green_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GREEN))}
    val CHISELED_GREEN_QUARTZ_BLOCK = register("chiseled_green_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GREEN))}
    val GREEN_QUARTZ_BRICKS = register("green_quartz_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GREEN))}
    val GREEN_QUARTZ_BRICK_STAIRS = register("green_quartz_brick_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GREEN))}
    val GREEN_QUARTZ_BRICK_SLAB = register("green_quartz_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GREEN))}
    val GREEN_QUARTZ_PILLAR = register("green_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.GREEN))}
    val SMOOTH_GREEN_QUARTZ = register("smooth_green_quartz") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.GREEN))}
    val SMOOTH_GREEN_QUARTZ_STAIRS = register("smooth_green_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GREEN))}
    val SMOOTH_GREEN_QUARTZ_SLAB = register("smooth_green_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GREEN))}
    val GREEN_QUARTZ_TILES = register("green_quartz_tiles") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GREEN))}
    val GREEN_QUARTZ_TILE_STAIRS = register("green_quartz_tile_stairs") { HBStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GREEN))}
    val GREEN_QUARTZ_TILE_SLAB = register("green_quartz_tile_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GREEN))}

    val RED_QUARTZ_BLOCK = register("red_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.RED))}
    val RED_QUARTZ_STAIRS = register("red_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.RED))}
    val RED_QUARTZ_SLAB = register("red_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.RED))}
    val CHISELED_RED_QUARTZ_BLOCK = register("chiseled_red_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.RED))}
    val RED_QUARTZ_BRICKS = register("red_quartz_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.RED))}
    val RED_QUARTZ_BRICK_STAIRS = register("red_quartz_brick_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.RED))}
    val RED_QUARTZ_BRICK_SLAB = register("red_quartz_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.RED))}
    val RED_QUARTZ_PILLAR = register("red_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.RED))}
    val SMOOTH_RED_QUARTZ = register("smooth_red_quartz") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.RED))}
    val SMOOTH_RED_QUARTZ_STAIRS = register("smooth_red_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.RED))}
    val SMOOTH_RED_QUARTZ_SLAB = register("smooth_red_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.RED))}
    val RED_QUARTZ_TILES = register("red_quartz_tiles") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.RED))}
    val RED_QUARTZ_TILE_STAIRS = register("red_quartz_tile_stairs") { HBStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.RED))}
    val RED_QUARTZ_TILE_SLAB = register("red_quartz_tile_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.RED))}

    val BLACK_QUARTZ_BLOCK = register("black_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLACK))}
    val BLACK_QUARTZ_STAIRS = register("black_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLACK))}
    val BLACK_QUARTZ_SLAB = register("black_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLACK))}
    val CHISELED_BLACK_QUARTZ_BLOCK = register("chiseled_black_quartz_block") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLACK))}
    val BLACK_QUARTZ_BRICKS = register("black_quartz_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLACK))}
    val BLACK_QUARTZ_BRICK_STAIRS = register("black_quartz_brick_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLACK))}
    val BLACK_QUARTZ_BRICK_SLAB = register("black_quartz_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLACK))}
    val BLACK_QUARTZ_PILLAR = register("black_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.BLACK))}
    val SMOOTH_BLACK_QUARTZ = register("smooth_black_quartz") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.BLACK))}
    val SMOOTH_BLACK_QUARTZ_STAIRS = register("smooth_black_quartz_stairs") { HBStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLACK))}
    val SMOOTH_BLACK_QUARTZ_SLAB = register("smooth_black_quartz_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLACK))}
    val BLACK_QUARTZ_TILES = register("black_quartz_tiles") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLACK))}
    val BLACK_QUARTZ_TILE_STAIRS = register("black_quartz_tile_stairs") { HBStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLACK))}
    val BLACK_QUARTZ_TILE_SLAB = register("black_quartz_tile_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLACK))}

    // endregion

    //#region All Bricks

    //#region Bricks
    //  large bricks
    val LARGE_BRICKS = register("large_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val LARGE_BRICK_STAIRS = register("large_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val LARGE_BRICK_SLAB = register("large_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val LARGE_BRICK_WALL = register("large_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    // small bricks
    val SMALL_BRICKS = register("small_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_BRICK_STAIRS = register("small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val SMALL_BRICK_SLAB = register("small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_BRICK_WALL = register("small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    // brick variants
    val CRACKED_BRICKS = register("cracked_bricks") {
        Block(
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
        )
    }

    val CRACKED_BRICK_STAIRS = register("cracked_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val CRACKED_BRICK_SLAB = register("cracked_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val CRACKED_BRICK_WALL = register("cracked_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    val BASKETWEAVE_BRICKS = register("basketweave_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val PINWHEEL_BRICKS = register("pinwheel_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val JACK_ON_JACK_BRICKS = register("jack_on_jack_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    // mixed bricks
    val MIXED_BRICKS = register("mixed_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val MIXED_BRICK_STAIRS = register("mixed_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val MIXED_BRICK_SLAB = register("mixed_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val MIXED_BRICK_WALL = register("mixed_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  mixed large bricks
    val LARGE_MIXED_BRICKS = register("large_mixed_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val LARGE_MIXED_BRICK_STAIRS = register("large_mixed_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val LARGE_MIXED_BRICK_SLAB = register("large_mixed_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val LARGE_MIXED_BRICK_WALL = register("large_mixed_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  mixed small bricks
    val SMALL_MIXED_BRICKS = register("small_mixed_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_MIXED_BRICK_STAIRS = register("small_mixed_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val SMALL_MIXED_BRICK_SLAB = register("small_mixed_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_MIXED_BRICK_WALL = register("small_mixed_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  shingles
    val SHINGLES = register("shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val SHINGLE_STAIRS = register("shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val SHINGLE_SLAB = register("shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SHINGLE_WALL = register("shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  mixed shingles
    val MIXED_SHINGLES = register("mixed_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val MIXED_SHINGLE_STAIRS = register("mixed_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val MIXED_SHINGLE_SLAB = register("mixed_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val MIXED_SHINGLE_WALL = register("mixed_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    val BRICK_CHIMNEY = register("brick_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.RED)
        )
    }
    //#endregion

    //#region Nether Bricks
    //  large nether bricks
    val LARGE_NETHER_BRICKS = register("large_nether_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val LARGE_NETHER_BRICK_STAIRS = register("large_nether_brick_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val LARGE_NETHER_BRICK_SLAB = register("large_nether_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val LARGE_NETHER_BRICK_WALL = register("large_nether_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    // small nether bricks
    val SMALL_NETHER_BRICKS = register("small_nether_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_NETHER_BRICK_STAIRS = register("nether_small_brick_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val SMALL_NETHER_BRICK_SLAB = register("nether_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_NETHER_BRICK_WALL = register("nether_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    // nether brick variants
    val CRACKED_NETHER_BRICK_STAIRS = register("cracked_nether_brick_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val CRACKED_NETHER_BRICK_SLAB = register("cracked_nether_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val CRACKED_NETHER_BRICK_WALL = register("cracked_nether_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }
    val BASKETWEAVE_NETHER_BRICKS = register("basketweave_nether_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val PINWHEEL_NETHER_BRICKS = register("pinwheel_nether_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val JACK_ON_JACK_NETHER_BRICKS = register("jack_on_jack_nether_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    // mixed nether bricks
    val MIXED_NETHER_BRICKS = register("mixed_nether_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val MIXED_NETHER_BRICK_STAIRS = register("mixed_nether_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val MIXED_NETHER_BRICK_SLAB = register("mixed_nether_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val MIXED_NETHER_BRICK_WALL = register("mixed_nether_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  mixed large nether bricks
    val LARGE_MIXED_NETHER_BRICKS = register("large_mixed_nether_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val LARGE_MIXED_NETHER_BRICK_STAIRS = register("large_mixed_nether_brick_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val LARGE_MIXED_NETHER_BRICK_SLAB = register("large_mixed_nether_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val LARGE_MIXED_NETHER_BRICK_WALL = register("large_mixed_nether_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  mixed small nether bricks
    val SMALL_MIXED_NETHER_BRICKS = register("small_mixed_nether_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_MIXED_NETHER_BRICK_STAIRS = register("mixed_nether_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val SMALL_MIXED_NETHER_BRICK_SLAB = register("mixed_nether_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_MIXED_NETHER_BRICK_WALL = register("mixed_nether_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  nether shingles
    val NETHER_SHINGLES = register("nether_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
        )
    }

    val NETHER_SHINGLE_STAIRS = register("nether_shingle_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val NETHER_SHINGLE_SLAB = register("nether_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val NETHER_SHINGLE_WALL = register("nether_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  mixed nether shingles
    val MIXED_NETHER_SHINGLES = register("mixed_nether_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
        )
    }

    val MIXED_NETHER_SHINGLE_STAIRS = register("mixed_nether_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val MIXED_NETHER_SHINGLE_SLAB = register("mixed_nether_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val MIXED_NETHER_SHINGLE_WALL = register("mixed_nether_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    val NETHER_BRICK_CHIMNEY = register("nether_brick_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }
    //#endregion

    //#region Red_Nether Bricks
    //  large red_nether bricks
    val LARGE_RED_NETHER_BRICKS = register("large_red_nether_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val LARGE_RED_NETHER_BRICK_STAIRS = register("large_red_nether_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.RED_NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val LARGE_RED_NETHER_BRICK_SLAB = register("large_red_nether_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val LARGE_RED_NETHER_BRICK_WALL = register("large_red_nether_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    // small red_nether bricks
    val SMALL_RED_NETHER_BRICKS = register("small_red_nether_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_RED_NETHER_BRICK_STAIRS = register("red_nether_small_brick_stairs") {
        HBStairBlock(
            Blocks.RED_NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.RED_NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val SMALL_RED_NETHER_BRICK_SLAB = register("red_nether_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_RED_NETHER_BRICK_WALL = register("red_nether_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    // red_nether brick variants
    val CRACKED_RED_NETHER_BRICKS = register("cracked_red_nether_bricks") {
        Block(
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.RED_NETHER_BRICKS)
        )
    }

    val CRACKED_RED_NETHER_BRICK_STAIRS = register("cracked_red_nether_brick_stairs") {
        HBStairBlock(
            Blocks.RED_NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.RED_NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val CRACKED_RED_NETHER_BRICK_SLAB = register("cracked_red_nether_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val CRACKED_RED_NETHER_BRICK_WALL = register("cracked_red_nether_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    val BASKETWEAVE_RED_NETHER_BRICKS = register("basketweave_red_nether_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val PINWHEEL_RED_NETHER_BRICKS = register("pinwheel_red_nether_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val JACK_ON_JACK_RED_NETHER_BRICKS = register("jack_on_jack_red_nether_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    // mixed red_nether bricks
    val MIXED_RED_NETHER_BRICKS = register("mixed_red_nether_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val MIXED_RED_NETHER_BRICK_STAIRS = register("mixed_red_nether_brick_stairs") {
        HBStairBlock(
            Blocks.RED_NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.RED_NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val MIXED_RED_NETHER_BRICK_SLAB = register("mixed_red_nether_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val MIXED_RED_NETHER_BRICK_WALL = register("mixed_red_nether_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  mixed large red_nether bricks
    val LARGE_MIXED_RED_NETHER_BRICKS = register("large_mixed_red_nether_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val LARGE_MIXED_RED_NETHER_BRICK_STAIRS = register("large_mixed_red_nether_brick_stairs") {
        HBStairBlock(
            Blocks.RED_NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.RED_NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val LARGE_MIXED_RED_NETHER_BRICK_SLAB = register("large_mixed_red_nether_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val LARGE_MIXED_RED_NETHER_BRICK_WALL = register("large_mixed_red_nether_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  mixed small red_nether bricks
    val SMALL_MIXED_RED_NETHER_BRICKS = register("small_mixed_red_nether_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_MIXED_RED_NETHER_BRICK_STAIRS = register("small_mixed_red_nether_brick_stairs") {
        HBStairBlock(
            Blocks.RED_NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.RED_NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val SMALL_MIXED_RED_NETHER_BRICK_SLAB = register("small_mixed_red_nether_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_MIXED_RED_NETHER_BRICK_WALL = register("small_mixed_red_nether_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  red_nether shingles
    val RED_NETHER_SHINGLES = register("red_nether_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_NETHER_BRICKS)
        )
    }

    val RED_NETHER_SHINGLE_STAIRS = register("red_nether_shingle_stairs") {
        HBStairBlock(
            Blocks.RED_NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.RED_NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val RED_NETHER_SHINGLE_SLAB = register("red_nether_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val RED_NETHER_SHINGLE_WALL = register("red_nether_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  mixed red_nether shingles
    val MIXED_RED_NETHER_SHINGLES = register("mixed_red_nether_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_NETHER_BRICKS)
        )
    }

    val MIXED_RED_NETHER_SHINGLE_STAIRS = register("mixed_red_nether_shingle_stairs") {
        HBStairBlock(
            Blocks.RED_NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.RED_NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val MIXED_RED_NETHER_SHINGLE_SLAB = register("mixed_red_nether_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val MIXED_RED_NETHER_SHINGLE_WALL = register("mixed_red_nether_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    val RED_NETHER_BRICK_CHIMNEY = register("red_nether_brick_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.RED_NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }
    //#endregion

    //#region Mud Bricks
    val MEDIUM_MUD_BRICKS = register("medium_mud_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MUD_BRICK_STAIRS = register("medium_mud_brick_stairs") {
        HBStairBlock(
            Blocks.MUD_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MUD_BRICK_SLAB = register("medium_mud_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MUD_BRICK_WALL = register("medium_mud_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    //  large mud bricks
    val LARGE_MUD_BRICKS = register("large_mud_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val LARGE_MUD_BRICK_STAIRS = register("large_mud_brick_stairs") {
        HBStairBlock(
            Blocks.MUD_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val LARGE_MUD_BRICK_SLAB = register("large_mud_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val LARGE_MUD_BRICK_WALL = register("large_mud_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    // small mud bricks
    val SMALL_MUD_BRICKS = register("small_mud_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val SMALL_MUD_BRICK_STAIRS = register("small_mud_brick_stairs") {
        HBStairBlock(
            Blocks.MUD_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val SMALL_MUD_BRICK_SLAB = register("small_mud_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val SMALL_MUD_BRICK_WALL = register("small_mud_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    // mud brick variants
    val CRACKED_MEDIUM_MUD_BRICKS = register("cracked_medium_mud_bricks") {
        Block(
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
        )
    }

    val CRACKED_MEDIUM_MUD_BRICK_STAIRS = register("cracked_medium_mud_brick_stairs") {
        HBStairBlock(
            Blocks.MUD_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val CRACKED_MEDIUM_MUD_BRICK_SLAB = register("cracked_medium_mud_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val CRACKED_MEDIUM_MUD_BRICK_WALL = register("cracked_medium_mud_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    val BASKETWEAVE_MUD_BRICKS = register("basketweave_mud_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val PINWHEEL_MUD_BRICKS = register("pinwheel_mud_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val JACK_ON_JACK_MUD_BRICKS = register("jack_on_jack_mud_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    // mixed mud bricks
    val MIXED_MUD_BRICKS = register("mixed_mud_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MIXED_MUD_BRICK_STAIRS = register("mixed_mud_brick_stairs") {
        HBStairBlock(
            Blocks.MUD_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val MIXED_MUD_BRICK_SLAB = register("mixed_mud_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MIXED_MUD_BRICK_WALL = register("mixed_mud_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MIXED_MUD_BRICKS = register("medium_mixed_mud_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MIXED_MUD_BRICK_STAIRS = register("medium_mixed_mud_brick_stairs") {
        HBStairBlock(
            Blocks.MUD_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MIXED_MUD_BRICK_SLAB = register("medium_mixed_mud_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MIXED_MUD_BRICK_WALL = register("medium_mixed_mud_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    //  mixed large mud bricks
    val LARGE_MIXED_MUD_BRICKS = register("large_mixed_mud_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val LARGE_MIXED_MUD_BRICK_STAIRS = register("large_mixed_mud_brick_stairs") {
        HBStairBlock(
            Blocks.MUD_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val LARGE_MIXED_MUD_BRICK_SLAB = register("large_mixed_mud_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val LARGE_MIXED_MUD_BRICK_WALL = register("large_mixed_mud_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    //  mixed small mud bricks
    val SMALL_MIXED_MUD_BRICKS = register("small_mixed_mud_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val SMALL_MIXED_MUD_BRICK_STAIRS = register("mixed_small_mud_brick_stairs") {
        HBStairBlock(
            Blocks.MUD_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val SMALL_MIXED_MUD_BRICK_SLAB = register("mixed_small_mud_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val SMALL_MIXED_MUD_BRICK_WALL = register("mixed_small_mud_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    //  mud shingles
    val MUD_SHINGLES = register("mud_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
        )
    }

    val MUD_SHINGLE_STAIRS = register("mud_shingle_stairs") {
        HBStairBlock(
            Blocks.MUD_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val MUD_SHINGLE_SLAB = register("mud_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MUD_SHINGLE_WALL = register("mud_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    //  mixed mud shingles
    val MIXED_MUD_SHINGLES = register("mixed_mud_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
        )
    }

    val MIXED_MUD_SHINGLE_STAIRS = register("mixed_mud_shingle_stairs") {
        HBStairBlock(
            Blocks.MUD_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val MIXED_MUD_SHINGLE_SLAB = register("mixed_mud_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MIXED_MUD_SHINGLE_WALL = register("mixed_mud_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MUD_BRICK_CHIMNEY = register("mud_brick_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }
    //#endregion

    //#region White Bricks
    val WHITE_BRICKS = register("white_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.WHITE)
        )
    }

    val WHITE_BRICK_STAIRS = register("white_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.WHITE)
        )
    }

    val WHITE_BRICK_SLAB = register("white_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.WHITE)
        )
    }

    val WHITE_BRICK_WALL = register("white_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.WHITE)
        )
    }

    //  large white bricks
    val LARGE_WHITE_BRICKS = register("large_white_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.WHITE)
        )
    }

    val LARGE_WHITE_BRICK_STAIRS = register("large_white_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.WHITE)
        )
    }

    val LARGE_WHITE_BRICK_SLAB = register("large_white_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.WHITE)
        )
    }

    val LARGE_WHITE_BRICK_WALL = register("large_white_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.WHITE)
        )
    }

    // small white bricks
    val SMALL_WHITE_BRICKS = register("small_white_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.WHITE)
        )
    }

    val SMALL_WHITE_BRICK_STAIRS = register("white_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.WHITE)
        )
    }

    val SMALL_WHITE_BRICK_SLAB = register("white_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.WHITE)
        )
    }

    val SMALL_WHITE_BRICK_WALL = register("white_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.WHITE)
        )
    }

    // white brick variants
    val CRACKED_WHITE_BRICKS = register("cracked_white_bricks") {
        Block(
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.WHITE)
        )
    }

    val CRACKED_WHITE_BRICK_STAIRS = register("cracked_white_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val CRACKED_WHITE_BRICK_SLAB = register("cracked_white_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.WHITE)
        )
    }

    val CRACKED_WHITE_BRICK_WALL = register("cracked_white_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.WHITE)
        )
    }

    val BASKETWEAVE_WHITE_BRICKS = register("basketweave_white_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.WHITE)
        )
    }

    val PINWHEEL_WHITE_BRICKS = register("pinwheel_white_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.WHITE)
        )
    }

    val JACK_ON_JACK_WHITE_BRICKS = register("jack_on_jack_white_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.WHITE)
        )
    }

    // mixed white bricks
    val MIXED_WHITE_BRICKS = register("mixed_white_bricks") {
        Block(BlockBehaviour.Properties
        .ofFullCopy(Blocks.BRICKS)
        .mapColor(DyeColor.WHITE)
        )
    }

    val MIXED_WHITE_BRICK_STAIRS = register("mixed_white_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.WHITE)
        )
    }

    val MIXED_WHITE_BRICK_SLAB = register("mixed_white_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.WHITE)
        )
    }

    val MIXED_WHITE_BRICK_WALL = register("mixed_white_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.WHITE)
        )
    }

    //  mixed large white bricks
    val LARGE_MIXED_WHITE_BRICKS = register("large_mixed_white_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.WHITE)
        )
    }

    val LARGE_MIXED_WHITE_BRICK_STAIRS = register("large_mixed_white_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.WHITE)
        )
    }

    val LARGE_MIXED_WHITE_BRICK_SLAB = register("large_mixed_white_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.WHITE)
        )
    }

    val LARGE_MIXED_WHITE_BRICK_WALL = register("large_mixed_white_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.WHITE)
        )
    }

    //  mixed small white bricks
    val SMALL_MIXED_WHITE_BRICKS = register("small_mixed_white_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.WHITE)
        )
    }

    val SMALL_MIXED_WHITE_BRICK_STAIRS = register("mixed_white_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.WHITE)
        )
    }

    val SMALL_MIXED_WHITE_BRICK_SLAB = register("mixed_white_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.WHITE)
        )
    }

    val SMALL_MIXED_WHITE_BRICK_WALL = register("mixed_white_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.WHITE)
        )
    }

    //  white shingles
    val WHITE_SHINGLES = register("white_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val WHITE_SHINGLE_STAIRS = register("white_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.WHITE)
        )
    }

    val WHITE_SHINGLE_SLAB = register("white_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.WHITE)
        )
    }

    val WHITE_SHINGLE_WALL = register("white_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.WHITE)
        )
    }

    //  mixed white shingles
    val MIXED_WHITE_SHINGLES = register("mixed_white_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val MIXED_WHITE_SHINGLE_STAIRS = register("mixed_white_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.WHITE)
        )
    }

    val MIXED_WHITE_SHINGLE_SLAB = register("mixed_white_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.WHITE)
        )
    }

    val MIXED_WHITE_SHINGLE_WALL = register("mixed_white_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.WHITE)
        )
    }

    val WHITE_BRICK_CHIMNEY = register("white_brick_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.WHITE)
        )
    }
    //#endregion

    //#region Orange Bricks
    val ORANGE_BRICKS = register("orange_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val ORANGE_BRICK_STAIRS = register("orange_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.ORANGE)
        )
    }

    val ORANGE_BRICK_SLAB = register("orange_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val ORANGE_BRICK_WALL = register("orange_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.ORANGE)
        )
    }

    //  large orange bricks
    val LARGE_ORANGE_BRICKS = register("large_orange_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val LARGE_ORANGE_BRICK_STAIRS = register("large_orange_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.ORANGE)
        )
    }

    val LARGE_ORANGE_BRICK_SLAB = register("large_orange_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val LARGE_ORANGE_BRICK_WALL = register("large_orange_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.ORANGE)
        )
    }

    // small orange bricks
    val SMALL_ORANGE_BRICKS = register("small_orange_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val SMALL_ORANGE_BRICK_STAIRS = register("orange_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.ORANGE)
        )
    }

    val SMALL_ORANGE_BRICK_SLAB = register("orange_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val SMALL_ORANGE_BRICK_WALL = register("orange_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.ORANGE)
        )
    }

    // orange brick variants
    val CRACKED_ORANGE_BRICKS = register("cracked_orange_bricks") {
        Block(
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
        )
    }

    val CRACKED_ORANGE_BRICK_STAIRS = register("cracked_orange_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.ORANGE)
        )
    }

    val CRACKED_ORANGE_BRICK_SLAB = register("cracked_orange_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val CRACKED_ORANGE_BRICK_WALL = register("cracked_orange_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val BASKETWEAVE_ORANGE_BRICKS = register("basketweave_orange_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val PINWHEEL_ORANGE_BRICKS = register("pinwheel_orange_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val JACK_ON_JACK_ORANGE_BRICKS = register("jack_on_jack_orange_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    // mixed orange bricks
    val MIXED_ORANGE_BRICKS = register("mixed_orange_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val MIXED_ORANGE_BRICK_STAIRS = register("mixed_orange_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.ORANGE)
        )
    }

    val MIXED_ORANGE_BRICK_SLAB = register("mixed_orange_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val MIXED_ORANGE_BRICK_WALL = register("mixed_orange_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.ORANGE)
        )
    }

    //  mixed large orange bricks
    val LARGE_MIXED_ORANGE_BRICKS = register("large_mixed_orange_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val LARGE_MIXED_ORANGE_BRICK_STAIRS = register("large_mixed_orange_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.ORANGE)
        )
    }

    val LARGE_MIXED_ORANGE_BRICK_SLAB = register("large_mixed_orange_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val LARGE_MIXED_ORANGE_BRICK_WALL = register("large_mixed_orange_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.ORANGE)
        )
    }

    //  mixed small orange bricks
    val SMALL_MIXED_ORANGE_BRICKS = register("small_mixed_orange_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val SMALL_MIXED_ORANGE_BRICK_STAIRS = register("mixed_orange_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.ORANGE)
        )
    }

    val SMALL_MIXED_ORANGE_BRICK_SLAB = register("mixed_orange_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val SMALL_MIXED_ORANGE_BRICK_WALL = register("mixed_orange_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.ORANGE)
        )
    }

    //  orange shingles
    val ORANGE_SHINGLES = register("orange_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val ORANGE_SHINGLE_STAIRS = register("orange_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.ORANGE)
        )
    }

    val ORANGE_SHINGLE_SLAB = register("orange_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val ORANGE_SHINGLE_WALL = register("orange_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.ORANGE)
        )
    }

    //  mixed orange shingles
    val MIXED_ORANGE_SHINGLES = register("mixed_orange_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val MIXED_ORANGE_SHINGLE_STAIRS = register("mixed_orange_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.ORANGE)
        )
    }

    val MIXED_ORANGE_SHINGLE_SLAB = register("mixed_orange_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val MIXED_ORANGE_SHINGLE_WALL = register("mixed_orange_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val ORANGE_BRICK_CHIMNEY = register("orange_brick_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.ORANGE)
        )
    }
    //#endregion

    //#region Magenta Bricks
    val MAGENTA_BRICKS = register("magenta_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    val MAGENTA_BRICK_STAIRS = register("magenta_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.MAGENTA)
        )
    }

    val MAGENTA_BRICK_SLAB = register("magenta_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    val MAGENTA_BRICK_WALL = register("magenta_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    //  large magenta bricks
    val LARGE_MAGENTA_BRICKS = register("large_magenta_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    val LARGE_MAGENTA_BRICK_STAIRS = register("large_magenta_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.MAGENTA)
        )
    }

    val LARGE_MAGENTA_BRICK_SLAB = register("large_magenta_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    val LARGE_MAGENTA_BRICK_WALL = register("large_magenta_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    // small magenta bricks
    val SMALL_MAGENTA_BRICKS = register("small_magenta_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    val SMALL_MAGENTA_BRICK_STAIRS = register("magenta_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.MAGENTA)
        )
    }

    val SMALL_MAGENTA_BRICK_SLAB = register("magenta_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    val SMALL_MAGENTA_BRICK_WALL = register("magenta_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    // magenta brick variants
    val CRACKED_MAGENTA_BRICKS = register("cracked_magenta_bricks") {
        Block(
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
        )
    }

    val CRACKED_MAGENTA_BRICK_STAIRS = register("cracked_magenta_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.MAGENTA)
        )
    }

    val CRACKED_MAGENTA_BRICK_SLAB = register("cracked_magenta_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    val CRACKED_MAGENTA_BRICK_WALL = register("cracked_magenta_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    val BASKETWEAVE_MAGENTA_BRICKS = register("basketweave_magenta_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    val PINWHEEL_MAGENTA_BRICKS = register("pinwheel_magenta_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    val JACK_ON_JACK_MAGENTA_BRICKS = register("jack_on_jack_magenta_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    // mixed magenta bricks
    val MIXED_MAGENTA_BRICKS = register("mixed_magenta_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    val MIXED_MAGENTA_BRICK_STAIRS = register("mixed_magenta_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.MAGENTA)
        )
    }

    val MIXED_MAGENTA_BRICK_SLAB = register("mixed_magenta_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    val MIXED_MAGENTA_BRICK_WALL = register("mixed_magenta_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    //  mixed large magenta bricks
    val LARGE_MIXED_MAGENTA_BRICKS = register("large_mixed_magenta_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    val LARGE_MIXED_MAGENTA_BRICK_STAIRS = register("large_mixed_magenta_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.MAGENTA)
        )
    }

    val LARGE_MIXED_MAGENTA_BRICK_SLAB = register("large_mixed_magenta_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    val LARGE_MIXED_MAGENTA_BRICK_WALL = register("large_mixed_magenta_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    //  mixed small magenta bricks
    val SMALL_MIXED_MAGENTA_BRICKS = register("small_mixed_magenta_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    val SMALL_MIXED_MAGENTA_BRICK_STAIRS = register("mixed_magenta_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.MAGENTA)
        )
    }

    val SMALL_MIXED_MAGENTA_BRICK_SLAB = register("mixed_magenta_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    val SMALL_MIXED_MAGENTA_BRICK_WALL = register("mixed_magenta_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    //  magenta shingles
    val MAGENTA_SHINGLES = register("magenta_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val MAGENTA_SHINGLE_STAIRS = register("magenta_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.MAGENTA)
        )
    }

    val MAGENTA_SHINGLE_SLAB = register("magenta_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    val MAGENTA_SHINGLE_WALL = register("magenta_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    //  mixed magenta shingles
    val MIXED_MAGENTA_SHINGLES = register("mixed_magenta_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val MIXED_MAGENTA_SHINGLE_STAIRS = register("mixed_magenta_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.MAGENTA)
        )
    }

    val MIXED_MAGENTA_SHINGLE_SLAB = register("mixed_magenta_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    val MIXED_MAGENTA_SHINGLE_WALL = register("mixed_magenta_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.MAGENTA)
        )
    }

    val MAGENTA_BRICK_CHIMNEY = register("magenta_brick_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.MAGENTA)
        )
    }
    //#endregion

    //#region Light Blue Bricks
    val LIGHT_BLUE_BRICKS = register("light_blue_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val LIGHT_BLUE_BRICK_STAIRS = register("light_blue_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val LIGHT_BLUE_BRICK_SLAB = register("light_blue_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val LIGHT_BLUE_BRICK_WALL = register("light_blue_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    //  large light_blue bricks
    val LARGE_LIGHT_BLUE_BRICKS = register("large_light_blue_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val LARGE_LIGHT_BLUE_BRICK_STAIRS = register("large_light_blue_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val LARGE_LIGHT_BLUE_BRICK_SLAB = register("large_light_blue_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val LARGE_LIGHT_BLUE_BRICK_WALL = register("large_light_blue_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    // small light_blue bricks
    val SMALL_LIGHT_BLUE_BRICKS = register("small_light_blue_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val SMALL_LIGHT_BLUE_BRICK_STAIRS = register("light_blue_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val SMALL_LIGHT_BLUE_BRICK_SLAB = register("light_blue_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val SMALL_LIGHT_BLUE_BRICK_WALL = register("light_blue_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    // light_blue brick variants
    val CRACKED_LIGHT_BLUE_BRICKS = register("cracked_light_blue_bricks") {
        Block(
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
        )
    }

    val CRACKED_LIGHT_BLUE_BRICK_STAIRS = register("cracked_light_blue_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val CRACKED_LIGHT_BLUE_BRICK_SLAB = register("cracked_light_blue_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val CRACKED_LIGHT_BLUE_BRICK_WALL = register("cracked_light_blue_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val BASKETWEAVE_LIGHT_BLUE_BRICKS = register("basketweave_light_blue_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val PINWHEEL_LIGHT_BLUE_BRICKS = register("pinwheel_light_blue_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val JACK_ON_JACK_LIGHT_BLUE_BRICKS = register("jack_on_jack_light_blue_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    // mixed light_blue bricks
    val MIXED_LIGHT_BLUE_BRICKS = register("mixed_light_blue_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val MIXED_LIGHT_BLUE_BRICK_STAIRS = register("mixed_light_blue_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val MIXED_LIGHT_BLUE_BRICK_SLAB = register("mixed_light_blue_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val MIXED_LIGHT_BLUE_BRICK_WALL = register("mixed_light_blue_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    //  mixed large light_blue bricks
    val LARGE_MIXED_LIGHT_BLUE_BRICKS = register("large_mixed_light_blue_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val LARGE_MIXED_LIGHT_BLUE_BRICK_STAIRS = register("large_mixed_light_blue_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val LARGE_MIXED_LIGHT_BLUE_BRICK_SLAB = register("large_mixed_light_blue_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val LARGE_MIXED_LIGHT_BLUE_BRICK_WALL = register("large_mixed_light_blue_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    //  mixed small light_blue bricks
    val SMALL_MIXED_LIGHT_BLUE_BRICKS = register("small_mixed_light_blue_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val SMALL_MIXED_LIGHT_BLUE_BRICK_STAIRS = register("mixed_light_blue_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val SMALL_MIXED_LIGHT_BLUE_BRICK_SLAB = register("mixed_light_blue_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val SMALL_MIXED_LIGHT_BLUE_BRICK_WALL = register("mixed_light_blue_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    //  light_blue shingles
    val LIGHT_BLUE_SHINGLES = register("light_blue_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val LIGHT_BLUE_SHINGLE_STAIRS = register("light_blue_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val LIGHT_BLUE_SHINGLE_SLAB = register("light_blue_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val LIGHT_BLUE_SHINGLE_WALL = register("light_blue_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    //  mixed light_blue shingles
    val MIXED_LIGHT_BLUE_SHINGLES = register("mixed_light_blue_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val MIXED_LIGHT_BLUE_SHINGLE_STAIRS = register("mixed_light_blue_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val MIXED_LIGHT_BLUE_SHINGLE_SLAB = register("mixed_light_blue_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val MIXED_LIGHT_BLUE_SHINGLE_WALL = register("mixed_light_blue_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val LIGHT_BLUE_BRICK_CHIMNEY = register("light_blue_brick_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIGHT_BLUE)
        )
    }
    //#endregion

    //#region Yellow Bricks
    val YELLOW_BRICKS = register("yellow_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val YELLOW_BRICK_STAIRS = register("yellow_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.YELLOW)
        )
    }

    val YELLOW_BRICK_SLAB = register("yellow_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val YELLOW_BRICK_WALL = register("yellow_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.YELLOW)
        )
    }

    //  large yellow bricks
    val LARGE_YELLOW_BRICKS = register("large_yellow_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val LARGE_YELLOW_BRICK_STAIRS = register("large_yellow_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.YELLOW)
        )
    }

    val LARGE_YELLOW_BRICK_SLAB = register("large_yellow_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val LARGE_YELLOW_BRICK_WALL = register("large_yellow_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.YELLOW)
        )
    }

    // small yellow bricks
    val SMALL_YELLOW_BRICKS = register("small_yellow_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val SMALL_YELLOW_BRICK_STAIRS = register("yellow_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.YELLOW)
        )
    }

    val SMALL_YELLOW_BRICK_SLAB = register("yellow_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val SMALL_YELLOW_BRICK_WALL = register("yellow_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.YELLOW)
        )
    }

    // yellow brick variants
    val CRACKED_YELLOW_BRICKS = register("cracked_yellow_bricks") {
        Block(
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
        )
    }

    val CRACKED_YELLOW_BRICK_STAIRS = register("cracked_yellow_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.YELLOW)
        )
    }

    val CRACKED_YELLOW_BRICK_SLAB = register("cracked_yellow_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val CRACKED_YELLOW_BRICK_WALL = register("cracked_yellow_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val BASKETWEAVE_YELLOW_BRICKS = register("basketweave_yellow_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val PINWHEEL_YELLOW_BRICKS = register("pinwheel_yellow_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val JACK_ON_JACK_YELLOW_BRICKS = register("jack_on_jack_yellow_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    // mixed yellow bricks
    val MIXED_YELLOW_BRICKS = register("mixed_yellow_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val MIXED_YELLOW_BRICK_STAIRS = register("mixed_yellow_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.YELLOW)
        )
    }

    val MIXED_YELLOW_BRICK_SLAB = register("mixed_yellow_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val MIXED_YELLOW_BRICK_WALL = register("mixed_yellow_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.YELLOW)
        )
    }

    //  mixed large yellow bricks
    val LARGE_MIXED_YELLOW_BRICKS = register("large_mixed_yellow_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val LARGE_MIXED_YELLOW_BRICK_STAIRS = register("large_mixed_yellow_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.YELLOW)
        )
    }

    val LARGE_MIXED_YELLOW_BRICK_SLAB = register("large_mixed_yellow_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val LARGE_MIXED_YELLOW_BRICK_WALL = register("large_mixed_yellow_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.YELLOW)
        )
    }

    //  mixed small yellow bricks
    val SMALL_MIXED_YELLOW_BRICKS = register("small_mixed_yellow_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val SMALL_MIXED_YELLOW_BRICK_STAIRS = register("mixed_yellow_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.YELLOW)
        )
    }

    val SMALL_MIXED_YELLOW_BRICK_SLAB = register("mixed_yellow_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val SMALL_MIXED_YELLOW_BRICK_WALL = register("mixed_yellow_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.YELLOW)
        )
    }

    //  yellow shingles
    val YELLOW_SHINGLES = register("yellow_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val YELLOW_SHINGLE_STAIRS = register("yellow_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.YELLOW)
        )
    }

    val YELLOW_SHINGLE_SLAB = register("yellow_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val YELLOW_SHINGLE_WALL = register("yellow_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.YELLOW)
        )
    }

    //  mixed yellow shingles
    val MIXED_YELLOW_SHINGLES = register("mixed_yellow_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val MIXED_YELLOW_SHINGLE_STAIRS = register("mixed_yellow_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.YELLOW)
        )
    }

    val MIXED_YELLOW_SHINGLE_SLAB = register("mixed_yellow_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val MIXED_YELLOW_SHINGLE_WALL = register("mixed_yellow_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val YELLOW_BRICK_CHIMNEY = register("yellow_brick_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.YELLOW)
        )
    }
    //#endregion

    //#region Lime Bricks
    val LIME_BRICKS = register("lime_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIME)
        )
    }

    val LIME_BRICK_STAIRS = register("lime_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIME)
        )
    }

    val LIME_BRICK_SLAB = register("lime_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIME)
        )
    }

    val LIME_BRICK_WALL = register("lime_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIME)
        )
    }

    //  large lime bricks
    val LARGE_LIME_BRICKS = register("large_lime_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIME)
        )
    }

    val LARGE_LIME_BRICK_STAIRS = register("large_lime_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIME)
        )
    }

    val LARGE_LIME_BRICK_SLAB = register("large_lime_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIME)
        )
    }

    val LARGE_LIME_BRICK_WALL = register("large_lime_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIME)
        )
    }

    // small lime bricks
    val SMALL_LIME_BRICKS = register("small_lime_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIME)
        )
    }

    val SMALL_LIME_BRICK_STAIRS = register("lime_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIME)
        )
    }

    val SMALL_LIME_BRICK_SLAB = register("lime_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIME)
        )
    }

    val SMALL_LIME_BRICK_WALL = register("lime_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIME)
        )
    }

    // lime brick variants
    val CRACKED_LIME_BRICKS = register("cracked_lime_bricks") {
        Block(
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
        )
    }

    val CRACKED_LIME_BRICK_STAIRS = register("cracked_lime_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIME)
        )
    }

    val CRACKED_LIME_BRICK_SLAB = register("cracked_lime_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIME)
        )
    }

    val CRACKED_LIME_BRICK_WALL = register("cracked_lime_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIME)
        )
    }

    val BASKETWEAVE_LIME_BRICKS = register("basketweave_lime_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIME)
        )
    }

    val PINWHEEL_LIME_BRICKS = register("pinwheel_lime_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIME)
        )
    }

    val JACK_ON_JACK_LIME_BRICKS = register("jack_on_jack_lime_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIME)
        )
    }

    // mixed lime bricks
    val MIXED_LIME_BRICKS = register("mixed_lime_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIME)
        )
    }

    val MIXED_LIME_BRICK_STAIRS = register("mixed_lime_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIME)
        )
    }

    val MIXED_LIME_BRICK_SLAB = register("mixed_lime_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIME)
        )
    }

    val MIXED_LIME_BRICK_WALL = register("mixed_lime_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIME)
        )
    }

    //  mixed large lime bricks
    val LARGE_MIXED_LIME_BRICKS = register("large_mixed_lime_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIME)
        )
    }

    val LARGE_MIXED_LIME_BRICK_STAIRS = register("large_mixed_lime_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIME)
        )
    }

    val LARGE_MIXED_LIME_BRICK_SLAB = register("large_mixed_lime_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIME)
        )
    }

    val LARGE_MIXED_LIME_BRICK_WALL = register("large_mixed_lime_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIME)
        )
    }

    //  mixed small lime bricks
    val SMALL_MIXED_LIME_BRICKS = register("small_mixed_lime_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIME)
        )
    }

    val SMALL_MIXED_LIME_BRICK_STAIRS = register("mixed_lime_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIME)
        )
    }

    val SMALL_MIXED_LIME_BRICK_SLAB = register("mixed_lime_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIME)
        )
    }

    val SMALL_MIXED_LIME_BRICK_WALL = register("mixed_lime_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIME)
        )
    }

    //  lime shingles
    val LIME_SHINGLES = register("lime_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val LIME_SHINGLE_STAIRS = register("lime_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIME)
        )
    }

    val LIME_SHINGLE_SLAB = register("lime_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIME)
        )
    }

    val LIME_SHINGLE_WALL = register("lime_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIME)
        )
    }

    //  mixed lime shingles
    val MIXED_LIME_SHINGLES = register("mixed_lime_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val MIXED_LIME_SHINGLE_STAIRS = register("mixed_lime_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIME)
        )
    }

    val MIXED_LIME_SHINGLE_SLAB = register("mixed_lime_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIME)
        )
    }

    val MIXED_LIME_SHINGLE_WALL = register("mixed_lime_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIME)
        )
    }

    val LIME_BRICK_CHIMNEY = register("lime_brick_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIME)
        )
    }
    //#endregion

    //#region Pink Bricks
    val PINK_BRICKS = register("pink_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PINK)
        )
    }

    val PINK_BRICK_STAIRS = register("pink_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.PINK)
        )
    }

    val PINK_BRICK_SLAB = register("pink_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PINK)
        )
    }

    val PINK_BRICK_WALL = register("pink_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.PINK)
        )
    }

    //  large pink bricks
    val LARGE_PINK_BRICKS = register("large_pink_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PINK)
        )
    }

    val LARGE_PINK_BRICK_STAIRS = register("large_pink_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.PINK)
        )
    }

    val LARGE_PINK_BRICK_SLAB = register("large_pink_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PINK)
        )
    }

    val LARGE_PINK_BRICK_WALL = register("large_pink_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.PINK)
        )
    }

    // small pink bricks
    val SMALL_PINK_BRICKS = register("small_pink_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PINK)
        )
    }

    val SMALL_PINK_BRICK_STAIRS = register("pink_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.PINK)
        )
    }

    val SMALL_PINK_BRICK_SLAB = register("pink_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PINK)
        )
    }

    val SMALL_PINK_BRICK_WALL = register("pink_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.PINK)
        )
    }

    // pink brick variants
    val CRACKED_PINK_BRICKS = register("cracked_pink_bricks") {
        Block(
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
        )
    }

    val CRACKED_PINK_BRICK_STAIRS = register("cracked_pink_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.PINK)
        )
    }

    val CRACKED_PINK_BRICK_SLAB = register("cracked_pink_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PINK)
        )
    }

    val CRACKED_PINK_BRICK_WALL = register("cracked_pink_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.PINK)
        )
    }

    val BASKETWEAVE_PINK_BRICKS = register("basketweave_pink_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PINK)
        )
    }

    val PINWHEEL_PINK_BRICKS = register("pinwheel_pink_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PINK)
        )
    }

    val JACK_ON_JACK_PINK_BRICKS = register("jack_on_jack_pink_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PINK)
        )
    }

    // mixed pink bricks
    val MIXED_PINK_BRICKS = register("mixed_pink_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PINK)
        )
    }

    val MIXED_PINK_BRICK_STAIRS = register("mixed_pink_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.PINK)
        )
    }

    val MIXED_PINK_BRICK_SLAB = register("mixed_pink_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PINK)
        )
    }

    val MIXED_PINK_BRICK_WALL = register("mixed_pink_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.PINK)
        )
    }

    //  mixed large pink bricks
    val LARGE_MIXED_PINK_BRICKS = register("large_mixed_pink_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PINK)
        )
    }

    val LARGE_MIXED_PINK_BRICK_STAIRS = register("large_mixed_pink_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.PINK)
        )
    }

    val LARGE_MIXED_PINK_BRICK_SLAB = register("large_mixed_pink_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PINK)
        )
    }

    val LARGE_MIXED_PINK_BRICK_WALL = register("large_mixed_pink_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.PINK)
        )
    }

    //  mixed small pink bricks
    val SMALL_MIXED_PINK_BRICKS = register("small_mixed_pink_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PINK)
        )
    }

    val SMALL_MIXED_PINK_BRICK_STAIRS = register("mixed_pink_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.PINK)
        )
    }

    val SMALL_MIXED_PINK_BRICK_SLAB = register("mixed_pink_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PINK)
        )
    }

    val SMALL_MIXED_PINK_BRICK_WALL = register("mixed_pink_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.PINK)
        )
    }

    //  pink shingles
    val PINK_SHINGLES = register("pink_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val PINK_SHINGLE_STAIRS = register("pink_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.PINK)
        )
    }

    val PINK_SHINGLE_SLAB = register("pink_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PINK)
        )
    }

    val PINK_SHINGLE_WALL = register("pink_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.PINK)
        )
    }

    //  mixed pink shingles
    val MIXED_PINK_SHINGLES = register("mixed_pink_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val MIXED_PINK_SHINGLE_STAIRS = register("mixed_pink_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.PINK)
        )
    }

    val MIXED_PINK_SHINGLE_SLAB = register("mixed_pink_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PINK)
        )
    }

    val MIXED_PINK_SHINGLE_WALL = register("mixed_pink_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.PINK)
        )
    }

    val PINK_BRICK_CHIMNEY = register("pink_brick_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.PINK)
        )
    }
    //#endregion

    //#region Gray Bricks
    val GRAY_BRICKS = register("gray_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GRAY)
        )
    }

    val GRAY_BRICK_STAIRS = register("gray_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.GRAY)
        )
    }

    val GRAY_BRICK_SLAB = register("gray_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GRAY)
        )
    }

    val GRAY_BRICK_WALL = register("gray_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.GRAY)
        )
    }

    //  large gray bricks
    val LARGE_GRAY_BRICKS = register("large_gray_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GRAY)
        )
    }

    val LARGE_GRAY_BRICK_STAIRS = register("large_gray_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.GRAY)
        )
    }

    val LARGE_GRAY_BRICK_SLAB = register("large_gray_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GRAY)
        )
    }

    val LARGE_GRAY_BRICK_WALL = register("large_gray_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.GRAY)
        )
    }

    // small gray bricks
    val SMALL_GRAY_BRICKS = register("small_gray_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GRAY)
        )
    }

    val SMALL_GRAY_BRICK_STAIRS = register("gray_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.GRAY)
        )
    }

    val SMALL_GRAY_BRICK_SLAB = register("gray_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GRAY)
        )
    }

    val SMALL_GRAY_BRICK_WALL = register("gray_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.GRAY)
        )
    }

    // gray brick variants
    val CRACKED_GRAY_BRICKS = register("cracked_gray_bricks") {
        Block(
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
        )
    }

    val CRACKED_GRAY_BRICK_STAIRS = register("cracked_gray_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.GRAY)
        )
    }

    val CRACKED_GRAY_BRICK_SLAB = register("cracked_gray_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GRAY)
        )
    }

    val CRACKED_GRAY_BRICK_WALL = register("cracked_gray_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.GRAY)
        )
    }

    val BASKETWEAVE_GRAY_BRICKS = register("basketweave_gray_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GRAY)
        )
    }

    val PINWHEEL_GRAY_BRICKS = register("pinwheel_gray_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GRAY)
        )
    }

    val JACK_ON_JACK_GRAY_BRICKS = register("jack_on_jack_gray_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GRAY)
        )
    }

    // mixed gray bricks
    val MIXED_GRAY_BRICKS = register("mixed_gray_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GRAY)
        )
    }

    val MIXED_GRAY_BRICK_STAIRS = register("mixed_gray_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.GRAY)
        )
    }

    val MIXED_GRAY_BRICK_SLAB = register("mixed_gray_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GRAY)
        )
    }

    val MIXED_GRAY_BRICK_WALL = register("mixed_gray_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.GRAY)
        )
    }

    //  mixed large gray bricks
    val LARGE_MIXED_GRAY_BRICKS = register("large_mixed_gray_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GRAY)
        )
    }

    val LARGE_MIXED_GRAY_BRICK_STAIRS = register("large_mixed_gray_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.GRAY)
        )
    }

    val LARGE_MIXED_GRAY_BRICK_SLAB = register("large_mixed_gray_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GRAY)
        )
    }

    val LARGE_MIXED_GRAY_BRICK_WALL = register("large_mixed_gray_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.GRAY)
        )
    }

    //  mixed small gray bricks
    val SMALL_MIXED_GRAY_BRICKS = register("small_mixed_gray_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GRAY)
        )
    }

    val SMALL_MIXED_GRAY_BRICK_STAIRS = register("mixed_gray_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.GRAY)
        )
    }

    val SMALL_MIXED_GRAY_BRICK_SLAB = register("mixed_gray_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GRAY)
        )
    }

    val SMALL_MIXED_GRAY_BRICK_WALL = register("mixed_gray_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.GRAY)
        )
    }

    //  gray shingles
    val GRAY_SHINGLES = register("gray_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val GRAY_SHINGLE_STAIRS = register("gray_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.GRAY)
        )
    }

    val GRAY_SHINGLE_SLAB = register("gray_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GRAY)
        )
    }

    val GRAY_SHINGLE_WALL = register("gray_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.GRAY)
        )
    }

    //  mixed gray shingles
    val MIXED_GRAY_SHINGLES = register("mixed_gray_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val MIXED_GRAY_SHINGLE_STAIRS = register("mixed_gray_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.GRAY)
        )
    }

    val MIXED_GRAY_SHINGLE_SLAB = register("mixed_gray_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GRAY)
        )
    }

    val MIXED_GRAY_SHINGLE_WALL = register("mixed_gray_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.GRAY)
        )
    }

    val GRAY_BRICK_CHIMNEY = register("gray_brick_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.GRAY)
        )
    }
    //#endregion

    //#region Light Gray Bricks
    val LIGHT_GRAY_BRICKS = register("light_gray_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val LIGHT_GRAY_BRICK_STAIRS = register("light_gray_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val LIGHT_GRAY_BRICK_SLAB = register("light_gray_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val LIGHT_GRAY_BRICK_WALL = register("light_gray_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    //  large light_gray bricks
    val LARGE_LIGHT_GRAY_BRICKS = register("large_light_gray_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val LARGE_LIGHT_GRAY_BRICK_STAIRS = register("large_light_gray_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val LARGE_LIGHT_GRAY_BRICK_SLAB = register("large_light_gray_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val LARGE_LIGHT_GRAY_BRICK_WALL = register("large_light_gray_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    // small light_gray bricks
    val SMALL_LIGHT_GRAY_BRICKS = register("small_light_gray_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val SMALL_LIGHT_GRAY_BRICK_STAIRS = register("light_gray_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val SMALL_LIGHT_GRAY_BRICK_SLAB = register("light_gray_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val SMALL_LIGHT_GRAY_BRICK_WALL = register("light_gray_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    // light_gray brick variants
    val CRACKED_LIGHT_GRAY_BRICKS = register("cracked_light_gray_bricks") {
        Block(
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
        )
    }

    val CRACKED_LIGHT_GRAY_BRICK_STAIRS = register("cracked_light_gray_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val CRACKED_LIGHT_GRAY_BRICK_SLAB = register("cracked_light_gray_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val CRACKED_LIGHT_GRAY_BRICK_WALL = register("cracked_light_gray_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val BASKETWEAVE_LIGHT_GRAY_BRICKS = register("basketweave_light_gray_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val PINWHEEL_LIGHT_GRAY_BRICKS = register("pinwheel_light_gray_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val JACK_ON_JACK_LIGHT_GRAY_BRICKS = register("jack_on_jack_light_gray_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    // mixed light_gray bricks
    val MIXED_LIGHT_GRAY_BRICKS = register("mixed_light_gray_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val MIXED_LIGHT_GRAY_BRICK_STAIRS = register("mixed_light_gray_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val MIXED_LIGHT_GRAY_BRICK_SLAB = register("mixed_light_gray_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val MIXED_LIGHT_GRAY_BRICK_WALL = register("mixed_light_gray_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    //  mixed large light_gray bricks
    val LARGE_MIXED_LIGHT_GRAY_BRICKS = register("large_mixed_light_gray_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val LARGE_MIXED_LIGHT_GRAY_BRICK_STAIRS = register("large_mixed_light_gray_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val LARGE_MIXED_LIGHT_GRAY_BRICK_SLAB = register("large_mixed_light_gray_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val LARGE_MIXED_LIGHT_GRAY_BRICK_WALL = register("large_mixed_light_gray_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    //  mixed small light_gray bricks
    val SMALL_MIXED_LIGHT_GRAY_BRICKS = register("small_mixed_light_gray_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val SMALL_MIXED_LIGHT_GRAY_BRICK_STAIRS = register("mixed_light_gray_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val SMALL_MIXED_LIGHT_GRAY_BRICK_SLAB = register("mixed_light_gray_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val SMALL_MIXED_LIGHT_GRAY_BRICK_WALL = register("mixed_light_gray_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    //  light_gray shingles
    val LIGHT_GRAY_SHINGLES = register("light_gray_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val LIGHT_GRAY_SHINGLE_STAIRS = register("light_gray_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val LIGHT_GRAY_SHINGLE_SLAB = register("light_gray_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val LIGHT_GRAY_SHINGLE_WALL = register("light_gray_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    //  mixed light_gray shingles
    val MIXED_LIGHT_GRAY_SHINGLES = register("mixed_light_gray_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val MIXED_LIGHT_GRAY_SHINGLE_STAIRS = register("mixed_light_gray_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val MIXED_LIGHT_GRAY_SHINGLE_SLAB = register("mixed_light_gray_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val MIXED_LIGHT_GRAY_SHINGLE_WALL = register("mixed_light_gray_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val LIGHT_GRAY_BRICK_CHIMNEY = register("light_gray_brick_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.LIGHT_GRAY)
        )
    }
    //#endregion

    //#region Cyan Bricks
    val CYAN_BRICKS = register("cyan_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.CYAN)
        )
    }

    val CYAN_BRICK_STAIRS = register("cyan_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.CYAN)
        )
    }

    val CYAN_BRICK_SLAB = register("cyan_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.CYAN)
        )
    }

    val CYAN_BRICK_WALL = register("cyan_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.CYAN)
        )
    }

    //  large cyan bricks
    val LARGE_CYAN_BRICKS = register("large_cyan_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.CYAN)
        )
    }

    val LARGE_CYAN_BRICK_STAIRS = register("large_cyan_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.CYAN)
        )
    }

    val LARGE_CYAN_BRICK_SLAB = register("large_cyan_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.CYAN)
        )
    }

    val LARGE_CYAN_BRICK_WALL = register("large_cyan_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.CYAN)
        )
    }

    // small cyan bricks
    val SMALL_CYAN_BRICKS = register("small_cyan_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.CYAN)
        )
    }

    val SMALL_CYAN_BRICK_STAIRS = register("cyan_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.CYAN)
        )
    }

    val SMALL_CYAN_BRICK_SLAB = register("cyan_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.CYAN)
        )
    }

    val SMALL_CYAN_BRICK_WALL = register("cyan_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.CYAN)
        )
    }

    // cyan brick variants
    val CRACKED_CYAN_BRICKS = register("cracked_cyan_bricks") {
        Block(
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
        )
    }

    val CRACKED_CYAN_BRICK_STAIRS = register("cracked_cyan_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.CYAN)
        )
    }

    val CRACKED_CYAN_BRICK_SLAB = register("cracked_cyan_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.CYAN)
        )
    }

    val CRACKED_CYAN_BRICK_WALL = register("cracked_cyan_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.CYAN)
        )
    }

    val BASKETWEAVE_CYAN_BRICKS = register("basketweave_cyan_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.CYAN)
        )
    }

    val PINWHEEL_CYAN_BRICKS = register("pinwheel_cyan_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.CYAN)
        )
    }

    val JACK_ON_JACK_CYAN_BRICKS = register("jack_on_jack_cyan_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.CYAN)
        )
    }

    // mixed cyan bricks
    val MIXED_CYAN_BRICKS = register("mixed_cyan_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.CYAN)
        )
    }

    val MIXED_CYAN_BRICK_STAIRS = register("mixed_cyan_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.CYAN)
        )
    }

    val MIXED_CYAN_BRICK_SLAB = register("mixed_cyan_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.CYAN)
        )
    }

    val MIXED_CYAN_BRICK_WALL = register("mixed_cyan_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.CYAN)
        )
    }

    //  mixed large cyan bricks
    val LARGE_MIXED_CYAN_BRICKS = register("large_mixed_cyan_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.CYAN)
        )
    }

    val LARGE_MIXED_CYAN_BRICK_STAIRS = register("large_mixed_cyan_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.CYAN)
        )
    }

    val LARGE_MIXED_CYAN_BRICK_SLAB = register("large_mixed_cyan_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.CYAN)
        )
    }

    val LARGE_MIXED_CYAN_BRICK_WALL = register("large_mixed_cyan_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.CYAN)
        )
    }

    //  mixed small cyan bricks
    val SMALL_MIXED_CYAN_BRICKS = register("small_mixed_cyan_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.CYAN)
        )
    }

    val SMALL_MIXED_CYAN_BRICK_STAIRS = register("mixed_cyan_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.CYAN)
        )
    }

    val SMALL_MIXED_CYAN_BRICK_SLAB = register("mixed_cyan_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.CYAN)
        )
    }

    val SMALL_MIXED_CYAN_BRICK_WALL = register("mixed_cyan_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.CYAN)
        )
    }

    //  cyan shingles
    val CYAN_SHINGLES = register("cyan_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val CYAN_SHINGLE_STAIRS = register("cyan_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.CYAN)
        )
    }

    val CYAN_SHINGLE_SLAB = register("cyan_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.CYAN)
        )
    }

    val CYAN_SHINGLE_WALL = register("cyan_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.CYAN)
        )
    }

    //  mixed cyan shingles
    val MIXED_CYAN_SHINGLES = register("mixed_cyan_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val MIXED_CYAN_SHINGLE_STAIRS = register("mixed_cyan_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.CYAN)
        )
    }

    val MIXED_CYAN_SHINGLE_SLAB = register("mixed_cyan_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.CYAN)
        )
    }

    val MIXED_CYAN_SHINGLE_WALL = register("mixed_cyan_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.CYAN)
        )
    }

    val CYAN_BRICK_CHIMNEY = register("cyan_brick_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.CYAN)
        )
    }
    //#endregion

    //#region Purple Bricks
    val PURPLE_BRICKS = register("purple_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PURPLE)
        )
    }

    val PURPLE_BRICK_STAIRS = register("purple_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.PURPLE)
        )
    }

    val PURPLE_BRICK_SLAB = register("purple_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PURPLE)
        )
    }

    val PURPLE_BRICK_WALL = register("purple_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.PURPLE)
        )
    }

    //  large purple bricks
    val LARGE_PURPLE_BRICKS = register("large_purple_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PURPLE)
        )
    }

    val LARGE_PURPLE_BRICK_STAIRS = register("large_purple_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.PURPLE)
        )
    }

    val LARGE_PURPLE_BRICK_SLAB = register("large_purple_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PURPLE)
        )
    }

    val LARGE_PURPLE_BRICK_WALL = register("large_purple_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.PURPLE)
        )
    }

    // small purple bricks
    val SMALL_PURPLE_BRICKS = register("small_purple_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PURPLE)
        )
    }

    val SMALL_PURPLE_BRICK_STAIRS = register("purple_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.PURPLE)
        )
    }

    val SMALL_PURPLE_BRICK_SLAB = register("purple_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PURPLE)
        )
    }

    val SMALL_PURPLE_BRICK_WALL = register("purple_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.PURPLE)
        )
    }

    // purple brick variants
    val CRACKED_PURPLE_BRICKS = register("cracked_purple_bricks") {
        Block(
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
        )
    }

    val CRACKED_PURPLE_BRICK_STAIRS = register("cracked_purple_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.PURPLE)
        )
    }

    val CRACKED_PURPLE_BRICK_SLAB = register("cracked_purple_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PURPLE)
        )
    }

    val CRACKED_PURPLE_BRICK_WALL = register("cracked_purple_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.PURPLE)
        )
    }

    val BASKETWEAVE_PURPLE_BRICKS = register("basketweave_purple_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PURPLE)
        )
    }

    val PINWHEEL_PURPLE_BRICKS = register("pinwheel_purple_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PURPLE)
        )
    }

    val JACK_ON_JACK_PURPLE_BRICKS = register("jack_on_jack_purple_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PURPLE)
        )
    }

    // mixed purple bricks
    val MIXED_PURPLE_BRICKS = register("mixed_purple_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PURPLE)
        )
    }

    val MIXED_PURPLE_BRICK_STAIRS = register("mixed_purple_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.PURPLE)
        )
    }

    val MIXED_PURPLE_BRICK_SLAB = register("mixed_purple_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PURPLE)
        )
    }

    val MIXED_PURPLE_BRICK_WALL = register("mixed_purple_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.PURPLE)
        )
    }

    //  mixed large purple bricks
    val LARGE_MIXED_PURPLE_BRICKS = register("large_mixed_purple_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PURPLE)
        )
    }

    val LARGE_MIXED_PURPLE_BRICK_STAIRS = register("large_mixed_purple_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.PURPLE)
        )
    }

    val LARGE_MIXED_PURPLE_BRICK_SLAB = register("large_mixed_purple_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PURPLE)
        )
    }

    val LARGE_MIXED_PURPLE_BRICK_WALL = register("large_mixed_purple_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.PURPLE)
        )
    }

    //  mixed small purple bricks
    val SMALL_MIXED_PURPLE_BRICKS = register("small_mixed_purple_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PURPLE)
        )
    }

    val SMALL_MIXED_PURPLE_BRICK_STAIRS = register("mixed_purple_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.PURPLE)
        )
    }

    val SMALL_MIXED_PURPLE_BRICK_SLAB = register("mixed_purple_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PURPLE)
        )
    }

    val SMALL_MIXED_PURPLE_BRICK_WALL = register("mixed_purple_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.PURPLE)
        )
    }

    //  purple shingles
    val PURPLE_SHINGLES = register("purple_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val PURPLE_SHINGLE_STAIRS = register("purple_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.PURPLE)
        )
    }

    val PURPLE_SHINGLE_SLAB = register("purple_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PURPLE)
        )
    }

    val PURPLE_SHINGLE_WALL = register("purple_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.PURPLE)
        )
    }

    //  mixed purple shingles
    val MIXED_PURPLE_SHINGLES = register("mixed_purple_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val MIXED_PURPLE_SHINGLE_STAIRS = register("mixed_purple_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.PURPLE)
        )
    }

    val MIXED_PURPLE_SHINGLE_SLAB = register("mixed_purple_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.PURPLE)
        )
    }

    val MIXED_PURPLE_SHINGLE_WALL = register("mixed_purple_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.PURPLE)
        )
    }

    val PURPLE_BRICK_CHIMNEY = register("purple_brick_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.PURPLE)
        )
    }
    //#endregion

    //#region Blue Bricks
    val BLUE_BRICKS = register("blue_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLUE)
        )
    }

    val BLUE_BRICK_STAIRS = register("blue_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BLUE)
        )
    }

    val BLUE_BRICK_SLAB = register("blue_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLUE)
        )
    }

    val BLUE_BRICK_WALL = register("blue_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BLUE)
        )
    }

    //  large blue bricks
    val LARGE_BLUE_BRICKS = register("large_blue_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLUE)
        )
    }

    val LARGE_BLUE_BRICK_STAIRS = register("large_blue_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BLUE)
        )
    }

    val LARGE_BLUE_BRICK_SLAB = register("large_blue_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLUE)
        )
    }

    val LARGE_BLUE_BRICK_WALL = register("large_blue_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BLUE)
        )
    }

    // small blue bricks
    val SMALL_BLUE_BRICKS = register("small_blue_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLUE)
        )
    }

    val SMALL_BLUE_BRICK_STAIRS = register("blue_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BLUE)
        )
    }

    val SMALL_BLUE_BRICK_SLAB = register("blue_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLUE)
        )
    }

    val SMALL_BLUE_BRICK_WALL = register("blue_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BLUE)
        )
    }

    // blue brick variants
    val CRACKED_BLUE_BRICKS = register("cracked_blue_bricks") {
        Block(
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
        )
    }

    val CRACKED_BLUE_BRICK_STAIRS = register("cracked_blue_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BLUE)
        )
    }

    val CRACKED_BLUE_BRICK_SLAB = register("cracked_blue_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLUE)
        )
    }

    val CRACKED_BLUE_BRICK_WALL = register("cracked_blue_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BLUE)
        )
    }

    val BASKETWEAVE_BLUE_BRICKS = register("basketweave_blue_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLUE)
        )
    }

    val PINWHEEL_BLUE_BRICKS = register("pinwheel_blue_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLUE)
        )
    }

    val JACK_ON_JACK_BLUE_BRICKS = register("jack_on_jack_blue_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLUE)
        )
    }

    // mixed blue bricks
    val MIXED_BLUE_BRICKS = register("mixed_blue_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLUE)
        )
    }

    val MIXED_BLUE_BRICK_STAIRS = register("mixed_blue_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BLUE)
        )
    }

    val MIXED_BLUE_BRICK_SLAB = register("mixed_blue_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLUE)
        )
    }

    val MIXED_BLUE_BRICK_WALL = register("mixed_blue_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BLUE)
        )
    }

    //  mixed large blue bricks
    val LARGE_MIXED_BLUE_BRICKS = register("large_mixed_blue_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLUE)
        )
    }

    val LARGE_MIXED_BLUE_BRICK_STAIRS = register("large_mixed_blue_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BLUE)
        )
    }

    val LARGE_MIXED_BLUE_BRICK_SLAB = register("large_mixed_blue_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLUE)
        )
    }

    val LARGE_MIXED_BLUE_BRICK_WALL = register("large_mixed_blue_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BLUE)
        )
    }

    //  mixed small blue bricks
    val SMALL_MIXED_BLUE_BRICKS = register("small_mixed_blue_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLUE)
        )
    }

    val SMALL_MIXED_BLUE_BRICK_STAIRS = register("mixed_blue_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BLUE)
        )
    }

    val SMALL_MIXED_BLUE_BRICK_SLAB = register("mixed_blue_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLUE)
        )
    }

    val SMALL_MIXED_BLUE_BRICK_WALL = register("mixed_blue_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BLUE)
        )
    }

    //  blue shingles
    val BLUE_SHINGLES = register("blue_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val BLUE_SHINGLE_STAIRS = register("blue_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BLUE)
        )
    }

    val BLUE_SHINGLE_SLAB = register("blue_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLUE)
        )
    }

    val BLUE_SHINGLE_WALL = register("blue_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BLUE)
        )
    }

    //  mixed blue shingles
    val MIXED_BLUE_SHINGLES = register("mixed_blue_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val MIXED_BLUE_SHINGLE_STAIRS = register("mixed_blue_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BLUE)
        )
    }

    val MIXED_BLUE_SHINGLE_SLAB = register("mixed_blue_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLUE)
        )
    }

    val MIXED_BLUE_SHINGLE_WALL = register("mixed_blue_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BLUE)
        )
    }

    val BLUE_BRICK_CHIMNEY = register("blue_brick_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BLUE)
        )
    }
    //#endregion

    //#region Brown Bricks
    val BROWN_BRICKS = register("brown_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val BROWN_BRICK_STAIRS = register("brown_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val BROWN_BRICK_SLAB = register("brown_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val BROWN_BRICK_WALL = register("brown_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    //  large brown bricks
    val LARGE_BROWN_BRICKS = register("large_brown_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val LARGE_BROWN_BRICK_STAIRS = register("large_brown_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val LARGE_BROWN_BRICK_SLAB = register("large_brown_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val LARGE_BROWN_BRICK_WALL = register("large_brown_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    // small brown bricks
    val SMALL_BROWN_BRICKS = register("small_brown_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val SMALL_BROWN_BRICK_STAIRS = register("brown_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val SMALL_BROWN_BRICK_SLAB = register("brown_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val SMALL_BROWN_BRICK_WALL = register("brown_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    // brown brick variants
    val CRACKED_BROWN_BRICKS = register("cracked_brown_bricks") {
        Block(
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
        )
    }

    val CRACKED_BROWN_BRICK_STAIRS = register("cracked_brown_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val CRACKED_BROWN_BRICK_SLAB = register("cracked_brown_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val CRACKED_BROWN_BRICK_WALL = register("cracked_brown_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    val BASKETWEAVE_BROWN_BRICKS = register("basketweave_brown_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val PINWHEEL_BROWN_BRICKS = register("pinwheel_brown_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val JACK_ON_JACK_BROWN_BRICKS = register("jack_on_jack_brown_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    // mixed brown bricks
    val MIXED_BROWN_BRICKS = register("mixed_brown_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MIXED_BROWN_BRICK_STAIRS = register("mixed_brown_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val MIXED_BROWN_BRICK_SLAB = register("mixed_brown_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MIXED_BROWN_BRICK_WALL = register("mixed_brown_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    //  mixed large brown bricks
    val LARGE_MIXED_BROWN_BRICKS = register("large_mixed_brown_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val LARGE_MIXED_BROWN_BRICK_STAIRS = register("large_mixed_brown_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val LARGE_MIXED_BROWN_BRICK_SLAB = register("large_mixed_brown_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val LARGE_MIXED_BROWN_BRICK_WALL = register("large_mixed_brown_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    //  mixed small brown bricks
    val SMALL_MIXED_BROWN_BRICKS = register("small_mixed_brown_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val SMALL_MIXED_BROWN_BRICK_STAIRS = register("mixed_brown_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val SMALL_MIXED_BROWN_BRICK_SLAB = register("mixed_brown_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val SMALL_MIXED_BROWN_BRICK_WALL = register("mixed_brown_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    //  brown shingles
    val BROWN_SHINGLES = register("brown_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val BROWN_SHINGLE_STAIRS = register("brown_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val BROWN_SHINGLE_SLAB = register("brown_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val BROWN_SHINGLE_WALL = register("brown_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    //  mixed brown shingles
    val MIXED_BROWN_SHINGLES = register("mixed_brown_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val MIXED_BROWN_SHINGLE_STAIRS = register("mixed_brown_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val MIXED_BROWN_SHINGLE_SLAB = register("mixed_brown_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MIXED_BROWN_SHINGLE_WALL = register("mixed_brown_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    val BROWN_BRICK_CHIMNEY = register("brown_brick_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }
    //#endregion

    //#region Green Bricks
    val GREEN_BRICKS = register("green_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GREEN)
        )
    }

    val GREEN_BRICK_STAIRS = register("green_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.GREEN)
        )
    }

    val GREEN_BRICK_SLAB = register("green_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GREEN)
        )
    }

    val GREEN_BRICK_WALL = register("green_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.GREEN)
        )
    }

    //  large green bricks
    val LARGE_GREEN_BRICKS = register("large_green_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GREEN)
        )
    }

    val LARGE_GREEN_BRICK_STAIRS = register("large_green_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.GREEN)
        )
    }

    val LARGE_GREEN_BRICK_SLAB = register("large_green_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GREEN)
        )
    }

    val LARGE_GREEN_BRICK_WALL = register("large_green_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.GREEN)
        )
    }

    // small green bricks
    val SMALL_GREEN_BRICKS = register("small_green_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GREEN)
        )
    }

    val SMALL_GREEN_BRICK_STAIRS = register("green_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.GREEN)
        )
    }

    val SMALL_GREEN_BRICK_SLAB = register("green_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GREEN)
        )
    }

    val SMALL_GREEN_BRICK_WALL = register("green_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.GREEN)
        )
    }

    // green brick variants
    val CRACKED_GREEN_BRICKS = register("cracked_green_bricks") {
        Block(
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
        )
    }

    val CRACKED_GREEN_BRICK_STAIRS = register("cracked_green_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.GREEN)
        )
    }

    val CRACKED_GREEN_BRICK_SLAB = register("cracked_green_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GREEN)
        )
    }

    val CRACKED_GREEN_BRICK_WALL = register("cracked_green_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.GREEN)
        )
    }

    val BASKETWEAVE_GREEN_BRICKS = register("basketweave_green_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GREEN)
        )
    }

    val PINWHEEL_GREEN_BRICKS = register("pinwheel_green_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GREEN)
        )
    }

    val JACK_ON_JACK_GREEN_BRICKS = register("jack_on_jack_green_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GREEN)
        )
    }

    // mixed green bricks
    val MIXED_GREEN_BRICKS = register("mixed_green_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GREEN)
        )
    }

    val MIXED_GREEN_BRICK_STAIRS = register("mixed_green_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.GREEN)
        )
    }

    val MIXED_GREEN_BRICK_SLAB = register("mixed_green_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GREEN)
        )
    }

    val MIXED_GREEN_BRICK_WALL = register("mixed_green_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.GREEN)
        )
    }

    //  mixed large green bricks
    val LARGE_MIXED_GREEN_BRICKS = register("large_mixed_green_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GREEN)
        )
    }

    val LARGE_MIXED_GREEN_BRICK_STAIRS = register("large_mixed_green_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.GREEN)
        )
    }

    val LARGE_MIXED_GREEN_BRICK_SLAB = register("large_mixed_green_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GREEN)
        )
    }

    val LARGE_MIXED_GREEN_BRICK_WALL = register("large_mixed_green_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.GREEN)
        )
    }

    //  mixed small green bricks
    val SMALL_MIXED_GREEN_BRICKS = register("small_mixed_green_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GREEN)
        )
    }

    val SMALL_MIXED_GREEN_BRICK_STAIRS = register("mixed_green_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.GREEN)
        )
    }

    val SMALL_MIXED_GREEN_BRICK_SLAB = register("mixed_green_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GREEN)
        )
    }

    val SMALL_MIXED_GREEN_BRICK_WALL = register("mixed_green_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.GREEN)
        )
    }

    //  green shingles
    val GREEN_SHINGLES = register("green_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val GREEN_SHINGLE_STAIRS = register("green_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.GREEN)
        )
    }

    val GREEN_SHINGLE_SLAB = register("green_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GREEN)
        )
    }

    val GREEN_SHINGLE_WALL = register("green_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.GREEN)
        )
    }

    //  mixed green shingles
    val MIXED_GREEN_SHINGLES = register("mixed_green_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val MIXED_GREEN_SHINGLE_STAIRS = register("mixed_green_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.GREEN)
        )
    }

    val MIXED_GREEN_SHINGLE_SLAB = register("mixed_green_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.GREEN)
        )
    }

    val MIXED_GREEN_SHINGLE_WALL = register("mixed_green_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.GREEN)
        )
    }

    val GREEN_BRICK_CHIMNEY = register("green_brick_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.GREEN)
        )
    }
    //#endregion

    //#region Red Bricks
    val RED_BRICKS = register("red_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val RED_BRICK_STAIRS = register("red_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val RED_BRICK_SLAB = register("red_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val RED_BRICK_WALL = register("red_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  large red bricks
    val LARGE_RED_BRICKS = register("large_red_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val LARGE_RED_BRICK_STAIRS = register("large_red_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val LARGE_RED_BRICK_SLAB = register("large_red_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val LARGE_RED_BRICK_WALL = register("large_red_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    // small red bricks
    val SMALL_RED_BRICKS = register("small_red_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_RED_BRICK_STAIRS = register("red_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val SMALL_RED_BRICK_SLAB = register("red_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_RED_BRICK_WALL = register("red_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    // red brick variants
    val CRACKED_RED_BRICKS = register("cracked_red_bricks") {
        Block(
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
        )
    }

    val CRACKED_RED_BRICK_STAIRS = register("cracked_red_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val CRACKED_RED_BRICK_SLAB = register("cracked_red_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val CRACKED_RED_BRICK_WALL = register("cracked_red_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    val BASKETWEAVE_RED_BRICKS = register("basketweave_red_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val PINWHEEL_RED_BRICKS = register("pinwheel_red_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val JACK_ON_JACK_RED_BRICKS = register("jack_on_jack_red_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    // mixed red bricks
    val MIXED_RED_BRICKS = register("mixed_red_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val MIXED_RED_BRICK_STAIRS = register("mixed_red_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val MIXED_RED_BRICK_SLAB = register("mixed_red_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val MIXED_RED_BRICK_WALL = register("mixed_red_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  mixed large red bricks
    val LARGE_MIXED_RED_BRICKS = register("large_mixed_red_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val LARGE_MIXED_RED_BRICK_STAIRS = register("large_mixed_red_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val LARGE_MIXED_RED_BRICK_SLAB = register("large_mixed_red_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val LARGE_MIXED_RED_BRICK_WALL = register("large_mixed_red_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  mixed small red bricks
    val SMALL_MIXED_RED_BRICKS = register("small_mixed_red_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_MIXED_RED_BRICK_STAIRS = register("mixed_red_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val SMALL_MIXED_RED_BRICK_SLAB = register("mixed_red_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_MIXED_RED_BRICK_WALL = register("mixed_red_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  red shingles
    val RED_SHINGLES = register("red_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val RED_SHINGLE_STAIRS = register("red_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val RED_SHINGLE_SLAB = register("red_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val RED_SHINGLE_WALL = register("red_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  mixed red shingles
    val MIXED_RED_SHINGLES = register("mixed_red_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val MIXED_RED_SHINGLE_STAIRS = register("mixed_red_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val MIXED_RED_SHINGLE_SLAB = register("mixed_red_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val MIXED_RED_SHINGLE_WALL = register("mixed_red_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    val RED_BRICK_CHIMNEY = register("red_brick_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.RED)
        )
    }
    //#endregion

    //#region Black Bricks
    val BLACK_BRICKS = register("black_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLACK)
        )
    }

    val BLACK_BRICK_STAIRS = register("black_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BLACK)
        )
    }

    val BLACK_BRICK_SLAB = register("black_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLACK)
        )
    }

    val BLACK_BRICK_WALL = register("black_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BLACK)
        )
    }

    //  large black bricks
    val LARGE_BLACK_BRICKS = register("large_black_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLACK)
        )
    }

    val LARGE_BLACK_BRICK_STAIRS = register("large_black_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BLACK)
        )
    }

    val LARGE_BLACK_BRICK_SLAB = register("large_black_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLACK)
        )
    }

    val LARGE_BLACK_BRICK_WALL = register("large_black_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BLACK)
        )
    }

    // small black bricks
    val SMALL_BLACK_BRICKS = register("small_black_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLACK)
        )
    }

    val SMALL_BLACK_BRICK_STAIRS = register("black_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BLACK)
        )
    }

    val SMALL_BLACK_BRICK_SLAB = register("black_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLACK)
        )
    }

    val SMALL_BLACK_BRICK_WALL = register("black_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BLACK)
        )
    }

    // black brick variants
    val CRACKED_BLACK_BRICKS = register("cracked_black_bricks") {
        Block(
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
        )
    }

    val CRACKED_BLACK_BRICK_STAIRS = register("cracked_black_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BLACK)
        )
    }

    val CRACKED_BLACK_BRICK_SLAB = register("cracked_black_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLACK)
        )
    }

    val CRACKED_BLACK_BRICK_WALL = register("cracked_black_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BLACK)
        )
    }

    val BASKETWEAVE_BLACK_BRICKS = register("basketweave_black_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLACK)
        )
    }

    val PINWHEEL_BLACK_BRICKS = register("pinwheel_black_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLACK)
        )
    }

    val JACK_ON_JACK_BLACK_BRICKS = register("jack_on_jack_black_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLACK)
        )
    }

    // mixed black bricks
    val MIXED_BLACK_BRICKS = register("mixed_black_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLACK)
        )
    }

    val MIXED_BLACK_BRICK_STAIRS = register("mixed_black_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BLACK)
        )
    }

    val MIXED_BLACK_BRICK_SLAB = register("mixed_black_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLACK)
        )
    }

    val MIXED_BLACK_BRICK_WALL = register("mixed_black_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BLACK)
        )
    }

    //  mixed large black bricks
    val LARGE_MIXED_BLACK_BRICKS = register("large_mixed_black_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLACK)
        )
    }

    val LARGE_MIXED_BLACK_BRICK_STAIRS = register("large_mixed_black_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BLACK)
        )
    }

    val LARGE_MIXED_BLACK_BRICK_SLAB = register("large_mixed_black_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLACK)
        )
    }

    val LARGE_MIXED_BLACK_BRICK_WALL = register("large_mixed_black_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BLACK)
        )
    }

    //  mixed small black bricks
    val SMALL_MIXED_BLACK_BRICKS = register("small_mixed_black_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLACK)
        )
    }

    val SMALL_MIXED_BLACK_BRICK_STAIRS = register("mixed_black_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BLACK)
        )
    }

    val SMALL_MIXED_BLACK_BRICK_SLAB = register("mixed_black_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLACK)
        )
    }

    val SMALL_MIXED_BLACK_BRICK_WALL = register("mixed_black_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BLACK)
        )
    }

    //  black shingles
    val BLACK_SHINGLES = register("black_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val BLACK_SHINGLE_STAIRS = register("black_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BLACK)
        )
    }

    val BLACK_SHINGLE_SLAB = register("black_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLACK)
        )
    }

    val BLACK_SHINGLE_WALL = register("black_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BLACK)
        )
    }

    //  mixed black shingles
    val MIXED_BLACK_SHINGLES = register("mixed_black_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
        )
    }

    val MIXED_BLACK_SHINGLE_STAIRS = register("mixed_black_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BLACK)
        )
    }

    val MIXED_BLACK_SHINGLE_SLAB = register("mixed_black_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICKS)
            .mapColor(DyeColor.BLACK)
        )
    }

    val MIXED_BLACK_SHINGLE_WALL = register("mixed_black_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.BRICK_WALL)
            .mapColor(DyeColor.BLACK)
        )
    }

    val BLACK_BRICK_CHIMNEY = register("black_brick_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.BLACK)
        )
    }
    //#endregion

    val MOSSY_MEDIUM_MUD_BRICKS = register("mossy_medium_mud_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).mapColor(DyeColor.BROWN))}
    val MOSSY_MEDIUM_MUD_BRICK_STAIRS = register("mossy_medium_mud_brick_stairs") { HBStairBlock(Blocks.MUD_BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).mapColor(DyeColor.BROWN))}
    val MOSSY_MEDIUM_MUD_BRICK_SLAB = register("mossy_medium_mud_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS).mapColor(DyeColor.BROWN))}
    val MOSSY_MEDIUM_MUD_BRICK_WALL = register("mossy_medium_mud_brick_wall") { WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICK_WALL).mapColor(DyeColor.BROWN))}

    val MOSSY_BRICKS = register("mossy_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.BLACK))}
    val MOSSY_BRICK_STAIRS = register("mossy_brick_stairs") { HBStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.BLACK))}
    val MOSSY_BRICK_SLAB = register("mossy_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.BLACK))}
    val MOSSY_BRICK_WALL = register("mossy_brick_wall") { WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL).mapColor(DyeColor.BLACK))}

    val MOSSY_WHITE_BRICKS = register("mossy_white_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.WHITE))}
    val MOSSY_WHITE_BRICK_STAIRS = register("mossy_white_brick_stairs") { HBStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.WHITE))}
    val MOSSY_WHITE_BRICK_SLAB = register("mossy_white_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.WHITE))}
    val MOSSY_WHITE_BRICK_WALL = register("mossy_white_brick_wall") { WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL).mapColor(DyeColor.WHITE))}

    val MOSSY_ORANGE_BRICKS = register("mossy_orange_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.ORANGE))}
    val MOSSY_ORANGE_BRICK_STAIRS = register("mossy_orange_brick_stairs") { HBStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.ORANGE))}
    val MOSSY_ORANGE_BRICK_SLAB = register("mossy_orange_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.ORANGE))}
    val MOSSY_ORANGE_BRICK_WALL = register("mossy_orange_brick_wall") { WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL).mapColor(DyeColor.ORANGE))}

    val MOSSY_MAGENTA_BRICKS = register("mossy_magenta_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.MAGENTA))}
    val MOSSY_MAGENTA_BRICK_STAIRS = register("mossy_magenta_brick_stairs") { HBStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.MAGENTA))}
    val MOSSY_MAGENTA_BRICK_SLAB = register("mossy_magenta_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.MAGENTA))}
    val MOSSY_MAGENTA_BRICK_WALL = register("mossy_magenta_brick_wall") { WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL).mapColor(DyeColor.MAGENTA))}

    val MOSSY_LIGHT_BLUE_BRICKS = register("mossy_light_blue_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_BLUE))}
    val MOSSY_LIGHT_BLUE_BRICK_STAIRS = register("mossy_light_blue_brick_stairs") { HBStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_BLUE))}
    val MOSSY_LIGHT_BLUE_BRICK_SLAB = register("mossy_light_blue_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_BLUE))}
    val MOSSY_LIGHT_BLUE_BRICK_WALL = register("mossy_light_blue_brick_wall") { WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL).mapColor(DyeColor.LIGHT_BLUE))}

    val MOSSY_YELLOW_BRICKS = register("mossy_yellow_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.YELLOW))}
    val MOSSY_YELLOW_BRICK_STAIRS = register("mossy_yellow_brick_stairs") { HBStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.YELLOW))}
    val MOSSY_YELLOW_BRICK_SLAB = register("mossy_yellow_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.YELLOW))}
    val MOSSY_YELLOW_BRICK_WALL = register("mossy_yellow_brick_wall") { WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL).mapColor(DyeColor.YELLOW))}

    val MOSSY_LIME_BRICKS = register("mossy_lime_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.LIME))}
    val MOSSY_LIME_BRICK_STAIRS = register("mossy_lime_brick_stairs") { HBStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.LIME))}
    val MOSSY_LIME_BRICK_SLAB = register("mossy_lime_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.LIME))}
    val MOSSY_LIME_BRICK_WALL = register("mossy_lime_brick_wall") { WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL).mapColor(DyeColor.LIME))}

    val MOSSY_PINK_BRICKS = register("mossy_pink_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.PINK))}
    val MOSSY_PINK_BRICK_STAIRS = register("mossy_pink_brick_stairs") { HBStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.PINK))}
    val MOSSY_PINK_BRICK_SLAB = register("mossy_pink_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.PINK))}
    val MOSSY_PINK_BRICK_WALL = register("mossy_pink_brick_wall") { WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL).mapColor(DyeColor.PINK))}

    val MOSSY_GRAY_BRICKS = register("mossy_gray_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.GRAY))}
    val MOSSY_GRAY_BRICK_STAIRS = register("mossy_gray_brick_stairs") { HBStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.GRAY))}
    val MOSSY_GRAY_BRICK_SLAB = register("mossy_gray_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.GRAY))}
    val MOSSY_GRAY_BRICK_WALL = register("mossy_gray_brick_wall") { WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL).mapColor(DyeColor.GRAY))}

    val MOSSY_LIGHT_GRAY_BRICKS = register("mossy_light_gray_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_GRAY))}
    val MOSSY_LIGHT_GRAY_BRICK_STAIRS = register("mossy_light_gray_brick_stairs") { HBStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_GRAY))}
    val MOSSY_LIGHT_GRAY_BRICK_SLAB = register("mossy_light_gray_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_GRAY))}
    val MOSSY_LIGHT_GRAY_BRICK_WALL = register("mossy_light_gray_brick_wall") { WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL).mapColor(DyeColor.LIGHT_GRAY))}

    val MOSSY_CYAN_BRICKS = register("mossy_cyan_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.CYAN))}
    val MOSSY_CYAN_BRICK_STAIRS = register("mossy_cyan_brick_stairs") { HBStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.CYAN))}
    val MOSSY_CYAN_BRICK_SLAB = register("mossy_cyan_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.CYAN))}
    val MOSSY_CYAN_BRICK_WALL = register("mossy_cyan_brick_wall") { WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL).mapColor(DyeColor.CYAN))}

    val MOSSY_PURPLE_BRICKS = register("mossy_purple_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.PURPLE))}
    val MOSSY_PURPLE_BRICK_STAIRS = register("mossy_purple_brick_stairs") { HBStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.PURPLE))}
    val MOSSY_PURPLE_BRICK_SLAB = register("mossy_purple_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.PURPLE))}
    val MOSSY_PURPLE_BRICK_WALL = register("mossy_purple_brick_wall") { WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL).mapColor(DyeColor.PURPLE))}

    val MOSSY_BLUE_BRICKS = register("mossy_blue_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.BLUE))}
    val MOSSY_BLUE_BRICK_STAIRS = register("mossy_blue_brick_stairs") { HBStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.BLUE))}
    val MOSSY_BLUE_BRICK_SLAB = register("mossy_blue_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.BLUE))}
    val MOSSY_BLUE_BRICK_WALL = register("mossy_blue_brick_wall") { WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL).mapColor(DyeColor.BLUE))}

    val MOSSY_BROWN_BRICKS = register("mossy_brown_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.BROWN))}
    val MOSSY_BROWN_BRICK_STAIRS = register("mossy_brown_brick_stairs") { HBStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.BROWN))}
    val MOSSY_BROWN_BRICK_SLAB = register("mossy_brown_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.BROWN))}
    val MOSSY_BROWN_BRICK_WALL = register("mossy_brown_brick_wall") { WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL).mapColor(DyeColor.BROWN))}

    val MOSSY_GREEN_BRICKS = register("mossy_green_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.GREEN))}
    val MOSSY_GREEN_BRICK_STAIRS = register("mossy_green_brick_stairs") { HBStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.GREEN))}
    val MOSSY_GREEN_BRICK_SLAB = register("mossy_green_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.GREEN))}
    val MOSSY_GREEN_BRICK_WALL = register("mossy_green_brick_wall") { WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL).mapColor(DyeColor.GREEN))}

    val MOSSY_RED_BRICKS = register("mossy_red_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.RED))}
    val MOSSY_RED_BRICK_STAIRS = register("mossy_red_brick_stairs") { HBStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.RED))}
    val MOSSY_RED_BRICK_SLAB = register("mossy_red_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.RED))}
    val MOSSY_RED_BRICK_WALL = register("mossy_red_brick_wall") { WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL).mapColor(DyeColor.RED))}

    val MOSSY_BLACK_BRICKS = register("mossy_black_bricks") { Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.BLACK))}
    val MOSSY_BLACK_BRICK_STAIRS = register("mossy_black_brick_stairs") { HBStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.BLACK))}
    val MOSSY_BLACK_BRICK_SLAB = register("mossy_black_brick_slab") { SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(DyeColor.BLACK))}
    val MOSSY_BLACK_BRICK_WALL = register("mossy_black_brick_wall") { WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BRICK_WALL).mapColor(DyeColor.BLACK))}

    //#endregion

    //#region Hybrid Aquatic Bricks
    val MEDIUM_SCHIST_BRICKS = register("medium_schist_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_SCHIST_BRICK_STAIRS = register("medium_schist_brick_stairs") {
        HBStairBlock(
            Blocks.MUD_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_SCHIST_BRICK_SLAB = register("medium_schist_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_SCHIST_BRICK_WALL = register("medium_schist_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MIXED_SCHIST_BRICKS = register("medium_mixed_schist_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MIXED_SCHIST_BRICK_STAIRS = register("medium_mixed_schist_brick_stairs") {
        HBStairBlock(
            Blocks.MUD_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MIXED_SCHIST_BRICK_SLAB = register("medium_mixed_schist_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MIXED_SCHIST_BRICK_WALL = register("medium_mixed_schist_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    // small nether bricks
    val SMALL_SCHIST_BRICKS = register("small_schist_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_SCHIST_BRICK_STAIRS = register("small_schist_brick_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val SMALL_SCHIST_BRICK_SLAB = register("small_schist_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_SCHIST_BRICK_WALL = register("small_schist_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    // nether brick variants
    val CRACKED_MEDIUM_SCHIST_BRICKS = register("cracked_medium_schist_bricks") {
        Block(
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
        )
    }

    val CRACKED_MEDIUM_SCHIST_BRICK_STAIRS = register("cracked_medium_schist_brick_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val CRACKED_MEDIUM_SCHIST_BRICK_SLAB = register("cracked_medium_schist_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val CRACKED_MEDIUM_SCHIST_BRICK_WALL = register("cracked_medium_schist_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }
    val BASKETWEAVE_SCHIST_BRICKS = register("basketweave_schist_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val PINWHEEL_SCHIST_BRICKS = register("pinwheel_schist_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val JACK_ON_JACK_SCHIST_BRICKS = register("jack_on_jack_schist_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    // mixed nether bricks
    val MIXED_SCHIST_BRICKS = register("mixed_schist_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val MIXED_SCHIST_BRICK_STAIRS = register("mixed_schist_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val MIXED_SCHIST_BRICK_SLAB = register("mixed_schist_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val MIXED_SCHIST_BRICK_WALL = register("mixed_schist_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  mixed large nether bricks
    val LARGE_MIXED_SCHIST_BRICKS = register("large_mixed_schist_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val LARGE_MIXED_SCHIST_BRICK_STAIRS = register("large_mixed_schist_brick_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val LARGE_MIXED_SCHIST_BRICK_SLAB = register("large_mixed_schist_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val LARGE_MIXED_SCHIST_BRICK_WALL = register("large_mixed_schist_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  mixed small nether bricks
    val SMALL_MIXED_SCHIST_BRICKS = register("small_mixed_schist_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_MIXED_SCHIST_BRICK_STAIRS = register("mixed_schist_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val SMALL_MIXED_SCHIST_BRICK_SLAB = register("mixed_schist_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_MIXED_SCHIST_BRICK_WALL = register("mixed_schist_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  nether shingles
    val SCHIST_SHINGLES = register("schist_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
        )
    }

    val SCHIST_SHINGLE_STAIRS = register("schist_shingle_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val SCHIST_SHINGLE_SLAB = register("schist_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SCHIST_SHINGLE_WALL = register("schist_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  mixed nether shingles
    val MIXED_SCHIST_SHINGLES = register("mixed_schist_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
        )
    }

    val MIXED_SCHIST_SHINGLE_STAIRS = register("mixed_schist_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val MIXED_SCHIST_SHINGLE_SLAB = register("mixed_schist_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val MIXED_SCHIST_SHINGLE_WALL = register("mixed_schist_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    val SCHIST_CHIMNEY = register("schist_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val MEDIUM_CHIMNEYSTONE_BRICKS = register("medium_chimneystone_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_CHIMNEYSTONE_BRICK_STAIRS = register("medium_chimneystone_brick_stairs") {
        HBStairBlock(
            Blocks.MUD_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_CHIMNEYSTONE_BRICK_SLAB = register("medium_chimneystone_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_CHIMNEYSTONE_BRICK_WALL = register("medium_chimneystone_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MIXED_CHIMNEYSTONE_BRICKS = register("medium_mixed_chimneystone_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MIXED_CHIMNEYSTONE_BRICK_STAIRS = register("medium_mixed_chimneystone_brick_stairs") {
        HBStairBlock(
            Blocks.MUD_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MIXED_CHIMNEYSTONE_BRICK_SLAB = register("medium_mixed_chimneystone_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MIXED_CHIMNEYSTONE_BRICK_WALL = register("medium_mixed_chimneystone_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    // small chimneystone bricks
    val SMALL_CHIMNEYSTONE_BRICKS = register("small_chimneystone_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_CHIMNEYSTONE_BRICK_STAIRS = register("small_chimneystone_brick_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val SMALL_CHIMNEYSTONE_BRICK_SLAB = register("small_chimneystone_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_CHIMNEYSTONE_BRICK_WALL = register("small_chimneystone_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    // chimneystone brick variants
    val CRACKED_MEDIUM_CHIMNEYSTONE_BRICKS = register("cracked_medium_chimneystone_bricks") {
        Block(
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
        )
    }

    val CRACKED_MEDIUM_CHIMNEYSTONE_BRICK_STAIRS = register("cracked_medium_chimneystone_brick_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val CRACKED_MEDIUM_CHIMNEYSTONE_BRICK_SLAB = register("cracked_medium_chimneystone_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val CRACKED_MEDIUM_CHIMNEYSTONE_BRICK_WALL = register("cracked_medium_chimneystone_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }
    val BASKETWEAVE_CHIMNEYSTONE_BRICKS = register("basketweave_chimneystone_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val PINWHEEL_CHIMNEYSTONE_BRICKS = register("pinwheel_chimneystone_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val JACK_ON_JACK_CHIMNEYSTONE_BRICKS = register("jack_on_jack_chimneystone_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    // mixed chimneystone bricks
    val MIXED_CHIMNEYSTONE_BRICKS = register("mixed_chimneystone_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val MIXED_CHIMNEYSTONE_BRICK_STAIRS = register("mixed_chimneystone_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val MIXED_CHIMNEYSTONE_BRICK_SLAB = register("mixed_chimneystone_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val MIXED_CHIMNEYSTONE_BRICK_WALL = register("mixed_chimneystone_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  mixed large chimneystone bricks
    val LARGE_MIXED_CHIMNEYSTONE_BRICKS = register("large_mixed_chimneystone_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val LARGE_MIXED_CHIMNEYSTONE_BRICK_STAIRS = register("large_mixed_chimneystone_brick_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val LARGE_MIXED_CHIMNEYSTONE_BRICK_SLAB = register("large_mixed_chimneystone_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val LARGE_MIXED_CHIMNEYSTONE_BRICK_WALL = register("large_mixed_chimneystone_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  mixed small chimneystone bricks
    val SMALL_MIXED_CHIMNEYSTONE_BRICKS = register("small_mixed_chimneystone_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_MIXED_CHIMNEYSTONE_BRICK_STAIRS = register("mixed_chimneystone_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val SMALL_MIXED_CHIMNEYSTONE_BRICK_SLAB = register("mixed_chimneystone_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_MIXED_CHIMNEYSTONE_BRICK_WALL = register("mixed_chimneystone_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  chimneystone shingles
    val CHIMNEYSTONE_SHINGLES = register("chimneystone_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
        )
    }

    val CHIMNEYSTONE_SHINGLE_STAIRS = register("chimneystone_shingle_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val CHIMNEYSTONE_SHINGLE_SLAB = register("chimneystone_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val CHIMNEYSTONE_SHINGLE_WALL = register("chimneystone_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  mixed chimneystone shingles
    val MIXED_CHIMNEYSTONE_SHINGLES = register("mixed_chimneystone_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
        )
    }

    val MIXED_CHIMNEYSTONE_SHINGLE_STAIRS = register("mixed_chimneystone_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val MIXED_CHIMNEYSTONE_SHINGLE_SLAB = register("mixed_chimneystone_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val MIXED_CHIMNEYSTONE_SHINGLE_WALL = register("mixed_chimneystone_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    val CHIMNEYSTONE_CHIMNEY = register("chimneystone_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val MEDIUM_RED_BRINESTONE_BRICKS = register("medium_red_brinestone_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_RED_BRINESTONE_BRICK_STAIRS = register("medium_red_brinestone_brick_stairs") {
        HBStairBlock(
            Blocks.MUD_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_RED_BRINESTONE_BRICK_SLAB = register("medium_red_brinestone_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_RED_BRINESTONE_BRICK_WALL = register("medium_red_brinestone_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MIXED_RED_BRINESTONE_BRICKS = register("medium_mixed_red_brinestone_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MIXED_RED_BRINESTONE_BRICK_STAIRS = register("medium_mixed_red_brinestone_brick_stairs") {
        HBStairBlock(
            Blocks.MUD_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MIXED_RED_BRINESTONE_BRICK_SLAB = register("medium_mixed_red_brinestone_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MIXED_RED_BRINESTONE_BRICK_WALL = register("medium_mixed_red_brinestone_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    // small red brinestone bricks
    val SMALL_RED_BRINESTONE_BRICKS = register("small_red_brinestone_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_RED_BRINESTONE_BRICK_STAIRS = register("small_red_brinestone_brick_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val SMALL_RED_BRINESTONE_BRICK_SLAB = register("small_red_brinestone_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_RED_BRINESTONE_BRICK_WALL = register("small_red_brinestone_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    // red brinestone brick variants
    val CRACKED_MEDIUM_RED_BRINESTONE_BRICKS = register("cracked_medium_red_brinestone_bricks") {
        Block(
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
        )
    }

    val CRACKED_MEDIUM_RED_BRINESTONE_BRICK_STAIRS = register("cracked_medium_red_brinestone_brick_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val CRACKED_MEDIUM_RED_BRINESTONE_BRICK_SLAB = register("cracked_medium_red_brinestone_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val CRACKED_MEDIUM_RED_BRINESTONE_BRICK_WALL = register("cracked_medium_red_brinestone_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    val BASKETWEAVE_RED_BRINESTONE_BRICKS = register("basketweave_red_brinestone_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val PINWHEEL_RED_BRINESTONE_BRICKS = register("pinwheel_red_brinestone_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val JACK_ON_JACK_RED_BRINESTONE_BRICKS = register("jack_on_jack_red_brinestone_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    // mixed red brinestone bricks
    val MIXED_RED_BRINESTONE_BRICKS = register("mixed_red_brinestone_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val MIXED_RED_BRINESTONE_BRICK_STAIRS = register("mixed_red_brinestone_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val MIXED_RED_BRINESTONE_BRICK_SLAB = register("mixed_red_brinestone_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val MIXED_RED_BRINESTONE_BRICK_WALL = register("mixed_red_brinestone_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  mixed large red brinestone bricks
    val LARGE_MIXED_RED_BRINESTONE_BRICKS = register("large_mixed_red_brinestone_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val LARGE_MIXED_RED_BRINESTONE_BRICK_STAIRS = register("large_mixed_red_brinestone_brick_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val LARGE_MIXED_RED_BRINESTONE_BRICK_SLAB = register("large_mixed_red_brinestone_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val LARGE_MIXED_RED_BRINESTONE_BRICK_WALL = register("large_mixed_red_brinestone_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  mixed small red brinestone bricks
    val SMALL_MIXED_RED_BRINESTONE_BRICKS = register("small_mixed_red_brinestone_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_MIXED_RED_BRINESTONE_BRICK_STAIRS = register("mixed_red_brinestone_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val SMALL_MIXED_RED_BRINESTONE_BRICK_SLAB = register("mixed_red_brinestone_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val SMALL_MIXED_RED_BRINESTONE_BRICK_WALL = register("mixed_red_brinestone_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  red brinestone shingles
    val RED_BRINESTONE_SHINGLES = register("red_brinestone_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
        )
    }

    val RED_BRINESTONE_SHINGLE_STAIRS = register("red_brinestone_shingle_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val RED_BRINESTONE_SHINGLE_SLAB = register("red_brinestone_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val RED_BRINESTONE_SHINGLE_WALL = register("red_brinestone_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    //  mixed red brinestone shingles
    val MIXED_RED_BRINESTONE_SHINGLES = register("mixed_red_brinestone_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
        )
    }

    val MIXED_RED_BRINESTONE_SHINGLE_STAIRS = register("mixed_red_brinestone_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val MIXED_RED_BRINESTONE_SHINGLE_SLAB = register("mixed_red_brinestone_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.RED)
        )
    }

    val MIXED_RED_BRINESTONE_SHINGLE_WALL = register("mixed_red_brinestone_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.RED)
        )
    }

    val RED_BRINESTONE_CHIMNEY = register("red_brinestone_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.RED)
        )
    }

    val MEDIUM_ORANGE_BRINESTONE_BRICKS = register("medium_orange_brinestone_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_ORANGE_BRINESTONE_BRICK_STAIRS = register("medium_orange_brinestone_brick_stairs") {
        HBStairBlock(
            Blocks.MUD_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_ORANGE_BRINESTONE_BRICK_SLAB = register("medium_orange_brinestone_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_ORANGE_BRINESTONE_BRICK_WALL = register("medium_orange_brinestone_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MIXED_ORANGE_BRINESTONE_BRICKS = register("medium_mixed_orange_brinestone_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MIXED_ORANGE_BRINESTONE_BRICK_STAIRS = register("medium_mixed_orange_brinestone_brick_stairs") {
        HBStairBlock(
            Blocks.MUD_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MIXED_ORANGE_BRINESTONE_BRICK_SLAB = register("medium_mixed_orange_brinestone_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MIXED_ORANGE_BRINESTONE_BRICK_WALL = register("medium_mixed_orange_brinestone_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    // small nether bricks
    val SMALL_ORANGE_BRINESTONE_BRICKS = register("small_orange_brinestone_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val SMALL_ORANGE_BRINESTONE_BRICK_STAIRS = register("small_orange_brinestone_brick_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.ORANGE)
        )
    }

    val SMALL_ORANGE_BRINESTONE_BRICK_SLAB = register("small_orange_brinestone_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val SMALL_ORANGE_BRINESTONE_BRICK_WALL = register("small_orange_brinestone_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.ORANGE)
        )
    }

    // nether brick variants
    val CRACKED_MEDIUM_ORANGE_BRINESTONE_BRICKS = register("cracked_medium_orange_brinestone_bricks") {
        Block(
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
        )
    }

    val CRACKED_MEDIUM_ORANGE_BRINESTONE_BRICK_STAIRS = register("cracked_medium_orange_brinestone_brick_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.ORANGE)
        )
    }

    val CRACKED_MEDIUM_ORANGE_BRINESTONE_BRICK_SLAB = register("cracked_medium_orange_brinestone_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val CRACKED_MEDIUM_ORANGE_BRINESTONE_BRICK_WALL = register("cracked_medium_orange_brinestone_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.ORANGE)
        )
    }
    val BASKETWEAVE_ORANGE_BRINESTONE_BRICKS = register("basketweave_orange_brinestone_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val PINWHEEL_ORANGE_BRINESTONE_BRICKS = register("pinwheel_orange_brinestone_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val JACK_ON_JACK_ORANGE_BRINESTONE_BRICKS = register("jack_on_jack_orange_brinestone_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    // mixed nether bricks
    val MIXED_ORANGE_BRINESTONE_BRICKS = register("mixed_orange_brinestone_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val MIXED_ORANGE_BRINESTONE_BRICK_STAIRS = register("mixed_orange_brinestone_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.ORANGE)
        )
    }

    val MIXED_ORANGE_BRINESTONE_BRICK_SLAB = register("mixed_orange_brinestone_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val MIXED_ORANGE_BRINESTONE_BRICK_WALL = register("mixed_orange_brinestone_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.ORANGE)
        )
    }

    //  mixed large nether bricks
    val LARGE_MIXED_ORANGE_BRINESTONE_BRICKS = register("large_mixed_orange_brinestone_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val LARGE_MIXED_ORANGE_BRINESTONE_BRICK_STAIRS = register("large_mixed_orange_brinestone_brick_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.ORANGE)
        )
    }

    val LARGE_MIXED_ORANGE_BRINESTONE_BRICK_SLAB = register("large_mixed_orange_brinestone_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val LARGE_MIXED_ORANGE_BRINESTONE_BRICK_WALL = register("large_mixed_orange_brinestone_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.ORANGE)
        )
    }

    //  mixed small nether bricks
    val SMALL_MIXED_ORANGE_BRINESTONE_BRICKS = register("small_mixed_orange_brinestone_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val SMALL_MIXED_ORANGE_BRINESTONE_BRICK_STAIRS = register("mixed_orange_brinestone_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.ORANGE)
        )
    }

    val SMALL_MIXED_ORANGE_BRINESTONE_BRICK_SLAB = register("mixed_orange_brinestone_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val SMALL_MIXED_ORANGE_BRINESTONE_BRICK_WALL = register("mixed_orange_brinestone_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.ORANGE)
        )
    }

    //  nether shingles
    val ORANGE_BRINESTONE_SHINGLES = register("orange_brinestone_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
        )
    }

    val ORANGE_BRINESTONE_SHINGLE_STAIRS = register("orange_brinestone_shingle_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.ORANGE)
        )
    }

    val ORANGE_BRINESTONE_SHINGLE_SLAB = register("orange_brinestone_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val ORANGE_BRINESTONE_SHINGLE_WALL = register("orange_brinestone_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.ORANGE)
        )
    }

    //  mixed nether shingles
    val MIXED_ORANGE_BRINESTONE_SHINGLES = register("mixed_orange_brinestone_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
        )
    }

    val MIXED_ORANGE_BRINESTONE_SHINGLE_STAIRS = register("mixed_orange_brinestone_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.ORANGE)
        )
    }

    val MIXED_ORANGE_BRINESTONE_SHINGLE_SLAB = register("mixed_orange_brinestone_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val MIXED_ORANGE_BRINESTONE_SHINGLE_WALL = register("mixed_orange_brinestone_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.ORANGE)
        )
    }

    val ORANGE_BRINESTONE_CHIMNEY = register("orange_brinestone_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.ORANGE)
        )
    }

    val MEDIUM_YELLOW_BRINESTONE_BRICKS = register("medium_yellow_brinestone_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_YELLOW_BRINESTONE_BRICK_STAIRS = register("medium_yellow_brinestone_brick_stairs") {
        HBStairBlock(
            Blocks.MUD_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_YELLOW_BRINESTONE_BRICK_SLAB = register("medium_yellow_brinestone_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_YELLOW_BRINESTONE_BRICK_WALL = register("medium_yellow_brinestone_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MIXED_YELLOW_BRINESTONE_BRICKS = register("medium_mixed_yellow_brinestone_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MIXED_YELLOW_BRINESTONE_BRICK_STAIRS = register("medium_mixed_yellow_brinestone_brick_stairs") {
        HBStairBlock(
            Blocks.MUD_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
                .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MIXED_YELLOW_BRINESTONE_BRICK_SLAB = register("medium_mixed_yellow_brinestone_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICKS)
            .mapColor(DyeColor.BROWN)
        )
    }

    val MEDIUM_MIXED_YELLOW_BRINESTONE_BRICK_WALL = register("medium_mixed_yellow_brinestone_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.MUD_BRICK_WALL)
            .mapColor(DyeColor.BROWN)
        )
    }

    // small nether bricks
    val SMALL_YELLOW_BRINESTONE_BRICKS = register("small_yellow_brinestone_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val SMALL_YELLOW_BRINESTONE_BRICK_STAIRS = register("small_yellow_brinestone_brick_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.YELLOW)
        )
    }

    val SMALL_YELLOW_BRINESTONE_BRICK_SLAB = register("small_yellow_brinestone_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val SMALL_YELLOW_BRINESTONE_BRICK_WALL = register("small_yellow_brinestone_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.YELLOW)
        )
    }

    // nether brick variants
    val CRACKED_MEDIUM_YELLOW_BRINESTONE_BRICKS = register("cracked_medium_yellow_brinestone_bricks") {
        Block(
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.MUD_BRICKS)
        )
    }

    val CRACKED_MEDIUM_YELLOW_BRINESTONE_BRICK_STAIRS = register("cracked_medium_yellow_brinestone_brick_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.YELLOW)
        )
    }

    val CRACKED_MEDIUM_YELLOW_BRINESTONE_BRICK_SLAB = register("cracked_medium_yellow_brinestone_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val CRACKED_MEDIUM_YELLOW_BRINESTONE_BRICK_WALL = register("cracked_medium_yellow_brinestone_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.YELLOW)
        )
    }
    val BASKETWEAVE_YELLOW_BRINESTONE_BRICKS = register("basketweave_yellow_brinestone_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val PINWHEEL_YELLOW_BRINESTONE_BRICKS = register("pinwheel_yellow_brinestone_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val JACK_ON_JACK_YELLOW_BRINESTONE_BRICKS = register("jack_on_jack_yellow_brinestone_bricks") {
        Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    // mixed nether bricks
    val MIXED_YELLOW_BRINESTONE_BRICKS = register("mixed_yellow_brinestone_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val MIXED_YELLOW_BRINESTONE_BRICK_STAIRS = register("mixed_yellow_brinestone_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.BRICKS)
                .mapColor(DyeColor.YELLOW)
        )
    }

    val MIXED_YELLOW_BRINESTONE_BRICK_SLAB = register("mixed_yellow_brinestone_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val MIXED_YELLOW_BRINESTONE_BRICK_WALL = register("mixed_yellow_brinestone_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.YELLOW)
        )
    }

    //  mixed large nether bricks
    val LARGE_MIXED_YELLOW_BRINESTONE_BRICKS = register("large_mixed_yellow_brinestone_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val LARGE_MIXED_YELLOW_BRINESTONE_BRICK_STAIRS = register("large_mixed_yellow_brinestone_brick_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.YELLOW)
        )
    }

    val LARGE_MIXED_YELLOW_BRINESTONE_BRICK_SLAB = register("large_mixed_yellow_brinestone_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val LARGE_MIXED_YELLOW_BRINESTONE_BRICK_WALL = register("large_mixed_yellow_brinestone_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.YELLOW)
        )
    }

    //  mixed small nether bricks
    val SMALL_MIXED_YELLOW_BRINESTONE_BRICKS = register("small_mixed_yellow_brinestone_bricks") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val SMALL_MIXED_YELLOW_BRINESTONE_BRICK_STAIRS = register("mixed_yellow_brinestone_small_brick_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.YELLOW)
        )
    }

    val SMALL_MIXED_YELLOW_BRINESTONE_BRICK_SLAB = register("mixed_yellow_brinestone_small_brick_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val SMALL_MIXED_YELLOW_BRINESTONE_BRICK_WALL = register("mixed_yellow_brinestone_small_brick_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.YELLOW)
        )
    }

    //  nether shingles
    val YELLOW_BRINESTONE_SHINGLES = register("yellow_brinestone_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
        )
    }

    val YELLOW_BRINESTONE_SHINGLE_STAIRS = register("yellow_brinestone_shingle_stairs") {
        HBStairBlock(
            Blocks.NETHER_BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.YELLOW)
        )
    }

    val YELLOW_BRINESTONE_SHINGLE_SLAB = register("yellow_brinestone_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val YELLOW_BRINESTONE_SHINGLE_WALL = register("yellow_brinestone_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.YELLOW)
        )
    }

    //  mixed nether shingles
    val MIXED_YELLOW_BRINESTONE_SHINGLES = register("mixed_yellow_brinestone_shingles") {
        Block(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
        )
    }

    val MIXED_YELLOW_BRINESTONE_SHINGLE_STAIRS = register("mixed_yellow_brinestone_shingle_stairs") {
        HBStairBlock(
            Blocks.BRICKS.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.YELLOW)
        )
    }

    val MIXED_YELLOW_BRINESTONE_SHINGLE_SLAB = register("mixed_yellow_brinestone_shingle_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICKS)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val MIXED_YELLOW_BRINESTONE_SHINGLE_WALL = register("mixed_yellow_brinestone_shingle_wall") {
        WallBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.NETHER_BRICK_WALL)
            .mapColor(DyeColor.YELLOW)
        )
    }

    val YELLOW_BRINESTONE_CHIMNEY = register("yellow_brinestone_chimney") {
        ChimneyBlock(
            2,
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(DyeColor.YELLOW)
        )
    }
    //#endregion
    
    //#region Wool Sets
    val WHITE_WOOL_STAIRS = register("white_wool_stairs") {
        HBStairBlock(
            Blocks.WHITE_WOOL.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).mapColor(DyeColor.WHITE)
        )
    }

    val WHITE_WOOL_SLAB = register("white_wool_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).mapColor(DyeColor.WHITE)
        )
    }

    val ORANGE_WOOL_STAIRS = register("orange_wool_stairs") {
        HBStairBlock(
            Blocks.ORANGE_WOOL.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_WOOL).mapColor(DyeColor.ORANGE)
        )
    }

    val ORANGE_WOOL_SLAB = register("orange_wool_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_WOOL).mapColor(DyeColor.ORANGE)
        )
    }

    val MAGENTA_WOOL_STAIRS = register("magenta_wool_stairs") {
        HBStairBlock(
            Blocks.MAGENTA_WOOL.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_WOOL).mapColor(DyeColor.MAGENTA)
        )
    }

    val MAGENTA_WOOL_SLAB = register("magenta_wool_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_WOOL).mapColor(DyeColor.MAGENTA)
        )
    }

    val LIGHT_BLUE_WOOL_STAIRS = register("light_blue_wool_stairs") {
        HBStairBlock(
            Blocks.LIGHT_BLUE_WOOL.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_WOOL).mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val LIGHT_BLUE_WOOL_SLAB = register("light_blue_wool_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_WOOL).mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val YELLOW_WOOL_STAIRS = register("yellow_wool_stairs") {
        HBStairBlock(
            Blocks.YELLOW_WOOL.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_WOOL).mapColor(DyeColor.YELLOW)
        )
    }

    val YELLOW_WOOL_SLAB = register("yellow_wool_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_WOOL).mapColor(DyeColor.YELLOW)
        )
    }

    val LIME_WOOL_STAIRS = register("lime_wool_stairs") {
        HBStairBlock(
            Blocks.LIME_WOOL.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_WOOL).mapColor(DyeColor.LIME)
        )
    }

    val LIME_WOOL_SLAB = register("lime_wool_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_WOOL).mapColor(DyeColor.LIME)
        )
    }

    val PINK_WOOL_STAIRS = register("pink_wool_stairs") {
        HBStairBlock(
            Blocks.PINK_WOOL.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_WOOL).mapColor(DyeColor.PINK)
        )
    }

    val PINK_WOOL_SLAB = register("pink_wool_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_WOOL).mapColor(DyeColor.PINK)
        )
    }

    val GRAY_WOOL_STAIRS = register("gray_wool_stairs") {
        HBStairBlock(
            Blocks.GRAY_WOOL.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_WOOL).mapColor(DyeColor.GRAY)
        )
    }

    val GRAY_WOOL_SLAB = register("gray_wool_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_WOOL).mapColor(DyeColor.GRAY)
        )
    }

    val LIGHT_GRAY_WOOL_STAIRS = register("light_gray_wool_stairs") {
        HBStairBlock(
            Blocks.LIGHT_GRAY_WOOL.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_WOOL).mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val LIGHT_GRAY_WOOL_SLAB = register("light_gray_wool_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_WOOL).mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val CYAN_WOOL_STAIRS = register("cyan_wool_stairs") {
        HBStairBlock(
            Blocks.CYAN_WOOL.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_WOOL).mapColor(DyeColor.CYAN)
        )
    }

    val CYAN_WOOL_SLAB = register("cyan_wool_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_WOOL).mapColor(DyeColor.CYAN)
        )
    }

    val PURPLE_WOOL_STAIRS = register("purple_wool_stairs") {
        HBStairBlock(
            Blocks.PURPLE_WOOL.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_WOOL).mapColor(DyeColor.PURPLE)
        )
    }

    val PURPLE_WOOL_SLAB = register("purple_wool_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_WOOL).mapColor(DyeColor.PURPLE)
        )
    }

    val BROWN_WOOL_STAIRS = register("brown_wool_stairs") {
        HBStairBlock(
            Blocks.BROWN_WOOL.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_WOOL).mapColor(DyeColor.BROWN)
        )
    }

    val BROWN_WOOL_SLAB = register("brown_wool_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_WOOL).mapColor(DyeColor.BROWN)
        )
    }

    val GREEN_WOOL_STAIRS = register("green_wool_stairs") {
        HBStairBlock(
            Blocks.GREEN_WOOL.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_WOOL).mapColor(DyeColor.GREEN)
        )
    }

    val GREEN_WOOL_SLAB = register("green_wool_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_WOOL).mapColor(DyeColor.GREEN)
        )
    }

    val BLUE_WOOL_STAIRS = register("blue_wool_stairs") {
        HBStairBlock(
            Blocks.BLUE_WOOL.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_WOOL).mapColor(DyeColor.BLUE)
        )
    }

    val BLUE_WOOL_SLAB = register("blue_wool_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_WOOL).mapColor(DyeColor.BLUE)
        )
    }

    val RED_WOOL_STAIRS = register("red_wool_stairs") {
        HBStairBlock(
            Blocks.RED_WOOL.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.RED_WOOL)
                .mapColor(DyeColor.RED)
        )
    }

    val RED_WOOL_SLAB = register("red_wool_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_WOOL)
            .mapColor(DyeColor.RED)
        )
    }

    val BLACK_WOOL_STAIRS = register("black_wool_stairs") {
        HBStairBlock(
            Blocks.BLACK_WOOL.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_WOOL).mapColor(DyeColor.BLACK)
        )
    }

    val BLACK_WOOL_SLAB = register("black_wool_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_WOOL).mapColor(DyeColor.BLACK)
        )
    }
    //#endregion
    
    //#region Concrete Sets
    val WHITE_CONCRETE_STAIRS = register("white_concrete_stairs") {
        HBStairBlock(
            Blocks.WHITE_CONCRETE.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE).mapColor(DyeColor.WHITE)
        )
    }

    val WHITE_CONCRETE_SLAB = register("white_concrete_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE).mapColor(DyeColor.WHITE)
        )
    }

    val ORANGE_CONCRETE_STAIRS = register("orange_concrete_stairs") {
        HBStairBlock(
            Blocks.ORANGE_CONCRETE.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE).mapColor(DyeColor.ORANGE)
        )
    }

    val ORANGE_CONCRETE_SLAB = register("orange_concrete_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE).mapColor(DyeColor.ORANGE)
        )
    }

    val MAGENTA_CONCRETE_STAIRS = register("magenta_concrete_stairs") {
        HBStairBlock(
            Blocks.MAGENTA_CONCRETE.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE).mapColor(DyeColor.MAGENTA)
        )
    }

    val MAGENTA_CONCRETE_SLAB = register("magenta_concrete_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE).mapColor(DyeColor.MAGENTA)
        )
    }

    val LIGHT_BLUE_CONCRETE_STAIRS = register("light_blue_concrete_stairs") {
        HBStairBlock(
            Blocks.LIGHT_BLUE_CONCRETE.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE).mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val LIGHT_BLUE_CONCRETE_SLAB = register("light_blue_concrete_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE).mapColor(DyeColor.LIGHT_BLUE)
        )
    }

    val YELLOW_CONCRETE_STAIRS = register("yellow_concrete_stairs") {
        HBStairBlock(
            Blocks.YELLOW_CONCRETE.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE).mapColor(DyeColor.YELLOW)
        )
    }

    val YELLOW_CONCRETE_SLAB = register("yellow_concrete_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE).mapColor(DyeColor.YELLOW)
        )
    }

    val LIME_CONCRETE_STAIRS = register("lime_concrete_stairs") {
        HBStairBlock(
            Blocks.LIME_CONCRETE.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE).mapColor(DyeColor.LIME)
        )
    }

    val LIME_CONCRETE_SLAB = register("lime_concrete_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE).mapColor(DyeColor.LIME)
        )
    }

    val PINK_CONCRETE_STAIRS = register("pink_concrete_stairs") {
        HBStairBlock(
            Blocks.PINK_CONCRETE.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE).mapColor(DyeColor.PINK)
        )
    }

    val PINK_CONCRETE_SLAB = register("pink_concrete_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE).mapColor(DyeColor.PINK)
        )
    }

    val GRAY_CONCRETE_STAIRS = register("gray_concrete_stairs") {
        HBStairBlock(
            Blocks.GRAY_CONCRETE.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE).mapColor(DyeColor.GRAY)
        )
    }

    val GRAY_CONCRETE_SLAB = register("gray_concrete_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE).mapColor(DyeColor.GRAY)
        )
    }

    val LIGHT_GRAY_CONCRETE_STAIRS = register("light_gray_concrete_stairs") {
        HBStairBlock(
            Blocks.LIGHT_GRAY_CONCRETE.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE).mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val LIGHT_GRAY_CONCRETE_SLAB = register("light_gray_concrete_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE).mapColor(DyeColor.LIGHT_GRAY)
        )
    }

    val CYAN_CONCRETE_STAIRS = register("cyan_concrete_stairs") {
        HBStairBlock(
            Blocks.CYAN_CONCRETE.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE).mapColor(DyeColor.CYAN)
        )
    }

    val CYAN_CONCRETE_SLAB = register("cyan_concrete_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE).mapColor(DyeColor.CYAN)
        )
    }

    val PURPLE_CONCRETE_STAIRS = register("purple_concrete_stairs") {
        HBStairBlock(
            Blocks.PURPLE_CONCRETE.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE).mapColor(DyeColor.PURPLE)
        )
    }

    val PURPLE_CONCRETE_SLAB = register("purple_concrete_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE).mapColor(DyeColor.PURPLE)
        )
    }

    val BROWN_CONCRETE_STAIRS = register("brown_concrete_stairs") {
        HBStairBlock(
            Blocks.BROWN_CONCRETE.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE).mapColor(DyeColor.BROWN)
        )
    }

    val BROWN_CONCRETE_SLAB = register("brown_concrete_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE).mapColor(DyeColor.BROWN)
        )
    }

    val GREEN_CONCRETE_STAIRS = register("green_concrete_stairs") {
        HBStairBlock(
            Blocks.GREEN_CONCRETE.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE).mapColor(DyeColor.GREEN)
        )
    }

    val GREEN_CONCRETE_SLAB = register("green_concrete_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE).mapColor(DyeColor.GREEN)
        )
    }

    val BLUE_CONCRETE_STAIRS = register("blue_concrete_stairs") {
        HBStairBlock(
            Blocks.BLUE_CONCRETE.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE).mapColor(DyeColor.BLUE)
        )
    }

    val BLUE_CONCRETE_SLAB = register("blue_concrete_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE).mapColor(DyeColor.BLUE)
        )
    }

    val RED_CONCRETE_STAIRS = register("red_concrete_stairs") {
        HBStairBlock(
            Blocks.RED_CONCRETE.defaultBlockState(),
            BlockBehaviour.Properties
                .ofFullCopy(Blocks.RED_CONCRETE)
                .mapColor(DyeColor.RED)
        )
    }

    val RED_CONCRETE_SLAB = register("red_concrete_slab") {
        SlabBlock(BlockBehaviour.Properties
            .ofFullCopy(Blocks.RED_CONCRETE)
            .mapColor(DyeColor.RED)
        )
    }

    val BLACK_CONCRETE_STAIRS = register("black_concrete_stairs") {
        HBStairBlock(
            Blocks.BLACK_CONCRETE.defaultBlockState(),
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE).mapColor(DyeColor.BLACK)
        )
    }

    val BLACK_CONCRETE_SLAB = register("black_concrete_slab") {
        SlabBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE).mapColor(DyeColor.BLACK)
        )
    }
    //#endregion

    // region Clear Glass
    val CLEAR_GLASS = register("clear_glass") { HBTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS))}
    val WHITE_STAINED_CLEAR_GLASS = register("white_stained_clear_glass") { StainedGlassBlock(DyeColor.WHITE, BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_STAINED_GLASS))}
    val ORANGE_STAINED_CLEAR_GLASS = register("orange_stained_clear_glass") { StainedGlassBlock(DyeColor.ORANGE, BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_STAINED_GLASS))}
    val MAGENTA_STAINED_CLEAR_GLASS = register("magenta_stained_clear_glass") { StainedGlassBlock(DyeColor.MAGENTA, BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_STAINED_GLASS))}
    val LIGHT_BLUE_STAINED_CLEAR_GLASS = register("light_blue_stained_clear_glass") { StainedGlassBlock(DyeColor.LIGHT_BLUE, BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_STAINED_GLASS))}
    val YELLOW_STAINED_CLEAR_GLASS = register("yellow_stained_clear_glass") { StainedGlassBlock(DyeColor.YELLOW, BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_STAINED_GLASS))}
    val LIME_STAINED_CLEAR_GLASS = register("lime_stained_clear_glass") { StainedGlassBlock(DyeColor.LIME, BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_STAINED_GLASS))}
    val PINK_STAINED_CLEAR_GLASS = register("pink_stained_clear_glass") { StainedGlassBlock(DyeColor.PINK, BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_STAINED_GLASS))}
    val GRAY_STAINED_CLEAR_GLASS = register("gray_stained_clear_glass") { StainedGlassBlock(DyeColor.GRAY, BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_STAINED_GLASS))}
    val LIGHT_GRAY_STAINED_CLEAR_GLASS = register("light_gray_stained_clear_glass") { StainedGlassBlock(DyeColor.LIGHT_GRAY, BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_STAINED_GLASS))}
    val CYAN_STAINED_CLEAR_GLASS = register("cyan_stained_clear_glass") { StainedGlassBlock(DyeColor.CYAN, BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_STAINED_GLASS))}
    val PURPLE_STAINED_CLEAR_GLASS = register("purple_stained_clear_glass") { StainedGlassBlock(DyeColor.PURPLE, BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_STAINED_GLASS))}
    val BLUE_STAINED_CLEAR_GLASS = register("blue_stained_clear_glass") { StainedGlassBlock(DyeColor.BLUE, BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_STAINED_GLASS))}
    val BROWN_STAINED_CLEAR_GLASS = register("brown_stained_clear_glass") { StainedGlassBlock(DyeColor.BROWN, BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_STAINED_GLASS))}
    val GREEN_STAINED_CLEAR_GLASS = register("green_stained_clear_glass") { StainedGlassBlock(DyeColor.GREEN, BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_STAINED_GLASS))}
    val RED_STAINED_CLEAR_GLASS = register("red_stained_clear_glass") { StainedGlassBlock(DyeColor.RED, BlockBehaviour.Properties.ofFullCopy(Blocks.RED_STAINED_GLASS))}
    val BLACK_STAINED_CLEAR_GLASS = register("black_stained_clear_glass") { StainedGlassBlock(DyeColor.BLACK, BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_STAINED_GLASS))}

    val CLEAR_GLASS_PANE = register("clear_glass_pane") { HBBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS_PANE)) }
    val WHITE_STAINED_CLEAR_GLASS_PANE = register("white_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.WHITE, BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_STAINED_GLASS_PANE))}
    val ORANGE_STAINED_CLEAR_GLASS_PANE = register("orange_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.ORANGE, BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_STAINED_GLASS_PANE))}
    val MAGENTA_STAINED_CLEAR_GLASS_PANE = register("magenta_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.MAGENTA, BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_STAINED_GLASS_PANE))}
    val LIGHT_BLUE_STAINED_CLEAR_GLASS_PANE = register("light_blue_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.LIGHT_BLUE, BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE))}
    val YELLOW_STAINED_CLEAR_GLASS_PANE = register("yellow_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.YELLOW, BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_STAINED_GLASS_PANE))}
    val LIME_STAINED_CLEAR_GLASS_PANE = register("lime_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.LIME, BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_STAINED_GLASS_PANE))}
    val PINK_STAINED_CLEAR_GLASS_PANE = register("pink_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.PINK, BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_STAINED_GLASS_PANE))}
    val GRAY_STAINED_CLEAR_GLASS_PANE = register("gray_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.GRAY, BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_STAINED_GLASS_PANE))}
    val LIGHT_GRAY_STAINED_CLEAR_GLASS_PANE = register("light_gray_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.LIGHT_GRAY, BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE))}
    val CYAN_STAINED_CLEAR_GLASS_PANE = register("cyan_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.CYAN, BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_STAINED_GLASS_PANE))}
    val PURPLE_STAINED_CLEAR_GLASS_PANE = register("purple_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.PURPLE, BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_STAINED_GLASS_PANE))}
    val BLUE_STAINED_CLEAR_GLASS_PANE = register("blue_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.BLUE, BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_STAINED_GLASS_PANE))}
    val BROWN_STAINED_CLEAR_GLASS_PANE = register("brown_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.BROWN, BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_STAINED_GLASS_PANE))}
    val GREEN_STAINED_CLEAR_GLASS_PANE = register("green_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.GREEN, BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_STAINED_GLASS_PANE))}
    val RED_STAINED_CLEAR_GLASS_PANE = register("red_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.RED, BlockBehaviour.Properties.ofFullCopy(Blocks.RED_STAINED_GLASS_PANE))}
    val BLACK_STAINED_CLEAR_GLASS_PANE = register("black_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.BLACK, BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_STAINED_GLASS_PANE))}

    // endregion

    private fun register(id: String, block: Supplier<Block>): RegistryObject<Block> {
        return CommonClass.BLOCKS.register(id, block)
    }
}
