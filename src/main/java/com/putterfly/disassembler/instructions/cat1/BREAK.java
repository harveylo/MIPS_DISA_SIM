package com.putterfly.disassembler.instructions.cat1;

import com.putterfly.disassembler.instructions.Command;

import java.util.List;

public class BREAK implements Command {
    @Override
    public void run() {

    }

    @Override
    public int getCat() {
        return 0;
    }

    @Override
    public int getOpCode() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public List<String> getParameters() {
        return null;
    }
}
