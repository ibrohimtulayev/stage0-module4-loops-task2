package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int currentNumber = 0;
        while (currentNumber <= printToInclusive) {
            long factorial = calculateFactorial(currentNumber);
            System.out.println(currentNumber + "! = " + factorial);
            currentNumber++;
        }
    }

    private long calculateFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

}
