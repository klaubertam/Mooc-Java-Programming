
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {

            int number = Integer.valueOf(scanner.nextLine());
            if (number == 9999) {
                break;
            }
            list.add(number);
        }
        int i = 0;
        int min = list.get(0);
        for (i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println("Smallest number: " + min);
        for (i = 0; i < list.size(); i++) {
            if (list.get(i) == min) {
                System.out.println("Found at index: " + i);
            }
        }

    }
}
