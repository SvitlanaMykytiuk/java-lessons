package homework6.level1;

import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args) {
        Random random = new Random();
        boolean head = random.nextBoolean();
        System.out.println(head);

        if (head) {
            System.out.println("Орел");
        } else System.out.println("Решка");
    }

}
