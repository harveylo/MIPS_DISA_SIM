package com.putterfly.disassembler.factories;

import com.putterfly.disassembler.instructions.Command;

public interface CommandFactory {
    public Command newCommand(long instruction);
}
