package com.putterfly.instructions.cat3;

import com.putterfly.instructions.Command;
import com.putterfly.util.ProgramCounter;
import com.putterfly.util.Register;
import com.putterfly.util.Masks;

import java.util.LinkedList;
import java.util.List;

public class AddWord implements Command {
    private final static int category = 3;
    private final static int opCode = 0;
    private final static String name = "ADD";

    private final int rs;
    private final int rt;
    private final int rd;

    private final List<String> parameters;

    public AddWord(int instruction){
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
        long tem = (long) Register.getRegisterValue(rs)+(long) Register.getRegisterValue(rt);
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
