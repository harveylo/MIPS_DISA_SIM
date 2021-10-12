package com.putterfly.instructions.cat1;

import com.putterfly.instructions.Command;
import com.putterfly.simulator.ProgramCounter;
import com.putterfly.simulator.Register;

import java.util.LinkedList;
import java.util.List;

public class ShiftLeftLogic implements Command {
    private static final int category = 1;
    private static final int opCode = 8;
    private static final String name = "SLL";

    private final List<String> parameters;
    private final int rt;
    private final int rd;
    private final int sa;

    public ShiftLeftLogic(int instruction){
        parameters = new LinkedList<>();
        rt = (instruction&0x1F0000)>>>16;
        rd = (instruction&0xF800)>>>11;
        sa = (instruction&0x7C0)>>>6;
        parameters.add("R"+rd);
        parameters.add("R"+rt);
        parameters.add("#"+sa);
    }


    @Override
    public void run() {
        Register.setRegisterValue(rd,Register.getRegisterValue(rt)<<sa);
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
