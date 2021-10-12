package com.putterfly.instructions.factories;

import com.putterfly.instructions.Command;
import com.putterfly.instructions.cat1.BranchGreaterZero;

public class BranchGreaterZeroFactory implements CommandFactory{
    @Override
    public Command newCommand(int instruction) {
        return new BranchGreaterZero(instruction);
    }
}
