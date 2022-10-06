package homework5.level2;

import java.util.Scanner;

public class TwoNumbers {

    boolean isDevided (int num1, int num2){
        return num1 % num2 == 0;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int numer2 = scan.nextInt();

        TwoNumbers twoNumbers = new TwoNumbers();
        System.out.println(twoNumbers.isDevided(number1, numer2));
    }
}
