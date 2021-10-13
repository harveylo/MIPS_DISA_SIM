package com.putterfly.instructions.factories;

import com.putterfly.instructions.Command;
import com.putterfly.instructions.cat3.ExclusiveOr;

public class ExclusiveOrFactory implements CommandFactory{
    @Override
    public Command newCommand(int instruction) {
        return new ExclusiveOr(instruction);
    }
}
