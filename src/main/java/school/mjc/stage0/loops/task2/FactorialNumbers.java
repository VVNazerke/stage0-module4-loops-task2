package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
    int i = 1, result=1;
    while (i<=printToInclusive){
        result = result *i;
        System.out.println(result);
        i++;
    }
    }
}
