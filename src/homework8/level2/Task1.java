package homework8.level2;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(10) + 1;
        System.out.println(num1);
        int num2 = random.nextInt(10) + 1;
        System.out.println(num2);
        System.out.print(num1 + " * " + num2 + " = " + num1);
        if (num2 != 1) {
            for (int i = 1; i < num2; i++) {
                System.out.print(" + " + num1);
            }
            System.out.print(" = " + num1 * num2);
        }
    }
}
