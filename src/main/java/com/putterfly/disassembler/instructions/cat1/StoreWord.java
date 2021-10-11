package com.putterfly.disassembler.instructions.cat1;

import com.putterfly.disassembler.instructions.Command;
import com.putterfly.simulator.MemoryData;
import com.putterfly.simulator.ProgramCounter;
import com.putterfly.simulator.Register;

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

    public StoreWord(long instruction) {
        parameters = new LinkedList<>();
        base = (int)(instruction>>>21);
        rt = (int)((instruction&0x1F0000)>>>16);
        offset = (short)(instruction&0xFFFF);
        parameters.add("R"+rt);
        parameters.add(offset+"(R"+base+")");
    }

    @Override
    public void run() {
        MemoryData.storeData(Register.getRegisterValue(base)+offset, (int) Register.getRegisterValue(rt));
        ProgramCounter.advancePC(4L);
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
