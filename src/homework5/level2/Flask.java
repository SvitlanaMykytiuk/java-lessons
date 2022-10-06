package homework5.level2;

public class Flask {
    boolean isCorrectTempetarure (double temp1, double temp2){
        return temp1 > 100 && temp2 < 100;
    }

    public static void main(String[] args) {
        double temperature1 = 99;
        double temperature2 = 90;

        Flask flask = new Flask();
        System.out.println(flask.isCorrectTempetarure(temperature1, temperature2));
    }
}
