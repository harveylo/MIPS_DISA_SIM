package com.putterfly.simulator;

import java.util.HashMap;
import java.util.Map;

public class MemoryData {
    private static Map<Long,Integer> dataMap=new HashMap<>();


    public static void storeData(long address,int data){
        dataMap.put(address,data);
    }

    public static int loadData(long address){
        return dataMap.get(address);
    }


}
