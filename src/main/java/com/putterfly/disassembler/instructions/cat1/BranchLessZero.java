package com.putterfly.disassembler.instructions.cat1;

import com.putterfly.disassembler.instructions.Command;
import com.putterfly.simulator.ProgramCounter;
import com.putterfly.simulator.Register;

import java.util.LinkedList;
import java.util.List;

public class BranchLessZero implements Command {
    private static final int category = 1;
    private static final int opCode = 3;
    private static final String name = "BLTZ";

    private final List<String> parameters;

    private final int rs;
    private final long offset;

    public BranchLessZero(long instruction){
        parameters = new LinkedList<>();
        rs = (int)(instruction>>>21);
        offset = instruction&0xffff;
        parameters.add("R"+rs);
        parameters.add("#"+offset);
    }

    @Override
    public void run() {
        if(Register.getRegisterValue(rs)<0) ProgramCounter.advancePC(offset+4L);
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