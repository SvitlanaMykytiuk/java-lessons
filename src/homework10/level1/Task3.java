package homework10.level1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hight = scanner.nextInt();
        for (int i = 0; i <= hight; i++) {
            for (int j = 0; j <= hight - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("^");
            }
            System.out.println(" ");

        }
    }
}
