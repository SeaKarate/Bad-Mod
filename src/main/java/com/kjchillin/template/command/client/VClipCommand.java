package com.kjchillin.template.command.client;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.client.MinecraftClient;

import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;

public class
VClipCommand {

    protected static <T> RequiredArgumentBuilder<FabricClientCommandSource, T> argument(final String name, final ArgumentType<T> type) {
        return RequiredArgumentBuilder.argument(name, type);
    }
    protected static
    final MinecraftClient mc = MinecraftClient.getInstance();

    public VClipCommand() {
    }

    public void build(LiteralArgumentBuilder<FabricClientCommandSource> builder) {
        builder.then(argument("blocks", DoubleArgumentType.doubleArg()).executes(context -> {

            double blocks = context.getArgument("blocks", Double.class);

            int packetsRequired = (int) Math.ceil(Math.abs(blocks / 10));

            if (packetsRequired > 20) {
                packetsRequired = 1;
            }

            for (int packetNumber = 0; packetNumber < (packetsRequired - 1); packetNumber++) {
                mc.player.networkHandler.sendPacket(new PlayerMoveC2SPacket.OnGroundOnly(true));
            }
            mc.player.networkHandler.sendPacket(new PlayerMoveC2SPacket.PositionAndOnGround(mc.player.getX(), mc.player.getY() + blocks, mc.player.getZ(), true));
            mc.player.setPosition(mc.player.getX(), mc.player.getY() + blocks, mc.player.getZ());

            return 1;
        }));
    }

    public static void register() {
        ClientCommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
            VClipCommand vClipCommand = new VClipCommand();
            LiteralArgumentBuilder<FabricClientCommandSource> command = LiteralArgumentBuilder.literal("vclip");
            vClipCommand.build(command);
            dispatcher.register(command);
        });
    }
}