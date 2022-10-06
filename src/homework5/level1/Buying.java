package homework5.level1;

public class Buying {

    boolean CanBuy (boolean phrase1, boolean phrase2) {
        return phrase1 || phrase2;
    }

    public static void main(String[] args) {
        Buying buying = new Buying();
        boolean isEdekaOpen = true;
        boolean isReweOpen = true;
        System.out.println("Я могу купить еду, это " + buying.CanBuy(isEdekaOpen, isReweOpen));

    }

}



