import com.putterfly.simulator.ProgramCounter;
import com.putterfly.simulator.Register;

public class Test {
    public static void main(String[] args) {
        short x = (short) 0xFFFF;
        int y = x;
        y<<=16;
        y>>>=16;
        System.out.println(y);
    }
}
