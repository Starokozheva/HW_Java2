package Exercise4;

public class Pizza {

    public static void main(String[] args) {

        int smallPizzaDiameter = 24;
        int largePizzaDiameter = 28;
        int caloriesPerSquareCm = 40;

        double smallPizzaRadius = smallPizzaDiameter / 2.0;
        double largePizzaRadius = largePizzaDiameter / 2.0;

        double smallPizzaArea = Math.PI * smallPizzaRadius * smallPizzaRadius;
        double largePizzaArea = Math.PI * largePizzaRadius * largePizzaRadius;

        double additionalCalories = (largePizzaArea - smallPizzaArea) * caloriesPerSquareCm;

        System.out.println("Если вы купите пиццу диаметром 28см вместо пиццы диаметром 24см, то вы получите дополнительно " + additionalCalories + " калорий.");
    }
}
