
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            array.add(number);

        }
        array.stream()
        .filter(values -> values >= 1 && values <= 5)
        .forEach(values -> System.out.println(values));

    }
}
