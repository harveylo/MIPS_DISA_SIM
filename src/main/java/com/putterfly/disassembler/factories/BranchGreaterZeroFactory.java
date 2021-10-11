package com.putterfly.disassembler.factories;

import com.putterfly.disassembler.instructions.Command;
import com.putterfly.disassembler.instructions.cat1.BranchGreaterZero;

public class BranchGreaterZeroFactory implements CommandFactory{
    @Override
    public Command newCommand(long instruction) {
        return new BranchGreaterZero(instruction);
    }
}
