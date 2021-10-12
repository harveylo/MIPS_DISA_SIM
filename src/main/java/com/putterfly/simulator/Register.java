package com.putterfly.simulator;

public class Register {
    private static int[] registers;
    public static int getRegisterValue(int index){
        return registers[index];
    }
    public static void setRegisterValue(int index,int value){
        registers[index] = value;
    }
}
