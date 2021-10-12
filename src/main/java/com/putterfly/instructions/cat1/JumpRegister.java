package com.putterfly.instructions.cat1;

import com.putterfly.instructions.Command;
import com.putterfly.simulator.ProgramCounter;
import com.putterfly.simulator.Register;

import java.util.LinkedList;
import java.util.List;

public class JumpRegister implements Command {
    private static final int category = 1;
    private static final int opCode = 1;
    private static final String name = "JR";


    private int jumpRegister;
    private List<String> parameters;

    public JumpRegister(){
        parameters = new LinkedList<>();
        jumpRegister = 0;
    }
    public JumpRegister(long instruction){
        parameters = new LinkedList<>();
        jumpRegister = (int)(instruction>>>21);
        parameters.add("R"+jumpRegister);
    }

    @Override
    public void run() {
        ProgramCounter.setPC(Register.getRegisterValue(jumpRegister));
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
