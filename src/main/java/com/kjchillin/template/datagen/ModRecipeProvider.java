package com.kjchillin.template.datagen;

import com.kjchillin.template.block.ModBlocks;
import com.kjchillin.template.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> RUBY_SMELTABLES = List.of(ModItems.RUBY, ModBlocks.RAW_RUBY_ORE);
    private static final List<ItemConvertible> RUBY_SMELTABLES_BLOCK = List.of(ModBlocks.RAW_RUBY_BLOCK);

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC,ModItems.RUBY, 234,10,"rubys");
        offerBlasting(exporter, RUBY_SMELTABLES_BLOCK, RecipeCategory.MISC,ModBlocks.RUBY_BLOCK,234,10,"ruby_blocks");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY,RecipeCategory.DECORATIONS,ModBlocks.RUBY_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_RUBY, 1)
                .pattern("SRS")
                .pattern("R R")
                .pattern("SRS")
                .input('S', Items.COBBLESTONE)
                .input('R', ModItems.RAW_RUBY)
                .criterion(hasItem(Items.COBBLESTONE),conditionsFromItem(Items.COBBLESTONE))
                .criterion(hasItem(ModItems.RAW_RUBY),conditionsFromItem(ModItems.RAW_RUBY))
                .offerTo(exporter, Identifier.of("ruby_crafting"));


    }
}
