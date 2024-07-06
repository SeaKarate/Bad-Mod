package com.kjchillin.template.item;

import com.kjchillin.template.Template;
import com.kjchillin.template.item.custom.MetalDetectorItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new Item.Settings()));
    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new Item.Settings().maxDamage(300000).maxCount(1)));
    public static final Item TOMATO = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.TOMATO)));
    public static final Item POTATO = registerItem("potato", new Item(new Item.Settings().food(ModFoodComponents.POTATO)));

    public static final Item COAL_A = registerItem("coal_a", new Item(new Item.Settings()));

        public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new PickaxeItem(ModToolMaterial.RUBY, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.RUBY,500f,0.1f))));
        public static final Item RUBY_AXE = registerItem("ruby_axe",
            new AxeItem(ModToolMaterial.RUBY, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.RUBY,500f,0.1f))));
        public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterial.RUBY, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.RUBY,500f,0.1f))));
        public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(ModToolMaterial.RUBY, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.RUBY,500f,0.1f))));
        public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new HoeItem(ModToolMaterial.RUBY, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterial.RUBY,500f,0.1f))));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Template.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Template.LOGGER.info("Registering Mod Items For" + Template.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
