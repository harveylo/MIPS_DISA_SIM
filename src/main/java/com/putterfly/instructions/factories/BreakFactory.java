package com.putterfly.instructions.factories;

import com.putterfly.instructions.Command;
import com.putterfly.instructions.cat1.Break;

public class BreakFactory implements CommandFactory{
    @Override
    public Command newCommand(long instruction) {
        return new Break(instruction);
    }
}
