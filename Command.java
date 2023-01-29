package com.codurance.training.tasks;
import java.util.HashMap;
import java.util.Map;

public enum Command {
    QUIT("quit"),
    SHOW("show"),
    ADD("add"),
    CHECK("check"),
    UNCHECK("uncheck"),
    HELP("help");

    private final String name;

    Command(String name) {
        this.name = name;
    }
    protected static final Map<String, Command> COMMANDS;

    static {
        Map<String, Command> commands = new HashMap<>();
        for (Command command : values()) {
            commands.put(command.name, command);
        }
        COMMANDS = commands;
    }
}
