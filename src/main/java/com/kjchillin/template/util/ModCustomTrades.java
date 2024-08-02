package com.kjchillin.template.util;

import com.kjchillin.template.item.ModItems;
import com.kjchillin.template.villager.ModVillagers;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;

import java.util.Optional;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 2),
                            Optional.empty(), // No secondary traded item
                            new ItemStack(ModItems.TOMATO_SEEDS, 10),
                            6, 10, 0.05f));

                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 2),
                            Optional.empty(), // No secondary traded item
                            new ItemStack(ModItems.CORN_SEEDS, 10),
                            6, 10, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            Optional.empty(), // No secondary traded item
                            new ItemStack(ModItems.TOMATO_SEEDS, 30),
                            6, 10, 0.5f));

                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            Optional.of(new TradedItem(Items.WATER_BUCKET, 1)),
                            new ItemStack(ModItems.CORN_SEEDS, 50),
                            6, 10, 0.85f));
                });
//        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 2,
//                factories -> {
//                    factories.add((entity, random) -> new TradeOffer(
//                            new TradedItem(Items.EMERALD, 3),
//                            Optional.empty(), // No secondary traded item
//                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.PIERCING, 2)),
//                            6, 10, 0.5f));
//                });
        TradeOfferHelper.registerWanderingTraderOffers(1,//common trades
                factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(ModItems.RAW_RUBY, 20),
                    new ItemStack(ModItems.METAL_DETECTOR,1 ),
                    2,12,2));
                });

        TradeOfferHelper.registerWanderingTraderOffers(2, //rare trades
                factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new TradedItem(ModItems.RAW_RUBY, 1),
                    new ItemStack(ModItems.METAL_DETECTOR,1),
                    5,12,2));
                });
    }
}
