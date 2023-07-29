package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int currentNumber = 0;
        int absoluteValue = (multiplyByAndToInclusive < 0) ? -multiplyByAndToInclusive : multiplyByAndToInclusive;

        while (currentNumber <= absoluteValue) {
            int result = currentNumber * multiplyByAndToInclusive;
            System.out.println(currentNumber + " * " + multiplyByAndToInclusive + " = " + result);
            currentNumber++;
        }
    }
}
