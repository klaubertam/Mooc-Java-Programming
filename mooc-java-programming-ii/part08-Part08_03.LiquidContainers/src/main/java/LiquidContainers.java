
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;
        int amount = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            if(parts.length==1){ if (input.equals("quit")) {
                break;
            }}
            String command = parts[0];

            amount = Integer.valueOf(parts[1]);
            if (amount<0){amount=0;}

             if (command.equals("remove")) {
                secondContainer = Math.max(0, secondContainer - amount);

            } else if (command.equals("add")) {
                firstContainer = Math.min(100, amount + firstContainer);
            } else if (command.equals("move")) {
                if(amount>=firstContainer){amount=firstContainer;
                firstContainer = 0;
                secondContainer = Math.min(100, secondContainer + amount);
                }
                else{
                firstContainer = Math.max(0, firstContainer - amount);
                secondContainer = Math.min(100, secondContainer + amount);
            }}

        }

    }
}
