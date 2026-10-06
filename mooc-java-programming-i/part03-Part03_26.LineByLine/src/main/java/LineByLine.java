
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jepni gjatesine e vargut:");
        int gjatesia = scanner.nextInt();
        int[] vargu = new int[gjatesia];
        System.out.println("Jepni elementet e vargut:");
        for (int i = 0; i < vargu.length; i++) {
            vargu[i] = scanner.nextInt();
        }
        int mesatarja=gjejMesataren(vargu);
        gjejPozicionin(vargu,mesatarja);

    }

    public static int gjejMesataren(int[] vargu) {
        int sum = 0;
        int mesatarja = 0;
        for (int i = 0; i < vargu.length; i++) {
            sum = sum + vargu[i];
        }
        mesatarja = sum / vargu.length;
        System.out.println("Mesatarja eshte: " + mesatarja);
        return mesatarja;
    }

    public static void gjejPozicionin(int[] vargu,int mesatarja) {
        for (int i = 0; i < vargu.length; i++) {
            if (vargu[i] == mesatarja) {
                System.out.println("Pozicioni i mesatares eshte: " + i);
            }
        }

    }
}
