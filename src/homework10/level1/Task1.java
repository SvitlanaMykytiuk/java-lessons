package homework10.level1;

public class Task1 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j != i)
                    for (int k = 0; k < 10; k++) {
                        if (k != i && k != j)
                            for (int l = 0; l < 10; l++) {
                                if (l != k && l != j && l != i)
                                System.out.println(i + "" + j + "" + k + "" + l);
                            }
                    }
            }
        }
    }
}

