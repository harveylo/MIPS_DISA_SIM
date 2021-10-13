package com.putterfly.instructions.factories;

import com.putterfly.instructions.Command;
import com.putterfly.instructions.cat3.SubtractWord;

public class SubtractWordFactory implements CommandFactory{
    @Override
    public Command newCommand(int instruction) {
        return new SubtractWord(instruction);
    }
}
