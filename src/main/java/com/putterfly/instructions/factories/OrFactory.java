package com.putterfly.instructions.factories;

import com.putterfly.instructions.Command;
import com.putterfly.instructions.cat3.Or;

public class OrFactory implements CommandFactory{
    @Override
    public Command newCommand(int instruction) {
        return new Or(instruction);
    }
}
