package homework6.level2;

import java.util.Random;

public class TimeLeft {
    public static void main(String[] args) {
        Random random = new Random();
        int timeLeft = random.nextInt(28800);
        int hours = timeLeft / 3600;

        System.out.println("До окончания рабочего дня осталось " + timeLeft + " секунд");
        if (hours == 0) {
            System.out.println("До окончания рабочего дня осталось менее часа");
        } else if (hours == 1){
            System.out.println("До окончания рабочего дня остался 1 час");
        } else if (hours == 2 | hours == 3 | hours == 4){
            System.out.println("До окончания рабочего дня осталось " + hours + " часа");
        } else System.out.println("До окончания рабочего дня осталось " + hours + " часов");


    }
}
