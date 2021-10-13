package com.putterfly.instructions.factories;

import com.putterfly.instructions.Command;
import com.putterfly.instructions.cat3.ExclusiveOrImmediate;

public class ExclusiveOrImmediateFactory implements CommandFactory {
    @Override
    public Command newCommand(int instruction) {
        return new ExclusiveOrImmediate(instruction);
    }
}
