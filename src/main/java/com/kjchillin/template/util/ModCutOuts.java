package com.kjchillin.template.util;

import com.kjchillin.template.Template;
import com.kjchillin.template.block.ModBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ModCutOuts {

        public static void registerCutOuts() {

            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUBY_DOOR, RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUBY_TRAPDOOR, RenderLayer.getCutout());

            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TOMATO_CROP, RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.METAL_DETECTOR_CROP, RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CORN_CROP, RenderLayer.getCutout());

            Template.LOGGER.info("Registered Mod Fuel Items For " + Template.MOD_ID);
        }

}
