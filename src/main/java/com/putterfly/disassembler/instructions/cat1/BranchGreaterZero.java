package com.putterfly.disassembler.instructions.cat1;

import com.putterfly.disassembler.instructions.Command;
import com.putterfly.simulator.ProgramCounter;

import java.util.LinkedList;
import java.util.List;

public class BranchGreaterZero implements Command {
    private static final int category = 1;
    private static final int opCode = 4;
    private static final String name = "BGTZ";

    private final List<String> parameters;

    private final int rs;
    private final long offset;

    public BranchGreaterZero(long instruction) {
        parameters = new LinkedList<>();
        rs = (int)(instruction>>>21);
        offset = instruction&0xffff;
        parameters.add("R"+rs);
        parameters.add("#"+offset);
    }


    @Override
    public void run() {
        if(rs>0) ProgramCounter.advancePC(4L+offset);
        else ProgramCounter.advancePC(4L);
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
