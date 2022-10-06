package homework5.level1;

import java.util.Scanner;

public class Number {

    boolean isDividedFor7and5 (int val){
        return val % 5 == 0 && val % 7 == 0;
    }

    public static void main(String[] args) {

        Number number = new Number();
        Scanner scan = new Scanner(System.in);
        int numer = scan.nextInt();
        System.out.println(number.isDividedFor7and5(numer));

    }


}
