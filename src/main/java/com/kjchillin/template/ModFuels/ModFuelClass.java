package com.kjchillin.template.ModFuels;

import com.kjchillin.template.Template;
import com.kjchillin.template.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModFuelClass {

    public static void registerModFuels() {
        FuelRegistry.INSTANCE.add(ModItems.COAL_A, 1600);

        Template.LOGGER.info("Registered Mod Fuel Items For " + Template.MOD_ID);
    }
}
