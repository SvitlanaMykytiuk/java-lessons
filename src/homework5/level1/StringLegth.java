package homework5.level1;

import java.util.Scanner;

public class StringLegth {
    boolean isStringMoreThan10 (String string){

        return string.length() > 10;
    }

    public static void main(String[] args) {
        StringLegth stringLength = new StringLegth();
        Scanner scaner = new Scanner(System.in);
        String string = scaner.nextLine();
        System.out.println(stringLength.isStringMoreThan10(string));
    }
}
