package homework7.level1;

import java.util.Scanner;

public class SeasonName {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            switch (num){
                case 1:
                    System.out.println("Зима");
                    break;
                case 2:
                    System.out.println("Весна");
                    break;
                case 3:
                    System.out.println("Лето");
                    break;
                case 4:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Некорректно введено число");
            }
        }
}
