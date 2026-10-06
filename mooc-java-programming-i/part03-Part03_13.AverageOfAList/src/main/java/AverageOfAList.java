
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int numbers = Integer.valueOf(scanner.nextLine());
            if (numbers == -1) {
                break;
            }
            list.add(numbers);
        }
        System.out.println("");
        int sum = 0;

        for (int number : list) {
            sum = sum + number;
        }
        System.out.println("Average: " + 1.0 * sum / list.size());
    }
}
