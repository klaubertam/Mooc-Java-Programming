import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
          String word=scanner.next();
          
           if(word.equals("end")){
           break;
           }
            else{
            int x=Integer.valueOf(word);
                System.out.println(x*x*x);
            }
            
            }
}}
