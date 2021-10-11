package com.putterfly.simulator;

public class ProgramCounter {
    private static long pc;

    public static long getPC(){
        return pc;
    }

    public static void setPC(long address){
        pc = address;
    }

    public static void advancePC(long offset){
        pc += offset;
    }
}
