package com.putterfly.disassembler.factories;

import com.putterfly.disassembler.instructions.Command;
import com.putterfly.disassembler.instructions.cat1.BranchEqual;

public class BranchEqualFactory implements CommandFactory{
    @Override
    public Command newCommand(long instruction) {
        return new BranchEqual(instruction);
    }
}
