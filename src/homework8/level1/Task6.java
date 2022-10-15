package homework8.level1;

public class Task6 {
    public static void main(String[] args) {
        int prodOfNum = 1;
        for (int i = 10; i < 100; i++) {
            if (i % 2 !=0 && i % 13 == 0) {
                prodOfNum = prodOfNum * i;
            }
        }
        System.out.println(prodOfNum);
    }
}
