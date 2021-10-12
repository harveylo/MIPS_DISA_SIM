package com.putterfly.instructions.factories;

import com.putterfly.instructions.Command;
import com.putterfly.instructions.cat1.JumpRegister;

public class JumpRegisterFactory implements CommandFactory{
    @Override
    public Command newCommand(long instruction) {
        return new JumpRegister(instruction);
    }
}
