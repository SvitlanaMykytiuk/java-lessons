package homework9.level1;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random ();
        int number = random.nextInt(900) + 100;
        System.out.println(number);
        int max = 0;
        do {
            if (number % 10 > max){
                max = number % 10;
            }
            number /= 10;
        } while (number > 0);
        System.out.println(max);
    }
}
