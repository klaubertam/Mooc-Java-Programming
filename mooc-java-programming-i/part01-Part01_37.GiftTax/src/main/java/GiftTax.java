
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int x = Integer.valueOf(scanner.nextLine());
        double tax = 0;
        if (x < 5000) {
            System.out.println("No tax!");
        } else if (x < 25000) {
            tax = (100 + (x - 5000) * 0.08);
            System.out.println("Tax:" + tax);
        } else if (x < 55000) {
            tax = (1700 + (x - 25000) * 0.1);
            System.out.println("Tax:" + tax);
        } else if (x < 200000) {
            tax = (4700 + (x - 55000) * 0.12);
            System.out.println("Tax:" + tax);
        } else if (x < 1000000) {
            tax = (22100 + (x - 200000) * 0.15);
            System.out.println("Tax:" + tax);
        } else if (x >= 1000000) {
            tax = (142100 + (x - 1000000) * 0.17);
            System.out.println("Tax:" + tax);
        }

    }
}
