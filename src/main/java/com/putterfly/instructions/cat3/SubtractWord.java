package com.putterfly.instructions.cat3;

import com.putterfly.instructions.Command;
import com.putterfly.simulator.ProgramCounter;
import com.putterfly.simulator.Register;
import com.putterfly.util.Masks;

import java.util.LinkedList;
import java.util.List;

public class SubtractWord implements Command {
    private static final int category = 3;
    private static final int opCode = 1;
    private static final String name = "SUB";

    private final int rs;
    private final int rt;
    private final int rd;

    private final List<String> parameters;

    public SubtractWord(int instruction){
        parameters = new LinkedList<>();
        rs = instruction>>>21;
        rt = (instruction& Masks.register2)>>>16;
        rd = (instruction&Masks.register3)>>>11;
        parameters.add("R"+rd);
        parameters.add("R"+rs);
        parameters.add("R"+rt);
    }

    @Override
    public void run() {
        long tem = (long) Register.getRegisterValue(rs)-(long) Register.getRegisterValue(rt);
        if(!(tem>Integer.MAX_VALUE||tem<Integer.MIN_VALUE)) Register.setRegisterValue(rd,(int)tem);
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
