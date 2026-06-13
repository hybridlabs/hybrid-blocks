package dev.hybridlabs.blocks.block

import dev.hybridlabs.blocks.HybridBlocksCommon
import dev.hybridlabs.blocks.platform.registration.RegistryObject
import net.minecraft.world.item.DyeColor
import net.minecraft.world.level.block.*
import net.minecraft.world.level.block.state.BlockBehaviour
import java.util.function.Supplier

/**
 * All Hybrid Blocks blocks.
 */
object HybridBlocksBlocks {

    val DORIC_COLUMN = register("doric_column") { ColumnBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE).mapColor(DyeColor.RED))}

    // region Quartz
    val WHITE_QUARTZ_BLOCK = register("white_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE))}
    val WHITE_QUARTZ_STAIRS = register("white_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE)) }
    val WHITE_QUARTZ_SLAB = register("white_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE)) }
    val CHISELED_WHITE_QUARTZ_BLOCK = register("chiseled_white_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE))}
    val WHITE_QUARTZ_BRICKS = register("white_quartz_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE))}
    val WHITE_QUARTZ_PILLAR = register("white_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.WHITE)) }
    val SMOOTH_WHITE_QUARTZ = register("smooth_white_quartz") { Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.WHITE))}
    val SMOOTH_WHITE_QUARTZ_STAIRS = register("smooth_white_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE))}
    val SMOOTH_WHITE_QUARTZ_SLAB = register("smooth_white_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.WHITE))}

    val ORANGE_QUARTZ_BLOCK = register("orange_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.ORANGE))}
    val ORANGE_QUARTZ_STAIRS = register("orange_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.ORANGE))}
    val ORANGE_QUARTZ_SLAB = register("orange_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.ORANGE))}
    val CHISELED_ORANGE_QUARTZ_BLOCK = register("chiseled_orange_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.ORANGE))}
    val ORANGE_QUARTZ_BRICKS = register("orange_quartz_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.ORANGE))}
    val ORANGE_QUARTZ_PILLAR = register("orange_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.ORANGE))}
    val SMOOTH_ORANGE_QUARTZ = register("smooth_orange_quartz") { Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.ORANGE))}
    val SMOOTH_ORANGE_QUARTZ_STAIRS = register("smooth_orange_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.ORANGE))}
    val SMOOTH_ORANGE_QUARTZ_SLAB = register("smooth_orange_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.ORANGE))}

    val MAGENTA_QUARTZ_BLOCK = register("magenta_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.MAGENTA))}
    val MAGENTA_QUARTZ_STAIRS = register("magenta_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.MAGENTA))}
    val MAGENTA_QUARTZ_SLAB = register("magenta_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.MAGENTA))}
    val CHISELED_MAGENTA_QUARTZ_BLOCK = register("chiseled_magenta_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.MAGENTA))}
    val MAGENTA_QUARTZ_BRICKS = register("magenta_quartz_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.MAGENTA))}
    val MAGENTA_QUARTZ_PILLAR = register("magenta_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.MAGENTA))}
    val SMOOTH_MAGENTA_QUARTZ = register("smooth_magenta_quartz") { Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.MAGENTA))}
    val SMOOTH_MAGENTA_QUARTZ_STAIRS = register("smooth_magenta_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.MAGENTA))}
    val SMOOTH_MAGENTA_QUARTZ_SLAB = register("smooth_magenta_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.MAGENTA))}

    val LIGHT_BLUE_QUARTZ_BLOCK = register("light_blue_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE))}
    val LIGHT_BLUE_QUARTZ_STAIRS = register("light_blue_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE))}
    val LIGHT_BLUE_QUARTZ_SLAB = register("light_blue_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE))}
    val CHISELED_LIGHT_BLUE_QUARTZ_BLOCK = register("chiseled_light_blue_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE))}
    val LIGHT_BLUE_QUARTZ_BRICKS = register("light_blue_quartz_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE))}
    val LIGHT_BLUE_QUARTZ_PILLAR = register("light_blue_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.LIGHT_BLUE))}
    val SMOOTH_LIGHT_BLUE_QUARTZ = register("smooth_light_blue_quartz") { Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.LIGHT_BLUE))}
    val SMOOTH_LIGHT_BLUE_QUARTZ_STAIRS = register("smooth_light_blue_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE))}
    val SMOOTH_LIGHT_BLUE_QUARTZ_SLAB = register("smooth_light_blue_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_BLUE))}

    val YELLOW_QUARTZ_BLOCK = register("yellow_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.YELLOW))}
    val YELLOW_QUARTZ_STAIRS = register("yellow_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.YELLOW))}
    val YELLOW_QUARTZ_SLAB = register("yellow_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.YELLOW))}
    val CHISELED_YELLOW_QUARTZ_BLOCK = register("chiseled_yellow_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.YELLOW))}
    val YELLOW_QUARTZ_BRICKS = register("yellow_quartz_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.YELLOW))}
    val YELLOW_QUARTZ_PILLAR = register("yellow_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.YELLOW))}
    val SMOOTH_YELLOW_QUARTZ = register("smooth_yellow_quartz") { Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.YELLOW))}
    val SMOOTH_YELLOW_QUARTZ_STAIRS = register("smooth_yellow_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.YELLOW))}
    val SMOOTH_YELLOW_QUARTZ_SLAB = register("smooth_yellow_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.YELLOW))}

    val LIME_QUARTZ_BLOCK = register("lime_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIME))}
    val LIME_QUARTZ_STAIRS = register("lime_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIME))}
    val LIME_QUARTZ_SLAB = register("lime_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIME))}
    val CHISELED_LIME_QUARTZ_BLOCK = register("chiseled_lime_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIME))}
    val LIME_QUARTZ_BRICKS = register("lime_quartz_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIME))}
    val LIME_QUARTZ_PILLAR = register("lime_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.LIME))}
    val SMOOTH_LIME_QUARTZ = register("smooth_lime_quartz") { Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.LIME))}
    val SMOOTH_LIME_QUARTZ_STAIRS = register("smooth_lime_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIME))}
    val SMOOTH_LIME_QUARTZ_SLAB = register("smooth_lime_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIME))}

    val PINK_QUARTZ_BLOCK = register("pink_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PINK))}
    val PINK_QUARTZ_STAIRS = register("pink_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PINK))}
    val PINK_QUARTZ_SLAB = register("pink_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PINK))}
    val CHISELED_PINK_QUARTZ_BLOCK = register("chiseled_pink_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PINK))}
    val PINK_QUARTZ_BRICKS = register("pink_quartz_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PINK))}
    val PINK_QUARTZ_PILLAR = register("pink_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.PINK))}
    val SMOOTH_PINK_QUARTZ = register("smooth_pink_quartz") { Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.PINK))}
    val SMOOTH_PINK_QUARTZ_STAIRS = register("smooth_pink_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PINK))}
    val SMOOTH_PINK_QUARTZ_SLAB = register("smooth_pink_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PINK))}

    val GRAY_QUARTZ_BLOCK = register("gray_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GRAY))}
    val GRAY_QUARTZ_STAIRS = register("gray_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GRAY))}
    val GRAY_QUARTZ_SLAB = register("gray_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GRAY))}
    val CHISELED_GRAY_QUARTZ_BLOCK = register("chiseled_gray_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GRAY))}
    val GRAY_QUARTZ_BRICKS = register("gray_quartz_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GRAY))}
    val GRAY_QUARTZ_PILLAR = register("gray_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.GRAY))}
    val SMOOTH_GRAY_QUARTZ = register("smooth_gray_quartz") { Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.GRAY))}
    val SMOOTH_GRAY_QUARTZ_STAIRS = register("smooth_gray_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GRAY))}
    val SMOOTH_GRAY_QUARTZ_SLAB = register("smooth_gray_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GRAY))}

    val LIGHT_GRAY_QUARTZ_BLOCK = register("light_gray_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_GRAY))}
    val LIGHT_GRAY_QUARTZ_STAIRS = register("light_gray_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_GRAY))}
    val LIGHT_GRAY_QUARTZ_SLAB = register("light_gray_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_GRAY))}
    val CHISELED_LIGHT_GRAY_QUARTZ_BLOCK = register("chiseled_light_gray_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_GRAY))}
    val LIGHT_GRAY_QUARTZ_BRICKS = register("light_gray_quartz_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_GRAY))}
    val LIGHT_GRAY_QUARTZ_PILLAR = register("light_gray_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.LIGHT_GRAY))}
    val SMOOTH_LIGHT_GRAY_QUARTZ = register("smooth_light_gray_quartz") { Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.LIGHT_GRAY))}
    val SMOOTH_LIGHT_GRAY_QUARTZ_STAIRS = register("smooth_light_gray_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_GRAY))}
    val SMOOTH_LIGHT_GRAY_QUARTZ_SLAB = register("smooth_light_gray_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.LIGHT_GRAY))}

    val CYAN_QUARTZ_BLOCK = register("cyan_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.CYAN))}
    val CYAN_QUARTZ_STAIRS = register("cyan_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.CYAN))}
    val CYAN_QUARTZ_SLAB = register("cyan_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.CYAN))}
    val CHISELED_CYAN_QUARTZ_BLOCK = register("chiseled_cyan_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.CYAN))}
    val CYAN_QUARTZ_BRICKS = register("cyan_quartz_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.CYAN))}
    val CYAN_QUARTZ_PILLAR = register("cyan_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.CYAN))}
    val SMOOTH_CYAN_QUARTZ = register("smooth_cyan_quartz") { Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.CYAN))}
    val SMOOTH_CYAN_QUARTZ_STAIRS = register("smooth_cyan_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.CYAN))}
    val SMOOTH_CYAN_QUARTZ_SLAB = register("smooth_cyan_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.CYAN))}

    val PURPLE_QUARTZ_BLOCK = register("purple_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PURPLE))}
    val PURPLE_QUARTZ_STAIRS = register("purple_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PURPLE))}
    val PURPLE_QUARTZ_SLAB = register("purple_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PURPLE))}
    val CHISELED_PURPLE_QUARTZ_BLOCK = register("chiseled_purple_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PURPLE))}
    val PURPLE_QUARTZ_BRICKS = register("purple_quartz_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PURPLE))}
    val PURPLE_QUARTZ_PILLAR = register("purple_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.PURPLE))}
    val SMOOTH_PURPLE_QUARTZ = register("smooth_purple_quartz") { Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.PURPLE))}
    val SMOOTH_PURPLE_QUARTZ_STAIRS = register("smooth_purple_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PURPLE))}
    val SMOOTH_PURPLE_QUARTZ_SLAB = register("smooth_purple_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.PURPLE))}

    val BLUE_QUARTZ_BLOCK = register("blue_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLUE))}
    val BLUE_QUARTZ_STAIRS = register("blue_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLUE))}
    val BLUE_QUARTZ_SLAB = register("blue_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLUE))}
    val CHISELED_BLUE_QUARTZ_BLOCK = register("chiseled_blue_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLUE))}
    val BLUE_QUARTZ_BRICKS = register("blue_quartz_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLUE))}
    val BLUE_QUARTZ_PILLAR = register("blue_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.BLUE))}
    val SMOOTH_BLUE_QUARTZ = register("smooth_blue_quartz") { Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.BLUE))}
    val SMOOTH_BLUE_QUARTZ_STAIRS = register("smooth_blue_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLUE))}
    val SMOOTH_BLUE_QUARTZ_SLAB = register("smooth_blue_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLUE))}

    val BROWN_QUARTZ_BLOCK = register("brown_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BROWN))}
    val BROWN_QUARTZ_STAIRS = register("brown_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BROWN))}
    val BROWN_QUARTZ_SLAB = register("brown_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BROWN))}
    val CHISELED_BROWN_QUARTZ_BLOCK = register("chiseled_brown_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BROWN))}
    val BROWN_QUARTZ_BRICKS = register("brown_quartz_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BROWN))}
    val BROWN_QUARTZ_PILLAR = register("brown_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.BROWN))}
    val SMOOTH_BROWN_QUARTZ = register("smooth_brown_quartz") { Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.BROWN))}
    val SMOOTH_BROWN_QUARTZ_STAIRS = register("smooth_brown_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BROWN))}
    val SMOOTH_BROWN_QUARTZ_SLAB = register("smooth_brown_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BROWN))}

    val GREEN_QUARTZ_BLOCK = register("green_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GREEN))}
    val GREEN_QUARTZ_STAIRS = register("green_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GREEN))}
    val GREEN_QUARTZ_SLAB = register("green_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GREEN))}
    val CHISELED_GREEN_QUARTZ_BLOCK = register("chiseled_green_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GREEN))}
    val GREEN_QUARTZ_BRICKS = register("green_quartz_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GREEN))}
    val GREEN_QUARTZ_PILLAR = register("green_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.GREEN))}
    val SMOOTH_GREEN_QUARTZ = register("smooth_green_quartz") { Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.GREEN))}
    val SMOOTH_GREEN_QUARTZ_STAIRS = register("smooth_green_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GREEN))}
    val SMOOTH_GREEN_QUARTZ_SLAB = register("smooth_green_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.GREEN))}

    val RED_QUARTZ_BLOCK = register("red_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.RED))}
    val RED_QUARTZ_STAIRS = register("red_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.RED))}
    val RED_QUARTZ_SLAB = register("red_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.RED))}
    val CHISELED_RED_QUARTZ_BLOCK = register("chiseled_red_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.RED))}
    val RED_QUARTZ_BRICKS = register("red_quartz_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.RED))}
    val RED_QUARTZ_PILLAR = register("red_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.RED))}
    val SMOOTH_RED_QUARTZ = register("smooth_red_quartz") { Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.RED))}
    val SMOOTH_RED_QUARTZ_STAIRS = register("smooth_red_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.RED))}
    val SMOOTH_RED_QUARTZ_SLAB = register("smooth_red_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.RED))}

    val BLACK_QUARTZ_BLOCK = register("black_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLACK))}
    val BLACK_QUARTZ_STAIRS = register("black_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLACK))}
    val BLACK_QUARTZ_SLAB = register("black_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLACK))}
    val CHISELED_BLACK_QUARTZ_BLOCK = register("chiseled_black_quartz_block") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLACK))}
    val BLACK_QUARTZ_BRICKS = register("black_quartz_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLACK))}
    val BLACK_QUARTZ_PILLAR = register("black_quartz_pillar") { RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.BLACK))}
    val SMOOTH_BLACK_QUARTZ = register("smooth_black_quartz") { Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.BLACK))}
    val SMOOTH_BLACK_QUARTZ_STAIRS = register("smooth_black_quartz_stairs") { HybridBlocksStairBlock(Blocks.QUARTZ_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLACK))}
    val SMOOTH_BLACK_QUARTZ_SLAB = register("smooth_black_quartz_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).mapColor(DyeColor.BLACK))}

    // endregion

    // region Bricks

    val LARGE_BRICKS = register("large_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val SMALL_BRICKS = register("small_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val CRACKED_BRICKS = register("cracked_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val CRACKED_BRICK_STAIRS = register("cracked_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val CRACKED_BRICK_SLAB = register("cracked_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val CRACKED_BRICK_WALL = register("cracked_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL))}
    val BASKETWEAVE_BRICKS = register("basketweave_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val PINWHEEL_BRICKS = register("pinwheel_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val JACK_ON_JACK_BRICKS = register("jack_on_jack_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val MIXED_BRICKS = register("mixed_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val SHINGLES = register("shingles") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}

    val LARGE_NETHER_BRICKS = register("large_nether_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS))}
    val SMALL_NETHER_BRICKS = register("small_nether_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS))}
    val BASKETWEAVE_NETHER_BRICKS = register("basketweave_nether_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS))}
    val PINWHEEL_NETHER_BRICKS = register("pinwheel_nether_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS))}
    val JACK_ON_JACK_NETHER_BRICKS = register("jack_on_jack_nether_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS))}
    val MIXED_NETHER_BRICKS = register("mixed_nether_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS))}
    val MIXED_NETHER_BRICK_STAIRS = register("mixed_nether_brick_stairs") { HybridBlocksStairBlock(Blocks.NETHER_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS))}
    val MIXED_NETHER_BRICK_SLAB = register("mixed_nether_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS))}
    val MIXED_NETHER_BRICK_WALL = register("mixed_nether_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICK_WALL))}
    val NETHER_BRICK_SHINGLES = register("nether_brick_shingles") { Block(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS))}

    val LARGE_RED_NETHER_BRICKS = register("large_red_nether_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS))}
    val SMALL_RED_NETHER_BRICKS = register("small_red_nether_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS))}
    val BASKETWEAVE_RED_NETHER_BRICKS = register("basketweave_red_nether_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS))}
    val PINWHEEL_RED_NETHER_BRICKS = register("pinwheel_red_nether_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS))}
    val JACK_ON_JACK_RED_NETHER_BRICKS = register("jack_on_jack_red_nether_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS))}
    val MIXED_RED_NETHER_BRICKS = register("mixed_red_nether_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS))}
    val MIXED_RED_NETHER_BRICK_STAIRS = register("mixed_red_nether_brick_stairs") { HybridBlocksStairBlock(Blocks.RED_NETHER_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS))}
    val MIXED_RED_NETHER_BRICK_SLAB = register("mixed_red_nether_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS))}
    val MIXED_RED_NETHER_BRICK_WALL = register("mixed_red_nether_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICK_WALL))}
    val RED_NETHER_BRICK_SHINGLES = register("red_nether_brick_shingles") { Block(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS))}

    val WHITE_BRICKS = register("white_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.WHITE))}
    val LARGE_WHITE_BRICKS = register("large_white_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.WHITE))}
    val SMALL_WHITE_BRICKS = register("small_white_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.WHITE))}
    val CRACKED_WHITE_BRICKS = register("cracked_white_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val WHITE_BRICK_STAIRS = register("white_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.WHITE))}
    val WHITE_BRICK_SLAB = register("white_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.WHITE))}
    val WHITE_BRICK_WALL = register("white_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.WHITE))}
    val BASKETWEAVE_WHITE_BRICKS = register("basketweave_white_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.WHITE))}
    val PINWHEEL_WHITE_BRICKS = register("pinwheel_white_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.WHITE))}
    val JACK_ON_JACK_WHITE_BRICKS = register("jack_on_jack_white_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.WHITE))}
    val MIXED_WHITE_BRICKS = register("mixed_white_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.WHITE))}
    val WHITE_SHINGLES = register("white_shingles") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}

    val ORANGE_BRICKS = register("orange_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.ORANGE))}
    val LARGE_ORANGE_BRICKS = register("large_orange_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.ORANGE))}
    val SMALL_ORANGE_BRICKS = register("small_orange_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.ORANGE))}
    val CRACKED_ORANGE_BRICKS = register("cracked_orange_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val ORANGE_BRICK_STAIRS = register("orange_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.ORANGE))}
    val ORANGE_BRICK_SLAB = register("orange_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.ORANGE))}
    val ORANGE_BRICK_WALL = register("orange_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.ORANGE))}
    val BASKETWEAVE_ORANGE_BRICKS = register("basketweave_orange_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.ORANGE))}
    val PINWHEEL_ORANGE_BRICKS = register("pinwheel_orange_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.ORANGE))}
    val JACK_ON_JACK_ORANGE_BRICKS = register("jack_on_jack_orange_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.ORANGE))}
    val MIXED_ORANGE_BRICKS = register("mixed_orange_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.ORANGE))}
    val ORANGE_SHINGLES = register("orange_shingles") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}

    val MAGENTA_BRICKS = register("magenta_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.MAGENTA))}
    val LARGE_MAGENTA_BRICKS = register("large_magenta_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.MAGENTA))}
    val SMALL_MAGENTA_BRICKS = register("small_magenta_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.MAGENTA))}
    val CRACKED_MAGENTA_BRICKS = register("cracked_magenta_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val MAGENTA_BRICK_STAIRS = register("magenta_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.MAGENTA))}
    val MAGENTA_BRICK_SLAB = register("magenta_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.MAGENTA))}
    val MAGENTA_BRICK_WALL = register("magenta_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.MAGENTA))}
    val BASKETWEAVE_MAGENTA_BRICKS = register("basketweave_magenta_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.MAGENTA))}
    val PINWHEEL_MAGENTA_BRICKS = register("pinwheel_magenta_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.MAGENTA))}
    val JACK_ON_JACK_MAGENTA_BRICKS = register("jack_on_jack_magenta_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.MAGENTA))}
    val MIXED_MAGENTA_BRICKS = register("mixed_magenta_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.MAGENTA))}
    val MAGENTA_SHINGLES = register("magenta_shingles") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}

    val LIGHT_BLUE_BRICKS = register("light_blue_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_BLUE))}
    val LARGE_LIGHT_BLUE_BRICKS = register("large_light_blue_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_BLUE))}
    val SMALL_LIGHT_BLUE_BRICKS = register("small_light_blue_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_BLUE))}
    val CRACKED_LIGHT_BLUE_BRICKS = register("cracked_light_blue_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val LIGHT_BLUE_BRICK_STAIRS = register("light_blue_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_BLUE))}
    val LIGHT_BLUE_BRICK_SLAB = register("light_blue_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_BLUE))}
    val LIGHT_BLUE_BRICK_WALL = register("light_blue_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.LIGHT_BLUE))}
    val BASKETWEAVE_LIGHT_BLUE_BRICKS = register("basketweave_light_blue_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_BLUE))}
    val PINWHEEL_LIGHT_BLUE_BRICKS = register("pinwheel_light_blue_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_BLUE))}
    val JACK_ON_JACK_LIGHT_BLUE_BRICKS = register("jack_on_jack_light_blue_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_BLUE))}
    val MIXED_LIGHT_BLUE_BRICKS = register("mixed_light_blue_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_BLUE))}
    val LIGHT_BLUE_SHINGLES = register("light_blue_shingles") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}

    val YELLOW_BRICKS = register("yellow_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.YELLOW))}
    val LARGE_YELLOW_BRICKS = register("large_yellow_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.YELLOW))}
    val SMALL_YELLOW_BRICKS = register("small_yellow_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.YELLOW))}
    val CRACKED_YELLOW_BRICKS = register("cracked_yellow_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val YELLOW_BRICK_STAIRS = register("yellow_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.YELLOW))}
    val YELLOW_BRICK_SLAB = register("yellow_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.YELLOW))}
    val YELLOW_BRICK_WALL = register("yellow_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.YELLOW))}
    val BASKETWEAVE_YELLOW_BRICKS = register("basketweave_yellow_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.YELLOW))}
    val PINWHEEL_YELLOW_BRICKS = register("pinwheel_yellow_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.YELLOW))}
    val JACK_ON_JACK_YELLOW_BRICKS = register("jack_on_jack_yellow_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.YELLOW))}
    val MIXED_YELLOW_BRICKS = register("mixed_yellow_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.YELLOW))}
    val YELLOW_SHINGLES = register("yellow_shingles") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}

    val LIME_BRICKS = register("lime_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIME))}
    val LARGE_LIME_BRICKS = register("large_lime_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIME))}
    val SMALL_LIME_BRICKS = register("small_lime_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIME))}
    val CRACKED_LIME_BRICKS = register("cracked_lime_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val LIME_BRICK_STAIRS = register("lime_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIME))}
    val LIME_BRICK_SLAB = register("lime_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIME))}
    val LIME_BRICK_WALL = register("lime_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.LIME))}
    val BASKETWEAVE_LIME_BRICKS = register("basketweave_lime_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIME))}
    val PINWHEEL_LIME_BRICKS = register("pinwheel_lime_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIME))}
    val JACK_ON_JACK_LIME_BRICKS = register("jack_on_jack_lime_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIME))}
    val MIXED_LIME_BRICKS = register("mixed_lime_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIME))}
    val LIME_SHINGLES = register("lime_shingles") { Block( BlockBehaviour.Properties.copy(Blocks.BRICKS))}

    val PINK_BRICKS = register("pink_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.PINK))}
    val LARGE_PINK_BRICKS = register("large_pink_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.PINK))}
    val SMALL_PINK_BRICKS = register("small_pink_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.PINK))}
    val CRACKED_PINK_BRICKS = register("cracked_pink_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val PINK_BRICK_STAIRS = register("pink_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.PINK))}
    val PINK_BRICK_SLAB = register("pink_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.PINK))}
    val PINK_BRICK_WALL = register("pink_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.PINK))}
    val BASKETWEAVE_PINK_BRICKS = register("basketweave_pink_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.PINK))}
    val PINWHEEL_PINK_BRICKS = register("pinwheel_pink_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.PINK))}
    val JACK_ON_JACK_PINK_BRICKS = register("jack_on_jack_pink_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.PINK))}
    val MIXED_PINK_BRICKS = register("mixed_pink_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.PINK))}
    val PINK_SHINGLES = register("pink_shingles") { Block( BlockBehaviour.Properties.copy(Blocks.BRICKS))}

    val GRAY_BRICKS = register("gray_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GRAY))}
    val LARGE_GRAY_BRICKS = register("large_gray_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GRAY))}
    val SMALL_GRAY_BRICKS = register("small_gray_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GRAY))}
    val CRACKED_GRAY_BRICKS = register("cracked_gray_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val GRAY_BRICK_STAIRS = register("gray_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GRAY))}
    val GRAY_BRICK_SLAB = register("gray_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GRAY))}
    val GRAY_BRICK_WALL = register("gray_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.GRAY))}
    val BASKETWEAVE_GRAY_BRICKS = register("basketweave_gray_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GRAY))}
    val PINWHEEL_GRAY_BRICKS = register("pinwheel_gray_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GRAY))}
    val JACK_ON_JACK_GRAY_BRICKS = register("jack_on_jack_gray_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GRAY))}
    val MIXED_GRAY_BRICKS = register("mixed_gray_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GRAY))}
    val GRAY_SHINGLES = register("gray_shingles") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}

    val LIGHT_GRAY_BRICKS = register("light_gray_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_GRAY))}
    val LARGE_LIGHT_GRAY_BRICKS = register("large_light_gray_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_GRAY))}
    val SMALL_LIGHT_GRAY_BRICKS = register("small_light_gray_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_GRAY))}
    val CRACKED_LIGHT_GRAY_BRICKS = register("cracked_light_gray_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val LIGHT_GRAY_BRICK_STAIRS = register("light_gray_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_GRAY))}
    val LIGHT_GRAY_BRICK_SLAB = register("light_gray_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_GRAY))}
    val LIGHT_GRAY_BRICK_WALL = register("light_gray_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.LIGHT_GRAY))}
    val BASKETWEAVE_LIGHT_GRAY_BRICKS = register("basketweave_light_gray_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_GRAY))}
    val PINWHEEL_LIGHT_GRAY_BRICKS = register("pinwheel_light_gray_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_GRAY))}
    val JACK_ON_JACK_LIGHT_GRAY_BRICKS = register("jack_on_jack_light_gray_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_GRAY))}
    val MIXED_LIGHT_GRAY_BRICKS = register("mixed_light_gray_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_GRAY))}
    val LIGHT_GRAY_SHINGLES = register("light_gray_shingles") { Block( BlockBehaviour.Properties.copy(Blocks.BRICKS))}

    val CYAN_BRICKS = register("cyan_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.CYAN))}
    val LARGE_CYAN_BRICKS = register("large_cyan_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.CYAN))}
    val SMALL_CYAN_BRICKS = register("small_cyan_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.CYAN))}
    val CRACKED_CYAN_BRICKS = register("cracked_cyan_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val CYAN_BRICK_STAIRS = register("cyan_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.CYAN))}
    val CYAN_BRICK_SLAB = register("cyan_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.CYAN))}
    val CYAN_BRICK_WALL = register("cyan_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.CYAN))}
    val BASKETWEAVE_CYAN_BRICKS = register("basketweave_cyan_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.CYAN))}
    val PINWHEEL_CYAN_BRICKS = register("pinwheel_cyan_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.CYAN))}
    val JACK_ON_JACK_CYAN_BRICKS = register("jack_on_jack_cyan_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.CYAN))}
    val MIXED_CYAN_BRICKS = register("mixed_cyan_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.CYAN))}
    val CYAN_SHINGLES = register("cyan_shingles") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}

    val PURPLE_BRICKS = register("purple_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.PURPLE))}
    val LARGE_PURPLE_BRICKS = register("large_purple_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.PURPLE))}
    val SMALL_PURPLE_BRICKS = register("small_purple_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.PURPLE))}
    val CRACKED_PURPLE_BRICKS = register("cracked_purple_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val PURPLE_BRICK_STAIRS = register("purple_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.PURPLE))}
    val PURPLE_BRICK_SLAB = register("purple_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.PURPLE))}
    val PURPLE_BRICK_WALL = register("purple_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.PURPLE))}
    val BASKETWEAVE_PURPLE_BRICKS = register("basketweave_purple_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.PURPLE))}
    val PINWHEEL_PURPLE_BRICKS = register("pinwheel_purple_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.PURPLE))}
    val JACK_ON_JACK_PURPLE_BRICKS = register("jack_on_jack_purple_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.PURPLE))}
    val MIXED_PURPLE_BRICKS = register("mixed_purple_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.PURPLE))}
    val PURPLE_SHINGLES = register("purple_shingles") { Block( BlockBehaviour.Properties.copy(Blocks.BRICKS))}

    val BLUE_BRICKS = register("blue_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLUE))}
    val LARGE_BLUE_BRICKS = register("large_blue_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLUE))}
    val SMALL_BLUE_BRICKS = register("small_blue_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLUE))}
    val CRACKED_BLUE_BRICKS = register("cracked_blue_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val BLUE_BRICK_STAIRS = register("blue_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLUE))}
    val BLUE_BRICK_SLAB = register("blue_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLUE))}
    val BLUE_BRICK_WALL = register("blue_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.BLUE))}
    val BASKETWEAVE_BLUE_BRICKS = register("basketweave_blue_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLUE))}
    val PINWHEEL_BLUE_BRICKS = register("pinwheel_blue_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLUE))}
    val JACK_ON_JACK_BLUE_BRICKS = register("jack_on_jack_blue_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLUE))}
    val MIXED_BLUE_BRICKS = register("mixed_blue_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLUE))}
    val BLUE_SHINGLES = register("blue_shingles") { Block( BlockBehaviour.Properties.copy(Blocks.BRICKS))}

    val BROWN_BRICKS = register("brown_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BROWN))}
    val LARGE_BROWN_BRICKS = register("large_brown_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BROWN))}
    val SMALL_BROWN_BRICKS = register("small_brown_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BROWN))}
    val CRACKED_BROWN_BRICKS = register("cracked_brown_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val BROWN_BRICK_STAIRS = register("cracked_brown_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BROWN))}
    val BROWN_BRICK_SLAB = register("brown_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BROWN))}
    val BROWN_BRICK_WALL = register("brown_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.BROWN))}
    val BASKETWEAVE_BROWN_BRICKS = register("basketweave_brown_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BROWN))}
    val PINWHEEL_BROWN_BRICKS = register("pinwheel_brown_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BROWN))}
    val JACK_ON_JACK_BROWN_BRICKS = register("jack_on_jack_brown_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BROWN))}
    val MIXED_BROWN_BRICKS = register("mixed_brown_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BROWN))}
    val BROWN_SHINGLES = register("brown_shingles") { Block( BlockBehaviour.Properties.copy(Blocks.BRICKS))}

    val GREEN_BRICKS = register("green_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GREEN))}
    val LARGE_GREEN_BRICKS = register("large_green_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GREEN))}
    val SMALL_GREEN_BRICKS = register("small_green_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GREEN))}
    val CRACKED_GREEN_BRICKS = register("cracked_green_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val GREEN_BRICK_STAIRS = register("green_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GREEN))}
    val GREEN_BRICK_SLAB = register("green_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GREEN))}
    val GREEN_BRICK_WALL = register("green_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.GREEN))}
    val BASKETWEAVE_GREEN_BRICKS = register("basketweave_green_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GREEN))}
    val PINWHEEL_GREEN_BRICKS = register("pinwheel_green_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GREEN))}
    val JACK_ON_JACK_GREEN_BRICKS = register("jack_on_jack_green_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GREEN))}
    val MIXED_GREEN_BRICKS = register("mixed_green_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GREEN))}
    val GREEN_SHINGLES = register("green_shingles") { Block( BlockBehaviour.Properties.copy(Blocks.BRICKS))}

    val RED_BRICKS = register("red_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.RED))}
    val LARGE_RED_BRICKS = register("large_red_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.RED))}
    val SMALL_RED_BRICKS = register("small_red_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.RED))}
    val CRACKED_RED_BRICKS = register("cracked_red_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val RED_BRICK_STAIRS = register("red_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.RED))}
    val RED_BRICK_SLAB = register("red_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.RED))}
    val RED_BRICK_WALL = register("red_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.RED))}
    val BASKETWEAVE_RED_BRICKS = register("basketweave_red_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.RED))}
    val PINWHEEL_RED_BRICKS = register("pinwheel_red_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.RED))}
    val JACK_ON_JACK_RED_BRICKS = register("jack_on_jack_red_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.RED))}
    val MIXED_RED_BRICKS = register("mixed_red_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.RED))}
    val RED_SHINGLES = register("red_shingles") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}

    val BLACK_BRICKS = register("black_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLACK))}
    val LARGE_BLACK_BRICKS = register("large_black_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLACK))}
    val SMALL_BLACK_BRICKS = register("small_black_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLACK))}
    val CRACKED_BLACK_BRICKS = register("cracked_black_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}
    val BLACK_BRICK_STAIRS = register("black_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLACK))}
    val BLACK_BRICK_SLAB = register("black_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLACK))}
    val BLACK_BRICK_WALL = register("black_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.BLACK))}
    val BASKETWEAVE_BLACK_BRICKS = register("basketweave_black_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLACK))}
    val PINWHEEL_BLACK_BRICKS = register("pinwheel_black_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLACK))}
    val JACK_ON_JACK_BLACK_BRICKS = register("jack_on_jack_black_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLACK))}
    val MIXED_BLACK_BRICKS = register("mixed_black_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLACK))}
    val BLACK_SHINGLES = register("black_shingles") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS))}

    val MOSSY_BRICKS = register("mossy_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLACK))}
    val MOSSY_BRICK_STAIRS = register("mossy_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLACK))}
    val MOSSY_BRICK_SLAB = register("mossy_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLACK))}
    val MOSSY_BRICK_WALL = register("mossy_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.BLACK))}

    val MOSSY_WHITE_BRICKS = register("mossy_white_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.WHITE))}
    val MOSSY_WHITE_BRICK_STAIRS = register("mossy_white_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.WHITE))}
    val MOSSY_WHITE_BRICK_SLAB = register("mossy_white_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.WHITE))}
    val MOSSY_WHITE_BRICK_WALL = register("mossy_white_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.WHITE))}

    val MOSSY_ORANGE_BRICKS = register("mossy_orange_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.ORANGE))}
    val MOSSY_ORANGE_BRICK_STAIRS = register("mossy_orange_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.ORANGE))}
    val MOSSY_ORANGE_BRICK_SLAB = register("mossy_orange_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.ORANGE))}
    val MOSSY_ORANGE_BRICK_WALL = register("mossy_orange_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.ORANGE))}

    val MOSSY_MAGENTA_BRICKS = register("mossy_magenta_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.MAGENTA))}
    val MOSSY_MAGENTA_BRICK_STAIRS = register("mossy_magenta_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.MAGENTA))}
    val MOSSY_MAGENTA_BRICK_SLAB = register("mossy_magenta_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.MAGENTA))}
    val MOSSY_MAGENTA_BRICK_WALL = register("mossy_magenta_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.MAGENTA))}

    val MOSSY_LIGHT_BLUE_BRICKS = register("mossy_light_blue_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_BLUE))}
    val MOSSY_LIGHT_BLUE_BRICK_STAIRS = register("mossy_light_blue_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_BLUE))}
    val MOSSY_LIGHT_BLUE_BRICK_SLAB = register("mossy_light_blue_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_BLUE))}
    val MOSSY_LIGHT_BLUE_BRICK_WALL = register("mossy_light_blue_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.LIGHT_BLUE))}

    val MOSSY_YELLOW_BRICKS = register("mossy_yellow_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.YELLOW))}
    val MOSSY_YELLOW_BRICK_STAIRS = register("mossy_yellow_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.YELLOW))}
    val MOSSY_YELLOW_BRICK_SLAB = register("mossy_yellow_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.YELLOW))}
    val MOSSY_YELLOW_BRICK_WALL = register("mossy_yellow_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.YELLOW))}

    val MOSSY_LIME_BRICKS = register("mossy_lime_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIME))}
    val MOSSY_LIME_BRICK_STAIRS = register("mossy_lime_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIME))}
    val MOSSY_LIME_BRICK_SLAB = register("mossy_lime_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIME))}
    val MOSSY_LIME_BRICK_WALL = register("mossy_lime_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.LIME))}

    val MOSSY_PINK_BRICKS = register("mossy_pink_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.PINK))}
    val MOSSY_PINK_BRICK_STAIRS = register("mossy_pink_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.PINK))}
    val MOSSY_PINK_BRICK_SLAB = register("mossy_pink_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.PINK))}
    val MOSSY_PINK_BRICK_WALL = register("mossy_pink_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.PINK))}

    val MOSSY_GRAY_BRICKS = register("mossy_gray_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GRAY))}
    val MOSSY_GRAY_BRICK_STAIRS = register("mossy_gray_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GRAY))}
    val MOSSY_GRAY_BRICK_SLAB = register("mossy_gray_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GRAY))}
    val MOSSY_GRAY_BRICK_WALL = register("mossy_gray_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.GRAY))}

    val MOSSY_LIGHT_GRAY_BRICKS = register("mossy_light_gray_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_GRAY))}
    val MOSSY_LIGHT_GRAY_BRICK_STAIRS = register("mossy_light_gray_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_GRAY))}
    val MOSSY_LIGHT_GRAY_BRICK_SLAB = register("mossy_light_gray_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_GRAY))}
    val MOSSY_LIGHT_GRAY_BRICK_WALL = register("mossy_light_gray_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.LIGHT_GRAY))}

    val MOSSY_CYAN_BRICKS = register("mossy_cyan_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.CYAN))}
    val MOSSY_CYAN_BRICK_STAIRS = register("mossy_cyan_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.CYAN))}
    val MOSSY_CYAN_BRICK_SLAB = register("mossy_cyan_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.CYAN))}
    val MOSSY_CYAN_BRICK_WALL = register("mossy_cyan_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.CYAN))}

    val MOSSY_PURPLE_BRICKS = register("mossy_purple_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.PURPLE))}
    val MOSSY_PURPLE_BRICK_STAIRS = register("mossy_purple_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.PURPLE))}
    val MOSSY_PURPLE_BRICK_SLAB = register("mossy_purple_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.PURPLE))}
    val MOSSY_PURPLE_BRICK_WALL = register("mossy_purple_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.PURPLE))}

    val MOSSY_BLUE_BRICKS = register("mossy_blue_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLUE))}
    val MOSSY_BLUE_BRICK_STAIRS = register("mossy_blue_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLUE))}
    val MOSSY_BLUE_BRICK_SLAB = register("mossy_blue_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLUE))}
    val MOSSY_BLUE_BRICK_WALL = register("mossy_blue_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.BLUE))}

    val MOSSY_BROWN_BRICKS = register("mossy_brown_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BROWN))}
    val MOSSY_BROWN_BRICK_STAIRS = register("mossy_brown_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BROWN))}
    val MOSSY_BROWN_BRICK_SLAB = register("mossy_brown_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BROWN))}
    val MOSSY_BROWN_BRICK_WALL = register("mossy_brown_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.BROWN))}

    val MOSSY_GREEN_BRICKS = register("mossy_green_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GREEN))}
    val MOSSY_GREEN_BRICK_STAIRS = register("mossy_green_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GREEN))}
    val MOSSY_GREEN_BRICK_SLAB = register("mossy_green_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.GREEN))}
    val MOSSY_GREEN_BRICK_WALL = register("mossy_green_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.GREEN))}

    val MOSSY_RED_BRICKS = register("mossy_red_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.RED))}
    val MOSSY_RED_BRICK_STAIRS = register("mossy_red_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.RED))}
    val MOSSY_RED_BRICK_SLAB = register("mossy_red_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.RED))}
    val MOSSY_RED_BRICK_WALL = register("mossy_red_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.RED))}

    val MOSSY_BLACK_BRICKS = register("mossy_black_bricks") { Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLACK))}
    val MOSSY_BLACK_BRICK_STAIRS = register("mossy_black_brick_stairs") { HybridBlocksStairBlock(Blocks.BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLACK))}
    val MOSSY_BLACK_BRICK_SLAB = register("mossy_black_brick_slab") { SlabBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).mapColor(DyeColor.BLACK))}
    val MOSSY_BLACK_BRICK_WALL = register("mossy_black_brick_wall") { WallBlock(BlockBehaviour.Properties.copy(Blocks.BRICK_WALL).mapColor(DyeColor.BLACK))}
    //endregion

    // region Clear Glass
    val CLEAR_GLASS = register("clear_glass") { GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS))}
    val WHITE_STAINED_CLEAR_GLASS = register("white_stained_clear_glass") { StainedGlassBlock(DyeColor.WHITE, BlockBehaviour.Properties.copy(Blocks.WHITE_STAINED_GLASS))}
    val ORANGE_STAINED_CLEAR_GLASS = register("orange_stained_clear_glass") { StainedGlassBlock(DyeColor.ORANGE, BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS))}
    val MAGENTA_STAINED_CLEAR_GLASS = register("magenta_stained_clear_glass") { StainedGlassBlock(DyeColor.MAGENTA, BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS))}
    val LIGHT_BLUE_STAINED_CLEAR_GLASS = register("light_blue_stained_clear_glass") { StainedGlassBlock(DyeColor.LIGHT_BLUE, BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS))}
    val YELLOW_STAINED_CLEAR_GLASS = register("yellow_stained_clear_glass") { StainedGlassBlock(DyeColor.YELLOW, BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS))}
    val LIME_STAINED_CLEAR_GLASS = register("lime_stained_clear_glass") { StainedGlassBlock(DyeColor.LIME, BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS))}
    val PINK_STAINED_CLEAR_GLASS = register("pink_stained_clear_glass") { StainedGlassBlock(DyeColor.PINK, BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS))}
    val GRAY_STAINED_CLEAR_GLASS = register("gray_stained_clear_glass") { StainedGlassBlock(DyeColor.GRAY, BlockBehaviour.Properties.copy(Blocks.GRAY_STAINED_GLASS))}
    val LIGHT_GRAY_STAINED_CLEAR_GLASS = register("light_gray_stained_clear_glass") { StainedGlassBlock(DyeColor.LIGHT_GRAY, BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS))}
    val CYAN_STAINED_CLEAR_GLASS = register("cyan_stained_clear_glass") { StainedGlassBlock(DyeColor.CYAN, BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS))}
    val PURPLE_STAINED_CLEAR_GLASS = register("purple_stained_clear_glass") { StainedGlassBlock(DyeColor.PURPLE, BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS))}
    val BLUE_STAINED_CLEAR_GLASS = register("blue_stained_clear_glass") { StainedGlassBlock(DyeColor.BLUE, BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS))}
    val BROWN_STAINED_CLEAR_GLASS = register("brown_stained_clear_glass") { StainedGlassBlock(DyeColor.BROWN, BlockBehaviour.Properties.copy(Blocks.BROWN_STAINED_GLASS))}
    val GREEN_STAINED_CLEAR_GLASS = register("green_stained_clear_glass") { StainedGlassBlock(DyeColor.GREEN, BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS))}
    val RED_STAINED_CLEAR_GLASS = register("red_stained_clear_glass") { StainedGlassBlock(DyeColor.RED, BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS))}
    val BLACK_STAINED_CLEAR_GLASS = register("black_stained_clear_glass") { StainedGlassBlock(DyeColor.BLACK, BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS))}

    val CLEAR_GLASS_PANE = register("clear_glass_pane") { HybridBlocksBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS_PANE)) }
    val WHITE_STAINED_CLEAR_GLASS_PANE = register("white_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.WHITE, BlockBehaviour.Properties.copy(Blocks.WHITE_STAINED_GLASS_PANE))}
    val ORANGE_STAINED_CLEAR_GLASS_PANE = register("orange_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.ORANGE, BlockBehaviour.Properties.copy(Blocks.ORANGE_STAINED_GLASS_PANE))}
    val MAGENTA_STAINED_CLEAR_GLASS_PANE = register("magenta_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.MAGENTA, BlockBehaviour.Properties.copy(Blocks.MAGENTA_STAINED_GLASS_PANE))}
    val LIGHT_BLUE_STAINED_CLEAR_GLASS_PANE = register("light_blue_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.LIGHT_BLUE, BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE))}
    val YELLOW_STAINED_CLEAR_GLASS_PANE = register("yellow_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.YELLOW, BlockBehaviour.Properties.copy(Blocks.YELLOW_STAINED_GLASS_PANE))}
    val LIME_STAINED_CLEAR_GLASS_PANE = register("lime_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.LIME, BlockBehaviour.Properties.copy(Blocks.LIME_STAINED_GLASS_PANE))}
    val PINK_STAINED_CLEAR_GLASS_PANE = register("pink_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.PINK, BlockBehaviour.Properties.copy(Blocks.PINK_STAINED_GLASS_PANE))}
    val GRAY_STAINED_CLEAR_GLASS_PANE = register("gray_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.GRAY, BlockBehaviour.Properties.copy(Blocks.GRAY_STAINED_GLASS_PANE))}
    val LIGHT_GRAY_STAINED_CLEAR_GLASS_PANE = register("light_gray_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.LIGHT_GRAY, BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE))}
    val CYAN_STAINED_CLEAR_GLASS_PANE = register("cyan_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.CYAN, BlockBehaviour.Properties.copy(Blocks.CYAN_STAINED_GLASS_PANE))}
    val PURPLE_STAINED_CLEAR_GLASS_PANE = register("purple_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.PURPLE, BlockBehaviour.Properties.copy(Blocks.PURPLE_STAINED_GLASS_PANE))}
    val BLUE_STAINED_CLEAR_GLASS_PANE = register("blue_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.BLUE, BlockBehaviour.Properties.copy(Blocks.BLUE_STAINED_GLASS_PANE))}
    val BROWN_STAINED_CLEAR_GLASS_PANE = register("brown_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.BROWN, BlockBehaviour.Properties.copy(Blocks.BROWN_STAINED_GLASS_PANE))}
    val GREEN_STAINED_CLEAR_GLASS_PANE = register("green_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.GREEN, BlockBehaviour.Properties.copy(Blocks.GREEN_STAINED_GLASS_PANE))}
    val RED_STAINED_CLEAR_GLASS_PANE = register("red_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.RED, BlockBehaviour.Properties.copy(Blocks.RED_STAINED_GLASS_PANE))}
    val BLACK_STAINED_CLEAR_GLASS_PANE = register("black_stained_clear_glass_pane") { StainedGlassPaneBlock(DyeColor.BLACK, BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS_PANE))}

    // endregion

    private fun register(id: String, block: Supplier<Block>): RegistryObject<Block> {
        return HybridBlocksCommon.BLOCKS.register(id, block)
    }
}
