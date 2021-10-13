package com.putterfly.instructions.factories;

import com.putterfly.instructions.Command;
import com.putterfly.instructions.cat3.And;

public class AndFactory implements CommandFactory{

    @Override
    public Command newCommand(int instruction) {
        return new And(instruction);
    }
}
