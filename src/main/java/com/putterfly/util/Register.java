package com.putterfly.util;

public class Register {
    private static int[] registers = new int[32];
    public static int getRegisterValue(int index){
        return registers[index];
    }
    public static void setRegisterValue(int index,int value){
        registers[index] = value;
    }
}
