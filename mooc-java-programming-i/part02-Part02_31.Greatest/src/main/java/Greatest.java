
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int max = 0;
        if (number1 > number2) {
            max = number1;
        } else {
            max = number2;
        }
        if (max > number3) {
            return max;
        } else {
            return number3;
        }
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
