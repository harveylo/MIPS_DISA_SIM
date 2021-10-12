package com.putterfly.instructions.factories;

import com.putterfly.instructions.Command;
import com.putterfly.instructions.cat1.ShiftLeftLogic;

public class ShiftLeftLogicFactory implements CommandFactory{
    @Override
    public Command newCommand(int instruction) {
        return new ShiftLeftLogic(instruction);
    }
}
