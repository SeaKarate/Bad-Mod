package com.kjchillin.template.util;

import com.kjchillin.template.command.client.*;
import com.kjchillin.template.command.client.SayMessageCommand;
import com.kjchillin.template.command.client.ArithmeticCalculations;
import com.kjchillin.template.command.server.CustomGiveCommand;
import com.kjchillin.template.command.server.HomeCommands;

import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;

public class ModCommandCallBack {

    public static void ModCommandCalling() {
        //server
        CommandRegistrationCallback.EVENT.register(CustomGiveCommand::registerCommands);
        CommandRegistrationCallback.EVENT.register(HomeCommands::registerCommands);

        //client
        ClientCommandRegistrationCallback.EVENT.register(new SayMessageCommand());
        ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> {
                    ArithmeticCalculations.registerCommands(dispatcher);
                }
        );
        VClipCommand.register();
    }
}
