
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        double count = 0;
        if (number == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            if (number > 0) {
                sum = sum + number;
                count++;
            }

            while (true) {
                number = scanner.nextInt();
                if (number > 0) {

                    sum = sum + number;
                    count++;
                } else if (number == 0) {
                    break;
                }
            }
            System.out.println(sum / count);
        }

    }
}
