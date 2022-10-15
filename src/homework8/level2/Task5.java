package homework8.level2;

public class Task5 {
    public static void main(String[] args) {
        String line = "123123";
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < line.length() / 2; i++) {
            sum1 = sum1 + Integer.parseInt(line.substring(i, i + 1));
        }
        for (int i = line.length() / 2; i < line.length(); i++) {
            sum2 = sum2 + Integer.parseInt(line.substring(i, i + 1));
        }
        if (sum1 == sum2) {
            System.out.println("да");
        } else System.out.println("нет");
    }
}
