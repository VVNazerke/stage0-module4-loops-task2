package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        while (i <= printToInclusive) {
            int j = 1, counter = 0;
            while (j <= i) {
                if (i % j == 0) {
                    counter++;
                }
                j++;
            }
            if (counter <= 2) {
                System.out.println(i);
            }
            i++;
        }
    }
}
