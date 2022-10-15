package homework8.level1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Первое число - ");
        int num1 = scanner.nextInt();
        System.out.print("Второе число - ");
        int num2 = scanner.nextInt();
        System.out.print(num1 + " * " + num2 + " = ");
        int rezult = scanner.nextInt();

        int tabRezult = num1 * num2;

        if (rezult == tabRezult) {
            System.out.println("Верно");
        } else {
            System.out.println("Не верно");
            System.out.print("Правильный ответ - " + tabRezult);

        }
    }
}

