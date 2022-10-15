package homework8.level1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstYear = scanner.nextInt();
        int secondYear = scanner.nextInt();
        int sumOfLeapYear = 0;

        for (int i = firstYear; i <= secondYear ; i++) {
            if (i % 4 == 0) {
                sumOfLeapYear = sumOfLeapYear + 1;
            }
        }
        System.out.println(sumOfLeapYear);
    }
}
