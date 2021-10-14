package com.putterfly.simulator;

import com.putterfly.instructions.Command;
import com.putterfly.util.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

public class Simulator {
    private static int cycleCount;

    public static void beginSimulation() throws FileNotFoundException {
        ProgramCounter.setPC(256);
        cycleCount=1;
        PrintStream ps = new PrintStream(new FileOutputStream(System.getProperty("user.dir")+ File.separator+"simulation.txt"));
        PrintStream original = System.out;
        System.setOut(ps);
        while(ProgramCounter.getPC()!=-1){
            Command currentCommand = MemoryCommand.getCommand(ProgramCounter.getPC());
            int address = ProgramCounter.getPC();
            currentCommand.run();
            printCycle(address);
            cycleCount++;
        }
        System.setOut(original);
    }
    private static void printCycle(int pc){
        System.out.println("--------------------");
        StringBuilder sb = new StringBuilder();
        sb.append("Cycle:").append(cycleCount).append('\t').append(pc).append('\t').append(DisassembleMap.getDisassemble(pc));
        System.out.println(sb.toString());
        System.out.println();
        System.out.println("Registers");
        for(int i = 0;i<4;i++){
            sb.delete(0,sb.length());
            sb.append('R').append(i*8<10?"0":"").append(i*8).append(':');
            for(int j = i*8;j<(i+1)*8;j++){
                sb.append('\t').append(Register.getRegisterValue(j));
            }
            System.out.println(sb.toString());
        }
        System.out.println();
        System.out.println("Data");
        int count = MemoryData.endAddress-MemoryData.startAddress+4;
        count/=32;
        int address = MemoryData.startAddress;
        for(int i = 0;i<count;i++){
            sb.delete(0,sb.length());
            sb.append(address).append(':');
            for(int j =0 ;j<8;j++){
                sb.append('\t').append(MemoryData.loadData(address));
                address+=4;
            }
            System.out.println(sb.toString());
        }
        System.out.println();
    }
}
