
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Jepni gjatesine e vargut");

        int gjatesia = Integer.valueOf(scanner.nextLine());

        int[] vargu = new int[gjatesia];

        System.out.println("Jepni elementet e vargut");

        for (int i = 0; i < gjatesia; i++) {

            vargu[i] = Integer.valueOf(scanner.nextLine());
 }
            bubble(vargu);
            afisho(vargu);
       
    }

    public static void bubble(int[] vargu) {

        for (int i = 0; i < vargu.length-1; i++) {
            for (int j = 0; j < vargu.length-i-1; j++) {

                if (vargu[j] > vargu[j + 1]) {

                    int temp = vargu[j];
                    vargu[j] = vargu[j + 1];

                    vargu[j + 1] = temp;
                }
            }
        }
    }

    public static void afisho(int[] vargu) {

        for (int i = 0; i < vargu.length; i++) {

            System.out.print(vargu[i] + " ");
        }
    }

}
