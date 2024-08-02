//package com.kjchillin.template.command.client;
//
//import com.mojang.brigadier.CommandDispatcher;
//import com.mojang.brigadier.arguments.IntegerArgumentType;
//import com.mojang.brigadier.arguments.StringArgumentType;
//import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
//import net.minecraft.client.MinecraftClient;
//import net.minecraft.client.network.ClientCommandSource;
//import net.minecraft.command.CommandRegistryAccess;
//import net.minecraft.server.command.CommandManager;
//import net.minecraft.text.TranslatableTextContent;
//
//public class CustomGiveClientCommand {
//
//    public static void registerCommands(CommandDispatcher<ClientCommandSource> dispatcher, CommandRegistryAccess registryAccess) {
//        dispatcher.register(
//                CommandManager.literal("cgive")
//                        .then(
//                                CommandManager.argument("item", StringArgumentType.string())
//                                        .suggests((context, builder) -> {
//                                            builder.suggest("template:ruby");
//                                            builder.suggest("template:ruby_helmet");
//                                            // Add more item suggestions here
//                                            return builder.buildFuture();
//                                        })
//                                        .then(
//                                                CommandManager.argument("amount", IntegerArgumentType.integer(1, 64))
//                                                        .executes(context -> {
//                                                            MinecraftClient client = MinecraftClient.getInstance();
//                                                            if (client.player != null) {
//                                                                String itemName = StringArgumentType.getString(context, "item");
//                                                                int amount = IntegerArgumentType.getInteger(context, "amount");
//                                                                String commandGive = String.format("/give %s %s %d", client.player.getName().getString(), itemName, amount);
//                                                                client.player.sendMessage(new TranslatableTextContent(commandGive));
//
//                                                            }
//                                                            return 1;
//                                                        })
//                                        )
//                        )
//        );
//    }
//}
