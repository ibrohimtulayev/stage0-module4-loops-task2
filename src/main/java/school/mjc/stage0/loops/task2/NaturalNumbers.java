package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    int currentNumber = 0;
    public void naturalNumbersPrinter(int lastPrinted) {
        while (currentNumber<=lastPrinted){
            System.out.println(currentNumber++);
        }
    }
}
