
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("last number? ");
        int sum = 0;
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);

    }
}
