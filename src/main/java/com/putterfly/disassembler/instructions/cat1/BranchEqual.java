package com.putterfly.disassembler.instructions.cat1;

import com.putterfly.disassembler.instructions.Command;
import com.putterfly.simulator.ProgramCounter;
import com.putterfly.simulator.Register;

import java.util.LinkedList;
import java.util.List;

public class BranchEqual implements Command {
    private static final int category = 1;
    private static final int opCode = 2;
    private static final String name = "BEQ";

    private List<String> parameters;

    private int rs;
    private int rt;
    private long offset;

    public BranchEqual(){
        parameters = new LinkedList<>();
    }
    public BranchEqual(long instruction){
        parameters = new LinkedList<>();
        rs = (int)(instruction>>>21);
        rt = (int)((instruction&0x1F0000)>>>16);
        offset = (instruction&0xffff)<<2;
        parameters.add("R"+rs);
        parameters.add("R"+rt);
        parameters.add("#"+offset);
    }

    @Override
    public void run() {
        if(Register.getRegisterValue(rs)==Register.getRegisterValue(rt)){
            ProgramCounter.advancePC(4+offset);
        }else ProgramCounter.advancePC(4L);
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
