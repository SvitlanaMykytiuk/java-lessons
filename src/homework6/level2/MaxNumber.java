package homework6.level2;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int maxNumber;

        if (num1 > num2) {
            maxNumber = num1;
        } else maxNumber = num2;

        if (maxNumber > num3) {
    } else maxNumber = num3;

        System.out.println(maxNumber);
}
}