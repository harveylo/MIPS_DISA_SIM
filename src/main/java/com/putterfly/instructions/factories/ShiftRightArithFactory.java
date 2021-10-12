package com.putterfly.instructions.factories;

import com.putterfly.instructions.Command;
import com.putterfly.instructions.cat1.ShiftRightArith;

public class ShiftRightArithFactory implements CommandFactory{
    @Override
    public Command newCommand(int instruction) {
        return new ShiftRightArith(instruction);
    }
}
