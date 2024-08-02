package com.kjchillin.template.util;

import com.kjchillin.template.command.client.GamemodeAdventureCommand;
import com.kjchillin.template.command.client.GamemodeCreativeCommand;
import com.kjchillin.template.command.client.GamemodeSpectatorCommand;
import com.kjchillin.template.command.client.GamemodeSurvivalCommand;
import com.kjchillin.template.command.server.ArithmeticCalculations;
import com.kjchillin.template.command.server.CustomGiveCommand;
import com.kjchillin.template.command.server.HomeCommands;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class ModCommandCallBack {

    public static void ModCommandCalling() {
        CommandRegistrationCallback.EVENT.register(ArithmeticCalculations::registerCommands);
        CommandRegistrationCallback.EVENT.register(CustomGiveCommand::registerCommands);
        CommandRegistrationCallback.EVENT.register(GamemodeCreativeCommand::registerCommands);
        CommandRegistrationCallback.EVENT.register(GamemodeSurvivalCommand::registerCommands);
        CommandRegistrationCallback.EVENT.register(GamemodeAdventureCommand::registerCommands);
        CommandRegistrationCallback.EVENT.register(GamemodeSpectatorCommand::registerCommands);
        CommandRegistrationCallback.EVENT.register(HomeCommands::registerCommands);
    }

}
