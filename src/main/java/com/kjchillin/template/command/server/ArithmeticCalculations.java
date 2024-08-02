package com.kjchillin.template.command.server;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.text.Text;

public class ArithmeticCalculations {

    public static void registerCommands(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess registryAccess, CommandManager.RegistrationEnvironment environment) {
        dispatcher.register(
                CommandManager.literal("arithmetic")
                        .requires(source -> source.hasPermissionLevel(0))
                        .then(
                                CommandManager.literal("addition")
                                        .then(
                                                CommandManager.argument("amountaddition1", IntegerArgumentType.integer(0))
                                                        .then(
                                                                CommandManager.argument("amountaddition2", IntegerArgumentType.integer(0))
                                                                        .executes(context -> {
                                                                            int amount1 = IntegerArgumentType.getInteger(context, "amountaddition1");
                                                                            int amount2 = IntegerArgumentType.getInteger(context, "amountaddition2");
                                                                            int result = amount1 + amount2;
                                                                            context.getSource().sendFeedback(() -> Text.literal("Result: " + result), true);
                                                                            return 1;
                                                                        })
                                                        )
                                        )
                        )
                        .then(
                                CommandManager.literal("multiplication")
                                        .then(
                                                CommandManager.argument("amountmultiplication1", IntegerArgumentType.integer(0))
                                                        .then(
                                                                CommandManager.argument("amountmultiplication2", IntegerArgumentType.integer(0))
                                                                        .executes(context -> {
                                                                            int amount3 = IntegerArgumentType.getInteger(context, "amountmultiplication1");
                                                                            int amount4 = IntegerArgumentType.getInteger(context, "amountmultiplication2");
                                                                            int resultmul = amount3 * amount4;
                                                                            context.getSource().sendFeedback(() -> Text.literal("Result: " + resultmul), true);
                                                                            return 1;
                                                                        })
                                                        )
                                        )
                        )
                        .then(
                                CommandManager.literal("division")
                                        .then(
                                                CommandManager.argument("dividend", FloatArgumentType.floatArg(0))
                                                        .then(
                                                                CommandManager.argument("divisor", FloatArgumentType.floatArg(0))
                                                                        .executes(context -> {
                                                                            float amount5 = FloatArgumentType.getFloat(context, "dividend");
                                                                            float amount6 = FloatArgumentType.getFloat(context, "divisor");
                                                                            float resultdiv = amount5 / amount6;
                                                                            context.getSource().sendFeedback(() -> Text.literal("Result: " + resultdiv), true);
                                                                            return 1;
                                                                        })
                                                        )
                                        )
                        )
                        .then(
                                CommandManager.literal("substraction")
                                        .then(
                                                CommandManager.argument("substactionamount1", IntegerArgumentType.integer(0))
                                                        .then(
                                                                CommandManager.argument("substactionamount2", IntegerArgumentType.integer(0))
                                                                        .executes(context -> {
                                                                            int amount7 = IntegerArgumentType.getInteger(context, "substactionamount1");
                                                                            int amount8 = IntegerArgumentType.getInteger(context, "substactionamount2");
                                                                            float resultsub = amount7 - amount8;
                                                                            context.getSource().sendFeedback(() -> Text.literal("Result: " + resultsub), true);
                                                                            return 1;
                                                                        })
                                                        )
                                        )
                        )
        );
    }
}
