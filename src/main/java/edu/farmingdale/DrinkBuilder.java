package edu.farmingdale;

public class DrinkBuilder {
    private Drink drink;
    public DrinkBuilder(String type,String size){
        DrinkFactory factory = new ConcreteDrinkFactory();
        drink = factory.createDrink(type,size);
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
    public DrinkBuilder setTemp(String temp){
        drink.setTemp(temp);
        return this;
    }

    public Drink build(){
        return drink;
    }
}
