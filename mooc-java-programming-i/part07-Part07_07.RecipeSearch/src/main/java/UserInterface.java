import java.util.Scanner;
public class UserInterface {
    private Scanner scanner=new Scanner(System.in);
    private ReadFile file=new ReadFile();
    private Recipes recipe;
    public UserInterface(){
    
    }
    
    public void start(){
         System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        file.readFile(fileName);
     while (true) {
            System.out.println("Commands: " + "\n" + "list - lists the recipes" + "\n" + "stop - stops the program" + "\n" + "find name - searches recipes by name" + "\n"
                    + "find cooking time - searches recipes by cooking time" + "\n" + "find ingredient - searches recipes by ingredient\n"
                    + "");
            System.out.println("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("list")) {
                System.out.println("Recipes: " + "\n");
               
                System.out.println(file.toString());

            } else if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String name=scanner.nextLine();
                
                System.out.println("Recipes: ");
                
                
                System.out.println(file.findRecipeByName(name));

            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int time=scanner.nextInt();
                System.out.println("Recipes: ");
                System.out.println(file.findRecipeByCookingTime(time));
                
                

            } else if (command.equals("stop")) {
                break;
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient=scanner.nextLine();
                System.out.println("Recipes: ");
                System.out.println( file.findRecipeByIngredient(ingredient));
               

            }
        }
    
    
    }
    
    
    
    
    
}
