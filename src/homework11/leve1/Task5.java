package homework11.leve1;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите количество элементов: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt();
            System.out.println(array[i]);
            if (Math.abs(array[i]) > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное по модулю число " + max);
    }
}
