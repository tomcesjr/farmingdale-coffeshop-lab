package edu.farmingdale;

public class Cappuccino extends Drink {
    public Cappuccino(String size){
        super("Cappuccino", size);
    }
    @Override
    public boolean allowsMilk() {
        return true;
    }
    @Override
    public boolean allowsShots() {
        return true;
    }
    @Override
    public boolean allowsTemp() {
        return false;
    }

}
