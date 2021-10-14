/*
  On my honor, I have neither given nor received unauthorized aid on this assignment.
 */
package com.putterfly.app;

import com.putterfly.disassembler.Disassembler;
import com.putterfly.simulator.Simulator;
import lombok.extern.slf4j.Slf4j;

import java.io.FileNotFoundException;
import java.io.IOException;

@Slf4j(topic = "Main method")
public class Application {
    public static void main(String[] args) {
        String inputPath=null;
        try{
            inputPath = args[0];
        }catch (Exception e){
            log.info("No input file specified, please select a input file");
            return;
        }
        try {
            Disassembler.disassemble(inputPath);
        } catch (IOException e) {
            log.info("Something wrong with the input file, please check your input");
            log.info(e.getMessage());
            return;
        }
        try {
            Disassembler.output();
        } catch (FileNotFoundException e) {
            log.info("Something wrong with the disassemble output");
            log.info(e.getMessage());
            return;
        }
        try{
            Simulator.beginSimulation();
        } catch (FileNotFoundException e) {
            log.info("Something wrong with the simulation output");
        }
    }
}
