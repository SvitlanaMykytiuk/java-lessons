package homework6.level2;

import java.util.Random;

public class NumOfCarandWeekDay {

    public static void main(String[] args) {
        Random random = new Random();
        int carNumber = random.nextInt(9999) + 1;
        boolean isLorry = random.nextBoolean();
        boolean isWeekend = random.nextBoolean();

        System.out.println("Это выходной? " + isWeekend);
        System.out.println("Это грузовик? " + isLorry);
        System.out.println("Номер " + carNumber);

        if (isWeekend){
            if (isLorry) {
                System.out.println("Запрещено! В выходной проезд грузовиков запрещен");
            } else if (carNumber % 2 != 0) {
                System.out.println("Запрещено! В выходной проезд автомобилей с нечетными номерами запрещен");
            } else System.out.println("Можно заезжать в город");

        } else if (!isLorry) {
            if (carNumber % 2 == 0){
                System.out.println("Запрещено! В будни проезд автомобилей с четными номерами запрещен");
            } else System.out.println("Можно заезжать в город");
        } else System.out.println("Можно заезжать в город");

        }
    }

