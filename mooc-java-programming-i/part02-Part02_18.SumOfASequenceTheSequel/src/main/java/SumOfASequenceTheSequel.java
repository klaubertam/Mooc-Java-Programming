
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number? ");
        int sum = 0;
        int n = scanner.nextInt();
        System.out.println("Last number? ");
        int m = scanner.nextInt();
        for (int i = n; i <= m; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);

    }
}
