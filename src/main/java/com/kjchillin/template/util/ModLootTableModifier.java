//package com.kjchillin.template.util;
//
//import com.kjchillin.template.item.ModItems;
//import net.fabricmc.fabric.api.biome.v1.BiomeModification;
//import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
//import net.minecraft.block.Blocks;
//import net.minecraft.item.Items;
//import net.minecraft.loot.LootPool;
//import net.minecraft.loot.LootTable;
//import net.minecraft.loot.condition.RandomChanceLootCondition;
//import net.minecraft.loot.condition.SurvivesExplosionLootCondition;
//import net.minecraft.loot.entry.ItemEntry;
//import net.minecraft.loot.function.SetCountLootFunction;
//import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
//import net.minecraft.loot.provider.number.UniformLootNumberProvider;
//import net.minecraft.util.Identifier;
//
//public class ModLootTableModifier {
//    private static final Identifier JUNGLE_TEMPLE_ID =
//            Identifier.of("minecraft", "chests/jungle_temple");
//    private static final Identifier CREEPER_ID =
//            Identifier.of("minecraft", "entities/creeper");
//
//    public static void modifyLootTables() {
//        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
//            if (JUNGLE_TEMPLE_ID.equals(id)) {
//                LootPool.Builder pool = LootPool.builder()
//                        .rolls(ConstantLootNumberProvider.create(1))
//                        .conditionally(RandomChanceLootCondition.builder(1f)) // Drops 100% of the time
//                        .with(ItemEntry.builder(ModItems.METAL_DETECTOR))
//                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
//
//                tableBuilder.pool(pool);
//            }
//
//            if (CREEPER_ID.equals(id)) {
//                LootPool.Builder pool = LootPool.builder()
//                        .rolls(ConstantLootNumberProvider.create(1))
//                        .conditionally(RandomChanceLootCondition.builder(1f))
//                        .with(ItemEntry.builder(ModItems.COAL_A))
//                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
//
//                tableBuilder.pool(pool);
//            }
//        });
//    }
//}