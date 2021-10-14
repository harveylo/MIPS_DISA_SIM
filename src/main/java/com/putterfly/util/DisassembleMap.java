package com.putterfly.util;

import java.util.HashMap;
import java.util.Map;

public class DisassembleMap {
    private static final Map<Integer,String> disassembleMap = new HashMap<>();

    public static void setDisassemble(int address,String disassemble){
        disassembleMap.put(address,disassemble);
    }

    public static String getDisassemble(int address){
        return disassembleMap.get(address);
    }
}
