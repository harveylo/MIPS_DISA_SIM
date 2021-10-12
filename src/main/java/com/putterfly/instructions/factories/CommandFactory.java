package com.putterfly.instructions.factories;

import com.putterfly.instructions.Command;

public interface CommandFactory {
    public Command newCommand(long instruction);
}
