package com.putterfly.disassembler.factories;

import com.putterfly.disassembler.instructions.Command;
import com.putterfly.disassembler.instructions.cat1.BranchLessZero;

public class BranchLessZeroFactory implements CommandFactory{
    @Override
    public Command newCommand(long instruction) {
        return new BranchLessZero(instruction);
    }
}
