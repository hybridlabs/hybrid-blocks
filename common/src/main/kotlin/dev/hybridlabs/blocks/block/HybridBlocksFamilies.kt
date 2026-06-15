package dev.hybridlabs.blocks.block

import net.minecraft.data.BlockFamily

object HybridBlocksFamilies {

    val POLISHED_CALCITE: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.POLISHED_CALCITE.get())
            .stairs(HybridBlocksBlocks.POLISHED_CALCITE_STAIRS.get())
            .slab(HybridBlocksBlocks.POLISHED_CALCITE_SLAB.get())
            .family
    }

    val POLISHED_CALCITE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.POLISHED_CALCITE_BRICKS.get())
            .stairs(HybridBlocksBlocks.POLISHED_CALCITE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.POLISHED_CALCITE_BRICK_SLAB.get())
            .family
    }

    val POLISHED_CALCITE_TILES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.POLISHED_CALCITE_TILES.get())
            .stairs(HybridBlocksBlocks.POLISHED_CALCITE_TILE_STAIRS.get())
            .slab(HybridBlocksBlocks.POLISHED_CALCITE_TILE_SLAB.get())
            .family
    }

    //#region Nether Bricks Families
    val MIXED_NETHER_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_NETHER_BRICKS.get())
            .stairs(HybridBlocksBlocks.MIXED_NETHER_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_NETHER_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_NETHER_BRICK_WALL.get())
            .family
    }

    val LARGE_NETHER_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_NETHER_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_NETHER_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_NETHER_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_NETHER_BRICK_WALL.get())
            .family
    }

    val LARGE_MIXED_NETHER_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_MIXED_NETHER_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_MIXED_NETHER_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_MIXED_NETHER_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_MIXED_NETHER_BRICK_WALL.get())
            .family
    }

    val SMALL_NETHER_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_NETHER_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_NETHER_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_NETHER_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_NETHER_BRICK_WALL.get())
            .family
    }

    val SMALL_MIXED_NETHER_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_NETHER_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_MIXED_NETHER_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_MIXED_NETHER_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_MIXED_NETHER_BRICK_WALL.get())
            .family
    }

    val NETHER_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.NETHER_SHINGLES.get())
            .stairs(HybridBlocksBlocks.NETHER_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.NETHER_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.NETHER_SHINGLE_WALL.get())
            .family
    }

    val MIXED_NETHER_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_NETHER_SHINGLES.get())
            .stairs(HybridBlocksBlocks.MIXED_NETHER_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_NETHER_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_NETHER_SHINGLE_WALL.get())
            .family
    }
    //#endregion

    //#region Red_Nether Bricks Families
    val MIXED_RED_NETHER_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_RED_NETHER_BRICKS.get())
            .stairs(HybridBlocksBlocks.MIXED_RED_NETHER_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_RED_NETHER_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_RED_NETHER_BRICK_WALL.get())
            .family
    }
    val LARGE_RED_NETHER_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_RED_NETHER_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_RED_NETHER_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_RED_NETHER_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_RED_NETHER_BRICK_WALL.get())
            .family
    }

    val LARGE_MIXED_RED_NETHER_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_MIXED_RED_NETHER_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_MIXED_RED_NETHER_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_MIXED_RED_NETHER_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_MIXED_RED_NETHER_BRICK_WALL.get())
            .family
    }

    val SMALL_RED_NETHER_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_RED_NETHER_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_RED_NETHER_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_RED_NETHER_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_RED_NETHER_BRICK_WALL.get())
            .family
    }

    val SMALL_MIXED_RED_NETHER_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_RED_NETHER_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_MIXED_RED_NETHER_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_MIXED_RED_NETHER_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_MIXED_RED_NETHER_BRICK_WALL.get())
            .family
    }

    val RED_NETHER_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.RED_NETHER_SHINGLES.get())
            .stairs(HybridBlocksBlocks.RED_NETHER_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.RED_NETHER_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.RED_NETHER_SHINGLE_WALL.get())
            .family
    }

    val MIXED_RED_NETHER_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_RED_NETHER_SHINGLES.get())
            .stairs(HybridBlocksBlocks.MIXED_RED_NETHER_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_RED_NETHER_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_RED_NETHER_SHINGLE_WALL.get())
            .family
    }
    //#endregion

    //#region Bricks Families
    val MIXED_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_BRICKS.get())
            .stairs(HybridBlocksBlocks.MIXED_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_BRICK_WALL.get())
            .family
    }

    val LARGE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_BRICK_WALL.get())
            .family
    }

    val LARGE_MIXED_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_MIXED_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_MIXED_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_MIXED_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_MIXED_BRICK_WALL.get())
            .family
    }

    val SMALL_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_BRICK_WALL.get())
            .family
    }

    val SMALL_MIXED_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_MIXED_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_MIXED_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_MIXED_BRICK_WALL.get())
            .family
    }

    val SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SHINGLES.get())
            .stairs(HybridBlocksBlocks.SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.SHINGLE_WALL.get())
            .family
    }

    val MIXED_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_SHINGLES.get())
            .stairs(HybridBlocksBlocks.MIXED_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_SHINGLE_WALL.get())
            .family
    }
    //#endregion

    //#region White Bricks Families
    val WHITE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.WHITE_BRICKS.get())
            .stairs(HybridBlocksBlocks.WHITE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.WHITE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.WHITE_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_WHITE_BRICKS.get())
            .family
    }

    val MIXED_WHITE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_WHITE_BRICKS.get())
            .stairs(HybridBlocksBlocks.MIXED_WHITE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_WHITE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_WHITE_BRICK_WALL.get())
            .family
    }

    val LARGE_WHITE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_WHITE_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_WHITE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_WHITE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_WHITE_BRICK_WALL.get())
            .family
    }

    val LARGE_MIXED_WHITE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_MIXED_WHITE_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_MIXED_WHITE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_MIXED_WHITE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_MIXED_WHITE_BRICK_WALL.get())
            .family
    }

    val SMALL_WHITE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_WHITE_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_WHITE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_WHITE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_WHITE_BRICK_WALL.get())
            .family
    }

    val SMALL_MIXED_WHITE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_WHITE_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_MIXED_WHITE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_MIXED_WHITE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_MIXED_WHITE_BRICK_WALL.get())
            .family
    }

    val WHITE_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.WHITE_SHINGLES.get())
            .stairs(HybridBlocksBlocks.WHITE_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.WHITE_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.WHITE_SHINGLE_WALL.get())
            .family
    }

    val MIXED_WHITE_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_WHITE_SHINGLES.get())
            .stairs(HybridBlocksBlocks.MIXED_WHITE_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_WHITE_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_WHITE_SHINGLE_WALL.get())
            .family
    }
    //#endregion

    //#region Orange Bricks Families
    val ORANGE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.ORANGE_BRICKS.get())
            .stairs(HybridBlocksBlocks.ORANGE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.ORANGE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.ORANGE_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_ORANGE_BRICKS.get())
            .family
    }

    val MIXED_ORANGE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_ORANGE_BRICKS.get())
            .stairs(HybridBlocksBlocks.MIXED_ORANGE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_ORANGE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_ORANGE_BRICK_WALL.get())
            .family
    }

    val LARGE_ORANGE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_ORANGE_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_ORANGE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_ORANGE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_ORANGE_BRICK_WALL.get())
            .family
    }

    val LARGE_MIXED_ORANGE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_MIXED_ORANGE_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_MIXED_ORANGE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_MIXED_ORANGE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_MIXED_ORANGE_BRICK_WALL.get())
            .family
    }

    val SMALL_ORANGE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_ORANGE_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_ORANGE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_ORANGE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_ORANGE_BRICK_WALL.get())
            .family
    }

    val SMALL_MIXED_ORANGE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_ORANGE_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_MIXED_ORANGE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_MIXED_ORANGE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_MIXED_ORANGE_BRICK_WALL.get())
            .family
    }

    val ORANGE_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.ORANGE_SHINGLES.get())
            .stairs(HybridBlocksBlocks.ORANGE_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.ORANGE_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.ORANGE_SHINGLE_WALL.get())
            .family
    }

    val MIXED_ORANGE_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_ORANGE_SHINGLES.get())
            .stairs(HybridBlocksBlocks.MIXED_ORANGE_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_ORANGE_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_ORANGE_SHINGLE_WALL.get())
            .family
    }
    //#endregion
    
    //#region Magenta Bricks Families
    val MAGENTA_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MAGENTA_BRICKS.get())
            .stairs(HybridBlocksBlocks.MAGENTA_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.MAGENTA_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.MAGENTA_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_MAGENTA_BRICKS.get())
            .family
    }

    val MIXED_MAGENTA_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_MAGENTA_BRICKS.get())
            .stairs(HybridBlocksBlocks.MIXED_MAGENTA_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_MAGENTA_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_MAGENTA_BRICK_WALL.get())
            .family
    }

    val LARGE_MAGENTA_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_MAGENTA_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_MAGENTA_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_MAGENTA_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_MAGENTA_BRICK_WALL.get())
            .family
    }

    val LARGE_MIXED_MAGENTA_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_MIXED_MAGENTA_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_MIXED_MAGENTA_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_MIXED_MAGENTA_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_MIXED_MAGENTA_BRICK_WALL.get())
            .family
    }

    val SMALL_MAGENTA_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_MAGENTA_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_MAGENTA_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_MAGENTA_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_MAGENTA_BRICK_WALL.get())
            .family
    }

    val SMALL_MIXED_MAGENTA_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_MAGENTA_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_MIXED_MAGENTA_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_MIXED_MAGENTA_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_MIXED_MAGENTA_BRICK_WALL.get())
            .family
    }

    val MAGENTA_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MAGENTA_SHINGLES.get())
            .stairs(HybridBlocksBlocks.MAGENTA_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.MAGENTA_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.MAGENTA_SHINGLE_WALL.get())
            .family
    }

    val MIXED_MAGENTA_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_MAGENTA_SHINGLES.get())
            .stairs(HybridBlocksBlocks.MIXED_MAGENTA_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_MAGENTA_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_MAGENTA_SHINGLE_WALL.get())
            .family
    }
    //#endregion
    
    //#region Light Blue Bricks Families
    val LIGHT_BLUE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LIGHT_BLUE_BRICKS.get())
            .stairs(HybridBlocksBlocks.LIGHT_BLUE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LIGHT_BLUE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LIGHT_BLUE_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_LIGHT_BLUE_BRICKS.get())
            .family
    }

    val MIXED_LIGHT_BLUE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_LIGHT_BLUE_BRICKS.get())
            .stairs(HybridBlocksBlocks.MIXED_LIGHT_BLUE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_LIGHT_BLUE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_LIGHT_BLUE_BRICK_WALL.get())
            .family
    }

    val LARGE_LIGHT_BLUE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_LIGHT_BLUE_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_LIGHT_BLUE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_LIGHT_BLUE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_LIGHT_BLUE_BRICK_WALL.get())
            .family
    }

    val LARGE_MIXED_LIGHT_BLUE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_MIXED_LIGHT_BLUE_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_MIXED_LIGHT_BLUE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_MIXED_LIGHT_BLUE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_MIXED_LIGHT_BLUE_BRICK_WALL.get())
            .family
    }

    val SMALL_LIGHT_BLUE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_LIGHT_BLUE_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_LIGHT_BLUE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_LIGHT_BLUE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_LIGHT_BLUE_BRICK_WALL.get())
            .family
    }

    val SMALL_MIXED_LIGHT_BLUE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_LIGHT_BLUE_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_MIXED_LIGHT_BLUE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_MIXED_LIGHT_BLUE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_MIXED_LIGHT_BLUE_BRICK_WALL.get())
            .family
    }

    val LIGHT_BLUE_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LIGHT_BLUE_SHINGLES.get())
            .stairs(HybridBlocksBlocks.LIGHT_BLUE_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.LIGHT_BLUE_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.LIGHT_BLUE_SHINGLE_WALL.get())
            .family
    }

    val MIXED_LIGHT_BLUE_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_LIGHT_BLUE_SHINGLES.get())
            .stairs(HybridBlocksBlocks.MIXED_LIGHT_BLUE_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_LIGHT_BLUE_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_LIGHT_BLUE_SHINGLE_WALL.get())
            .family
    }
    //#endregion

    //#region Yellow Bricks Families
    val YELLOW_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.YELLOW_BRICKS.get())
            .stairs(HybridBlocksBlocks.YELLOW_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.YELLOW_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.YELLOW_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_YELLOW_BRICKS.get())
            .family
    }

    val MIXED_YELLOW_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_YELLOW_BRICKS.get())
            .stairs(HybridBlocksBlocks.MIXED_YELLOW_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_YELLOW_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_YELLOW_BRICK_WALL.get())
            .family
    }

    val LARGE_YELLOW_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_YELLOW_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_YELLOW_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_YELLOW_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_YELLOW_BRICK_WALL.get())
            .family
    }

    val LARGE_MIXED_YELLOW_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_YELLOW_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_MIXED_YELLOW_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_MIXED_YELLOW_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_MIXED_YELLOW_BRICK_WALL.get())
            .family
    }

    val SMALL_YELLOW_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_YELLOW_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_YELLOW_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_YELLOW_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_YELLOW_BRICK_WALL.get())
            .family
    }

    val SMALL_MIXED_YELLOW_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_YELLOW_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_MIXED_YELLOW_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_MIXED_YELLOW_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_MIXED_YELLOW_BRICK_WALL.get())
            .family
    }

    val YELLOW_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.YELLOW_SHINGLES.get())
            .stairs(HybridBlocksBlocks.YELLOW_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.YELLOW_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.YELLOW_SHINGLE_WALL.get())
            .family
    }

    val MIXED_YELLOW_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_YELLOW_SHINGLES.get())
            .stairs(HybridBlocksBlocks.MIXED_YELLOW_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_YELLOW_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_YELLOW_SHINGLE_WALL.get())
            .family
    }
    //#endregion

    //#region Lime Bricks Families
    val LIME_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LIME_BRICKS.get())
            .stairs(HybridBlocksBlocks.LIME_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LIME_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LIME_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_LIME_BRICKS.get())
            .family
    }

    val MIXED_LIME_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_LIME_BRICKS.get())
            .stairs(HybridBlocksBlocks.MIXED_LIME_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_LIME_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_LIME_BRICK_WALL.get())
            .family
    }

    val LARGE_LIME_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_LIME_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_LIME_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_LIME_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_LIME_BRICK_WALL.get())
            .family
    }

    val LARGE_MIXED_LIME_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_MIXED_LIME_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_MIXED_LIME_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_MIXED_LIME_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_MIXED_LIME_BRICK_WALL.get())
            .family
    }

    val SMALL_LIME_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_LIME_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_LIME_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_LIME_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_LIME_BRICK_WALL.get())
            .family
    }

    val SMALL_MIXED_LIME_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_LIME_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_MIXED_LIME_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_MIXED_LIME_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_MIXED_LIME_BRICK_WALL.get())
            .family
    }

    val LIME_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LIME_SHINGLES.get())
            .stairs(HybridBlocksBlocks.LIME_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.LIME_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.LIME_SHINGLE_WALL.get())
            .family
    }

    val MIXED_LIME_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_LIME_SHINGLES.get())
            .stairs(HybridBlocksBlocks.MIXED_LIME_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_LIME_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_LIME_SHINGLE_WALL.get())
            .family
    }
    //#endregion

    //#region Pink Bricks Families
    val PINK_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.PINK_BRICKS.get())
            .stairs(HybridBlocksBlocks.PINK_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.PINK_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.PINK_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_PINK_BRICKS.get())
            .family
    }

    val MIXED_PINK_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_PINK_BRICKS.get())
            .stairs(HybridBlocksBlocks.MIXED_PINK_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_PINK_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_PINK_BRICK_WALL.get())
            .family
    }

    val LARGE_PINK_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_PINK_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_PINK_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_PINK_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_PINK_BRICK_WALL.get())
            .family
    }

    val LARGE_MIXED_PINK_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_MIXED_PINK_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_MIXED_PINK_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_MIXED_PINK_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_MIXED_PINK_BRICK_WALL.get())
            .family
    }

    val SMALL_PINK_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_PINK_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_PINK_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_PINK_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_PINK_BRICK_WALL.get())
            .family
    }

    val SMALL_MIXED_PINK_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_PINK_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_MIXED_PINK_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_MIXED_PINK_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_MIXED_PINK_BRICK_WALL.get())
            .family
    }

    val PINK_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.PINK_SHINGLES.get())
            .stairs(HybridBlocksBlocks.PINK_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.PINK_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.PINK_SHINGLE_WALL.get())
            .family
    }

    val MIXED_PINK_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_PINK_SHINGLES.get())
            .stairs(HybridBlocksBlocks.MIXED_PINK_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_PINK_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_PINK_SHINGLE_WALL.get())
            .family
    }
    //#endregion

    //#region Gray Bricks Families
    val GRAY_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.GRAY_BRICKS.get())
            .stairs(HybridBlocksBlocks.GRAY_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.GRAY_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.GRAY_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_GRAY_BRICKS.get())
            .family
    }

    val MIXED_GRAY_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_GRAY_BRICKS.get())
            .stairs(HybridBlocksBlocks.MIXED_GRAY_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_GRAY_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_GRAY_BRICK_WALL.get())
            .family
    }

    val LARGE_GRAY_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_GRAY_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_GRAY_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_GRAY_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_GRAY_BRICK_WALL.get())
            .family
    }

    val LARGE_MIXED_GRAY_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_MIXED_GRAY_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_MIXED_GRAY_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_MIXED_GRAY_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_MIXED_GRAY_BRICK_WALL.get())
            .family
    }

    val SMALL_GRAY_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_GRAY_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_GRAY_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_GRAY_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_GRAY_BRICK_WALL.get())
            .family
    }

    val SMALL_MIXED_GRAY_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_GRAY_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_MIXED_GRAY_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_MIXED_GRAY_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_MIXED_GRAY_BRICK_WALL.get())
            .family
    }

    val GRAY_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.GRAY_SHINGLES.get())
            .stairs(HybridBlocksBlocks.GRAY_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.GRAY_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.GRAY_SHINGLE_WALL.get())
            .family
    }

    val MIXED_GRAY_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_GRAY_SHINGLES.get())
            .stairs(HybridBlocksBlocks.MIXED_GRAY_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_GRAY_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_GRAY_SHINGLE_WALL.get())
            .family
    }
    //#endregion

    //#region Light Gray Bricks Families
    val LIGHT_GRAY_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LIGHT_GRAY_BRICKS.get())
            .stairs(HybridBlocksBlocks.LIGHT_GRAY_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LIGHT_GRAY_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LIGHT_GRAY_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_LIGHT_GRAY_BRICKS.get())
            .family
    }

    val MIXED_LIGHT_GRAY_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_LIGHT_GRAY_BRICKS.get())
            .stairs(HybridBlocksBlocks.MIXED_LIGHT_GRAY_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_LIGHT_GRAY_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_LIGHT_GRAY_BRICK_WALL.get())
            .family
    }

    val LARGE_LIGHT_GRAY_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_LIGHT_GRAY_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_LIGHT_GRAY_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_LIGHT_GRAY_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_LIGHT_GRAY_BRICK_WALL.get())
            .family
    }

    val LARGE_MIXED_LIGHT_GRAY_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_MIXED_LIGHT_GRAY_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_MIXED_LIGHT_GRAY_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_MIXED_LIGHT_GRAY_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_MIXED_LIGHT_GRAY_BRICK_WALL.get())
            .family
    }

    val SMALL_LIGHT_GRAY_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_LIGHT_GRAY_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_LIGHT_GRAY_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_LIGHT_GRAY_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_LIGHT_GRAY_BRICK_WALL.get())
            .family
    }

    val SMALL_MIXED_LIGHT_GRAY_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_LIGHT_GRAY_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_MIXED_LIGHT_GRAY_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_MIXED_LIGHT_GRAY_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_MIXED_LIGHT_GRAY_BRICK_WALL.get())
            .family
    }

    val LIGHT_GRAY_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LIGHT_GRAY_SHINGLES.get())
            .stairs(HybridBlocksBlocks.LIGHT_GRAY_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.LIGHT_GRAY_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.LIGHT_GRAY_SHINGLE_WALL.get())
            .family
    }

    val MIXED_LIGHT_GRAY_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_LIGHT_GRAY_SHINGLES.get())
            .stairs(HybridBlocksBlocks.MIXED_LIGHT_GRAY_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_LIGHT_GRAY_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_LIGHT_GRAY_SHINGLE_WALL.get())
            .family
    }
    //#endregion

    //#region Cyan Bricks Families
    val CYAN_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.CYAN_BRICKS.get())
            .stairs(HybridBlocksBlocks.CYAN_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.CYAN_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.CYAN_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_CYAN_BRICKS.get())
            .family
    }

    val MIXED_CYAN_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_CYAN_BRICKS.get())
            .stairs(HybridBlocksBlocks.MIXED_CYAN_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_CYAN_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_CYAN_BRICK_WALL.get())
            .family
    }

    val LARGE_CYAN_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_CYAN_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_CYAN_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_CYAN_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_CYAN_BRICK_WALL.get())
            .family
    }

    val LARGE_MIXED_CYAN_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_MIXED_CYAN_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_MIXED_CYAN_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_MIXED_CYAN_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_MIXED_CYAN_BRICK_WALL.get())
            .family
    }

    val SMALL_CYAN_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_CYAN_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_CYAN_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_CYAN_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_CYAN_BRICK_WALL.get())
            .family
    }

    val SMALL_MIXED_CYAN_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_CYAN_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_MIXED_CYAN_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_MIXED_CYAN_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_MIXED_CYAN_BRICK_WALL.get())
            .family
    }

    val CYAN_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.CYAN_SHINGLES.get())
            .stairs(HybridBlocksBlocks.CYAN_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.CYAN_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.CYAN_SHINGLE_WALL.get())
            .family
    }

    val MIXED_CYAN_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_CYAN_SHINGLES.get())
            .stairs(HybridBlocksBlocks.MIXED_CYAN_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_CYAN_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_CYAN_SHINGLE_WALL.get())
            .family
    }
    //#endregion

    //#region Purple Bricks Families
    val PURPLE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.PURPLE_BRICKS.get())
            .stairs(HybridBlocksBlocks.PURPLE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.PURPLE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.PURPLE_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_PURPLE_BRICKS.get())
            .family
    }

    val MIXED_PURPLE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_PURPLE_BRICKS.get())
            .stairs(HybridBlocksBlocks.MIXED_PURPLE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_PURPLE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_PURPLE_BRICK_WALL.get())
            .family
    }

    val LARGE_PURPLE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_PURPLE_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_PURPLE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_PURPLE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_PURPLE_BRICK_WALL.get())
            .family
    }

    val LARGE_MIXED_PURPLE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_MIXED_PURPLE_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_MIXED_PURPLE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_MIXED_PURPLE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_MIXED_PURPLE_BRICK_WALL.get())
            .family
    }

    val SMALL_PURPLE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_PURPLE_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_PURPLE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_PURPLE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_PURPLE_BRICK_WALL.get())
            .family
    }

    val SMALL_MIXED_PURPLE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_PURPLE_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_MIXED_PURPLE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_MIXED_PURPLE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_MIXED_PURPLE_BRICK_WALL.get())
            .family
    }

    val PURPLE_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.PURPLE_SHINGLES.get())
            .stairs(HybridBlocksBlocks.PURPLE_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.PURPLE_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.PURPLE_SHINGLE_WALL.get())
            .family
    }

    val MIXED_PURPLE_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_PURPLE_SHINGLES.get())
            .stairs(HybridBlocksBlocks.MIXED_PURPLE_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_PURPLE_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_PURPLE_SHINGLE_WALL.get())
            .family
    }
    //#endregion

    //#region Blue Bricks Families
    val BLUE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.BLUE_BRICKS.get())
            .stairs(HybridBlocksBlocks.BLUE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.BLUE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.BLUE_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_BLUE_BRICKS.get())
            .family
    }

    val MIXED_BLUE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_BLUE_BRICKS.get())
            .stairs(HybridBlocksBlocks.MIXED_BLUE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_BLUE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_BLUE_BRICK_WALL.get())
            .family
    }

    val LARGE_BLUE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_BLUE_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_BLUE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_BLUE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_BLUE_BRICK_WALL.get())
            .family
    }

    val LARGE_MIXED_BLUE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_BLUE_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_MIXED_BLUE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_MIXED_BLUE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_MIXED_BLUE_BRICK_WALL.get())
            .family
    }

    val SMALL_BLUE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_BLUE_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_BLUE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_BLUE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_BLUE_BRICK_WALL.get())
            .family
    }

    val SMALL_MIXED_BLUE_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_BLUE_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_MIXED_BLUE_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_MIXED_BLUE_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_MIXED_BLUE_BRICK_WALL.get())
            .family
    }

    val BLUE_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.BLUE_SHINGLES.get())
            .stairs(HybridBlocksBlocks.BLUE_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.BLUE_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.BLUE_SHINGLE_WALL.get())
            .family
    }

    val MIXED_BLUE_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_BLUE_SHINGLES.get())
            .stairs(HybridBlocksBlocks.MIXED_BLUE_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_BLUE_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_BLUE_SHINGLE_WALL.get())
            .family
    }
    //#endregion

    //#region Brown Bricks Families
    val BROWN_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.BROWN_BRICKS.get())
            .stairs(HybridBlocksBlocks.BROWN_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.BROWN_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.BROWN_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_BROWN_BRICKS.get())
            .family
    }

    val MIXED_BROWN_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_BROWN_BRICKS.get())
            .stairs(HybridBlocksBlocks.MIXED_BROWN_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_BROWN_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_BROWN_BRICK_WALL.get())
            .family
    }

    val LARGE_BROWN_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_BROWN_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_BROWN_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_BROWN_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_BROWN_BRICK_WALL.get())
            .family
    }

    val LARGE_MIXED_BROWN_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_MIXED_BROWN_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_MIXED_BROWN_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_MIXED_BROWN_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_MIXED_BROWN_BRICK_WALL.get())
            .family
    }

    val SMALL_BROWN_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_BROWN_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_BROWN_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_BROWN_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_BROWN_BRICK_WALL.get())
            .family
    }

    val SMALL_MIXED_BROWN_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_BROWN_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_MIXED_BROWN_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_MIXED_BROWN_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_MIXED_BROWN_BRICK_WALL.get())
            .family
    }

    val BROWN_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.BROWN_SHINGLES.get())
            .stairs(HybridBlocksBlocks.BROWN_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.BROWN_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.BROWN_SHINGLE_WALL.get())
            .family
    }

    val MIXED_BROWN_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_BROWN_SHINGLES.get())
            .stairs(HybridBlocksBlocks.MIXED_BROWN_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_BROWN_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_BROWN_SHINGLE_WALL.get())
            .family
    }
    //#endregion

    //#region Green Bricks Families
    val GREEN_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.GREEN_BRICKS.get())
            .stairs(HybridBlocksBlocks.GREEN_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.GREEN_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.GREEN_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_GREEN_BRICKS.get())
            .family
    }

    val MIXED_GREEN_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_GREEN_BRICKS.get())
            .stairs(HybridBlocksBlocks.MIXED_GREEN_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_GREEN_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_GREEN_BRICK_WALL.get())
            .family
    }

    val LARGE_GREEN_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_GREEN_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_GREEN_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_GREEN_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_GREEN_BRICK_WALL.get())
            .family
    }

    val LARGE_MIXED_GREEN_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_GREEN_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_MIXED_GREEN_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_MIXED_GREEN_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_MIXED_GREEN_BRICK_WALL.get())
            .family
    }

    val SMALL_GREEN_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_GREEN_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_GREEN_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_GREEN_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_GREEN_BRICK_WALL.get())
            .family
    }

    val SMALL_MIXED_GREEN_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_GREEN_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_MIXED_GREEN_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_MIXED_GREEN_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_MIXED_GREEN_BRICK_WALL.get())
            .family
    }

    val GREEN_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.GREEN_SHINGLES.get())
            .stairs(HybridBlocksBlocks.GREEN_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.GREEN_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.GREEN_SHINGLE_WALL.get())
            .family
    }

    val MIXED_GREEN_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_GREEN_SHINGLES.get())
            .stairs(HybridBlocksBlocks.MIXED_GREEN_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_GREEN_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_GREEN_SHINGLE_WALL.get())
            .family
    }
    //#endregion

    //#region Red Bricks Families
    val RED_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.RED_BRICKS.get())
            .stairs(HybridBlocksBlocks.RED_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.RED_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.RED_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_RED_BRICKS.get())
            .family
    }

    val MIXED_RED_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_RED_BRICKS.get())
            .stairs(HybridBlocksBlocks.MIXED_RED_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_RED_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_RED_BRICK_WALL.get())
            .family
    }

    val LARGE_RED_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_RED_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_RED_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_RED_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_RED_BRICK_WALL.get())
            .family
    }

    val LARGE_MIXED_RED_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_MIXED_RED_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_MIXED_RED_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_MIXED_RED_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_MIXED_RED_BRICK_WALL.get())
            .family
    }

    val SMALL_RED_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_RED_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_RED_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_RED_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_RED_BRICK_WALL.get())
            .family
    }

    val SMALL_MIXED_RED_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_RED_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_MIXED_RED_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_MIXED_RED_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_MIXED_RED_BRICK_WALL.get())
            .family
    }

    val RED_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.RED_SHINGLES.get())
            .stairs(HybridBlocksBlocks.RED_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.RED_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.RED_SHINGLE_WALL.get())
            .family
    }

    val MIXED_RED_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_RED_SHINGLES.get())
            .stairs(HybridBlocksBlocks.MIXED_RED_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_RED_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_RED_SHINGLE_WALL.get())
            .family
    }
    //#endregion
    
    //#region Black Bricks Families
    val BLACK_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.BLACK_BRICKS.get())
            .stairs(HybridBlocksBlocks.BLACK_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.BLACK_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.BLACK_BRICK_WALL.get())
            .cracked(HybridBlocksBlocks.CRACKED_BLACK_BRICKS.get())
            .family
    }

    val MIXED_BLACK_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_BLACK_BRICKS.get())
            .stairs(HybridBlocksBlocks.MIXED_BLACK_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_BLACK_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_BLACK_BRICK_WALL.get())
            .family
    }

    val LARGE_BLACK_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_BLACK_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_BLACK_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_BLACK_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_BLACK_BRICK_WALL.get())
            .family
    }

    val LARGE_MIXED_BLACK_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LARGE_MIXED_BLACK_BRICKS.get())
            .stairs(HybridBlocksBlocks.LARGE_MIXED_BLACK_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.LARGE_MIXED_BLACK_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.LARGE_MIXED_BLACK_BRICK_WALL.get())
            .family
    }

    val SMALL_BLACK_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_BLACK_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_BLACK_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_BLACK_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_BLACK_BRICK_WALL.get())
            .family
    }

    val SMALL_MIXED_BLACK_BRICKS: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.SMALL_MIXED_BLACK_BRICKS.get())
            .stairs(HybridBlocksBlocks.SMALL_MIXED_BLACK_BRICK_STAIRS.get())
            .slab(HybridBlocksBlocks.SMALL_MIXED_BLACK_BRICK_SLAB.get())
            .wall(HybridBlocksBlocks.SMALL_MIXED_BLACK_BRICK_WALL.get())
            .family
    }

    val BLACK_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.BLACK_SHINGLES.get())
            .stairs(HybridBlocksBlocks.BLACK_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.BLACK_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.BLACK_SHINGLE_WALL.get())
            .family
    }

    val MIXED_BLACK_SHINGLES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MIXED_BLACK_SHINGLES.get())
            .stairs(HybridBlocksBlocks.MIXED_BLACK_SHINGLE_STAIRS.get())
            .slab(HybridBlocksBlocks.MIXED_BLACK_SHINGLE_SLAB.get())
            .wall(HybridBlocksBlocks.MIXED_BLACK_SHINGLE_WALL.get())
            .family
    }
    //#endregion

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

    val WHITE_QUARTZ_TILES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.WHITE_QUARTZ_TILES.get())
            .stairs(HybridBlocksBlocks.WHITE_QUARTZ_TILE_STAIRS.get())
            .slab(HybridBlocksBlocks.WHITE_QUARTZ_TILE_SLAB.get())
            .family
    }

    val ORANGE_QUARTZ_TILES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.ORANGE_QUARTZ_TILES.get())
            .stairs(HybridBlocksBlocks.ORANGE_QUARTZ_TILE_STAIRS.get())
            .slab(HybridBlocksBlocks.ORANGE_QUARTZ_TILE_SLAB.get())
            .family
    }

    val MAGENTA_QUARTZ_TILES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.MAGENTA_QUARTZ_TILES.get())
            .stairs(HybridBlocksBlocks.MAGENTA_QUARTZ_TILE_STAIRS.get())
            .slab(HybridBlocksBlocks.MAGENTA_QUARTZ_TILE_SLAB.get())
            .family
    }

    val LIGHT_BLUE_QUARTZ_TILES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_TILES.get())
            .stairs(HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_TILE_STAIRS.get())
            .slab(HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_TILE_SLAB.get())
            .family
    }

    val YELLOW_QUARTZ_TILES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.YELLOW_QUARTZ_TILES.get())
            .stairs(HybridBlocksBlocks.YELLOW_QUARTZ_TILE_STAIRS.get())
            .slab(HybridBlocksBlocks.YELLOW_QUARTZ_TILE_SLAB.get())
            .family
    }

    val LIME_QUARTZ_TILES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LIME_QUARTZ_TILES.get())
            .stairs(HybridBlocksBlocks.LIME_QUARTZ_TILE_STAIRS.get())
            .slab(HybridBlocksBlocks.LIME_QUARTZ_TILE_SLAB.get())
            .family
    }

    val PINK_QUARTZ_TILES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.PINK_QUARTZ_TILES.get())
            .stairs(HybridBlocksBlocks.PINK_QUARTZ_TILE_STAIRS.get())
            .slab(HybridBlocksBlocks.PINK_QUARTZ_TILE_SLAB.get())
            .family
    }

    val GRAY_QUARTZ_TILES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.GRAY_QUARTZ_TILES.get())
            .stairs(HybridBlocksBlocks.GRAY_QUARTZ_TILE_STAIRS.get())
            .slab(HybridBlocksBlocks.GRAY_QUARTZ_TILE_SLAB.get())
            .family
    }

    val LIGHT_GRAY_QUARTZ_TILES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_TILES.get())
            .stairs(HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_TILE_STAIRS.get())
            .slab(HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_TILE_SLAB.get())
            .family
    }

    val CYAN_QUARTZ_TILES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.CYAN_QUARTZ_TILES.get())
            .stairs(HybridBlocksBlocks.CYAN_QUARTZ_TILE_STAIRS.get())
            .slab(HybridBlocksBlocks.CYAN_QUARTZ_TILE_SLAB.get())
            .family
    }

    val PURPLE_QUARTZ_TILES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.PURPLE_QUARTZ_TILES.get())
            .stairs(HybridBlocksBlocks.PURPLE_QUARTZ_TILE_STAIRS.get())
            .slab(HybridBlocksBlocks.PURPLE_QUARTZ_TILE_SLAB.get())
            .family
    }

    val BLUE_QUARTZ_TILES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.BLUE_QUARTZ_TILES.get())
            .stairs(HybridBlocksBlocks.BLUE_QUARTZ_TILE_STAIRS.get())
            .slab(HybridBlocksBlocks.BLUE_QUARTZ_TILE_SLAB.get())
            .family
    }

    val BROWN_QUARTZ_TILES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.BROWN_QUARTZ_TILES.get())
            .stairs(HybridBlocksBlocks.BROWN_QUARTZ_TILE_STAIRS.get())
            .slab(HybridBlocksBlocks.BROWN_QUARTZ_TILE_SLAB.get())
            .family
    }

    val GREEN_QUARTZ_TILES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.GREEN_QUARTZ_TILES.get())
            .stairs(HybridBlocksBlocks.GREEN_QUARTZ_TILE_STAIRS.get())
            .slab(HybridBlocksBlocks.GREEN_QUARTZ_TILE_SLAB.get())
            .family
    }

    val RED_QUARTZ_TILES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.RED_QUARTZ_TILES.get())
            .stairs(HybridBlocksBlocks.RED_QUARTZ_TILE_STAIRS.get())
            .slab(HybridBlocksBlocks.RED_QUARTZ_TILE_SLAB.get())
            .family
    }

    val BLACK_QUARTZ_TILES: BlockFamily by lazy {
        BlockFamily.Builder(HybridBlocksBlocks.BLACK_QUARTZ_TILES.get())
            .stairs(HybridBlocksBlocks.BLACK_QUARTZ_TILE_STAIRS.get())
            .slab(HybridBlocksBlocks.BLACK_QUARTZ_TILE_SLAB.get())
            .family
    }
}