package HW2.Leve2;

public class task2_1 {
    static double PI = Math.PI;

    public static void main(String[] args) {
        double pizza1size = 14 * PI * PI;
        double pizza2size = 12 * PI * PI;
        double pizza1Call = pizza1size * 40;
        double pizza2Call = pizza2size * 40;
        double raznCal = pizza1Call - pizza2Call;
        System.out.println( "Калорийность большой пиццы: " + pizza1Call + " Cal");
        System.out.println( "Калорийность маленькой пиццы: " + pizza2Call + " Cal");
        System.out.println( "Большая пицца на  " + raznCal + " Cal сытнее");

    }
}
