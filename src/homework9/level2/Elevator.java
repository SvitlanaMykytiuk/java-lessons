package homework9.level2;

public class Elevator {
    public static void main(String[] args) {
        int h = 200;
        int n = 50;
        int m = 1;
        int whatFloor = 0;
        int numberOfLifts = 0;

        while (whatFloor <= h) {
            numberOfLifts += 1;
            whatFloor = whatFloor + n - m;
        }
        System.out.println(numberOfLifts);
    }
}
