package com.putterfly.instructions.factories;

import com.putterfly.instructions.Command;
import com.putterfly.instructions.cat1.Jump;

public class JumpFactory implements CommandFactory {
    @Override
    public Command newCommand(int instruction) {
        return new Jump(instruction);
    }
}
