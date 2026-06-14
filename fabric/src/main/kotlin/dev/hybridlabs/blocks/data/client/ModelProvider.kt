package dev.hybridlabs.blocks.data.client

import dev.hybridlabs.blocks.block.HybridBlocksBlocks
import dev.hybridlabs.blocks.block.HybridBlocksFamilies
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.models.BlockModelGenerators
import net.minecraft.data.models.ItemModelGenerators
import net.minecraft.data.models.model.TexturedModel

/**
 * Generates all models.
 */
class ModelProvider(output: FabricDataOutput) : FabricModelProvider(output) {
    override fun generateBlockStateModels(generator: BlockModelGenerators) {
        // generate simple cube all
        mapOf(
            HybridBlocksBlocks.CLEAR_GLASS.get() to HybridBlocksBlocks.CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.WHITE_STAINED_CLEAR_GLASS.get() to HybridBlocksBlocks.WHITE_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.ORANGE_STAINED_CLEAR_GLASS.get() to HybridBlocksBlocks.ORANGE_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.MAGENTA_STAINED_CLEAR_GLASS.get() to HybridBlocksBlocks.MAGENTA_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS.get() to HybridBlocksBlocks.LIGHT_BLUE_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.YELLOW_STAINED_CLEAR_GLASS.get() to HybridBlocksBlocks.YELLOW_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.LIME_STAINED_CLEAR_GLASS.get() to HybridBlocksBlocks.LIME_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.PINK_STAINED_CLEAR_GLASS.get() to HybridBlocksBlocks.PINK_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.GRAY_STAINED_CLEAR_GLASS.get() to HybridBlocksBlocks.GRAY_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS.get() to HybridBlocksBlocks.LIGHT_GRAY_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.CYAN_STAINED_CLEAR_GLASS.get() to HybridBlocksBlocks.CYAN_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.PURPLE_STAINED_CLEAR_GLASS.get() to HybridBlocksBlocks.PURPLE_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.BLUE_STAINED_CLEAR_GLASS.get() to HybridBlocksBlocks.BLUE_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.BROWN_STAINED_CLEAR_GLASS.get() to HybridBlocksBlocks.BROWN_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.GREEN_STAINED_CLEAR_GLASS.get() to HybridBlocksBlocks.GREEN_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.RED_STAINED_CLEAR_GLASS.get() to HybridBlocksBlocks.RED_STAINED_CLEAR_GLASS_PANE.get(),
            HybridBlocksBlocks.BLACK_STAINED_CLEAR_GLASS.get() to HybridBlocksBlocks.BLACK_STAINED_CLEAR_GLASS_PANE.get(),
        ).forEach { (glass, pane) ->
            generator.createGlassBlocks(glass, pane)
        }

        // axis rotated pillars
        setOf(
            HybridBlocksBlocks.WHITE_QUARTZ_PILLAR.get(),
            HybridBlocksBlocks.ORANGE_QUARTZ_PILLAR.get(),
            HybridBlocksBlocks.MAGENTA_QUARTZ_PILLAR.get(),
            HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_PILLAR.get(),
            HybridBlocksBlocks.YELLOW_QUARTZ_PILLAR.get(),
            HybridBlocksBlocks.LIME_QUARTZ_PILLAR.get(),
            HybridBlocksBlocks.PINK_QUARTZ_PILLAR.get(),
            HybridBlocksBlocks.GRAY_QUARTZ_PILLAR.get(),
            HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_PILLAR.get(),
            HybridBlocksBlocks.CYAN_QUARTZ_PILLAR.get(),
            HybridBlocksBlocks.PURPLE_QUARTZ_PILLAR.get(),
            HybridBlocksBlocks.BLUE_QUARTZ_PILLAR.get(),
            HybridBlocksBlocks.BROWN_QUARTZ_PILLAR.get(),
            HybridBlocksBlocks.GREEN_QUARTZ_PILLAR.get(),
            HybridBlocksBlocks.RED_QUARTZ_PILLAR.get(),
            HybridBlocksBlocks.BLACK_QUARTZ_PILLAR.get(),
        ).forEach { block ->
            generator.createAxisAlignedPillarBlock(
                block,
                TexturedModel.COLUMN
            )
        }

        // axis rotated pillars
        setOf(
            HybridBlocksBlocks.WHITE_QUARTZ_BRICKS.get(),
            HybridBlocksBlocks.ORANGE_QUARTZ_BRICKS.get(),
            HybridBlocksBlocks.MAGENTA_QUARTZ_BRICKS.get(),
            HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_BRICKS.get(),
            HybridBlocksBlocks.YELLOW_QUARTZ_BRICKS.get(),
            HybridBlocksBlocks.LIME_QUARTZ_BRICKS.get(),
            HybridBlocksBlocks.PINK_QUARTZ_BRICKS.get(),
            HybridBlocksBlocks.GRAY_QUARTZ_BRICKS.get(),
            HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_BRICKS.get(),
            HybridBlocksBlocks.CYAN_QUARTZ_BRICKS.get(),
            HybridBlocksBlocks.PURPLE_QUARTZ_BRICKS.get(),
            HybridBlocksBlocks.BLUE_QUARTZ_BRICKS.get(),
            HybridBlocksBlocks.BROWN_QUARTZ_BRICKS.get(),
            HybridBlocksBlocks.GREEN_QUARTZ_BRICKS.get(),
            HybridBlocksBlocks.RED_QUARTZ_BRICKS.get(),
            HybridBlocksBlocks.BLACK_QUARTZ_BRICKS.get(),

            HybridBlocksBlocks.BASKETWEAVE_WHITE_BRICKS.get(),
            HybridBlocksBlocks.PINWHEEL_WHITE_BRICKS.get(),
            HybridBlocksBlocks.JACK_ON_JACK_WHITE_BRICKS.get(),

            HybridBlocksBlocks.BASKETWEAVE_ORANGE_BRICKS.get(),
            HybridBlocksBlocks.PINWHEEL_ORANGE_BRICKS.get(),
            HybridBlocksBlocks.JACK_ON_JACK_ORANGE_BRICKS.get(),

            HybridBlocksBlocks.BASKETWEAVE_MAGENTA_BRICKS.get(),
            HybridBlocksBlocks.PINWHEEL_MAGENTA_BRICKS.get(),
            HybridBlocksBlocks.JACK_ON_JACK_MAGENTA_BRICKS.get(),

            HybridBlocksBlocks.BASKETWEAVE_LIGHT_BLUE_BRICKS.get(),
            HybridBlocksBlocks.PINWHEEL_LIGHT_BLUE_BRICKS.get(),
            HybridBlocksBlocks.JACK_ON_JACK_LIGHT_BLUE_BRICKS.get(),

            HybridBlocksBlocks.BASKETWEAVE_YELLOW_BRICKS.get(),
            HybridBlocksBlocks.PINWHEEL_YELLOW_BRICKS.get(),
            HybridBlocksBlocks.JACK_ON_JACK_YELLOW_BRICKS.get(),

            HybridBlocksBlocks.BASKETWEAVE_LIME_BRICKS.get(),
            HybridBlocksBlocks.PINWHEEL_LIME_BRICKS.get(),
            HybridBlocksBlocks.JACK_ON_JACK_LIME_BRICKS.get(),

            HybridBlocksBlocks.BASKETWEAVE_PINK_BRICKS.get(),
            HybridBlocksBlocks.PINWHEEL_PINK_BRICKS.get(),
            HybridBlocksBlocks.JACK_ON_JACK_PINK_BRICKS.get(),

            HybridBlocksBlocks.BASKETWEAVE_GRAY_BRICKS.get(),
            HybridBlocksBlocks.PINWHEEL_GRAY_BRICKS.get(),
            HybridBlocksBlocks.JACK_ON_JACK_GRAY_BRICKS.get(),

            HybridBlocksBlocks.BASKETWEAVE_LIGHT_GRAY_BRICKS.get(),
            HybridBlocksBlocks.PINWHEEL_LIGHT_GRAY_BRICKS.get(),
            HybridBlocksBlocks.JACK_ON_JACK_LIGHT_GRAY_BRICKS.get(),

            HybridBlocksBlocks.BASKETWEAVE_CYAN_BRICKS.get(),
            HybridBlocksBlocks.PINWHEEL_CYAN_BRICKS.get(),
            HybridBlocksBlocks.JACK_ON_JACK_CYAN_BRICKS.get(),

            HybridBlocksBlocks.BASKETWEAVE_PURPLE_BRICKS.get(),
            HybridBlocksBlocks.PINWHEEL_PURPLE_BRICKS.get(),
            HybridBlocksBlocks.JACK_ON_JACK_PURPLE_BRICKS.get(),

            HybridBlocksBlocks.BASKETWEAVE_BLUE_BRICKS.get(),
            HybridBlocksBlocks.PINWHEEL_BLUE_BRICKS.get(),
            HybridBlocksBlocks.JACK_ON_JACK_BLUE_BRICKS.get(),

            HybridBlocksBlocks.BASKETWEAVE_BROWN_BRICKS.get(),
            HybridBlocksBlocks.PINWHEEL_BROWN_BRICKS.get(),
            HybridBlocksBlocks.JACK_ON_JACK_BROWN_BRICKS.get(),

            HybridBlocksBlocks.BASKETWEAVE_GREEN_BRICKS.get(),
            HybridBlocksBlocks.PINWHEEL_GREEN_BRICKS.get(),
            HybridBlocksBlocks.JACK_ON_JACK_GREEN_BRICKS.get(),

            HybridBlocksBlocks.BASKETWEAVE_RED_BRICKS.get(),
            HybridBlocksBlocks.PINWHEEL_RED_BRICKS.get(),
            HybridBlocksBlocks.JACK_ON_JACK_RED_BRICKS.get(),

            HybridBlocksBlocks.BASKETWEAVE_BLACK_BRICKS.get(),
            HybridBlocksBlocks.PINWHEEL_BLACK_BRICKS.get(),
            HybridBlocksBlocks.JACK_ON_JACK_BLACK_BRICKS.get(),

            HybridBlocksBlocks.BASKETWEAVE_BRICKS.get(),
            HybridBlocksBlocks.PINWHEEL_BRICKS.get(),
            HybridBlocksBlocks.JACK_ON_JACK_BRICKS.get(),

            HybridBlocksBlocks.BASKETWEAVE_NETHER_BRICKS.get(),
            HybridBlocksBlocks.PINWHEEL_NETHER_BRICKS.get(),
            HybridBlocksBlocks.JACK_ON_JACK_NETHER_BRICKS.get(),

            HybridBlocksBlocks.BASKETWEAVE_RED_NETHER_BRICKS.get(),
            HybridBlocksBlocks.PINWHEEL_RED_NETHER_BRICKS.get(),
            HybridBlocksBlocks.JACK_ON_JACK_RED_NETHER_BRICKS.get(),
        ).forEach { block ->
            generator.createTrivialCube(block)
        }
        
        generator.family(HybridBlocksBlocks.MIXED_NETHER_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MIXED_NETHER_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_NETHER_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_NETHER_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_NETHER_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_MIXED_NETHER_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_NETHER_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_NETHER_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_NETHER_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_MIXED_NETHER_BRICKS)
        generator.family(HybridBlocksBlocks.NETHER_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.NETHER_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_NETHER_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.MIXED_NETHER_SHINGLES)
        
        generator.family(HybridBlocksBlocks.MIXED_RED_NETHER_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MIXED_RED_NETHER_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_RED_NETHER_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_RED_NETHER_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_RED_NETHER_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_MIXED_RED_NETHER_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_RED_NETHER_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_RED_NETHER_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_RED_NETHER_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_MIXED_RED_NETHER_BRICKS)
        generator.family(HybridBlocksBlocks.RED_NETHER_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.RED_NETHER_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_RED_NETHER_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.MIXED_RED_NETHER_SHINGLES)

        generator.family(HybridBlocksBlocks.MIXED_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MIXED_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_MIXED_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_MIXED_BRICKS)
        generator.family(HybridBlocksBlocks.SHINGLES.get())
            .generateFor(HybridBlocksFamilies.SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.MIXED_SHINGLES)

        generator.family(HybridBlocksBlocks.WHITE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.WHITE_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_WHITE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MIXED_WHITE_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_WHITE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_WHITE_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_WHITE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_MIXED_WHITE_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_WHITE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_WHITE_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_WHITE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_MIXED_WHITE_BRICKS)
        generator.family(HybridBlocksBlocks.WHITE_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.WHITE_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_WHITE_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.MIXED_WHITE_SHINGLES)

        generator.family(HybridBlocksBlocks.ORANGE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.ORANGE_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_ORANGE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MIXED_ORANGE_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_ORANGE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_ORANGE_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_ORANGE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_MIXED_ORANGE_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_ORANGE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_ORANGE_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_ORANGE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_MIXED_ORANGE_BRICKS)
        generator.family(HybridBlocksBlocks.ORANGE_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.ORANGE_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_ORANGE_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.MIXED_ORANGE_SHINGLES)

        generator.family(HybridBlocksBlocks.MAGENTA_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MAGENTA_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_MAGENTA_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MIXED_MAGENTA_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MAGENTA_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_MAGENTA_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_MAGENTA_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_MIXED_MAGENTA_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MAGENTA_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_MAGENTA_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_MAGENTA_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_MIXED_MAGENTA_BRICKS)
        generator.family(HybridBlocksBlocks.MAGENTA_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.MAGENTA_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_MAGENTA_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.MIXED_MAGENTA_SHINGLES)

        generator.family(HybridBlocksBlocks.LIGHT_BLUE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LIGHT_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_LIGHT_BLUE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MIXED_LIGHT_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_LIGHT_BLUE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_LIGHT_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_LIGHT_BLUE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_MIXED_LIGHT_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_LIGHT_BLUE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_LIGHT_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_LIGHT_BLUE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_MIXED_LIGHT_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.LIGHT_BLUE_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.LIGHT_BLUE_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_LIGHT_BLUE_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.MIXED_LIGHT_BLUE_SHINGLES)

        generator.family(HybridBlocksBlocks.YELLOW_BRICKS.get())
            .generateFor(HybridBlocksFamilies.YELLOW_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_YELLOW_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MIXED_YELLOW_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_YELLOW_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_YELLOW_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_YELLOW_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_MIXED_YELLOW_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_YELLOW_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_YELLOW_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_YELLOW_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_MIXED_YELLOW_BRICKS)
        generator.family(HybridBlocksBlocks.YELLOW_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.YELLOW_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_YELLOW_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.MIXED_YELLOW_SHINGLES)

        generator.family(HybridBlocksBlocks.LIME_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LIME_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_LIME_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MIXED_LIME_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_LIME_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_LIME_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_LIME_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_MIXED_LIME_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_LIME_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_LIME_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_LIME_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_MIXED_LIME_BRICKS)
        generator.family(HybridBlocksBlocks.LIME_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.LIME_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_LIME_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.MIXED_LIME_SHINGLES)

        generator.family(HybridBlocksBlocks.PINK_BRICKS.get())
            .generateFor(HybridBlocksFamilies.PINK_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_PINK_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MIXED_PINK_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_PINK_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_PINK_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_PINK_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_MIXED_PINK_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_PINK_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_PINK_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_PINK_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_MIXED_PINK_BRICKS)
        generator.family(HybridBlocksBlocks.PINK_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.PINK_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_PINK_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.MIXED_PINK_SHINGLES)

        generator.family(HybridBlocksBlocks.GRAY_BRICKS.get())
            .generateFor(HybridBlocksFamilies.GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_GRAY_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MIXED_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_GRAY_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_GRAY_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_MIXED_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_GRAY_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_GRAY_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_MIXED_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.GRAY_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.GRAY_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_GRAY_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.MIXED_GRAY_SHINGLES)

        generator.family(HybridBlocksBlocks.LIGHT_GRAY_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LIGHT_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_LIGHT_GRAY_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MIXED_LIGHT_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_LIGHT_GRAY_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_LIGHT_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_LIGHT_GRAY_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_MIXED_LIGHT_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_LIGHT_GRAY_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_LIGHT_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_LIGHT_GRAY_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_MIXED_LIGHT_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.LIGHT_GRAY_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.LIGHT_GRAY_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_LIGHT_GRAY_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.MIXED_LIGHT_GRAY_SHINGLES)

        generator.family(HybridBlocksBlocks.CYAN_BRICKS.get())
            .generateFor(HybridBlocksFamilies.CYAN_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_CYAN_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MIXED_CYAN_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_CYAN_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_CYAN_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_CYAN_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_MIXED_CYAN_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_CYAN_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_CYAN_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_CYAN_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_MIXED_CYAN_BRICKS)
        generator.family(HybridBlocksBlocks.CYAN_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.CYAN_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_CYAN_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.MIXED_CYAN_SHINGLES)

        generator.family(HybridBlocksBlocks.PURPLE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.PURPLE_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_PURPLE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MIXED_PURPLE_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_PURPLE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_PURPLE_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_PURPLE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_MIXED_PURPLE_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_PURPLE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_PURPLE_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_PURPLE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_MIXED_PURPLE_BRICKS)
        generator.family(HybridBlocksBlocks.PURPLE_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.PURPLE_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_PURPLE_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.MIXED_PURPLE_SHINGLES)

        generator.family(HybridBlocksBlocks.BLUE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_BLUE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MIXED_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_BLUE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_BLUE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_MIXED_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_BLUE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_BLUE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_MIXED_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.BLUE_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.BLUE_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_BLUE_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.MIXED_BLUE_SHINGLES)

        generator.family(HybridBlocksBlocks.BROWN_BRICKS.get())
            .generateFor(HybridBlocksFamilies.BROWN_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_BROWN_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MIXED_BROWN_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_BROWN_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_BROWN_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_BROWN_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_MIXED_BROWN_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_BROWN_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_BROWN_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_BROWN_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_MIXED_BROWN_BRICKS)
        generator.family(HybridBlocksBlocks.BROWN_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.BROWN_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_BROWN_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.MIXED_BROWN_SHINGLES)

        generator.family(HybridBlocksBlocks.GREEN_BRICKS.get())
            .generateFor(HybridBlocksFamilies.GREEN_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_GREEN_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MIXED_GREEN_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_GREEN_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_GREEN_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_GREEN_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_MIXED_GREEN_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_GREEN_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_GREEN_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_GREEN_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_MIXED_GREEN_BRICKS)
        generator.family(HybridBlocksBlocks.GREEN_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.GREEN_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_GREEN_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.MIXED_GREEN_SHINGLES)

        generator.family(HybridBlocksBlocks.RED_BRICKS.get())
            .generateFor(HybridBlocksFamilies.RED_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_RED_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MIXED_RED_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_RED_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_RED_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_RED_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_MIXED_RED_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_RED_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_RED_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_RED_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_MIXED_RED_BRICKS)
        generator.family(HybridBlocksBlocks.RED_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.RED_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_RED_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.MIXED_RED_SHINGLES)

        generator.family(HybridBlocksBlocks.BLACK_BRICKS.get())
            .generateFor(HybridBlocksFamilies.BLACK_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_BLACK_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MIXED_BLACK_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_BLACK_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_BLACK_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_BLACK_BRICKS.get())
            .generateFor(HybridBlocksFamilies.SMALL_MIXED_BLACK_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_BLACK_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_BLACK_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_BLACK_BRICKS.get())
            .generateFor(HybridBlocksFamilies.LARGE_MIXED_BLACK_BRICKS)
        generator.family(HybridBlocksBlocks.BLACK_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.BLACK_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_BLACK_SHINGLES.get())
            .generateFor(HybridBlocksFamilies.MIXED_BLACK_SHINGLES)

        generator.family(HybridBlocksBlocks.MOSSY_WHITE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MOSSY_WHITE_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_ORANGE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MOSSY_ORANGE_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_MAGENTA_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MOSSY_MAGENTA_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MOSSY_LIGHT_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_YELLOW_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MOSSY_YELLOW_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_LIME_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MOSSY_LIME_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_PINK_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MOSSY_PINK_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_GRAY_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MOSSY_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MOSSY_LIGHT_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_CYAN_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MOSSY_CYAN_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_PURPLE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MOSSY_PURPLE_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_BLUE_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MOSSY_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_BROWN_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MOSSY_BROWN_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_GREEN_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MOSSY_GREEN_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_RED_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MOSSY_RED_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_BLACK_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MOSSY_BLACK_BRICKS)

        generator.family(HybridBlocksBlocks.MOSSY_BRICKS.get())
            .generateFor(HybridBlocksFamilies.MOSSY_BRICKS)

        generator.family(HybridBlocksBlocks.CRACKED_BRICKS.get())
            .generateFor(HybridBlocksFamilies.CRACKED_BRICKS)

        generator.family(HybridBlocksBlocks.WHITE_QUARTZ_BLOCK.get())
            .generateFor(HybridBlocksFamilies.WHITE_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.ORANGE_QUARTZ_BLOCK.get())
            .generateFor(HybridBlocksFamilies.ORANGE_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.MAGENTA_QUARTZ_BLOCK.get())
            .generateFor(HybridBlocksFamilies.MAGENTA_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_BLOCK.get())
            .generateFor(HybridBlocksFamilies.LIGHT_BLUE_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.YELLOW_QUARTZ_BLOCK.get())
            .generateFor(HybridBlocksFamilies.YELLOW_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.LIME_QUARTZ_BLOCK.get())
            .generateFor(HybridBlocksFamilies.LIME_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.PINK_QUARTZ_BLOCK.get())
            .generateFor(HybridBlocksFamilies.PINK_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.GRAY_QUARTZ_BLOCK.get())
            .generateFor(HybridBlocksFamilies.GRAY_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_BLOCK.get())
            .generateFor(HybridBlocksFamilies.LIGHT_GRAY_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.CYAN_QUARTZ_BLOCK.get())
            .generateFor(HybridBlocksFamilies.CYAN_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.PURPLE_QUARTZ_BLOCK.get())
            .generateFor(HybridBlocksFamilies.PURPLE_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.BLUE_QUARTZ_BLOCK.get())
            .generateFor(HybridBlocksFamilies.BLUE_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.BROWN_QUARTZ_BLOCK.get())
            .generateFor(HybridBlocksFamilies.BROWN_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.GREEN_QUARTZ_BLOCK.get())
            .generateFor(HybridBlocksFamilies.GREEN_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.RED_QUARTZ_BLOCK.get())
            .generateFor(HybridBlocksFamilies.RED_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.BLACK_QUARTZ_BLOCK.get())
            .generateFor(HybridBlocksFamilies.BLACK_QUARTZ_BLOCK)

        setOf(
            HybridBlocksBlocks.CHISELED_WHITE_QUARTZ_BLOCK.get(),
            HybridBlocksBlocks.CHISELED_ORANGE_QUARTZ_BLOCK.get(),
            HybridBlocksBlocks.CHISELED_MAGENTA_QUARTZ_BLOCK.get(),
            HybridBlocksBlocks.CHISELED_LIGHT_BLUE_QUARTZ_BLOCK.get(),
            HybridBlocksBlocks.CHISELED_YELLOW_QUARTZ_BLOCK.get(),
            HybridBlocksBlocks.CHISELED_LIME_QUARTZ_BLOCK.get(),
            HybridBlocksBlocks.CHISELED_PINK_QUARTZ_BLOCK.get(),
            HybridBlocksBlocks.CHISELED_GRAY_QUARTZ_BLOCK.get(),
            HybridBlocksBlocks.CHISELED_LIGHT_GRAY_QUARTZ_BLOCK.get(),
            HybridBlocksBlocks.CHISELED_CYAN_QUARTZ_BLOCK.get(),
            HybridBlocksBlocks.CHISELED_PURPLE_QUARTZ_BLOCK.get(),
            HybridBlocksBlocks.CHISELED_BLUE_QUARTZ_BLOCK.get(),
            HybridBlocksBlocks.CHISELED_BROWN_QUARTZ_BLOCK.get(),
            HybridBlocksBlocks.CHISELED_GREEN_QUARTZ_BLOCK.get(),
            HybridBlocksBlocks.CHISELED_RED_QUARTZ_BLOCK.get(),
            HybridBlocksBlocks.CHISELED_BLACK_QUARTZ_BLOCK.get(),
        ).forEach { block ->
            generator.createTrivialBlock(block, TexturedModel.COLUMN)
        }

        generator.family(HybridBlocksBlocks.SMOOTH_WHITE_QUARTZ.get())
            .generateFor(HybridBlocksFamilies.SMOOTH_WHITE_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_ORANGE_QUARTZ.get())
            .generateFor(HybridBlocksFamilies.SMOOTH_ORANGE_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_MAGENTA_QUARTZ.get())
            .generateFor(HybridBlocksFamilies.SMOOTH_MAGENTA_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_LIGHT_BLUE_QUARTZ.get())
            .generateFor(HybridBlocksFamilies.SMOOTH_LIGHT_BLUE_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_YELLOW_QUARTZ.get())
            .generateFor(HybridBlocksFamilies.SMOOTH_YELLOW_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_LIME_QUARTZ.get())
            .generateFor(HybridBlocksFamilies.SMOOTH_LIME_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_PINK_QUARTZ.get())
            .generateFor(HybridBlocksFamilies.SMOOTH_PINK_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_GRAY_QUARTZ.get())
            .generateFor(HybridBlocksFamilies.SMOOTH_GRAY_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_LIGHT_GRAY_QUARTZ.get())
            .generateFor(HybridBlocksFamilies.SMOOTH_LIGHT_GRAY_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_CYAN_QUARTZ.get())
            .generateFor(HybridBlocksFamilies.SMOOTH_CYAN_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_PURPLE_QUARTZ.get())
            .generateFor(HybridBlocksFamilies.SMOOTH_PURPLE_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_BLUE_QUARTZ.get())
            .generateFor(HybridBlocksFamilies.SMOOTH_BLUE_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_BROWN_QUARTZ.get())
            .generateFor(HybridBlocksFamilies.SMOOTH_BROWN_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_GREEN_QUARTZ.get())
            .generateFor(HybridBlocksFamilies.SMOOTH_GREEN_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_RED_QUARTZ.get())
            .generateFor(HybridBlocksFamilies.SMOOTH_RED_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_BLACK_QUARTZ.get())
            .generateFor(HybridBlocksFamilies.SMOOTH_BLACK_QUARTZ)
    }

    override fun generateItemModels(generator: ItemModelGenerators) {
    }
}
