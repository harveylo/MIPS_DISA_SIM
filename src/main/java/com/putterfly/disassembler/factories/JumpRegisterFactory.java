package com.putterfly.disassembler.factories;

import com.putterfly.disassembler.instructions.Command;
import com.putterfly.disassembler.instructions.cat1.JumpRegister;

public class JumpRegisterFactory implements CommandFactory{
    @Override
    public Command newCommand(long instruction) {
        return new JumpRegister(instruction);
    }
}
