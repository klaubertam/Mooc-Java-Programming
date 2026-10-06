
import java.util.ArrayList;

public class PrintInRange {

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);

        int lowerLimit = 3;
        int upperLimit = 8;

        printNumbersInRange(numbers, lowerLimit, upperLimit);
    }
}
