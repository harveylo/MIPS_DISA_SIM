package com.putterfly.simulator;

public class Register {
    private static long[] registers;
    public static long getRegisterValue(int index){
        return registers[index];
    }
    public static void setRegisterValue(int index,int value){
        registers[index] = value;
    }
}
