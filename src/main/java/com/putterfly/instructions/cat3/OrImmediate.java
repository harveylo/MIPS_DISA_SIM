package com.putterfly.instructions.cat3;

import com.putterfly.instructions.Command;
import com.putterfly.util.ProgramCounter;
import com.putterfly.util.Register;
import com.putterfly.util.Masks;

import java.util.LinkedList;
import java.util.List;

public class OrImmediate implements Command {
    private final static int category = 3;
    private final static int opCode = 10;
    private final static String name = "ORI";

    private final int rs;
    private final int rt;
    private final int immediate;

    private final List<String> parameters;

    public OrImmediate(int instruction){
        parameters = new LinkedList<>();
        rs = instruction>>>21;
        rt = (instruction& Masks.register2)>>>16;
        immediate = instruction&0xFFFF;
        parameters.add("R"+rt);
        parameters.add("R"+rs);
        parameters.add("#"+immediate);
    }

    @Override
    public void run() {
        Register.setRegisterValue(rt,Register.getRegisterValue(rs)|immediate);
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
