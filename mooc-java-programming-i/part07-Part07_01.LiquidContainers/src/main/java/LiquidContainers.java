import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {

        int firstContainer = 0;
        int secondContainer = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (amount < 0) {
                continue; // ignore negatives instead of forcing them to 0
            }

            if (command.equals("add")) {
                firstContainer = Math.min(100, firstContainer + amount);

            } else if (command.equals("move")) {
                int moved = Math.min(amount, firstContainer);
                firstContainer -= moved;
                secondContainer = Math.min(100, secondContainer + moved);

            } else if (command.equals("remove")) {
                secondContainer = Math.max(0, secondContainer - amount);
            }
        }
    }
}
