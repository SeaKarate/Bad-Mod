package com.kjchillin.template.command.server;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;

public class CustomGiveCommand {
    public static void registerCommands(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess registryAccess, CommandManager.RegistrationEnvironment environment) {
        dispatcher.register(
                CommandManager.literal("cgive")
                        .requires(source -> source.hasPermissionLevel(0))
                        .then(
                                CommandManager.argument("item", StringArgumentType.string())
                                        .suggests((context, builder) -> {
                                            builder.suggest("ruby_block");
                                            builder.suggest("raw_ruby_block");
                                            builder.suggest("sound_block");
                                            builder.suggest("ruby_stairs");
                                            builder.suggest("ruby_button");
                                            builder.suggest("ruby_fence");
                                            builder.suggest("ruby_door");
                                            builder.suggest("raw_ruby_ore");
                                            builder.suggest("gen_alpha_block");
                                            builder.suggest("gen_z_block");
                                            builder.suggest("bedrock1");
                                            builder.suggest("andrew_tate");
                                            builder.suggest("ruby_helmet");
                                            builder.suggest("ruby_chestplate");
                                            builder.suggest("ruby_leggings");
                                            builder.suggest("ruby_boots");
                                            builder.suggest("ruby");
                                            builder.suggest("raw_ruby");
                                            builder.suggest("metal_detector");
                                            builder.suggest("tomato");
                                            builder.suggest("potato");
                                            builder.suggest("corn");
                                            builder.suggest("coal_a");
                                            builder.suggest("ruby_pickaxe");
                                            builder.suggest("ruby_axe");
                                            builder.suggest("ruby_shovel");
                                            builder.suggest("ruby_sword");
                                            builder.suggest("ruby_hoe");
                                            builder.suggest("tomato_seeds");
                                            builder.suggest("metal_detector_seeds");
                                            builder.suggest("corn_seeds");

                                            // Add more item suggestions here
                                            return builder.buildFuture();
                                        })
                                        .then(
                                                CommandManager.argument("amount", IntegerArgumentType.integer(1, 6400))
                                                        .executes(context -> {
                                                            ServerCommandSource source = context.getSource();
                                                            ServerPlayerEntity player = source.getPlayer();
                                                            String itemName = StringArgumentType.getString(context, "item");
                                                            int amount = IntegerArgumentType.getInteger(context, "amount");

                                                            source.getServer().getCommandManager().getDispatcher().execute(
                                                                    String.format("give %s template:%s %d", player.getName().getString(), itemName, amount),
                                                                    source

                                                            );
                                                            return 1;
                                                        })
                                        )
                        )
        );
    }
}
