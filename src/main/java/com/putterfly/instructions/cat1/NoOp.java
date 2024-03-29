package com.putterfly.instructions.cat1;

import com.putterfly.instructions.Command;
import com.putterfly.util.ProgramCounter;

import java.util.LinkedList;
import java.util.List;

public class NoOp implements Command {
    private final static int category = 1;
    private final static int opCode = 11;
    private final static String name = "NOP";

    private final List<String > parameters;

    public NoOp(int instruction){
        parameters = new LinkedList<>();
    }

    @Override
    public void run() {
        ProgramCounter.advancePC(4);
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
