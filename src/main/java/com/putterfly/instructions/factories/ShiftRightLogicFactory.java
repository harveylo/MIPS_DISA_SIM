package com.putterfly.instructions.factories;

import com.putterfly.instructions.Command;
import com.putterfly.instructions.cat1.ShiftRightLogic;

public class ShiftRightLogicFactory implements CommandFactory{
    @Override
    public Command newCommand(int instruction) {
        return new ShiftRightLogic(instruction);
    }
}
