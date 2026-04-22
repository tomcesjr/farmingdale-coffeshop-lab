package edu.farmingdale;

public class ConcreteDrinkFactory implements DrinkFactory {
    @Override
    public Drink createDrink (String type, String temperature) {
        switch (type) {
            case "Coffee":return new Coffee(temperature);
            case "Latte":return new Latte(temperature);
            case "Cappuccino":return new Cappuccino(temperature);
            case "Tea":return new Tea(temperature);
            default:return null;
        }
    }
}
