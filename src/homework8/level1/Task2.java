package homework8.level1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean check = true;

        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Число простое");
        } else System.out.println("Число не простое");
    }

}
