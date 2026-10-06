
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double count = 0;
        int count1 = 0;
        int sum = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Give numbers:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number != -1) {
                sum = sum + number;
                count++;
                count1++;
                if (number % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            } else {
                System.out.println("Thx! Bye!");
                break;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count1);
        System.out.println("Average: " + sum / count);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
