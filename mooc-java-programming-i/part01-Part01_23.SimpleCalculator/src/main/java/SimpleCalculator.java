
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Give the first number:");
        int number1=Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int number2=Integer.valueOf(scanner.nextLine());
        int sum= number1+number2;
        int difference=number1-number2;
        int product=number1*number2;
        double quotient=1.0*number1/number2;
        System.out.println(number1+" + "+number2+" = "+sum);
        System.out.println(number1+" - "+number2+" = "+difference);
        System.out.println(number1+" * "+number2+" = "+product);
        System.out.println(number1+" / "+number2+" = "+quotient);

        // Write your program here

    }
}
