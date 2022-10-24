package homework10.level1;

public class Task7 {
    public static void main(String[] args) {
        String line = "Я всегда делаю домашнее задание";
        char symbol1 = 'а';
        char symbol2 = 'А';

        for (int i = 0; i <= line.length() - 1; i++) {
            if (line.charAt(i) == symbol1) {
                System.out.print(symbol2);
            } else {
                System.out.print(line.charAt(i));
            }
        }
    }
}
