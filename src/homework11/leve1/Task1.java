package homework11.leve1;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        int count = 0;

        for (int i = 0; i < 20; i++) {
            array[i] = random.nextInt();
            count++;
            if (array[i] > 0) {
                System.out.println("Значение положительного элемента = " + array[i] + ", его номер " + count);
                return;
            }
        }
    }
}
