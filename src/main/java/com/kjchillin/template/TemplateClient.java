package com.kjchillin.template;

import com.kjchillin.template.event.KeyInputHandler;
import com.kjchillin.template.util.ModCutOuts;
import net.fabricmc.api.ClientModInitializer;

public class TemplateClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ModCutOuts.registerCutOuts();
        KeyInputHandler.register();

    }
}
