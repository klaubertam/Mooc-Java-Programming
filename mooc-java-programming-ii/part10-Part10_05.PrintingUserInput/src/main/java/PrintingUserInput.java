
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
        String input=scanner.nextLine();
        if(input.isEmpty()){break;}
        
        array.add(input);
        
        }
        array.stream().forEach(value-> System.out.println(value));
       
    }
}
