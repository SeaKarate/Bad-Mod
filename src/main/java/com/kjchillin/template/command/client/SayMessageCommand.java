package com.kjchillin.template.command.client;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.client.MinecraftClient;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.text.Text;

public class SayMessageCommand implements ClientCommandRegistrationCallback {
    @Override
    public void register(CommandDispatcher<FabricClientCommandSource> dispatcher, CommandRegistryAccess registryAccess) {
        dispatcher.register(
                ClientCommandManager.literal("csay")
                        .then(
                                ClientCommandManager.argument("message", StringArgumentType.greedyString())
                                        .executes(context -> {
                                            MinecraftClient client = MinecraftClient.getInstance();
                                            String message = StringArgumentType.getString(context, "message");

                                            if (client.player != null) {
                                                client.player.sendMessage(Text.literal(message));
                                            }

                                            return 1;
                                        })
                        )
        );
    }
}
