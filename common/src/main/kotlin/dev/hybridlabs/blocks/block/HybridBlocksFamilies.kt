package dev.hybridlabs.blocks.block

import net.minecraft.data.BlockFamily

@Suppress("unused")
object HybridBlocksFamilies {

    val WHITE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.WHITE_BRICKS.get())
            .stairs(HybridBlocksBlocks.WHITE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.WHITE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.WHITE_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_WHITE_BRICKS.get())
            .family
    }

    val ORANGE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.ORANGE_BRICKS.get())
            .stairs(HybridBlocksBlocks.ORANGE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.ORANGE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.ORANGE_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_ORANGE_BRICKS.get())
            .family
    }

    val MAGENTA_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MAGENTA_BRICKS.get())
            .stairs(HybridBlocksBlocks.MAGENTA_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.MAGENTA_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.MAGENTA_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_MAGENTA_BRICKS.get())
            .family
    }

    val LIGHT_BLUE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LIGHT_BLUE_BRICKS.get())
            .stairs(HybridBlocksBlocks.LIGHT_BLUE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LIGHT_BLUE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LIGHT_BLUE_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_LIGHT_BLUE_BRICKS.get())
            .family
    }

    val YELLOW_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.YELLOW_BRICKS.get())
            .stairs(HybridBlocksBlocks.YELLOW_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.YELLOW_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.YELLOW_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_YELLOW_BRICKS.get())
            .family
    }

    val LIME_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LIME_BRICKS.get())
            .stairs(HybridBlocksBlocks.LIME_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LIME_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LIME_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_LIME_BRICKS.get())
            .family
    }

    val PINK_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.PINK_BRICKS.get())
            .stairs(HybridBlocksBlocks.PINK_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.PINK_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.PINK_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_PINK_BRICKS.get())
            .family
    }

    val GRAY_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.GRAY_BRICKS.get())
            .stairs(HybridBlocksBlocks.GRAY_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.GRAY_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.GRAY_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_GRAY_BRICKS.get())
            .family
    }

    val LIGHT_GRAY_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LIGHT_GRAY_BRICKS.get())
            .stairs(HybridBlocksBlocks.LIGHT_GRAY_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LIGHT_GRAY_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LIGHT_GRAY_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_LIGHT_GRAY_BRICKS.get())
            .family
    }

    val CYAN_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.CYAN_BRICKS.get())
            .stairs(HybridBlocksBlocks.CYAN_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.CYAN_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.CYAN_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_CYAN_BRICKS.get())
            .family
    }

    val PURPLE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.PURPLE_BRICKS.get())
            .stairs(HybridBlocksBlocks.PURPLE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.PURPLE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.PURPLE_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_PURPLE_BRICKS.get())
            .family
    }

    val BLUE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.BLUE_BRICKS.get())
            .stairs(HybridBlocksBlocks.BLUE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.BLUE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.BLUE_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_BLUE_BRICKS.get())
            .family
    }

    val BROWN_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.BROWN_BRICKS.get())
        .stairs(HybridBlocksBlocks.BROWN_BRICK_STAIRS.get())
        .slab(HybridBlocksBlocks.BROWN_BRICK_SLAB.get())
        .wall(HybridBlocksBlocks.BROWN_BRICK_WALL.get())
        .cracked(HybridBlocksBlocks.CRACKED_BROWN_BRICKS.get())
        .family
    }

    val GREEN_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.GREEN_BRICKS.get())
        .stairs(HybridBlocksBlocks.GREEN_BRICK_STAIRS.get())
        .slab(HybridBlocksBlocks.GREEN_BRICK_SLAB.get())
        .wall(HybridBlocksBlocks.GREEN_BRICK_WALL.get())
        .cracked(HybridBlocksBlocks.CRACKED_GREEN_BRICKS.get())
        .family
    }

    val RED_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.RED_BRICKS.get())
        .stairs(HybridBlocksBlocks.RED_BRICK_STAIRS.get())
        .slab(HybridBlocksBlocks.RED_BRICK_SLAB.get())
        .wall(HybridBlocksBlocks.RED_BRICK_WALL.get())
        .cracked(HybridBlocksBlocks.CRACKED_RED_BRICKS.get())
        .family
    }

    val BLACK_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.BLACK_BRICKS.get())
        .stairs(HybridBlocksBlocks.BLACK_BRICK_STAIRS.get())
        .slab(HybridBlocksBlocks.BLACK_BRICK_SLAB.get())
        .wall(HybridBlocksBlocks.BLACK_BRICK_WALL.get())
        .cracked(HybridBlocksBlocks.CRACKED_BLACK_BRICKS.get())
        .family
    }

    val MIXED_NETHER_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_NETHER_BRICKS.get())
        .stairs(HybridBlocksBlocks.MIXED_NETHER_BRICK_STAIRS.get())
        .slab(HybridBlocksBlocks.MIXED_NETHER_BRICK_SLAB.get())
        .wall(HybridBlocksBlocks.MIXED_NETHER_BRICK_WALL.get())
        .family
    }

    val MIXED_RED_NETHER_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_RED_NETHER_BRICKS.get())
        .stairs(HybridBlocksBlocks.MIXED_RED_NETHER_BRICK_STAIRS.get())
        .slab(HybridBlocksBlocks.MIXED_RED_NETHER_BRICK_SLAB.get())
        .wall(HybridBlocksBlocks.MIXED_RED_NETHER_BRICK_WALL.get())
        .family
    }

    val CRACKED_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.CRACKED_BRICKS.get())
        .stairs(HybridBlocksBlocks.CRACKED_BRICK_STAIRS.get())
        .slab(HybridBlocksBlocks.CRACKED_BRICK_SLAB.get())
        .wall(HybridBlocksBlocks.CRACKED_BRICK_WALL.get())
        .family
    }

    val MOSSY_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MOSSY_BRICKS.get())
        .stairs(HybridBlocksBlocks.MOSSY_BRICK_STAIRS.get())
        .slab(HybridBlocksBlocks.MOSSY_BRICK_SLAB.get())
        .wall(HybridBlocksBlocks.MOSSY_BRICK_WALL.get())
        .family
    }

    val MOSSY_WHITE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MOSSY_WHITE_BRICKS.get())
        .stairs(HybridBlocksBlocks.MOSSY_WHITE_BRICK_STAIRS.get())
        .slab(HybridBlocksBlocks.MOSSY_WHITE_BRICK_SLAB.get())
        .wall(HybridBlocksBlocks.MOSSY_WHITE_BRICK_WALL.get())
        .family
    }

    val MOSSY_ORANGE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MOSSY_ORANGE_BRICKS.get())
        .stairs(HybridBlocksBlocks.MOSSY_ORANGE_BRICK_STAIRS.get())
        .slab(HybridBlocksBlocks.MOSSY_ORANGE_BRICK_SLAB.get())
        .wall(HybridBlocksBlocks.MOSSY_ORANGE_BRICK_WALL.get())
        .family
    }

    val MOSSY_MAGENTA_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MOSSY_MAGENTA_BRICKS.get())
        .stairs(HybridBlocksBlocks.MOSSY_MAGENTA_BRICK_STAIRS.get())
        .slab(HybridBlocksBlocks.MOSSY_MAGENTA_BRICK_SLAB.get())
        .wall(HybridBlocksBlocks.MOSSY_MAGENTA_BRICK_WALL.get())
        .family
    }

    val MOSSY_LIGHT_BLUE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICKS.get())
        .stairs(HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICK_STAIRS.get())
        .slab(HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICK_SLAB.get())
        .wall(HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICK_WALL.get())
        .family
    }

    val MOSSY_YELLOW_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MOSSY_YELLOW_BRICKS.get())
        .stairs(HybridBlocksBlocks.MOSSY_YELLOW_BRICK_STAIRS.get())
        .slab(HybridBlocksBlocks.MOSSY_YELLOW_BRICK_SLAB.get())
        .wall(HybridBlocksBlocks.MOSSY_YELLOW_BRICK_WALL.get())
        .family
    }

    val MOSSY_LIME_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MOSSY_LIME_BRICKS.get())
        .stairs(HybridBlocksBlocks.MOSSY_LIME_BRICK_STAIRS.get())
        .slab(HybridBlocksBlocks.MOSSY_LIME_BRICK_SLAB.get())
        .wall(HybridBlocksBlocks.MOSSY_LIME_BRICK_WALL.get())
        .family
    }

    val MOSSY_PINK_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MOSSY_PINK_BRICKS.get())
        .stairs(HybridBlocksBlocks.MOSSY_PINK_BRICK_STAIRS.get())
        .slab(HybridBlocksBlocks.MOSSY_PINK_BRICK_SLAB.get())
        .wall(HybridBlocksBlocks.MOSSY_PINK_BRICK_WALL.get())
        .family
    }

    val MOSSY_GRAY_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MOSSY_GRAY_BRICKS.get())
        .stairs(HybridBlocksBlocks.MOSSY_GRAY_BRICK_STAIRS.get())
        .slab(HybridBlocksBlocks.MOSSY_GRAY_BRICK_SLAB.get())
        .wall(HybridBlocksBlocks.MOSSY_GRAY_BRICK_WALL.get())
        .family
    }

    val MOSSY_LIGHT_GRAY_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICKS.get())
        .stairs(HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICK_STAIRS.get())
        .slab(HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICK_SLAB.get())
        .wall(HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICK_WALL.get())
        .family
    }

    val MOSSY_CYAN_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MOSSY_CYAN_BRICKS.get())
        .stairs(HybridBlocksBlocks.MOSSY_CYAN_BRICK_STAIRS.get())
        .slab(HybridBlocksBlocks.MOSSY_CYAN_BRICK_SLAB.get())
        .wall(HybridBlocksBlocks.MOSSY_CYAN_BRICK_WALL.get())
        .family
    }

    val MOSSY_PURPLE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MOSSY_PURPLE_BRICKS.get())
        .stairs(HybridBlocksBlocks.MOSSY_PURPLE_BRICK_STAIRS.get())
        .slab(HybridBlocksBlocks.MOSSY_PURPLE_BRICK_SLAB.get())
        .wall(HybridBlocksBlocks.MOSSY_PURPLE_BRICK_WALL.get())
        .family
    }

    val MOSSY_BLUE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MOSSY_BLUE_BRICKS.get())
        .stairs(HybridBlocksBlocks.MOSSY_BLUE_BRICK_STAIRS.get())
        .slab(HybridBlocksBlocks.MOSSY_BLUE_BRICK_SLAB.get())
        .wall(HybridBlocksBlocks.MOSSY_BLUE_BRICK_WALL.get())
        .family
    }

    val MOSSY_BROWN_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MOSSY_BROWN_BRICKS.get())
        .stairs(HybridBlocksBlocks.MOSSY_BROWN_BRICK_STAIRS.get())
        .slab(HybridBlocksBlocks.MOSSY_BROWN_BRICK_SLAB.get())
        .wall(HybridBlocksBlocks.MOSSY_BROWN_BRICK_WALL.get())
        .family
    }

    val MOSSY_GREEN_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MOSSY_GREEN_BRICKS.get())
        .stairs(HybridBlocksBlocks.MOSSY_GREEN_BRICK_STAIRS.get())
        .slab(HybridBlocksBlocks.MOSSY_GREEN_BRICK_SLAB.get())
        .wall(HybridBlocksBlocks.MOSSY_GREEN_BRICK_WALL.get())
        .family
    }

    val MOSSY_RED_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MOSSY_RED_BRICKS.get())
        .stairs(HybridBlocksBlocks.MOSSY_RED_BRICK_STAIRS.get())
        .slab(HybridBlocksBlocks.MOSSY_RED_BRICK_SLAB.get())
        .wall(HybridBlocksBlocks.MOSSY_RED_BRICK_WALL.get())
        .family
    }

    val MOSSY_BLACK_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MOSSY_BLACK_BRICKS.get())
        .stairs(HybridBlocksBlocks.MOSSY_BLACK_BRICK_STAIRS.get())
        .slab(HybridBlocksBlocks.MOSSY_BLACK_BRICK_SLAB.get())
        .wall(HybridBlocksBlocks.MOSSY_BLACK_BRICK_WALL.get())
        .family
    }

    val WHITE_QUARTZ_BLOCK: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.WHITE_QUARTZ_BLOCK.get())
        .stairs(HybridBlocksBlocks.WHITE_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.WHITE_QUARTZ_SLAB.get())
        .family
    }

    val ORANGE_QUARTZ_BLOCK: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.ORANGE_QUARTZ_BLOCK.get())
        .stairs(HybridBlocksBlocks.ORANGE_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.ORANGE_QUARTZ_SLAB.get())
        .family
    }

    val MAGENTA_QUARTZ_BLOCK: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MAGENTA_QUARTZ_BLOCK.get())
        .stairs(HybridBlocksBlocks.MAGENTA_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.MAGENTA_QUARTZ_SLAB.get())
        .family
    }

    val LIGHT_BLUE_QUARTZ_BLOCK: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_BLOCK.get())
        .stairs(HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_SLAB.get())
        .family
    }

    val YELLOW_QUARTZ_BLOCK: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.YELLOW_QUARTZ_BLOCK.get())
        .stairs(HybridBlocksBlocks.YELLOW_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.YELLOW_QUARTZ_SLAB.get())
        .family
    }

    val LIME_QUARTZ_BLOCK: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LIME_QUARTZ_BLOCK.get())
        .stairs(HybridBlocksBlocks.LIME_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.LIME_QUARTZ_SLAB.get())
        .family
    }

    val PINK_QUARTZ_BLOCK: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.PINK_QUARTZ_BLOCK.get())
        .stairs(HybridBlocksBlocks.PINK_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.PINK_QUARTZ_SLAB.get())
        .family
    }

    val GRAY_QUARTZ_BLOCK: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.GRAY_QUARTZ_BLOCK.get())
        .stairs(HybridBlocksBlocks.GRAY_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.GRAY_QUARTZ_SLAB.get())
        .family
    }

    val LIGHT_GRAY_QUARTZ_BLOCK: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_BLOCK.get())
        .stairs(HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_SLAB.get())
        .family
    }

    val CYAN_QUARTZ_BLOCK: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.CYAN_QUARTZ_BLOCK.get())
        .stairs(HybridBlocksBlocks.CYAN_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.CYAN_QUARTZ_SLAB.get())
        .family
    }

    val PURPLE_QUARTZ_BLOCK: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.PURPLE_QUARTZ_BLOCK.get())
        .stairs(HybridBlocksBlocks.PURPLE_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.PURPLE_QUARTZ_SLAB.get())
        .family
    }

    val BLUE_QUARTZ_BLOCK: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.BLUE_QUARTZ_BLOCK.get())
        .stairs(HybridBlocksBlocks.BLUE_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.BLUE_QUARTZ_SLAB.get())
        .family
    }

    val BROWN_QUARTZ_BLOCK: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.BROWN_QUARTZ_BLOCK.get())
        .stairs(HybridBlocksBlocks.BROWN_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.BROWN_QUARTZ_SLAB.get())
        .family
    }

    val GREEN_QUARTZ_BLOCK: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.GREEN_QUARTZ_BLOCK.get())
        .stairs(HybridBlocksBlocks.GREEN_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.GREEN_QUARTZ_SLAB.get())
        .family
    }

    val RED_QUARTZ_BLOCK: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.RED_QUARTZ_BLOCK.get())
        .stairs(HybridBlocksBlocks.RED_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.RED_QUARTZ_SLAB.get())
        .family
    }

    val BLACK_QUARTZ_BLOCK: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.BLACK_QUARTZ_BLOCK.get())
        .stairs(HybridBlocksBlocks.BLACK_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.BLACK_QUARTZ_SLAB.get())
        .family
    }

    val SMOOTH_WHITE_QUARTZ: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMOOTH_WHITE_QUARTZ.get())
        .stairs(HybridBlocksBlocks.SMOOTH_WHITE_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.SMOOTH_WHITE_QUARTZ_SLAB.get())
        .family
    }

    val SMOOTH_ORANGE_QUARTZ: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMOOTH_ORANGE_QUARTZ.get())
        .stairs(HybridBlocksBlocks.SMOOTH_ORANGE_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.SMOOTH_ORANGE_QUARTZ_SLAB.get())
        .family
    }

    val SMOOTH_MAGENTA_QUARTZ: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMOOTH_MAGENTA_QUARTZ.get())
        .stairs(HybridBlocksBlocks.SMOOTH_MAGENTA_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.SMOOTH_MAGENTA_QUARTZ_SLAB.get())
        .family
    }

    val SMOOTH_LIGHT_BLUE_QUARTZ: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMOOTH_LIGHT_BLUE_QUARTZ.get())
        .stairs(HybridBlocksBlocks.SMOOTH_LIGHT_BLUE_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.SMOOTH_LIGHT_BLUE_QUARTZ_SLAB.get())
        .family
    }

    val SMOOTH_YELLOW_QUARTZ: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMOOTH_YELLOW_QUARTZ.get())
        .stairs(HybridBlocksBlocks.SMOOTH_YELLOW_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.SMOOTH_YELLOW_QUARTZ_SLAB.get())
        .family
    }

    val SMOOTH_LIME_QUARTZ: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMOOTH_LIME_QUARTZ.get())
        .stairs(HybridBlocksBlocks.SMOOTH_LIME_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.SMOOTH_LIME_QUARTZ_SLAB.get())
        .family
    }

    val SMOOTH_PINK_QUARTZ: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMOOTH_PINK_QUARTZ.get())
        .stairs(HybridBlocksBlocks.SMOOTH_PINK_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.SMOOTH_PINK_QUARTZ_SLAB.get())
        .family
    }

    val SMOOTH_GRAY_QUARTZ: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMOOTH_GRAY_QUARTZ.get())
        .stairs(HybridBlocksBlocks.SMOOTH_GRAY_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.SMOOTH_GRAY_QUARTZ_SLAB.get())
        .family
    }

    val SMOOTH_LIGHT_GRAY_QUARTZ: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMOOTH_LIGHT_GRAY_QUARTZ.get())
        .stairs(HybridBlocksBlocks.SMOOTH_LIGHT_GRAY_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.SMOOTH_LIGHT_GRAY_QUARTZ_SLAB.get())
        .family
    }

    val SMOOTH_CYAN_QUARTZ: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMOOTH_CYAN_QUARTZ.get())
        .stairs(HybridBlocksBlocks.SMOOTH_CYAN_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.SMOOTH_CYAN_QUARTZ_SLAB.get())
        .family
    }

    val SMOOTH_PURPLE_QUARTZ: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMOOTH_PURPLE_QUARTZ.get())
        .stairs(HybridBlocksBlocks.SMOOTH_PURPLE_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.SMOOTH_PURPLE_QUARTZ_SLAB.get())
        .family
    }

    val SMOOTH_BLUE_QUARTZ: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMOOTH_BLUE_QUARTZ.get())
        .stairs(HybridBlocksBlocks.SMOOTH_BLUE_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.SMOOTH_BLUE_QUARTZ_SLAB.get())
        .family
    }

    val SMOOTH_BROWN_QUARTZ: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMOOTH_BROWN_QUARTZ.get())
        .stairs(HybridBlocksBlocks.SMOOTH_BROWN_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.SMOOTH_BROWN_QUARTZ_SLAB.get())
        .family
    }

    val SMOOTH_GREEN_QUARTZ: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMOOTH_GREEN_QUARTZ.get())
        .stairs(HybridBlocksBlocks.SMOOTH_GREEN_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.SMOOTH_GREEN_QUARTZ_SLAB.get())
        .family
    }

    val SMOOTH_RED_QUARTZ: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMOOTH_RED_QUARTZ.get())
        .stairs(HybridBlocksBlocks.SMOOTH_RED_QUARTZ_STAIRS.get())
        .slab(HybridBlocksBlocks.SMOOTH_RED_QUARTZ_SLAB.get())
        .family
    }

    val SMOOTH_BLACK_QUARTZ: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMOOTH_BLACK_QUARTZ.get())
            .stairs(HybridBlocksBlocks.SMOOTH_BLACK_QUARTZ_STAIRS.get())
            .slab(HybridBlocksBlocks.SMOOTH_BLACK_QUARTZ_SLAB.get())
            .family
    }
}