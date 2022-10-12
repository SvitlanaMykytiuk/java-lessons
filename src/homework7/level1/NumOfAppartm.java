package homework7.level1;

import java.util.Scanner;

public class NumOfAppartm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Номер квартиры: ");
        int numOfApp = scanner.nextInt();

        if (numOfApp > 0 && numOfApp <= 20) {
            System.out.println("Подъезд номер 1");
        } else if (numOfApp > 20 && numOfApp <= 48) {
            System.out.println("Подъезд номер 2");
        } else if (numOfApp > 48 && numOfApp <= 90) {
            System.out.println("Подъезд номер 3");
        } else System.out.println("В этом доме нет такой квартиры");
    }
}
