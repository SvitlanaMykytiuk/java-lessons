package homework9.level1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        do {
            sum += number % 10;
            number /= 10;
            } while (number > 0);
        System.out.println(sum);
    }
}
