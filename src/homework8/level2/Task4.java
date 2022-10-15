package homework8.level2;

public class Task4 {
    public static void main(String[] args) {
        String line = "954";
        int sum = 0;
        for (int i = 0; i < line.length(); i++) {
            sum = sum + Integer.parseInt(line.substring(i, i + 1));
        }
        System.out.println(sum);
    }
}
