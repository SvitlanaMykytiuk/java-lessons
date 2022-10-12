package homework7.level2;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        String cash;
        int thousands = amount / 1_000;
        int hundreds = (amount % 1_000) / 100;
        int dozens = ((amount % 1_000) % 100) / 10;
        int units = ((amount % 1_000) % 100) % 10;
        if (amount == 0) {
            System.out.println("0 долларов");
        } else if (amount < 0 || amount > 9_999) {
            System.out.println("некорректно введенная сумма");
        } else {

            switch (thousands) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("одна тысяча ");
                    break;
                case 2:
                    System.out.print("две тысячи ");
                    break;
                case 3:
                    System.out.print("три тысячи ");
                    break;
                case 4:
                    System.out.print("четыре тысячи ");
                    break;
                case 5:
                    System.out.print("пять тысяч ");
                    break;
                case 6:
                    System.out.print("шесть тысяч ");
                    break;
                case 7:
                    System.out.print("семь тысяч ");
                    break;
                case 8:
                    System.out.print("восемь тысяч ");
                    break;
                case 9:
                    System.out.print("девять тысяч ");
                    break;
            }

            switch (hundreds) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("сто ");
                    break;
                case 2:
                    System.out.print("двести ");
                    break;
                case 3:
                    System.out.print("триста ");
                    break;
                case 4:
                    System.out.print("четыреста ");
                    break;
                case 5:
                    System.out.print("пятсот ");
                    break;
                case 6:
                    System.out.print("шестьсот ");
                    break;
                case 7:
                    System.out.print("семьсот ");
                    break;
                case 8:
                    System.out.print("восемсот ");
                    break;
                case 9:
                    System.out.print("девятсот ");
                    break;
            }

            if (dozens == 1) {
                switch (units) {
                    case 0:
                        System.out.print("десять долларов");
                        break;
                    case 1:
                        System.out.print("одиннадцать долларов");
                        break;
                    case 2:
                        System.out.print("двенадцать долларов");
                        break;
                    case 3:
                        System.out.print("тринадцать долларов");
                        break;
                    case 4:
                        System.out.print("четырнадцать долларов");
                        break;
                    case 5:
                        System.out.print("пятнадцать долларов");
                        break;
                    case 6:
                        System.out.print("шестнадцать долларов");
                        break;
                    case 7:
                        System.out.print("семнадцать долларов");
                        break;
                    case 8:
                        System.out.print("восемнадцать долларов");
                        break;
                    case 9:
                        System.out.print("девятнадцать долларов");
                        break;
                }

            } else {
                switch (dozens) {
                    case 0:
                        System.out.print("");
                        break;
                    case 2:
                        System.out.print("двадцать ");
                        break;
                    case 3:
                        System.out.print("тридцать ");
                        break;
                    case 4:
                        System.out.print("сорок ");
                        break;
                    case 5:
                        System.out.print("пятьдесят ");
                        break;
                    case 6:
                        System.out.print("шестьдесят ");
                        break;
                    case 7:
                        System.out.print("семьдесят ");
                        break;
                    case 8:
                        System.out.print("восемьдесят ");
                        break;
                    case 9:
                        System.out.print("девяносто ");
                        break;
                }

                switch (units) {
                    case 0:
                        System.out.print("долларов");
                        break;
                    case 1:
                        System.out.print("один доллар");
                        break;
                    case 2:
                        System.out.print("два доллара");
                        break;
                    case 3:
                        System.out.print("три доллара");
                        break;
                    case 4:
                        System.out.print("четыре доллара");
                        break;
                    case 5:
                        System.out.print("пять долларов");
                        break;
                    case 6:
                        System.out.print("шесть долларов");
                        break;
                    case 7:
                        System.out.print("семь долларов");
                        break;
                    case 8:
                        System.out.print("восемь долларов");
                        break;
                    case 9:
                        System.out.print("девять долларов");
                        break;
                }
            }
        }
    }
}