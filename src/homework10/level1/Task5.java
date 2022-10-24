package homework10.level1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOddNumbers = 0;
        int number = scanner.nextInt();

        while (number >= 2) {
            if (isOddNumber(number)) {
                countOddNumbers++;
                            }
            number = scanner.nextInt();
        }
        System.out.println("Количество простых чисел: " + countOddNumbers);
        return;
    }

    private static boolean isOddNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
