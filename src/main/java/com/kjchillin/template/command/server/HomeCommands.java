package com.kjchillin.template.command.server;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

import java.util.HashMap;
import java.util.UUID;

public class HomeCommands {
    private static final HashMap<UUID, BlockPos> homePositions = new HashMap<>();

    public static void registerCommands(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess registryAccess, CommandManager.RegistrationEnvironment environment) {
        dispatcher.register(
                CommandManager.literal("home")
                        .requires(source -> source.hasPermissionLevel(0))
                        .then(
                                CommandManager.literal("set")
                                        .executes(context -> {
                                            ServerCommandSource source = context.getSource();
                                            ServerPlayerEntity player = source.getPlayer();
                                            UUID playerUUID = player.getUuid();

                                            if (player != null) {
                                                BlockPos homePos = player.getBlockPos();

                                                if (homePositions.containsKey(playerUUID)) {
                                                    player.sendMessage(Text.literal("You already have a home position set. Use '/home remove' to remove it first."), false);
                                                } else {

                                                    player.sendMessage(Text.literal("Home position set to: " + homePos.getX() + ", " + homePos.getY() + ", " + homePos.getZ()), false);
                                                    homePositions.put(player.getUuid(), homePos);
                                                }
                                            }

                                            return 1;
                                        })
                        )
                        .then(
                                CommandManager.literal("remove")
                                        .executes(context -> {
                                            ServerCommandSource source = context.getSource();
                                            ServerPlayerEntity player = source.getPlayer();

                                            if (player != null) {
                                                UUID playerUUID = player.getUuid();
                                                if (homePositions.containsKey(playerUUID)) {
                                                    homePositions.remove(playerUUID);
                                                    player.sendMessage(Text.literal("Your home position has been removed."), false);
                                                } else {
                                                    player.sendMessage(Text.literal("You don't have a home position set."), false);
                                                }
                                            }

                                            return 1;
                                        })
                        )
                        .then(
                                CommandManager.literal("return")
                                        .executes(context -> {
                                            ServerCommandSource source = context.getSource();
                                            ServerPlayerEntity player = source.getPlayer();
                                            String PlayerName = player.getName().getString();

                                            if (player != null) {
                                                BlockPos homePos = homePositions.get(player.getUuid());
                                                if (homePos != null) {
                                                    context.getSource().getPlayer().requestTeleport(homePos.getX(), homePos.getY(), homePos.getZ());
                                                    player.sendMessage(Text.literal(PlayerName + " Returned Home"), false);
                                                } else {
                                                    player.sendMessage(Text.literal("No home position set."), false);
                                                }
                                            }

                                            return 1;
                                        })
                        )
        );
    }
}
