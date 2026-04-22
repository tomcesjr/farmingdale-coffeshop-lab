package edu.farmingdale;

public class DrinkBuilder {
    private Drink drink;
    public DrinkBuilder(String type, String temp){
        DrinkFactory factory = new ConcreteDrinkFactory();
        drink = factory.createDrink(type, temp);
    }

    public DrinkBuilder setSize(String size){
        drink.setSize(size);
        return this;
    }
    public DrinkBuilder setMilk(String milk){
        drink.setMilkType(milk);
        return this;
    }

    public DrinkBuilder setShots(int shots){
        drink.setNumShots(shots);
        return this;
    }

    public DrinkBuilder setSweetener(String sweetener){
        drink.setSweetener(sweetener);
        return this;
    }

    public Drink build(){
        return drink;
    }
}
