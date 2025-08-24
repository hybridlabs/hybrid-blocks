package dev.hybridlabs.blocks.data.client

import dev.hybridlabs.blocks.block.HybridBlocksBlocks
import dev.hybridlabs.blocks.block.HybridBlocksFamilies
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.client.BlockStateModelGenerator
import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.data.client.TexturedModel

/**
 * Generates all models.
 */
class ModelProvider(output: FabricDataOutput) : FabricModelProvider(output) {
    override fun generateBlockStateModels(generator: BlockStateModelGenerator) {
        // generate simple cube all
        mapOf(
            HybridBlocksBlocks.CLEAR_GLASS to HybridBlocksBlocks.CLEAR_GLASS_PANE,
            HybridBlocksBlocks.WHITE_STAINED_CLEAR_GLASS to HybridBlocksBlocks.WHITE_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.ORANGE_STAINED_CLEAR_GLASS to HybridBlocksBlocks.ORANGE_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.MAGENTA_STAINED_CLEAR_GLASS to HybridBlocksBlocks.MAGENTA_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS to HybridBlocksBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.YELLOW_STAINED_CLEAR_GLASS to HybridBlocksBlocks.YELLOW_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.LIME_STAINED_CLEAR_GLASS to HybridBlocksBlocks.LIME_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.PINK_STAINED_CLEAR_GLASS to HybridBlocksBlocks.PINK_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.GRAY_STAINED_CLEAR_GLASS to HybridBlocksBlocks.GRAY_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS to HybridBlocksBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.CYAN_STAINED_CLEAR_GLASS to HybridBlocksBlocks.CYAN_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.PURPLE_STAINED_CLEAR_GLASS to HybridBlocksBlocks.PURPLE_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.BLUE_STAINED_CLEAR_GLASS to HybridBlocksBlocks.BLUE_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.BROWN_STAINED_CLEAR_GLASS to HybridBlocksBlocks.BROWN_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.GREEN_STAINED_CLEAR_GLASS to HybridBlocksBlocks.GREEN_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.RED_STAINED_CLEAR_GLASS to HybridBlocksBlocks.RED_STAINED_CLEAR_GLASS_PANE,
            HybridBlocksBlocks.BLACK_STAINED_CLEAR_GLASS to HybridBlocksBlocks.BLACK_STAINED_CLEAR_GLASS_PANE,
        ).forEach { (glass, pane) ->
            generator.registerGlassPane(glass, pane)
        }

        // axis rotated pillars
        setOf(
            HybridBlocksBlocks.WHITE_QUARTZ_PILLAR,
            HybridBlocksBlocks.ORANGE_QUARTZ_PILLAR,
            HybridBlocksBlocks.MAGENTA_QUARTZ_PILLAR,
            HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_PILLAR,
            HybridBlocksBlocks.YELLOW_QUARTZ_PILLAR,
            HybridBlocksBlocks.LIME_QUARTZ_PILLAR,
            HybridBlocksBlocks.PINK_QUARTZ_PILLAR,
            HybridBlocksBlocks.GRAY_QUARTZ_PILLAR,
            HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_PILLAR,
            HybridBlocksBlocks.CYAN_QUARTZ_PILLAR,
            HybridBlocksBlocks.PURPLE_QUARTZ_PILLAR,
            HybridBlocksBlocks.BLUE_QUARTZ_PILLAR,
            HybridBlocksBlocks.BROWN_QUARTZ_PILLAR,
            HybridBlocksBlocks.GREEN_QUARTZ_PILLAR,
            HybridBlocksBlocks.RED_QUARTZ_PILLAR,
            HybridBlocksBlocks.BLACK_QUARTZ_PILLAR,
        ).forEach { block ->
            generator.registerAxisRotated(
                block,
                TexturedModel.END_FOR_TOP_CUBE_COLUMN,
                TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL
            )
        }

        // axis rotated pillars
        setOf(
            HybridBlocksBlocks.WHITE_QUARTZ_BRICKS,
            HybridBlocksBlocks.ORANGE_QUARTZ_BRICKS,
            HybridBlocksBlocks.MAGENTA_QUARTZ_BRICKS,
            HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_BRICKS,
            HybridBlocksBlocks.YELLOW_QUARTZ_BRICKS,
            HybridBlocksBlocks.LIME_QUARTZ_BRICKS,
            HybridBlocksBlocks.PINK_QUARTZ_BRICKS,
            HybridBlocksBlocks.GRAY_QUARTZ_BRICKS,
            HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_BRICKS,
            HybridBlocksBlocks.CYAN_QUARTZ_BRICKS,
            HybridBlocksBlocks.PURPLE_QUARTZ_BRICKS,
            HybridBlocksBlocks.BLUE_QUARTZ_BRICKS,
            HybridBlocksBlocks.BROWN_QUARTZ_BRICKS,
            HybridBlocksBlocks.GREEN_QUARTZ_BRICKS,
            HybridBlocksBlocks.RED_QUARTZ_BRICKS,
            HybridBlocksBlocks.BLACK_QUARTZ_BRICKS,

            HybridBlocksBlocks.BASKETWEAVE_WHITE_BRICKS,
            HybridBlocksBlocks.PINWHEEL_WHITE_BRICKS,
            HybridBlocksBlocks.JACK_ON_JACK_WHITE_BRICKS,
            HybridBlocksBlocks.MIXED_WHITE_BRICKS,

            HybridBlocksBlocks.BASKETWEAVE_ORANGE_BRICKS,
            HybridBlocksBlocks.PINWHEEL_ORANGE_BRICKS,
            HybridBlocksBlocks.JACK_ON_JACK_ORANGE_BRICKS,
            HybridBlocksBlocks.MIXED_ORANGE_BRICKS,

            HybridBlocksBlocks.BASKETWEAVE_MAGENTA_BRICKS,
            HybridBlocksBlocks.PINWHEEL_MAGENTA_BRICKS,
            HybridBlocksBlocks.JACK_ON_JACK_MAGENTA_BRICKS,
            HybridBlocksBlocks.MIXED_MAGENTA_BRICKS,

            HybridBlocksBlocks.BASKETWEAVE_LIGHT_BLUE_BRICKS,
            HybridBlocksBlocks.PINWHEEL_LIGHT_BLUE_BRICKS,
            HybridBlocksBlocks.JACK_ON_JACK_LIGHT_BLUE_BRICKS,
            HybridBlocksBlocks.MIXED_LIGHT_BLUE_BRICKS,

            HybridBlocksBlocks.BASKETWEAVE_YELLOW_BRICKS,
            HybridBlocksBlocks.PINWHEEL_YELLOW_BRICKS,
            HybridBlocksBlocks.JACK_ON_JACK_YELLOW_BRICKS,
            HybridBlocksBlocks.MIXED_YELLOW_BRICKS,

            HybridBlocksBlocks.BASKETWEAVE_LIME_BRICKS,
            HybridBlocksBlocks.PINWHEEL_LIME_BRICKS,
            HybridBlocksBlocks.JACK_ON_JACK_LIME_BRICKS,
            HybridBlocksBlocks.MIXED_LIME_BRICKS,

            HybridBlocksBlocks.BASKETWEAVE_PINK_BRICKS,
            HybridBlocksBlocks.PINWHEEL_PINK_BRICKS,
            HybridBlocksBlocks.JACK_ON_JACK_PINK_BRICKS,
            HybridBlocksBlocks.MIXED_PINK_BRICKS,

            HybridBlocksBlocks.BASKETWEAVE_GRAY_BRICKS,
            HybridBlocksBlocks.PINWHEEL_GRAY_BRICKS,
            HybridBlocksBlocks.JACK_ON_JACK_GRAY_BRICKS,
            HybridBlocksBlocks.MIXED_GRAY_BRICKS,

            HybridBlocksBlocks.BASKETWEAVE_LIGHT_GRAY_BRICKS,
            HybridBlocksBlocks.PINWHEEL_LIGHT_GRAY_BRICKS,
            HybridBlocksBlocks.JACK_ON_JACK_LIGHT_GRAY_BRICKS,
            HybridBlocksBlocks.MIXED_LIGHT_GRAY_BRICKS,

            HybridBlocksBlocks.BASKETWEAVE_CYAN_BRICKS,
            HybridBlocksBlocks.PINWHEEL_CYAN_BRICKS,
            HybridBlocksBlocks.JACK_ON_JACK_CYAN_BRICKS,
            HybridBlocksBlocks.MIXED_CYAN_BRICKS,

            HybridBlocksBlocks.BASKETWEAVE_PURPLE_BRICKS,
            HybridBlocksBlocks.PINWHEEL_PURPLE_BRICKS,
            HybridBlocksBlocks.JACK_ON_JACK_PURPLE_BRICKS,
            HybridBlocksBlocks.MIXED_PURPLE_BRICKS,

            HybridBlocksBlocks.BASKETWEAVE_BLUE_BRICKS,
            HybridBlocksBlocks.PINWHEEL_BLUE_BRICKS,
            HybridBlocksBlocks.JACK_ON_JACK_BLUE_BRICKS,
            HybridBlocksBlocks.MIXED_BLUE_BRICKS,

            HybridBlocksBlocks.BASKETWEAVE_BROWN_BRICKS,
            HybridBlocksBlocks.PINWHEEL_BROWN_BRICKS,
            HybridBlocksBlocks.JACK_ON_JACK_BROWN_BRICKS,
            HybridBlocksBlocks.MIXED_BROWN_BRICKS,

            HybridBlocksBlocks.BASKETWEAVE_GREEN_BRICKS,
            HybridBlocksBlocks.PINWHEEL_GREEN_BRICKS,
            HybridBlocksBlocks.JACK_ON_JACK_GREEN_BRICKS,
            HybridBlocksBlocks.MIXED_GREEN_BRICKS,

            HybridBlocksBlocks.BASKETWEAVE_RED_BRICKS,
            HybridBlocksBlocks.PINWHEEL_RED_BRICKS,
            HybridBlocksBlocks.JACK_ON_JACK_RED_BRICKS,
            HybridBlocksBlocks.MIXED_RED_BRICKS,

            HybridBlocksBlocks.BASKETWEAVE_BLACK_BRICKS,
            HybridBlocksBlocks.PINWHEEL_BLACK_BRICKS,
            HybridBlocksBlocks.JACK_ON_JACK_BLACK_BRICKS,
            HybridBlocksBlocks.MIXED_BLACK_BRICKS,

            HybridBlocksBlocks.BASKETWEAVE_BRICKS,
            HybridBlocksBlocks.PINWHEEL_BRICKS,
            HybridBlocksBlocks.JACK_ON_JACK_BRICKS,
            HybridBlocksBlocks.MIXED_BRICKS,

            HybridBlocksBlocks.BASKETWEAVE_NETHER_BRICKS,
            HybridBlocksBlocks.PINWHEEL_NETHER_BRICKS,
            HybridBlocksBlocks.JACK_ON_JACK_NETHER_BRICKS,

            HybridBlocksBlocks.BASKETWEAVE_RED_NETHER_BRICKS,
            HybridBlocksBlocks.PINWHEEL_RED_NETHER_BRICKS,
            HybridBlocksBlocks.JACK_ON_JACK_RED_NETHER_BRICKS,
        ).forEach { block ->
            generator.registerSimpleCubeAll(block)
        }


        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.WHITE_BRICKS)
            .family(HybridBlocksFamilies.WHITE_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.ORANGE_BRICKS)
            .family(HybridBlocksFamilies.ORANGE_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MAGENTA_BRICKS)
            .family(HybridBlocksFamilies.MAGENTA_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.LIGHT_BLUE_BRICKS)
            .family(HybridBlocksFamilies.LIGHT_BLUE_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.YELLOW_BRICKS)
            .family(HybridBlocksFamilies.YELLOW_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.LIME_BRICKS)
            .family(HybridBlocksFamilies.LIME_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.PINK_BRICKS)
            .family(HybridBlocksFamilies.PINK_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.GRAY_BRICKS)
            .family(HybridBlocksFamilies.GRAY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.LIGHT_GRAY_BRICKS)
            .family(HybridBlocksFamilies.LIGHT_GRAY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.CYAN_BRICKS)
            .family(HybridBlocksFamilies.CYAN_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.PURPLE_BRICKS)
            .family(HybridBlocksFamilies.PURPLE_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.BLUE_BRICKS)
            .family(HybridBlocksFamilies.BLUE_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.BROWN_BRICKS)
            .family(HybridBlocksFamilies.BROWN_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.GREEN_BRICKS)
            .family(HybridBlocksFamilies.GREEN_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.RED_BRICKS)
            .family(HybridBlocksFamilies.RED_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.BLACK_BRICKS)
            .family(HybridBlocksFamilies.BLACK_BRICKS)

        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_WHITE_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_WHITE_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_ORANGE_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_ORANGE_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_MAGENTA_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_MAGENTA_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_LIGHT_BLUE_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_YELLOW_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_YELLOW_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_LIME_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_LIME_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_PINK_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_PINK_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_GRAY_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_GRAY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_LIGHT_GRAY_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_CYAN_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_CYAN_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_PURPLE_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_PURPLE_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_BLUE_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_BLUE_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_BROWN_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_BROWN_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_GREEN_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_GREEN_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_RED_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_RED_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_BLACK_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_BLACK_BRICKS)

        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MOSSY_BRICKS)
            .family(HybridBlocksFamilies.MOSSY_BRICKS)

        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.CRACKED_BRICKS)
            .family(HybridBlocksFamilies.CRACKED_BRICKS)

        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MIXED_NETHER_BRICKS)
            .family(HybridBlocksFamilies.MIXED_NETHER_BRICKS)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MIXED_RED_NETHER_BRICKS)
            .family(HybridBlocksFamilies.MIXED_RED_NETHER_BRICKS)

        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.WHITE_QUARTZ_BLOCK)
            .family(HybridBlocksFamilies.WHITE_QUARTZ_BLOCK)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.ORANGE_QUARTZ_BLOCK)
            .family(HybridBlocksFamilies.ORANGE_QUARTZ_BLOCK)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.MAGENTA_QUARTZ_BLOCK)
            .family(HybridBlocksFamilies.MAGENTA_QUARTZ_BLOCK)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_BLOCK)
            .family(HybridBlocksFamilies.LIGHT_BLUE_QUARTZ_BLOCK)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.YELLOW_QUARTZ_BLOCK)
            .family(HybridBlocksFamilies.YELLOW_QUARTZ_BLOCK)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.LIME_QUARTZ_BLOCK)
            .family(HybridBlocksFamilies.LIME_QUARTZ_BLOCK)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.PINK_QUARTZ_BLOCK)
            .family(HybridBlocksFamilies.PINK_QUARTZ_BLOCK)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.GRAY_QUARTZ_BLOCK)
            .family(HybridBlocksFamilies.GRAY_QUARTZ_BLOCK)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_BLOCK)
            .family(HybridBlocksFamilies.LIGHT_GRAY_QUARTZ_BLOCK)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.CYAN_QUARTZ_BLOCK)
            .family(HybridBlocksFamilies.CYAN_QUARTZ_BLOCK)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.PURPLE_QUARTZ_BLOCK)
            .family(HybridBlocksFamilies.PURPLE_QUARTZ_BLOCK)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.BLUE_QUARTZ_BLOCK)
            .family(HybridBlocksFamilies.BLUE_QUARTZ_BLOCK)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.BROWN_QUARTZ_BLOCK)
            .family(HybridBlocksFamilies.BROWN_QUARTZ_BLOCK)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.GREEN_QUARTZ_BLOCK)
            .family(HybridBlocksFamilies.GREEN_QUARTZ_BLOCK)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.RED_QUARTZ_BLOCK)
            .family(HybridBlocksFamilies.RED_QUARTZ_BLOCK)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.BLACK_QUARTZ_BLOCK)
            .family(HybridBlocksFamilies.BLACK_QUARTZ_BLOCK)

        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_WHITE_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_WHITE_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_ORANGE_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_ORANGE_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_MAGENTA_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_MAGENTA_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_LIGHT_BLUE_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_LIGHT_BLUE_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_YELLOW_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_YELLOW_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_LIME_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_LIME_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_PINK_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_PINK_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_GRAY_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_GRAY_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_LIGHT_GRAY_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_LIGHT_GRAY_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_CYAN_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_CYAN_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_PURPLE_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_PURPLE_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_BLUE_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_BLUE_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_BROWN_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_BROWN_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_GREEN_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_GREEN_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_RED_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_RED_QUARTZ)
        generator.registerCubeAllModelTexturePool(HybridBlocksBlocks.SMOOTH_BLACK_QUARTZ)
            .family(HybridBlocksFamilies.SMOOTH_BLACK_QUARTZ)
    }

    override fun generateItemModels(generator: ItemModelGenerator) {
    }
}
