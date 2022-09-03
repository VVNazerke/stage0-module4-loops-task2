package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 1, result = 1;
        while (i <= multiplyByAndToInclusive) {
            result = result * i;
            System.out.println(result);
            i++;
        }
    }
}
