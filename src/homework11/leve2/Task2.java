package homework11.leve2;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random ();
        int[] array = new int[10];
        int summ = 0;
        int count = 0;
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
            summ += array[i];
            count++;
        }
        int average = summ / count;
        System.out.println("Сумма значений = " + summ);
        System.out.println("Количество цифр = " + count);
        System.out.println("Среднее = " + average);
        for (int i = 0; i < 10; i++) {
            if (array[i] > average) {
                System.out.println(array[i]);
            }
        }
    }
}
