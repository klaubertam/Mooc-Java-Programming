
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int sum = 1;
        int n = scanner.nextInt();
        for (int i =n; i > 0; i--) {
            sum = sum * i;
        }
        System.out.println("Factorial: " + sum);

    }
}
