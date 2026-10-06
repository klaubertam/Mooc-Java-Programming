
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        String longest = "";
        int count = 0;
        int sum = 0;
        while (true) {
            String word = scanner.nextLine();
            if (word.isEmpty()) {
                break;
            }
            String[] parts = word.split(",");
            int age = Integer.valueOf(parts[1]);
            sum = sum + age;
            count++;
            String name = parts[0];
            if (max < name.length()) {
                max = name.length();
                longest = parts[0];
            }

        }
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + 1.0*sum / count);
    }
}
