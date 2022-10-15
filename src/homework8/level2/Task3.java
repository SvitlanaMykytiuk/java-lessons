package homework8.level2;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random ();
        int n = random.nextInt(21);
        long factorial = 1;
        System.out.print("!" + n + " = " + " 1");
        for (int i = 2; i <= n; i++) {
            System.out.print(" * " + i);
        }
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.print(" = " + factorial);
    }
}
