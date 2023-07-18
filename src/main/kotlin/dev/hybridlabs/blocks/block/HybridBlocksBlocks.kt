package dev.hybridlabs.blocks.block

import dev.hybridlabs.blocks.HybridBlocks
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.DyeColor
import net.minecraft.util.Identifier

/**
 * All Hybrid Blocks blocks.
 */
object HybridBlocksBlocks {
    val WHITE_STAINED_SMOOTH_QUARTZ = register("white_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.WHITE)))
    val ORANGE_STAINED_SMOOTH_QUARTZ = register("orange_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.ORANGE)))
    val MAGENTA_STAINED_SMOOTH_QUARTZ = register("magenta_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.MAGENTA)))
    val LIGHT_BLUE_STAINED_SMOOTH_QUARTZ = register("light_blue_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.LIGHT_BLUE)))
    val YELLOW_STAINED_SMOOTH_QUARTZ = register("yellow_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.YELLOW)))
    val LIME_STAINED_SMOOTH_QUARTZ = register("lime_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.LIME)))
    val PINK_STAINED_SMOOTH_QUARTZ = register("pink_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.PINK)))
    val GRAY_STAINED_SMOOTH_QUARTZ = register("gray_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.GRAY)))
    val LIGHT_GRAY_STAINED_SMOOTH_QUARTZ = register("light_gray_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.LIGHT_GRAY)))
    val CYAN_STAINED_SMOOTH_QUARTZ = register("cyan_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.CYAN)))
    val PURPLE_STAINED_SMOOTH_QUARTZ = register("purple_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.PURPLE)))
    val BLUE_STAINED_SMOOTH_QUARTZ = register("blue_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.BLUE)))
    val BROWN_STAINED_SMOOTH_QUARTZ = register("brown_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.BROWN)))
    val GREEN_STAINED_SMOOTH_QUARTZ = register("green_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.GREEN)))
    val RED_STAINED_SMOOTH_QUARTZ = register("red_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.RED)))
    val BLACK_STAINED_SMOOTH_QUARTZ = register("black_stained_smooth_quartz", Block(FabricBlockSettings.copy(Blocks.SMOOTH_QUARTZ).mapColor(DyeColor.BLACK)))

    val WHITE_STAINED_BRICKS = register("white_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.WHITE)))
    val ORANGE_STAINED_BRICKS = register("orange_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.ORANGE)))
    val MAGENTA_STAINED_BRICKS = register("magenta_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.MAGENTA)))
    val LIGHT_BLUE_STAINED_BRICKS = register("light_blue_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_BLUE)))
    val YELLOW_STAINED_BRICKS = register("yellow_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.YELLOW)))
    val LIME_STAINED_BRICKS = register("lime_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.LIME)))
    val PINK_STAINED_BRICKS = register("pink_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.PINK)))
    val GRAY_STAINED_BRICKS = register("gray_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.GRAY)))
    val LIGHT_GRAY_STAINED_BRICKS = register("light_gray_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.LIGHT_GRAY)))
    val CYAN_STAINED_BRICKS = register("cyan_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.CYAN)))
    val PURPLE_STAINED_BRICKS = register("purple_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.PURPLE)))
    val BLUE_STAINED_BRICKS = register("blue_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.BLUE)))
    val BROWN_STAINED_BRICKS = register("brown_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.BROWN)))
    val GREEN_STAINED_BRICKS = register("green_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.GREEN)))
    val RED_STAINED_BRICKS = register("red_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.RED)))
    val BLACK_STAINED_BRICKS = register("black_stained_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS).mapColor(DyeColor.BLACK)))

    private fun register(id: String, block: Block): Block {
        return Registry.register(Registries.BLOCK, Identifier(HybridBlocks.MOD_ID, id), block)
    }
}
