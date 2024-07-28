//package com.kjchillin.template.command;
//
//import com.mojang.brigadier.CommandDispatcher;
//import com.mojang.brigadier.context.CommandContext;
//import com.mojang.brigadier.exceptions.CommandSyntaxException;
//import net.minecraft.server.command.CommandManager;
//import net.minecraft.server.command.ServerCommandSource;
//
//public class GoHome {
//    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated) {
//        dispatcher.register(CommandManager.literal("home").then(CommandManager.literal("return").executes(GoHome::run)));
//    }
//
//    private static int run(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
//        IEntityDataSaver player = (IEntityDataSaver)context.getSource().getPlayer();
//
//        //not 0 means it contains SOMETHING
//        int[] homepos = player.
//    }
//}
