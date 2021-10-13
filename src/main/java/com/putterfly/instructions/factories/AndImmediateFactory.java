package com.putterfly.instructions.factories;

import com.putterfly.instructions.Command;
import com.putterfly.instructions.cat3.AndImmediate;

public class AndImmediateFactory implements CommandFactory{
    @Override
    public Command newCommand(int instruction) {
        return  new AndImmediate(instruction);
    }
}
