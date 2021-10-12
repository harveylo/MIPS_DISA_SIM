package com.putterfly.instructions.factories;

import com.putterfly.instructions.Command;
import com.putterfly.instructions.cat1.BranchEqual;

public class BranchEqualFactory implements CommandFactory{
    @Override
    public Command newCommand(long instruction) {
        return new BranchEqual(instruction);
    }
}
