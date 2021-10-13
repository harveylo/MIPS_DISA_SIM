package com.putterfly.disassembler;

import java.io.*;

public class Disassembler {
    public static void disassemble(String inputPath) throws IOException {
        File inputFile = new File(inputPath);
        InputStreamReader read = new InputStreamReader(new FileInputStream(inputFile));
        BufferedReader bufferedReader = new BufferedReader(read);
        String line = null;
        while((line=bufferedReader.readLine())!=null){
            int lineCode = Integer.valueOf(line,2);
        }
    }
}
