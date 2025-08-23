package dev.hybridlabs.blocks.block

import dev.hybridlabs.blocks.HybridBlocks
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.*
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.DyeColor
import net.minecraft.util.Identifier

/**
 * All Hybrid Blocks blocks.
 */
object HybridBlocksBlocks {

    // region Quartz

    val WHITE_STAINED_SMOOTH_QUARTZ = register("white_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.WHITE)))
    val WHITE_STAINED_QUARTZ_PILLAR = register("white_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.WHITE)))
    val WHITE_STAINED_SMOOTH_QUARTZ_STAIRS = register("white_stained_smooth_quartz_stairs", StairsBlock(WHITE_STAINED_SMOOTH_QUARTZ.defaultState, FabricBlockSettings.copy(WHITE_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.WHITE)))
    val WHITE_STAINED_SMOOTH_QUARTZ_SLAB = register("white_stained_smooth_quartz_slab", SlabBlock(FabricBlockSettings.copy(WHITE_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.WHITE)))

    val ORANGE_STAINED_SMOOTH_QUARTZ = register("orange_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.ORANGE)))
    val ORANGE_STAINED_QUARTZ_PILLAR = register("orange_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.ORANGE)))
    val ORANGE_STAINED_SMOOTH_QUARTZ_STAIRS = register("orange_stained_smooth_quartz_stairs", StairsBlock(ORANGE_STAINED_SMOOTH_QUARTZ.defaultState, FabricBlockSettings.copy(ORANGE_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.ORANGE)))
    val ORANGE_STAINED_SMOOTH_QUARTZ_SLAB = register("orange_stained_smooth_quartz_slab", SlabBlock(FabricBlockSettings.copy(ORANGE_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.ORANGE)))

    val MAGENTA_STAINED_SMOOTH_QUARTZ = register("magenta_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.MAGENTA)))
    val MAGENTA_STAINED_QUARTZ_PILLAR = register("magenta_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.MAGENTA)))
    val MAGENTA_STAINED_SMOOTH_QUARTZ_STAIRS = register("magenta_stained_smooth_quartz_stairs", StairsBlock(MAGENTA_STAINED_SMOOTH_QUARTZ.defaultState, FabricBlockSettings.copy(MAGENTA_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.MAGENTA)))
    val MAGENTA_STAINED_SMOOTH_QUARTZ_SLAB = register("magenta_stained_smooth_quartz_slab", SlabBlock(FabricBlockSettings.copy(MAGENTA_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.MAGENTA)))

    val LIGHT_BLUE_STAINED_SMOOTH_QUARTZ = register("light_blue_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.LIGHT_BLUE)))
    val LIGHT_BLUE_STAINED_QUARTZ_PILLAR = register("light_blue_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.LIGHT_BLUE)))
    val LIGHT_BLUE_STAINED_SMOOTH_QUARTZ_STAIRS = register("light_blue_stained_smooth_quartz_stairs", StairsBlock(LIGHT_BLUE_STAINED_SMOOTH_QUARTZ.defaultState, FabricBlockSettings.copy(LIGHT_BLUE_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.LIGHT_BLUE)))
    val LIGHT_BLUE_STAINED_SMOOTH_QUARTZ_SLAB = register("light_blue_stained_smooth_quartz_slab", SlabBlock(FabricBlockSettings.copy(LIGHT_BLUE_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.LIGHT_BLUE)))

    val YELLOW_STAINED_SMOOTH_QUARTZ = register("yellow_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.YELLOW)))
    val YELLOW_STAINED_QUARTZ_PILLAR = register("yellow_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.YELLOW)))
    val YELLOW_STAINED_SMOOTH_QUARTZ_STAIRS = register("yellow_stained_smooth_quartz_stairs", StairsBlock(YELLOW_STAINED_SMOOTH_QUARTZ.defaultState, FabricBlockSettings.copy(YELLOW_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.YELLOW)))
    val YELLOW_STAINED_SMOOTH_QUARTZ_SLAB = register("yellow_stained_smooth_quartz_slab", SlabBlock(FabricBlockSettings.copy(YELLOW_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.YELLOW)))

    val LIME_STAINED_SMOOTH_QUARTZ = register("lime_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.LIME)))
    val LIME_STAINED_QUARTZ_PILLAR = register("lime_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.LIME)))
    val LIME_STAINED_SMOOTH_QUARTZ_STAIRS = register("lime_stained_smooth_quartz_stairs", StairsBlock(LIME_STAINED_SMOOTH_QUARTZ.defaultState, FabricBlockSettings.copy(LIME_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.LIME)))
    val LIME_STAINED_SMOOTH_QUARTZ_SLAB = register("lime_stained_smooth_quartz_slab", SlabBlock(FabricBlockSettings.copy(LIME_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.LIME)))

    val PINK_STAINED_SMOOTH_QUARTZ = register("pink_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.PINK)))
    val PINK_STAINED_QUARTZ_PILLAR = register("pink_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.PINK)))
    val PINK_STAINED_SMOOTH_QUARTZ_STAIRS = register("pink_stained_smooth_quartz_stairs", StairsBlock(PINK_STAINED_SMOOTH_QUARTZ.defaultState, FabricBlockSettings.copy(PINK_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.PINK)))
    val PINK_STAINED_SMOOTH_QUARTZ_SLAB = register("pink_stained_smooth_quartz_slab", SlabBlock(FabricBlockSettings.copy(PINK_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.PINK)))

    val GRAY_STAINED_SMOOTH_QUARTZ = register("gray_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.GRAY)))
    val GRAY_STAINED_QUARTZ_PILLAR = register("gray_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.GRAY)))
    val GRAY_STAINED_SMOOTH_QUARTZ_STAIRS = register("gray_stained_smooth_quartz_stairs", StairsBlock(GRAY_STAINED_SMOOTH_QUARTZ.defaultState, FabricBlockSettings.copy(GRAY_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.GRAY)))
    val GRAY_STAINED_SMOOTH_QUARTZ_SLAB = register("gray_stained_smooth_quartz_slab", SlabBlock(FabricBlockSettings.copy(GRAY_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.GRAY)))

    val LIGHT_GRAY_STAINED_SMOOTH_QUARTZ = register("light_gray_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.LIGHT_GRAY)))
    val LIGHT_GRAY_STAINED_QUARTZ_PILLAR = register("light_gray_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.LIGHT_GRAY)))
    val LIGHT_GRAY_STAINED_SMOOTH_QUARTZ_STAIRS = register("light_gray_stained_smooth_quartz_stairs", StairsBlock(LIGHT_GRAY_STAINED_SMOOTH_QUARTZ.defaultState, FabricBlockSettings.copy(LIGHT_GRAY_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.LIGHT_GRAY)))
    val LIGHT_GRAY_STAINED_SMOOTH_QUARTZ_SLAB = register("light_gray_stained_smooth_quartz_slab", SlabBlock(FabricBlockSettings.copy(LIGHT_GRAY_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.LIGHT_GRAY)))

    val CYAN_STAINED_SMOOTH_QUARTZ = register("cyan_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.CYAN)))
    val CYAN_STAINED_QUARTZ_PILLAR = register("cyan_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.CYAN)))
    val CYAN_STAINED_SMOOTH_QUARTZ_STAIRS = register("cyan_stained_smooth_quartz_stairs", StairsBlock(CYAN_STAINED_SMOOTH_QUARTZ.defaultState, FabricBlockSettings.copy(CYAN_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.CYAN)))
    val CYAN_STAINED_SMOOTH_QUARTZ_SLAB = register("cyan_stained_smooth_quartz_slab", SlabBlock(FabricBlockSettings.copy(CYAN_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.CYAN)))

    val PURPLE_STAINED_SMOOTH_QUARTZ = register("purple_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.PURPLE)))
    val PURPLE_STAINED_QUARTZ_PILLAR = register("purple_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.PURPLE)))
    val PURPLE_STAINED_SMOOTH_QUARTZ_STAIRS = register("purple_stained_smooth_quartz_stairs", StairsBlock(PURPLE_STAINED_SMOOTH_QUARTZ.defaultState, FabricBlockSettings.copy(PURPLE_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.PURPLE)))
    val PURPLE_STAINED_SMOOTH_QUARTZ_SLAB = register("purple_stained_smooth_quartz_slab", SlabBlock(FabricBlockSettings.copy(PURPLE_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.PURPLE)))

    val BLUE_STAINED_SMOOTH_QUARTZ = register("blue_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.BLUE)))
    val BLUE_STAINED_QUARTZ_PILLAR = register("blue_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.BLUE)))
    val BLUE_STAINED_SMOOTH_QUARTZ_STAIRS = register("blue_stained_smooth_quartz_stairs", StairsBlock(BLUE_STAINED_SMOOTH_QUARTZ.defaultState, FabricBlockSettings.copy(BLUE_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.BLUE)))
    val BLUE_STAINED_SMOOTH_QUARTZ_SLAB = register("blue_stained_smooth_quartz_slab", SlabBlock(FabricBlockSettings.copy(BLUE_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.BLUE)))

    val BROWN_STAINED_SMOOTH_QUARTZ = register("brown_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.BROWN)))
    val BROWN_STAINED_QUARTZ_PILLAR = register("brown_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.BROWN)))
    val BROWN_STAINED_SMOOTH_QUARTZ_STAIRS = register("brown_stained_smooth_quartz_stairs", StairsBlock(BROWN_STAINED_SMOOTH_QUARTZ.defaultState, FabricBlockSettings.copy(BROWN_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.BROWN)))
    val BROWN_STAINED_SMOOTH_QUARTZ_SLAB = register("brown_stained_smooth_quartz_slab", SlabBlock(FabricBlockSettings.copy(BROWN_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.BROWN)))

    val GREEN_STAINED_SMOOTH_QUARTZ = register("green_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.GREEN)))
    val GREEN_STAINED_QUARTZ_PILLAR = register("green_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.GREEN)))
    val GREEN_STAINED_SMOOTH_QUARTZ_STAIRS = register("green_stained_smooth_quartz_stairs", StairsBlock(GREEN_STAINED_SMOOTH_QUARTZ.defaultState, FabricBlockSettings.copy(GREEN_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.GREEN)))
    val GREEN_STAINED_SMOOTH_QUARTZ_SLAB = register("green_stained_smooth_quartz_slab", SlabBlock(FabricBlockSettings.copy(GREEN_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.GREEN)))

    val RED_STAINED_SMOOTH_QUARTZ = register("red_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.RED)))
    val RED_STAINED_QUARTZ_PILLAR = register("red_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.RED)))
    val RED_STAINED_SMOOTH_QUARTZ_STAIRS = register("red_stained_smooth_quartz_stairs", StairsBlock(RED_STAINED_SMOOTH_QUARTZ.defaultState, FabricBlockSettings.copy(RED_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.RED)))
    val RED_STAINED_SMOOTH_QUARTZ_SLAB = register("red_stained_smooth_quartz_slab", SlabBlock(FabricBlockSettings.copy(RED_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.RED)))

    val BLACK_STAINED_SMOOTH_QUARTZ = register("black_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.BLACK)))
    val BLACK_STAINED_QUARTZ_PILLAR = register("black_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.BLACK)))
    val BLACK_STAINED_SMOOTH_QUARTZ_STAIRS = register("black_stained_smooth_quartz_stairs", StairsBlock(BLACK_STAINED_SMOOTH_QUARTZ.defaultState, FabricBlockSettings.copy(BLACK_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.BLACK)))
    val BLACK_STAINED_SMOOTH_QUARTZ_SLAB = register("black_stained_smooth_quartz_slab", SlabBlock(FabricBlockSettings.copy(BLACK_STAINED_SMOOTH_QUARTZ).mapColor(DyeColor.BLACK)))

    // endregion

    // region Bricks

    val CRACKED_BRICKS = register("cracked_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS)))
    val CRACKED_BRICK_STAIRS = register("cracked_brick_stairs", StairsBlock(CRACKED_BRICKS.defaultState, FabricBlockSettings.copy(CRACKED_BRICKS).mapColor(DyeColor.WHITE)))
    val CRACKED_BRICK_SLAB = register("cracked_brick_slab", SlabBlock(FabricBlockSettings.copy(CRACKED_BRICKS).mapColor(DyeColor.WHITE)))
    val CRACKED_BRICK_WALL = register("cracked_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.WHITE)))

    val WHITE_STAINED_BRICKS = register("white_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.WHITE)))
    val WHITE_STAINED_CRACKED_BRICKS = register("white_stained_cracked_bricks", Block(FabricBlockSettings.copy(WHITE_STAINED_BRICKS)))
    val WHITE_STAINED_BRICK_STAIRS = register("white_stained_brick_stairs", StairsBlock(WHITE_STAINED_BRICKS.defaultState, FabricBlockSettings.copy(WHITE_STAINED_BRICKS).mapColor(DyeColor.WHITE)))
    val WHITE_STAINED_BRICK_SLAB = register("white_stained_brick_slab", SlabBlock(FabricBlockSettings.copy(WHITE_STAINED_BRICKS).mapColor(DyeColor.WHITE)))
    val WHITE_STAINED_BRICK_WALL = register("white_stained_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.WHITE)))

    val ORANGE_STAINED_BRICKS = register("orange_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.ORANGE)))
    val ORANGE_STAINED_CRACKED_BRICKS = register("orange_stained_cracked_bricks", Block(FabricBlockSettings.copy(ORANGE_STAINED_BRICKS)))
    val ORANGE_STAINED_BRICK_STAIRS = register("orange_stained_brick_stairs", StairsBlock(ORANGE_STAINED_BRICKS.defaultState, FabricBlockSettings.copy(ORANGE_STAINED_BRICKS).mapColor(DyeColor.ORANGE)))
    val ORANGE_STAINED_BRICK_SLAB = register("orange_stained_brick_slab", SlabBlock(FabricBlockSettings.copy(ORANGE_STAINED_BRICKS).mapColor(DyeColor.ORANGE)))
    val ORANGE_STAINED_BRICK_WALL = register("orange_stained_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.ORANGE)))

    val MAGENTA_STAINED_BRICKS = register("magenta_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.MAGENTA)))
    val MAGENTA_STAINED_CRACKED_BRICKS = register("magenta_stained_cracked_bricks", Block(FabricBlockSettings.copy(MAGENTA_STAINED_BRICKS)))
    val MAGENTA_STAINED_BRICK_STAIRS = register("magenta_stained_brick_stairs", StairsBlock(MAGENTA_STAINED_BRICKS.defaultState, FabricBlockSettings.copy(MAGENTA_STAINED_BRICKS).mapColor(DyeColor.MAGENTA)))
    val MAGENTA_STAINED_BRICK_SLAB = register("magenta_stained_brick_slab", SlabBlock(FabricBlockSettings.copy(MAGENTA_STAINED_BRICKS).mapColor(DyeColor.MAGENTA)))
    val MAGENTA_STAINED_BRICK_WALL = register("magenta_stained_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.MAGENTA)))

    val LIGHT_BLUE_STAINED_BRICKS = register("light_blue_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_BLUE)))
    val LIGHT_BLUE_STAINED_CRACKED_BRICKS = register("light_blue_stained_cracked_bricks", Block(FabricBlockSettings.copy(LIGHT_BLUE_STAINED_BRICKS)))
    val LIGHT_BLUE_STAINED_BRICK_STAIRS = register("light_blue_stained_brick_stairs", StairsBlock(LIGHT_BLUE_STAINED_BRICKS.defaultState, FabricBlockSettings.copy(LIGHT_BLUE_STAINED_BRICKS).mapColor(DyeColor.LIGHT_BLUE)))
    val LIGHT_BLUE_STAINED_BRICK_SLAB = register("light_blue_stained_brick_slab", SlabBlock(FabricBlockSettings.copy(LIGHT_BLUE_STAINED_BRICKS).mapColor(DyeColor.LIGHT_BLUE)))
    val LIGHT_BLUE_STAINED_BRICK_WALL = register("light_blue_stained_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.LIGHT_BLUE)))

    val YELLOW_STAINED_BRICKS = register("yellow_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.YELLOW)))
    val YELLOW_STAINED_CRACKED_BRICKS = register("yellow_stained_cracked_bricks", Block(FabricBlockSettings.copy(YELLOW_STAINED_BRICKS)))
    val YELLOW_STAINED_BRICK_STAIRS = register("yellow_stained_brick_stairs", StairsBlock(YELLOW_STAINED_BRICKS.defaultState, FabricBlockSettings.copy(YELLOW_STAINED_BRICKS).mapColor(DyeColor.YELLOW)))
    val YELLOW_STAINED_BRICK_SLAB = register("yellow_stained_brick_slab", SlabBlock(FabricBlockSettings.copy(YELLOW_STAINED_BRICKS).mapColor(DyeColor.YELLOW)))
    val YELLOW_STAINED_BRICK_WALL = register("yellow_stained_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.YELLOW)))

    val LIME_STAINED_BRICKS = register("lime_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.LIME)))
    val LIME_STAINED_CRACKED_BRICKS = register("lime_stained_cracked_bricks", Block(FabricBlockSettings.copy(LIME_STAINED_BRICKS)))
    val LIME_STAINED_BRICK_STAIRS = register("lime_stained_brick_stairs", StairsBlock(LIME_STAINED_BRICKS.defaultState, FabricBlockSettings.copy(LIME_STAINED_BRICKS).mapColor(DyeColor.LIME)))
    val LIME_STAINED_BRICK_SLAB = register("lime_stained_brick_slab", SlabBlock(FabricBlockSettings.copy(LIME_STAINED_BRICKS).mapColor(DyeColor.LIME)))
    val LIME_STAINED_BRICK_WALL = register("lime_stained_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.LIME)))

    val PINK_STAINED_BRICKS = register("pink_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.PINK)))
    val PINK_STAINED_CRACKED_BRICKS = register("pink_stained_cracked_bricks", Block(FabricBlockSettings.copy(PINK_STAINED_BRICKS)))
    val PINK_STAINED_BRICK_STAIRS = register("pink_stained_brick_stairs", StairsBlock(PINK_STAINED_BRICKS.defaultState, FabricBlockSettings.copy(PINK_STAINED_BRICKS).mapColor(DyeColor.PINK)))
    val PINK_STAINED_BRICK_SLAB = register("pink_stained_brick_slab", SlabBlock(FabricBlockSettings.copy(PINK_STAINED_BRICKS).mapColor(DyeColor.PINK)))
    val PINK_STAINED_BRICK_WALL = register("pink_stained_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.PINK)))

    val GRAY_STAINED_BRICKS = register("gray_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.GRAY)))
    val GRAY_STAINED_CRACKED_BRICKS = register("gray_stained_cracked_bricks", Block(FabricBlockSettings.copy(GRAY_STAINED_BRICKS)))
    val GRAY_STAINED_BRICK_STAIRS = register("gray_stained_brick_stairs", StairsBlock(GRAY_STAINED_BRICKS.defaultState, FabricBlockSettings.copy(GRAY_STAINED_BRICKS).mapColor(DyeColor.GRAY)))
    val GRAY_STAINED_BRICK_SLAB = register("gray_stained_brick_slab", SlabBlock(FabricBlockSettings.copy(GRAY_STAINED_BRICKS).mapColor(DyeColor.GRAY)))
    val GRAY_STAINED_BRICK_WALL = register("gray_stained_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.GRAY)))

    val LIGHT_GRAY_STAINED_BRICKS = register("light_gray_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_GRAY)))
    val LIGHT_GRAY_STAINED_CRACKED_BRICKS = register("light_gray_stained_cracked_bricks", Block(FabricBlockSettings.copy(LIGHT_GRAY_STAINED_BRICKS)))
    val LIGHT_GRAY_STAINED_BRICK_STAIRS = register("light_gray_stained_brick_stairs", StairsBlock(LIGHT_GRAY_STAINED_BRICKS.defaultState, FabricBlockSettings.copy(LIGHT_GRAY_STAINED_BRICKS).mapColor(DyeColor.LIGHT_GRAY)))
    val LIGHT_GRAY_STAINED_BRICK_SLAB = register("light_gray_stained_brick_slab", SlabBlock(FabricBlockSettings.copy(LIGHT_GRAY_STAINED_BRICKS).mapColor(DyeColor.LIGHT_GRAY)))
    val LIGHT_GRAY_STAINED_BRICK_WALL = register("light_gray_stained_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.LIGHT_GRAY)))

    val CYAN_STAINED_BRICKS = register("cyan_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.CYAN)))
    val CYAN_STAINED_CRACKED_BRICKS = register("cyan_stained_cracked_bricks", Block(FabricBlockSettings.copy(CYAN_STAINED_BRICKS)))
    val CYAN_STAINED_BRICK_STAIRS = register("cyan_stained_brick_stairs", StairsBlock(CYAN_STAINED_BRICKS.defaultState, FabricBlockSettings.copy(CYAN_STAINED_BRICKS).mapColor(DyeColor.CYAN)))
    val CYAN_STAINED_BRICK_SLAB = register("cyan_stained_brick_slab", SlabBlock(FabricBlockSettings.copy(CYAN_STAINED_BRICKS).mapColor(DyeColor.CYAN)))
    val CYAN_STAINED_BRICK_WALL = register("cyan_stained_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.CYAN)))

    val PURPLE_STAINED_BRICKS = register("purple_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.PURPLE)))
    val PURPLE_STAINED_CRACKED_BRICKS = register("purple_stained_cracked_bricks", Block(FabricBlockSettings.copy(PURPLE_STAINED_BRICKS)))
    val PURPLE_STAINED_BRICK_STAIRS = register("purple_stained_brick_stairs", StairsBlock(PURPLE_STAINED_BRICKS.defaultState, FabricBlockSettings.copy(PURPLE_STAINED_BRICKS).mapColor(DyeColor.PURPLE)))
    val PURPLE_STAINED_BRICK_SLAB = register("purple_stained_brick_slab", SlabBlock(FabricBlockSettings.copy(PURPLE_STAINED_BRICKS).mapColor(DyeColor.PURPLE)))
    val PURPLE_STAINED_BRICK_WALL = register("purple_stained_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.PURPLE)))

    val BLUE_STAINED_BRICKS = register("blue_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.BLUE)))
    val BLUE_STAINED_CRACKED_BRICKS = register("blue_stained_cracked_bricks", Block(FabricBlockSettings.copy(BLUE_STAINED_BRICKS)))
    val BLUE_STAINED_BRICK_STAIRS = register("blue_stained_brick_stairs", StairsBlock(BLUE_STAINED_BRICKS.defaultState, FabricBlockSettings.copy(BLUE_STAINED_BRICKS).mapColor(DyeColor.BLUE)))
    val BLUE_STAINED_BRICK_SLAB = register("blue_stained_brick_slab", SlabBlock(FabricBlockSettings.copy(BLUE_STAINED_BRICKS).mapColor(DyeColor.BLUE)))
    val BLUE_STAINED_BRICK_WALL = register("blue_stained_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.BLUE)))

    val BROWN_STAINED_BRICKS = register("brown_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.BROWN)))
    val BROWN_STAINED_CRACKED_BRICKS = register("brown_stained_cracked_bricks", Block(FabricBlockSettings.copy(BROWN_STAINED_BRICKS)))
    val BROWN_STAINED_BRICK_STAIRS = register("brown_stained_brick_stairs", StairsBlock(BROWN_STAINED_BRICKS.defaultState, FabricBlockSettings.copy(BROWN_STAINED_BRICKS).mapColor(DyeColor.BROWN)))
    val BROWN_STAINED_BRICK_SLAB = register("brown_stained_brick_slab", SlabBlock(FabricBlockSettings.copy(BROWN_STAINED_BRICKS).mapColor(DyeColor.BROWN)))
    val BROWN_STAINED_BRICK_WALL = register("brown_stained_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.BROWN)))

    val GREEN_STAINED_BRICKS = register("green_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.GREEN)))
    val GREEN_STAINED_CRACKED_BRICKS = register("green_stained_cracked_bricks", Block(FabricBlockSettings.copy(GREEN_STAINED_BRICKS)))
    val GREEN_STAINED_BRICK_STAIRS = register("green_stained_brick_stairs", StairsBlock(GREEN_STAINED_BRICKS.defaultState, FabricBlockSettings.copy(GREEN_STAINED_BRICKS).mapColor(DyeColor.GREEN)))
    val GREEN_STAINED_BRICK_SLAB = register("green_stained_brick_slab", SlabBlock(FabricBlockSettings.copy(GREEN_STAINED_BRICKS).mapColor(DyeColor.GREEN)))
    val GREEN_STAINED_BRICK_WALL = register("green_stained_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.GREEN)))

    val RED_STAINED_BRICKS = register("red_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.RED)))
    val RED_STAINED_CRACKED_BRICKS = register("red_stained_cracked_bricks", Block(FabricBlockSettings.copy(RED_STAINED_BRICKS)))
    val RED_STAINED_BRICK_STAIRS = register("red_stained_brick_stairs", StairsBlock(RED_STAINED_BRICKS.defaultState, FabricBlockSettings.copy(RED_STAINED_BRICKS).mapColor(DyeColor.RED)))
    val RED_STAINED_BRICK_SLAB = register("red_stained_brick_slab", SlabBlock(FabricBlockSettings.copy(RED_STAINED_BRICKS).mapColor(DyeColor.RED)))
    val RED_STAINED_BRICK_WALL = register("red_stained_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.RED)))

    val BLACK_STAINED_BRICKS = register("black_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.BLACK)))
    val BLACK_STAINED_CRACKED_BRICKS = register("black_stained_cracked_bricks", Block(FabricBlockSettings.copy(BLACK_STAINED_BRICKS)))
    val BLACK_STAINED_BRICK_STAIRS = register("black_stained_brick_stairs", StairsBlock(BLACK_STAINED_BRICKS.defaultState, FabricBlockSettings.copy(BLACK_STAINED_BRICKS).mapColor(DyeColor.BLACK)))
    val BLACK_STAINED_BRICK_SLAB = register("black_stained_brick_slab", SlabBlock(FabricBlockSettings.copy(BLACK_STAINED_BRICKS).mapColor(DyeColor.BLACK)))
    val BLACK_STAINED_BRICK_WALL = register("black_stained_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.BLACK)))

    val MOSSY_BRICKS = register("mossy_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.BLACK)))
    val MOSSY_BRICK_STAIRS = register("mossy_brick_stairs", StairsBlock(Blocks.BRICKS.defaultState, FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.BLACK)))
    val MOSSY_BRICK_SLAB = register("mossy_brick_slab", SlabBlock(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.BLACK)))
    val MOSSY_BRICK_WALL = register("mossy_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.BLACK)))

    val WHITE_STAINED_MOSSY_BRICKS = register("white_stained_mossy_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.WHITE)))
    val WHITE_STAINED_MOSSY_BRICK_STAIRS = register("white_stained_mossy_brick_stairs", StairsBlock(WHITE_STAINED_MOSSY_BRICKS.defaultState, FabricBlockSettings.copy(WHITE_STAINED_MOSSY_BRICKS).mapColor(DyeColor.WHITE)))
    val WHITE_STAINED_MOSSY_BRICK_SLAB = register("white_stained_mossy_brick_slab", SlabBlock(FabricBlockSettings.copy(WHITE_STAINED_MOSSY_BRICKS).mapColor(DyeColor.WHITE)))
    val WHITE_STAINED_MOSSY_BRICK_WALL = register("white_stained_mossy_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.WHITE)))

    val ORANGE_STAINED_MOSSY_BRICKS = register("orange_stained_mossy_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.ORANGE)))
    val ORANGE_STAINED_MOSSY_BRICK_STAIRS = register("orange_stained_mossy_brick_stairs", StairsBlock(ORANGE_STAINED_MOSSY_BRICKS.defaultState, FabricBlockSettings.copy(ORANGE_STAINED_MOSSY_BRICKS).mapColor(DyeColor.ORANGE)))
    val ORANGE_STAINED_MOSSY_BRICK_SLAB = register("orange_stained_mossy_brick_slab", SlabBlock(FabricBlockSettings.copy(ORANGE_STAINED_MOSSY_BRICKS).mapColor(DyeColor.ORANGE)))
    val ORANGE_STAINED_MOSSY_BRICK_WALL = register("orange_stained_mossy_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.ORANGE)))

    val MAGENTA_STAINED_MOSSY_BRICKS = register("magenta_stained_mossy_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.MAGENTA)))
    val MAGENTA_STAINED_MOSSY_BRICK_STAIRS = register("magenta_stained_mossy_brick_stairs", StairsBlock(MAGENTA_STAINED_MOSSY_BRICKS.defaultState, FabricBlockSettings.copy(MAGENTA_STAINED_MOSSY_BRICKS).mapColor(DyeColor.MAGENTA)))
    val MAGENTA_STAINED_MOSSY_BRICK_SLAB = register("magenta_stained_mossy_brick_slab", SlabBlock(FabricBlockSettings.copy(MAGENTA_STAINED_MOSSY_BRICKS).mapColor(DyeColor.MAGENTA)))
    val MAGENTA_STAINED_MOSSY_BRICK_WALL = register("magenta_stained_mossy_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.MAGENTA)))

    val LIGHT_BLUE_STAINED_MOSSY_BRICKS = register("light_blue_stained_mossy_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_BLUE)))
    val LIGHT_BLUE_STAINED_MOSSY_BRICK_STAIRS = register("light_blue_stained_mossy_brick_stairs", StairsBlock(LIGHT_BLUE_STAINED_MOSSY_BRICKS.defaultState, FabricBlockSettings.copy(LIGHT_BLUE_STAINED_MOSSY_BRICKS).mapColor(DyeColor.LIGHT_BLUE)))
    val LIGHT_BLUE_STAINED_MOSSY_BRICK_SLAB = register("light_blue_stained_mossy_brick_slab", SlabBlock(FabricBlockSettings.copy(LIGHT_BLUE_STAINED_MOSSY_BRICKS).mapColor(DyeColor.LIGHT_BLUE)))
    val LIGHT_BLUE_STAINED_MOSSY_BRICK_WALL = register("light_blue_stained_mossy_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.LIGHT_BLUE)))

    val YELLOW_STAINED_MOSSY_BRICKS = register("yellow_stained_mossy_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.YELLOW)))
    val YELLOW_STAINED_MOSSY_BRICK_STAIRS = register("yellow_stained_mossy_brick_stairs", StairsBlock(YELLOW_STAINED_MOSSY_BRICKS.defaultState, FabricBlockSettings.copy(YELLOW_STAINED_MOSSY_BRICKS).mapColor(DyeColor.YELLOW)))
    val YELLOW_STAINED_MOSSY_BRICK_SLAB = register("yellow_stained_mossy_brick_slab", SlabBlock(FabricBlockSettings.copy(YELLOW_STAINED_MOSSY_BRICKS).mapColor(DyeColor.YELLOW)))
    val YELLOW_STAINED_MOSSY_BRICK_WALL = register("yellow_stained_mossy_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.YELLOW)))

    val LIME_STAINED_MOSSY_BRICKS = register("lime_stained_mossy_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.LIME)))
    val LIME_STAINED_MOSSY_BRICK_STAIRS = register("lime_stained_mossy_brick_stairs", StairsBlock(LIME_STAINED_MOSSY_BRICKS.defaultState, FabricBlockSettings.copy(LIME_STAINED_MOSSY_BRICKS).mapColor(DyeColor.LIME)))
    val LIME_STAINED_MOSSY_BRICK_SLAB = register("lime_stained_mossy_brick_slab", SlabBlock(FabricBlockSettings.copy(LIME_STAINED_MOSSY_BRICKS).mapColor(DyeColor.LIME)))
    val LIME_STAINED_MOSSY_BRICK_WALL = register("lime_stained_mossy_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.LIME)))

    val PINK_STAINED_MOSSY_BRICKS = register("pink_stained_mossy_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.PINK)))
    val PINK_STAINED_MOSSY_BRICK_STAIRS = register("pink_stained_mossy_brick_stairs", StairsBlock(PINK_STAINED_MOSSY_BRICKS.defaultState, FabricBlockSettings.copy(PINK_STAINED_MOSSY_BRICKS).mapColor(DyeColor.PINK)))
    val PINK_STAINED_MOSSY_BRICK_SLAB = register("pink_stained_mossy_brick_slab", SlabBlock(FabricBlockSettings.copy(PINK_STAINED_MOSSY_BRICKS).mapColor(DyeColor.PINK)))
    val PINK_STAINED_MOSSY_BRICK_WALL = register("pink_stained_mossy_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.PINK)))

    val GRAY_STAINED_MOSSY_BRICKS = register("gray_stained_mossy_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.GRAY)))
    val GRAY_STAINED_MOSSY_BRICK_STAIRS = register("gray_stained_mossy_brick_stairs", StairsBlock(GRAY_STAINED_MOSSY_BRICKS.defaultState, FabricBlockSettings.copy(GRAY_STAINED_MOSSY_BRICKS).mapColor(DyeColor.GRAY)))
    val GRAY_STAINED_MOSSY_BRICK_SLAB = register("gray_stained_mossy_brick_slab", SlabBlock(FabricBlockSettings.copy(GRAY_STAINED_MOSSY_BRICKS).mapColor(DyeColor.GRAY)))
    val GRAY_STAINED_MOSSY_BRICK_WALL = register("gray_stained_mossy_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.GRAY)))

    val LIGHT_GRAY_STAINED_MOSSY_BRICKS = register("light_gray_stained_mossy_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_GRAY)))
    val LIGHT_GRAY_STAINED_MOSSY_BRICK_STAIRS = register("light_gray_stained_mossy_brick_stairs", StairsBlock(LIGHT_GRAY_STAINED_MOSSY_BRICKS.defaultState, FabricBlockSettings.copy(LIGHT_GRAY_STAINED_MOSSY_BRICKS).mapColor(DyeColor.LIGHT_GRAY)))
    val LIGHT_GRAY_STAINED_MOSSY_BRICK_SLAB = register("light_gray_stained_mossy_brick_slab", SlabBlock(FabricBlockSettings.copy(LIGHT_GRAY_STAINED_MOSSY_BRICKS).mapColor(DyeColor.LIGHT_GRAY)))
    val LIGHT_GRAY_STAINED_MOSSY_BRICK_WALL = register("light_gray_stained_mossy_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.LIGHT_GRAY)))

    val CYAN_STAINED_MOSSY_BRICKS = register("cyan_stained_mossy_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.CYAN)))
    val CYAN_STAINED_MOSSY_BRICK_STAIRS = register("cyan_stained_mossy_brick_stairs", StairsBlock(CYAN_STAINED_MOSSY_BRICKS.defaultState, FabricBlockSettings.copy(CYAN_STAINED_MOSSY_BRICKS).mapColor(DyeColor.CYAN)))
    val CYAN_STAINED_MOSSY_BRICK_SLAB = register("cyan_stained_mossy_brick_slab", SlabBlock(FabricBlockSettings.copy(CYAN_STAINED_MOSSY_BRICKS).mapColor(DyeColor.CYAN)))
    val CYAN_STAINED_MOSSY_BRICK_WALL = register("cyan_stained_mossy_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.CYAN)))

    val PURPLE_STAINED_MOSSY_BRICKS = register("purple_stained_mossy_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.PURPLE)))
    val PURPLE_STAINED_MOSSY_BRICK_STAIRS = register("purple_stained_mossy_brick_stairs", StairsBlock(PURPLE_STAINED_MOSSY_BRICKS.defaultState, FabricBlockSettings.copy(PURPLE_STAINED_MOSSY_BRICKS).mapColor(DyeColor.PURPLE)))
    val PURPLE_STAINED_MOSSY_BRICK_SLAB = register("purple_stained_mossy_brick_slab", SlabBlock(FabricBlockSettings.copy(PURPLE_STAINED_MOSSY_BRICKS).mapColor(DyeColor.PURPLE)))
    val PURPLE_STAINED_MOSSY_BRICK_WALL = register("purple_stained_mossy_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.PURPLE)))

    val BLUE_STAINED_MOSSY_BRICKS = register("blue_stained_mossy_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.BLUE)))
    val BLUE_STAINED_MOSSY_BRICK_STAIRS = register("blue_stained_mossy_brick_stairs", StairsBlock(BLUE_STAINED_MOSSY_BRICKS.defaultState, FabricBlockSettings.copy(BLUE_STAINED_MOSSY_BRICKS).mapColor(DyeColor.BLUE)))
    val BLUE_STAINED_MOSSY_BRICK_SLAB = register("blue_stained_mossy_brick_slab", SlabBlock(FabricBlockSettings.copy(BLUE_STAINED_MOSSY_BRICKS).mapColor(DyeColor.BLUE)))
    val BLUE_STAINED_MOSSY_BRICK_WALL = register("blue_stained_mossy_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.BLUE)))

    val BROWN_STAINED_MOSSY_BRICKS = register("brown_stained_mossy_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.BROWN)))
    val BROWN_STAINED_MOSSY_BRICK_STAIRS = register("brown_stained_mossy_brick_stairs", StairsBlock(BROWN_STAINED_MOSSY_BRICKS.defaultState, FabricBlockSettings.copy(BROWN_STAINED_MOSSY_BRICKS).mapColor(DyeColor.BROWN)))
    val BROWN_STAINED_MOSSY_BRICK_SLAB = register("brown_stained_mossy_brick_slab", SlabBlock(FabricBlockSettings.copy(BROWN_STAINED_MOSSY_BRICKS).mapColor(DyeColor.BROWN)))
    val BROWN_STAINED_MOSSY_BRICK_WALL = register("brown_stained_mossy_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.BROWN)))

    val GREEN_STAINED_MOSSY_BRICKS = register("green_stained_mossy_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.GREEN)))
    val GREEN_STAINED_MOSSY_BRICK_STAIRS = register("green_stained_mossy_brick_stairs", StairsBlock(GREEN_STAINED_MOSSY_BRICKS.defaultState, FabricBlockSettings.copy(GREEN_STAINED_MOSSY_BRICKS).mapColor(DyeColor.GREEN)))
    val GREEN_STAINED_MOSSY_BRICK_SLAB = register("green_stained_mossy_brick_slab", SlabBlock(FabricBlockSettings.copy(GREEN_STAINED_MOSSY_BRICKS).mapColor(DyeColor.GREEN)))
    val GREEN_STAINED_MOSSY_BRICK_WALL = register("green_stained_mossy_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.GREEN)))

    val RED_STAINED_MOSSY_BRICKS = register("red_stained_mossy_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.RED)))
    val RED_STAINED_MOSSY_BRICK_STAIRS = register("red_stained_mossy_brick_stairs", StairsBlock(RED_STAINED_MOSSY_BRICKS.defaultState, FabricBlockSettings.copy(RED_STAINED_MOSSY_BRICKS).mapColor(DyeColor.RED)))
    val RED_STAINED_MOSSY_BRICK_SLAB = register("red_stained_mossy_brick_slab", SlabBlock(FabricBlockSettings.copy(RED_STAINED_MOSSY_BRICKS).mapColor(DyeColor.RED)))
    val RED_STAINED_MOSSY_BRICK_WALL = register("red_stained_mossy_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.RED)))

    val BLACK_STAINED_MOSSY_BRICKS = register("black_stained_mossy_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.BLACK)))
    val BLACK_STAINED_MOSSY_BRICK_STAIRS = register("black_stained_mossy_brick_stairs", StairsBlock(BLACK_STAINED_MOSSY_BRICKS.defaultState, FabricBlockSettings.copy(BLACK_STAINED_MOSSY_BRICKS).mapColor(DyeColor.BLACK)))
    val BLACK_STAINED_MOSSY_BRICK_SLAB = register("black_stained_mossy_brick_slab", SlabBlock(FabricBlockSettings.copy(BLACK_STAINED_MOSSY_BRICKS).mapColor(DyeColor.BLACK)))
    val BLACK_STAINED_MOSSY_BRICK_WALL = register("black_stained_mossy_brick_wall", WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL).mapColor(DyeColor.BLACK)))

    //endregion

    // region Aquarium Glass
    val CLEAR_GLASS = register("clear_glass", GlassBlock(FabricBlockSettings.copy(Blocks.GLASS)))
    val WHITE_STAINED_CLEAR_GLASS = register("white_stained_clear_glass", StainedGlassBlock(DyeColor.WHITE, FabricBlockSettings.copy(Blocks.WHITE_STAINED_GLASS)))
    val ORANGE_STAINED_CLEAR_GLASS = register("orange_stained_clear_glass", StainedGlassBlock(DyeColor.ORANGE, FabricBlockSettings.copy(Blocks.ORANGE_STAINED_GLASS)))
    val MAGENTA_STAINED_CLEAR_GLASS = register("magenta_stained_clear_glass", StainedGlassBlock(DyeColor.MAGENTA, FabricBlockSettings.copy(Blocks.MAGENTA_STAINED_GLASS)))
    val LIGHT_BLUE_STAINED_CLEAR_GLASS = register("light_blue_stained_clear_glass", StainedGlassBlock(DyeColor.LIGHT_BLUE, FabricBlockSettings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)))
    val YELLOW_STAINED_CLEAR_GLASS = register("yellow_stained_clear_glass", StainedGlassBlock(DyeColor.YELLOW, FabricBlockSettings.copy(Blocks.YELLOW_STAINED_GLASS)))
    val LIME_STAINED_CLEAR_GLASS = register("lime_stained_clear_glass", StainedGlassBlock(DyeColor.LIME, FabricBlockSettings.copy(Blocks.LIME_STAINED_GLASS)))
    val PINK_STAINED_CLEAR_GLASS = register("pink_stained_clear_glass", StainedGlassBlock(DyeColor.PINK, FabricBlockSettings.copy(Blocks.PINK_STAINED_GLASS)))
    val GRAY_STAINED_CLEAR_GLASS = register("gray_stained_clear_glass", StainedGlassBlock(DyeColor.GRAY, FabricBlockSettings.copy(Blocks.GRAY_STAINED_GLASS)))
    val LIGHT_GRAY_STAINED_CLEAR_GLASS = register("light_gray_stained_clear_glass", StainedGlassBlock(DyeColor.LIGHT_GRAY, FabricBlockSettings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)))
    val CYAN_STAINED_CLEAR_GLASS = register("cyan_stained_clear_glass", StainedGlassBlock(DyeColor.CYAN, FabricBlockSettings.copy(Blocks.CYAN_STAINED_GLASS)))
    val PURPLE_STAINED_CLEAR_GLASS = register("purple_stained_clear_glass", StainedGlassBlock(DyeColor.PURPLE, FabricBlockSettings.copy(Blocks.PURPLE_STAINED_GLASS)))
    val BLUE_STAINED_CLEAR_GLASS = register("blue_stained_clear_glass", StainedGlassBlock(DyeColor.BLUE, FabricBlockSettings.copy(Blocks.BLUE_STAINED_GLASS)))
    val BROWN_STAINED_CLEAR_GLASS = register("brown_stained_clear_glass", StainedGlassBlock(DyeColor.BROWN, FabricBlockSettings.copy(Blocks.BROWN_STAINED_GLASS)))
    val GREEN_STAINED_CLEAR_GLASS = register("green_stained_clear_glass", StainedGlassBlock(DyeColor.GREEN, FabricBlockSettings.copy(Blocks.GREEN_STAINED_GLASS)))
    val RED_STAINED_CLEAR_GLASS = register("red_stained_clear_glass", StainedGlassBlock(DyeColor.RED, FabricBlockSettings.copy(Blocks.RED_STAINED_GLASS)))
    val BLACK_STAINED_CLEAR_GLASS = register("black_stained_clear_glass", StainedGlassBlock(DyeColor.BLACK, FabricBlockSettings.copy(Blocks.BLACK_STAINED_GLASS)))

    val CLEAR_GLASS_PANE = register("clear_glass_pane", PaneBlock(FabricBlockSettings.copy(Blocks.GLASS_PANE)))
    val WHITE_STAINED_CLEAR_GLASS_PANE = register("white_stained_clear_glass_pane", StainedGlassPaneBlock(DyeColor.WHITE, FabricBlockSettings.copy(Blocks.WHITE_STAINED_GLASS_PANE)))
    val ORANGE_STAINED_CLEAR_GLASS_PANE = register("orange_stained_clear_glass_pane", StainedGlassPaneBlock(DyeColor.ORANGE, FabricBlockSettings.copy(Blocks.ORANGE_STAINED_GLASS_PANE)))
    val MAGENTA_STAINED_CLEAR_GLASS_PANE = register("magenta_stained_clear_glass_pane", StainedGlassPaneBlock(DyeColor.MAGENTA, FabricBlockSettings.copy(Blocks.MAGENTA_STAINED_GLASS_PANE)))
    val LIGHT_BLUE_STAINED_CLEAR_GLASS_PANE = register("light_blue_stained_clear_glass_pane", StainedGlassPaneBlock(DyeColor.LIGHT_BLUE, FabricBlockSettings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE)))
    val YELLOW_STAINED_CLEAR_GLASS_PANE = register("yellow_stained_clear_glass_pane", StainedGlassPaneBlock(DyeColor.YELLOW, FabricBlockSettings.copy(Blocks.YELLOW_STAINED_GLASS_PANE)))
    val LIME_STAINED_CLEAR_GLASS_PANE = register("lime_stained_clear_glass_pane", StainedGlassPaneBlock(DyeColor.LIME, FabricBlockSettings.copy(Blocks.LIME_STAINED_GLASS_PANE)))
    val PINK_STAINED_CLEAR_GLASS_PANE = register("pink_stained_clear_glass_pane", StainedGlassPaneBlock(DyeColor.PINK, FabricBlockSettings.copy(Blocks.PINK_STAINED_GLASS_PANE)))
    val GRAY_STAINED_CLEAR_GLASS_PANE = register("gray_stained_clear_glass_pane", StainedGlassPaneBlock(DyeColor.GRAY, FabricBlockSettings.copy(Blocks.GRAY_STAINED_GLASS_PANE)))
    val LIGHT_GRAY_STAINED_CLEAR_GLASS_PANE = register("light_gray_stained_clear_glass_pane", StainedGlassPaneBlock(DyeColor.LIGHT_GRAY, FabricBlockSettings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE)))
    val CYAN_STAINED_CLEAR_GLASS_PANE = register("cyan_stained_clear_glass_pane", StainedGlassPaneBlock(DyeColor.CYAN, FabricBlockSettings.copy(Blocks.CYAN_STAINED_GLASS_PANE)))
    val PURPLE_STAINED_CLEAR_GLASS_PANE = register("purple_stained_clear_glass_pane", StainedGlassPaneBlock(DyeColor.PURPLE, FabricBlockSettings.copy(Blocks.PURPLE_STAINED_GLASS_PANE)))
    val BLUE_STAINED_CLEAR_GLASS_PANE = register("blue_stained_clear_glass_pane", StainedGlassPaneBlock(DyeColor.BLUE, FabricBlockSettings.copy(Blocks.BLUE_STAINED_GLASS_PANE)))
    val BROWN_STAINED_CLEAR_GLASS_PANE = register("brown_stained_clear_glass_pane", StainedGlassPaneBlock(DyeColor.BROWN, FabricBlockSettings.copy(Blocks.BROWN_STAINED_GLASS_PANE)))
    val GREEN_STAINED_CLEAR_GLASS_PANE = register("green_stained_clear_glass_pane", StainedGlassPaneBlock(DyeColor.GREEN, FabricBlockSettings.copy(Blocks.GREEN_STAINED_GLASS_PANE)))
    val RED_STAINED_CLEAR_GLASS_PANE = register("red_stained_clear_glass_pane", StainedGlassPaneBlock(DyeColor.RED, FabricBlockSettings.copy(Blocks.RED_STAINED_GLASS_PANE)))
    val BLACK_STAINED_CLEAR_GLASS_PANE = register("black_stained_clear_glass_pane", StainedGlassPaneBlock(DyeColor.BLACK, FabricBlockSettings.copy(Blocks.BLACK_STAINED_GLASS_PANE)))

    // endregion

    private fun register(id: String, block: Block): Block {
        return Registry.register(Registries.BLOCK, Identifier(HybridBlocks.MOD_ID, id), block)
    }
}
