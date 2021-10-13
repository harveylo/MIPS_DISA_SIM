import com.putterfly.simulator.ProgramCounter;
import com.putterfly.simulator.Register;

public class Test {
    public static void main(String[] args) {


        int result = 0;
        int digit = 1;
        int s = 0x10;
        int t = 0x92;
        for(int i = 0;i<32;i++){
            int left = (s&digit)>>>i;
            int right = (t&digit)>>>i;
            if(left+right==0) result|=digit;
            digit<<=1;
        }
        System.out.println(result);
        System.out.println(~(0x10|0x92));
    }
}
