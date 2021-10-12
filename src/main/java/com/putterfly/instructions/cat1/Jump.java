package com.putterfly.instructions.cat1;

import com.putterfly.instructions.Command;
import com.putterfly.simulator.ProgramCounter;

import java.util.LinkedList;
import java.util.List;

public class Jump implements Command {
    private static final int category = 1;
    private static final int opCode = 0;
    private static final String name = "J";

    private List<String> parameters;


    private int jumpAddress;


    public Jump(){
        parameters = new LinkedList<>();
        jumpAddress = 256;
    }
    public Jump(int instruction){
        parameters = new LinkedList<>();
        int higher = (ProgramCounter.getPC()+4)&0xf0000000;
        int rest = instruction<<2;
        jumpAddress = rest | higher;
        parameters.add("#"+jumpAddress);
    }

    @Override
    public void run() {
        ProgramCounter.setPC(jumpAddress);
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
