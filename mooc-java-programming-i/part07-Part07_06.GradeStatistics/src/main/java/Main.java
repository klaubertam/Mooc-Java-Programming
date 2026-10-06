
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> points = new ArrayList<>();
        System.out.println("Enter point totals, -1 stops: ");
        while (true) {
            int point = Integer.valueOf(scanner.nextLine());
            if (point == -1) {
                System.out.println(Main.averageOfPoints(points));
                System.out.println(Main.gradeDistribution(points));
                break;
            } else if (point < -1 || point > 100) {
                continue;
            } else {
                points.add(point);
            }

        }

    }

    public static String averageOfPoints(ArrayList<Integer> points) {
        int sum = 0;
        int passingSum = 0;
        int count = 0;
        for (int point : points) {

            sum = sum + point;
            if (point >= 50) {
                passingSum += point;
                count++;
            }

        }

        return "Point average (all): " + (double) sum / points.size() + "\n" + "Point average (passing): " + (double) passingSum / count + "\n" + "Pass percentage: " + ((double) count / points.size() * 100);
    }

    public static String gradeDistribution(ArrayList<Integer> points) {
        String count5 = "";
        String count4 = "";
        String count3 = "";
        String count2 = "";
        String count1 = "";
        String count0 = "";
        for (int point : points) {

            if (point < 50) {
                count0 += "*";
            } else if (point < 60) {
                count1 += "*";
            } else if (point < 70) {
                count2 += "*";
            } else if (point < 80) {
                count3 += "*";
            } else if (point < 90) {
                count4 += "*";
            } else {
                count5 += "*";
            }
        }
        return "Grade distribution:" + "\n" + "5: " + count5 + "\n" + "4: " + count4 + "\n" + "3: " + count3 + "\n" + "2: " + count2 + "\n" + "1: " + count1 + "\n" + "0: " + count0;
    }

}
