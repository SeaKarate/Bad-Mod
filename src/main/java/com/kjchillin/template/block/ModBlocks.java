
package com.kjchillin.template.block;

import com.kjchillin.template.Template;
import com.kjchillin.template.block.custom.CornCropBlock;
import com.kjchillin.template.block.custom.GrowableMetalDetector;
import com.kjchillin.template.block.custom.SoundBlock;
import com.kjchillin.template.block.custom.TomatoCropBlock;
import com.kjchillin.template.sound.ModSounds;
import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.scoreboard.AbstractTeam;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.BlockCollisionSpliterator;

import static net.minecraft.block.Blocks.*;

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(
                    AbstractBlock.Settings.create()//.copy(Blocks.AMETHYST_BLOCK)
                            .mapColor(MapColor.RED)
                            .instrument(NoteBlockInstrument.CREEPER)
                            .requiresTool()
                            .strength(1.0F, 100.0F)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.RED)
                            .instrument(NoteBlockInstrument.CREEPER)
                            .requiresTool()
                            .strength(1.0F, 100.0F)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block SOUND_BLOCK = registerBlock("sound_block",
            new SoundBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.RED)
                            .instrument(NoteBlockInstrument.CREEPER)
                            .requiresTool()
                            .strength(1.0F, 100.0F)
                            .sounds(ModSounds.SOUND_BLOCK_SOUNDS)));

    public static final Block RUBY_STAIRS = registerBlock("ruby_stairs",
            new StairsBlock(ModBlocks.RUBY_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.CHERRY_STAIRS)));
public static final Block RUBY_SLAB = registerBlock("ruby_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.BAMBOO_SLAB)));

public static final Block RUBY_BUTTON = registerBlock("ruby_button",
            new ButtonBlock(BlockSetType.IRON,10,FabricBlockSettings.copy(Blocks.IRON_BLOCK)));
public static final Block RUBY_PRESSURE_PLATE = registerBlock("ruby_pressure_plate",
            new PressurePlateBlock(BlockSetType.CHERRY,FabricBlockSettings.copy(Blocks.CHERRY_BUTTON).noCollision()));

public static final Block RUBY_FENCE = registerBlock("ruby_fence",
            new FenceBlock(FabricBlockSettings.copy(Blocks.CHERRY_FENCE)));
public static final Block RUBY_FENCE_GATE = registerBlock("ruby_fence_gate",
            new FenceGateBlock(WoodType.CHERRY, FabricBlockSettings.copy(Blocks.CHERRY_FENCE_GATE)));
public static final Block RUBY_WALL = registerBlock("ruby_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.BRICK_WALL)));

public static final Block RUBY_DOOR = registerBlock("ruby_door",
            new DoorBlock(BlockSetType.IRON, FabricBlockSettings.copy(Blocks.CHERRY_DOOR)));
public static final Block RUBY_TRAPDOOR = registerBlock("ruby_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, FabricBlockSettings.copy(Blocks.CHERRY_TRAPDOOR)));

public static final Block TOMATO_CROP = Registry.register(Registries.BLOCK, Identifier.of(Template.MOD_ID, "tomato_crop"),
        new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
public static final Block METAL_DETECTOR_CROP = Registry.register(Registries.BLOCK, Identifier.of(Template.MOD_ID, "metal_detector_crop"),
        new GrowableMetalDetector(FabricBlockSettings.copyOf(Blocks.WHEAT)));
public static final Block CORN_CROP = Registry.register(Registries.BLOCK, Identifier.of(Template.MOD_ID, "corn_crop"),
        new CornCropBlock(FabricBlockSettings.copyOf(Blocks.SUGAR_CANE)));

    public static final Block DAHLIA = registerBlock("dahlia",
            new FlowerBlock(StatusEffects.GLOWING, 20,
                    FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_DAHLIA = Registry.register(Registries.BLOCK, Identifier.of(Template.MOD_ID, "potted_dahlia"),
            new FlowerPotBlock(DAHLIA, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque()));




    public static final Block RAW_RUBY_ORE = registerBlock("raw_ruby_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(200,500),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.RED)
                            .instrument(NoteBlockInstrument.CREEPER)
                            .requiresTool()
                            .strength(1.0F, 100.0F)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block BRAINROT_GEN_ALPHA = registerBlock("gen_alpha_block",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.RED)
                            .instrument(NoteBlockInstrument.CREEPER)
                            .requiresTool()
                            .strength(1.0F, 100.0F)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block BRAINROT_GEN_Z = registerBlock("gen_z_block",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.RED)
                            .instrument(NoteBlockInstrument.CREEPER)
                            .requiresTool()
                            .strength(1.0F, 100.0F)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)));
 public static final Block BEDROK = registerBlock("bedrock1",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.RED)
                            .instrument(NoteBlockInstrument.BASS)
                            .requiresTool()
                            .strength(-1F, 3600000.0F)
                            .sounds(BlockSoundGroup.BONE)
                            .dropsNothing()
                            .allowsSpawning(Blocks::never)));
 public static final Block ANDREW_TATE = registerBlock("andrew_tate",
            new Block(
                    AbstractBlock.Settings.create().mapColor(MapColor.BRIGHT_RED).breakInstantly().sounds(BlockSoundGroup.GRASS).burnable().solidBlock(Blocks::never)
            ));

         public static final Block RUBY_TNT = registerBlock("ruby_tnt",
            new TntBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BRIGHT_RED)
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .burnable()
                            .solidBlock(Blocks::never)
                    )
            );

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Template.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(Template.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Template.LOGGER.info("Registering Mod Blocks for " + Template.MOD_ID);
    }
}
