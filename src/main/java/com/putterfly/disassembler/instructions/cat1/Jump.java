package com.putterfly.disassembler.instructions.cat1;

import com.putterfly.disassembler.instructions.Command;
import com.putterfly.simulator.ProgramCounter;

import java.util.LinkedList;
import java.util.List;

public class Jump implements Command {
    private static final int category = 1;
    private static final int opCode = 0;
    private static final String name = "J";

    private List<String> parameters;


    private long jumpAddress;


    public Jump(){
        parameters = new LinkedList<>();
        jumpAddress = 256;
    }
    public Jump(long instruction){
        parameters = new LinkedList<>();
        long higher = (ProgramCounter.getPC()+4L)&0xf0000000;
        long rest = instruction<<2;
        jumpAddress = instruction | higher;
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
