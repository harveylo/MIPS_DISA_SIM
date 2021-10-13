package com.putterfly.instructions.factories;

import com.putterfly.instructions.Command;
import com.putterfly.instructions.cat3.AddWord;

public class AddWordFactory implements CommandFactory{
    @Override
    public Command newCommand(int instruction) {
        return new AddWord(instruction);
    }
}
