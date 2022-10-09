package homework6.level1;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Можно идти смотреть кино");
        } else System.out.println("Нельзя идти смотреть кино");
    }
}
