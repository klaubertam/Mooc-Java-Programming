
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int number1=Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int number2=Integer.valueOf(scanner.nextLine());
        int sum=number1+number2;
        System.out.println("The sum of the numbers is "+sum);
        // Write your program here

    }
}
