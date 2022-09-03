package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i = 0, result = 1;
        while (i < power) {
            result = result * 2;
            System.out.println(result);
            i++;
        }
    }
}
