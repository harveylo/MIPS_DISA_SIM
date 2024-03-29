package com.putterfly.instructions.cat1;

import com.putterfly.instructions.Command;
import com.putterfly.util.MemoryData;
import com.putterfly.util.ProgramCounter;
import com.putterfly.util.Register;

import java.util.LinkedList;
import java.util.List;

public class StoreWord implements Command {
    private static final int category = 1;
    private static final int opCode = 6;
    private static final String name = "SW";

    private final List<String> parameters;
    private final short offset;
    private final int base;
    private final int rt;

    public StoreWord(int instruction) {
        parameters = new LinkedList<>();
        base = instruction>>>21;
        rt = (instruction&0x1F0000)>>>16;
        offset = (short)(instruction&0xFFFF);
        parameters.add("R"+rt);
        parameters.add(offset+"(R"+base+")");
    }

    @Override
    public void run() {
        MemoryData.storeData(Register.getRegisterValue(base)+offset,Register.getRegisterValue(rt));
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
