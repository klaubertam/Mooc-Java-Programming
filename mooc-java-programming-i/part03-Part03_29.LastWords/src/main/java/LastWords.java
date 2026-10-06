
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String word = scanner.nextLine();
            if (word.equals("")) {
                break;
            }
            String parts[] = word.split(" ");
            int a = parts.length;
            System.out.println(parts[a-1]);
        }

    }
}
