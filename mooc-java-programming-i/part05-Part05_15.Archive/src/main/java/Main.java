
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archivesofBerta=new ArrayList<>();
        
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifier=scanner.nextLine();
            if(identifier.isEmpty()){break;}
            System.out.println("Name? (empty will stop)");
            String name=scanner.nextLine();
            if(name.isEmpty()){break;}

            Archive archives=new Archive(identifier,name);
            
            if(!(archivesofBerta.contains(archives))){
           archivesofBerta.add(archives) ;}
            else{continue;}
            
        }
        System.out.println("==Items==");
        for (Archive archive : archivesofBerta) {
            System.out.println(archive);
        }

    }
}
