package homework11.leve2;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        double[] array= new double[10];
        Random random = new Random ();
        double max = 0;
        double[] arrayReturn = new double[10];
        System.out.println("Значения первого массива:");
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextDouble();
            System.out.println(array[i]);
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Наибольший элемент " + max);
        System.out.println("Значения второго массива:");
        for (int i = 0; i < 10; i++) {
            arrayReturn[i] = array[i] / max;
            System.out.println(arrayReturn[i]);
        }
    }
}
