
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }

            String[] parts = text.split(" ");
            for (int i = 0; i < parts.length; i++) {
                if (parts[i].contains("av")) {
                    System.out.println(parts[i]);
                }

            }
        }
    }
}
