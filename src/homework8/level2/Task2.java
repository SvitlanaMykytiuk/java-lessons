package homework8.level2;

public class Task2 {
    public static void main(String[] args) {
        int sum = 0;
        int quant = 1;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        for (int i = 2; i <= 100; i++) {
            if (i % 2 != 0) {
                quant = quant + 1;
                ;
            }
        }
        double everage = sum / quant;
        System.out.println(sum);
        System.out.println(quant);
        System.out.println(everage);
    }
}

