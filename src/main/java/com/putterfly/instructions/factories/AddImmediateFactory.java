package com.putterfly.instructions.factories;

import com.putterfly.instructions.Command;
import com.putterfly.instructions.cat3.AddImmediate;

public class AddImmediateFactory implements CommandFactory{
    @Override
    public Command newCommand(int instruction) {
        return new AddImmediate(instruction);
    }
}
