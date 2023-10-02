package src;

import java.util.ArrayList;

public class lab1 {
    static double max_x = 11.5;
    static double max_y = 4.33;
    static double area;

    public static void main(String[] args) {
        area = max_x * max_y;
        int[] amounts = new int[]{100, 200, 500, 1000, 2000, 5000, 10000, 20000};
        for (int amount : amounts) {
            System.out.println(amount);
            for (int n = 0; n < 10; n++){
                System.out.printf("%.4f%n",(double)test(amount)/amount*area);
            }
        }
    }

    public static int test(int amount) {
        int isIn = 0;
        for (int i = 0; i < amount; i++) {
            double x = Math.random() * max_x;
            double y = Math.random() * max_y;
            isIn += checkIfIn(x, y);
        }
        return isIn;
    }

    public static int checkIfIn(double x, double y) {
        if (y > x * 1.73205 ||
                y < (x - 9) * 1.73205) {
            return 0;
        }
        return 1;
    }
}
