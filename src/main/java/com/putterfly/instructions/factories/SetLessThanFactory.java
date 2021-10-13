package com.putterfly.instructions.factories;

import com.putterfly.instructions.Command;
import com.putterfly.instructions.cat3.SetLessThan;

public class SetLessThanFactory implements CommandFactory{
    @Override
    public Command newCommand(int instruction) {
        return new SetLessThan(instruction);
    }
}
