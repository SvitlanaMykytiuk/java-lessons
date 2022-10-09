package homework6.level1;

import java.util.Random;

public class LeapYear {
    public static void main(String[] args) {

        Random random = new Random();
        int year = random.nextInt(2022);
        System.out.println("Год " + year);

        if (year % 4 == 0) {
            System.out.println("Этот год високосный");

        } else System.out.println("Этот год не високосный");

    }

//    public static boolean isLeapYear (int year) {
//        return year % 4 = 0;
//    }


            }



