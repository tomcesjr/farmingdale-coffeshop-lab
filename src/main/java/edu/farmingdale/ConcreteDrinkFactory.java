package edu.farmingdale;

public class ConcreteDrinkFactory implements DrinkFactory {
    @Override
    public Drink createDrink (String type,String size) {
        switch (type) {
            case "Coffee":return new Coffee(size);
            case "Latte":return new Latte(size);
            case "Cappuccino":return new Cappuccino(size);
            case "Tea":return new Tea(size);
            default:return null;
        }
    }
}
