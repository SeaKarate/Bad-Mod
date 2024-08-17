package com.kjchillin.template.command.client;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

public class ArithmeticCalculations {

    public static void registerCommands(CommandDispatcher<FabricClientCommandSource> dispatcher) {
        dispatcher.register(
                ClientCommandManager.literal("arithmetic")
                        .then(
                                ClientCommandManager.literal("addition")
                                        .then(
                                                ClientCommandManager.argument("amountaddition1", IntegerArgumentType.integer(0))
                                                        .then(
                                                                ClientCommandManager.argument("amountaddition2", IntegerArgumentType.integer(0))
                                                                        .executes(context -> {
                                                                            int amount1 = IntegerArgumentType.getInteger(context, "amountaddition1");
                                                                            int amount2 = IntegerArgumentType.getInteger(context, "amountaddition2");
                                                                            int result = amount1 + amount2;
                                                                            sendFeedback(context.getSource(), "Result: " + result);
                                                                            return 1;
                                                                        })
                                                        )
                                        )
                        )
                        .then(
                                ClientCommandManager.literal("multiplication")
                                        .then(
                                                ClientCommandManager.argument("amountmultiplication1", IntegerArgumentType.integer(0))
                                                        .then(
                                                                ClientCommandManager.argument("amountmultiplication2", IntegerArgumentType.integer(0))
                                                                        .executes(context -> {
                                                                            int amount3 = IntegerArgumentType.getInteger(context, "amountmultiplication1");
                                                                            int amount4 = IntegerArgumentType.getInteger(context, "amountmultiplication2");
                                                                            int resultmul = amount3 * amount4;
                                                                            sendFeedback(context.getSource(), "Result: " + resultmul);
                                                                            return 1;
                                                                        })
                                                        )
                                        )
                        )
                        .then(
                                ClientCommandManager.literal("division")
                                        .then(
                                                ClientCommandManager.argument("dividend", FloatArgumentType.floatArg(0))
                                                        .then(
                                                                ClientCommandManager.argument("divisor", FloatArgumentType.floatArg(0))
                                                                        .executes(context -> {
                                                                            float amount5 = FloatArgumentType.getFloat(context, "dividend");
                                                                            float amount6 = FloatArgumentType.getFloat(context, "divisor");
                                                                            if (amount6 == 0) {
                                                                                sendFeedback(context.getSource(), "Error: Division by zero");
                                                                                return 1;
                                                                            }
                                                                            float resultdiv = amount5 / amount6;
                                                                            sendFeedback(context.getSource(), "Result: " + resultdiv);
                                                                            return 1;
                                                                        })
                                                        )
                                        )
                        )
                        .then(
                                ClientCommandManager.literal("subtraction")
                                        .then(
                                                ClientCommandManager.argument("subtractionamount1", IntegerArgumentType.integer(0))
                                                        .then(
                                                                ClientCommandManager.argument("subtractionamount2", IntegerArgumentType.integer(0))
                                                                        .executes(context -> {
                                                                            int amount7 = IntegerArgumentType.getInteger(context, "subtractionamount1");
                                                                            int amount8 = IntegerArgumentType.getInteger(context, "subtractionamount2");
                                                                            int resultsub = amount7 - amount8;
                                                                            sendFeedback(context.getSource(), "Result: " + resultsub);
                                                                            return 1;
                                                                        })
                                                        )
                                        )
                        )
        );
    }

    private static void sendFeedback(FabricClientCommandSource source, String message) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player != null) {
            client.player.sendMessage(Text.literal(message));
        }
    }
}
