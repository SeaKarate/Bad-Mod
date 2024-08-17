package com.kjchillin.template.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import net.minecraft.client.MinecraftClient;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.command.CommandSource;
import net.minecraft.registry.BuiltinRegistries;
import net.minecraft.server.command.CommandManager;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Command {

    public static String nameToTitle(String name) {
        return Arrays.stream(name.split("-")).map(StringUtils::capitalize).collect(Collectors.joining(" "));
    }

    protected static final CommandRegistryAccess REGISTRY_ACCESS = CommandManager.createRegistryAccess(BuiltinRegistries.createWrapperLookup());
    protected static final int SINGLE_SUCCESS = com.mojang.brigadier.Command.SINGLE_SUCCESS;
    protected static final MinecraftClient mc = MinecraftClient.getInstance();

    private final String name;
    private final String title;
    private final String description;
    private final List<String> aliases;

    public Command(String name, String description, String... aliases) {
        this.name = name;
        this.title = nameToTitle(name);
        this.description = description;
        this.aliases = List.of(aliases);
    }

    // Helper methods to painlessly infer the CommandSource generic type argument
    protected static <T> RequiredArgumentBuilder<CommandSource, T> argument(final String name, final ArgumentType<T> type) {
        return RequiredArgumentBuilder.argument(name, type);
    }

    protected static LiteralArgumentBuilder<CommandSource> literal(final String name) {
        return LiteralArgumentBuilder.literal(name);
    }

    public final void registerTo(CommandDispatcher<CommandSource> dispatcher) {
        register(dispatcher, name);
        for (String alias : aliases) register(dispatcher, alias);
    }

    public void register(CommandDispatcher<CommandSource> dispatcher, String name) {
        LiteralArgumentBuilder<CommandSource> builder = LiteralArgumentBuilder.literal(name);

        dispatcher.register(builder);
    }
}
