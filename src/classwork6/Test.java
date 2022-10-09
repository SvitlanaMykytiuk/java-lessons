package classwork6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ruff = scanner.nextBoolean();
        boolean wall = scanner.nextBoolean();
        int w = scanner.nextInt();
        boolean acsept = accept(ruff, wall, w);

        if (acsept){
            System.out.println("Можно сдавать объект");
        }        else {
            System.out.println("Нельзя сдавать объект");
        }
    }

    static boolean accept(boolean hasRoof, boolean hasWall, int high) {
        return hasRoof && hasWall && high == 14;
    }
}
