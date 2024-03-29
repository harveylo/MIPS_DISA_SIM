package com.putterfly.instructions.cat1;

import com.putterfly.instructions.Command;
import com.putterfly.util.ProgramCounter;

import java.util.LinkedList;
import java.util.List;

public class Break implements Command {
    private static final int category = 1;
    private static final int opCode = 5;
    private static final String name = "BREAK";

    private final List<String> parameters;

    public Break(int instruction){
        parameters = new LinkedList<>();
    }
    @Override
    public void run() {
        ProgramCounter.setPC(-1);
    }

    @Override
    public int getCat() {
        return category;
    }

    @Override
    public int getOpCode() {
        return opCode;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<String> getParameters() {
        return parameters;
    }
}
