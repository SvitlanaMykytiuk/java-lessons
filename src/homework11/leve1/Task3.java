package homework11.leve1;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] temp = new int[13];
        Random random = new Random();
        int time = 7;
        for (int i = 0; i < 13; i++) {
            temp[i] = random.nextInt(40) - 20;
            time++;
            if (temp[i] < 0) {
                System.out.println("В " + time + " часов температура впервые была отрицательной: " + temp[i] + " градусов");
                return;
            }
        }
    }
}
