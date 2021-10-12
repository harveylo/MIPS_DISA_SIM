package com.putterfly.instructions.factories;

import com.putterfly.instructions.Command;
import com.putterfly.instructions.cat1.BranchLessZero;

public class BranchLessZeroFactory implements CommandFactory{
    @Override
    public Command newCommand(int instruction) {
        return new BranchLessZero(instruction);
    }
}
