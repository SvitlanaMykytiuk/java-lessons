package homework6.level1;

import java.util.Scanner;

public class BuyingCookies {
    public static void main(String[] args) {
        double price = 0.5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько штук печенья хотите купить?");
        int sumOfCookies = scanner.nextInt();
        double purchasePrice = price * sumOfCookies;
        System.out.println("Сколько денег у вас есть?");
        double howMuchMoney = scanner.nextDouble();
        double change = howMuchMoney - purchasePrice;

        if (sumOfCookies < 0 | howMuchMoney < 0){
            System.out.println("Введены некорректные данные");
        } else if (howMuchMoney >= purchasePrice) {
            System.out.println("Ваша покупка составляет " + purchasePrice + " Евро, сдача - " + change + " Евро");
        } else System.out.println("У вас недостаточно денег");
    }

    }
