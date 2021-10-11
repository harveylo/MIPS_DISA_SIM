package com.putterfly.disassembler.factories;

import com.putterfly.disassembler.instructions.Command;
import com.putterfly.disassembler.instructions.cat1.StoreWord;

public class StoreWordFactory implements CommandFactory{
    @Override
    public Command newCommand(long instruction) {
        return new StoreWord(instruction);
    }
}
