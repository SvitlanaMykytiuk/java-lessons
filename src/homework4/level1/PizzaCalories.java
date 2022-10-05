package homework4.level1;

public class PizzaCalories {
    double numberOfCalories (double radius){
        return Math.PI * radius * radius * 40;
    }
    public static void main(String[] args) {
    PizzaCalories pizzaCalories = new PizzaCalories();
    System.out.println("Калорийность пиццы радиусом 14 см " + pizzaCalories.numberOfCalories(14));
    System.out.println("Калорийность пиццы радиусом 12 см " + pizzaCalories.numberOfCalories(12));
    System.out.println("Большая пицца на " + (pizzaCalories.numberOfCalories(14) - pizzaCalories.numberOfCalories(12) ) + " калорий сытнее");
    }
}
