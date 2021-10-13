package com.putterfly.instructions.factories;

import com.putterfly.instructions.Command;
import com.putterfly.instructions.cat3.MultiplyWord;

public class MultiplyWordFactory implements CommandFactory{
    @Override
    public Command newCommand(int instruction) {
        return new MultiplyWord(instruction);
    }
}
