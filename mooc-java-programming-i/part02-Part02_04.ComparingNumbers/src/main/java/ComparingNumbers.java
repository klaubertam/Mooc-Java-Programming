
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int first=2;
        int second=1;
        first = Integer.valueOf(reader.nextLine());
        second = Integer.valueOf(reader.nextLine());
        if (first < second){
            System.out.println(first + " is smaller than " + second + ".");
        }else if(first>second){
            System.out.println(first+" is bigger than "+second+".");
        }else  {
            System.out.println(first+" is equal to "+second+".");
        }
    }
}
