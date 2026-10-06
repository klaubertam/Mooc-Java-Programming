
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner = new Scanner(System.in);
    private TodoList mylist = new TodoList();

    public UserInterface(TodoList mylist,Scanner scanner) {
        this.mylist=mylist;
        this.scanner=scanner;
    }

    public void start() {
        
        OUTER:
        while (true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            switch (input) {
                case "add":
                    System.out.println("Task: ");
                    String task = scanner.nextLine();
                    mylist.add(task);
                    break;
                case "list":
                    mylist.print();
                    break;
                case "remove":
                    System.out.println("Which task was completed? ");
                    int number = scanner.nextInt();
scanner.nextLine(); // clear the leftover newline
mylist.remove(number);

                    break;
                case "stop":
                    break OUTER;
                default:
                    break;
            }
            
        }
    }
}
