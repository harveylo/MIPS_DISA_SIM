import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.nio.charset.StandardCharsets;

@Slf4j(topic = "test")
public class Test {
    public static void main(String[] args) throws IOException {
        File inputFile1 = new File("C:\\Users\\P7XXDMX\\IdeaProjects\\MIPS_DISA_SIM\\disassembly.txt");
        InputStreamReader read1 = new InputStreamReader(new FileInputStream(inputFile1), StandardCharsets.UTF_8);
        BufferedReader bufferedReader1 = new BufferedReader(read1);
        String line1 = null;
        File inputFile2 = new File("C:\\Users\\P7XXDMX\\IdeaProjects\\MIPS_DISA_SIM\\src\\main\\resources\\disassembly.txt");
        InputStreamReader read2 = new InputStreamReader(new FileInputStream(inputFile2), StandardCharsets.UTF_8);
        BufferedReader bufferedReader2 = new BufferedReader(read2);
        String line2 = null;
        int linenum = 1;
        while(((line1=bufferedReader1.readLine())!=null)&&(line2=bufferedReader2.readLine())!=null){
            char[] c1 = line1.toCharArray();
            char[] c2 = line2.toCharArray();
            for(int i = 0;i<c1.length;i++){
                if(i>=c2.length||c1[i]!=c2[i]) log.debug("the line "+linenum+" has different char in: "+i+", "+c1[i]+" "+(i<c2.length?c2[i]:'*'));
            }
            for(int i = 0;i<c2.length;i++){
                if(i>=c1.length||c1[i]!=c2[i]) log.debug("the line "+linenum+" has different char in: "+i+", "+c2[i]+" "+(i<c1.length?c1[i]:'*'));
            }
            linenum++;
        }
    }
}
