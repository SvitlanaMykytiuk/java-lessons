package homework9.level1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int lastNumber = scanner.nextInt();
        int summ = 0;

        int i = firstNumber;
        while (i <= lastNumber) {
            if (i % 2 != 0) {
                summ += i;
            }
            i++;
        }
        System.out.println(summ);
    }
}
