package dev.hybridlabs.blocks.block

import dev.hybridlabs.blocks.HybridBlocks
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.block.PillarBlock
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

    val WHITE_STAINED_QUARTZ_PILLAR = register("white_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.WHITE)))
    val ORANGE_STAINED_QUARTZ_PILLAR = register("orange_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.ORANGE)))
    val MAGENTA_STAINED_QUARTZ_PILLAR = register("magenta_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.MAGENTA)))
    val LIGHT_BLUE_STAINED_QUARTZ_PILLAR = register("light_blue_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.LIGHT_BLUE)))
    val YELLOW_STAINED_QUARTZ_PILLAR = register("yellow_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.YELLOW)))
    val LIME_STAINED_QUARTZ_PILLAR = register("lime_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.LIME)))
    val PINK_STAINED_QUARTZ_PILLAR = register("pink_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.PINK)))
    val GRAY_STAINED_QUARTZ_PILLAR = register("gray_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.GRAY)))
    val LIGHT_GRAY_STAINED_QUARTZ_PILLAR = register("light_gray_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.LIGHT_GRAY)))
    val CYAN_STAINED_QUARTZ_PILLAR = register("cyan_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.CYAN)))
    val PURPLE_STAINED_QUARTZ_PILLAR = register("purple_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.PURPLE)))
    val BLUE_STAINED_QUARTZ_PILLAR = register("blue_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.BLUE)))
    val BROWN_STAINED_QUARTZ_PILLAR = register("brown_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.BROWN)))
    val GREEN_STAINED_QUARTZ_PILLAR = register("green_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.GREEN)))
    val RED_STAINED_QUARTZ_PILLAR = register("red_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.RED)))
    val BLACK_STAINED_QUARTZ_PILLAR = register("black_stained_quartz_pillar", PillarBlock(FabricBlockSettings.copy(Blocks.QUARTZ_PILLAR).mapColor(DyeColor.BLACK)))

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

    val CRACKED_BRICKS = register("cracked_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS)))
    val WHITE_STAINED_CRACKED_BRICKS = register("white_stained_cracked_bricks", Block(FabricBlockSettings.copy(WHITE_STAINED_BRICKS)))
    val ORANGE_STAINED_CRACKED_BRICKS = register("orange_stained_cracked_bricks", Block(FabricBlockSettings.copy(ORANGE_STAINED_BRICKS)))
    val MAGENTA_STAINED_CRACKED_BRICKS = register("magenta_stained_cracked_bricks", Block(FabricBlockSettings.copy(MAGENTA_STAINED_BRICKS)))
    val LIGHT_BLUE_STAINED_CRACKED_BRICKS = register("light_blue_stained_cracked_bricks", Block(FabricBlockSettings.copy(LIGHT_BLUE_STAINED_BRICKS)))
    val YELLOW_STAINED_CRACKED_BRICKS = register("yellow_stained_cracked_bricks", Block(FabricBlockSettings.copy(YELLOW_STAINED_BRICKS)))
    val LIME_STAINED_CRACKED_BRICKS = register("lime_stained_cracked_bricks", Block(FabricBlockSettings.copy(LIME_STAINED_BRICKS)))
    val PINK_STAINED_CRACKED_BRICKS = register("pink_stained_cracked_bricks", Block(FabricBlockSettings.copy(PINK_STAINED_BRICKS)))
    val GRAY_STAINED_CRACKED_BRICKS = register("gray_stained_cracked_bricks", Block(FabricBlockSettings.copy(GRAY_STAINED_BRICKS)))
    val LIGHT_GRAY_STAINED_CRACKED_BRICKS = register("light_gray_stained_cracked_bricks", Block(FabricBlockSettings.copy(LIGHT_GRAY_STAINED_BRICKS)))
    val CYAN_STAINED_CRACKED_BRICKS = register("cyan_stained_cracked_bricks", Block(FabricBlockSettings.copy(CYAN_STAINED_BRICKS)))
    val PURPLE_STAINED_CRACKED_BRICKS = register("purple_stained_cracked_bricks", Block(FabricBlockSettings.copy(PURPLE_STAINED_BRICKS)))
    val BLUE_STAINED_CRACKED_BRICKS = register("blue_stained_cracked_bricks", Block(FabricBlockSettings.copy(BLUE_STAINED_BRICKS)))
    val BROWN_STAINED_CRACKED_BRICKS = register("brown_stained_cracked_bricks", Block(FabricBlockSettings.copy(BROWN_STAINED_BRICKS)))
    val GREEN_STAINED_CRACKED_BRICKS = register("green_stained_cracked_bricks", Block(FabricBlockSettings.copy(GREEN_STAINED_BRICKS)))
    val RED_STAINED_CRACKED_BRICKS = register("red_stained_cracked_bricks", Block(FabricBlockSettings.copy(RED_STAINED_BRICKS)))
    val BLACK_STAINED_CRACKED_BRICKS = register("black_stained_cracked_bricks", Block(FabricBlockSettings.copy(BLACK_STAINED_BRICKS)))

    val MOSSY_BRICKS = register("mossy_bricks", Block(FabricBlockSettings.copy(Blocks.BRICKS)))
    val WHITE_STAINED_MOSSY_BRICKS = register("white_stained_mossy_bricks", Block(FabricBlockSettings.copy(WHITE_STAINED_BRICKS)))
    val ORANGE_STAINED_MOSSY_BRICKS = register("orange_stained_mossy_bricks", Block(FabricBlockSettings.copy(ORANGE_STAINED_BRICKS)))
    val MAGENTA_STAINED_MOSSY_BRICKS = register("magenta_stained_mossy_bricks", Block(FabricBlockSettings.copy(MAGENTA_STAINED_BRICKS)))
    val LIGHT_BLUE_STAINED_MOSSY_BRICKS = register("light_blue_stained_mossy_bricks", Block(FabricBlockSettings.copy(LIGHT_BLUE_STAINED_BRICKS)))
    val YELLOW_STAINED_MOSSY_BRICKS = register("yellow_stained_mossy_bricks", Block(FabricBlockSettings.copy(YELLOW_STAINED_BRICKS)))
    val LIME_STAINED_MOSSY_BRICKS = register("lime_stained_mossy_bricks", Block(FabricBlockSettings.copy(LIME_STAINED_BRICKS)))
    val PINK_STAINED_MOSSY_BRICKS = register("pink_stained_mossy_bricks", Block(FabricBlockSettings.copy(PINK_STAINED_BRICKS)))
    val GRAY_STAINED_MOSSY_BRICKS = register("gray_stained_mossy_bricks", Block(FabricBlockSettings.copy(GRAY_STAINED_BRICKS)))
    val LIGHT_GRAY_STAINED_MOSSY_BRICKS = register("light_gray_stained_mossy_bricks", Block(FabricBlockSettings.copy(LIGHT_GRAY_STAINED_BRICKS)))
    val CYAN_STAINED_MOSSY_BRICKS = register("cyan_stained_mossy_bricks", Block(FabricBlockSettings.copy(CYAN_STAINED_BRICKS)))
    val PURPLE_STAINED_MOSSY_BRICKS = register("purple_stained_mossy_bricks", Block(FabricBlockSettings.copy(PURPLE_STAINED_BRICKS)))
    val BLUE_STAINED_MOSSY_BRICKS = register("blue_stained_mossy_bricks", Block(FabricBlockSettings.copy(BLUE_STAINED_BRICKS)))
    val BROWN_STAINED_MOSSY_BRICKS = register("brown_stained_mossy_bricks", Block(FabricBlockSettings.copy(BROWN_STAINED_BRICKS)))
    val GREEN_STAINED_MOSSY_BRICKS = register("green_stained_mossy_bricks", Block(FabricBlockSettings.copy(GREEN_STAINED_BRICKS)))
    val RED_STAINED_MOSSY_BRICKS = register("red_stained_mossy_bricks", Block(FabricBlockSettings.copy(RED_STAINED_BRICKS)))
    val BLACK_STAINED_MOSSY_BRICKS = register("black_stained_mossy_bricks", Block(FabricBlockSettings.copy(BLACK_STAINED_BRICKS)))

    private fun register(id: String, block: Block): Block {
        return Registry.register(Registries.BLOCK, Identifier(HybridBlocks.MOD_ID, id), block)
    }
}
