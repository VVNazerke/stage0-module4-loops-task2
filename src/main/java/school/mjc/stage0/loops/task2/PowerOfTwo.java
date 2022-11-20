package school.mjc.stage0.loops.task2;
import java.lang.Math;

public class PowerOfTwo {
    public void printPower(int power) {
        int i = 0, result;
        if (power < 0) {
            System.out.println("too much power");
        } else {
            while (i <= power) {
                result = (int) Math.pow(2,i);
                System.out.println(result);
                i++;
            }
        }

    }
}
