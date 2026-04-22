package edu.farmingdale;

public class Latte extends Drink{
    public Latte(String size){
        super("Latte", size);
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
        return true;
    }

}
