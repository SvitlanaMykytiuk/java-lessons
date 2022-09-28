package HW2.Leve2;

import java.util.Scanner;

public class task2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 1 сторону прямоугольника");
        int x = scan.nextInt();
        System.out.println("Введите 2 сторону прямоугольника");
        int y = scan.nextInt();
        int perimetr = 2 * ( x + y );
        int square = x * y;
        System.out.println("Периметр прямоугольника со сторонами " + x + "см и " + y + "см равен " + perimetr + "см");
        System.out.println("Площадь прямоугольника со сторонами " + x + "см и " + y + "см равна " + square + "кв.см");

    }
}