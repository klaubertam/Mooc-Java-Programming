
import java.util.ArrayList;

import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Bird> birdslist = new ArrayList<>();

        while (true) {

            System.out.println("? ");
            String command = scanner.nextLine();
            if (command.equals("Add")) {
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scanner.nextLine();
                Bird bird = new Bird(name, latinName, 0);
                birdslist.add(bird);
            } else if (command.equals("Observation")) {
                System.out.println("Bird? ");
                String name = scanner.nextLine();
                for (Bird bird : birdslist) {
                    if (bird.getName().equals(name)) {
                        bird.addObservation();
                    } else {
                        System.out.println("Not a bird!");
                    }
                }
            } else if (command.equals("All")) {
                for (Bird bird : birdslist) {
                    System.out.println(bird);
                }
            } else if (command.equals("One")) {
                System.out.println("Bird? ");
                String name = scanner.nextLine();
                for (Bird bird : birdslist) {
                    if (bird.getName().equals(name)) {

                        System.out.println(bird);
                    } else {
                        System.out.println("Not a bird!");
                    }
                }
            } else if (command.equals("Quit")) {
                break;
            } else {
                System.out.println("Incorrect Command!");
            }

        }

    }

}
