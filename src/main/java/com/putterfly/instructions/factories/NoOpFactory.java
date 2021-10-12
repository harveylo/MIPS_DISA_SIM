package com.putterfly.instructions.factories;

import com.putterfly.instructions.Command;
import com.putterfly.instructions.cat1.NoOp;

public class NoOpFactory implements CommandFactory{
    @Override
    public Command newCommand(int instruction) {
        return new NoOp(instruction);
    }
}
