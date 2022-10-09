package homework6.level1;

import java.util.Random;

public class NumOfCar {
    public static void main(String[] args) {
        Random random = new Random();
        int carNumber = random.nextInt(9999) + 1;

        boolean isLorry = random.nextBoolean();
        System.out.println("Номер " + carNumber);
        System.out.println("Это грузовик? " + isLorry);
        boolean permission = carNumber % 2 == 0 && !isLorry;

        if (permission) {
            System.out.println("Можно заезжать в город");
        } else System.out.println("Въезд запрещен");

}
}