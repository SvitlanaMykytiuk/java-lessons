package homework10.level2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        double summ = 0;

        while (number != 0) {
            count++;
            summ += number;

            number = scanner.nextInt();
        }
        System.out.println("Количество чисел: " + count);
        System.out.println("Сумма чисел: " + summ);
        System.out.println("Среднее арифметическое чисел: " + summ / count);
        return;
    }
}
