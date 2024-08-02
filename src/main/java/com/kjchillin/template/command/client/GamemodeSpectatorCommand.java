package com.kjchillin.template.command.client;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;

public class GamemodeSpectatorCommand {

    public static void registerCommands(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess registryAccess, CommandManager.RegistrationEnvironment environment) {
        dispatcher.register(
                CommandManager.literal("gmsp")
                        .requires(source -> source.hasPermissionLevel(0))
                        .executes(context -> {
                            ServerCommandSource source = context.getSource();
                            ServerPlayerEntity player = source.getPlayer();

                            // Corrected command
                            String command = String.format("gamemode spectator %s", player.getName().getString());

                            // Execute the command on the server
                            source.getServer().getCommandManager().getDispatcher().execute(command, source);

                            return 1;
                        })
        );
    }
}
