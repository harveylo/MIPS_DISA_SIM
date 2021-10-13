package com.putterfly.instructions.cat3;

import com.putterfly.instructions.Command;
import com.putterfly.simulator.ProgramCounter;
import com.putterfly.simulator.Register;
import com.putterfly.util.Masks;

import java.util.LinkedList;
import java.util.List;

public class AddImmediate implements Command {
    private final static int category = 3;
    private final static int opCode = 8;
    private final static String name = "ANDI";

    private final int rs;
    private final int rt;
    private final short immediate;

    private final List<String> parameters;

    public AddImmediate(int instruction){
        parameters = new LinkedList<>();
        rs = instruction>>>21;
        rt = (instruction& Masks.register2)>>>16;
        immediate = (short)(instruction&0xFFFF);
        parameters.add("R"+rt);
        parameters.add("R"+rs);
        parameters.add("#"+immediate);
    }

    @Override
    public void run() {
        long result = (long)Register.getRegisterValue(rs)+immediate;
        if(!(result>Integer.MAX_VALUE|result<Integer.MIN_VALUE)) Register.setRegisterValue(rt,(int)result);
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
