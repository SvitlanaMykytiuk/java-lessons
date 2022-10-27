package homework11.leve2;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {3, 9, 8, 4, 5, 1};

        for (int i = 1; i < 6; i++) {
            if (array[i] > array[i-1]) {
                System.out.println(array[i]);
            }
        }
    }
}
