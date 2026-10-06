
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          System.out.println("Give the first number:");
        int number1=Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int number2=Integer.valueOf(scanner.nextLine());
        int multiplication=number1*number2;
        System.out.println(number1+" * "+number2+" = "+multiplication);

        // Write your program here

    }
}
