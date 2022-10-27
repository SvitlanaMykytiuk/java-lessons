package homework11.leve1;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int[] arrayDouble = new int[10];
        Random random = new Random ();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(200) - 100;
            arrayDouble[i] = array[i]*2;
            System.out.println(array[i] + ", увеличенное в 2 раза = " + arrayDouble[i]);
        }
    }
}
