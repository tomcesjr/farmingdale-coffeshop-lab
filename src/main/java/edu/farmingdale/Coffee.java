package edu.farmingdale;

public class Coffee extends Drink{
    public Coffee(String size){
        super("Coffee", size);
    }
    @Override
    public boolean allowsShots() {
        return false;
    }

    @Override
    public boolean allowsMilk() {
        return true;
    }
    @Override
    public boolean allowsTemp() {
        return true;
    }

}
