package com.kjchillin.template.event;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {
    public static final String KEY_CATEGORY_TEMPLATE = "key.category.template.badmodkeybinds";
    public static final String CHAT_KEY_HELLO = "key.template.hello";

    public static KeyBinding helloKey;

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client ->{
            if(helloKey.wasPressed()) {
                client.player.sendMessage(Text.literal("Hello World"), false);
            }
        });
    }

    public static void register(){
        helloKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                CHAT_KEY_HELLO,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_O,
                KEY_CATEGORY_TEMPLATE
        ));

        registerKeyInputs();
    }
}
