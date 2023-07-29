package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    int num =0;
    public void printEvenNumbers(int printTillInclusive) {
        while (num<=printTillInclusive){
            System.out.println(num);
            num+=2;
        }
    }
}
