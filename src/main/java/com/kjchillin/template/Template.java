package com.kjchillin.template;

import com.kjchillin.template.ModFuels.ModFuelClass;
import com.kjchillin.template.block.ModBlocks;
import com.kjchillin.template.item.ModGroupItems;
import com.kjchillin.template.item.ModItems;
import net.fabricmc.api.ModInitializer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Template implements ModInitializer {
	public static final String MOD_ID = "template";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModGroupItems.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModFuelClass.registerModFuels();

	}
}