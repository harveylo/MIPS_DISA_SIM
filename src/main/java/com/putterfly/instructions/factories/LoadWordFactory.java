package com.putterfly.instructions.factories;


import com.putterfly.instructions.Command;
import com.putterfly.instructions.cat1.LoadWord;

public class LoadWordFactory implements CommandFactory{
    @Override
    public Command newCommand(int instruction) {
        return new LoadWord(instruction);
    }
}
