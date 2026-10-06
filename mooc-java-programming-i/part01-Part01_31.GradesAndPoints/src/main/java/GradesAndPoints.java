
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int number=Integer.valueOf(scanner.nextLine());
        if(number<0){
            System.out.println("Gade:impossible!");
        }else if(number<=49){
            System.out.println("Gade:failed");
        }else if(number<=59){
            System.out.println("Gade:1");
        }else if(number<=69){
            System.out.println("Gade:2");
        }else if(number<=79){
            System.out.println("Gade:3");
        }else if(number<=89){
            System.out.println("Gade:4");
        }else if(number<=100){
            System.out.println("Gade:5");
        }else if(number>99){
            System.out.println("Gade:incredible!");
        }
        

    }
}
