package homework5.level1;

public class Walk {
    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isRain = false;
        boolean canwalk = isWeekend & !isRain;
        System.out.println(canwalk);
    }

}
