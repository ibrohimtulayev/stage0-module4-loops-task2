package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number = 2;
        while (number <= printToInclusive) {
            if (isPrime(number)) {
                System.out.println(number);
            }
            number++;
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int divisor = 2;
        while (divisor * divisor <= num) {
            if (num % divisor == 0) {
                return false;
            }
            divisor++;
        }
        return true;
    }

}
