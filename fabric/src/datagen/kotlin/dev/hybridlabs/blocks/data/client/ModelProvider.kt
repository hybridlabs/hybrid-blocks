package dev.hybridlabs.blocks.data.client

import dev.hybridlabs.blocks.block.HybridBlocksBlocks
import dev.hybridlabs.blocks.block.HybridBlocksFamilies
import dev.hybridlabs.client.HBModelTemplates
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.models.BlockModelGenerators
import net.minecraft.data.models.ItemModelGenerators
import net.minecraft.data.models.model.ModelLocationUtils
import net.minecraft.data.models.model.ModelTemplate
import net.minecraft.data.models.model.ModelTemplates
import net.minecraft.data.models.model.TextureMapping
import net.minecraft.data.models.model.TextureSlot
import net.minecraft.data.models.model.TexturedModel
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.Blocks

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

            HybridBlocksBlocks.BASKETWEAVE_MUD_BRICKS.get(),
            HybridBlocksBlocks.PINWHEEL_MUD_BRICKS.get(),
            HybridBlocksBlocks.JACK_ON_JACK_MUD_BRICKS.get(),

            HybridBlocksBlocks.BASKETWEAVE_NETHER_BRICKS.get(),
            HybridBlocksBlocks.PINWHEEL_NETHER_BRICKS.get(),
            HybridBlocksBlocks.JACK_ON_JACK_NETHER_BRICKS.get(),

            HybridBlocksBlocks.BASKETWEAVE_RED_NETHER_BRICKS.get(),
            HybridBlocksBlocks.PINWHEEL_RED_NETHER_BRICKS.get(),
            HybridBlocksBlocks.JACK_ON_JACK_RED_NETHER_BRICKS.get(),
        ).forEach { block ->
            generator.createTrivialCube(block)
        }

        generator.family(HybridBlocksBlocks.POLISHED_CALCITE.get()).generateFor(HybridBlocksFamilies.POLISHED_CALCITE)
        generator.family(HybridBlocksBlocks.POLISHED_CALCITE_BRICKS.get()).generateFor(HybridBlocksFamilies.POLISHED_CALCITE_BRICKS)
        generator.family(HybridBlocksBlocks.POLISHED_CALCITE_TILES.get()).generateFor(HybridBlocksFamilies.POLISHED_CALCITE_TILES)
        
        generator.family(HybridBlocksBlocks.MIXED_NETHER_BRICKS.get()).generateFor(HybridBlocksFamilies.MIXED_NETHER_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_NETHER_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_NETHER_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_NETHER_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_MIXED_NETHER_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_NETHER_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_NETHER_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_NETHER_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_MIXED_NETHER_BRICKS)
        generator.family(HybridBlocksBlocks.NETHER_SHINGLES.get()).generateFor(HybridBlocksFamilies.NETHER_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_NETHER_SHINGLES.get()).generateFor(HybridBlocksFamilies.MIXED_NETHER_SHINGLES)
        
        generator.family(HybridBlocksBlocks.MIXED_RED_NETHER_BRICKS.get()).generateFor(HybridBlocksFamilies.MIXED_RED_NETHER_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_RED_NETHER_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_RED_NETHER_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_RED_NETHER_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_MIXED_RED_NETHER_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_RED_NETHER_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_RED_NETHER_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_RED_NETHER_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_MIXED_RED_NETHER_BRICKS)
        generator.family(HybridBlocksBlocks.RED_NETHER_SHINGLES.get()).generateFor(HybridBlocksFamilies.RED_NETHER_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_RED_NETHER_SHINGLES.get()).generateFor(HybridBlocksFamilies.MIXED_RED_NETHER_SHINGLES)

        generator.family(HybridBlocksBlocks.MIXED_MUD_BRICKS.get()).generateFor(HybridBlocksFamilies.MIXED_MUD_BRICKS)
        generator.family(HybridBlocksBlocks.MEDIUM_MUD_BRICKS.get()).generateFor(HybridBlocksFamilies.MEDIUM_MUD_BRICKS)
        generator.family(HybridBlocksBlocks.MEDIUM_MIXED_MUD_BRICKS.get()).generateFor(HybridBlocksFamilies.MEDIUM_MIXED_MUD_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MUD_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_MUD_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_MUD_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_MIXED_MUD_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MUD_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_MUD_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_MUD_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_MIXED_MUD_BRICKS)
        generator.family(HybridBlocksBlocks.MUD_SHINGLES.get()).generateFor(HybridBlocksFamilies.MUD_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_MUD_SHINGLES.get()).generateFor(HybridBlocksFamilies.MIXED_MUD_SHINGLES)

        generator.family(HybridBlocksBlocks.MIXED_BRICKS.get()).generateFor(HybridBlocksFamilies.MIXED_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_MIXED_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_MIXED_BRICKS)
        generator.family(HybridBlocksBlocks.SHINGLES.get()).generateFor(HybridBlocksFamilies.SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_SHINGLES.get()).generateFor(HybridBlocksFamilies.MIXED_SHINGLES)

        generator.family(HybridBlocksBlocks.WHITE_BRICKS.get()).generateFor(HybridBlocksFamilies.WHITE_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_WHITE_BRICKS.get()).generateFor(HybridBlocksFamilies.MIXED_WHITE_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_WHITE_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_WHITE_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_WHITE_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_MIXED_WHITE_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_WHITE_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_WHITE_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_WHITE_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_MIXED_WHITE_BRICKS)
        generator.family(HybridBlocksBlocks.WHITE_SHINGLES.get()).generateFor(HybridBlocksFamilies.WHITE_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_WHITE_SHINGLES.get()).generateFor(HybridBlocksFamilies.MIXED_WHITE_SHINGLES)

        generator.family(HybridBlocksBlocks.ORANGE_BRICKS.get()).generateFor(HybridBlocksFamilies.ORANGE_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_ORANGE_BRICKS.get()).generateFor(HybridBlocksFamilies.MIXED_ORANGE_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_ORANGE_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_ORANGE_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_ORANGE_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_MIXED_ORANGE_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_ORANGE_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_ORANGE_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_ORANGE_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_MIXED_ORANGE_BRICKS)
        generator.family(HybridBlocksBlocks.ORANGE_SHINGLES.get()).generateFor(HybridBlocksFamilies.ORANGE_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_ORANGE_SHINGLES.get()).generateFor(HybridBlocksFamilies.MIXED_ORANGE_SHINGLES)

        generator.family(HybridBlocksBlocks.MAGENTA_BRICKS.get()).generateFor(HybridBlocksFamilies.MAGENTA_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_MAGENTA_BRICKS.get()).generateFor(HybridBlocksFamilies.MIXED_MAGENTA_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MAGENTA_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_MAGENTA_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_MAGENTA_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_MIXED_MAGENTA_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MAGENTA_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_MAGENTA_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_MAGENTA_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_MIXED_MAGENTA_BRICKS)
        generator.family(HybridBlocksBlocks.MAGENTA_SHINGLES.get()).generateFor(HybridBlocksFamilies.MAGENTA_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_MAGENTA_SHINGLES.get()).generateFor(HybridBlocksFamilies.MIXED_MAGENTA_SHINGLES)

        generator.family(HybridBlocksBlocks.LIGHT_BLUE_BRICKS.get()).generateFor(HybridBlocksFamilies.LIGHT_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_LIGHT_BLUE_BRICKS.get()).generateFor(HybridBlocksFamilies.MIXED_LIGHT_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_LIGHT_BLUE_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_LIGHT_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_LIGHT_BLUE_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_MIXED_LIGHT_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_LIGHT_BLUE_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_LIGHT_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_LIGHT_BLUE_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_MIXED_LIGHT_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.LIGHT_BLUE_SHINGLES.get()).generateFor(HybridBlocksFamilies.LIGHT_BLUE_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_LIGHT_BLUE_SHINGLES.get()).generateFor(HybridBlocksFamilies.MIXED_LIGHT_BLUE_SHINGLES)

        generator.family(HybridBlocksBlocks.YELLOW_BRICKS.get()).generateFor(HybridBlocksFamilies.YELLOW_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_YELLOW_BRICKS.get()).generateFor(HybridBlocksFamilies.MIXED_YELLOW_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_YELLOW_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_YELLOW_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_YELLOW_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_MIXED_YELLOW_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_YELLOW_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_YELLOW_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_YELLOW_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_MIXED_YELLOW_BRICKS)
        generator.family(HybridBlocksBlocks.YELLOW_SHINGLES.get()).generateFor(HybridBlocksFamilies.YELLOW_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_YELLOW_SHINGLES.get()).generateFor(HybridBlocksFamilies.MIXED_YELLOW_SHINGLES)

        generator.family(HybridBlocksBlocks.LIME_BRICKS.get()).generateFor(HybridBlocksFamilies.LIME_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_LIME_BRICKS.get()).generateFor(HybridBlocksFamilies.MIXED_LIME_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_LIME_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_LIME_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_LIME_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_MIXED_LIME_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_LIME_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_LIME_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_LIME_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_MIXED_LIME_BRICKS)
        generator.family(HybridBlocksBlocks.LIME_SHINGLES.get()).generateFor(HybridBlocksFamilies.LIME_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_LIME_SHINGLES.get()).generateFor(HybridBlocksFamilies.MIXED_LIME_SHINGLES)

        generator.family(HybridBlocksBlocks.PINK_BRICKS.get()).generateFor(HybridBlocksFamilies.PINK_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_PINK_BRICKS.get()).generateFor(HybridBlocksFamilies.MIXED_PINK_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_PINK_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_PINK_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_PINK_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_MIXED_PINK_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_PINK_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_PINK_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_PINK_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_MIXED_PINK_BRICKS)
        generator.family(HybridBlocksBlocks.PINK_SHINGLES.get()).generateFor(HybridBlocksFamilies.PINK_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_PINK_SHINGLES.get()).generateFor(HybridBlocksFamilies.MIXED_PINK_SHINGLES)

        generator.family(HybridBlocksBlocks.GRAY_BRICKS.get()).generateFor(HybridBlocksFamilies.GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_GRAY_BRICKS.get()).generateFor(HybridBlocksFamilies.MIXED_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_GRAY_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_GRAY_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_MIXED_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_GRAY_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_GRAY_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_MIXED_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.GRAY_SHINGLES.get()).generateFor(HybridBlocksFamilies.GRAY_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_GRAY_SHINGLES.get()).generateFor(HybridBlocksFamilies.MIXED_GRAY_SHINGLES)

        generator.family(HybridBlocksBlocks.LIGHT_GRAY_BRICKS.get()).generateFor(HybridBlocksFamilies.LIGHT_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_LIGHT_GRAY_BRICKS.get()).generateFor(HybridBlocksFamilies.MIXED_LIGHT_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_LIGHT_GRAY_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_LIGHT_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_LIGHT_GRAY_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_MIXED_LIGHT_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_LIGHT_GRAY_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_LIGHT_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_LIGHT_GRAY_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_MIXED_LIGHT_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.LIGHT_GRAY_SHINGLES.get()).generateFor(HybridBlocksFamilies.LIGHT_GRAY_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_LIGHT_GRAY_SHINGLES.get()).generateFor(HybridBlocksFamilies.MIXED_LIGHT_GRAY_SHINGLES)

        generator.family(HybridBlocksBlocks.CYAN_BRICKS.get()).generateFor(HybridBlocksFamilies.CYAN_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_CYAN_BRICKS.get()).generateFor(HybridBlocksFamilies.MIXED_CYAN_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_CYAN_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_CYAN_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_CYAN_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_MIXED_CYAN_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_CYAN_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_CYAN_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_CYAN_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_MIXED_CYAN_BRICKS)
        generator.family(HybridBlocksBlocks.CYAN_SHINGLES.get()).generateFor(HybridBlocksFamilies.CYAN_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_CYAN_SHINGLES.get()).generateFor(HybridBlocksFamilies.MIXED_CYAN_SHINGLES)

        generator.family(HybridBlocksBlocks.PURPLE_BRICKS.get()).generateFor(HybridBlocksFamilies.PURPLE_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_PURPLE_BRICKS.get()).generateFor(HybridBlocksFamilies.MIXED_PURPLE_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_PURPLE_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_PURPLE_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_PURPLE_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_MIXED_PURPLE_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_PURPLE_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_PURPLE_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_PURPLE_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_MIXED_PURPLE_BRICKS)
        generator.family(HybridBlocksBlocks.PURPLE_SHINGLES.get()).generateFor(HybridBlocksFamilies.PURPLE_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_PURPLE_SHINGLES.get()).generateFor(HybridBlocksFamilies.MIXED_PURPLE_SHINGLES)

        generator.family(HybridBlocksBlocks.BLUE_BRICKS.get()).generateFor(HybridBlocksFamilies.BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_BLUE_BRICKS.get()).generateFor(HybridBlocksFamilies.MIXED_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_BLUE_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_BLUE_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_MIXED_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_BLUE_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_BLUE_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_MIXED_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.BLUE_SHINGLES.get()).generateFor(HybridBlocksFamilies.BLUE_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_BLUE_SHINGLES.get()).generateFor(HybridBlocksFamilies.MIXED_BLUE_SHINGLES)

        generator.family(HybridBlocksBlocks.BROWN_BRICKS.get()).generateFor(HybridBlocksFamilies.BROWN_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_BROWN_BRICKS.get()).generateFor(HybridBlocksFamilies.MIXED_BROWN_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_BROWN_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_BROWN_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_BROWN_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_MIXED_BROWN_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_BROWN_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_BROWN_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_BROWN_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_MIXED_BROWN_BRICKS)
        generator.family(HybridBlocksBlocks.BROWN_SHINGLES.get()).generateFor(HybridBlocksFamilies.BROWN_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_BROWN_SHINGLES.get()).generateFor(HybridBlocksFamilies.MIXED_BROWN_SHINGLES)

        generator.family(HybridBlocksBlocks.GREEN_BRICKS.get()).generateFor(HybridBlocksFamilies.GREEN_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_GREEN_BRICKS.get()).generateFor(HybridBlocksFamilies.MIXED_GREEN_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_GREEN_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_GREEN_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_GREEN_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_MIXED_GREEN_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_GREEN_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_GREEN_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_GREEN_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_MIXED_GREEN_BRICKS)
        generator.family(HybridBlocksBlocks.GREEN_SHINGLES.get()).generateFor(HybridBlocksFamilies.GREEN_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_GREEN_SHINGLES.get()).generateFor(HybridBlocksFamilies.MIXED_GREEN_SHINGLES)

        generator.family(HybridBlocksBlocks.RED_BRICKS.get()).generateFor(HybridBlocksFamilies.RED_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_RED_BRICKS.get()).generateFor(HybridBlocksFamilies.MIXED_RED_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_RED_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_RED_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_RED_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_MIXED_RED_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_RED_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_RED_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_RED_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_MIXED_RED_BRICKS)
        generator.family(HybridBlocksBlocks.RED_SHINGLES.get()).generateFor(HybridBlocksFamilies.RED_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_RED_SHINGLES.get()).generateFor(HybridBlocksFamilies.MIXED_RED_SHINGLES)

        generator.family(HybridBlocksBlocks.BLACK_BRICKS.get()).generateFor(HybridBlocksFamilies.BLACK_BRICKS)
        generator.family(HybridBlocksBlocks.MIXED_BLACK_BRICKS.get()).generateFor(HybridBlocksFamilies.MIXED_BLACK_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_BLACK_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_BLACK_BRICKS)
        generator.family(HybridBlocksBlocks.SMALL_MIXED_BLACK_BRICKS.get()).generateFor(HybridBlocksFamilies.SMALL_MIXED_BLACK_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_BLACK_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_BLACK_BRICKS)
        generator.family(HybridBlocksBlocks.LARGE_MIXED_BLACK_BRICKS.get()).generateFor(HybridBlocksFamilies.LARGE_MIXED_BLACK_BRICKS)
        generator.family(HybridBlocksBlocks.BLACK_SHINGLES.get()).generateFor(HybridBlocksFamilies.BLACK_SHINGLES)
        generator.family(HybridBlocksBlocks.MIXED_BLACK_SHINGLES.get()).generateFor(HybridBlocksFamilies.MIXED_BLACK_SHINGLES)

        generator.family(HybridBlocksBlocks.MOSSY_WHITE_BRICKS.get()).generateFor(HybridBlocksFamilies.MOSSY_WHITE_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_ORANGE_BRICKS.get()).generateFor(HybridBlocksFamilies.MOSSY_ORANGE_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_MAGENTA_BRICKS.get()).generateFor(HybridBlocksFamilies.MOSSY_MAGENTA_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_LIGHT_BLUE_BRICKS.get()).generateFor(HybridBlocksFamilies.MOSSY_LIGHT_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_YELLOW_BRICKS.get()).generateFor(HybridBlocksFamilies.MOSSY_YELLOW_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_LIME_BRICKS.get()).generateFor(HybridBlocksFamilies.MOSSY_LIME_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_PINK_BRICKS.get()).generateFor(HybridBlocksFamilies.MOSSY_PINK_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_GRAY_BRICKS.get()).generateFor(HybridBlocksFamilies.MOSSY_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_LIGHT_GRAY_BRICKS.get()).generateFor(HybridBlocksFamilies.MOSSY_LIGHT_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_CYAN_BRICKS.get()).generateFor(HybridBlocksFamilies.MOSSY_CYAN_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_PURPLE_BRICKS.get()).generateFor(HybridBlocksFamilies.MOSSY_PURPLE_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_BLUE_BRICKS.get()).generateFor(HybridBlocksFamilies.MOSSY_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_BROWN_BRICKS.get()).generateFor(HybridBlocksFamilies.MOSSY_BROWN_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_GREEN_BRICKS.get()).generateFor(HybridBlocksFamilies.MOSSY_GREEN_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_RED_BRICKS.get()).generateFor(HybridBlocksFamilies.MOSSY_RED_BRICKS)
        generator.family(HybridBlocksBlocks.MOSSY_BLACK_BRICKS.get()).generateFor(HybridBlocksFamilies.MOSSY_BLACK_BRICKS)

        generator.family(HybridBlocksBlocks.MOSSY_MEDIUM_MUD_BRICKS.get()).generateFor(HybridBlocksFamilies.MOSSY_MEDIUM_MUD_BRICKS)

        generator.family(HybridBlocksBlocks.MOSSY_BRICKS.get()).generateFor(HybridBlocksFamilies.MOSSY_BRICKS)

        generator.family(HybridBlocksBlocks.CRACKED_BRICKS.get()).generateFor(HybridBlocksFamilies.CRACKED_BRICKS)
        generator.family(HybridBlocksBlocks.CRACKED_WHITE_BRICKS.get()).generateFor(HybridBlocksFamilies.CRACKED_WHITE_BRICKS)
        generator.family(HybridBlocksBlocks.CRACKED_ORANGE_BRICKS.get()).generateFor(HybridBlocksFamilies.CRACKED_ORANGE_BRICKS)
        generator.family(HybridBlocksBlocks.CRACKED_MAGENTA_BRICKS.get()).generateFor(HybridBlocksFamilies.CRACKED_MAGENTA_BRICKS)
        generator.family(HybridBlocksBlocks.CRACKED_LIGHT_BLUE_BRICKS.get()).generateFor(HybridBlocksFamilies.CRACKED_LIGHT_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.CRACKED_YELLOW_BRICKS.get()).generateFor(HybridBlocksFamilies.CRACKED_YELLOW_BRICKS)
        generator.family(HybridBlocksBlocks.CRACKED_LIME_BRICKS.get()).generateFor(HybridBlocksFamilies.CRACKED_LIME_BRICKS)
        generator.family(HybridBlocksBlocks.CRACKED_PINK_BRICKS.get()).generateFor(HybridBlocksFamilies.CRACKED_PINK_BRICKS)
        generator.family(HybridBlocksBlocks.CRACKED_GRAY_BRICKS.get()).generateFor(HybridBlocksFamilies.CRACKED_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.CRACKED_LIGHT_GRAY_BRICKS.get()).generateFor(HybridBlocksFamilies.CRACKED_LIGHT_GRAY_BRICKS)
        generator.family(HybridBlocksBlocks.CRACKED_CYAN_BRICKS.get()).generateFor(HybridBlocksFamilies.CRACKED_CYAN_BRICKS)
        generator.family(HybridBlocksBlocks.CRACKED_PURPLE_BRICKS.get()).generateFor(HybridBlocksFamilies.CRACKED_PURPLE_BRICKS)
        generator.family(HybridBlocksBlocks.CRACKED_BLUE_BRICKS.get()).generateFor(HybridBlocksFamilies.CRACKED_BLUE_BRICKS)
        generator.family(HybridBlocksBlocks.CRACKED_BROWN_BRICKS.get()).generateFor(HybridBlocksFamilies.CRACKED_BROWN_BRICKS)
        generator.family(HybridBlocksBlocks.CRACKED_GREEN_BRICKS.get()).generateFor(HybridBlocksFamilies.CRACKED_GREEN_BRICKS)
        generator.family(HybridBlocksBlocks.CRACKED_RED_BRICKS.get()).generateFor(HybridBlocksFamilies.CRACKED_RED_BRICKS)
        generator.family(HybridBlocksBlocks.CRACKED_BLACK_BRICKS.get()).generateFor(HybridBlocksFamilies.CRACKED_BLACK_BRICKS)
        generator.family(Blocks.CRACKED_NETHER_BRICKS).generateFor(HybridBlocksFamilies.CRACKED_NETHER_BRICKS)
        generator.family(HybridBlocksBlocks.CRACKED_RED_NETHER_BRICKS.get()).generateFor(HybridBlocksFamilies.CRACKED_RED_NETHER_BRICKS)
        generator.family(HybridBlocksBlocks.CRACKED_MEDIUM_MUD_BRICKS.get()).generateFor(HybridBlocksFamilies.CRACKED_MEDIUM_MUD_BRICKS)

        generator.family(Blocks.WHITE_WOOL).generateFor(HybridBlocksFamilies.WHITE_WOOL)
        generator.family(Blocks.ORANGE_WOOL).generateFor(HybridBlocksFamilies.ORANGE_WOOL)
        generator.family(Blocks.MAGENTA_WOOL).generateFor(HybridBlocksFamilies.MAGENTA_WOOL)
        generator.family(Blocks.LIGHT_BLUE_WOOL).generateFor(HybridBlocksFamilies.LIGHT_BLUE_WOOL)
        generator.family(Blocks.YELLOW_WOOL).generateFor(HybridBlocksFamilies.YELLOW_WOOL)
        generator.family(Blocks.LIME_WOOL).generateFor(HybridBlocksFamilies.LIME_WOOL)
        generator.family(Blocks.PINK_WOOL).generateFor(HybridBlocksFamilies.PINK_WOOL)
        generator.family(Blocks.GRAY_WOOL).generateFor(HybridBlocksFamilies.GRAY_WOOL)
        generator.family(Blocks.LIGHT_GRAY_WOOL).generateFor(HybridBlocksFamilies.LIGHT_GRAY_WOOL)
        generator.family(Blocks.CYAN_WOOL).generateFor(HybridBlocksFamilies.CYAN_WOOL)
        generator.family(Blocks.PURPLE_WOOL).generateFor(HybridBlocksFamilies.PURPLE_WOOL)
        generator.family(Blocks.BLUE_WOOL).generateFor(HybridBlocksFamilies.BLUE_WOOL)
        generator.family(Blocks.BROWN_WOOL).generateFor(HybridBlocksFamilies.BROWN_WOOL)
        generator.family(Blocks.GREEN_WOOL).generateFor(HybridBlocksFamilies.GREEN_WOOL)
        generator.family(Blocks.RED_WOOL).generateFor(HybridBlocksFamilies.RED_WOOL)
        generator.family(Blocks.BLACK_WOOL).generateFor(HybridBlocksFamilies.BLACK_WOOL)

        generator.family(Blocks.WHITE_CONCRETE).generateFor(HybridBlocksFamilies.WHITE_CONCRETE)
        generator.family(Blocks.ORANGE_CONCRETE).generateFor(HybridBlocksFamilies.ORANGE_CONCRETE)
        generator.family(Blocks.MAGENTA_CONCRETE).generateFor(HybridBlocksFamilies.MAGENTA_CONCRETE)
        generator.family(Blocks.LIGHT_BLUE_CONCRETE).generateFor(HybridBlocksFamilies.LIGHT_BLUE_CONCRETE)
        generator.family(Blocks.YELLOW_CONCRETE).generateFor(HybridBlocksFamilies.YELLOW_CONCRETE)
        generator.family(Blocks.LIME_CONCRETE).generateFor(HybridBlocksFamilies.LIME_CONCRETE)
        generator.family(Blocks.PINK_CONCRETE).generateFor(HybridBlocksFamilies.PINK_CONCRETE)
        generator.family(Blocks.GRAY_CONCRETE).generateFor(HybridBlocksFamilies.GRAY_CONCRETE)
        generator.family(Blocks.LIGHT_GRAY_CONCRETE).generateFor(HybridBlocksFamilies.LIGHT_GRAY_CONCRETE)
        generator.family(Blocks.CYAN_CONCRETE).generateFor(HybridBlocksFamilies.CYAN_CONCRETE)
        generator.family(Blocks.PURPLE_CONCRETE).generateFor(HybridBlocksFamilies.PURPLE_CONCRETE)
        generator.family(Blocks.BLUE_CONCRETE).generateFor(HybridBlocksFamilies.BLUE_CONCRETE)
        generator.family(Blocks.BROWN_CONCRETE).generateFor(HybridBlocksFamilies.BROWN_CONCRETE)
        generator.family(Blocks.GREEN_CONCRETE).generateFor(HybridBlocksFamilies.GREEN_CONCRETE)
        generator.family(Blocks.RED_CONCRETE).generateFor(HybridBlocksFamilies.RED_CONCRETE)
        generator.family(Blocks.BLACK_CONCRETE).generateFor(HybridBlocksFamilies.BLACK_CONCRETE)
        
        generator.family(HybridBlocksBlocks.WHITE_QUARTZ_BLOCK.get()).generateFor(HybridBlocksFamilies.WHITE_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.ORANGE_QUARTZ_BLOCK.get()).generateFor(HybridBlocksFamilies.ORANGE_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.MAGENTA_QUARTZ_BLOCK.get()).generateFor(HybridBlocksFamilies.MAGENTA_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_BLOCK.get()).generateFor(HybridBlocksFamilies.LIGHT_BLUE_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.YELLOW_QUARTZ_BLOCK.get()).generateFor(HybridBlocksFamilies.YELLOW_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.LIME_QUARTZ_BLOCK.get()).generateFor(HybridBlocksFamilies.LIME_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.PINK_QUARTZ_BLOCK.get()).generateFor(HybridBlocksFamilies.PINK_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.GRAY_QUARTZ_BLOCK.get()).generateFor(HybridBlocksFamilies.GRAY_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_BLOCK.get()).generateFor(HybridBlocksFamilies.LIGHT_GRAY_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.CYAN_QUARTZ_BLOCK.get()).generateFor(HybridBlocksFamilies.CYAN_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.PURPLE_QUARTZ_BLOCK.get()).generateFor(HybridBlocksFamilies.PURPLE_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.BLUE_QUARTZ_BLOCK.get()).generateFor(HybridBlocksFamilies.BLUE_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.BROWN_QUARTZ_BLOCK.get()).generateFor(HybridBlocksFamilies.BROWN_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.GREEN_QUARTZ_BLOCK.get()).generateFor(HybridBlocksFamilies.GREEN_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.RED_QUARTZ_BLOCK.get()).generateFor(HybridBlocksFamilies.RED_QUARTZ_BLOCK)
        generator.family(HybridBlocksBlocks.BLACK_QUARTZ_BLOCK.get()).generateFor(HybridBlocksFamilies.BLACK_QUARTZ_BLOCK)

        generator.family(HybridBlocksBlocks.WHITE_QUARTZ_TILES.get()).generateFor(HybridBlocksFamilies.WHITE_QUARTZ_TILES)
        generator.family(HybridBlocksBlocks.ORANGE_QUARTZ_TILES.get()).generateFor(HybridBlocksFamilies.ORANGE_QUARTZ_TILES)
        generator.family(HybridBlocksBlocks.MAGENTA_QUARTZ_TILES.get()).generateFor(HybridBlocksFamilies.MAGENTA_QUARTZ_TILES)
        generator.family(HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_TILES.get()).generateFor(HybridBlocksFamilies.LIGHT_BLUE_QUARTZ_TILES)
        generator.family(HybridBlocksBlocks.YELLOW_QUARTZ_TILES.get()).generateFor(HybridBlocksFamilies.YELLOW_QUARTZ_TILES)
        generator.family(HybridBlocksBlocks.LIME_QUARTZ_TILES.get()).generateFor(HybridBlocksFamilies.LIME_QUARTZ_TILES)
        generator.family(HybridBlocksBlocks.PINK_QUARTZ_TILES.get()).generateFor(HybridBlocksFamilies.PINK_QUARTZ_TILES)
        generator.family(HybridBlocksBlocks.GRAY_QUARTZ_TILES.get()).generateFor(HybridBlocksFamilies.GRAY_QUARTZ_TILES)
        generator.family(HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_TILES.get()).generateFor(HybridBlocksFamilies.LIGHT_GRAY_QUARTZ_TILES)
        generator.family(HybridBlocksBlocks.CYAN_QUARTZ_TILES.get()).generateFor(HybridBlocksFamilies.CYAN_QUARTZ_TILES)
        generator.family(HybridBlocksBlocks.PURPLE_QUARTZ_TILES.get()).generateFor(HybridBlocksFamilies.PURPLE_QUARTZ_TILES)
        generator.family(HybridBlocksBlocks.BLUE_QUARTZ_TILES.get()).generateFor(HybridBlocksFamilies.BLUE_QUARTZ_TILES)
        generator.family(HybridBlocksBlocks.BROWN_QUARTZ_TILES.get()).generateFor(HybridBlocksFamilies.BROWN_QUARTZ_TILES)
        generator.family(HybridBlocksBlocks.GREEN_QUARTZ_TILES.get()).generateFor(HybridBlocksFamilies.GREEN_QUARTZ_TILES)
        generator.family(HybridBlocksBlocks.RED_QUARTZ_TILES.get()).generateFor(HybridBlocksFamilies.RED_QUARTZ_TILES)
        generator.family(HybridBlocksBlocks.BLACK_QUARTZ_TILES.get()).generateFor(HybridBlocksFamilies.BLACK_QUARTZ_TILES)

        // vanilla quartz bricks stay vanilla; only the added stairs and slab get models
        generator.stairsAndSlabOf(
            Blocks.QUARTZ_BRICKS,
            HybridBlocksBlocks.QUARTZ_BRICK_STAIRS.get(),
            HybridBlocksBlocks.QUARTZ_BRICK_SLAB.get()
        )

        generator.family(HybridBlocksBlocks.WHITE_QUARTZ_BRICKS.get()).generateFor(HybridBlocksFamilies.WHITE_QUARTZ_BRICKS)
        generator.family(HybridBlocksBlocks.ORANGE_QUARTZ_BRICKS.get()).generateFor(HybridBlocksFamilies.ORANGE_QUARTZ_BRICKS)
        generator.family(HybridBlocksBlocks.MAGENTA_QUARTZ_BRICKS.get()).generateFor(HybridBlocksFamilies.MAGENTA_QUARTZ_BRICKS)
        generator.family(HybridBlocksBlocks.LIGHT_BLUE_QUARTZ_BRICKS.get()).generateFor(HybridBlocksFamilies.LIGHT_BLUE_QUARTZ_BRICKS)
        generator.family(HybridBlocksBlocks.YELLOW_QUARTZ_BRICKS.get()).generateFor(HybridBlocksFamilies.YELLOW_QUARTZ_BRICKS)
        generator.family(HybridBlocksBlocks.LIME_QUARTZ_BRICKS.get()).generateFor(HybridBlocksFamilies.LIME_QUARTZ_BRICKS)
        generator.family(HybridBlocksBlocks.PINK_QUARTZ_BRICKS.get()).generateFor(HybridBlocksFamilies.PINK_QUARTZ_BRICKS)
        generator.family(HybridBlocksBlocks.GRAY_QUARTZ_BRICKS.get()).generateFor(HybridBlocksFamilies.GRAY_QUARTZ_BRICKS)
        generator.family(HybridBlocksBlocks.LIGHT_GRAY_QUARTZ_BRICKS.get()).generateFor(HybridBlocksFamilies.LIGHT_GRAY_QUARTZ_BRICKS)
        generator.family(HybridBlocksBlocks.CYAN_QUARTZ_BRICKS.get()).generateFor(HybridBlocksFamilies.CYAN_QUARTZ_BRICKS)
        generator.family(HybridBlocksBlocks.PURPLE_QUARTZ_BRICKS.get()).generateFor(HybridBlocksFamilies.PURPLE_QUARTZ_BRICKS)
        generator.family(HybridBlocksBlocks.BLUE_QUARTZ_BRICKS.get()).generateFor(HybridBlocksFamilies.BLUE_QUARTZ_BRICKS)
        generator.family(HybridBlocksBlocks.BROWN_QUARTZ_BRICKS.get()).generateFor(HybridBlocksFamilies.BROWN_QUARTZ_BRICKS)
        generator.family(HybridBlocksBlocks.GREEN_QUARTZ_BRICKS.get()).generateFor(HybridBlocksFamilies.GREEN_QUARTZ_BRICKS)
        generator.family(HybridBlocksBlocks.RED_QUARTZ_BRICKS.get()).generateFor(HybridBlocksFamilies.RED_QUARTZ_BRICKS)
        generator.family(HybridBlocksBlocks.BLACK_QUARTZ_BRICKS.get()).generateFor(HybridBlocksFamilies.BLACK_QUARTZ_BRICKS)

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

        generator.family(HybridBlocksBlocks.SMOOTH_WHITE_QUARTZ.get()).generateFor(HybridBlocksFamilies.SMOOTH_WHITE_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_ORANGE_QUARTZ.get()).generateFor(HybridBlocksFamilies.SMOOTH_ORANGE_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_MAGENTA_QUARTZ.get()).generateFor(HybridBlocksFamilies.SMOOTH_MAGENTA_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_LIGHT_BLUE_QUARTZ.get()).generateFor(HybridBlocksFamilies.SMOOTH_LIGHT_BLUE_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_YELLOW_QUARTZ.get()).generateFor(HybridBlocksFamilies.SMOOTH_YELLOW_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_LIME_QUARTZ.get()).generateFor(HybridBlocksFamilies.SMOOTH_LIME_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_PINK_QUARTZ.get()).generateFor(HybridBlocksFamilies.SMOOTH_PINK_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_GRAY_QUARTZ.get()).generateFor(HybridBlocksFamilies.SMOOTH_GRAY_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_LIGHT_GRAY_QUARTZ.get()).generateFor(HybridBlocksFamilies.SMOOTH_LIGHT_GRAY_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_CYAN_QUARTZ.get()).generateFor(HybridBlocksFamilies.SMOOTH_CYAN_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_PURPLE_QUARTZ.get()).generateFor(HybridBlocksFamilies.SMOOTH_PURPLE_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_BLUE_QUARTZ.get()).generateFor(HybridBlocksFamilies.SMOOTH_BLUE_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_BROWN_QUARTZ.get()).generateFor(HybridBlocksFamilies.SMOOTH_BROWN_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_GREEN_QUARTZ.get()).generateFor(HybridBlocksFamilies.SMOOTH_GREEN_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_RED_QUARTZ.get()).generateFor(HybridBlocksFamilies.SMOOTH_RED_QUARTZ)
        generator.family(HybridBlocksBlocks.SMOOTH_BLACK_QUARTZ.get()).generateFor(HybridBlocksFamilies.SMOOTH_BLACK_QUARTZ)

        generator.create(HybridBlocksBlocks.WHITE_BRICK_CHIMNEY.get(), HBModelTemplates.TEMPLATE_CHIMNEY)
        generator.create(HybridBlocksBlocks.LIGHT_GRAY_BRICK_CHIMNEY.get(), HBModelTemplates.TEMPLATE_CHIMNEY)
        generator.create(HybridBlocksBlocks.GRAY_BRICK_CHIMNEY.get(), HBModelTemplates.TEMPLATE_CHIMNEY)
        generator.create(HybridBlocksBlocks.BLACK_BRICK_CHIMNEY.get(), HBModelTemplates.TEMPLATE_CHIMNEY)

        generator.create(HybridBlocksBlocks.BROWN_BRICK_CHIMNEY.get(), HBModelTemplates.TEMPLATE_CHIMNEY)
        generator.create(HybridBlocksBlocks.RED_BRICK_CHIMNEY.get(), HBModelTemplates.TEMPLATE_CHIMNEY)
        generator.create(HybridBlocksBlocks.ORANGE_BRICK_CHIMNEY.get(), HBModelTemplates.TEMPLATE_CHIMNEY)
        generator.create(HybridBlocksBlocks.YELLOW_BRICK_CHIMNEY.get(), HBModelTemplates.TEMPLATE_CHIMNEY)

        generator.create(HybridBlocksBlocks.LIME_BRICK_CHIMNEY.get(), HBModelTemplates.TEMPLATE_CHIMNEY)
        generator.create(HybridBlocksBlocks.GREEN_BRICK_CHIMNEY.get(), HBModelTemplates.TEMPLATE_CHIMNEY)
        generator.create(HybridBlocksBlocks.CYAN_BRICK_CHIMNEY.get(), HBModelTemplates.TEMPLATE_CHIMNEY)
        generator.create(HybridBlocksBlocks.LIGHT_BLUE_BRICK_CHIMNEY.get(), HBModelTemplates.TEMPLATE_CHIMNEY)

        generator.create(HybridBlocksBlocks.BLUE_BRICK_CHIMNEY.get(), HBModelTemplates.TEMPLATE_CHIMNEY)
        generator.create(HybridBlocksBlocks.PURPLE_BRICK_CHIMNEY.get(), HBModelTemplates.TEMPLATE_CHIMNEY)
        generator.create(HybridBlocksBlocks.MAGENTA_BRICK_CHIMNEY.get(), HBModelTemplates.TEMPLATE_CHIMNEY)
        generator.create(HybridBlocksBlocks.PINK_BRICK_CHIMNEY.get(), HBModelTemplates.TEMPLATE_CHIMNEY)

        generator.create(HybridBlocksBlocks.MUD_BRICK_CHIMNEY.get(), HBModelTemplates.TEMPLATE_CHIMNEY)
        generator.create(HybridBlocksBlocks.BRICK_CHIMNEY.get(), HBModelTemplates.TEMPLATE_CHIMNEY)
        generator.create(HybridBlocksBlocks.NETHER_BRICK_CHIMNEY.get(), HBModelTemplates.TEMPLATE_CHIMNEY)
        generator.create(HybridBlocksBlocks.RED_NETHER_BRICK_CHIMNEY.get(), HBModelTemplates.TEMPLATE_CHIMNEY)
    }

    override fun generateItemModels(generator: ItemModelGenerators) {
    }

    companion object {
        fun createMapping(block: Block, particleLocation: ResourceLocation? = TextureMapping.getBlockTexture(block)): TextureMapping? {
            return TextureMapping.defaultTexture(block).also {
                if (particleLocation != null) {
                    it.put(TextureSlot.PARTICLE, particleLocation)
                }
            }
        }

        fun BlockModelGenerators.createModel(block: Block, template: ModelTemplate, particleLocation: ResourceLocation? = TextureMapping.getBlockTexture(block)): ResourceLocation {
            val mapping = createMapping(block, particleLocation)

            return template.create(block, mapping, modelOutput)
        }

        fun BlockModelGenerators.create(block: Block, template: ModelTemplate, particleLocation: ResourceLocation? = TextureMapping.getBlockTexture(block)) {
            val location = createModel(block, template, particleLocation)
            blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, location))
        }

        fun BlockModelGenerators.createParticle(block: Block, template: ModelTemplate) {
            create(block, template, TextureMapping.getBlockTexture(block, "_particle"))
        }

        /**
         * Models a stairs and slab cut from [base] without emitting anything for [base] itself.
         *
         * [BlockModelGenerators.family] would regenerate the base block's own model, which is wrong
         * when the base is a vanilla block: it would write a `minecraft:` asset that shadows the
         * real one. The double-slab reuses the base's existing model location instead.
         */
        fun BlockModelGenerators.stairsAndSlabOf(base: Block, stairs: Block, slab: Block) {
            val mapping = TextureMapping.cube(base)
            val fullBlock = ModelLocationUtils.getModelLocation(base)

            val inner = ModelTemplates.STAIRS_INNER.create(stairs, mapping, modelOutput)
            val straight = ModelTemplates.STAIRS_STRAIGHT.create(stairs, mapping, modelOutput)
            val outer = ModelTemplates.STAIRS_OUTER.create(stairs, mapping, modelOutput)
            blockStateOutput.accept(BlockModelGenerators.createStairs(stairs, inner, straight, outer))
            delegateItemModel(stairs, straight)

            val bottom = ModelTemplates.SLAB_BOTTOM.create(slab, mapping, modelOutput)
            val top = ModelTemplates.SLAB_TOP.create(slab, mapping, modelOutput)
            blockStateOutput.accept(BlockModelGenerators.createSlab(slab, bottom, top, fullBlock))
            delegateItemModel(slab, bottom)
        }

        fun TextureMapping.put(slot: TextureSlot, block: Block): TextureMapping {
            return put(slot, TextureMapping.getBlockTexture(block, "_${slot.id}"))
        }
    }
}
