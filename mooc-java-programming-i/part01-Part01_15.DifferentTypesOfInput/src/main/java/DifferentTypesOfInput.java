
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String first=scanner.nextLine();
        System.out.println("Give an integer:");
        int second=Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double third=Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean fourth=Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the string "+first);
        System.out.println("You gave the integer "+second);
        System.out.println("You gave the double "+third);
        System.out.println("You gave the boolean "+fourth);

        // Write your program here

    }
}
