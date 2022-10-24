package homework10.level2;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println(number);

        do {
            if (number == 1) {
                System.out.println("Получили 1");
                break;
            }
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = (number * 3 + 1) / 2;
            }
        } while (number >= 1);
    }
}
