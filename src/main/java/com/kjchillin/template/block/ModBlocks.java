package com.kjchillin.template.block;

import com.kjchillin.template.Template;
import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.register;

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(
                    AbstractBlock.Settings.create()
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
                            .strength(1.0F, 100.0F)
                            .sounds(BlockSoundGroup.BONE)));

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
