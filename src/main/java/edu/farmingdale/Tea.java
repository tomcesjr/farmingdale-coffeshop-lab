package edu.farmingdale;

public class Tea extends Drink {
    public Tea(String size){
        super("Tea", size);
    }
    @Override
    public boolean allowsMilk() {
        return true;
    }
    @Override
    public boolean allowsShots() {
        return false;
    }
    @Override
    public boolean allowsTemp() {
        return true;
    }
}
