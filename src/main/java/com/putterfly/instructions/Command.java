package com.putterfly.instructions;

import java.util.List;

public interface Command {
    public void run();
    public int getCat();
    public int getOpCode();
    public String getName();
    public List<String> getParameters();
}
