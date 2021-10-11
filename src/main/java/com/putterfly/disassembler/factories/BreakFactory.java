package com.putterfly.disassembler.factories;

import com.putterfly.disassembler.instructions.Command;
import com.putterfly.disassembler.instructions.cat1.Break;

public class BreakFactory implements CommandFactory{
    @Override
    public Command newCommand(long instruction) {
        return new Break(instruction);
    }
}
