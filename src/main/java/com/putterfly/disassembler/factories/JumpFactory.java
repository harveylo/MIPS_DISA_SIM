package com.putterfly.disassembler.factories;

import com.putterfly.disassembler.instructions.Command;
import com.putterfly.disassembler.instructions.cat1.Jump;

public class JumpFactory implements CommandFactory {
    @Override
    public Command newCommand(long instruction) {
        return new Jump(instruction);
    }
}
