import java.lang.management.GarbageCollectorMXBean;
import java.util.Scanner;
// Level1
// 1. 637 (dec) ->  16F (hex)
//    637 / 16=39 (13 = F)
//     22 / 16=1  (6)
//      1 / 16=0  (1)
//    16F (hex) -> 367 (dec)
//    1*16^2 + 6*16^1 + 15(F)*16^0 = 356 + 96 + 15 = 367

// 2. 367 (dec) -> 101101111(bin)
//    367 / 2 = 183 (1)
//    183 / 2 = 91 (1)
//    91 / 2 = 45 (1)
//    45 / 2 = 22 (1)
//    22 / 2 = 11 (0)
//    11 / 2 = 5 (1)
//    5 / 2 = 2 (1)
//    2 / 2 = 1 (0)
//    1 / 2 = 0 (1)
//    101101111 (bin) -> 367 (dec)
//    1*2^8 + 0*2^7 + 1*2^6 + 1*2^5 + 0*2^4 + 1*2^3+ 1*2^2+ 1*2^1+ 1*2^0 =
//    = 265 + 0 + 64 + 32 + 0 + 8 + 4 + 2 + 1 = 367


public class Main {
    public static void main(String[] args) {

        //3.
        int n = 12 ;
        System.out.println( "#3" );
        System.out.println( n * n );

        //4.
        int a = 1000;
        int b = 500;
        int sum = a + b;
        int disc = 100;
        int sum2 = sum - disc;
        double disc2 = disc / sum2 * 100;
        System.out.println( "#4" );
        System.out.println( "Сумма покупки: " + sum2 );
        System.out.println( "Скидка: " + disc );
        System.out.println( "Скидка составляет: " + disc2 + "%");

        //5.
        System.out.println( "#5" );
        Scanner scan = new Scanner(System.in);
        System.out.println( "Введите первое число: " );
        int x = scan.nextInt();
        System.out.println( "Введите второе число: " );
        int y = scan.nextInt();
        int summa = x + y;
        int razn = x - y;
        System.out.println( "Сумма чисел: " + summa);
        System.out.println( "Разница чисел: " + razn);

    }
}