package com.putterfly.util;

import com.putterfly.instructions.Command;

import java.util.HashMap;
import java.util.Map;

public class MemoryCommand {
    private static final Map<Integer, Command> commandMap = new HashMap<>();

    public static void putCommand(int address,Command command){
        commandMap.put(address,command);
    }
    public static Command getCommand(int address){
        return commandMap.get(address);
    }
}
