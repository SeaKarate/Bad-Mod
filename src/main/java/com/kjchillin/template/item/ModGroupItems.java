package com.kjchillin.template.item;

import com.kjchillin.template.Template;
import com.kjchillin.template.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModGroupItems {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Template.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.METAL_DETECTOR);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModBlocks.BRAINROT_GEN_Z);
                        entries.add(ModBlocks.BRAINROT_GEN_ALPHA);
                        entries.add(ModBlocks.BEDROK);
                        entries.add(ModBlocks.ANDREW_TATE);
                        entries.add(ModBlocks.RAW_RUBY_ORE);
                        entries.add(ModBlocks.SOUND_BLOCK);
                        entries.add(ModBlocks.RUBY_DOOR);
                        entries.add(ModBlocks.RUBY_STAIRS);
                        entries.add(ModBlocks.RUBY_BUTTON);
                        entries.add(ModBlocks.RUBY_SLAB);
                        entries.add(ModBlocks.RUBY_PRESSURE_PLATE);
                        entries.add(ModBlocks.RUBY_FENCE);
                        entries.add(ModBlocks.RUBY_FENCE_GATE);
                        entries.add(ModBlocks.RUBY_WALL);
                        entries.add(ModBlocks.RUBY_TRAPDOOR);

                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.POTATO);
                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_HOE);

                        entries.add(ModItems.COAL_A);

                        entries.add(ModItems.TOMATO_SEEDS);
                        entries.add(ModItems.METAL_DETECTOR_SEEDS);
                        entries.add(ModItems.CORN_SEEDS);
                        entries.add(ModItems.CORN);

                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_BOOTS);

                    }).build());


    public static void registerItemGroups() {
        Template.LOGGER.info("Registering Item Groups for " + Template.MOD_ID);
    }
}
