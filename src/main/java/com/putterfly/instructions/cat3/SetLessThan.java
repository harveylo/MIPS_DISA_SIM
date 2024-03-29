package com.putterfly.instructions.cat3;

import com.putterfly.instructions.Command;
import com.putterfly.util.ProgramCounter;
import com.putterfly.util.Register;
import com.putterfly.util.Masks;

import java.util.LinkedList;
import java.util.List;

public class SetLessThan implements Command {
    private final static int category = 3;
    private final static int opCode = 7;
    private final static String name = "SLT";

    private final int rs;
    private final int rt;
    private final int rd;

    private final List<String> parameters;

    public SetLessThan(int instruction){
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
        int left = Register.getRegisterValue(rs);
        int right = Register.getRegisterValue(rt);
        if(left<right) Register.setRegisterValue(rd,1);
        else Register.setRegisterValue(rd,0);
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
